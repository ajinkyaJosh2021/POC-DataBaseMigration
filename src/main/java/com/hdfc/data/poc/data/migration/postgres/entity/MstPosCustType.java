package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "MST_POS_CUSTTYPE")
public class MstPosCustType {

    @Id
    @Column(name = "POS_CUSTTYPEID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long posCustTypeId;

    @Column(name = "CUST_TYPE")
    private String custType;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "MAKER_ID")
    private String makerId;

    @Column(name = "STATUS")
    private String status ;

    @Column(name = "DATMAKE")
    private Timestamp makerDate;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "DATCHECK")
    private Timestamp checkerDate;

    @Column(name = "FLG_MNT_ACTION")
    private String flgMntAction;

    public MstPosCustType(String custType, String description, String makerId, Timestamp makerDate, String checkerId, Timestamp checkerDate) {
        this.custType = custType;
        this.description = description;
        this.makerId = makerId;
        this.makerDate = makerDate;
        this.checkerId = checkerId;
        this.checkerDate = checkerDate;
    }
}
