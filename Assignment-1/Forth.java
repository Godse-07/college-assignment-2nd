public class Forth {
    public static void main(String[] args) {
        int a=5;
        int factorial=fact(a, 1);
        System.out.println(factorial);
    }

    public static int fact(int fact,int a){
        if(fact==0||fact==1){
            return a;
        }else{
            a*=fact;
        }
        return fact(fact-1,a);
    }
}
