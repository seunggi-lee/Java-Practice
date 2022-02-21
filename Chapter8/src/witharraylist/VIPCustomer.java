package witharraylist;

import inheritance.Customer;

public class VIPCustomer extends Customer{
	public double saleRatio;
	public int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName); // 상위 클래스를 참조하는 것인데 선언하지 않아도 자동 호출
		customerGrade = "VIP";
		saleRatio = 0.1;
		this.agentID = agentID;
		
		
		
//		System.out.println("VIPCustomer(int, String) 호출");
	}
	public int calcPrice(int price) { // overriding
		return price;
	}
	
	
}
