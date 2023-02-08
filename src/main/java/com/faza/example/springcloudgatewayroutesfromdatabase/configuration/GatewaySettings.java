package com.faza.example.springcloudgatewayroutesfromdatabase.configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@NoArgsConstructor
@Getter
@ConfigurationProperties(prefix = "gateway")
public class GatewaySettings {

    private Long connectionTimeout;
    private Long readTimeout;
}
