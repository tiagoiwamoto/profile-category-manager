package br.com.kamehouse.profilecategorymanager.entrypoint.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public record CategoryDto(

        @NotNull(message = "Este campo precisa ser preenchido")
        @NotEmpty(message = "Este campo não pode ser vazio")
        @NotBlank(message = "Este campo não pode ser vazio")
        String name,

        @NotNull(message = "Este campo precisa ser preenchido")
        @NotEmpty(message = "Este campo não pode ser vazio")
        @NotBlank(message = "Este campo não pode ser vazio")
        String description,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
