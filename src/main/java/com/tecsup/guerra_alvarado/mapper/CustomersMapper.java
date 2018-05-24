package com.tecsup.guerra_alvarado.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.guerra_alvarado.model.Customers;

public class CustomersMapper implements RowMapper<Customers>{

	@Override
	public Customers mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customers cus=new Customers();
		cus.setId(rs.getInt("id"));
		cus.setCompanyName(rs.getString("companyName"));
		cus.setContactName(rs.getString("contactName"));
		cus.setContactTitle(rs.getString("contactTitle"));
		cus.setAddress(rs.getString("address"));
		cus.setCity(rs.getString("city"));
		return cus;
	}

}
