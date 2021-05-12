package com.example.pp312.model;


import java.util.List;

public class UserDTO {
    private long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private List<Role> roles;

    public UserDTO() {
    }

    public List<Role> getRoles() {
        return roles;
    }

    public UserDTO(long id, String username, String firstName, String lastName, String email, List<Role> roles) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
