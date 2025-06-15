package model;

public class Product {
        private TypeProduct type;
        private int quantity;

        public Product(TypeProduct type, int quantity) {
            this.type = type;
            this.quantity = quantity;
        }

        // Getters
        public TypeProduct getType() {
            return type;
        }

        public int getQuantity() {
            return quantity;
        }
    }