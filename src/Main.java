import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] str) throws FileNotFoundException {
        String[] docs = new String[10];
        String[] pathnames = new String[10];
        for (int i = 0; i<10;  i++){
            docs[i] = "";
            pathnames[i] = ("" + i + ".txt");
            Scanner sc = new Scanner(new File(pathnames[i]));
            while (sc.hasNext()){
                docs[i] = docs[i]+ " " + sc.nextLine();
            }
            System.out.print("\n" + i + ": "+ docs[i]);
        }
        Scanner sc = new Scanner(System.in);
        String lecsema = "";
        do{
        System.out.print("\n");
        lecsema = sc.nextLine();
        System.out.print(lecsema + " -> ");
        for (int i = 0; i<10; i++){
            if (docs[i].contains(lecsema)){
                System.out.print(i + " ");
            }
        }
        }while (!lecsema.equals("Стоп"));
    }
}



