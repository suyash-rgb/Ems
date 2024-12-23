package com.example.Employee.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="email_id")
    private String emailId;

}
