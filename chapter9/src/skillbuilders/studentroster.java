package skillbuilders;
import java.util.Scanner;
import java.util.ArrayList; 
public class studentroster
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> roster = new ArrayList<>();

        System.out.println("Enter your amount of students in your class: ");
        int students = input.nextInt();
        input.nextLine(); 

        System.out.println("Enter the names of each student, once you have entered all of them type DONE: ");
        String name = input.nextLine();

        while (!name.equalsIgnoreCase("DONE")) {
            roster.add(name); 
            System.out.println("Next: ");
            name = input.nextLine();
        }

        System.out.println("\nRoster complete! Students entered:");
        for (String student : roster) {
            System.out.println("- " + student);
        }

        input.close();
    }
}
