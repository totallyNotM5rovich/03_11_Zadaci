//Napišite program u Javi koji će učitati niz znakova (string) sa standardnog ulaza i okrenuti redoslijed riječi u unesenom stringu. Prikazati transformirani string s obrnutim redoslijedom riječi.
//Primjer ulaza: Dobar dan svima
//Primjer izlaza: svima dan Dobar

import java.util.Scanner;

public class Zadatak2 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite tekst:");
        String input = scanner.nextLine();

        String[] inputRijeci = input.split("\\s+");

        for (int i = inputRijeci.length-1; i >= 0; i--) {
            System.out.print(inputRijeci[i] + " ");
        }
    }
}
