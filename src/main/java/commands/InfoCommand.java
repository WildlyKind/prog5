package commands;

import my_classes.CollectionHandler;

public class InfoCommand implements Command{
    @Override
    public String desc() {
        return "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)";
    }

    @Override
    public void execute(String[] args) {
        CollectionHandler.info();
    }
}
