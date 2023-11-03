
package javaapplication20;

import java.util.Scanner;

public class konversi_bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int pilihan;
        String biner, hexa;
        int nilaiDesimal;

        // menu pilihan
        System.out.println("==================================================================");
        System.out.println("                  - Program Konversi Bilangan -");

        System.out.println("1. Biner ke Desimal");
        System.out.println("2. Desimal ke Biner");
        System.out.println("3. Biner ke Hexa");
        System.out.println("4. Hexa ke Biner");
        System.out.println("5. Desimal ke Hexa");
        System.out.println("6. Hexa ke Desimal");
        System.out.println("0. Exit");

        
        // proses konversi
        
        do{
            
        System.out.print("Pilih konversi bilangan (1-6): ");
        pilihan = input.nextInt();
        System.out.println("==================================================================");
         
            if(pilihan==1){
                // Biner ke Desimal
                System.out.print("Masukkan angka biner: ");
                biner = input.next();
                nilaiDesimal = Integer.parseInt(biner, 2);
                System.out.println("Nilai desimal: " + nilaiDesimal);
                
            }else if(pilihan==2){
                // Desimal ke Biner
                System.out.print("Masukkan nilai desimal: ");
                nilaiDesimal = input.nextInt();
                biner = Integer.toBinaryString(nilaiDesimal);
                System.out.println("Bilangan biner: " + biner);
               
            }else if(pilihan==3){
                // Biner ke Hexa
                System.out.print("Masukkan angka biner: ");
                biner = input.next();
                hexa = "";
                for (int i = 0; i < biner.length(); i += 4) {
                    int nilai = Integer.parseInt(biner.substring(i, i + 4), 2);
                    hexa += Integer.toHexString(nilai);
                }
                System.out.println("Bilangan hexadesimal: " + hexa);
                
            }else if(pilihan==4){
                // Hexa ke Biner
                System.out.print("Masukkan angka hexadesimal: ");
                hexa = input.next();
                biner = "";
                for (int i = 0; i < hexa.length(); i++) {
                    char digit = hexa.charAt(i);
                    int nilai = (digit >= '0' && digit <= '9') ? digit - '0' : digit - 'A' + 10;
                    biner += Integer.toBinaryString(nilai);
                }
                System.out.println("Bilangan biner: " + biner);
            
            }else if(pilihan==5){
                // Desimal ke Hexa
                System.out.print("Masukkan nilai desimal: ");
                nilaiDesimal = input.nextInt();
                hexa = Integer.toHexString(nilaiDesimal);
                System.out.println("Bilangan hexadesimal: " + hexa);
               
            }else if(pilihan==6){    
                // Hexa ke Desimal
                System.out.print("Masukkan angka hexadesimal: ");
                hexa = input.next();
                nilaiDesimal = Integer.parseInt(hexa, 16);
                System.out.println("Nilai desimal: " + nilaiDesimal);
                
            }else if (pilihan!=0){
                
                System.out.println("Pilihan tidak valid!");
            }
                
        }
        while(pilihan!=0);{
        System.out.println("Exit");
    }
            return;
        
                
    }
          
    
}
