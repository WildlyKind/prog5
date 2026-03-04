package commands;

/**
 * Интерфейс для команд
 */
public interface Command {
    /**
     * Выполнение команды
     *
     */
    public void execute(String[] args);
    //public default void execute(String... args) {};

    /**
     * Получение описания команды
     * @return описание
     */
    public String desc();
}
