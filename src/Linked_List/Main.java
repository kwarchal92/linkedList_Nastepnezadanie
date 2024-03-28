package Linked_List;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        double pliczba; //liczba pseudo losowa

        Random r = new Random();

        LinkedList<Integer> liczba = new LinkedList<>();

        for (int i = 1; i <= 10; i++)
        {
            pliczba = Math.round(100 * (r.nextDouble()));
            liczba.add((int) pliczba); //rzutowanie
        }

        Iterator<Integer> it = liczba.iterator();
        System.out.print("\nwyswietlamy liczby pseudolosowe od lewej do prawej: ");

        while(it.hasNext())
            System.out.print(it.next() + ", ");

        System.out.println();

        Iterator<Integer> it1 = liczba.descendingIterator();
        System.out.print("Wyswietlamy liczby pseudolosowe od prawej do lewej: ");

        while (it1.hasNext())
            System.out.print(it1.next() + ", ");

        System.out.println();
    }
}
