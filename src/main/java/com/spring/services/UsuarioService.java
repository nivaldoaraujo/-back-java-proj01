package com.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entities.Usuario;
import com.spring.repositories.UsuarioReopositories;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioReopositories repository;
	
	public List<Usuario> procurarTodos(){
		return repository.findAll();
	}
	public Usuario procuraprId(Integer id) {
		return repository.findById(id).get();
	}
	public String adicionarUsuario(Usuario usuario) {
		repository.save(usuario);
		return "Usuário cadastrado com sucesso!";
	}
	
	public String editarUsuario(Integer id, Usuario usuario) {
		Usuario response = repository.findById(id).get();
		
		response.setNome(usuario.getNome());
		response.setEmail(usuario.getEmail());
		response.setSenha(usuario.getSenha());
		repository.save(response);
		return "Usuário editado com sucesso!!";
	}
	public void excluirUsuario(Integer id) {
		Usuario excluir = repository.findById(id).get();
		repository.delete(excluir);
	}

}
