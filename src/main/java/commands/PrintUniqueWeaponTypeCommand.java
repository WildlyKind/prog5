package commands;

import my_classes.CollectionHandler;

public class PrintUniqueWeaponTypeCommand implements Command{
    @Override
    public void execute() {
        System.out.println(CollectionHandler.print_unique_weapon_type());
    }

    @Override
    public String desc() {
        return "вывести уникальные значения поля weaponType всех элементов в коллекции";
    }
}
