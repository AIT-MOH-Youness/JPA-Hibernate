/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Date;
import ma.projet.classes.Employe;
import ma.projet.classes.EmployeTache;
import ma.projet.classes.EmployeTachePK;
import ma.projet.classes.Projet;
import ma.projet.classes.Tache;
import ma.projet.service.EmployeService;
import ma.projet.service.EmployeTacheService;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] args) {
        
        
        
        ProjetService ps = new ProjetService();
        TacheService ts = new TacheService();
        EmployeService es = new EmployeService();
        EmployeTacheService ems = new EmployeTacheService();

        //Création des employe
        es.create(new Employe("Youness", "AIT MOH", "0655449988"));
        es.create(new Employe("Yoyo", "Momo", "0605040908"));

        //Création des projets
        ps.create(new Projet("Projet 1", new Date(2003, 3, 3), new Date(2005, 3, 3), es.getById(1)));
        ps.create(new Projet("Projet 2", new Date(2003, 3, 3), new Date(2006, 3, 3), es.getById(2)));

        //Création des Taches
        ts.create(new Tache("JEE", new Date(2002, 02, 02), new Date(2004, 02, 02), 1500, ps.getById(1)));
        ts.create(new Tache("Spring", new Date(2002, 02, 02), new Date(2004, 02, 02), 3500, ps.getById(1)));
        ts.create(new Tache("Java", new Date(2002, 02, 02), new Date(2004, 02, 02), 1500, ps.getById(1)));

        //Création des EmployeTache
        ems.create(new EmployeTache(new EmployeTachePK(3, 1, new Date(2002, 02, 02)), new Date(2004, 02, 02)));
        ems.create(new EmployeTache(new EmployeTachePK(3, 1, new Date(2002, 02, 02)), new Date(2004, 02, 02)));

        //Afficher les Taches d'un employe
        es.TachesByEmploye(es.getById(1));

        //Afficher les projets d'un employe
        es.ProjetByEmploye(es.getById(1));
        
        //Afficher les taches planifiés d'un projet
        ps.TPlanifiéByProjet(ps.getById(1));
        
        //Afficher les taches réalisé dans un projet
        ps.TRéaliséByProjet(ps.getById(1));
        
        //Afficher les taches ayant un prix supérieur à 1000 dh
        ts.TacheByPrix();
        
        //Afficher les taches réalisés entre deux dates
        ts.TacheByDate("2020/01/01", "2030/03/03");
    }
}
