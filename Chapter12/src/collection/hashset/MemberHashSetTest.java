package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet(); 
		
		Member member1 = new Member(101, "�̼���");
		Member member2 = new Member(102, "������");
		Member member3 = new Member(103, "ȫ�浿");
		
		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		
		memberHashSet.showAll();
		
		Member member4 = new Member(101, "�̸���");
		memberHashSet.addMember(member4);
		memberHashSet.showAll();
	}

}
