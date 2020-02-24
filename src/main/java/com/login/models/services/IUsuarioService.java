package com.login.models.services;

import java.util.List;

import com.login.models.entity.Usuario;

public interface IUsuarioService {
	
public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public Usuario save(Usuario cliente);
	
	public void delete(Long id);
}
