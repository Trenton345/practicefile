import java.util.*;

public class problem4 {
    public static void main(String[] args){
        // Initiate variables for the rows and columns and set up imports
        int n, m; 
        int left = 0, right = 0, r = 1;
        String cookie = "";
        String check, check2 = "";

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        // Prompt user for inputs for columns and rows
        m = scan.nextInt();
        n = scan.nextInt();

        // Creates the pattern for the cookie dough
        for (int i = 0; i < n; i++){
            for (int e = 0; e < m; e++){
                
                if (rand.nextInt(2) > 0){
                    cookie = cookie.concat("-");
                } else {
                    cookie = cookie.concat("x");
                }
                
                //cookie = cookie.concat(scan.next());

            }
            cookie = cookie.concat("\n");
        }

        // Prints to show what pattern is made
        System.out.println(cookie);




        
        // Loops for all chars to check for x's
        for (int i = 0; i < cookie.length(); i++){

            check = cookie.substring(i, i + 1);


            // Checks if the last and current character are an x and 
            // that were not checking characters on the top or bottom row
            if (check.equals("x") && check.equals(check2) && i > m  + 1 && i < cookie.length() - m){

                // Ensures we don't get an index error and checks if 
                // theres an x at the top, bottom or right of our current character
                if (check.equals(cookie.substring(i - (m + 1), i - (m + 1) + 1)) 
                && check.equals(cookie.substring(i + (m + 1), i + (m + 1) + 1))
                && check.equals(cookie.substring(i + 1, i + 2))) {
                    
                    
                    
                }
                
            } 
           
            check2 = check;
        }

        System.out.println(x);
        System.out.println(x2);
        
        
    }
}
