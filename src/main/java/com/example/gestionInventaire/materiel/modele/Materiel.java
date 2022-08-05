package com.example.gestionInventaire.materiel.modele;

import com.example.gestionInventaire.categorie.modele.Categorie;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Materiel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "materiel_id", nullable = false, updatable = false)
    private int id;
    private String nom;
    private String description;
    private String marque;

    @Column(name = "image_url")
    private String imgURL;

    private enum taille { petit, moyen, grand };

    @Column(name = "duree_location")
    private int dureeLocation;

    @Column(name = "cout_location")
    private double coutLocation;

    @Column(name = "cout_remplacement")
    private double coutRemplacement;


    @ManyToOne
    private Categorie categorieID;

    @Column(name = "udpated_at")
    private LocalDateTime update;

    public Materiel() {}

    public Materiel(String nom, String description, String marque,
                    String imgURL, int dureeLocation,
                    double coutLocation, double coutRemplacement,
                    Categorie categorieID, LocalDateTime update) {
        this.nom = nom;
        this.description = description;
        this.marque = marque;
        this.imgURL = imgURL;
        this.dureeLocation = dureeLocation;
        this.coutLocation = coutLocation;
        this.coutRemplacement = coutRemplacement;
        this.categorieID = categorieID;
        this.update = update;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public int getDureeLocation() {
        return dureeLocation;
    }

    public void setDureeLocation(int dureeLocation) {
        this.dureeLocation = dureeLocation;
    }

    public double getCoutLocation() {
        return coutLocation;
    }

    public void setCoutLocation(double coutLocation) {
        this.coutLocation = coutLocation;
    }

    public double getCoutRemplacement() {
        return coutRemplacement;
    }

    public void setCoutRemplacement(double coutRemplacement) {
        this.coutRemplacement = coutRemplacement;
    }

    public Categorie getCategorieID() {
        return categorieID;
    }

    public void setCategorieID(Categorie categorieID) {
        this.categorieID = categorieID;
    }


    public LocalDateTime getUpdate() {
        return update;
    }

    public void setUpdate(LocalDateTime update) {
        this.update = update;
    }


    @Override
    public String toString() {
        return "Materiel{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", marque='" + marque + '\'' +
                ", imgURL='" + imgURL + '\'' +
                ", dureeLocation=" + dureeLocation +
                ", coutLocation=" + coutLocation +
                ", coutRemplacement=" + coutRemplacement +
                //", categorieID=" + categorieID +
                ", update=" + update +
                '}';
    }
}
