package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Getter
@Setter
public class CategoryMasterPK implements Serializable {

    private static final long serialVersionUID = -8219317731797822407L;

    @Column(name = "PROMO_CODE")
    private String promoCode;

    @Column(name = "CATEGORY")
    private String categoryVal;

    @Column(name = "SUB_CATEGORY")
    private String categorySubVal;

}
