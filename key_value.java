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

    // System.out.println(marks.get("Rohit")); 
    //null value of above sout as the key is not present

    Optional<Integer> marksofRohit = Optional.ofNullable(marks.get("Rohit"));
    if (marksofRohit.isPresent()) {
        System.out.println("Rohit's marks: " + marksofRohit.get());
    } else {
        System.out.println("I am not present");
    }

// Optional<T> is a container object introduced in Java 8 (in java.util package) that may or may not contain a non-null value. 
// It helps to avoid NullPointerException by forcing developers to handle the case when a value is missing.
    


    scanner.close();
    
    }
}
