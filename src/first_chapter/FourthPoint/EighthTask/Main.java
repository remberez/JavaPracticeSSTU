package first_chapter.FourthPoint.EighthTask;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        City city1 = new City("Москва", new HashMap<String, Integer>(){
            {
                put("Санкт-Петербуг", 4);
                put("Саратов", 77);
                put("Рязань", 43);
            }
        });
        System.out.println(city1);
    }
}
