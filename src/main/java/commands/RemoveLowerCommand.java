package commands;

import my_classes.CollectionHandler;
import my_classes.SpaceMarine;

public class RemoveLowerCommand implements Command{
    @Override
    public void execute() {
        CollectionHandler.remove_lower(new SpaceMarine());
    }

    @Override
    public String desc() {
        return "удалить из коллекции все элементы, меньшие, чем заданный";
    }
}
