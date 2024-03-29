public class TestCompte {
    public static void main(String[] args) {
        Compte c1 = new Compte("Yassmine", 1200);
        Compte c2 = new Compte("Oussema", 2100);

        System.out.println(c1);
        System.out.println(c2.getTitulaire());

        CompteEpargne c3 = new CompteEpargne("Houssem", 850, 0);

        /*
         * double montant = 1200;
         * if (c3.getSolde() < montant) {
         * System.out.println(x:"Solde insuffisant !");
         * } else {
         * c3.debiter(montant:1200);
         * }
         */

        try {
            c3.debiter(300);
            System.out.println(c3.getSolde());

        } catch (SoldeInsuffisantException e) {
            System.out.println(e);
        }

        System.out.println(c3);

        // System.out.println("------");

        // Banque BIAT = new Banque("BIAT");

        // System.out.println(nom: "BIAT");

        // biat.addCompte(c1);
        // biat.addCompte(c2);
        // biat.addCompte(c3);
    }
}