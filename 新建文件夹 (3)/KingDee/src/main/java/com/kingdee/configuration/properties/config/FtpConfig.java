package com.kingdee.configuration.properties.config;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;


@Data
public class FtpConfig {
    @NotBlank
    private String ip;
    @NotBlank
    private String ftpPort;
    @NotBlank
    private String ftpUser;
    @NotBlank
    private String ftpPassword;
}
