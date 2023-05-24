package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "MST_POS_CUSTTYPE_HIS")
public class MstPosCustTypeHis {

    @Id
    @Column(name = "hist_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "POS_CUSTTYPEID")
    private Long posCustTypeId;

    @Column(name = "CUST_TYPE")
    private String custType;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "MAKER_ID")
    private String makerId;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DATMAKE")
    private Timestamp makerDate;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "DATCHECK")
    private Timestamp checkerDate;

    @Column(name = "FLG_MNT_ACTION")
    private String flgMntAction;
}
