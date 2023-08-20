package com.codecool.hospitals.Hospital.Workers.Nurses;

import java.time.LocalDate;

public record Nurse(int id, String surname, String name, LocalDate dob, String address) {
}
