package com.xylope.springexam.dto.converter;

public interface DtoConverter <R, A>{
    R convertToDto(A target);
}
