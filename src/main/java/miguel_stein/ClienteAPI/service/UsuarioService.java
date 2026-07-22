package miguel_stein.ClienteAPI.service;

import lombok.RequiredArgsConstructor;
import miguel_stein.ClienteAPI.model.entity.Usuario;
import miguel_stein.ClienteAPI.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public void salvar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
