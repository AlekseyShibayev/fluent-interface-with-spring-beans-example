package com.company.app.step_2_create_facade_for_user_service.crud.impl;

import com.company.app.domain.entity.User;
import com.company.app.domain.repository.UserRepository;
import com.company.app.service.AnyAnnotationForProxy;
import com.company.app.service.HistoryService;
import com.company.app.service.NotificationService;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserFinder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserFinderImpl implements UserFinder {

    private final UserRepository userRepository;
    private final NotificationService notificationService;
    private final HistoryService historyService;

    @AnyAnnotationForProxy
    public User getById(Long id) {
        return null;
    }

    @AnyAnnotationForProxy
    public User getByUserNumber(String userNumber) {
        return null;
    }

    @AnyAnnotationForProxy
    public List<User> getAll() {
        return null;
    }

    @AnyAnnotationForProxy
    public List<User> getAllByIds(Collection<Long> ids) {
        return null;
    }

    @AnyAnnotationForProxy
    public List<User> getAllByNumbers(Collection<String> numbers) {
        return null;
    }

}
