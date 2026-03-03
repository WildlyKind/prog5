package commands;

import my_classes.InputHandler;
import java.io.BufferedReader;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ExecuteScriptCommand implements Command{
    @Override
    public void execute() {
        try {
            String file_name = InputHandler.sc.next();

            BufferedReader reader = new BufferedReader(
                    new FileReader("src\\scripts\\" + file_name, StandardCharsets.UTF_8));
            Scanner sc = new Scanner(reader);
            InputHandler.sc = sc;
            while (sc.hasNext()) {
                String[] inp = sc.nextLine().strip().split(" ");
                String commandName = inp[0];
                try {
                    Invoker.setCommand(commandName);
                } catch (NullPointerException e) {
                    System.out.println("Команда не найдена, введите help");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка IOException :(");
        } catch (Exception e) {
            System.out.println("Ошибка");
        } finally {
            InputHandler.sc = new Scanner(System.in);
        }
    }

    @Override
    public String desc() {
        return "считать и исполнить скрипт из указанного файла";
    }
}
