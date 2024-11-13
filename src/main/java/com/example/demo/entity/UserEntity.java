package com.example.demo.entity;

import com.example.demo.Status;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Status status;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<BankAccount> bankAccounts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public Status getStatus() {return status;}
    public void setStatus(Status status) {this.status = status;}
}
