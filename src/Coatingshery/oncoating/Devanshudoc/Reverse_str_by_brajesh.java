package Coatingshery.oncoating.Devanshudoc;

import java.util.Scanner;

public class Reverse_str_by_brajesh {
    public static void main(String[] args) {
        System.out.println("type a string and we reverse it");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(new StringBuilder(str).reverse());
    }
}