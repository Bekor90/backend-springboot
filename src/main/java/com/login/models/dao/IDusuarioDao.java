package com.login.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.login.models.entity.Usuario;

public interface IDusuarioDao extends CrudRepository<Usuario, Long>{
	
	 public Usuario findByCedula(String cedula);
	 
	 @Query("select u from Usuario u where u.cedula=?1 ")
	 public Usuario findByCedula2(String cedula);

}
