package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(Client client) {
        this.client = client;
    }

    // getters and setters...
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
