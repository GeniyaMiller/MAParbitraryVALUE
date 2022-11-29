import hw1task3.IntegerValue;
import hw1task3.MapInteger;

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





    }
}