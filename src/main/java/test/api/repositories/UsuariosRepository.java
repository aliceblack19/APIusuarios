package test.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.api.models.UsuarioModel;

@Repository
public interface UsuariosRepository extends CrudRepository<UsuarioModel, Long> {
	
}
