import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input;
		Scanner scan = new Scanner(System.in);
		input=scan.nextInt();
		
		if((input%2==0)&&input!=2){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		scan.close();
	}

}