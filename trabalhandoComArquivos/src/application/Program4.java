package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File f : folders) {
            System.out.println(f);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files");
        for (File f1 : files) {
            System.out.println(f1);
        }

        boolean success = new File(strPath + "\\subDir").mkdir();
        System.out.println("Ok" + success);
        sc.close();
    }
}
