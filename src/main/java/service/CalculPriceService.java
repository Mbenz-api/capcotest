package service;

import model.Client;
import model.Panel;
import model.Product;

public class CalculPriceService {
        public double calculerPrixTotal(Panel panier) {
            Client client = panier.getClient();
            double total = 0;

            for (Product produit : panier.getProduits()) {
                double prixUnitaire = client.getPriceProduct(produit.getType());
                total += prixUnitaire * produit.getQuantity();
            }

            return total;
        }
    }