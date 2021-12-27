import java.util.Scanner;

public class Main {
    /* Ad. zadania 1 */
public static int[] zadanie1(int zmienna){
    var tab = new int[zmienna+1] ;
    var x = 0;
    for (int i =40; i>=zmienna; i -- ){
        tab[x] = i;
        x++;
    }
    for (int i = 0; i< tab.length; i++) {
        System.out.println(tab[i]+ ",");

    }
    return tab;
}

    /* Ad. zadania 2 */
public static String[] zadanie2(){
    Scanner scan = new Scanner(System.in);
    String[] tab1 = new String[6];

for (int j = 0; j<6; j++ )
{
    String y = scan.nextLine();
}
    for (String y: tab1
         ) {
        System.out.println(y + ",");
    }
    return tab1;
}


    /* Ad. zadania 3 */
public static void zadanie3(String name, String surname, int age){
    System.out.println("\nName: " + name + "\nSurname : " + surname + " \nage: " + age );
}

    /* Ad. zadania 4 */

    public static void zadanie4



    public static void main(String[] args) {

        /* ćwiczenie 5 Metody */
        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        System.out.println("Zadanie 1");

        var tab = zadanie1(20);
    /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
        System.out.println("Zadanie 2");
        System.out.println("Podaj 6 wyrazów do tablicy");





        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        System.out.println("Zadanie 3");
        zadanie3("Piotr "," Wojtalewicz", 22);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */


    }


    }



