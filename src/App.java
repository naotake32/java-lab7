import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		
		int inputNum = 0;
		String inputName;
		String inputDept;
		int inputSalary = 0;
		 List<Student> houseList = new ArrayList<Student>();
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Select an option:/n"
        + "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n"
        + "1) Print all students:\n"
        + "2) Add a new student:\n"
        );
        inputNum = scanner.nextInt();
        
        System.out.println(inputNum);
        System.out.println("============================================\n");
        System.out.println("============================================\n");
        
        if(inputNum == 1) {
        	System.out.println("=========================================\n");
        	System.out.println("-----------------------------------------\n");
        	System.out.println("=========================================\n");
//        	Server.getName();
//        	Server.getDept();
//        	Server.getSalary();
        }else if(inputNum == 2) {
        	System.out.println("Please enter a name:\n");
        	inputName = scanner.nextLine();
        	System.out.printf("Please enter %s's department:", inputName);
        	inputDept = scanner.nextLine();
        	System.out.printf("Please enter %s's salary:", inputName);
        	inputSalary = scanner.nextInt();
        	
        }
        	
      
	
	}
}
