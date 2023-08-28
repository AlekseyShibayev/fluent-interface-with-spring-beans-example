package com.company.app.domain.service.api;

import com.company.app.domain.entity.Subscription;

import java.util.Set;

public interface SubscriptionService {

    Subscription read(Long id);

    Set<Subscription> getAll();

}
