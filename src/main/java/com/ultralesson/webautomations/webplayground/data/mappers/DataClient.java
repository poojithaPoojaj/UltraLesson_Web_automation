package com.ultralesson.webautomations.webplayground.data.mappers;

import java.util.Objects;

public abstract class DataClient {
    protected DataMapper dataMapper;
    public DataClient(String formatType) {
//        if(formatType.equalsIgnoreCase("json"))
//        dataMapper = new JSONDataMapper();
//        else
            dataMapper=new YMLDataMapper();
        System.out.println("Data Mapper"+dataMapper.toString());
    }

    protected String getFilePath(String relativePath) {
        return Objects.requireNonNull(this.getClass()
                        .getClassLoader()
                        .getResource(String.format("data_sets/%s",relativePath)))
                .getPath();
    }
}
