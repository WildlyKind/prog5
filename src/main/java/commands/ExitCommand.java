package commands;

public class ExitCommand implements Command{
    @Override
    public String desc() {
        return "останавливает выполнение программы (без сохранения в файл)";
    }

    @Override
    public void execute(String[] args) {
        System.exit(0);
    }

    @Override
    public String name() {
        return "exit";
    }
}
