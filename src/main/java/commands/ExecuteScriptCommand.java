package commands;

import my_classes.InputHandler;
import java.io.BufferedReader;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ExecuteScriptCommand implements Command{
    static private int recursionDepth = 0;
    HashSet<String> opened_files = new HashSet<>();

    @Override
    public void execute(String[] args) {

        String file_name = args[0];
        if (opened_files.contains(file_name)) {
            System.out.println("Рекурсия :(");
            return;
        }
        opened_files.add(file_name);
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("src/scripts/" + file_name, StandardCharsets.UTF_8));
            Scanner sc = new Scanner(reader);
            InputHandler.sc = sc;
            while (sc.hasNext()) {
                String[] inp = sc.nextLine().strip().split(" ");
                String commandName = inp[0];
                try {
                    Invoker.setCommand(commandName, Arrays.copyOfRange(inp, 1, inp.length));
                } catch (NullPointerException e) {
                    System.out.println("Команда не найдена, введите help");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка IOException :(");
        } catch (Exception e) {
            System.out.println("Ошибка");
        } finally {
            InputHandler.sc = new Scanner(System.in);
            opened_files.remove(file_name);
        }
    }

    @Override
    public String desc() {
        return "считать и исполнить скрипт из указанного файла";
    }

    @Override
    public String name() {
        return "execute_script";
    }
}
