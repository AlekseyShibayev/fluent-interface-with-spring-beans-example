package com.company.app;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;
import com.company.app.springboottest.SpringBootTestApplicationContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.atomic.AtomicInteger;

class ApplicationTest extends SpringBootTestApplicationContext {

    private static final AtomicInteger counter = new AtomicInteger(1);

    @Autowired
    private ApplicationContext applicationContext;

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

    private UserDto createUserDto(String number) {
        return new UserDto()
                .setNumber(number);
    }

}
