package my_classes;

/**
 * Класс Coordinates
 */
public class Coordinates {
    private Long x = -1000L; //Значение поля должно быть больше -879, Поле не может быть null
    private Double y;//Поле не может быть null

    Coordinates() {
        if (SpaceMarine.isLoading) {return;}
        do {
            this.x = InputHandler.longInput("x");
            if (this.x <= -879) {
                System.out.println("Вы ввели слишком маленькое число, x > -879");
            }
        } while (this.x <= -879); {}

        this.y = InputHandler.doubleInput("y");
    }

    /**
     * @return Coordinates y
     */
    public Double getY() {
        return y;
    }

    /**
     * @return Coordinates x
     */
    public Long getX() {
        return x;
    }
}
