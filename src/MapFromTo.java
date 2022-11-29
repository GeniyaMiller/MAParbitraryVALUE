import java.util.*;

public class MapFromTo {

    public static void main(String[] args) {

        Map<String, List<Integer>> mapFrom = new HashMap<>();
        Map<String, Integer> mapTo = new HashMap<>();
        Random random = new Random();

        List<Integer> listOne = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listOne.add(random.nextInt(1000));
        }

        List<Integer> listTwo = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listTwo.add(random.nextInt(1000));
        }

        List<Integer> listThree = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listThree.add(random.nextInt(1000));
        }

        List<Integer> listFour = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listFour.add(random.nextInt(1000));
        }

        List<Integer> listFive = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listFive.add(random.nextInt(1000));
        }

        mapFrom.put("List1", listOne);
        mapFrom.put("List2", listTwo);
        mapFrom.put("List3", listThree);
        mapFrom.put("List4", listFour);
        mapFrom.put("List5", listFive);

        System.out.println(mapFrom);

        for (var keySet : mapFrom.keySet()) {
            Integer sum = 0;
            List<Integer> values = mapFrom.get(keySet);
            for(Integer integerSum : values){
                sum += integerSum;
            }
            mapTo.put(keySet, sum);
        }
        System.out.println(mapTo);




            

    }
}
