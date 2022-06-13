import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String vubir;
        System.out.print("\n\n\nМеню:\n1. Виводить всі символи, які розташовані після першого символу \":\"\n2. підраховує кількість речень, що містять непарну кількість слів.\n Ваш вибір: ");
        vubir = scan.nextLine();
        switch (vubir){
            case "1":{dvokrapka(); break;}
            case "2":{neparnakst(); break;}
            default: {System.exit(0);}

        }

    }

    public static void dvokrapka(){
        Scanner scan = new Scanner(System.in);
        int k = 1;//для циклу
        String rech;
        while (k == 1) {
            System.out.print("Введіть речення:  ");
            rech = scan.nextLine();
            if (rech.length() == 0) {
                System.out.println("\nВи нічого не написали ви людина\n\n");
                continue;
            } else {

                for (int i = 0; i < rech.length(); i++) {

                    if (rech.charAt(i) == ':') {
                        if (i == rech.length() - 1) {
                            System.out.println("\nУ вашому реченні є 1 двокрапка і вона знаходиться у кінці тому тут нічого після неї немає!\n\n");
                            k = 2;
                            break;
                        } else {
                            System.out.print("Всі символи після двокрапки:  ");
                            for (int j = i + 1; j < rech.length(); j++) {
                                System.out.print(rech.charAt(j));
                            }
                            k = 2;
                            break;
                        }
                    }

                }

            }
        }
    }



    public static void neparnakst(){
        Scanner scan = new Scanner(System.in);
        String text;
        int kol_sliv=0;
        int pokaz_sliv=0;
        int l=1;
        while (l==1)
        {
            System.out.print("Введіть текст та окремте речення крапками:  ");
            text = scan.nextLine();
            if (text.length() == 0) {
                System.out.println("\nВи нічого не написали ви людина\n\n");
                continue;
            }
            else if((text.matches("(.*)\\."))){

                String[] tochka = text.split("\\.");

                for(int i=0;i<tochka.length;i++){
                    String dop0 = tochka[i];
                    String[] probel = dop0.split(" ");
                    kol_sliv=0;
                    for(int j = 0; j < probel.length; j++){

                        if(probel[j].matches("[a-zA-Zа-яА-Я](.*)")){
                            kol_sliv++;
                        }
                    }

                    if(kol_sliv>0 && kol_sliv % 2 != 0){
                        pokaz_sliv++;
                    }
                }


                if(pokaz_sliv == 0){
                    System.out.println("\n\nУ жодному реченні немає НЕпарної кількості слів!!!");
                    System.exit(0);
                }
                else {
                    System.out.println("\n\nК-ть речень в яких НЕпарна к-сть слів: "+ pokaz_sliv);
                    System.exit(0);
                }

            }

            else{
                System.out.println("Ви не дотримались вимог написаних вище тому програма не працює)");l=5;
            }
        }
    }
}
