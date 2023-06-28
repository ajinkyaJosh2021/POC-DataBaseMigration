package com.hdfc.data.poc.data.migration.enums;

import com.hdfc.data.poc.data.migration.constant.Constants;

public enum PubSubType {

    BANK_CODE(new String[]{"bankCode"}, false),

    TXN_BLACKOUT(new String[]{"applicationName", Constants.TXN_ID, "channel", "startTime", "endTime"}, true),

    BLACKLIST_IFSC_CODE(new String[]{"ifscCode"}, false),

    CUSTOMER_TYPE(new String[]{"customerType"}, false),

    CREDIT_CARD_BIN(new String[]{"cardBin"}, false),

    DEBIT_CARD_BIN(new String[]{"cardBin"}, false),

    FCNR_CURRENCY(new String[]{Constants.CURRENCY_CODE}, false),

    CURRENCY(new String[]{Constants.CURRENCY_CODE}, false),

    FATCA_COUNTRY_MAINTENANCE(new String[]{Constants.COUNTRY_NAME}, false),

    FCURR_COUNTRY_MAINTENANCE(new String[]{Constants.COUNTRY_CODE}, false),

    FCNR_COUNTRY_MAINTENANCE(new String[]{Constants.COUNTRY_CODE}, false),

    FUND_TRANSFER_PROPERTY(new String[]{Constants.TXN_ID, "fromAccountType", "toAccountType"}, true),

    CUST_TYPE_TPT_LIMIT(new String[]{"custType"}, false),

    MCC_BLOCK(new String[]{"promoCode", "categoryVal", "categorySubVal"}, false),

    APP_GEN_PARAMETER(new String[]{"paramKey", "subParamKey", "paramValue"}, true),

    BLOCK_CODE_TRANSACTION_MAINTENANCE(new String[]{"blockCode"}, false),

    IPIN_POLICY(new String[]{}, false),//need to check

    CHALLAN_MAINTENACNE(new String[]{"merchantCode"}, false),

    FINANCIAL_INSTITUTION(new String[]{"institutionName"}, false),

    CHECKSUMKEY(new String[]{"systemId", "merchantId"}, false),

    ALERT_MAINTENANCE(new String[]{"txnId", "returnCode", "delMedium"}, false),
    MERCHANT_REDIRECTION_URL(new String[]{"merchantCode"}, false),
    RATE_OF_CONVERSION(new String[]{Constants.CURRENCY_CODE}, false),
    BAND_MAINTENANCE(new String[]{"ethnicCode"}, false),
    DD_PIN_MAINTENANCE(new String[]{"pinCode"}, false),
    CUSTOM_ERROR_MESSAGE(new String[]{"channelId", Constants.TXN_ID, "errorCode"}, false),
    IPIN_REGION_MAINTENANCE(new String[]{"branchCode", "branchRegion"}, false),
    THIRD_PARTY_SERVICE_MAINTENANCE_DETAILS(new String[]{"serviceId"}, false),
    API_TIMEOUT(new String[]{"apiHostKey", "apiEndPoint", "apiMethod", "channel"}, false),
    BILLER_CATEGORY(new String[]{"billerCategory", "parentCategory"}, false),
    PARENT_CATEGORY(new String[]{"parentCategory"}, false);


    private final String[] identifiers;
    private boolean isIdentifiersChangedInModification;

    PubSubType(String[] identifiers, boolean isIdentifiersChangedInModification) {
        this.identifiers = identifiers;
        this.isIdentifiersChangedInModification = isIdentifiersChangedInModification;
    }


    public String[] getIdentifiers() {
        return this.identifiers;
    }

    public boolean isIdentifiersChangedInModification() {
        return isIdentifiersChangedInModification;
    }
}
