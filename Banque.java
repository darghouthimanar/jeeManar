import java.util.ArrayList;
import java.util.List;

public class Banque {
    private String nom;
    private List<Compte> listCompte;

    public Banque(String nom) {
        this.nom = nom;
        this.listCompte = new ArrayList<Compte>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void addCompte(Compte c) {
        this.listCompte.add(c);
    }

    @Override
    public String toString() {
        return "Banque [nom=" + nom + ", listCompte=" + listCompte + "]";
    }
}
