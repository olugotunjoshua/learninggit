package myPrograms;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        CurrencyConverter curr = new CurrencyConverter();

        Scanner sc = new Scanner(System.in);
        System.out.println("******BigJoeTech Currency Converter*****");

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("welcome " + name + " which currency would you love to convert");



            System.out.print("Enter value in naira:\t");
            double naira = sc.nextDouble();

            System.out.println("choses from the options below to convert money: ");
            String currencies[] = {"Usd", "GBP", "Inr", "CAD", "Naira", "SAR"};
            int n = 0;

            for (int i = 0; i < currencies.length; i++) {
                n++;
                System.out.println(n + ")" + currencies[i]);
            }

            int option = sc.nextInt();
            do {
                switch (option) {

                    case 1:
                        double usd = naira / 450.0;
                        System.out.println("Naira in USD is " + usd);
                        break;
                    case 2:
                        double Gbp = naira / 500;
                        System.out.println("Naira in GPB is " + Gbp);
                        break;
                    case 3:
                        double Inr = naira / 5.5;
                        System.out.println("Naira in GPB is " + Inr);
                        break;
                    case 4:
                        double CAD = naira / 360;
                        System.out.println("Naira in GPB is " + CAD);
                        break;
                    case 5:
                        double Nair = naira / 1;
                        System.out.println("Naira in GPB is " + naira);
                        break;
                    case 6:
                        double SAR = naira / 27;
                        System.out.println("Naira in GPB is " + SAR);
                        break;
                    default:
                        System.out.println("not part of the list");
                        break;
                }

            } while (option > 1);

        int choice;
    System.out.println("thanks for using  the platform :");
        System.out.println("would you like to perform another operation:");
        System.out.println("1Yes\n" +
                "2)No :");



}


    }

