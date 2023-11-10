package com.gestionEvent.handlerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// Spécifie le package où se trouvent les entités à scanner
@EntityScan("com.gestionEvent.handlerService.entity")
// Active la configuration automatique des repositories JPA
@EnableJpaRepositories("com.gestionEvent.handlerService.repository")
// Annotation principale pour une application Spring Boot
@SpringBootApplication
public class HandlerServiceApplication {

    // Méthode principale pour lancer l'application Spring Boot
    public static void main(String[] args) {
        SpringApplication.run(HandlerServiceApplication.class, args);
    }

}