package com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component;

import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.create.UserCreateAllByUserDtoList;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.create.UserCreateOneByUserDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class UserBeansBag {

    private final UserCreateOneByUserDto extendedUserFluentInterfaceApiCreateOneByUserDto;
    private final UserCreateAllByUserDtoList extendedUserFluentInterfaceApiCreateAllByUserDtoList;

}
