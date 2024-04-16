package com.juaracoding.aihpraktikumjf2.praktikum2;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author ajirohimat aih a.k.a Aji Rohimat
Java Developer
Created on 05/04/24 11.09
@Last Modified 05/04/24 11.09
Version 1.0
*/
import java.util.Scanner;

public class Praktikum2 {

    private String input;

    public Praktikum2(String input) {
        this.input = input;
    }

    public int hitungAsciiBerdasarkanKategori() {
        int totalAngka = 0;
        int totalHurufBesar = 0;
        int totalHurufKecil = 0;
        int totalSpesialKarakter = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                totalAngka += (int) ch;
            } else if (Character.isUpperCase(ch)) {
                totalHurufBesar += (int) ch;
            } else if (Character.isLowerCase(ch)) {
                totalHurufKecil += (int) ch;
            } else if (!Character.isLetterOrDigit(ch)) {
                totalSpesialKarakter += (int) ch;
            }
        }

        // Mengeliminasi salah satu kategori
        int totalAscii = totalAngka + totalHurufBesar + totalHurufKecil + totalSpesialKarakter;
        int hasilEliminasi = totalAscii - totalHurufKecil;  // Mengeliminasi kategori angka

        return hasilEliminasi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kata: ");
        String input = scanner.nextLine();

        Praktikum2 eliminator = new Praktikum2(input);

        int hasil = eliminator.hitungAsciiBerdasarkanKategori();

        System.out.println("Hasil ASCII dengan eliminasi salah satu kategori dari string '" + input + "' adalah: " + hasil);
    }
}