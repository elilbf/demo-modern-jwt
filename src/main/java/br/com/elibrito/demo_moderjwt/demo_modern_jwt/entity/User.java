package br.com.elibrito.demo_moderjwt.demo_modern_jwt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "USERS")
public class User {

    @Id
    private String username;

    private String password;

}
