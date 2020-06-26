package com.nettyim.server.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class JsonUtils {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static String toJson(Object obj) throws JsonProcessingException {
        return MAPPER.writeValueAsString(obj);
    }

    public static <T> T fromJson(byte[] json, Class<T> clazz) throws IOException {
        return MAPPER.readValue(json, clazz);
    }
}