package commands;

/**
 * Интерфейс для команд
 */
public interface Command {
    /**
     * Выполнение команды
     * @param args аргументы команды
     */
    public void execute(String[] args);
    /**
     * Получение описания команды
     * @return описание
     */
    public String desc();
}
