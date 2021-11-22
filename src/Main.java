import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik) */
        System.out.println("Zadanie 1");
        int i = 1000;
        System.out.println("\n");
        do{
            System.out.println("i: " + i);
            if( i % 27 ==0) {
                System.out.println("Liczba " + i + " jest podzielna przez 27 " );
            }
        } while (--i > 0);


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeliterować i wyświetlić od ostatniego elementu
        */
        System.out.println("Zadanie 2a");
      int[]tab = {1,2,3,4,5};

      int a = 0;
      while (a<tab.length){
          System.out.println(tab[a]);
          a++;
      }
        System.out.println("Zadanie 2b");

        double[]tab1 = {1.1,2.2,3.3,4.4,5.5};

        int b = 0;
        while (b<tab.length){
            System.out.println(tab1[b]);
            b++;}

        System.out.println("Zadanie 2c");

        String[]tab2 = {"Ania","Hania","Piotr","Lukasz","Wojtas"};

        int c = 0;
        while (c<tab.length){
            System.out.println(tab2[c]);
            c++;}





        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        System.out.println("Zadanie 3a");

        System.out.println(" gdy wartość true jest w warunku funkcji wtedy kod się nie zatrzymuje sam z siebie (nie kończy się)");

        System.out.println("Zadanie 3b");



    }
}
