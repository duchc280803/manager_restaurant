package com.example.quanlynhahang.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shift")
public class Shift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "shift_start_time")
    private LocalDate shiftStartTime;

    @Column(name = "shift_delivery_time")
    private LocalDate shiftDeliveryTime;

    @Column(name = "initial_amount")
    private Long initialAmount;

    @Column(name = "total_shift_amout")
    private Long totalShiftAmount;

    @Column(name = "incurred_amount")
    private Long incurredAmount;

    @Column(name = "incurred_description")
    private String incurredDescription;

    @Column(name = "create_at")
    private LocalDate createAt;

    @Column(name = "update_at")
    private LocalDate updateAt;

    private Integer status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
