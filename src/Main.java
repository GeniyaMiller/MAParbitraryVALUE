import hw1task3.IntegerValue;
import hw1task3.MapInteger;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        IntegerValue str1 = new IntegerValue("srt1", 127);
        IntegerValue str2 = new IntegerValue("srt2", 150);
        IntegerValue str3 = new IntegerValue("srt3", 212);
        IntegerValue str4 = new IntegerValue("srt4", 250);
        IntegerValue str5 = new IntegerValue("srt5", 315);
        IntegerValue str55 = new IntegerValue("srt5", 12);

        MapInteger mapInteger = new MapInteger();
        mapInteger.addForMap(str1);
        mapInteger.addForMap(str2);
        mapInteger.addForMap(str3);
        mapInteger.addForMap(str4);
        mapInteger.addForMap(str5);
        mapInteger.addForMap(str55);


        mapInteger.getInfo();

        Map<Integer,String> mapPairs = new LinkedHashMap<>();
        mapPairs.put(1,"one");
        mapPairs.put(2,"two");
        mapPairs.put(3,"three");
        mapPairs.put(4,"four");
        mapPairs.put(5,"five");
        mapPairs.put(6,"six");
        mapPairs.put(7,"seven");
        mapPairs.put(8,"eight");
        mapPairs.put(9,"nine");
        mapPairs.put(10,"ten");


        System.out.println(mapPairs);





    }
}