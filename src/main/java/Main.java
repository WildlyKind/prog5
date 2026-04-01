import commands.Invoker;
import my_classes.FileHandler;
import my_classes.InputHandler;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print(">> ");
        Scanner sc = InputHandler.sc;
        String file_name = "save";
        if (args.length > 0) {
            file_name = args[0];
        }
        FileHandler.load(file_name);
        FileHandler.getFileName(file_name);
            while (InputHandler.sc.hasNext()) {
                String line = InputHandler.sc.nextLine();
                String[] tokens = line.split(" ");
                try {
                    Invoker.setCommand(tokens[0], Arrays.copyOfRange(tokens, 1, tokens.length));
                } catch (NullPointerException e) {
                    System.out.println("не найдена введенная команда, введите 'help'");
                } catch (java.util.NoSuchElementException e) {
                    System.out.println("Работа завершена, вы закрыли поток");
                    break;
                } finally {
                    System.out.print(">> ");
                }
            }
    }
}