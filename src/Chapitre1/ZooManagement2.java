package Chapitre1;

// Instruction 2 + Instruction 3

import java.util.Scanner;


public class ZooManagement2 {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();


        System.out.print("Entrez le nom du zoo : ");
        String inputZooName = scanner.nextLine();
        while (inputZooName.trim().isEmpty()) {
            System.out.print("Erreur : Le nom ne peut pas être vide. Réessayez : ");
            inputZooName = scanner.nextLine();
        }
        zoo.zooName = inputZooName;


        System.out.print("Entrez le nombre de cages : ");
        int inputNbrCages = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                inputNbrCages = scanner.nextInt();
                if (inputNbrCages > 0) {
                    break;
                } else {
                    System.out.print("Erreur : le nombre doit être positif. Réessayez : ");
                }
            } else {
                System.out.print("Erreur : entrez un entier valide. Réessayez : ");
                scanner.next();
            }
        }
        zoo.nbrCages = inputNbrCages;

        scanner.close();


        // Instruction 3

        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
    }
}
