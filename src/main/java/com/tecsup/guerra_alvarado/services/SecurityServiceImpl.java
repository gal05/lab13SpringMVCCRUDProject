package com.tecsup.guerra_alvarado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.guerra_alvarado.dao.EmployeeDAO;
import com.tecsup.guerra_alvarado.exception.DAOException;
import com.tecsup.guerra_alvarado.exception.LoginException;
import com.tecsup.guerra_alvarado.model.Employee;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee validate(String login, String password) throws LoginException, DAOException {

		Employee emp = employeeDAO.validate(login, password);

		return emp;
	}

}
