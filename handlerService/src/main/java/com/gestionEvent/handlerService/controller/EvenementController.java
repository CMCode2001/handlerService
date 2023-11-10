package com.gestionEvent.handlerService.controller;

import com.gestionEvent.handlerService.entity.Evenement;
import com.gestionEvent.handlerService.service.EvenementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evenements")
public class EvenementController {

    private final EvenementService evenementService;

    public EvenementController(EvenementService evenementService) {
        this.evenementService = evenementService;
    }

    @GetMapping("/tous")
    public List<Evenement> getAllEvenements() {
        return evenementService.getAllEvenements();
    }

    @GetMapping("/{id}")
    public Evenement getEvenementById(@PathVariable Integer id) {
        return evenementService.getEvenementById(id);
    }

    @PostMapping("/nouveau")
    public Evenement createEvenement(@RequestBody Evenement evenement) {
        return evenementService.createEvenement(evenement);
    }

    @PutMapping("/{id}")
    public Evenement updateEvenement(@PathVariable Integer id, @RequestBody Evenement evenement) {
        return evenementService.updateEvenement(id, evenement);
    }

    @DeleteMapping("/{id}")
    public void deleteEvenement(@PathVariable Integer id) {
        evenementService.deleteEvenement(id);
    }

    @GetMapping("/par-type/{typeEvenement}")
    public List<Evenement> getEvenementsByType(@PathVariable String typeEvenement) {
        return evenementService.getEvenementsByType(typeEvenement);
    }

    // Vous pouvez ajouter d'autres méthodes de recherche personnalisées ici
}