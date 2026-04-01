package commands;


public class HelpCommand implements Command{
    @Override
    public void execute(String[] args) {
        for (String key: Invoker.commands.keySet()) {
            System.out.printf("%s - %s\n", key, Invoker.commands.get(key).desc());
        }
    }

    @Override
    public String desc() {
        return "вывести справку по доступным командам";
    }

    @Override
    public String name() {
        return "help";
    }
}
