import java.util.*;
public class key_value {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    @SuppressWarnings("unused")
    List < Integer > arr = new ArrayList<>(); 
    Map < String , Integer > marks = new HashMap<>(); 
    marks.put("Rahul", 90);
    marks.put("Simmy", 80);

    for(Map.Entry<String,Integer>entry : marks.entrySet()){
        System.out.println(entry.getKey() + " : " + entry.getValue()); //tells about the key value pair

    }

    //list,map,set are interfaces,immutable list (used for permanent values , non changeable , i.e kept pvt.)
    //ArrayList,HashMap,HashSet are classes

    scanner.close();
    
    }
}
