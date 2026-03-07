package commands;

import my_classes.CollectionHandler;
import my_classes.SpaceMarine;

public class AddIfMaxCommand implements Command{
    @Override
    public void execute(String[] args) {
        CollectionHandler.addIfMax(new SpaceMarine());
    }

    @Override
    public String desc() {
        return "добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции";
    }
}
