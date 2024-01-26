package salvatoreassennato.gestioneEventi.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;
@Entity
@Table(name="evento")
@Getter
@Setter
@ToString
public class Evento {
    @Id
    @GeneratedValue
    private UUID id;
    private String titolo;
    private String descrizione;
    private LocalDate data;
    private String luogo;
    private int numero_Di_Posti_Disponibili;
    @ManyToMany
    @JoinTable(name="evento-utente",
            joinColumns = @JoinColumn(name = "evento_id"),
            inverseJoinColumns = @JoinColumn(name = "utente_id")
    )
    private Set<Utente>partecipanti;



}
