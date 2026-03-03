package my_classes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Класс, обрабатывающий все входные данные
 */
public class InputHandler {
    public static Scanner sc = new Scanner(System.in);

    /**
     * Предлагает пользователю ввести строку
     * @param name переменной
     * @return строка, введенная пользователем
     */
    public static String stringInput(String name) {
        System.out.println("Введите " + name + ":");
        return sc.next();
    }

    /**
     * Предлагает пользователю ввести строку
     * @return строка, введенная пользователем
     */
    public static String stringInput() {
        return sc.next();
    }

    /**
     * Предлагает пользователю ввести число типа double
     * @param name переменной
     * @return число типа double, введенное пользователем
     */
    public static Double doubleInput(String name) {
        Double value;
        while (true) {
            try {
                System.out.println("Введите " + name + ":");
                value = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число");
            } catch (Exception e) {
                System.out.println("Упс, ошибка :(");
            }
        }
        return value;
    }

    /**
     * Предлагает пользователю ввести поле для enum AstartesCategory
     * @return поле, введенное пользователем
     */
    public static AstartesCategory astartesCategoryInput() {
        System.out.printf("%s - %s\n", "Выберете AstartesCategory, возможные варианты", AstartesCategory.all_values());
        AstartesCategory value = null;
        while (true) {
            try {
                value = AstartesCategory.valueOf(sc.next());
            } catch (IllegalArgumentException e) {
                System.out.printf("%s - %s\n", "Вы ввели другое значение, используйте эти варианты", AstartesCategory.all_values());
            } catch (Exception e) {
                System.out.println("Упс, ошибка :(");
            }
            if (value != null) {break;}
        }
        return value;
    }

    /**
     * Предлагает пользователю ввести поле для enum Weapon
     * @return поле, введенное пользователем
     */
    public static Weapon weaponInput() {
        System.out.printf("%s - %s\n", "Выберете Weapon, возможные варианты", Weapon.all_values());
        Weapon value = null;
        while (true) {
            try {
                value = Weapon.valueOf(sc.next());
            } catch (IllegalArgumentException e) {
                System.out.printf("%s - %s\n", "Вы ввели другое значение, используйте эти варианты", Weapon.all_values());
            } catch (Exception e) {
                System.out.println("Упс, ошибка :(");
            }
            if (value != null) {break;}
        }
        return value;
    }

    /**
     * Предлагает пользователю ввести число типа long
     * @param name переменной
     * @return число типа long, введенное пользователем
     */
    public static Long longInput(String name) {
        Long value;
        while (true) {
            try {
                System.out.println("Введите " + name + ":");
                value = sc.nextLong();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число");
            } catch (Exception e) {
                System.out.println("Упс, ошибка :(");
            }
        }
        return value;
    }

    /**
     * Предлагает пользователю ввести ID
     * @return ID, которое ввел пользователь
     */
    public static Long Id() {
        long id;
        while (true) {
            try {
                id = sc.nextLong();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число");
            } catch (Exception e) {
                System.out.println("Упс, ошибка :(");
            }
        }
        return id;
    }

    /**
     * Предлагает пользователю ввести число типа int
     * @return число типа int, введенное пользователем
     */
    public static int intInput() {
        int value;
        while (true) {
            try {
                value = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число");
            } catch (Exception e) {
                System.out.println("Упс, ошибка :(");
            }
        }
        return value;
    }
}
