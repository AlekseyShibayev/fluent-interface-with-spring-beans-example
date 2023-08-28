package com.company.app.step_1_create_classical_user_service;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;
import com.company.app.domain.repository.UserRepository;
import com.company.app.domain.util.UserMapper;
import com.company.app.service.AnyAnnotationForProxy;
import com.company.app.service.HistoryService;
import com.company.app.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassicalUserServiceImpl implements ClassicalUserService {

    private final UserRepository userRepository;
    private final NotificationService notificationService;
    private final HistoryService historyService;

    @AnyAnnotationForProxy
    @Override
    public User create(UserDto userDto) {
        historyService.writeHistory();
        User save = userRepository.save(UserMapper.of(userDto));
        notificationService.doNotification();
        return save;
    }

    @AnyAnnotationForProxy
    @Override
    public List<User> createAll(List<UserDto> userDtoList) {
        return null;
    }

    @AnyAnnotationForProxy
    @Override
    public User findById(Long id) {
        return null;
    }

    @AnyAnnotationForProxy
    @Override
    public User findByUserNumber(String userNumber) {
        return null;
    }

    @AnyAnnotationForProxy
    @Override
    public List<User> findAll() {
        return null;
    }

    @AnyAnnotationForProxy
    @Override
    public List<User> findAllByIds(Collection<Long> ids) {
        return null;
    }

    @AnyAnnotationForProxy
    @Override
    public List<User> findAllByNumbers(Collection<String> numbers) {
        return null;
    }

    @AnyAnnotationForProxy
    @Override
    public void update(Long id, UserDto userDto) {

    }

    @AnyAnnotationForProxy
    @Override
    public void update(User user) {

    }

    @AnyAnnotationForProxy
    @Override
    public void remove(Long id) {

    }

    @AnyAnnotationForProxy
    @Override
    public void remove(String number) {

    }

    @AnyAnnotationForProxy
    @Override
    public void remove(User user) {

    }

    @AnyAnnotationForProxy
    @Override
    public void remove(UserDto userDto) {

    }
}
