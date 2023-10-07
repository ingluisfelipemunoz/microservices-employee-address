package com.luisfelipemunoz.msvc.employeeservice.repository;

import com.luisfelipemunoz.msvc.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
