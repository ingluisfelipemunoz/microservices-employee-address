package com.luisfelipemunoz.msvc.employeeservice.service;

import com.luisfelipemunoz.msvc.employeeservice.entity.Employee;
import com.luisfelipemunoz.msvc.employeeservice.repository.EmployeeRepo;
import com.luisfelipemunoz.msvc.employeeservice.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;


    public EmployeeResponse getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
        return employeeResponse;
    }

}
