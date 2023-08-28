package model.vo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Sep 26 15:40:13 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DutyAllowance_VORowImpl extends ViewRowImpl {


    public static final int ENTITY_DUTYALLOWANCE_EO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AllowanceAmount,
        AllowanceDays,
        AllowanceRate,
        AllowanceType,
        ApprovalStatus,
        BusinessUnitId,
        Comments,
        CreatedBy,
        CreationDate,
        EndDate,
        ExtraDutyAllowanceId,
        ExtraDutyAllowanceNo,
        LastUpdateDate,
        LastUpdateLogin,
        LastUpdatedBy,
        PersonId,
        StartDate,
        TransactionDate,
        Trans_Allowance,
        Name_Trns,
        Number_Trns,
        Email_Trns,
        Group_Trns,
        trans_test,
        DutyAllow_ROVO,
        Employee_View_ROVO;
        private static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ALLOWANCEAMOUNT = AttributesEnum.AllowanceAmount.index();
    public static final int ALLOWANCEDAYS = AttributesEnum.AllowanceDays.index();
    public static final int ALLOWANCERATE = AttributesEnum.AllowanceRate.index();
    public static final int ALLOWANCETYPE = AttributesEnum.AllowanceType.index();
    public static final int APPROVALSTATUS = AttributesEnum.ApprovalStatus.index();
    public static final int BUSINESSUNITID = AttributesEnum.BusinessUnitId.index();
    public static final int COMMENTS = AttributesEnum.Comments.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int EXTRADUTYALLOWANCEID = AttributesEnum.ExtraDutyAllowanceId.index();
    public static final int EXTRADUTYALLOWANCENO = AttributesEnum.ExtraDutyAllowanceNo.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int PERSONID = AttributesEnum.PersonId.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int TRANSACTIONDATE = AttributesEnum.TransactionDate.index();
    public static final int TRANS_ALLOWANCE = AttributesEnum.Trans_Allowance.index();
    public static final int NAME_TRNS = AttributesEnum.Name_Trns.index();
    public static final int NUMBER_TRNS = AttributesEnum.Number_Trns.index();
    public static final int EMAIL_TRNS = AttributesEnum.Email_Trns.index();
    public static final int GROUP_TRNS = AttributesEnum.Group_Trns.index();
    public static final int TRANS_TEST = AttributesEnum.trans_test.index();
    public static final int DUTYALLOW_ROVO = AttributesEnum.DutyAllow_ROVO.index();
    public static final int EMPLOYEE_VIEW_ROVO = AttributesEnum.Employee_View_ROVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DutyAllowance_VORowImpl() {
    }

    /**
     * Gets DutyAllowance_EO entity object.
     * @return the DutyAllowance_EO
     */
    public EntityImpl getDutyAllowance_EO() {
        return (EntityImpl) getEntity(ENTITY_DUTYALLOWANCE_EO);
    }

    /**
     * Gets the attribute value for ALLOWANCE_AMOUNT using the alias name AllowanceAmount.
     * @return the ALLOWANCE_AMOUNT
     */
    public BigDecimal getAllowanceAmount() {

        return (BigDecimal) getAttributeInternal(ALLOWANCEAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOWANCE_AMOUNT using the alias name AllowanceAmount.
     * @param value value to set the ALLOWANCE_AMOUNT
     */
    public void setAllowanceAmount(BigDecimal value) {
        setAttributeInternal(ALLOWANCEAMOUNT, value);
    }

    /**
     * Gets the attribute value for ALLOWANCE_DAYS using the alias name AllowanceDays.
     * @return the ALLOWANCE_DAYS
     */
    public BigDecimal getAllowanceDays() {
        return (BigDecimal) getAttributeInternal(ALLOWANCEDAYS);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOWANCE_DAYS using the alias name AllowanceDays.
     * @param value value to set the ALLOWANCE_DAYS
     */
    public void setAllowanceDays(BigDecimal value) {
        setAttributeInternal(ALLOWANCEDAYS, value);
    }

    /**
     * Gets the attribute value for ALLOWANCE_RATE using the alias name AllowanceRate.
     * @return the ALLOWANCE_RATE
     */
    public BigDecimal getAllowanceRate() {
        return (BigDecimal) getAttributeInternal(ALLOWANCERATE);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOWANCE_RATE using the alias name AllowanceRate.
     * @param value value to set the ALLOWANCE_RATE
     */
    public void setAllowanceRate(BigDecimal value) {
        setAttributeInternal(ALLOWANCERATE, value);
    }

    /**
     * Gets the attribute value for ALLOWANCE_TYPE using the alias name AllowanceType.
     * @return the ALLOWANCE_TYPE
     */
    public String getAllowanceType() {
        return (String) getAttributeInternal(ALLOWANCETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for ALLOWANCE_TYPE using the alias name AllowanceType.
     * @param value value to set the ALLOWANCE_TYPE
     */
    public void setAllowanceType(String value) {
        setAttributeInternal(ALLOWANCETYPE, value);
    }

    /**
     * Gets the attribute value for APPROVAL_STATUS using the alias name ApprovalStatus.
     * @return the APPROVAL_STATUS
     */
    public String getApprovalStatus() {
        return (String) getAttributeInternal(APPROVALSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for APPROVAL_STATUS using the alias name ApprovalStatus.
     * @param value value to set the APPROVAL_STATUS
     */
    public void setApprovalStatus(String value) {
        
        setAttributeInternal(APPROVALSTATUS, value);
    }

    /**
     * Gets the attribute value for BUSINESS_UNIT_ID using the alias name BusinessUnitId.
     * @return the BUSINESS_UNIT_ID
     */
    public BigDecimal getBusinessUnitId() {
        return (BigDecimal) getAttributeInternal(BUSINESSUNITID);
    }

    /**
     * Sets <code>value</code> as attribute value for BUSINESS_UNIT_ID using the alias name BusinessUnitId.
     * @param value value to set the BUSINESS_UNIT_ID
     */
    public void setBusinessUnitId(BigDecimal value) {
        setAttributeInternal(BUSINESSUNITID, value);
    }

    /**
     * Gets the attribute value for COMMENTS using the alias name Comments.
     * @return the COMMENTS
     */
    public String getComments() {
        return (String) getAttributeInternal(COMMENTS);
    }

    /**
     * Sets <code>value</code> as attribute value for COMMENTS using the alias name Comments.
     * @param value value to set the COMMENTS
     */
    public void setComments(String value) {
        setAttributeInternal(COMMENTS, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }


    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }


    /**
     * Gets the attribute value for END_DATE using the alias name EndDate.
     * @return the END_DATE
     */
    public Timestamp getEndDate() {
        return (Timestamp) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for END_DATE using the alias name EndDate.
     * @param value value to set the END_DATE
     */
    public void setEndDate(Timestamp value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for EXTRA_DUTY_ALLOWANCE_ID using the alias name ExtraDutyAllowanceId.
     * @return the EXTRA_DUTY_ALLOWANCE_ID
     */
    public BigDecimal getExtraDutyAllowanceId() {
        return (BigDecimal) getAttributeInternal(EXTRADUTYALLOWANCEID);
    }

    /**
     * Sets <code>value</code> as attribute value for EXTRA_DUTY_ALLOWANCE_ID using the alias name ExtraDutyAllowanceId.
     * @param value value to set the EXTRA_DUTY_ALLOWANCE_ID
     */
    public void setExtraDutyAllowanceId(BigDecimal value) {
        setAttributeInternal(EXTRADUTYALLOWANCEID, value);
    }

    /**
     * Gets the attribute value for EXTRA_DUTY_ALLOWANCE_NO using the alias name ExtraDutyAllowanceNo.
     * @return the EXTRA_DUTY_ALLOWANCE_NO
     */
    public String getExtraDutyAllowanceNo() {
        return (String) getAttributeInternal(EXTRADUTYALLOWANCENO);
    }

    /**
     * Sets <code>value</code> as attribute value for EXTRA_DUTY_ALLOWANCE_NO using the alias name ExtraDutyAllowanceNo.
     * @param value value to set the EXTRA_DUTY_ALLOWANCE_NO
     */
    public void setExtraDutyAllowanceNo(String value) {
        setAttributeInternal(EXTRADUTYALLOWANCENO, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }


    /**
     * Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @return the LAST_UPDATE_LOGIN
     */
    public String getLastUpdateLogin() {
        return (String) getAttributeInternal(LASTUPDATELOGIN);
    }


    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }


    /**
     * Gets the attribute value for PERSON_ID using the alias name PersonId.
     * @return the PERSON_ID
     */
    public BigDecimal getPersonId() {
        return (BigDecimal) getAttributeInternal(PERSONID);
    }

    /**
     * Sets <code>value</code> as attribute value for PERSON_ID using the alias name PersonId.
     * @param value value to set the PERSON_ID
     */
    public void setPersonId(BigDecimal value) {
        setAttributeInternal(PERSONID, value);
    }

    /**
     * Gets the attribute value for START_DATE using the alias name StartDate.
     * @return the START_DATE
     */
    public Timestamp getStartDate() {
        return (Timestamp) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for START_DATE using the alias name StartDate.
     * @param value value to set the START_DATE
     */
    public void setStartDate(Timestamp value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for TRANSACTION_DATE using the alias name TransactionDate.
     * @return the TRANSACTION_DATE
     */
    public Timestamp getTransactionDate() {
        return (Timestamp) getAttributeInternal(TRANSACTIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TRANSACTION_DATE using the alias name TransactionDate.
     * @param value value to set the TRANSACTION_DATE
     */
    public void setTransactionDate(Timestamp value) {
        setAttributeInternal(TRANSACTIONDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Trans_Allowance.
     * @return the Trans_Allowance
     */
    public String getTrans_Allowance() {
        String type = null;
        String name = null;
        if (getAllowanceType() != null) {
            type = getAllowanceType();
            Row[] orgRows;
            orgRows = getDutyAllow_ROVO().getFilteredRows("Allowance", type);
            if (orgRows.length > 0) {
                name = orgRows[0].getAttribute("Description").toString();
            }
            return name;

        } else {
            return (String) getAttributeInternal(TRANS_ALLOWANCE);
        }
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trans_Allowance.
     * @param value value to set the  Trans_Allowance
     */
    public void setTrans_Allowance(String value) {
        setAttributeInternal(TRANS_ALLOWANCE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Name_Trns.
     * @return the Name_Trns
     */
    public String getName_Trns() {

        BigDecimal type = null;
        String name = null;
        if (getPersonId() != null) {
            type = (BigDecimal) getPersonId();
            Row[] orgRows;
            orgRows = getEmployee_View_ROVO().getFilteredRows("PersonId", type);
            if (orgRows.length > 0) {
                name = orgRows[0].getAttribute("FullName").toString();
            }
            return name;
        } else {

            return (String) getAttributeInternal(NAME_TRNS);
        }


    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Name_Trns.
     * @param value value to set the  Name_Trns
     */
    public void setName_Trns(String value) {
        setAttributeInternal(NAME_TRNS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Number_Trns.
     * @return the Number_Trns
     */
    public String getNumber_Trns() {
        BigDecimal type = null;
        String name = null;
        if (getPersonId() != null) {
            type = (BigDecimal) getPersonId();
            Row[] orgRows;
            orgRows = getEmployee_View_ROVO().getFilteredRows("PersonId", type);
            if (orgRows.length > 0) {
                name = orgRows[0].getAttribute("PersonNumber").toString();
            }
            return name;
        } else {
            return (String) getAttributeInternal(NUMBER_TRNS);

        }


    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Number_Trns.
     * @param value value to set the  Number_Trns
     */
    public void setNumber_Trns(String value) {
        setAttributeInternal(NUMBER_TRNS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Email_Trns.
     * @return the Email_Trns
     */
    public String getEmail_Trns() {
        
                                                        
        BigDecimal type = null;
        String name = null;
        if (getPersonId() != null) {
        type = (BigDecimal)getPersonId();
        Row[] orgRows;
        orgRows = getEmployee_View_ROVO().getFilteredRows("PersonId", type);
        if (orgRows.length > 0) {
        name = orgRows[0].getAttribute("EmailAddress").toString();
        }
        return name;
                                } else {
                                                    return (String) getAttributeInternal(EMAIL_TRNS);
                                                }
        
        
        
       
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Email_Trns.
     * @param value value to set the  Email_Trns
     */
    public void setEmail_Trns(String value) {
        setAttributeInternal(EMAIL_TRNS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Group_Trns.
     * @return the Group_Trns
     */
    public String getGroup_Trns() {
        BigDecimal type = null;
                       String name = null;
                       if (getPersonId() != null) {
                           type = (BigDecimal)getPersonId();
                           Row[] orgRows;
                           orgRows = getEmployee_View_ROVO().getFilteredRows("PersonId", type);
                           if (orgRows.length > 0) {
                               name = orgRows[0].getAttribute("BusinessUnitName").toString();
                           }
                           return name;
                                                               } else {
                                                                                   return (String) getAttributeInternal(GROUP_TRNS);
                                                                               }
        
        
        
      
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Group_Trns.
     * @param value value to set the  Group_Trns
     */
    public void setGroup_Trns(String value) {
        setAttributeInternal(GROUP_TRNS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute trans_test.
     * @return the trans_test
     */
    public String gettrans_test() {
        return (String) getAttributeInternal(TRANS_TEST);
    }

    /**
     * Gets the view accessor <code>RowSet</code> DutyAllow_ROVO.
     */
    public RowSet getDutyAllow_ROVO() {
        return (RowSet) getAttributeInternal(DUTYALLOW_ROVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Employee_View_ROVO.
     */
    public RowSet getEmployee_View_ROVO() {
        return (RowSet) getAttributeInternal(EMPLOYEE_VIEW_ROVO);
    }
}

