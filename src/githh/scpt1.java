package githh;

import org.testng.annotations.Test;

public class scpt1 
{
	@Test
	public void rev()
	{
	String s1="reva";
	String rev="  ";
	for(int i=s1.length()-1;i>=0;i--)
	{
		rev=rev+s1.charAt(i);
	}
	
	

}
}
