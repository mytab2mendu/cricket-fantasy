package com.amar.sports.cricket.fantasy.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@javax.persistence.Entity
@Table(name = "user")
public class User extends Entity {

    @Column(name = "first_name", nullable = false, columnDefinition = "varchar(15)")
    private String firstName;

    @Column(name = "last_name", nullable = false, columnDefinition = "varchar(15)")
    private String lastName;

    @Column(nullable = false, unique = true, columnDefinition = "varchar(15)")
    private String username;

    @Column(nullable = false, columnDefinition = "varchar(15)")
    private String password;

    @Column(nullable = false, columnDefinition = "varchar(30)")
    private String email;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "role_id", table = "role", referencedColumnName = "id", nullable = false, updatable = false)}
    )
    private Set<Role> roles = new HashSet<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
