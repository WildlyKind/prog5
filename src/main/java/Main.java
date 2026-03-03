import commands.Invoker;
import my_classes.FileHandler;
import my_classes.InputHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print(">> ");
        Scanner sc = InputHandler.sc;
        String file_name = "save";
        if (args.length > 0) {
            file_name = args[0];
        }
        FileHandler.load("C:\\Users\\Nata\\Desktop\\proga5.1\\" + file_name);
        FileHandler.get_file_name(file_name);
        while (InputHandler.sc.hasNext()) {
            String line = InputHandler.sc.next();
            String[] tokens = line.split(" ");

            try {
                Invoker.setCommand(tokens[0]);
            } catch (NullPointerException e) {
                System.out.println("не найдена введенная команда, введите 'help'");
            } finally {
                System.out.print(">> ");
            }
        }
    }
}