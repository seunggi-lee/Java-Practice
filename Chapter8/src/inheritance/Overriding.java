package inheritance;

public class Overriding {

	public static void main(String[] args) {
		Customer customerLee = new Customer(100010, "LEE");
		customerLee.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo());
		
		VipCustomer customerKim = new VipCustomer(100010, "Kim", 100);
		customerKim.calcPrice(10000);
		System.out.println(customerKim.showCustomerInfo());
	}

}
