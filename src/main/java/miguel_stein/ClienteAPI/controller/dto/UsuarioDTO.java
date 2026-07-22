package miguel_stein.ClienteAPI.controller.dto;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public record UsuarioDTO(
    @NotNull(message = "O login é obrigatório")
    String login,
    @NotNull(message = "A senha é obrigatória")
    String password,
    List<String> roles
) {
}
