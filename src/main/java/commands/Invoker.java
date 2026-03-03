package commands;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Класс, отвечающий за выполнение команд
 */
public class Invoker {
    static Command command;
    public static HashMap<String, Command> commands = new HashMap<>();
    static ArrayList<String> history = new ArrayList<>();

    static {
        commands.put("help", new HelpCommand());
        commands.put("exit", new ExitCommand());
        commands.put("show", new ShowCommand());
        commands.put("add", new AddCommand());
        commands.put("clear", new ClearCommand());
        commands.put("remove_by_id", new RemoveCommand());
        commands.put("max_by_name", new MaxByNameCommand());
        commands.put("print_unique_weapon_type", new PrintUniqueWeaponTypeCommand());
        commands.put("history", new HistoryCommand());
        commands.put("info", new InfoCommand());
        commands.put("update_id", new UpdateIdCommand());
        commands.put("filter_starts_with_name", new FilterStartsWithNameCommand());
        commands.put("add_if_max", new AddIfMaxCommand());
        commands.put("remove_lower", new RemoveLowerCommand());
        commands.put("execute_script", new ExecuteScriptCommand());
        commands.put("save", new SaveCommand());
    }

    /**
     * Выполняет указанную команду
     * @param name команды
     */
    public static void setCommand(String name) {
        commands.get(name).execute();
        addToHistory(name);
    }

    /**
     * Добавляет команду в историю
     * @param name команды, которую он добавляет
     */
    public static void addToHistory(String name) {
        history.add(name);
        if (history.size() > 15) {
            history.remove(0);
        }
    }

    /**
     * Получает историю команд
     * @return список 14 последних команд
     */
    public static ArrayList<String> getHistory() {
        return history;
    }
}
