package commands;

import my_classes.CollectionHandler;

public class FilterStartsWithNameCommand implements Command{
    @Override
    public void execute(String[] args) {
        try {
            //id = Long.parseLong(args[0]);
            CollectionHandler.filterStartsWithName(args[0]);
        } catch (Exception e) {
            System.out.println("Вы ввели неправильный name");
        }

    }

    @Override
    public String desc() {
        return "вывести элементы, значение поля name которых начинается с заданной подстроки";
    }
}
