package com.login.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.login.models.dao.IDusuarioDao;
import com.login.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private IDusuarioDao usuarioDao;

	@Override
	@Transactional(readOnly=true)
	public List<Usuario> findAll() {		
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Usuario findById(Long id) {
		return usuarioDao.findById(id).orElse(null);		
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		
		String pass = usuario.getPassword();
		String passBcrypt = passwordEncoder.encode(pass);
		usuario.setPassword(passBcrypt);
		usuario.setEnabled(true);
		return usuarioDao.save(usuario);
	}

	@Override
	public void delete(Long id) {
		usuarioDao.deleteById(id);		
	}	

}
