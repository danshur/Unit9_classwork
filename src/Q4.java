
public class Q4 {
	public static void main(String[] args){
		doSomething();
		//doSomethingElse();
	}
	
	public static void doSomething() {
		    try {
		      doSomethingElse();
		      System.out.println("One");
		    } catch (Exception e) {
		      System.out.println("Two");
		    }  finally {
		      System.out.println("Three");
		    }
		    System.out.println("Four");
		  }
		  
		  public static void doSomethingElse() throws Exception {
		    throw new IllegalStateException("Big problem");
		  }

}
