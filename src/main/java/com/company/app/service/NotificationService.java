package com.company.app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationService {

    public void doNotification() {
        log.debug("я как-то отправляю куда-то нотификации");
    }

}
