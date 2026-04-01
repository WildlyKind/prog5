package commands;

public class HistoryCommand implements Command{
    @Override
    public String desc() {
        return "вывести последние 14 команд (без их аргументов)";
    }

    @Override
    public void execute(String[] args) {
        for (String s : Invoker.getHistory()) {
            System.out.println(s);
        }
    }

    @Override
    public String name() {
        return "history";
    }
}
