package commands;

public class ExitCommand implements Command{
    @Override
    public String desc() {
        return "останавливает выполнение программы (без сохранения в файл)";
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
