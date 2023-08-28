package com.company.app.step_2_create_facade_for_user_service;

import com.company.app.step_2_create_facade_for_user_service.crud.api.UserCreator;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserFinder;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserRemover;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserUpdater;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceFacade {

    private final UserCreator userCreator;
    private final UserFinder userFinder;
    private final UserUpdater userUpdater;
    private final UserRemover userRemover;

    public UserCreator create() {
        return userCreator;
    }

    public UserFinder find() {
        return userFinder;
    }

    public UserUpdater update() {
        return userUpdater;
    }

    public UserRemover remove() {
        return userRemover;
    }

}
