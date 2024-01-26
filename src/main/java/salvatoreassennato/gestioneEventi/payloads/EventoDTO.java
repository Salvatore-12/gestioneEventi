package salvatoreassennato.gestioneEventi.payloads;

import java.time.LocalDate;

public record EventoDTO(String titolo, String descrizione, LocalDate data,String luogo,Integer numero_Di_Posti_Disponibili) {
}
