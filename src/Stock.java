public class Stock {
    private Ordinateur[] liste;
    private int nbOrdinateurs;

    public Stock(int taille) {
        liste = new Ordinateur[taille];
        nbOrdinateurs = 0;
    }

    public void ajouterOrdinateur(Ordinateur o) {
        if (nbOrdinateurs < liste.length) {
            liste[nbOrdinateurs] = o;
            nbOrdinateurs++;
        } else {
            System.out.println("Stock plein, impossible d'ajouter.");
        }
    }

    public void afficherStock() {
        if (nbOrdinateurs == 0) {
            System.out.println("Stock vide.");
        } else {
            for (int i = 0; i < nbOrdinateurs; i++) {
                liste[i].afficher();
            }
        }
    }

    public Ordinateur rechercherOrdinateur(String marque, String modele) {
        for (int i = 0; i < nbOrdinateurs; i++) {
            if (liste[i].getMarque().equalsIgnoreCase(marque) &&
                    liste[i].getModele().equalsIgnoreCase(modele)) { // Méthode pour inoger upcase lower case
                return liste[i];
            }
        }
        return null;
    }

    public void supprimerOrdinateur(String marque, String modele) {
        for (int i = 0; i < nbOrdinateurs; i++) {
            if (liste[i].getMarque().equalsIgnoreCase(marque) &&
                    liste[i].getModele().equalsIgnoreCase(modele)) {

                for (int j = i; j < nbOrdinateurs - 1; j++) {
                    liste[j] = liste[j + 1];
                }

                liste[nbOrdinateurs - 1] = null;
                nbOrdinateurs--;

                System.out.println("Ordinateur supprimé.");
                return;
            }
        }
        System.out.println("Ordinateur introuvable.");
    }
}

