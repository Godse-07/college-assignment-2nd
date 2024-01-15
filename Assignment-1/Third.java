public class Third {
    public static void main(String[] args) {
        int a=10;
        int fact=1;
        if(a==0){
            fact=1;
        }else{
            while (a>=1) {
                fact*=a;
                a--;
            }
        }
        System.out.println(fact);
    }
}
