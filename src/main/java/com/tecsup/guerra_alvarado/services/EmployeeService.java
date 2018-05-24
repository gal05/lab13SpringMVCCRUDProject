package com.tecsup.guerra_alvarado.services;

import java.util.List;

import com.tecsup.guerra_alvarado.exception.DAOException;
import com.tecsup.guerra_alvarado.exception.EmptyResultException;
import com.tecsup.guerra_alvarado.model.Employee;

public interface EmployeeService {

	Employee find(int employee_id) throws DAOException, EmptyResultException;

	List<Employee> findAll() throws DAOException, EmptyResultException;

	void update(String login, String password, String lastname, String firstname, int salary, int dptId)
			throws DAOException;
}
