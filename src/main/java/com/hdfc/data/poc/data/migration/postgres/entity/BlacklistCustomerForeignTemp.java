package com.hdfc.data.poc.data.migration.postgres.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "BLACKLIST_CUSTOMER_FOREIGN_TEMP")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlacklistCustomerForeignTemp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerId;
    private String action;
    private String reqNo;

}
