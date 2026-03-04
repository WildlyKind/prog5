package commands;

import my_classes.CollectionHandler;
import my_classes.InputHandler;

public class UpdateIdCommand implements Command{
    @Override
    public void execute(String[] args) {
        Long id;
        try {
            id = Long.parseLong(args[0]);
            CollectionHandler.update_id(id);
        } catch (Exception e) {
            System.out.println("Вы ввели неправильный id");
        }

    }

    @Override
    public String desc() {
        return "обновить значение элемента коллекции, id которого равен заданному";
    }
}
