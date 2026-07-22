package miguel_stein.ClienteAPI.repository;

import miguel_stein.ClienteAPI.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, java.util.UUID> {

    Optional<Usuario> findByLogin(String login);
}
