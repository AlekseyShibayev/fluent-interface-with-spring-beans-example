package com.company.app.domain.service.impl;

import com.company.app.domain.repository.UserRepository;
import com.company.app.domain.service.api.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

}
