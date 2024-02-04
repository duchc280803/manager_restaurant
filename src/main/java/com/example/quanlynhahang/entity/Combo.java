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
@Table(name = "combo")
public class Combo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "combo_code", length = 255)
    private String comboCode;

    @Column(name = "combo_name", length = 255)
    private String comboName;

    @Column(name = "image", length = 1000)
    private String image;

    @Column(name = "price")
    private Long price;

    @Column(name = "create_at")
    private LocalDate createAt;

    @Column(name = "update_at")
    private LocalDate updateAt;

    private Integer status;

    @OneToMany(mappedBy = "combo", fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetailList;

    @OneToMany(mappedBy = "combo", fetch = FetchType.LAZY)
    private List<ComboDetail> comboDetailList;

}
