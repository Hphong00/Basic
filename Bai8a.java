package Basic;

public class Bai8a {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100000; i < 1000000; i++) {
            if (isThuanNghich(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Tong: "+ count);
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
}

