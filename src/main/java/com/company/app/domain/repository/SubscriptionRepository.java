package com.company.app.domain.repository;

import com.company.app.domain.entity.Subscription;
import org.springframework.data.repository.CrudRepository;

public interface SubscriptionRepository extends CrudRepository<Subscription, Long> {

}
