package inheritance;

public class VipCustomer extends Customer{
	private double saleRatio;
	private int agentID;
	
	public VipCustomer() {
		
		//super(); // 상위 클래스를 참조하는 것인데 선언하지 않아도 자동 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() 호출");
	}
	
	
}
