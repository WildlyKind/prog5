package my_classes;

import java.util.Date;

/**
* SpaceMarine - основной класс коллекции
*/
public class SpaceMarine implements Comparable<SpaceMarine>{
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.util.Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Double health; //Поле может быть null, Значение поля должно быть больше 0
    private Double height; //Поле может быть null
    private AstartesCategory category; //Поле не может быть null
    private Weapon weaponType; //Поле не может быть null
    private Chapter chapter; //Поле может быть null
    static Long count = CollectionHandler.max_id();
    public static boolean isLoading = false;

    public SpaceMarine() {
        if (isLoading) {return;}
        this.id = count++;
        this.creationDate = new java.util.Date();
        this.name = InputHandler.stringInput("name");
        this.coordinates = new Coordinates();

        do {
            this.health = InputHandler.doubleInput("health");
        } while (this.health < 0);

        this.height = InputHandler.doubleInput("height");

        this.category = InputHandler.astartesCategoryInput();

        this.weaponType = InputHandler.weaponInput();

        this.chapter = new Chapter();
    }

    /**
     * @return SpaceMarine id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return SpaceMarine name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return SpaceMarine coordinates
     */
    public Coordinates getCoordinates() { return this.coordinates; }

    /**
     * @return SpaceMarine creationDate
     */
    public Date getCreationDate() { return this.creationDate; }

    /**
     * @return SpaceMarine health
     */
    public Double getHealth() { return this.health; }

    /**
     * @return SpaceMarine height
     */
    public Double getHeight() { return this.height; }

    /**
     * @return SpaceMarine category
     */
    public AstartesCategory getCategory() { return this.category; }

    /**
     * @return SpaceMarine weaponType
     */
    public Weapon getWeaponType() {
        return this.weaponType;
    }

    /**
     * @return SpaceMarine chapter
     */
    public Chapter getChapter() { return this.chapter; }

    public static void setId(Long c) {
        count = c;
    }

    @Override
    public String toString() {
        return String.format("%s: %s, %s, %s", id, name, health, height);
    }

    /**
     * Предлагает пользователю обновить одно из полей объекта SpaceMarine
     */
    public void update() {
        System.out.println(
                "Which field to update?\n" +
                        "1. name\n" +
                        "2. Coordinates\n" +
                        "3. height\n" +
                        "4. health\n" +
                        "5. AstartesCategory\n" +
                        "6. Weapon\n" +
                        "7. Chapter");
        int n = InputHandler.intInput();
        switch (n) {
            case 1 -> this.name = InputHandler.stringInput("name");
            case 2 -> this.coordinates = new Coordinates();
            case 3 -> this.height = InputHandler.doubleInput("height");
            case 4 -> this.health = InputHandler.doubleInput("health");
            case 5 -> this.category = InputHandler.astartesCategoryInput();
            case 6 -> this.weaponType = InputHandler.weaponInput();
            case 7 -> this.chapter = new Chapter();
        }
        System.out.println("Изменен!");
    }

    @Override
    public int compareTo(SpaceMarine o) {
        return Double.compare(this.health, o.health);
    }
}