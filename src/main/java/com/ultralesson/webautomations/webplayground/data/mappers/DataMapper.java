package com.ultralesson.webautomations.webplayground.data.mappers;

public interface DataMapper {
    <T> T map(String filename, String key, Class<T> tClass);
}
