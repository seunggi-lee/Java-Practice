package inheritance;

public class VipCustomer extends Customer{
	private double saleRatio;
	private int agentID;
	
	public VipCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName); // ���� Ŭ������ �����ϴ� ���ε� �������� �ʾƵ� �ڵ� ȣ��
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		
		
//		System.out.println("VIPCustomer(int, String) ȣ��");
	}
	public int calcPrice(int price) { // overriding
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	
}
