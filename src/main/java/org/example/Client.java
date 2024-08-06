package org.example;

import java.time.LocalDate;

public class Client {
    private String lastName;

    private String firstName;

    private LocalDate birthDate;

    public Client(String lastName, String firstName, LocalDate birthDate ) {
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
