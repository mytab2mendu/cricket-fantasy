package com.amar.sports.cricket.fantasy.domain;


import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, columnDefinition = "varchar(15)")
    private String firstName;

    @Column(nullable = false, columnDefinition = "varchar(15)")
    private String lastName;

    @Column(nullable = false, unique = true, columnDefinition = "varchar(15)")
    private String userName;

    @Column(nullable = false, columnDefinition = "varchar(15)")
    private String password;

    @Column(nullable = false, columnDefinition = "varchar(30)")
    private String email;

    @Column(columnDefinition = "varchar(5) default 'user'")
    private String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
