package co.com.bancolombia.model.persona.gateways;

import co.com.bancolombia.model.persona.Persona;
import reactor.core.publisher.Mono;

public interface PersonaService {
    Mono<Persona> getPersona(String id);
    Mono<Persona> savePersona(Persona persona);
}
