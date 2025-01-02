package collections;
import java.util.*;
public class Java2 {

	public static void main(String[] args) {
		
		List<Integer> ll=new ArrayList<>();
		List<Integer> l1=new ArrayList<>();
		ll.size();
		Collections.sort(ll);
		ll.add(null);
		ll.remove(1); // 1 is index;
		ll.set(0, null); // 0 is index null is ele;
		ll.clear();
		ll.addAll(l1);
		ll.containsAll(l1);
		ll.isEmpty();
		ll.toArray();
		for(Integer e:ll) {
			
		}
		
		//Map
		Map<Character,Integer> mp=new HashMap<>();
		mp.put('@', 1);
		mp.containsKey('@');
		mp.get('@');
		for(Map.Entry<Character,Integer> e:mp.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		//Set
		Set<Integer>ss=new HashSet<>();
		ss.add(1);
		ss.contains(ss);
		
	}

}
