package org.example.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Double total;
    private Date date;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL)
    private Set<Produit> produits = new HashSet<Produit>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Produit produit) {
        produits.add(produit);
    }


}
