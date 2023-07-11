package com.employee.CrudEmployeeOper.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.employee.CrudEmployeeOper.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	

}
