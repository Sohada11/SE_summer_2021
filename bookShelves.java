package bookshelves;
import java.util.Scanner;
public class bookShelves{

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter number of Books on shelf1: ");
       int tBooks = sc.nextInt();
       
       
       String[] bookshelf1 = new String[tBooks];
       String[] bookshelf2 = new String[tBooks];
       System.out.println(tBooks);
       
        int countMatch = 0;
       for(int i=0; i<tBooks; i++){
           System.out.print("Books in shelf1: ");
           bookshelf1[i] = sc.next();
           System.out.print("Books in shelf2: ");
           bookshelf2[i] = sc.next();
        }
       
       for(int i=0; i<tBooks; i++){
           for(int j = 0; j<tBooks; j++){
               if(bookshelf1[i].equals(bookshelf2[j]))
               countMatch = countMatch + 1;
           }
       }
       System.out.println("Total Match: " + countMatch);
    }
    
}
