package model;

public class ClientParticulier extends Client{
        private String nom;
        private String prenom;

        public ClientParticulier(String idClient, String nom, String prenom) {
            super(idClient);
            this.nom = nom;
            this.prenom = prenom;
        }

        @Override
        public double getPriceProduct(TypeProduct type) {
            return switch (type) {
                case TELEPHONE_HAUT_GAMME -> 1500;
                case TELEPHONE_MILIEU_GAMME -> 800;
                case ORDINATEUR_PORTABLE -> 1200;
            };
        }

        // Getters
        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }
    }
