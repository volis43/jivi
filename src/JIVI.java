import java.util.Scanner;

import java.util.Scanner;
public class JIVI {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String str = name.nextLine();
        System.out.println("Привет\t"+str);
        System.out.println("Какого года рождения?");
        int yu = 2023;
        String myString = name.nextLine();
        int foo = Integer.parseInt(myString);
        System.out.println("В 2023 году вам будет:");
        System.out.println(yu - foo+("\tлет"));
    }
}

//        простите за бардак (─‿‿─)

//        System.out.println("hell");
//        System.out.println("hola");
//        System.out.println("hy");
//        System.out.println("Guts\n\t\t\t\t\tGriffith");
//        int nn = 66;
//        int aj = 3;
//        System.out.print(nn+aj);
//        byte h = 99;
//        byte p = 127;
//        System.out.println(h+p);
//        short f = 9999;
//        System.out.println(f);
//        float lol = 9.093f;
//        double lfofg = 9.9883d;
//        char tel = '&';
//        String jeje = "rtohj";
//        System.out.println(jeje);


