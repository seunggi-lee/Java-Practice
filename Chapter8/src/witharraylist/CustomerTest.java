package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(10010,"�̼���");
		Customer customer2 = new Customer(10011,"�Ż��Ӵ�");
		GoldCustomer customer3 = new GoldCustomer(10012,"ȫ�浿");
		GoldCustomer customer4 = new GoldCustomer(10013,"������");
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		
		System.out.println();
	}
	
}
