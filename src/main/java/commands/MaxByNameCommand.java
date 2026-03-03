package commands;

import my_classes.CollectionHandler;

public class MaxByNameCommand implements Command{
    @Override
    public void execute() {
        System.out.println(CollectionHandler.max_by_name());
    }

    @Override
    public String desc() {
        return "вывести любой объект из коллекции, значение поля name которого является максимальным";
    }
}
