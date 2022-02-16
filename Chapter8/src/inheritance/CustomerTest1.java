package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		/*
		 * Customer customerLee = new Customer(); customerLee.setCustomerID(10100);
		 * customerLee.setCustomerName("Lee");
		 */
		
		VipCustomer customerKim = new VipCustomer(10101, "Kim");
		customerKim.setCustomerID(10101);
		customerKim.setCustomerName("Kim");
		
		customerKim.bonusPoint = 1000;
		
		
//		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		//커밋이 제대로 안된다. 테스트용
	}
}
