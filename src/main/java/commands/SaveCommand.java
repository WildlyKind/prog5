package commands;

import my_classes.FileHandler;

public class SaveCommand implements Command{
    @Override
    public void execute() {
        FileHandler.save();
    }

    @Override
    public String desc() {
        return "сохранить коллекцию в файл";
    }
}
