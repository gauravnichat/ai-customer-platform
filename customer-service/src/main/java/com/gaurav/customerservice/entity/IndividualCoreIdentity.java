package com.gaurav.customerservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table("individual_core_identity")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IndividualCoreIdentity {

    @Id
    private UUID id;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;
}