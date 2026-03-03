package commands;

import my_classes.CollectionHandler;

public class ClearCommand implements Command{
    @Override
    public String desc() {
        return "очистить коллекцию";
    }

    @Override
    public void execute() {
        CollectionHandler.clear();
    }
}
