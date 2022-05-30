package Practica4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mexicano mexi = new Mexicano();
       
        System.out.println("Ingrese su primer nombre :");
        mexi.setprimernombre(scan.nextLine());

        System.out.println("Ingrese su segundo nombre:");
        mexi.setsegundonom(scan.nextLine());

        System.out.println("Ingrese su apellido paterno:");
        mexi.apellidopaterno(scan.nextLine());

        System.out.println("Ingrese su segundo apellido:");
        mexi.apeliidomaterno(scan.nextLine());

        System.out.println("Ingrese su genero (Hombre/Mujer):");
        mexi.asignarGen(scan.nextLine());

        System.out.println("Ingrese el estado en donde nació:");
        mexi.estado(scan.nextLine());

        System.out.println("\nIngrese su fecha de nacimiento.(Ej: 01/05/2001)\n");
        System.out.println("Día:");
        mexi.asignarDia(scan.nextLine());
        System.out.println("Mes:");
        mexi.asignarMes(scan.nextLine());
        System.out.println("Año:");
        mexi.asignarAño(scan.nextLine());

        mexi.Curp(mexi.primernombre(),mexi.getsegundonom(),mexi.getapeliidomaterno(),mexi.getapeliidomaterno(),mexi.getgenero(),mexi.getestado(),mexi.getDia(),mexi.getMes(),mexi.getAño());
        mexi.RFC(mexi.primernombre(),mexi.getsegundonom(),mexi.getapeliidomaterno(),mexi.getapeliidomaterno(),mexi.getgenero(),mexi.getestado(),mexi.getDia(),mexi.getMes(),mexi.getAño());
        scan.close();
    }
}
