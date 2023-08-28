package com.company.app.step_4_update_fluient_interface_api_with_small_actions;

import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.UserContextInitializer;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.data.UserContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EntityApi {

    private final UserContextInitializer userContextInitializer;

    public UserContext user() {
        return userContextInitializer.init();
    }

}
