package com.tecsup.guerra_alvarado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.guerra_alvarado.dao.CustomersDAO;
import com.tecsup.guerra_alvarado.exception.DAOException;
import com.tecsup.guerra_alvarado.exception.EmptyResultException;
import com.tecsup.guerra_alvarado.model.Customers;

@Service
public class CustomersServiceImpl  implements CustomersService{

	@Autowired
	CustomersDAO customersDao;
	
	@Override
	public List<Customers> findAll() throws DAOException, EmptyResultException {
		List<Customers> cus= customersDao.findAllCustomers();
				
		return cus;
	}

	@Override
	public boolean crear(Customers customers) throws DAOException, EmptyResultException {
		
		customersDao.create(customers.getCompanyName(),customers.getContactName(),customers.getContactTitle(),customers.getAddress(),customers.getCity());
		
		return true;
	}

}
