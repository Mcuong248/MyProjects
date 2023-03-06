package com.example.crud_test.model;

public enum Location {
    HANOI ("Hà Nội"),
    HAIPHONG ("Hải Phòng"),
    DANANG ("Đà Nẵng"),
    HOCHIMINH ("Hồ Chí Minh");

    private String value;

    Location(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
