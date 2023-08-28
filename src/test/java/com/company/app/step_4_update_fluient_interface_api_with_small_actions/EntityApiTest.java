package com.company.app.step_4_update_fluient_interface_api_with_small_actions;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;
import com.company.app.springboottest.SpringBootTestApplicationContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;

class EntityApiTest extends SpringBootTestApplicationContext {

    private static final AtomicInteger counter = new AtomicInteger(1);

    @Autowired
    private EntityApi entityApi;

    @Test
    void test_1() {
        String number = String.valueOf(counter.addAndGet(1));
        User user = entityApi.user().create().oneBy(new UserDto().setNumber(number));

        entityApi.user().remove().byUser(user);

        Assertions.assertThrows(RuntimeException.class, () -> entityApi.user().find().byId(user.getId()));
    }

}