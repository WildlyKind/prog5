package commands;

import my_classes.CollectionHandler;

public class FilterStartsWithNameCommand implements Command{
    @Override
    public void execute() {
        CollectionHandler.filter_starts_with_name();
    }

    @Override
    public String desc() {
        return "вывести элементы, значение поля name которых начинается с заданной подстроки";
    }
}
