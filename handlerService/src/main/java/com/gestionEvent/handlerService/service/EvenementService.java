package com.gestionEvent.handlerService.service;
import com.gestionEvent.handlerService.entity.Evenement;
import com.gestionEvent.handlerService.repository.EvenementRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvenementService {

    private final EvenementRepository evenementRepository;

    public EvenementService(EvenementRepository evenementRepository) {
        this.evenementRepository = evenementRepository;
    }

    public List<Evenement> getAllEvenements() {
        Iterable<Evenement> evenementsIterable = evenementRepository.findAll();
        List<Evenement> evenementsList = new ArrayList<>();

        evenementsIterable.forEach(evenementsList::add);

        return evenementsList;
    }

    public Evenement getEvenementById(Integer id) {
        return evenementRepository.findById(id).orElse(null);
    }

    public Evenement createEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    public Evenement updateEvenement(Integer id, Evenement evenement) {
        if (evenementRepository.existsById(id)) {
            evenement.setId(id);
            return evenementRepository.save(evenement);
        }
        return null;
    }

    public void deleteEvenement(Integer id) {
        evenementRepository.deleteById(id);
    }

    public List<Evenement> getEvenementsByType(String typeEvenement) {
        return evenementRepository.findByTypeEvenement(typeEvenement);
    }

    // Vous pouvez ajouter d'autres méthodes de recherche personnalisées ici

}