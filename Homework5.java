import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Homework5 {
    public static void main(String[] args) {

        HashMap<String,String>myHashMap = new HashMap<String,String>();
        myHashMap.put("Толстой А.Н.", "Репка");
        myHashMap.put("Фредрик Бакман", "Вторая жизнь Уве");
        myHashMap.put("Толстой Л.Н.", "Война и мир");
        myHashMap.put("Достоевский Ф.М.", "Преступление и наказание");
        myHashMap.put("Рид Т.М.", "Всадник без головы");
        myHashMap.put("Носов Н.Н.", "Незнайка на Луне");
        myHashMap.put("Вишневский Я.Л.", "На ростанях");
        myHashMap.put("Гаршин В.М.", "Лягушка-путешественница");
        myHashMap.put("Блок А.А.", "Покой нам только снится");
        myHashMap.put("Смит У.К.", "WILL");
        
        System.out.println(ANSI_GREEN + "Исходный словарь: " + ANSI_RESET);
        myHashMap.forEach((k, v) -> System.out.println(k+ " - " +v));
        System.out.println();


        System.out.println(ANSI_GREEN + "Добавили к значениям словаря символ <!>: " + ANSI_RESET);
        for (Map.Entry entry: myHashMap.entrySet()) { 
            System.out.println(entry.getKey()+ " - " + entry.getValue() + "!");    
        }
        System.out.println();

        System.out.println(ANSI_GREEN +"Добавим нового автора и название книги <Дюймовочка>: " + ANSI_RESET);
        if (myHashMap.containsKey("Андерсен Г.Х.") != true) {
            myHashMap.put("Андерсен Г.Х.", "Дюймовочка");
            myHashMap.forEach((k, v) -> System.out.println(k+" - "+v));
        }
        System.out.println();

        System.out.println(ANSI_GREEN + "Если ключ, указанный в запросе - <Носов Н.Н.> имеется, вырезать из соответствующего ключу значения первое слово <Незнайка>: " + ANSI_RESET);
        if (myHashMap.containsKey("Носов Н.Н.") == true) {
                myHashMap.replace("Носов Н.Н.", "на Луне");
                myHashMap.put("Носов Н.Н.","на Луне");
                myHashMap.forEach((k, v) -> System.out.println(k+" - "+v));
        }
        System.out.println();

        System.out.println(ANSI_GREEN + "Пройти по словарю другим, не таким как в пункте 3, методом и вывести пары ключ значение в консоль. " + ANSI_RESET);
        myHashMap.forEach((k, v) -> System.out.println(k+" = "+v));
        System.out.println();
        

        System.out.println(ANSI_GREEN + "Пройти по словарю другим, не таким как в пункте 3 и 6, методом. Добавить к значениям строку <(просмотрен)> и вывести в консоль: " + ANSI_RESET);
        for (String str : myHashMap.keySet()) {
            myHashMap.put(str, myHashMap.get(str) + "  (просмотрен)");
        }
        System.out.println(myHashMap);

    }

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[37m";

}

