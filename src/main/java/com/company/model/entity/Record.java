package com.company.model.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Record {
    private String firstName;
    private String login;

    public Record() {
    }

    public Record(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(login, record.login) &&
                Objects.equals(firstName, record.firstName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(login);
    }

    @Override
    public String toString() {
        return "Record{" +
                "login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
