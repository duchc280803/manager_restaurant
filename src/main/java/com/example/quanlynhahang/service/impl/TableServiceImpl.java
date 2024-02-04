package com.example.quanlynhahang.service.impl;

import com.example.quanlynhahang.dto.response.TableResponse;
import com.example.quanlynhahang.entity.Tables;
import com.example.quanlynhahang.mapper.TableMapper;
import com.example.quanlynhahang.repository.TablesRepository;
import com.example.quanlynhahang.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableServiceImpl implements TableService {

    @Autowired
    private TablesRepository tablesRepository;

    @Override
    public List<TableResponse> tableReponseList(String areaName, Integer pageNumber, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<Tables> tablesPage = tablesRepository.findByArea_AreaName(areaName, pageable);
        return TableMapper.mapToTableResponse(tablesPage.getContent());
    }
}
