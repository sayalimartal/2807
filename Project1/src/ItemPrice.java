//Calculate discount on item price
import java.util.Scanner;

public class ItemPrice {
	public static void main(String args[]) {
		int newItem;
		float discount,newItemPrice;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the price of the item");
		newItem=scanner.nextInt();
		
		discount=(float)newItem*35/100;  //Calculate and display discount as 35% of item price
		System.out.println("The discount value is "+discount);
		
		newItemPrice=newItem-discount;   //Calculate and display discounted price of the item
		System.out.println("The discounted price of the item is "+newItemPrice);
	}
}
