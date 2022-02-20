package exception;

public class IDFormatTest {
	
	private String userID;
	
	
	
	public String getUserID() {
		return userID;
	}



	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("ID는 null일 수 없습니다.");
		}
		else if(userID.length() <8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자보다 짧거나 20자보다 길 수 없습니다.");
		}
		this.userID = userID;
	}



	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		String userID = null;
//		String userID = "111111111111111111111111111111111111";
		try {
			idTest.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e);
		}
		
		
		userID = "111111111111111111111111111111111111";
		try {
			idTest.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e);
		}
	}

}
