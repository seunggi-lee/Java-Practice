package collection.arraylist;
import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member member1 = new Member(101, "ÀÌ¼ø½Å");
		Member member2 = new Member(102, "±èÀ¯½Å");
		Member member3 = new Member(103, "È«±æµ¿");
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(member3.getMemberId());
		memberArrayList.showAll();
	}

}
