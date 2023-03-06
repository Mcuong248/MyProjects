package com.example.crud_test.dto;

import com.example.crud_test.model.Location;

public record JobRequest (String id, String title, String description, Location location, int mix_salary, int max_salary, String email_to) {
}
