package com.company.app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HistoryService {

    public void writeHistory() {
        log.debug("я как-то записываю историю изменений юзера");
    }

}
