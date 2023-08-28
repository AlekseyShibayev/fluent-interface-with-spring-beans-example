package com.company.app.domain.repository;

import com.company.app.domain.entity.Subscription;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface SubscriptionRepository extends CrudRepository<Subscription, Long> {

    Set<Subscription> findAll();

}
