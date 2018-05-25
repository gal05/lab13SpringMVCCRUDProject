package com.tecsup.guerra_alvarado.dao;

import java.util.List;

import javax.security.auth.login.LoginException;

import com.tecsup.guerra_alvarado.exception.DAOException;
import com.tecsup.guerra_alvarado.exception.EmptyResultException;
import com.tecsup.guerra_alvarado.model.Customers;



public interface CustomersDAO {
	Customers findCustomers(int id) throws DAOException, EmptyResultException;

	void create(String companyName, String contactName, String contactTitle, String address, String city) throws DAOException;

	void delete(int id) throws DAOException,EmptyResultException;;

	void update(String companyName, String contactName, String contactTitle, String address, String city,int id) throws DAOException;

	Customers findCustomersById(int id) throws DAOException, EmptyResultException;

	List<Customers> findAllCustomers() throws DAOException, EmptyResultException;

	//List<Customers> findEmployeesByName(String name) throws DAOException, EmptyResultException;

	//Customers validate(String idEmployee, String clave) throws LoginException, DAOException;
}
