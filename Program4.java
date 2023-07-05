package OPerators2;
import java.util.*;
public class Program4 {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		String str = s.next();
		String result = (str.charAt(0)>=65 && str.charAt(0)<=90)?"True":"False";
		System.out.println(result);
		s.close();
	}
}
