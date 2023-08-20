package com.codecool.hospitals.Hospital.Workers.Doctors;

import java.time.LocalDate;

public record Doctor(int id, String surname, String name, LocalDate dob, String address, String specialization) {
}
