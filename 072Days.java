import java.util.Scanner;

public class Day72 {
public static void main(String[] args) {
Scanner hi = new Scanner(System.in);

System.out.print("Masukkan angka: ");  
    int n =hi.nextInt();  
      
    int total = 0;  
      
    while (n >= 0) {  
          
        total +=n;  
          
        System.out.print("Tambahkan angka : ");  
    n = hi.nextInt();  
          
    }  
    System.out.println("Total penjumlahan: " + total);  
    }  
}
