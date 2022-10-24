package helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс помощник, здесь все, что связано с модификацией строк
 */
public class StringModifire {
    /**
     * Метод который уникализирует строку, возвращает строку + уникальное название
     */
    public static String getUniquesString(String str){
        return str + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());//Указываем паттерн по какому шаблону отображается время,
        // format() - преобразует все в строку и создаем экземпляр новой даты.
    }
}
