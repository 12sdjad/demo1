package com.ithem.demo1.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "eblena")
@ToString
@Data
public class Enable {
    private String name;
    private Integer age;
}
