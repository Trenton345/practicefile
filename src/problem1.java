import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int x;
        int r;
        int f;
        r = scan.nextInt();
        f = scan.nextInt();

        x = (180 / r * f) % 360;

        System.out.println(x);

        if(x > 0 && x != 180){
            
            if(x > 180 && x <= 270){
                x = 180;
            } else if(x > 90) {
                x = 180;
            } else {
                x = 0;
            }
            
        }

        System.out.println(x);

        if(x == 180){
            System.out.println("down");
        } else {
            System.out.println("up");
        }



    }
}
