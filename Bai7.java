package Basic;

public class Bai7 {
    public static void main(String[] args) {
        int cout =0;
        for(int i = 100000; i<999999;i++){
            if (isPrimeNumber(i) && checkPt(i)){
                System.out.println(i);
                cout++;
            }
        }
        System.out.println("Cout: "+ cout);
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkPt(int number){
        int x=0;
        while (number>0){
            x = number%10;
            number = number/10;
            if(x%2==0){
                return false;
            }
        }
        return true;
    }
}
