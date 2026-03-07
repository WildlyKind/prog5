package commands;

import my_classes.CollectionHandler;

public class PrintUniqueWeaponTypeCommand implements Command{
    @Override
    public void execute(String[] args) {
        System.out.println(CollectionHandler.printUniqueWeaponType());
    }

    @Override
    public String desc() {
        return "вывести уникальные значения поля weaponType всех элементов в коллекции";
    }
}
