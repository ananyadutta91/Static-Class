
public class TestMyStaticClass {


	public static void main(String[] args) {
		
		MyStaticClass.setMyStaticMember(5);
		
		System.out.println("Static Value: " + MyStaticClass.getMyStaticMember());
		System.out.println("Value Squared: " +MyStaticClass.squareMyStaticMember());
	}

}
