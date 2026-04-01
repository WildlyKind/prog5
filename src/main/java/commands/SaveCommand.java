package commands;

import my_classes.FileHandler;

public class SaveCommand implements Command{
    @Override
    public void execute(String[] args) {
        FileHandler.save();
    }

    @Override
    public String desc() {
        return "сохранить коллекцию в файл";
    }

    @Override
    public String name() {
        return "save";
    }
}
