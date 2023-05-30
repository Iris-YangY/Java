// Yadi Yang Assignment G Apr, 19, 2017
public class flashlight// Name of the program
{
	public static void main(String[] args) 
	{
		String str = "flashlight";// Declare the string
		System.out.println("Part 1");
		System.out.println("===============================");
		String a = str.substring(0,5);
		String b = str.substring(5,10);
		String c = str.substring(2,5);
		String d = str.substring(0,1)+str.substring(5,10);
		String e = str.substring(0,3)+str.substring(7,8);
		String f = str.substring(0,1)+str.substring(6,7)+str.substring(9,10);
		String g = str.substring(4,5)+str.substring(6,9);
		String h = str.substring(7,8)+str.substring(2,4);
		String i = str.substring(0,1)+str.substring(2,4)+str.substring(9,10);
		String j = str.substring(3,5)+str.substring(2,3)+str.substring(0,1)+str.substring(9,10);// Starting with 0 and end with the next number of the character
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);// Prints out the results
		System.out.println();
		System.out.println("Part 2");
		System.out.println("===============================");
		String p1 = b + "s";
		String p2 = b + "er";
		String p3 = b + "ning";
		String p4 = "en" + b + "ened";// b = light, with the letters added, there will be new words formed
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);// Prints out the result
	}

}