package typeInput;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int principal = sc.nextInt();
		int time = sc.nextInt();
		int ans=(principal==time)?1:2;
		System.out.println(ans);
	}
}
