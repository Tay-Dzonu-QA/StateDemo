
public class ContextClass {
	
	public static UpperCase upper;
	public static LowerCase lower;
	public static DifferentMessage diffMsg;
	
	private static MsgInterface MsgI;
	
	ContextClass(){
		upper  = new UpperCase();
		lower = new LowerCase();
		diffMsg = new DifferentMessage();
		MsgI = upper;
	}
	
	public void setUpperInterface() {
		MsgI = upper;
		System.out.println("Changed to UPPER");
	}
	public void setLowerInterface() {
		MsgI = lower;
		System.out.println("Changed to lower");
	}
	public void setDiffInterface() {
		MsgI = diffMsg;
		System.out.println("Changed to Different Message");
	}
	
	public void hello() {
		MsgI.hello();
	}
	public void bye() {
		MsgI.bye();
	}
	public void name() {
		MsgI.name();
	}
}
