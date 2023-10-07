package com.luisfelipemunoz.msvc.employeeservice.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeResponse {
    private int id;
    private String name;
    private String email;
    private String age;
}
