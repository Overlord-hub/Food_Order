package ua.com.kisit.food_order3722025.User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name",
            nullable = false,
            length = 100
    )
    private String first_name;

    @Column(name = "last_name",
            nullable = false,
            length = 100
    )
    private String last_name;

    @Column(name = "username",
            nullable = false,
            length = 100
    )
    private String username;

    @Enumerated(EnumType.STRING)
    @Column(name = "role",
            nullable = false,
            length = 100
    )
    private Role role;

    @Column(name = "email",
            nullable = false,
            unique = true,
            length = 100
    )
    private String email;

    @Column(name = "password",
            nullable = false
    )
    private String password;

    @Column(name = "phone",
            nullable = false,
            unique = true,
            length = 15
    )
    private String phone;

    @Column(name = "address",
            length = 100
    )
    private String address;


}