package commands;

import my_classes.CollectionHandler;
import my_classes.SpaceMarine;

public class AddCommand implements Command{
    @Override
    public void execute() {
        CollectionHandler.spaceMarines.add(new SpaceMarine());
    }

    @Override
    public String desc() {
        return "добавить новый элемент в коллекцию";
    }
}
