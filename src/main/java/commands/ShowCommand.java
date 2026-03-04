package commands;

import my_classes.CollectionHandler;
import my_classes.SpaceMarine;

public class ShowCommand implements Command{
    @Override
    public void execute(String[] args) {
        for (SpaceMarine s: CollectionHandler.spaceMarines) {
            System.out.println("ID - " + s.getId());
            System.out.println("name - " + s.getName());
            System.out.println("health - " + s.getHealth());
            System.out.println("height - " + s.getHeight());
            System.out.println("weaponType - " + s.getWeaponType());
            System.out.println("category - " + s.getCategory());
        }
    }

    @Override
    public String desc() {
        return "вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}
