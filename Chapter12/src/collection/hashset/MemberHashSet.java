package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberId) {
		
/*		for(int i = 0; i< arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arrayList.remove(i);
				return true;
			}
		}
*/		
		Iterator<Member> iterator = hashSet.iterator(); // 이러레이터 사용 방법
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		
		
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	public void showAll() {
		
		for(Member member : hashSet) {
			System.out.println(member);
		}
//		System.out.println(hashSet);
		System.out.println();
	}
	
}
