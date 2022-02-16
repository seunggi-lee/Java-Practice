package witharraylist;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public int bonusPoint;
	public double bonusRatio;
//	private int saleRatio;
//	private int agentID;
	
	
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() ȣ��");
	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
//		System.out.println("Customer(int, String) ȣ��");
	}
	
	public int calcPrice(int price) { // �� �޼ҵ忡 if�� ���ؼ� �ǹ��� �ƴ� �ٸ� ����Ͻø� ������ �� ������ �ٶ������� ���� �ڵ�
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade +"�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
}
