package com.gestionEvent.handlerService.entity;

import java.util.Date;
//import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;

@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date dateEvenement;
    private String typeEvenement;
    private String lieu;
    private String description;
    private String serviceRequis;
    private Double budget;
    private Date dateDebut; // Ajout de l'attribut date de début
    private Date dateFin;   // Ajout de l'attribut date de fin


    public Evenement() {}; //Constructeur par defaut

    public Evenement(Integer id, Date dateEvenement, String typeEvenement, String lieu, String description,
            String serviceRequis, Double budget, Date dateDebut, Date dateFin) {
        this.id = id;
        this.dateEvenement = dateEvenement;
        this.typeEvenement = typeEvenement;
        this.lieu = lieu;
        this.description = description;
        this.serviceRequis = serviceRequis;
        this.budget = budget;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

//-------------Gerer les relation entre les tables  

/*  Ajoutez une relation Many-to-One vers la classe client
@ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
 
*/  

/*  Ajoutez une relation Many-to-One vers la classe Prestataires
        
        @ManyToOne
        @JoinColumn(name = "prestataire_id") // Nom de la colonne de clé étrangère dans la table Evenement
        private Prestataire prestataire; // La relation avec Prestataire
        // Getter et Setter pour la relation avec Prestataire
        public Prestataire getPrestataire() {
            return prestataire;
        }
        public void setPrestataire(Prestataire prestataire) {
            this.prestataire = prestataire;
        }
*/

 // Getter et Setter pour les attributs

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateEvenement() {
        return dateEvenement;
    }

    public void setDateEvenement(Date dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

    public String getTypeEvenement() {
        return typeEvenement;
    }

    public void setTypeEvenement(String typeEvenement) {
        this.typeEvenement = typeEvenement;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceRequis() {
        return serviceRequis;
    }

    public void setServiceRequis(String serviceRequis) {
        this.serviceRequis = serviceRequis;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
} 