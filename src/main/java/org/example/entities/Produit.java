package org.example.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String marque;
    private String reference;
    private Date date;
    private double prix;
    private int stock;

    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL)
    private Set<Image> images = new HashSet<Image>();

    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL)
    private Set<Commentaire> commentaires = new HashSet<Commentaire>();

    @ManyToOne
    @JoinColumn(name = "id_commande")
    private Commande commande;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Image image) {
        images.add(image);
    }

    public Set<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(Commentaire commentaire) {
        commentaires.add(commentaire);
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public void setCommentaires(Set<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
