package commands;

import my_classes.CollectionHandler;
import my_classes.InputHandler;

public class UpdateIdCommand implements Command{
    @Override
    public void execute() { CollectionHandler.update_id(InputHandler.Id());
    }

    @Override
    public String desc() {
        return "обновить значение элемента коллекции, id которого равен заданному";
    }
}
