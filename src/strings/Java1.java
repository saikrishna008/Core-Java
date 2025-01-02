package strings;

import java.util.Arrays;

public class Java1 {

	public static void main(String[] args) {
		String s="sai app";
		int x=s.length();
		
		//substring-------->
		String a=s.substring(0,1);	//s
		System.out.println(a);
		
		//String buffer------------>
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();sb.append(" ");
		System.out.println(sb);
		
		String[] arr= {"ab","bc"};
		
		//split---------->
		String[] xx=s.split(" ");
		
		if(Character.isAlphabetic('a')) {
			System.out.println("yes");
		}
		
		System.out.println(Math.max(1, 2));
		
		int[] arr1= new int [5];
		
		s.matches("[a-z]+");
		char[] ll=s.toCharArray();
		Arrays.sort(ll);
		s.substring(0,s.indexOf('@'));
		s.startsWith(a);
		Character.toString(a.charAt(x)).matches("[@]+");
		s.equals(a);
		s.equalsIgnoreCase(a);
		String.valueOf(ll);
		
		String cc="2";
		double c=Double.parseDouble(cc);
		double mx=Double.MAX_VALUE;
		//double bb=("%.2f",mx);
		
	}

}
