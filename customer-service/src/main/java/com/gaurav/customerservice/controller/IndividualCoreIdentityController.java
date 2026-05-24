package com.gaurav.customerservice.controller;

import com.gaurav.customerservice.entity.IndividualCoreIdentity;
import com.gaurav.customerservice.service.IndividualCoreIdentityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/individual-core-identities")
@RequiredArgsConstructor
public class IndividualCoreIdentityController {

    private final IndividualCoreIdentityService service;

    @PostMapping
    public Mono<IndividualCoreIdentity> create(
            @RequestBody IndividualCoreIdentity request) {

        return service.create(request);
    }

    @GetMapping("/{id}")
    public Mono<IndividualCoreIdentity> getById(
            @PathVariable UUID id) {

        return service.getById(id);
    }

    @GetMapping
    public Flux<IndividualCoreIdentity> getAll() {
        return service.getAll();
    }
}