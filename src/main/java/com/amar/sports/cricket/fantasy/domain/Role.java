package com.amar.sports.cricket.fantasy.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@javax.persistence.Entity
@Table(name = "role")
public class Role extends Entity {

    @Column(nullable = false, columnDefinition = "varchar(5)", unique = true)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "user_id", table = "user", referencedColumnName = "id", nullable = false, updatable = false)}
    )
    private Set<User> users = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
