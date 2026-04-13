package com.mycompany.myproject;

import com.mycompany.myproject.akademis.MataKuliah;

public class Main {
    public static void main(String[] args) {
        Mahasiswa.npm = "2410010376";
        Mahasiswa.nama = "M. Ridhoni Akbar";
        Mahasiswa.ipk = 3.85;
        Mahasiswa.semester = 4;

        System.out.println("=== Data Mahasiswa ===");
        System.out.println("NPM      : " + Mahasiswa.npm);
        System.out.println("Nama     : " + Mahasiswa.nama);
        System.out.println("IPK      : " + Mahasiswa.ipk);
        System.out.println("Semester : " + Mahasiswa.semester);

        MataKuliah.kodeMk = "PBO101";
        MataKuliah.namaMk = "Pemrograman Berorientasi Objek";

        System.out.println("\n=== Data Mata Kuliah ===");
        System.out.println("Kode MK : " + MataKuliah.kodeMk);
        System.out.println("Nama MK : " + MataKuliah.namaMk);
    }
}