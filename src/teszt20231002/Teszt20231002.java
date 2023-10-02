package teszt20231002;

import java.util.Scanner;

public class Teszt20231002 {

    static String[] pakli = new String[22];

    public static void main(String[] args) {

        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();
            kever(melyik());
        }
        ezVolt();

    }

    private static int melyik() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Oszlop (1-3): ");
        int oszlop = sc.nextInt();
        return oszlop;
    }

    private static void kever(int melyik) {

        String masikTomb[] = new String[22];
        switch (melyik) {
            case 1:
                for (int i = 0; i < pakli.length; i++) {
                    masikTomb[i + 7] = pakli[20 - (i - 1) * 3];
                    masikTomb[i + 14] = pakli[19 - (i - 1) * 3];
                    masikTomb[i + 21] = pakli[21 - (i - 1) * 3];

                }
                break;
            case 2:
                for (int i = 0; i < pakli.length; i++) {
                    masikTomb[i + 7] = pakli[19 - (i - 1) * 3];
                    masikTomb[i + 14] = pakli[20 - (i - 1) * 3];
                    masikTomb[i + 21] = pakli[21 - (i - 1) * 3];

                }
                break;
            case 3:
                for (int i = 0; i < pakli.length; i++) {
                    masikTomb[i + 7] = pakli[20 - (i - 1) * 3];
                    masikTomb[i + 14] = pakli[21 - (i - 1) * 3];
                    masikTomb[i + 21] = pakli[19 - (i - 1) * 3];

                }
                break;

        }
        pakli = masikTomb;

    }

    private static void ezVolt() {
        System.out.println("A gondolt lap: " + pakli[11]);
    }

    private static void feltolt() {
        String szinek[] = {"Valami", "Pir", "Tök", "Makk"};
        String ertek[] = {"Ász", "Igen", "Kir", "VIII", "IX", "X", };

        for (int j = 0; j < pakli.length; j++) {
            int i = 0;
            for (String szin : szinek) {
                pakli[j] = szin + "_" + ertek[i];
                i++;
            }
        }

    }

    private static void kirak() {
        for (int i = 1; i < pakli.length; i++) {
            if (i % 3 == 0) {
                System.out.println(pakli[i] + "");
            } else {
                System.out.print(pakli[i] + "\t");
            }
        }

    }

}
