package com.kingdee.configuration;

import com.kingdee.configuration.properties.ShortUrlProperties;
import com.kingdee.configuration.properties.config.BaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableConfigurationProperties(value = {ShortUrlProperties.class, BaseProperties.class})
public class ApiConfiguration extends WebMvcConfigurerAdapter {
    /**
     * 设置默认首页
     *
     * @param registry viewControllerRegistry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("redirect:/swagger-ui.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedHeaders("*")
                .allowedMethods("*")
                .allowedOrigins("*")
                .maxAge(3628800)
                .allowCredentials(true);
    }
}
