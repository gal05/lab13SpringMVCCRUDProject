package com.tecsup.guerra_alvarado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.guerra_alvarado.dao.EmployeeDAO;
import com.tecsup.guerra_alvarado.exception.DAOException;
import com.tecsup.guerra_alvarado.exception.EmptyResultException;
import com.tecsup.guerra_alvarado.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee find(int employee_id) throws DAOException, EmptyResultException {

		Employee emp = employeeDAO.findEmployee(employee_id);

		return emp;
	}

	@Override
	public List<Employee> findAll() throws DAOException, EmptyResultException {

		List<Employee> emps = employeeDAO.findAllEmployees();

		return emps;
	}

	@Override
	public void update(String login, String password, String lastname, String firstname, int salary, int dptId)
			throws DAOException {

		employeeDAO.update(login, password, lastname, firstname, salary, dptId);
	}
}
