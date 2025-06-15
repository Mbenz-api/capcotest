package model;

public class ClientPro extends Client{
        private String raisonSociale;
        private String numeroTVA;
        private String siren;
        private double chiffreAffairesAnnuel;

        public ClientPro(String idClient, String raisonSociale, String siren, double chiffreAffairesAnnuel) {
            this(idClient, raisonSociale, null, siren, chiffreAffairesAnnuel);
        }

        public ClientPro(String idClient, String raisonSociale, String numeroTVA, String siren, double chiffreAffairesAnnuel) {
            super(idClient);
            this.raisonSociale = raisonSociale;
            this.numeroTVA = numeroTVA;
            this.siren = siren;
            this.chiffreAffairesAnnuel = chiffreAffairesAnnuel;
        }

        @Override
        public double getPriceProduct(TypeProduct type) {
            boolean chiffreAffairesEleve = chiffreAffairesAnnuel > 10_000_000;

            return switch (type) {
                case TELEPHONE_HAUT_GAMME -> chiffreAffairesEleve ? 1000 : 1150;
                case TELEPHONE_MILIEU_GAMME -> chiffreAffairesEleve ? 550 : 600;
                case ORDINATEUR_PORTABLE -> chiffreAffairesEleve ? 900 : 1000;
            };
        }

        // Getters
        public String getRaisonSociale() {
            return raisonSociale;
        }

        public String getNumeroTVA() {
            return numeroTVA;
        }

        public String getSiren() {
            return siren;
        }

        public double getChiffreAffairesAnnuel() {
            return chiffreAffairesAnnuel;
        }
    }