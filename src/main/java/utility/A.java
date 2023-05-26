package utility;

public class A {

	public static void main(String[] args) {
		String s="Mikael Spliid, Head of WMO IT Solutions, Nordea";
		String[] sp = s.split(",");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		System.out.println(sp[2]);
	}
}
