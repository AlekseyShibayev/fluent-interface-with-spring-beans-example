package com.company.app.step_2_create_facade_for_user_service.crud.api;

import com.company.app.domain.entity.User;

import java.util.Collection;
import java.util.List;


public interface UserFinder {

    User getById(Long id);

    User getByUserNumber(String userNumber);

    List<User> getAll();

    List<User> getAllByIds(Collection<Long> ids);

    List<User> getAllByNumbers(Collection<String> numbers);

}
