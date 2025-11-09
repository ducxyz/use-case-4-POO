public class TestStock {
    public static void main(String[] args) {

        Stock stock = new Stock(5);

        Ordinateur o1 = new Ordinateur("Dell", "XPS13", "Intel i7", 16, 512);
        Ordinateur o2 = new Ordinateur("HP", "Pavilion", "Intel i5", 8, 256);
        Ordinateur o3 = new Ordinateur("Apple", "MacBook Air", "M1", 8, 256);

        stock.ajouterOrdinateur(o1);
        stock.ajouterOrdinateur(o2);
        stock.ajouterOrdinateur(o3);

        System.out.println("--- Stock initial ---");
        stock.afficherStock();

        System.out.println("\nRecherche Dell XPS13:");
        Ordinateur r = stock.rechercherOrdinateur("Dell", "XPS13");
        if (r != null) {
            r.afficher();
        } else {
            System.out.println("Non trouvé.");
        }

        System.out.println("\nSuppression HP Pavilion");
        stock.supprimerOrdinateur("HP", "Pavilion");

        System.out.println("\n--- Stock après suppression ---");
        stock.afficherStock();

    }
}

