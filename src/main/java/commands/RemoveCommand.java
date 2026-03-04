package commands;

import my_classes.CollectionHandler;
import my_classes.InputHandler;

public class RemoveCommand implements Command{
    @Override
    public void execute(String[] args) {
        Long id;
        try {
            id = Long.parseLong(args[0]);
            CollectionHandler.remove(id);
        } catch (Exception e) {
            System.out.println("Вы ввели неправильный id");
        }

    }

    @Override
    public String desc() {
        return "Удалить элемент из коллекции по его id";
    }
}
