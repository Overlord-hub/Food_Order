package ua.com.kisit.food_order3722025.Order;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

import static ua.com.kisit.food_order3722025.Order.Status.pending;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id",
            nullable = false
    )
    private long user_id;

    @CreationTimestamp
    @Column(name = "created_at",
            nullable = false,
            updatable = false,
            length = 100
    )
    private LocalDateTime created_at;

    @Enumerated(EnumType.STRING)
    @Column(name = "status"
    )
    private Status status = pending;

    @Column(name = "total_price",
            nullable = false,
            length = 100
    )
    private Double total_price;

    @Column(name = "payment_id",
            nullable = false
    )
    private long payment_id;

    @Column(name = "delivery_id",
            nullable = false
    )
    private long delivery_id;
}
