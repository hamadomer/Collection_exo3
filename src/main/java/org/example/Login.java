package org.example;

import java.time.LocalDate;

public class Login {
    private Client client;

    private LocalDate loginDate;

    public Login(Client client, LocalDate loginDate) {
        this.client = client;
        this.loginDate = loginDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalDate loginDate) {
        this.loginDate = loginDate;
    }
}
