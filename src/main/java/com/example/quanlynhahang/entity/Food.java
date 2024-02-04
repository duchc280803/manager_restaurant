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
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "food_code", length = 255)
    private String foodCode;

    @Column(name = "food_name", length = 255)
    private String foodName;

    @Column(name = "image", length = 1000)
    private String image;

    private Long price;

    @Column(name = "unit_of_measurement")
    private String unitOfMeasurement;

    @Column(name = "create_at")
    private LocalDate createAt;

    @Column(name = "update_at")
    private LocalDate updateAt;

    private Integer status;

    @OneToMany(mappedBy = "food", fetch = FetchType.LAZY)
    private List<ComboDetail> comboDetailList;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
