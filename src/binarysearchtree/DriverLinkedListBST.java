
package binarysearchtree;

import java.util.Scanner;

 public class DriverLinkedListBST{
     public static void main(String[] args){                 
        Scanner scan = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();           
        char ch;
        do{
            System.out.println("BST");
            System.out.println("1. Input ");
            System.out.println("2. Hapus ");
            System.out.println("3. Cari dan Tampilkan route");
            System.out.println("4. Hitung node");
            System.out.println("5. Hitung leaf");
            System.out.println("6. Cek kosong"); 
            System.out.println("7. Tampilkan");
 
            int choice = scan.nextInt();            
            switch (choice){
            case 1 : 
                System.out.println("inputkan angka");
                bst.insert( scan.nextInt());                     
                break;                          
            case 2 : 
                System.out.println("inputan yang akan dihapus");
                bst.delete( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("inputan angka yang dicari");
                int a = scan.nextInt();
                System.out.println("Hasil : ");
                bst.searchPaths(a);
                break;                                          
            case 4 : 
                System.out.println("Banyak Node = "+ bst.countNodes());
                break;
            case 5 : 
                System.out.println("Banyak Leaf = "+ bst.getLeafCount());
                break;
            case 6 :  
                System.out.println("Empty status = "+ bst.isEmpty());
                break;     
            case 7: 
                bst.printPath();
                System.out.print("\nPost order : ");
                bst.postorder();
                System.out.print("\nPre order : ");
                bst.preorder();
                System.out.print("\nIn order : ");
                bst.inorder();
                break;
            default : 
                System.out.println("masukkan angka 1-7");
                break;   
            } 
            System.out.println("\nlanjut? (Type y or n)\n");
            ch = scan.next().toLowerCase().charAt(0);                        
        } while (ch == 'y');               
    }
 }