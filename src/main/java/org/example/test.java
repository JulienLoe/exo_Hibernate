package org.example;

import org.example.entities.Commande;
import org.example.entities.Commentaire;
import org.example.entities.Image;
import org.example.entities.Produit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.sql.Date;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        StandardServiceRegistry registre = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();

//        session.getTransaction().begin();

//        Produit pr1 = new Produit();
//        pr1.setMarque("Toyota");
//        pr1.setReference("Voiture");
//        pr1.setDate( Date.valueOf("2012-12-12"));
//        pr1.setPrix(4999.99);
//        pr1.setStock(10);
//
//        Produit pr2 = new Produit();
//        pr2.setMarque("Lexus");
//        pr2.setReference("Voiture");
//        pr2.setDate( Date.valueOf("2014-12-14"));
//        pr2.setPrix(6999.99);
//        pr2.setStock(2);
//
//        Produit pr3 = new Produit();
//        pr3.setMarque("Dacia");
//        pr3.setReference("Voiture");
//        pr3.setDate( Date.valueOf("2018-11-22"));
//        pr3.setPrix(8999.99);
//        pr3.setStock(8);
//
//        Produit pr4 = new Produit();
//        pr4.setMarque("BMW");
//        pr4.setReference("Voiture");
//        pr4.setDate( Date.valueOf("2019-12-12"));
//        pr4.setPrix(9999.99);
//        pr4.setStock(6);
//
//        Produit pr5 = new Produit();
//        pr5.setMarque("Opel");
//        pr5.setReference("Voiture");
//        pr5.setDate(Date.valueOf("2004-04-12"));
//        pr5.setPrix(4999.99);
//        pr5.setStock(4);
//
//        session.save(pr1);
//        session.save(pr2);
//        session.save(pr3);
//        session.save(pr4);
//        session.save(pr5);

//        Produit pr = session.load(Produit.class, 2);
//        System.out.println(pr.getMarque());
//        System.out.println(pr.getReference());
//        System.out.println(pr.getPrix());
//        System.out.println(pr.getDate());
//        System.out.println(pr.getStock());


//        Produit prDelete = session.load(Produit.class, 3);
//
//
//        session.delete(prDelete);
//
//        Produit prUpdate = session.load(Produit.class, 1);
//
//        prUpdate.setMarque("Renault");
//        session.update(prUpdate);
//
//
//
//        session.getTransaction().commit();

//        Query<Produit> personneQuery = session.createQuery("from Produit");
//
//        System.out.println("################ List");
//        // avec la liste
//        List<Produit> produits = personneQuery.list();
//        for (Produit p: produits) {
//            System.out.println(p.getMarque());
//        System.out.println(p.getReference());
//        System.out.println(p.getPrix());
//        System.out.println(p.getDate());
//        System.out.println(p.getStock());
//
//            System.out.println("###################");
//
//        }

//        System.out.println("################ Filtre produits dont le prix est supérieur à 100 euros");
//        // Une requete avec filtre pour récupérer une liste
//        Query<Produit> produitQuery1 = session.createQuery("from Produit where prix > 100 ");
//        // Récupérer une liste avec les personnes dont le nom est toto
//        List<Produit> produitList = produitQuery1.list();
//        for (Produit p: produitList) {
//            System.out.println(p.getMarque());
//            System.out.println(p.getReference());
//            System.out.println(p.getPrix());
//            System.out.println(p.getDate());
//            System.out.println(p.getStock());
//
//            System.out.println("###################");
//        }

//        System.out.println("################ Afficher la liste des produits achetés entre deux dates");
//        // Une requete avec filtre pour récupérer une liste
//        Query<Produit> produitQuery1 = session.createQuery("from Produit where date > '2004-12-12' AND date < '2016-01-01' ");
//        // Récupérer une liste avec les personnes dont le nom est toto
//        List<Produit> produitList = produitQuery1.list();
//        for (Produit p: produitList) {
//            System.out.println(p.getMarque());
//            System.out.println(p.getReference());
//            System.out.println(p.getPrix());
//            System.out.println(p.getDate());
//            System.out.println(p.getStock());
//
//            System.out.println("###################");
//        }
//        session.close();;
//        sessionFactory.close();



//        System.out.println("################ Afficher la liste des produits commandés entre deux dates lus au clavier.");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Date de début : ");
//        String dateStart = scanner.nextLine();
//        System.out.println("Date de fin :");
//        String dateFinish = scanner.nextLine();
//
//        // Une requete avec filtre pour récupérer une liste
//        Query<Produit> produitQuery1 = session.createQuery("from Produit where date > :dateStart AND date < :dateFinish ");
//        produitQuery1.setParameter("dateStart", Date.valueOf(dateStart));
//        produitQuery1.setParameter("dateFinish", Date.valueOf(dateFinish));
//        // Récupérer une liste avec les personnes dont le nom est toto
//        List<Produit> produitList = produitQuery1.list();
//        for (Produit p: produitList) {
//            System.out.println(p.getMarque());
//            System.out.println(p.getReference());
//            System.out.println(p.getPrix());
//            System.out.println(p.getDate());
//            System.out.println(p.getStock());
//
//            System.out.println("###################");
//        }



//        System.out.println("################ retourner les numéros et reference des articles dont le stock est inférieur à une valeur lue au clavier.");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nombre en stock : ");
//        int nbStock = scanner.nextInt();
//
//        // Une requete avec filtre pour récupérer une liste
//        Query<Produit> produitQuery1 = session.createQuery("from Produit where stock < :nbStock");
//        produitQuery1.setParameter("nbStock", nbStock);
//        // Récupérer une liste avec les personnes dont le nom est toto
//        List<Produit> produitList = produitQuery1.list();
//        for (Produit p: produitList) {
//            System.out.println(p.getMarque());
//            System.out.println(p.getReference());
//            System.out.println(p.getPrix());
//            System.out.println(p.getDate());
//            System.out.println(p.getStock());
//
//            System.out.println("###################");



//        System.out.println("Afficher la valeur du stock des produits d'une marque choisie.");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Marque : ");
//        String marque = scanner.nextLine();
//
//        // Une requete avec filtre pour récupérer une liste
//        Query<Double> produitQuery1 = session.createQuery("select sum(prix) from Produit where marque = :marque ");
//        produitQuery1.setParameter("marque", marque);
//        // Récupérer une liste avec les personnes dont le nom est toto
//        Double sumPrice = produitQuery1.uniqueResult();
//        System.out.println("Somme des prix pour une marque :");
//        System.out.println(sumPrice);
//
//            System.out.println("###################");


//
//        System.out.println("Calculer le prix moyen des produits.");
//
//
//        // Une requete avec filtre pour récupérer une liste
//        Query<Double> produitQuery1 = session.createQuery("select avg(prix) from Produit ");
//        // Récupérer une liste avec les personnes dont le nom est toto
//        Double avgPrice = produitQuery1.uniqueResult();
//        System.out.println("Prix moyen des produits :");
//        System.out.println(avgPrice);
//
//            System.out.println("###################");



//        System.out.println("Récupérer la liste des produits d'une marque choisie.");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Marque : ");
//        String marque = scanner.nextLine();
//
//        // Une requete avec filtre pour récupérer une liste
//        Query<Produit> produitQuery1 = session.createQuery("from Produit where marque = :marque ");
//        produitQuery1.setParameter("marque", marque);
//        // Récupérer une liste avec les personnes dont le nom est toto
//        List<Produit> produitList = produitQuery1.list();
//        for (Produit p: produitList) {
//            System.out.println(p.getMarque());
//            System.out.println(p.getReference());
//            System.out.println(p.getPrix());
//            System.out.println(p.getDate());
//            System.out.println(p.getStock());
//
//            System.out.println("###################");
//        }

//        Transaction transaction = session.getTransaction();
//        transaction.begin();
//
//        System.out.println("Supprimer les produits d'une marque choisie de la table produit.");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Marque : ");
//        String marque = scanner.nextLine();
//
//        Query<Produit> produitQuery1 = session.createQuery("from Produit where marque = :marque ");
//        produitQuery1.setParameter("marque", marque);
//        // Récupérer une liste avec les personnes dont le nom est toto
//        List<Produit> produitList = produitQuery1.list();
//        for (Produit p: produitList) {
//            //En lazy c'est uniquement au moment de la récuperation de l'entreprise qu'on recupere les informations
//            session.delete(p);
//
//            }
//
//
//        transaction.commit();

//        System.out.println("Ajouter la possibilité d'ajouter une image à un produit.");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ID du produit pour ajouter une image :");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Ajouter une URL :");
//        String url = scanner.nextLine();
//        Produit produit = session.get(Produit.class,id);
//
//        Image image = new Image();
//        image.setUrl(url);
//        image.setProduit(produit);
//        session.save(image);
//
//        produit.setImages(image);
//
//
//        session.update(produit);



//        System.out.println("Ajouter la possibilité d'ajouter un commentaire à un produit.");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ID du produit pour ajouter un commentaire :");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Ajouter un contenu :");
//        String contenu = scanner.nextLine();
//        System.out.println("Ajouter une date :");
//        String date = scanner.nextLine();
//        System.out.println("Ajouter une note :");
//        int note = scanner.nextInt();
//
//        Produit produit = session.get(Produit.class,id);
//
//        Commentaire commentaire1 = new Commentaire();
//        commentaire1.setContenu(contenu);
//        commentaire1.setDate(Date.valueOf(date));
//        commentaire1.setNote(note);
//        commentaire1.setProduit(produit);
//        session.save(commentaire1);
//
//        produit.setCommentaires(commentaire1);
//
//
//        session.update(produit);



//        System.out.println("Afficher les produits ave une note de 4 ou plus.");
//
//        // Une requete avec filtre pour récupérer une liste
//        Query<Commentaire> produitQuery1 = session.createQuery("from Commentaire where note >= 4");
//        // Récupérer une liste avec les personnes dont le nom est toto
//        List<Commentaire> produitList = produitQuery1.list();
//        for (Commentaire p: produitList) {
//            System.out.println(p.getContenu());
//            System.out.println(p.getDate());
//            System.out.println(p.getNote());
//
//            System.out.println("###################");
//        }

        System.out.println("Ajouter la possibilité de créer une commande avec un ou plusieurs produits.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID du produit à ajouter :");
        int id = scanner.nextInt();
        scanner.nextLine();


        Produit produit = session.get(Produit.class,id);

        Commande commande = new Commande();
        commande.setProduits(produit);

        session.save(commande);




        session.update(produit);

//        session.close();;
//        sessionFactory.close();
    }

}
