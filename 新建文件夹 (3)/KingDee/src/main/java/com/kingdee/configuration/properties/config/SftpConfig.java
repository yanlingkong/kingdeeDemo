package com.kingdee.configuration.properties.config;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;


@Data
public class SftpConfig {
    @NotBlank
    private String sftpIp;
    @NotBlank
    private String sftpPort;
    @NotBlank
    private String sftpUser;
    @NotBlank
    private String sftpPassword;
}
