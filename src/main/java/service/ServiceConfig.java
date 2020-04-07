package service;

import bean.api.ServiceTable;
import bean.impl.ServiceTableImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ServiceTable serviceTableBean() {
        return new ServiceTableImpl();
    }
}
