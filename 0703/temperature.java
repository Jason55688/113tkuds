import java.util.Scanner;

public class temperature{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double C = Double.valueOf(sc.nextLine());
        Double F = (C*9)/5+32 ;
        System.out.println(F);        
        sc.close();
    }
    
}