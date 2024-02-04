package com.example.quanlynhahang.controller;

import com.example.quanlynhahang.dto.response.TableResponse;
import com.example.quanlynhahang.service.impl.TableServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class TableController {

    @Autowired
    private TableServiceImpl tableService;

    @GetMapping("tables")
    public ResponseEntity<List<TableResponse>> listResponseEntity(
            @RequestParam(name = "areaName") String areaName,
            @RequestParam(name = "pageNumber",defaultValue = "0") Integer pageNumber,
            @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize
    ) {
        return new ResponseEntity<>(tableService.tableReponseList(areaName, pageNumber, pageSize), HttpStatus.OK);
    }
}
