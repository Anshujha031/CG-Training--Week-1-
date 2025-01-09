import java.util.*;

class Price{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        double unitPrice = scanner.nextDouble();
        int quantity = scanner.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " for the quantity " + quantity + " and unit price INR " + unitPrice);
        
	}
}