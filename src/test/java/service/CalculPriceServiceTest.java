package service;


import model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculPriceServiceTest {
    @Test
    public void testCalculPrixParticulier() {
        Client client = new ClientParticulier("TEST-1", "Test", "User");
        Panel panier = new Panel(client);
        panier.ajouterProduit(new Product(TypeProduct.TELEPHONE_HAUT_GAMME, 1));
        panier.ajouterProduit(new Product(TypeProduct.ORDINATEUR_PORTABLE, 2));

        CalculPriceService service = new CalculPriceService();
        assertEquals(1500 + 1200 * 2, service.calculerPrixTotal(panier));
    }

    @Test
    public void testCalculPrixProCAEleve() {
        Client client = new ClientPro("TEST-PRO-1", "Big Corp", "FR123", "123456789", 15_000_000);
        Panel panier = new Panel(client);
        panier.ajouterProduit(new Product(TypeProduct.TELEPHONE_HAUT_GAMME, 2));

        CalculPriceService service = new CalculPriceService();
        assertEquals(1000 * 2, service.calculerPrixTotal(panier));
    }

    @Test
    public void testCalculPrixProCABas() {
        Client client = new ClientPro("TEST-PRO-2", "Small Corp", "FR456", "987654321", 5_000_000);
        Panel panier = new Panel(client);
        panier.ajouterProduit(new Product(TypeProduct.TELEPHONE_MILIEU_GAMME, 3));

        CalculPriceService service = new CalculPriceService();
        assertEquals(600 * 3, service.calculerPrixTotal(panier));
    }
}
