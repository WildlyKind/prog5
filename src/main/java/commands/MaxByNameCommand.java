package commands;

import my_classes.CollectionHandler;

public class MaxByNameCommand implements Command{
    @Override
    public void execute(String[] args) {
        System.out.println(CollectionHandler.maxByName());
    }

    @Override
    public String desc() {
        return "вывести любой объект из коллекции, значение поля name которого является максимальным";
    }
}
