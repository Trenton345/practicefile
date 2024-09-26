import java.util.*;
/////////////////////////////////////////////////////
//  Code by Trenton Lewis 
//
//  I've added some features not apart 
//  of the orignal problem like seeing each dip
//  and random cookie patterns.
/////////////////////////////////////////////////////
public class promblem4_2 {
    public static void main(String[] args){
        // Initiate variables for the rows and columns and set up imports
        int n, m, min = 0; 
        String cookie = "", cookie2 = "";
        String check, check2 = "";

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        // Prompt user for inputs for rows and columns
        System.out.println("Please input how many rows you want:");
        n = scan.nextInt();

        System.out.println("Input how many columns:");
        m = scan.nextInt();

        // Creates the pattern for the cookie dough.
        // The commented out code is for random patterns as typing manually takes a lot of time.
        for (int i = 0; i < n; i++){
            for (int r = 0; r < m; r++){
                /*
                if (rand.nextInt(2) > 0){
                    cookie = cookie.concat("-");
                } else {
                    cookie = cookie.concat("x");
                }
                */
               cookie = cookie.concat(scan.next());

            }
            cookie = cookie.concat("\n");
        }

        // Prints to show what pattern is made
        System.out.println(cookie);

        cookie2 = cookie;

        // Loops to see how many times the cookie must be dipped
        while (cookie.contains("x")){

            // Loops for every character checking if they're touching an edge or dash.
            // If they are, they're replaced by a dash, then this process is repeated.
            for (int i = 0; i < cookie.length(); i++){

                check = cookie.substring(i, i + 1);


                
                if (check.equals("x") && i > m  + 1 && i < cookie.length() - m){

                    if(!check.equals(check2)
                    || !check.equals(cookie.substring(i - (m + 1), i - (m + 1) + 1))
                    || !check.equals(cookie.substring(i + (m + 1), i + (m + 1) + 1))
                    || !check.equals(cookie.substring(i + 1, i + 2))){
                        cookie2 = cookie2.substring(0, i) + "-" + cookie2.substring(i + 1, cookie.length());

                        }
                    
                    
                } else if (check.equals("x")){
                    cookie2 = cookie2.substring(0, i) + "-" + cookie2.substring(i + 1, cookie.length());
                }
            
                check2 = check;
            }
            System.out.println(cookie2);
            cookie = cookie2;
            min++;
        }
            
        // Prints the glorious final product
        System.out.println("The minimum amount of dips for this pattern is: " + min);
        
        
    }
}
