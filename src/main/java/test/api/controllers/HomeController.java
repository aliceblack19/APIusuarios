package test.api.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.api.BLL.UsuariosBLL;
import test.api.models.UsuarioModel;

@RestController
@RequestMapping("/usuarios")
public class HomeController {
	@Autowired
	UsuariosBLL usuariosBLL;

	@GetMapping()
	public ArrayList<UsuarioModel> getUsuarios()
	{
		return usuariosBLL.getUsuarios();
	}
	
	@PostMapping()
	public UsuarioModel postUsuario(@RequestBody UsuarioModel usuario)
	{
		return usuariosBLL.postUsuario(usuario);
	}

	@GetMapping(path = "/{id}")
	public Optional<UsuarioModel> getUsuarioById(@PathVariable("id") long id)
	{
		return usuariosBLL.getUsuarioById(id);
	}

	@DeleteMapping(path = "/{id}")
	public boolean deleteUsuario(@PathVariable long id)
	{
		return usuariosBLL.deleteUsuarios(id);
	}

	@PutMapping(path = "/{id}")
	public UsuarioModel putUsuario(@PathVariable long id, @RequestBody UsuarioModel usuario)
	{
		return usuariosBLL.putUsuario(id, usuario);
	}

}
