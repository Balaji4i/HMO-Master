package model.vo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Nov 05 15:57:44 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HMOBupaDtl_VORowImpl extends ViewRowImpl {


    public static final int ENTITY_HMOBUPADTL_EO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        BupaAgeCategory,
        BupaAgeCategoryCost,
        CreatedBy,
        CreationDate,
        HmoBupaDtlId,
        HmoMasterHdrId,
        LastUpdateDate,
        LastUpdateLogin,
        LastUpdatedBy,
        Trans_Category,
        BupaCategoryType,
        Trans_BupaCatType,
        HmoOptions,
        HmoCategory,
        AgeCategory,
        AgeCategoryCost,
        Lookup_ROVO,
        Lookup_BupaCategoryType,
        HMO_Options_ROVO1,
        HMO_Category_ROVO1;
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


    public static final int BUPAAGECATEGORY = AttributesEnum.BupaAgeCategory.index();
    public static final int BUPAAGECATEGORYCOST = AttributesEnum.BupaAgeCategoryCost.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int HMOBUPADTLID = AttributesEnum.HmoBupaDtlId.index();
    public static final int HMOMASTERHDRID = AttributesEnum.HmoMasterHdrId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int TRANS_CATEGORY = AttributesEnum.Trans_Category.index();
    public static final int BUPACATEGORYTYPE = AttributesEnum.BupaCategoryType.index();
    public static final int TRANS_BUPACATTYPE = AttributesEnum.Trans_BupaCatType.index();
    public static final int HMOOPTIONS = AttributesEnum.HmoOptions.index();
    public static final int HMOCATEGORY = AttributesEnum.HmoCategory.index();
    public static final int AGECATEGORY = AttributesEnum.AgeCategory.index();
    public static final int AGECATEGORYCOST = AttributesEnum.AgeCategoryCost.index();
    public static final int LOOKUP_ROVO = AttributesEnum.Lookup_ROVO.index();
    public static final int LOOKUP_BUPACATEGORYTYPE = AttributesEnum.Lookup_BupaCategoryType.index();
    public static final int HMO_OPTIONS_ROVO1 = AttributesEnum.HMO_Options_ROVO1.index();
    public static final int HMO_CATEGORY_ROVO1 = AttributesEnum.HMO_Category_ROVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public HMOBupaDtl_VORowImpl() {
    }

    /**
     * Gets HMOBupaDtl_EO entity object.
     * @return the HMOBupaDtl_EO
     */
    public EntityImpl getHMOBupaDtl_EO() {
        return (EntityImpl) getEntity(ENTITY_HMOBUPADTL_EO);
    }

    /**
     * Gets the attribute value for BUPA_AGE_CATEGORY using the alias name BupaAgeCategory.
     * @return the BUPA_AGE_CATEGORY
     */
    public String getBupaAgeCategory() {
        return (String) getAttributeInternal(BUPAAGECATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for BUPA_AGE_CATEGORY using the alias name BupaAgeCategory.
     * @param value value to set the BUPA_AGE_CATEGORY
     */
    public void setBupaAgeCategory(String value) {
        setAttributeInternal(BUPAAGECATEGORY, value);
    }

    /**
     * Gets the attribute value for BUPA_AGE_CATEGORY_COST using the alias name BupaAgeCategoryCost.
     * @return the BUPA_AGE_CATEGORY_COST
     */
    public BigDecimal getBupaAgeCategoryCost() {
        return (BigDecimal) getAttributeInternal(BUPAAGECATEGORYCOST);
    }

    /**
     * Sets <code>value</code> as attribute value for BUPA_AGE_CATEGORY_COST using the alias name BupaAgeCategoryCost.
     * @param value value to set the BUPA_AGE_CATEGORY_COST
     */
    public void setBupaAgeCategoryCost(BigDecimal value) {
        setAttributeInternal(BUPAAGECATEGORYCOST, value);
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
     * Gets the attribute value for HMO_BUPA_DTL_ID using the alias name HmoBupaDtlId.
     * @return the HMO_BUPA_DTL_ID
     */
    public BigDecimal getHmoBupaDtlId() {
        return (BigDecimal) getAttributeInternal(HMOBUPADTLID);
    }

    /**
     * Sets <code>value</code> as attribute value for HMO_BUPA_DTL_ID using the alias name HmoBupaDtlId.
     * @param value value to set the HMO_BUPA_DTL_ID
     */
    public void setHmoBupaDtlId(BigDecimal value) {
        setAttributeInternal(HMOBUPADTLID, value);
    }

    /**
     * Gets the attribute value for HMO_MASTER_HDR_ID using the alias name HmoMasterHdrId.
     * @return the HMO_MASTER_HDR_ID
     */
    public BigDecimal getHmoMasterHdrId() {
        return (BigDecimal) getAttributeInternal(HMOMASTERHDRID);
    }

    /**
     * Sets <code>value</code> as attribute value for HMO_MASTER_HDR_ID using the alias name HmoMasterHdrId.
     * @param value value to set the HMO_MASTER_HDR_ID
     */
    public void setHmoMasterHdrId(BigDecimal value) {
        setAttributeInternal(HMOMASTERHDRID, value);
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
     * Gets the attribute value for the calculated attribute Trans_Category.
     * @return the Trans_Category
     */
    public String getTrans_Category() {
        String type = null;
        String name = null;
        if (getBupaAgeCategory() != null) {
            type = getBupaAgeCategory();
            Row[] orgRows;
            orgRows = getLookup_ROVO().getFilteredRows("LookupValueCode", type);
            System.err.println("Typee" + type);
            if (orgRows.length > 0) {
                name = orgRows[0].getAttribute("LookupValueNameDisp").toString();
            }
            return name;
        } else {
            // return (String) getAttributeInternal(TRANS_CATEGORY);}
            return (String) getAttributeInternal(TRANS_CATEGORY);
        }
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trans_Category.
     * @param value value to set the  Trans_Category
     */
    public void setTrans_Category(String value) {
        setAttributeInternal(TRANS_CATEGORY, value);
    }

    /**
     * Gets the attribute value for BUPA_CATEGORY_TYPE using the alias name BupaCategoryType.
     * @return the BUPA_CATEGORY_TYPE
     */
    public String getBupaCategoryType() {
        return (String) getAttributeInternal(BUPACATEGORYTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for BUPA_CATEGORY_TYPE using the alias name BupaCategoryType.
     * @param value value to set the BUPA_CATEGORY_TYPE
     */
    public void setBupaCategoryType(String value) {
        setAttributeInternal(BUPACATEGORYTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Trans_BupaCatType.
     * @return the Trans_BupaCatType
     */
    public String getTrans_BupaCatType() {
        String type = null;
                       String name = null;
                       if (getBupaCategoryType() != null) {
                           type = getBupaCategoryType();
                           Row[] orgRows;
                           orgRows = getLookup_BupaCategoryType().getFilteredRows("LookupValueCode", type);
                           System.err.println("Typee"+type);
                           if (orgRows.length > 0) {
                               name = orgRows[0].getAttribute("LookupValueNameDisp").toString();
                           }
                           return name;
                                                               } else {
        return (String) getAttributeInternal(TRANS_BUPACATTYPE);}
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trans_BupaCatType.
     * @param value value to set the  Trans_BupaCatType
     */
    public void setTrans_BupaCatType(String value) {
        setAttributeInternal(TRANS_BUPACATTYPE, value);
    }

    /**
     * Gets the attribute value for HMO_OPTIONS using the alias name HmoOptions.
     * @return the HMO_OPTIONS
     */
    public String getHmoOptions() {
        return (String) getAttributeInternal(HMOOPTIONS);
    }

    /**
     * Sets <code>value</code> as attribute value for HMO_OPTIONS using the alias name HmoOptions.
     * @param value value to set the HMO_OPTIONS
     */
    public void setHmoOptions(String value) {
        setAttributeInternal(HMOOPTIONS, value);
    }

    /**
     * Gets the attribute value for HMO_CATEGORY using the alias name HmoCategory.
     * @return the HMO_CATEGORY
     */
    public String getHmoCategory() {
        return (String) getAttributeInternal(HMOCATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for HMO_CATEGORY using the alias name HmoCategory.
     * @param value value to set the HMO_CATEGORY
     */
    public void setHmoCategory(String value) {
        setAttributeInternal(HMOCATEGORY, value);
    }

    /**
     * Gets the attribute value for AGE_CATEGORY using the alias name AgeCategory.
     * @return the AGE_CATEGORY
     */
    public String getAgeCategory() {
        return (String) getAttributeInternal(AGECATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for AGE_CATEGORY using the alias name AgeCategory.
     * @param value value to set the AGE_CATEGORY
     */
    public void setAgeCategory(String value) {
        setAttributeInternal(AGECATEGORY, value);
    }

    /**
     * Gets the attribute value for AGE_CATEGORY_COST using the alias name AgeCategoryCost.
     * @return the AGE_CATEGORY_COST
     */
    public BigDecimal getAgeCategoryCost() {
        return (BigDecimal) getAttributeInternal(AGECATEGORYCOST);
    }

    /**
     * Sets <code>value</code> as attribute value for AGE_CATEGORY_COST using the alias name AgeCategoryCost.
     * @param value value to set the AGE_CATEGORY_COST
     */
    public void setAgeCategoryCost(BigDecimal value) {
        setAttributeInternal(AGECATEGORYCOST, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Lookup_ROVO.
     */
    public RowSet getLookup_ROVO() {
        return (RowSet) getAttributeInternal(LOOKUP_ROVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Lookup_BupaCategoryType.
     */
    public RowSet getLookup_BupaCategoryType() {
        return (RowSet) getAttributeInternal(LOOKUP_BUPACATEGORYTYPE);
    }

    /**
     * Gets the view accessor <code>RowSet</code> HMO_Options_ROVO1.
     */
    public RowSet getHMO_Options_ROVO1() {
        return (RowSet) getAttributeInternal(HMO_OPTIONS_ROVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> HMO_Category_ROVO1.
     */
    public RowSet getHMO_Category_ROVO1() {
        return (RowSet) getAttributeInternal(HMO_CATEGORY_ROVO1);
    }

}
