package work1;


import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.*;

/**
 * task 1:
 *     Given:
 *          Map<String, LocalDate> map = new LinkedHashMap<>();
 *             map.put("John", LocalDate.of(2018, 9, 5));
 *             map.put("Antony", LocalDate.of(2012, 7, 29));
 *             map.put("Jimmy", LocalDate.of(2014, 4, 1));
 *             map.put("James", LocalDate.of(2016, 11, 2));
 *             map.put("Josh", LocalDate.of(2020, 5, 15));
 *             map.put("Cory", LocalDate.of(2015, 6, 19));
 *             map.put("Anderson", LocalDate.of(2013, 8, 24));
 *             map.put("Steven", LocalDate.of(2017, 10, 2));
 *
 *         1. Display the names of the employee who were hired before 2015
 *         2. display the name of the employee who were hired on 5/15/2020
 *         3. How many people were hired after 2014?
 *         4. display the name and hire date of the employee
 */
public class MapTask {
    public static void main(String[] args) {

        Map<String, LocalDate> map = new HashMap<>();

                map.put("John", LocalDate.of(2018, 9, 5));
               map.put("Antony", LocalDate.of(2012, 7, 29));
                 map.put("Jimmy", LocalDate.of(2014, 4, 1));
                map.put("James", LocalDate.of(2016, 11, 2));
               map.put("Josh", LocalDate.of(2020, 5, 15));
                map.put("Cory", LocalDate.of(2015, 6, 19));
                map.put("Anderson", LocalDate.of(2013, 8, 24));
                map.put("Steven", LocalDate.of(2017, 10, 2));

                System.out.println("map = " + map);
                //  1. Display the names of the employee who were hired before 2015

        beforeYear(2015,map);
        //2. display the name of the employee who were hired on 5/15/2020
       findEmployee(LocalDate.of(2020, 5, 15),map);

       // 3. How many people were hired after 2014?

        afterYear(2014,map);
             //        4. display the name and hire date of the employee
        displayEmployee(map);

    }

    private static void displayEmployee(Map<String, LocalDate> map) {
        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
            System.out.println("entry = " + entry);
        }

        for (String s : map.keySet()) {
            System.out.println(s+" "+map.get(s));
        }
    }

    private static void afterYear(int year, Map<String, LocalDate> map) {
            Map<String,LocalDate> mapOrder=new TreeMap<>();
            mapOrder.putAll(map);
        System.out.println("mapOrder = " + mapOrder);
        for (Map.Entry<String, LocalDate> entry : mapOrder.entrySet()) {
           if (entry.getValue().getYear()>=year){
               System.out.println("entry = " + entry);
           }
        }
    }

    private static void findEmployee(LocalDate localDate, Map<String, LocalDate> map) {

        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
            LocalDate value = entry.getValue();
            if (value.isEqual(localDate)){
                System.out.println(entry);
            }
        }
    }

    private static void beforeYear(int year, Map<String, LocalDate> map) {


        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
            if (entry.getValue().getYear()<year){
                System.out.println(entry);
            }
        }
    }
}
