package miguel_stein.ClienteAPI.service;

import lombok.RequiredArgsConstructor;
import miguel_stein.ClienteAPI.model.entity.Usuario;
import miguel_stein.ClienteAPI.repository.UsuarioRepository;
import miguel_stein.ClienteAPI.validators.UsuarioValidator;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioValidator validator;
    private final PasswordEncoder encoder;

    public void salvar(Usuario usuario) {
        validator.validar(usuario);
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        usuarioRepository.save(usuario);
    }

    public Usuario obterPorLogin(String login) {
        return usuarioRepository.findByLogin(login).orElse(null);
    }
}
