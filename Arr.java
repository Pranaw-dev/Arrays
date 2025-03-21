import java.util.*;

public class Arr{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add("Hello");
        arr.add(3.14);
        arr.add(true);
        
        for (Object obj: arr){
            System.out.println(obj);
        }

        System.out.println();
        
        char[] arr1 = {'a', 'b', 'c'};
        
        for (int i=0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println();
        
        // by using arr instd of arr1
        for (int i=0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        scanner.close();
    }
}