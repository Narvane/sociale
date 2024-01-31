package com.sociale.library.core.enumeration;

import lombok.Getter;

@Getter
public enum RoleEnum {

    ATHLETE("ATHLETE"),
    TEAM("TEAM");

    private String name;

    RoleEnum(String name) {
        this.name = name;
    }

}
