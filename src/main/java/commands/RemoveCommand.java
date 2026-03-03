package commands;

import my_classes.CollectionHandler;
import my_classes.InputHandler;

import java.util.Scanner;

public class RemoveCommand implements Command{
    @Override
    public void execute() {
        Long id;
        try {
            id = Long.parseLong(InputHandler.sc.next());
            CollectionHandler.remove(id);
        } catch (Exception e) {
            System.out.println("uh oh"); //это максимально плохой catch, переделай адекватно
                                        // (он отвечает за проверку, является ли аргумент числом)
            //я добавил в Invoker статический Scanner sc и теперь для ввода аргументо просто читается
            //следующее слово через sc.next()
        }

    }

    @Override
    public String desc() {
        return "Удалить элемент из коллекции по его id";
    }
}
