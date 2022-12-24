package com.springbook.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloReesponseDto {

    private final String name;
    private final int amount;
}
