package com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component;

import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.create.UserCreateAllByUserDtoList;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.create.UserCreateOneByUserDto;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.find.UserFindById;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.find.UserFindByNumber;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.remove.UserRemoveById;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.remove.UserRemoveByNumber;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.remove.UserRemoveByUser;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.remove.UserRemoveByUserDto;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.update.UserUpdateByIdAndUserDto;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.update.UserUpdateByUser;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class UserBeansBag {

    private final UserCreateOneByUserDto userCreateOneByUserDto;
    private final UserCreateAllByUserDtoList userCreateAllByUserDtoList;

    private final UserFindById userFindById;
    private final UserFindByNumber userFindByNumber;

    private final UserUpdateByIdAndUserDto userUpdateByIdAndUserDto;
    private final UserUpdateByUser userUpdateByUser;

    private final UserRemoveById userRemoveById;
    private final UserRemoveByNumber userRemoveByNumber;
    private final UserRemoveByUser userRemoveByUser;
    private final UserRemoveByUserDto userRemoveByUserDto;

}
