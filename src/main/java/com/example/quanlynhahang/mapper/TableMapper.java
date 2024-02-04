package com.example.quanlynhahang.mapper;

import com.example.quanlynhahang.dto.response.TableResponse;
import com.example.quanlynhahang.entity.Tables;

import java.util.ArrayList;
import java.util.List;

public class TableMapper {

    public static List<TableResponse> mapToTableResponse(List<Tables> tables) {
        List<TableResponse> tableResponseList = new ArrayList<>();
        for (Tables table: tables) {
            TableResponse tableResponse = new TableResponse();
            tableResponse.setTableName(table.getTableName());
            tableResponse.setStatus(table.getStatus());
            tableResponseList.add(tableResponse);
        }
        return tableResponseList;
    }
}
