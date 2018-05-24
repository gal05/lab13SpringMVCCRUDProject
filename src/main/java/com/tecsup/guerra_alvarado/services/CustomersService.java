package com.tecsup.guerra_alvarado.services;

import java.util.List;

import com.tecsup.guerra_alvarado.exception.DAOException;
import com.tecsup.guerra_alvarado.exception.EmptyResultException;
import com.tecsup.guerra_alvarado.model.Customers;


public interface CustomersService {
	List<Customers> findAll() throws DAOException, EmptyResultException;
}
