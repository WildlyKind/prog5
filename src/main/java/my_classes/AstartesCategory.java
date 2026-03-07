package my_classes;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
* Enum AstartesCategory
*/
public enum AstartesCategory {
    INCEPTOR,
    TACTICAL,
    HELIX;

    /**
     * @return Возвращает строку со всеми значениями перечисления, разделёнными запятой.
     */
    public static String all_values() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values().length; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(values()[i].name());
        }
        return result.toString();
    }


}
