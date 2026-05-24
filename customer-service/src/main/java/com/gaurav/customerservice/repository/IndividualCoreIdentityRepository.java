package com.gaurav.customerservice.repository;

import com.gaurav.customerservice.entity.IndividualCoreIdentity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface IndividualCoreIdentityRepository
        extends ReactiveCrudRepository<IndividualCoreIdentity, UUID> {
}