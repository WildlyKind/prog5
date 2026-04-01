package commands;

import my_classes.CollectionHandler;
import my_classes.SpaceMarine;

public class RemoveLowerCommand implements Command{
    @Override
    public void execute(String[] args) {
        CollectionHandler.removeLower(new SpaceMarine());
    }

    @Override
    public String desc() {
        return "удалить из коллекции все элементы, меньшие, чем заданный";
    }

    @Override
    public String name() {
        return "remove_lower";
    }
}
