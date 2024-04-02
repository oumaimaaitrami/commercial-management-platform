package com.platform.gestioncommerciale.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_facture;

    @Column
    private Date date_facture;

    @Column
    private String mode_de_paimenet;

    @Column
    private Float montant_facture;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Utilisateur utilisateur_facture;
    @ManyToOne
    @JoinColumn(name="id_client")
    private Client client;


    @ManyToMany
    @JoinTable(name="Facture_Produit")
    private List<Produit> produits;

    public Facture() {
    }

    public Facture(Long id_facture, Date date_facture, String mode_de_paimenet, Float montant_facture) {
        this.id_facture = id_facture;
        this.date_facture = date_facture;
        this.mode_de_paimenet = mode_de_paimenet;
        this.montant_facture = montant_facture;
    }

    public Facture(Date date_facture, String mode_de_paimenet, Float montant_facture) {
        this.date_facture = date_facture;
        this.mode_de_paimenet = mode_de_paimenet;
        this.montant_facture = montant_facture;
    }

    public Long getId_facture() {
        return id_facture;
    }

    public void setId_facture(Long id_facture) {
        this.id_facture = id_facture;
    }

    public Date getDate_facture() {
        return date_facture;
    }

    public void setDate_facture(Date date_facture) {
        this.date_facture = date_facture;
    }

    public String getMode_de_paimenet() {
        return mode_de_paimenet;
    }

    public void setMode_de_paimenet(String mode_de_paimenet) {
        this.mode_de_paimenet = mode_de_paimenet;
    }

    public Float getMontant_facture() {
        return montant_facture;
    }

    public void setMontant_facture(Float montant_facture) {
        this.montant_facture = montant_facture;
    }

    public Utilisateur getUtilisateur_facture() {
        return utilisateur_facture;
    }

    public void setUtilisateur_facture(Utilisateur utilisateur_facture) {
        this.utilisateur_facture = utilisateur_facture;
    }
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "id_facture=" + id_facture +
                ", date_facture=" + date_facture +
                ", mode_de_paimenet='" + mode_de_paimenet + '\'' +
                ", montant_facture=" + montant_facture +
                '}';
    }
}
