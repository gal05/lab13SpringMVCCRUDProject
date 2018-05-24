package com.tecsup.guerra_alvarado.services;

import com.tecsup.guerra_alvarado.exception.DAOException;
import com.tecsup.guerra_alvarado.exception.LoginException;
import com.tecsup.guerra_alvarado.model.Employee;

public interface SecurityService {

	Employee validate(String idEmployee, String clave) throws LoginException, DAOException;

}
