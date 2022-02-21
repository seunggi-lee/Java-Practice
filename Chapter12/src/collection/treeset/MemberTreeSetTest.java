package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberHashSet = new MemberTreeSet(); 
		
		Member member1 = new Member(102, "ÀÌ¼ø½Å");
		Member member2 = new Member(101, "±èÀ¯½Å");
		Member member3 = new Member(103, "È«±æµ¿");
		
		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		
		memberHashSet.showAll();
		
	
	}

}
