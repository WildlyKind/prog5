package my_classes;

import java.util.*;

/**
 * Класс, ответственный за все изменения в коллекции
 */
public class CollectionHandler {
    static java.time.LocalDateTime initTime = java.time.LocalDateTime.now();
    public static LinkedList<SpaceMarine> spaceMarines = new LinkedList<>();

    /**
     * Удаляет все элементы из коллекции
     */
    public static void clear() {
        spaceMarines.clear();
    }

    /**
     * Удаляет элемент по его id
     * @param id id элемента
     */
    public static void remove(Long id) {
        while (true) {
            try {
                System.out.println(id);
                for (SpaceMarine sm: CollectionHandler.spaceMarines) {
                    if (sm.getId() == id) {
                        CollectionHandler.spaceMarines.remove(sm);
                        System.out.println("Удален!");
                        return;
                    }
                }
                System.out.println("Ни одной SpaceMarine не найдено :(");
                return;
            } catch (NumberFormatException e) {
                System.out.println("Плохой аргумент!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка с индексом");
            }
        }
    }

    /**
     * Находит максимальное name среди всех элементов коллекции
     * @return максимальное name
     */
    public static String maxByName() {
        String[] names = new String[spaceMarines.size()];
        int index = 0;
        for (SpaceMarine sm: CollectionHandler.spaceMarines) {
            names[index++] = sm.getName();
        }
        String longestName = null;
        for (String name : names) {
            if (longestName == null || name.length() > longestName.length()) {
                longestName = name;
            }
        }
        return longestName;
    }

    /**
     * Находит уникальные weaponType среди всех элементов коллекции
     * @return множество всех уникальных weaponType
     */
    public static HashSet<Weapon> printUniqueWeaponType() {
        HashSet<Weapon> weapons = new HashSet<>();
        for (SpaceMarine sm: CollectionHandler.spaceMarines) {
            weapons.add(sm.getWeaponType());
        }
        return weapons;
    }

    /**
     * Информация о коллекции
     */
    public static void info() {
        System.out.printf(" Collection type: %s\n" +
                " Current size: %s\n" +
                " Initialization time: %s\n", spaceMarines.getClass(), spaceMarines.size(), initTime);
    }

    /**
     * Обновляет элемент по его id
     * @param id id элемента
     */
    public static void updateId(Long id) {
        SpaceMarine s = findById(id);
        if (s == null) {return;}
        s.update();
    }

    /**
     * Находит элемент по его id
     * @param id id элемента
     * @return элемент, если такой элемент не существует, то null
     */
    private static SpaceMarine findById(Long id) {
        for (SpaceMarine s: spaceMarines) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    /**
     * Выводит элементы, значение поля name которых начинается с заданной подстроки
     */
    public static void filterStartsWithName(String inputName) {
        boolean flag = false;
        for (SpaceMarine s: spaceMarines) {
            if (s.getName().startsWith(inputName)) {
                System.out.println(s.getId() + " " + s.getName());
                flag = true;
            }
        }
        if (!flag) {System.out.println("Таких элементов нет");}
    }

    /**
     * Добавляет новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции
     * @param newSpaceMarine Объект SpaceMarine для попытки добавления
     */
    public static void addIfMax(SpaceMarine newSpaceMarine) {
        for (SpaceMarine s: spaceMarines) {
            if (newSpaceMarine.compareTo(s) < 0) {
                System.out.println("Элемент не добавлен, его значение не превышает максимальное");
                return;
            }
        }
        spaceMarines.add(newSpaceMarine);
        System.out.println("Элемент добавлен");
    }

    /**
     * Удаляет из коллекции все элементы, меньшие, чем заданный
     * @param newSpaceMarine Объект SpaceMarine для попытки добавления
     */
    public static void removeLower(SpaceMarine newSpaceMarine) {
        HashSet<SpaceMarine> toSpaceMarine = new HashSet<>();
        for (SpaceMarine s: spaceMarines) {
            if (newSpaceMarine.compareTo(s) > 0) {
                toSpaceMarine.add(s);

            }
        }
        for (SpaceMarine s: toSpaceMarine) {
            spaceMarines.remove(s);
            System.out.printf("SpaceMarine '%s' удален\n", s);
        }
        toSpaceMarine.clear();
    }

    /**
     * Находит максимальный id среди всех элементов коллекции
     * @return максимальный id
     */
    public static Long maxId() {
        Long ma = 0L;
        for (SpaceMarine s: spaceMarines) {
            if (s.getId() > ma) {ma = s.getId();}
        }
        return ma;
    }
}
