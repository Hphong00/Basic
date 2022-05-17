package Basic;

public class Bai10 {
    public static void main(String[] args) {
        soNguyento();
    }
    private static boolean checkSoNguyenTo(int n){
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i<=squareRoot;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
   private static boolean phaTuNTo(int n){
        int pt = 0;
        while (n>0){
            pt =n%10;
            if(!checkSoNguyenTo(pt)){
                return false;
            }
            n=n/10;
        }
       return true;
   }
   private static int NghichDao(int n){
        int nDao = 0;
        while (n>0){
            nDao = nDao*10 +n%10;
            n=n/10;
        }
        return nDao;
   }
    private static void soNguyento(){
        int cout =0;
        for(int i = 1000000; i<10000000;i++){
            if ((checkSoNguyenTo(i)) && (phaTuNTo(i)) && (checkSoNguyenTo(NghichDao(i)))){
                System.out.println(i);
                cout++;
            }
        }
        System.out.println("Cout: "+ cout);
    }
}
