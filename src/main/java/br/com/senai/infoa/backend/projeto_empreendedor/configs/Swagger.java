package br.com.senai.infoa.backend.projeto_empreendedor.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Neves Core API",
        version = "1.0",
        description = "Neves Core API - Projeto Empreendedor - Desenvolvido por: Miguel Neves Pereira - Junior em Desenvolvimento de Sistemas - Senai Infoa 2026 - Todos os direitos reservados."
    )
)
public class Swagger {

}