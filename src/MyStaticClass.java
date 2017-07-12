/**
 * 
 */

/**
 * @author Ananya Dutta
 *
 */
public final class MyStaticClass {

	
	private MyStaticClass() {
		
		myStaticMember=1;
	}
	private static int myStaticMember;
	
	public static int getMyStaticMember() {
		return myStaticMember;
	}

	public static void setMyStaticMember(int val) {
		myStaticMember = val;
	}

	public static int squareMyStaticMember() {
		return myStaticMember * myStaticMember ;
	}

}
