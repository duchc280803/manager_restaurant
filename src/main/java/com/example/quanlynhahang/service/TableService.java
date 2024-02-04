package com.example.quanlynhahang.service;

import com.example.quanlynhahang.dto.response.TableResponse;

import java.util.List;

public interface TableService {

    List<TableResponse> tableReponseList(String areaName, Integer pageNumber, Integer pageSize);
}
