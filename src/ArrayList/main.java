
package ArrayList;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int jumlah;
        System.out.println("jumlah angka:");
       
        try{
            jumlah = scan.nextInt();
            int [] hasil = new int[jumlah];
        
            for(int i = 1; i <= jumlah; i++){
                System.out.println("input data" + i);
                hasil[i-1] = scan.nextInt();
            }
            
            System.out.print("Data masukan : ");
            for(int i=1; i<=jumlah;i++){
                System.out.print(" "+hasil[i-1]);
                if (i % 10 == 0 ){
                    System.out.println();
                }
            }
            
            System.out.println("1. Selection");
            System.out.println("2. Insertion");
            System.out.println("3. Bubble");
            System.out.print("Pilih type sorting: ");
            
            try{
                int pilih = scan.nextInt();
                switch (pilih) {
                    case 1:
                        ar.selection(hasil);
                        ar.printArray(hasil);
                        break;
                    case 2:
                        ar.insertion(hasil);
                        ar.printArray(hasil);
                        break;
                    case 3:
                        ar.bubble(hasil);
                        ar.printArray(hasil);
                        break;
                    default:
                        System.out.println("tidak ada");
                        break;
                }
            }
            catch(Exception e){
                System.out.println("input angka!");
            }
        }
        catch(Exception e){
            System.out.println("input angka!");
        }   
    }
}
