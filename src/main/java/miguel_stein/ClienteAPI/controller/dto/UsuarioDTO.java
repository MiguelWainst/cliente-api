package miguel_stein.ClienteAPI.controller.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record UsuarioDTO(
    @NotBlank(message = "O login é obrigatório")
    String login,
    @NotBlank(message = "A senha é obrigatória")
    String senha,
    List<String> roles
) {
}
