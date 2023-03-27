package com.ultralesson.webautomations.webplayground.data.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.FileNotFoundException;

public interface DataMapper {
    <T> T map(String filename, String key, Class<T> tClass) throws FileNotFoundException, JsonProcessingException;
}
