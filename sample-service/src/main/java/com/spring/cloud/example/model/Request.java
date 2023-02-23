package com.spring.cloud.example.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("sample-service")
public class Request {

    private Integer limitUser;

    private Integer maximumUser;
}
