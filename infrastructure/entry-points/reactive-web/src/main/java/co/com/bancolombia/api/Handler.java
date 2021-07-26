package co.com.bancolombia.api;

import co.com.bancolombia.model.persona.Persona;
import co.com.bancolombia.usecase.persona.PersonaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    private  final PersonaUseCase useCase;

    public Mono<Persona> listenGETUseCase(String id) {
        return useCase.getPersona(id);
    }


    public Mono<Persona> listPerson(Persona persona) {
        return useCase.savePersona(persona);
    }

    public Mono<ServerResponse> listenPOSTUseCase(ServerRequest serverRequest) {

        return ServerResponse.ok().body("", String.class);
    }
}
