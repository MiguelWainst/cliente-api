package miguel_stein.ClienteAPI.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Data;
import miguel_stein.ClienteAPI.model.entity.Cliente;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.UUID;

public record ClienteDTO(
        UUID id,
        @NotBlank(message = "O nome não pode ser nulo.")
        String nome,
        @Past(message = "A data deve ser uma data passada.")
        @NotNull(message = "A data de nascimento é obrigatória.")
        LocalDate dataNascimento,
        @Email(message = "O Formato de E-mail inválido.")
        @NotBlank(message = "O E-mail é obrigatório.")
        String email,
        @NotBlank(message = "O CPF é obrigatório.")
        String cpf
) {
}
