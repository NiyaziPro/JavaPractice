package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_CommonNames {
    public static void main(String[] args) {

         /*
                Iki array'de ortak olan isimleri bir yerde toplayiniz.
                1. Array: { Jace, John, Mark, Jack, Emma}
                2. Array: { Anna, Brad, Johnny, Mark, Emma }
                Mark, Emma
                */

        String[] names1 = {"Jace", "John", "Mark", "Jack", "Emma"};
        String[] names2 = {"Anna", "Brad", "Johnny", "Mark", "Emma"};

        List<String> commonNames = new ArrayList<>();

        for (String name : names1){
            for (String isim : names2){
                if (name.trim().equalsIgnoreCase(isim.trim())){
                    commonNames.add(name.trim());
                }
            }
        }

        System.out.println(Arrays.toString(names1));
        System.out.println(Arrays.toString(names2));
        System.out.println("Ortak isimler: " + commonNames);


       /* List<String> commonNames = new ArrayList<>();

        List<String> namesSet = new ArrayList<>();

        for (String name : names1) {
            namesSet.add(name);
        }

        for (String name : names2) {
            if (namesSet.contains(name)) {
                commonNames.add(name);
            }
        }
        System.out.println("Ortak isimler: " + commonNames);
*/

    }
}
