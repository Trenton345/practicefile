import java.util.*;

public class problem3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List plist = new ArrayList();
        List plist2 = new ArrayList();
        int n, l, h, p;
        n = 3;
        l = 1;
        h = 2;
        

        for (int i = 0; i != n; i++){
            p = scan.nextInt();

            plist.add(p);

            

        }

        for (int i = 0; i != n; i++){
           plist2.add(new ArrayList (plist.subList(l * i, )));
            
           
        }

      
            
            
        
        

    }
}
