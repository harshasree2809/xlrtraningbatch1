public class Demo061 {
    static boolean  isPrime(int n){
        if(n<2) {
            return false;
        }
        for(int i=2; i<n-1;i++){
            if(n%i==0){
                return false;
            }        
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 10;
        for(int i=1; i<n+1; i++){
            if(isPrime(i)){
                System.out.println(i+" is Prime Number");
            }
            else{
                System.out.println(i+" is not Prime");
            }
 }
}
}
