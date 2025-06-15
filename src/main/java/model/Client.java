package model;

public abstract class Client {
        private String idClient;

        public Client(String idClient) {
            this.idClient = idClient;
        }

        public String getIdClient() {
            return idClient;
        }

        public abstract double getPriceProduct(TypeProduct type);
    }
