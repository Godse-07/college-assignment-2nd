import java.util.*;;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=fact(a,1);
        System.out.println(ans);
    }

    public static int fact(int a, int fact){
        if(a==1 || a==0){
            return fact;
        }else{
            fact*=a;
        }
        return fact(a-1, fact);
    }
}
