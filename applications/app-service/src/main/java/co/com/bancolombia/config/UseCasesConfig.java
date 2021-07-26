package co.com.bancolombia.config;

import co.com.bancolombia.model.persona.gateways.PersonaService;
import co.com.bancolombia.usecase.persona.PersonaUseCase;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "co.com.bancolombia.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)
public class UseCasesConfig {


        public PersonaUseCase personUseCase(PersonaService personaService){
                return new PersonaUseCase(personaService);
        }
}
