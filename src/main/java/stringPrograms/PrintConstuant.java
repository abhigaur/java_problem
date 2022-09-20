package stringPrograms;

public class PrintConstuant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "this    is aa good boysss   ";
		
		StringBuilder sb= new StringBuilder();
		
		char[] chrArr = s.toCharArray();
		
		
		for(int i=0;i<chrArr.length;i++)
		{
			if(chrArr[i]!='a' && chrArr[i]!='e' && chrArr[i]!='i' && chrArr[i]!='o' && chrArr[i]!='u')
			{
				sb.append(chrArr[i]);
			}
		}

		
		System.out.println(sb);
	}

}
