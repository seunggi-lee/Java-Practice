package witharraylist;

import inheritance.Customer;

public class VIPCustomer extends Customer{
	public double saleRatio;
	public int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName); // ���� Ŭ������ �����ϴ� ���ε� �������� �ʾƵ� �ڵ� ȣ��
		customerGrade = "VIP";
		saleRatio = 0.1;
		this.agentID = agentID;
		
		
		
//		System.out.println("VIPCustomer(int, String) ȣ��");
	}
	public int calcPrice(int price) { // overriding
		return price;
	}
	
	
}
