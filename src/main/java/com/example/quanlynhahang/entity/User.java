package com.example.quanlynhahang.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", length = 255)
    private String username;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "image", length = 1000)
    private String image;

    @Column(name = "phone_number", length = 255)
    private String phoneNumber;

    @Column(name = "full_name", length = 255)
    private String fullName;

    @Column(name = "gender", length = 255)
    private String gender;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "create_at")
    private LocalDate createAt;

    @Column(name = "update_at")
    private LocalDate updateAt;

    private Integer status;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Order> orderList;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Shift> shiftList;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Role> roleList;
}
