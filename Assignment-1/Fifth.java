public class Fifth {
    public static void main(String[] args) {
        int a=5;
        long ans=InnerFifth.fact(5, 1);
        System.out.println(ans);
    }
}


/**
 * InnerFifth
 */
class InnerFifth {
    public static long fact(int a,int fact){
        if(a==0 || a==1){
            return fact;
        }else{
            fact*=a;
        }
        return fact(a-1, fact);
    }
}