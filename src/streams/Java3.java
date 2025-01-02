package streams;

import java.util.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java3 {

	public static void main(String[] args) {
		//Streams---->
		// stream api is used to process collections of objects
		
		//important
		List<Integer> ll=new ArrayList<>();
		ll.stream().forEach(System.out::println);
		// to List
		ll.stream().collect(Collectors.toList());
		//distinct
		ll.stream().distinct().sorted();
		//sorting
		ll.stream().sorted(Comparator.reverseOrder());
		//filter map limit 
		int yy=ll.stream().filter(x->x%2==0).map(y->y/=2).limit(2).findFirst().get();
		
		ll.stream().toList();
		// min and max
		ll.stream().min((x,y)->x>y? 1:0).get();
		
	}

}
