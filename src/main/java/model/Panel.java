package model;

import java.util.ArrayList;
import java.util.List;

public class Panel {
        private Client client;
        private List<Product> products = new ArrayList<>();

        public Panel(Client client) {
            this.client = client;
        }

        public void ajouterProduit(Product produit) {
            products.add(produit);
        }

        public Client getClient() {
            return client;
        }

        public List<Product> getProduits() {
            return products;
        }
    }