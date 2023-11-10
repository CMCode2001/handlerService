package com.gestionEvent.handlerService.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.gestionEvent.handlerService.entity.Evenement;

import java.util.List;

import java.util.Date;

public interface EvenementRepository extends  CrudRepository <Evenement, Integer> {

    // Méthode pour rechercher des événements par type
    List<Evenement> findByTypeEvenement(String typeEvenement);

    // Méthode pour rechercher des événements par lieu
    List<Evenement> findByLieu(String lieu);

    // Méthode pour rechercher des événements par budget inférieur à une valeur donnée
    List<Evenement> findByBudgetLessThan(Double budget);

    // Méthode pour rechercher des événements par date de début
    List<Evenement> findByDateDebut(Date dateDebut);

    // Méthode pour rechercher des événements par date de fin
    List<Evenement> findByDateFin(Date dateFin);

    // Méthode de requête personnalisée pour rechercher des événements entre deux dates spécifiques
    @Query("SELECT e FROM Evenement e WHERE e.dateEvenement >= :startDate AND e.dateEvenement <= :endDate")
    List<Evenement> findEventsBetweenDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    // Méthode pour rechercher des événements par description
    List<Evenement> findByDescription(String description);

    // Méthode pour rechercher des événements par service requis
    List<Evenement> findByServiceRequis(String serviceRequis);

    // Vous pouvez ajouter d'autres méthodes de requête personnalisées si nécessaire
}