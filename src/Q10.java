
public class Q10 {

	public static void main(String[] args) {
		String text = "The best time to plant a " + "tree was 20 years ago. The second best time " 	+ "is now. –Chinese Proverb";

		//String text1 = text.replaceAll(".", "");

		//Object text2 = text.split();

		//String[] text3 = text.split(".");

		String[] text4 = text.split("\\.");
		
		System.out.println(text.replaceAll(".", ""));
		System.out.println("**************************");
		//System.out.println(text.split());
		System.out.println("**************************");
		//System.out.println(text3[0] + " + and + " + text3[1]);
		System.out.println("**************************");
		System.out.println(text4[0] + " +and+ " + text4[1]);
	}

}
