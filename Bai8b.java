package Basic;
public class Bai8b {
    public static void main(String[] args) {
        int count =0;
        for (int i = 100000; i < 1000000; i++) {
            if (isThuanNghich(i)) {
                if (iTong(i)){
                    System.out.println(i);
                    count++;
                };
            }
        }
        System.out.println("cout: "+ count);
    }
    public static boolean isThuanNghich(int n) {
        String numberStr = String.valueOf(n);
        int size = numberStr.length();
        for (int i = 0; i < (size/2); i++) {
            if (numberStr.charAt(i) != numberStr.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
    private static boolean iTong(int number){
        String numberStr = String.valueOf(number);
        char kytu;
        int s=0;
        for (int i=0;i<numberStr.length();i++){
            kytu = numberStr.charAt(i);
            int num = Integer.parseInt(String.valueOf(kytu));
            s=s+num;
        }
        if (s%10==0){
            return true;
        }
        return false;
    }
}
