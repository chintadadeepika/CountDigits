import java.util.*;
public class CountDig {
    public static void digitCount(int x){
        int res = 0;
        while(x>0){
            x = x/10;
            res++;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        digitCount(x);
    }
}
