package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class BillPayCategoryPK implements Serializable {

    private static final long serialVersionUID = -4086761280107914516L;

    @Column(name = "BILL_PAY_CATEGORY")
    private String billerCategory;

    @Column(name = "PARENT_CATEGORY")
    private String parentCategory;
}
