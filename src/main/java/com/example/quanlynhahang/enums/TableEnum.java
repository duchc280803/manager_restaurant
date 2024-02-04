package com.example.quanlynhahang.enums;

public enum TableEnum {

    available(1),

    occupied(2);

    private final int value;

    TableEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
