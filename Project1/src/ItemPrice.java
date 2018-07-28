import java.util.Scanner;
public class ItemPrice {
public static void main(String args[])
{
	int newItem;
	float discount,newItemPrice;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the price of the item");
	newItem=sc.nextInt();
	discount=(float)newItem*35/100;
	System.out.println("The discount value is "+discount);
	newItemPrice=newItem-discount;
	System.out.println("The discounted price of the item is "+newItemPrice);
}
}
