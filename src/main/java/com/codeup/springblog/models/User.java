package com.codeup.springblog.models;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String username;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String email;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public User() {
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

