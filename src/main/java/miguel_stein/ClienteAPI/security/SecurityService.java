package miguel_stein.ClienteAPI.security;

import lombok.RequiredArgsConstructor;
import miguel_stein.ClienteAPI.model.entity.Usuario;
import miguel_stein.ClienteAPI.service.UsuarioService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SecurityService {

    private final UsuarioService usuarioService;

    public Usuario obterUsuarioLogado() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null || !auth.isAuthenticated()) {
            return null;
        }
        UserDetails userDetails = ((UserDetails) auth.getPrincipal());
        return usuarioService.obterPorLogin(userDetails.getUsername());
    }
}
