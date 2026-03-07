package my_classes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.util.LinkedList;

/**
 * Класс, который работает с файлами
 */

public class FileHandler {
    public static String file_name = "save";

    /**
     * Возвращает имя файла
     * @param name имя файла
     */
    public static void getFileName(String name) {
        file_name = name;
    }

    /**
     * Сохраняет текущую коллекцию в файл
     */
    public static void save() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            String json = mapper.writeValueAsString(CollectionHandler.spaceMarines);

            File f = new File(file_name);
            if (f.exists()) { f.delete(); } //проверяется, существует ли уже такой файл
            f.createNewFile(); //создается новый пустой файл

            PrintWriter pw = new PrintWriter(f);
            pw.print(json);
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл '" + file_name + "' не найден");
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

     /**
      * Загружает текущую коллекцию из файла сохранения
      */
    public static void load(String s) {
        SpaceMarine.isLoading = true;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File(s);
            LinkedList<SpaceMarine> employeeList = objectMapper.readValue(file, new TypeReference<LinkedList<SpaceMarine>>() {});
            //помогает сохранить информацию о дженериках, из-за стирания типов мы не можем просто написать LinkedList<SpaceMarine>.class

            CollectionHandler.spaceMarines = employeeList;
            SpaceMarine.setId(CollectionHandler.maxId()+1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл '" + file_name + "' не найден");
        } catch (IOException e) {
            System.out.println("Ошибка");
        } finally {
            SpaceMarine.isLoading = false;
        }
    }
}
