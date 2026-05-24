package com.gaurav.customerservice.service;

import com.gaurav.customerservice.entity.IndividualCoreIdentity;
import com.gaurav.customerservice.repository.IndividualCoreIdentityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class IndividualCoreIdentityService {

    private final IndividualCoreIdentityRepository repository;

    public Mono<IndividualCoreIdentity> create(
            IndividualCoreIdentity individualCoreIdentity) {

        return repository.save(individualCoreIdentity);
    }

    public Mono<IndividualCoreIdentity> getById(UUID id) {
        return repository.findById(id);
    }

    public Flux<IndividualCoreIdentity> getAll() {
        return repository.findAll();
    }


}