package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String address;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    protected Client() {

    }

    public Client(String name, String email, String phone, String address, Advisor advisor) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.advisor = advisor;
    }

    // getters and setters...
    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
