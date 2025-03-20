// import java.util.*;

// public class Hello {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the symbol: ");
//         String symbol = scanner.nextLine();
//         System.out.print("Enter the number of symbols: ");
//         int number = scanner.nextInt();
//         for (int i = 0; i < number; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(symbol);
//             }
//             System.out.println();
//         }
//         scanner.close();
//     }
// }

import java.util.*;
public class Hello{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the symbol: ");
        String symbol = scanner.nextLine();
        System.out.print("enter the number of symbols: ");
        int number = scanner.nextInt();

        for (int n=1; n<=number ;n++){
            // int a = n+1;
            // System.out.println(n);
            if(n%2!=0){
                for(int i=1;i<=n;i++){
                    
                    System.out.print(symbol.length() + " ");
                    // System.out.print(" ");
                    }
                    System.out.println();
                }    
            }
            
            // int new_no = symbol.length();
            // System.out.print("the length of the symbol is: ");
            // System.out.print(symbol.length());
        scanner.close();

    }
}
