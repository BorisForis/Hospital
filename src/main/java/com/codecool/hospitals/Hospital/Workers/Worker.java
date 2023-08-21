package com.codecool.hospitals.Hospital.Workers;

import java.time.LocalDate;
import java.util.List;

public record Worker(int id, String surname, String name, LocalDate dob, String address, String role, List<String> specializations) {
}
