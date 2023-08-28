package com.company.app.springboottest;

import com.company.app.step_1_create_classical_user_service.ClassicalUserService;
import com.company.app.step_2_create_facade_for_user_service.UserServiceFacade;
import com.company.app.step_3_create_fluent_interface_api_for_user_service.UserFluentInterfaceApi;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.test.context.TestPropertySource;

import javax.annotation.PostConstruct;

@Slf4j
@ExtendWith(OutputCaptureExtension.class)
@TestPropertySource("/test.properties")
@SpringBootTest(
        classes = SpringBootTestApplicationConfiguration.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class SpringBootTestApplicationContext {

    @Autowired
    protected ClassicalUserService classicalUserService;
    @Autowired
    protected UserServiceFacade userServiceFacade;
    @Autowired
    protected UserFluentInterfaceApi userFluentInterfaceApi;

    @PostConstruct
    void init() {
        log.debug("**********     запущена группа тестов всего приложения     **********");
    }

}
