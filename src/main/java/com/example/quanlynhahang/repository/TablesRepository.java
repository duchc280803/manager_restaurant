package com.example.quanlynhahang.repository;

import com.example.quanlynhahang.entity.Tables;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TablesRepository extends JpaRepository<Tables, Integer> {

    Page<Tables> findByArea_AreaName(String areaName, Pageable pageable);
}
