public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        System.out.println("zadanie 1a");
        for (int a = 1; a <= 100; a++) {
            if (a == 15) {
                break;
            }
            System.out.println(a);
        }
        System.out.println("zadanie 1b");
        for (int b = 100; b >= 0; b--) {
            if (b == 99) {
                continue;
            }
            System.out.println(b);
        }
        System.out.println("zadanie 1c");
        for (int c = 5; c <= 20; c++) {
            if (c == 7) {
                return;
            }
            System.out.println(c);
        }
    }
}