package commands;

import my_classes.CollectionHandler;
import my_classes.SpaceMarine;

public class ShowCommand implements Command{
    @Override
    public void execute(String[] args) {
        for (SpaceMarine s: CollectionHandler.spaceMarines) {
            System.out.println(s.toString());
        }
    }

    @Override
    public String desc() {
        return "вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }

    @Override
    public String name() {
        return "show";
    }
}
