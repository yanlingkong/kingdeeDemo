package com.kingdee.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * User: liuc
 * Date: 2017/6/4
 * Time: 17:26
 */
@ConfigurationProperties("shorturl")
@Data
@Validated
public class ShortUrlProperties {
    @NotNull
    private String url;
    @NotNull
    private String source;
}
