package com.company.app;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;
import com.company.app.springboottest.SpringBootTestApplicationContext;
import com.company.app.step_1_create_classical_user_service.ClassicalUserService;
import com.company.app.step_2_create_facade_for_user_service.UserServiceFacade;
import com.company.app.step_3_create_fluent_interface_api_for_user_service.SimpleUserFluentInterfaceApi;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.EntityApi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.atomic.AtomicInteger;

class ApplicationTest extends SpringBootTestApplicationContext {

    private static final AtomicInteger counter = new AtomicInteger(1);

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private ClassicalUserService classicalUserService;
    @Autowired
    private UserServiceFacade userServiceFacade;
    @Autowired
    private SimpleUserFluentInterfaceApi simpleUserFluentInterfaceApi;
    @Autowired
    private EntityApi entityApi;

    @Test
    void context_must_be_test() {
        Assertions.assertNotNull(applicationContext);
    }

    @Test
    void classicalUserService_example() {
        String number = String.valueOf(counter.addAndGet(1));
        UserDto userDto = createUserDto(number);

        User user = classicalUserService.create(userDto);

        Assertions.assertEquals(number, user.getNumber());
    }

    @Test
    void userServiceFacade_example() {
        String number = String.valueOf(counter.addAndGet(1));
        UserDto userDto = createUserDto(number);

        User user = userServiceFacade.create().oneBy(userDto);

        Assertions.assertEquals(number, user.getNumber());
    }

    @Test
    void simpleUserFluentInterfaceApi_example() {
        String number = String.valueOf(counter.addAndGet(1));
        UserDto userDto = createUserDto(number);

        User user = simpleUserFluentInterfaceApi.api().create().oneBy(userDto);

        Assertions.assertEquals(number, user.getNumber());
    }

    @Test
    void extendedUserFluentInterfaceApi_example() {
        String number = String.valueOf(counter.addAndGet(1));
        UserDto userDto = createUserDto(number);

        User user = entityApi.user().create().oneBy(userDto);

        Assertions.assertEquals(number, user.getNumber());
    }

    private UserDto createUserDto(String number) {
        return new UserDto()
                .setNumber(number);
    }

}
