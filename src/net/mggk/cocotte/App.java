package net.mggk.cocotte;

import java.util.Scanner;

/**
 * Projet : Cocotte / Package : net.mggk.cocotte / Guillaume "mggk" Arino 2014
 */
public class App {
    public static void main (String args[]){
        boolean exitApp = false;
        boolean bonneCouleur;
        String reponseCouleur;
        int nombreChoisi;
        String[] tabBleu = {"Tu bosse autant que Rudy (sale branleur)", "Le JAVA c'est caca", "SEGA c'est plus fort que toi"};
        String[] tabRouge = {"Ceci est une révolution, t'est un putain de pigeon mon pote", "Never gonna give you up","Narwhales Narwhales swiming in the ocean"};
        String[] tabVert = {"Look at my horse, my horse is amazing", "WOW MUCH COCOTTE !", "WHAT DOES THE FOX SAYS ?!"};
        String[] tabOrange = {"Winter is Coming", "Say my Name", "CAAAAAAAAAAAAAAAAAAAAAAAARL !"};

        System.out.println("Bonjour mon enfant, joue donc à cette superbe Cocotte électronique !");
        while(!exitApp) {
            bonneCouleur = false;
            System.out.println("Choisi une couleur entre : Bleu / Rouge / Vert / Orange (ou entre q pour quitter le programme)");
            Scanner sc = new Scanner(System.in);
            reponseCouleur = sc.nextLine();
            reponseCouleur = reponseCouleur.toLowerCase();
            if (reponseCouleur.equals("bleu") || reponseCouleur.equals("rouge") || reponseCouleur.equals("vert")|| reponseCouleur.equals("orange")) {
                bonneCouleur = true;
            }else if(reponseCouleur.equals(("q"))){
                exitApp = true;
                System.exit(0);
            }else{
                System.out.println("La couleur : "+reponseCouleur+" n'existe pas dans ce programme petit con !");
            }
            if(bonneCouleur){
                System.out.println("Choisi un chiffre entre 1 et 3 (compris)");
                nombreChoisi = sc.nextInt();
                if(nombreChoisi > 0 && nombreChoisi < 4){
                    if(reponseCouleur.equals(("bleu"))){
                        System.out.println("La cocotte à choisi : "+tabBleu[nombreChoisi-1]);
                    }else if(reponseCouleur.equals(("rouge"))){
                        System.out.println("La cocotte à choisi : "+tabRouge[nombreChoisi-1]);
                    }else if(reponseCouleur.equals(("vert"))){
                        System.out.println("La cocotte à choisi : "+tabVert[nombreChoisi-1]);
                    }else if(reponseCouleur.equals(("orange"))){
                        System.out.println("La cocotte à choisi : "+tabOrange[nombreChoisi-1]);
                    }
                }
            }
        }
    }
}
