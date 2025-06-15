package main;


import model.*;
import service.CalculPriceService;

public class Main {
        public static void main(String[] args) {
            // Création d'un client particulier
            ClientParticulier particulier = new ClientParticulier("CLI-001", "Dupont", "Jean");

            // Création d'un Panel pour le particulier
            Panel PanelParticulier = new Panel(particulier);
            PanelParticulier.ajouterProduit(new Product(TypeProduct.TELEPHONE_HAUT_GAMME, 2));
            PanelParticulier.ajouterProduit(new Product(TypeProduct.ORDINATEUR_PORTABLE, 1));

            // Création d'un client professionnel avec CA < 10M
            ClientPro proPetit = new ClientPro(
                    "CLI-PRO-001",
                    "Petite Entreprise",
                    "FR123456789",
                    "123456789",
                    5_000_000
            );

            Panel PanelProPetit = new Panel(proPetit);
            PanelProPetit.ajouterProduit(new Product(TypeProduct.TELEPHONE_MILIEU_GAMME, 3));
            PanelProPetit.ajouterProduit(new Product(TypeProduct.ORDINATEUR_PORTABLE, 2));

            // Création d'un client professionnel avec CA > 10M
            ClientPro proGrand = new ClientPro(
                    "CLI-PRO-002",
                    "Grande Entreprise",
                    "FR987654321",
                    "987654321",
                    15_000_000
            );

            Panel PanelProGrand = new Panel(proGrand);
            PanelProGrand.ajouterProduit(new Product(TypeProduct.TELEPHONE_HAUT_GAMME, 5));
            PanelProGrand.ajouterProduit(new Product(TypeProduct.TELEPHONE_MILIEU_GAMME, 10));

            // Calcul des prix
            CalculPriceService calculateur = new CalculPriceService();

            System.out.println("Total Panel particulier: " + calculateur.calculerPrixTotal(PanelParticulier) + "€");
            System.out.println("Total Panel petite entreprise: " + calculateur.calculerPrixTotal(PanelProPetit) + "€");
            System.out.println("Total Panel grande entreprise: " + calculateur.calculerPrixTotal(PanelProGrand) + "€");
        }
    }