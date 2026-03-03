package my_classes;

/**
 * Класс Chapter
 */
public class Chapter {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private String parentLegion;

    Chapter() {
        if (SpaceMarine.isLoading) {return;}
        do {
            this.name = InputHandler.stringInput("name");
            if (this.name.isBlank() | this.name.isEmpty()) {
                System.out.println("Поле не может быть пустым");
            }
        } while (this.name.isBlank() | this.name.isEmpty());

        this.parentLegion = InputHandler.stringInput("parentLegion");
    }

    /**
     * @return Chapter name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Chapter parentLegion
     */
    public String getParentLegion() {
        return parentLegion;
    }
}
