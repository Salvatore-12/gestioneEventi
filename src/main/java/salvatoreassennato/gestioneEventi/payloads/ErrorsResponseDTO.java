package salvatoreassennato.gestioneEventi.payloads;

import java.util.Date;
import java.util.List;

public record ErrorsResponseDTO(String message,
                                Date timestamp,
                                List<String> errorsList) {
}
