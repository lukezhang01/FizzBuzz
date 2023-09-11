public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int counter = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                n--;
            } else {
                n = n / 2;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
