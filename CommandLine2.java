package userInput;

public class CommandLine1 {

	public static void main(String[] args) {
		System.out.println("your first argument is :"+args[0]);

	}

}
public class CommandLine2 {
	public static void main(String args[]) {
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);
	}
}
