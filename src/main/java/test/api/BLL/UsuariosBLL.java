package test.api.BLL;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import test.api.DAL.UsuariosDAL;
import test.api.models.UsuarioModel;

@Component
public class UsuariosBLL {
	@Autowired
	UsuariosDAL usuariosDAL;

	public ArrayList<UsuarioModel> getUsuarios()
	{
		return usuariosDAL.getUsuarios();
	}
	public UsuarioModel postUsuario(UsuarioModel usuario)
	{
		return usuariosDAL.postUsuarios(usuario);
	}

	public Optional<UsuarioModel> getUsuarioById(long id)
	{
		return usuariosDAL.getUsuariosById(id);
	}

	public boolean deleteUsuarios(long id)
	{
		return usuariosDAL.deleteUsuarios(id);
	}

	public UsuarioModel putUsuario(long id, UsuarioModel usuario)
	{
		usuario.setId(id);
		return usuariosDAL.putUsuario(usuario);
	}

}
