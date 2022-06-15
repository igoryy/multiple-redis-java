package com.example.multipleredisjava;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RedisProperty {

        private String host;
        private int port;
        private int database;
}
