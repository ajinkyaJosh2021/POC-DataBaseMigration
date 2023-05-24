package com.hdfc.data.poc.data.migration.entity;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class AlertsTemplate {

   // @CsvBindByPosition(position = 22)
    private String parentTxnId;

    //@CsvBindByPosition(position = 23)
    private String alertCase;

    //@CsvBindByPosition(position = 15)
    private String delMedium;

    //@CsvBindByPosition(position = 0)
    private String id;

    //@CsvBindByPosition(position = 17)
    private String tempId;

    //@CsvBindByPosition(position = 1)
    private String txnId;

    //@CsvBindByPosition(position = 3)
    private String message;

   // @CsvBindByPosition(position = 4)
    private String arg0;

    //@CsvBindByPosition(position = 5)
    private String arg1;

    //@CsvBindByPosition(position = 6)
    private String arg2;

    //@CsvBindByPosition(position = 7)
    private String arg3;

    //@CsvBindByPosition(position = 8)
    private String arg4;

    //@CsvBindByPosition(position = 9)
    private String arg5;

    //@CsvBindByPosition(position = 10)
    private String arg6;

    //@CsvBindByPosition(position = 11)
    private String arg7;

    //@CsvBindByPosition(position = 12)
    private String arg8;

//    @CsvBindByPosition(position = 13)
    private String arg9;

//    @CsvBindByPosition(position = 14)
    private String arg10;

//    @CsvBindByPosition(position = 16)
    private String returnCode;

//    @CsvBindByPosition(position =18 )
    private String makerId;

//    @CsvBindByPosition(position = 20)
    @CsvDate(value = "yyyy-MM-dd HH:mm:ss")
    private Timestamp makerDate;

//    @CsvBindByPosition(position =19 )
    private String checkerId;

//    @CsvBindByPosition(position = 21)
    @CsvDate(value = "yyyy-MM-dd HH:mm:ss")
    private Timestamp checkerDate;

//    @CsvBindByPosition(position = 24)
    private String reqNo;

//    @CsvBindByPosition(position = 25)
    private String action;

}