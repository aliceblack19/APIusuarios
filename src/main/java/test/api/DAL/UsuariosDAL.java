package test.api.DAL;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.api.models.UsuarioModel;
import test.api.repositories.UsuariosRepository;

@Service
public class UsuariosDAL {
	@Autowired
	UsuariosRepository usuariosRepo;

	public ArrayList<UsuarioModel> getUsuarios()
	{
		return (ArrayList<UsuarioModel>) usuariosRepo.findAll();
	}

	public UsuarioModel postUsuarios(UsuarioModel usuario)
	{
		return usuariosRepo.save(usuario);
	}

	public Optional<UsuarioModel> getUsuariosById(long id)
	{
		return usuariosRepo.findById(id);
	}

	public boolean deleteUsuarios(long id)
	{
		try
		{
			usuariosRepo.deleteById(id);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public UsuarioModel putUsuario(UsuarioModel usuario)
	{
		return usuariosRepo.save(usuario);
	}
}
