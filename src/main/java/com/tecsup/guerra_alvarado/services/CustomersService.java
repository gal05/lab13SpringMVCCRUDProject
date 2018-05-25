package com.tecsup.guerra_alvarado.services;

import java.util.List;

import com.tecsup.guerra_alvarado.exception.DAOException;
import com.tecsup.guerra_alvarado.exception.EmptyResultException;
import com.tecsup.guerra_alvarado.model.Customers;


public interface CustomersService {
	
	
	List<Customers> findAll() throws DAOException, EmptyResultException;
		
	boolean crear( Customers customers) throws DAOException, EmptyResultException;
	
	boolean borrar( int id) throws DAOException, EmptyResultException;
	
	boolean update(Customers customers) throws DAOException, EmptyResultException;
	
	Customers finById(int id) throws DAOException, EmptyResultException;
}




