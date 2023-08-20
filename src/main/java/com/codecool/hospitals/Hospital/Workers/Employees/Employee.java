package com.codecool.hospitals.Hospital.Workers.Employees;

import java.time.LocalDate;

public record Employee(int id, String surname, String name, LocalDate dob, String address, String role) {
}
