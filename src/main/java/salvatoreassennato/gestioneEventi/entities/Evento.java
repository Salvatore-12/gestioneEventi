package salvatoreassennato.gestioneEventi.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;
@Getter
@Setter
@ToString
public class Evento {
    private UUID id;
    private String title;
    private String descrizione;
    private LocalDate localDate;
    private String luogo;
    private int numero_Di_Posti_Disponibili;



}
