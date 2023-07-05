package OPerators2;
import java.util.*;
public class Program3 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] st = str.split(" ");
		System.out.println(st[2].charAt(0));
		s.close();
	}
}
