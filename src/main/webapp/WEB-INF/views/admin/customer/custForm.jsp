<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h1>Add New Customers</h1>  
       <form:form method="POST" action="createCustomer" modelAttribute="customersForm">    
        <table >    


         <tr>    
          <td>Nombre compania</td>   
          <td><form:input path="companyName"/></td>  
         </tr>    
         <tr>    
          <td><form:label path="contactName">contact Name</form:label></td>    
          <td><form:input path="contactName"/></td>  
         </tr>   
         <tr>    
          <td><form:label path="contactTitle">titulo contacto</form:label></td>    
          <td><form:input path="contactTitle" /></td>  
         </tr>
         <tr>    
          <td><form:label path="address">address</form:label></td>    
          <td><form:input path="address" /></td>  
         </tr>
         <tr>    
          <td><form:label path="city">city</form:label></td>    
          <td><form:input path="city" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>
</body>
</html>