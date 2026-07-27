package miguel_stein.ClienteAPI.validators;

import lombok.RequiredArgsConstructor;
import miguel_stein.ClienteAPI.exception.RegistroDuplicadoException;
import miguel_stein.ClienteAPI.model.entity.Usuario;
import miguel_stein.ClienteAPI.repository.UsuarioRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UsuarioValidator {

    private final UsuarioRepository usuarioRepository;

    public void validar(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("Erro: Usuário não pode ser nulo");
        }
        if (usuarioRepetido(usuario)) {
            throw new RegistroDuplicadoException("Erro: Usuário já existe");
        }
    }

    private boolean usuarioRepetido(Usuario usuario) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findByLogin(usuario.getLogin());
        if (usuario.getId() == null) {
            return usuarioExistente.isPresent();
        }
        return usuarioExistente.isPresent() && !usuario.getId().equals(usuarioExistente.get().getId());
    }
}
