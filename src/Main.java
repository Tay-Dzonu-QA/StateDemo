import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String go = "";
		
		ContextClass output = new ContextClass();
		output.setUpperInterface();
		
		while(true) {
			System.out.println("Do you want the [h] hello, [b] bye [p] program name or [c] change state?");
			go = sc.nextLine();
			switch(go) {
				case "h": output.hello();break;
				case "b":output.bye();break;
				case "p":output.name();break;
				case "c": System.out.println("Do you want [u] upper case, [l] lower case or [d] different message?");
					String newstate = sc.nextLine();
					switch(newstate) {
						case "u": output.setUpperInterface(); break;
						case "l":output.setLowerInterface();break;
						case"d":output.setDiffInterface();break;
						default: System.out.println("No change");
					} break;
				default:System.out.println("Wrong input");
			}			
		}
	}

}
