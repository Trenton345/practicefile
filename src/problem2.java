import java.util.Scanner;

import static java.lang.Math.max;

public class problem2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // Initializing variables
        int v, s, k, h, distance;

        //prompt user for inputs in order
        System.out.println("Input the starting height, minimum velocity, velocity, " +
                "and wind speed in that order");
        h = scan.nextInt();
        k = scan.nextInt();
        v = scan.nextInt();
        s = scan.nextInt();

        distance = 0;

        // Program will continue as long as h is above one
        for (;h > 0;){
            // Calculates what velocity should be including the wind speed
            v = v + s;
            v = v - max(1, v/10);

            // Checks if the velocity is still above the minimum velocity and adds height
            // if it is. Otherwise, if velocity is below minimum velocity then it decreases
            // height and if it velocity is zero then height is set to zero.
            if (v >= k){
                h++;
            } else if (v > 0){
                h--;
            } else {
                h = 0;
                v = 0;
            }

            // velocity is added to total distance
            distance = distance + v;

            // Checks if wind speed is above 0 and decreases it
            if (s > 0){
                s--;
            }

        }
        System.out.println(distance);



    }
}
