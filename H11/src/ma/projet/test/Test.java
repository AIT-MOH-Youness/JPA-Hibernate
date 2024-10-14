/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;

/**
 *
 * @author Youness
 */
public class Test {

    public static void main(String[] args) {

        
        ProduitService ps = new ProduitService();

        // creation des produit
        Produit p1 = new Produit("Mp1", "r1", new Date(102, 2, 2), 50, "dest1");
        Produit p2 = new Produit("Mp2", "r2", new Date(2002, 2, 2), 50, "dest2");
        Produit p3 = new Produit("Mp3", "r3", new Date(2016, 7, 20), 1300, "dest3");
        Produit p4 = new Produit("Mp4", "r4", new Date(2020, 12, 12), 150, "dest4");
        Produit p5 = new Produit("Mp5", "r5", new Date(2000, 4, 18), 300, "dest5");

        ps.create(p1);
        ps.create(p2);
        ps.create(p3);
        ps.create(p4);
        ps.create(p5);

        // affichage de tous les produits
        System.out.println("\n******affichage des produits*****\n");
        int s = 1;
        for (Produit p : ps.findAll(null)) {
            System.out.println("Produit " + String.valueOf(s) + ": " + p.getMarque());
        }

        // details du produit 2
        System.out.println("\n*****affichage des infos du produit 2******\n");
        System.out.println("Margue: " + ps.findById(2).getMarque());
        System.out.println("Referenc: " + ps.findById(2).getReference());
        System.out.println("DateAchat: " + ps.findById(2).getDateAchat());
        System.out.println("Prix: " + ps.findById(2).getPrix());
        System.out.println("Designation: " + ps.findById(2).getDesignation());

        // supprimer le produit 3
        ps.delete(ps.findById(3));

        // modifier les info du produit 1
        ps.findById(1).setDesignation("updated Destin 1");
        ps.update(ps.findById(1));

        
        
        //list des produits avec un prix superieur a 100
        System.out.println("\n*****liste produit avec un prix superieur a 100*******\n");

        for (Produit p : ps.findAll(null)) {
            if (p.getPrix() > 100) {
                System.out.println(p.getMarque());
            }
        }

        //La liste des produits Commander entre deux dates lus au clavier
        System.out.println("\nLa liste des produits commander entre 01/03/2023 et 01/08/2023\n");
        Date minDate = new Date(2023, 4, 1);
        Date maxDate = new Date(2024, 9, 1);

        for (Produit p : ps.findAll(null)) {
            if ((maxDate.compareTo(p.getDateAchat()) == 1 || maxDate.compareTo(p.getDateAchat()) == 0)
                    && (minDate.compareTo(p.getDateAchat()) == -1 || minDate.compareTo(p.getDateAchat()) == 0)) {
                System.out.println(p.getMarque() + ", " + p.getDateAchat());
            }
        }

    }

}
