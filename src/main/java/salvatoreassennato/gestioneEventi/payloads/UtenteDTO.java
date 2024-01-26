package salvatoreassennato.gestioneEventi.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record UtenteDTO(@NotEmpty(message = "Il nome è un campo obbligatorio!")
                        @Size(min = 4, message = "Il nome deve essere lungo almeno 4 caratteri!")
                        String nome,
                        @NotEmpty(message = "Il cognome è un campo obbligatorio!")
                        @Size(min = 4, message = "Il cognome deve essere lungo almeno 4 caratteri!")
                        String cognome,
                        @Email(message = "L'indirizzo inserito non è un indirizzo valido")
                        @Size(min = 4, message = "Il nome deve essere lungo almeno 4 caratteri!")
                        String email,
                        @NotEmpty(message = "la password è un campo obbigatorio!")
                        @Size(min = 4, message = "la password deve essere almeno di 4 caratteri!")
                        String password) {
}
