package salvatoreassennato.gestioneEventi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import salvatoreassennato.gestioneEventi.entities.Utente;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface UtentiDAO extends JpaRepository<Utente, UUID> {
    Optional<Utente> findByEmail(String email);
}
