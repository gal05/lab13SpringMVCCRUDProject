package com.tecsup.guerra_alvarado.dao.jdbc;

import java.util.List;

import com.tecsup.guerra_alvarado.dao.CustomersDAO;
import com.tecsup.guerra_alvarado.exception.DAOException;
import com.tecsup.guerra_alvarado.exception.EmptyResultException;
import com.tecsup.guerra_alvarado.mapper.CustomersMapper;
import com.tecsup.guerra_alvarado.model.Customers;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomersDAOlmpl implements CustomersDAO {

	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Customers findCustomers(int id) throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(String companyName, String contactName, String contactTitle, String address, String city)
			throws DAOException {
		
		String query="insert into customers (companyName,contactName,contactTitle,address,city) values (?,?,?,?,?)";
		Object[] params = new Object[] { companyName, contactName, contactTitle, address, city, };
		
		Customers customers=null;
		
		try {
			// create
			jdbcTemplate.update(query, params);
			// search
			

		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void delete(int id) throws DAOException,EmptyResultException {
		try {
			
			String query="delete from customers where id="+id+"";
		
		 jdbcTemplate.update(query);
			
		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error Impl: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}	
		
	}

	@Override
	public void update(String companyName, String contactName, String contactTitle, String address, String city, int id)
			throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customers> findAllCustomers() throws DAOException, EmptyResultException {
		String query = "Select id,companyName,contactname,contactTitle,address,city from customers";

		try {

			List<Customers> customers = jdbcTemplate.query(query, new CustomersMapper());
			//
			return customers;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

}
