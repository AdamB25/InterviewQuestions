package work1;

public class IsPrime {
    public static void main(String[] args) {

        System.out.println("isPrime(2) = " + isPrime(2));
        System.out.println("isPrime(0) = " + isPrime(0));

    }

    private static boolean isPrime(int m) {
        if (m<2){

            return false;
        }else if(m==2){
      return true;
        }else {

            for (int i=2;i<m;i++){
                if (m%i==0){
                    return false;
                }
                 }
           return true;
    }


    }
}
