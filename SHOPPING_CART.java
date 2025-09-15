import java.util.Scanner;

public class SHOPPING_CART {
    public static void main(String[] args){
        Scanner object=new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency='$';
        double total;

        System.out.print("Enter the item ,that you want to buy:");
        item=object.nextLine();
        System.out.print("Enter the price for each?:");
        price= object.nextDouble();
        System.out.print("How many would you like?:");
        quantity= object.nextInt();

        total=price*quantity;
        System.out.println("\n you have bought"+quantity+" "+item+"/s");
        System.out.println("your total bill is: "+ currency +total);

        object.close();
    }
}
