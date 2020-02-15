package com.login.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.login.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
