class UniversityDiscount{
	public static void main(String[] args){
		int fee = 125000;
		int discountPercent = 10;
		int discount = (fee)*(10/100);
		int discountAmount = (fee - discount);
		System.out.println("The discount amount is INR " + discountAmount+  "  and final discounted fee is INR  "  +discountAmount);
	}
}