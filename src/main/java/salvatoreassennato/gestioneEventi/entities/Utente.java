package salvatoreassennato.gestioneEventi.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import salvatoreassennato.gestioneEventi.Enum.RuoloUtente;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Utente {

    private UUID id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private RuoloUtente ruoloUtente;
}
