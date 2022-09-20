package generalProblems;

public class Test{
	Village v;
	
	public Test() {
		this.v = new Village();
	}
	
	public static void main(String[] args) {
		/*
		 * Test t = new Test(); Village v2 = t.v; Family f2 = v2.f; String name =
		 * f2.childName; System.out.println(t.v.f.childName);
		 */
		
		
		String s="this is gaur";
		
		String blank=null;
		StringBuilder sb= new StringBuilder();
		char[] chr = s.toCharArray();
		
		
		for(int i=0;i<chr.length;i++)
		{
			char chh = chr[i];
			sb.append(chh);
		}
		
		
		System.out.println(sb);
	}
}