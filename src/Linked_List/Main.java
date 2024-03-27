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
        System.out.print("wyswietlamy liczby pseudolosowe od lewej do prawej: ");

        
    }
}
