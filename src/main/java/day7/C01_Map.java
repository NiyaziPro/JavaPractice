package day7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_Map {
    public static void main(String[] args) {
         /*
    Soru : Verilen bir array'de kullanilan sayilari ve kacar defa kullanildigini yazdirin.
    Input :{ 11,1,2,3,4,5,3,4,2,5,1,3,2,4,1}
    output : 1 kullanimi : 3 adet
             2 kullanimi : 3 adet
             3 kullanimi : 3 adet
             4 kullanimi : 3 adet
             5 kullanimi : 2 adet

     */

        int [] arr = { 11,1,2,3,4,5,3,4,2,5,1,3,2,4,1};

        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int num : arr){
            if (myMap.containsKey(num)){
                myMap.put(num, myMap.get(num) + 1);
            }else {
                myMap.put(num, 1);
            }
        }
        System.out.println("myMap = " + myMap);

        // Set<Map.Entry<Integer,Integer>> entries = myMap.entrySet();
        //                                                \/
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " kullanimi : " + entry.getValue() + " adet");
        }



    }
}
