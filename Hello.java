public class Hello {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the symbol: ");
    String symbol = scanner.nextLine();
    System.out.println("Enter the number of symbols: ");
    int number = scanner.nextInt();
    for (int i=0; i<number; i++)    {
        for (int j=i; j<number; j++)    {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
