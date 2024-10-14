/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.classes.Categorie;
import ma.projet.classes.Commande;
import ma.projet.classes.LigneCommandeProduit;
import ma.projet.classes.LigneCommandeProduitPk;
import ma.projet.classes.Produit;
import ma.projet.services.CategorieService;
import ma.projet.services.CommandeService;
import ma.projet.services.LigneCommandeProduitService;
import ma.projet.services.ProduitService;

/**
 *
 * @author Youness
 */

public class Test {
    
    public static void main(String[] args) {
        
        CategorieService cs = new CategorieService();
        CommandeService cmndS = new CommandeService();
        LigneCommandeProduitService lcpS = new LigneCommandeProduitService();
        ProduitService ps = new ProduitService();
        
        cs.create(new Categorie("c1", "cc1"));
        cs.create(new Categorie("c2", "cc2"));
        cs.create(new Categorie("c3", "cc3"));
        
        cmndS.create(new Commande(new Date()));
        cmndS.create(new Commande(new Date("2003/06/05")));
        cmndS.create(new Commande(new Date("2002/08/13")));
        
        
        System.out.println("\nles produit du categorie 2:\n"+ps.findByCategorie(cs.findById(2)));
        
        Commande c = cmndS.findById(1);
         Produit p1 = ps.findById(1);
         Produit p2 = ps.findById(2);
         lcpS.create(new LigneCommandeProduit(new LigneCommandeProduitPk(p1.getId(), c.getId()),10));
         lcpS.create(new LigneCommandeProduit(new LigneCommandeProduitPk(p2.getId(), c.getId()), 2000));
         
         
         
        ps.findProduitByCommande(cmndS.findById(1));
        
        
        ps.create(new Produit("p1", "ppp1", new Date("2002/02/02"), 1000, "d", cs.findById(1)));
        ps.create(new Produit("p2", "ppp2", new Date(), 1500, "d", cs.findById(1)));
        ps.create(new Produit("p2", "ppp3", new Date("2002/02/02"), 1700, "d", cs.findById(1)));
        ps.create(new Produit("p4", "ppp4", new Date(), 900, "m", cs.findById(2)));
    
    
    
    }
    
}
