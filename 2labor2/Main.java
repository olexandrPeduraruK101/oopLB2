import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int l = -1;
        int[] a = new int[10];
        try {
            BufferedReader br = new BufferedReader(new FileReader("RahunokSumvols.txt"));
            String s = "";
            while ((s = br.readLine()) != null) {
                l++;
                String[] data = s.split("\n");
                for (int i = 0; i < data.length;  i++)
                {
                    System.out.print(data[i] + " ");
                }
                a[l] = data[0].length();
                System.out.println();
            }

        } catch (Exception e) {

        }


        System.out.println("\n");
        for(int i = 0; i<a.length;i++){
            System.out.println("Рядок "+ (i+1) +":  "+a[i]);
        }
    }
    }


