package hw1task3;

import java.util.HashMap;
import java.util.Map;

public class MapInteger {
    public HashMap<String, Integer> values = new HashMap<>();

    public MapInteger() {
    }

    public void addForMap(IntegerValue integerValue){
        if(!values.containsKey(integerValue.getString()) && !values.containsValue(integerValue.getInteger())){
            values.put(integerValue.getString(),integerValue.getInteger());
        } else if(values.containsKey(integerValue.getString()) && !values.containsValue(integerValue.getInteger())){
            values.put(integerValue.getString(),integerValue.getInteger());
        }else {
            throw new RuntimeException("Такая пара существует!");
        }
    }

    public void getInfo(){
        for (Map.Entry<String, Integer> valuesEntry: values.entrySet()) {
            System.out.println(valuesEntry.getKey() + " --> " + valuesEntry.getValue());
        }
    }

}
