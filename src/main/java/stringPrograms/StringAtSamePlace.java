package stringPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringAtSamePlace {
	
	
	//input   my name is abhilash
	//output  hs alih ba siemanym

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * //main string String s="my name is Abhilash";
		 * 
		 * // append some value String neSt = s.replaceAll(" ", "/");
		 * 
		 * System.out.println(neSt);
		 * 
		 * 
		 * StringBuilder sb0 = new StringBuilder(); sb0.append(s); StringBuilder
		 * reverseString = sb0.reverse();
		 * 
		 * 
		 * String ss = reverseString.toString(); String sss = ss.replaceAll(" ", "");
		 * 
		 * char[] sssChar = sss.toCharArray();
		 * 
		 * StringBuilder sbi= new StringBuilder(sss);
		 * 
		 * 
		 * 
		 * 
		 * HashMap<Integer,Character> mp= new HashMap< Integer,Character>();
		 * 
		 * char[] chrArr = neSt.toCharArray();
		 * 
		 * for(int i=0;i<chrArr.length;i++) { if(chrArr[i]=='/') { mp.put(i, chrArr[i]);
		 * } }
		 * 
		 * System.out.println(mp.keySet().toString());
		 * 
		 * System.out.println("Size of map"+mp.size());
		 * 
		 * 
		 * 
		 * for(Entry<Integer, Character> value:mp.entrySet()) { int vl = value.getKey();
		 * 
		 * 
		 * System.out.println(vl);
		 * 
		 * 
		 * sbi.append(' ').charAt(vl); }
		 * 
		 * System.out.println(sbi);
		 * 
		 */
		
		
		/*
		 * char[] chrArray = s.toCharArray();
		 * 
		 * StringBuilder sb = new StringBuilder(); sb.append(s);
		 * 
		 * StringBuilder reverseString = sb.reverse();
		 * 
		 * ArrayList<Character> al= new ArrayList<Character>();
		 */
	
	
		
		 String str = "hi welcome to Tutorialspoint";
	      String strArray[] = str.split(" ");
	      StringBuffer sb= new StringBuffer(str);
	      sb.reverse();
	      for(int i=0 ; i<str.length(); i++){
	      if(str.charAt(i)== ' '){
	         sb.insert(i, " ");
	      }
	   }
	   sb.append("");
	   System.out.println(sb);
	
	

	}

}
