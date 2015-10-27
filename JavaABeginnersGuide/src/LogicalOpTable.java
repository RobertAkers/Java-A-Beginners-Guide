
public class LogicalOpTable {
	public static void main(String[] args) {

		
		System.out.println("p \tq \tp&q \tp|q \ttp^q \t!p");
		
		boolean q = true, p = false;
		
		System.out.println(p + "\t" + p + "\t" + p + "\t" + p + "\t" + p + "\t" + q);
		System.out.println(q + "\t" + p + "\t" + p + "\t" + q + "\t" + q+ "\t" + p);
		System.out.println(p + "\t" + q + "\t" + p + "\t" + q + "\t" + q + "\t" + q);
		System.out.println(q + "\t" + q + "\t" + q + "\t" + q + "\t" + p + "\t" + p);
		
		
		
	}
}
