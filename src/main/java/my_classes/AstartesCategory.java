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
        return Arrays.stream(values())
                .map(Enum::name)
                .collect(Collectors.joining(", "));
    }


}
