package inheritance;

public class VipCustomer extends Customer{
	private double saleRatio;
	private int agentID;
	
	public VipCustomer() {
		
		//super(); // ���� Ŭ������ �����ϴ� ���ε� �������� �ʾƵ� �ڵ� ȣ��
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() ȣ��");
	}
	
	
}
