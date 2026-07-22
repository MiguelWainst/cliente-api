package miguel_stein.ClienteAPI.repository;

import miguel_stein.ClienteAPI.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, java.util.UUID> {
}
