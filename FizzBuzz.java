import java.util.*;
class Adhesh{
	public static void main (String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the signal colour");
		int  light=scanner.nextInt();
		String res=switch(light){
			case 1 -> "Stop";
			//break;
			case 2 -> "Wait";
			//break;
			case 3 -> "go";
			//break;
			default -> "anything";
		};
		System.out.println(res);
	}
			
		
	}
