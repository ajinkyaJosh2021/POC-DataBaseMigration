package com.hdfc.data.poc.data.migration.entity;


import com.opencsv.bean.CsvBindByPosition;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

//@Entity
public class ApplicationGenParam {
    // @EmbeddedId
    //ApplicationGenParamPK applicationGenParamPK;

    @CsvBindByPosition(position = 0)
    private String paramKey;

    //@Column(name = "SUB_PARAM_KEY")
    @CsvBindByPosition(position = 2)
    private String subParamKey;

    //@Column(name = "PARAM_VALUE")
    @CsvBindByPosition(position = 1)
    private String paramValue;

    //@GeneratedValue(strategy = GenerationType.AUTO)
    @CsvBindByPosition(position = 10)
    private Long id;

    //@Column(name = "PARAM_DESC")
    @CsvBindByPosition(position = 14)
    private String paramDescription;

    //@Column(name = "DISPLAY_SEQ")

    @CsvBindByPosition(position = 8)
    private String displaySeq;

    //@Column(name = "STATUS")

    @CsvBindByPosition(position = 18)
    private Character status;

    //@Column(name = "MODIFIED_BY")

    @CsvBindByPosition(position = 12)
    private String modifiedBy;

    //@Column(name = "MODIFIED_DT")

    @CsvBindByPosition(position = 13)
    private Timestamp modifiedDate;

    //@Column(name = "CREATED_BY")

    @CsvBindByPosition(position = 5)
    private String createdBy;

    //@Column(name = "CREATED_DT")

    @CsvBindByPosition(position = 6)
    private Timestamp createdDate;

    //@Column(name = "MIG_DAT")

    @CsvBindByPosition(position = 11)
    private Timestamp migDate;

    //@Column(name = "REQ_NO")

    @CsvBindByPosition(position = 17)
    private String requestNo;

    //@Column(name = "ACTION")

    @CsvBindByPosition(position = 3)
    private String action;

    //@Column(name = "PARAM_TYPE")

    @CsvBindByPosition(position = 15)
    private String paramType;

    //@Column(name = "GENERIC_PARAM")

    @CsvBindByPosition(position = 9)
    private String genericParam;

    //@Column(name = "PATTERN")

    @CsvBindByPosition(position = 16)
    private String pattern;

    //@Column(name = "SUB_PARAM_TYPE")

    @CsvBindByPosition(position = 19)
    private String subParamType;

    //@Column(name = "DATA_TYPE")

    @CsvBindByPosition(position = 7)
    private String dataType;

    //@Column(name = "CACHE_REQUIRED")

    @CsvBindByPosition(position = 4)
    private String cacheRequired;


    public ApplicationGenParam() {
    }

    public List<String> compareTo(ApplicationGenParam applicationGenParam) {
        List<String> response = new ArrayList<>();
        Field[] fields = ApplicationGenParam.class.getDeclaredFields();

        for (Field field : fields) {
            try {
                String line6 = (String)( field.get(applicationGenParam) != null ? field.get(applicationGenParam).toString():null);
                String line5 = (String)(field.get(this)!= null ? field.get(this).toString():null);

                if (line6 == null && line5 != null) {
                    response.add(new String("Line 6 " + field.getName() + " column is empty"));
                    continue;
                }
                if (line5 == null && line6 != null) {
                    response.add(new String("Line 5 " + field.getName() + " column is empty"));
                    continue;
                }
                if (line5 == null && line6 == null)
                    continue;

                if (!line5.equals(line6)) {
                    response.add(new String("Line 5 " + field.getName() + " column is not matching with line 6"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return response;
    }

}
