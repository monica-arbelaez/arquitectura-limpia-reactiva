package co.com.bancolombia.api;

import co.com.bancolombia.model.persona.Persona;
import co.com.bancolombia.model.persona.gateways.PersonaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@Configuration
public class Router {
    @Bean
    public RouterFunction<ServerResponse> routerFunction(Handler handler) {
        return route(GET("/api/usecase/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                        .body(handler.listenGETUseCase(request.pathVariable("id")), Persona.class));

    }

    @Bean
    public RouterFunction<ServerResponse> routerCrearPersona(Handler handler) {
        return route(POST("/api/usecase/crear").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(Persona.class)
                        .flatMap(persona-> handler.listPerson(persona)
                                .flatMap(result -> ServerResponse.ok()
                                .contentType(MediaType.APPLICATION_JSON).bodyValue(result))));
    }
}
