package com.codecool.hospitals.Hospital;

import com.codecool.hospitals.Hospital.Departments.Department;

import java.util.List;

public record Hospital(int id, String name, String address, List<Department> departments) {
}
