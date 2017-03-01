
// TODO : Read the code without reading other "//" COMMENT and see if you can understand what it does or not.
// TODO : Fix this poorly understand code by doing TODO COMMENT below the code.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO : Give a short description about this program in javadoc
/**
 * TODO HERE.
 * @author Your Name
 */
public class Classroom {
    // Store the list the name of students in the classroom.
    
    static List<String> s = new ArrayList<String>();
    // Scanner to recieve user input.
    
    static Scanner n = new Scanner(System.in);
    // Limit number of student in the classroom.
    
    static int l = 20;
    
    public static void main(String[] args) {
        // Contains user input.
        
        char c = '\0';
        do {
            System.out.print("[a]dd, [r]emove, [s]how all, [n]ew limit, [q]uit : ");
            c = n.next().charAt(0);
            switch(c) {
                case 'a':
                    if(s.size() > l-1) System.out.println("Class limit : "+l);
                    else {
                        System.out.print("Input: ");
                        //name of new student
                        
                        String a = n.next();
                        s.add(a);
                        System.out.println("Added "+a);
                    }
                    break;
                case 'r':
                    System.out.print("Input : ");
                    // Just a temp input.
                    
                    String t = n.next();
                    if(s.remove(t)) System.out.println("Removed "+t);
                    else System.out.println(t+" not found in this class");
                    break;
                case 's':
                    for(int i=0 ; i<s.size() ; i++) {
                        // Format for output String.
                        
                        String f = String.format("%2d. %s", i+1,s.get(i));
                        System.out.println(f);
                    }
                    if(s.size() == 0) System.out.println("Empty class");
                    break;
                case 'n':
                    System.out.print("Input : ");
                    // Just a temp input.
                    
                    int i = n.nextInt();
                    if(i > 0  &&  i >= s.size()) {
                        l = i;
                        System.out.println("New limit is "+l);
                    }
                    else System.out.println("Invalid input");
                    break;
                case 'q':
                    break;
                default :
                    System.out.println("Invalid choice !");
            }
        } while(c!='q');
    }
}
// TODO : Change the variable name to be meaningful name. So, others should understand this code more easily (HINT : Refactor it !).
// TODO : This just a poor user interface, user will don't know about what to do with this program (ex. `INPUT : `???). Change to prompt that can be easily understand by the users.
// TODO : You want to add, remove or show all the students without using this `Main` method so you should create the own method for each command.
/** Ex. Your this Main method code should be like this :
 *  ...
 *  case 'a':
 *      if(addStudent(string)) System.out.println("Added "+string);
 *      else System.out.print("Class limit :"+int);
 *      break;
 *  ...
 */
// TODO : The addStudent() method accept the same name of the students, use ArrayList's contains() method to check that there's non exist in the class before you add to the class (HINT : See the java api doc if you get stuck).
// TODO : Remove TODO COMMENT after you finished that.
