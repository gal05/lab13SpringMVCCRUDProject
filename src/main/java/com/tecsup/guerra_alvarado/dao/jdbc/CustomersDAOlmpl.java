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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String login) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String companyName, String contactName, String contactTitle, String address, String city, int id)
			throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customers> findAllCustomers() throws DAOException, EmptyResultException {
		String query = "SELECT employee_id, login, password, first_name, last_name, salary, department_id FROM employees ";

		try {

			List<Customers> employees = jdbcTemplate.query(query, new CustomersMapper());
			//
			return employees;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

}
