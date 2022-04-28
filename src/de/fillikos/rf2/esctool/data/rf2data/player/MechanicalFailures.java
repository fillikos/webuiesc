package de.fillikos.rf2.esctool.data.rf2data.player;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CHAMP Failure Rate",
        "CURNT Failure Rate",
        "GPRIX Failure Rate",
        "GPRIX Failure Rate#",
        "MULTI Failure Rate",
        "RPLAY Failure Rate"
})
@Generated("jsonschema2pojo")
public class MechanicalFailures {

    @JsonProperty("CHAMP Failure Rate")
    private int cHAMP_Failure_Rate;
    @JsonProperty("CURNT Failure Rate")
    private int cURNT_Failure_Rate;
    @JsonProperty("GPRIX Failure Rate")
    private int gPRIX_Failure_Rate;
    @JsonProperty("GPRIX Failure Rate#")
    private String gPRIX_Failure_Rate_;
    @JsonProperty("MULTI Failure Rate")
    private int mULTI_Failure_Rate;
    @JsonProperty("RPLAY Failure Rate")
    private int rPLAY_Failure_Rate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public MechanicalFailures() {
    }

    /**
     * @param cURNT_Failure_Rate
     * @param rPLAY_Failure_Rate
     * @param mULTI_Failure_Rate
     * @param cHAMP_Failure_Rate
     * @param gPRIX_Failure_Rate
     * @param gPRIX_Failure_Rate_
     */
    public MechanicalFailures(int cHAMP_Failure_Rate, int cURNT_Failure_Rate, int gPRIX_Failure_Rate, String gPRIX_Failure_Rate_, int mULTI_Failure_Rate, int rPLAY_Failure_Rate) {
        super();
        this.cHAMP_Failure_Rate = cHAMP_Failure_Rate;
        this.cURNT_Failure_Rate = cURNT_Failure_Rate;
        this.gPRIX_Failure_Rate = gPRIX_Failure_Rate;
        this.gPRIX_Failure_Rate_ = gPRIX_Failure_Rate_;
        this.mULTI_Failure_Rate = mULTI_Failure_Rate;
        this.rPLAY_Failure_Rate = rPLAY_Failure_Rate;
    }

    @JsonProperty("CHAMP Failure Rate")
    public int getCHAMP_Failure_Rate() {
        return cHAMP_Failure_Rate;
    }

    @JsonProperty("CHAMP Failure Rate")
    public void setCHAMP_Failure_Rate(int cHAMP_Failure_Rate) {
        this.cHAMP_Failure_Rate = cHAMP_Failure_Rate;
    }

    @JsonProperty("CURNT Failure Rate")
    public int getCURNT_Failure_Rate() {
        return cURNT_Failure_Rate;
    }

    @JsonProperty("CURNT Failure Rate")
    public void setCURNT_Failure_Rate(int cURNT_Failure_Rate) {
        this.cURNT_Failure_Rate = cURNT_Failure_Rate;
    }

    @JsonProperty("GPRIX Failure Rate")
    public int getGPRIX_Failure_Rate() {
        return gPRIX_Failure_Rate;
    }

    @JsonProperty("GPRIX Failure Rate")
    public void setGPRIX_Failure_Rate(int gPRIX_Failure_Rate) {
        this.gPRIX_Failure_Rate = gPRIX_Failure_Rate;
    }

    @JsonProperty("GPRIX Failure Rate#")
    public String getGPRIX_Failure_Rate_() {
        return gPRIX_Failure_Rate_;
    }

    @JsonProperty("GPRIX Failure Rate#")
    public void setGPRIX_Failure_Rate_(String gPRIX_Failure_Rate_) {
        this.gPRIX_Failure_Rate_ = gPRIX_Failure_Rate_;
    }

    @JsonProperty("MULTI Failure Rate")
    public int getMULTI_Failure_Rate() {
        return mULTI_Failure_Rate;
    }

    @JsonProperty("MULTI Failure Rate")
    public void setMULTI_Failure_Rate(int mULTI_Failure_Rate) {
        this.mULTI_Failure_Rate = mULTI_Failure_Rate;
    }

    @JsonProperty("RPLAY Failure Rate")
    public int getRPLAY_Failure_Rate() {
        return rPLAY_Failure_Rate;
    }

    @JsonProperty("RPLAY Failure Rate")
    public void setRPLAY_Failure_Rate(int rPLAY_Failure_Rate) {
        this.rPLAY_Failure_Rate = rPLAY_Failure_Rate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MechanicalFailures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cHAMP_Failure_Rate");
        sb.append('=');
        sb.append(this.cHAMP_Failure_Rate);
        sb.append(',');
        sb.append("cURNT_Failure_Rate");
        sb.append('=');
        sb.append(this.cURNT_Failure_Rate);
        sb.append(',');
        sb.append("gPRIX_Failure_Rate");
        sb.append('=');
        sb.append(this.gPRIX_Failure_Rate);
        sb.append(',');
        sb.append("gPRIX_Failure_Rate_");
        sb.append('=');
        sb.append(((this.gPRIX_Failure_Rate_ == null) ? "<null>" : this.gPRIX_Failure_Rate_));
        sb.append(',');
        sb.append("mULTI_Failure_Rate");
        sb.append('=');
        sb.append(this.mULTI_Failure_Rate);
        sb.append(',');
        sb.append("rPLAY_Failure_Rate");
        sb.append('=');
        sb.append(this.rPLAY_Failure_Rate);
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + this.cURNT_Failure_Rate);
        result = ((result * 31) + this.rPLAY_Failure_Rate);
        result = ((result * 31) + this.mULTI_Failure_Rate);
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + this.cHAMP_Failure_Rate);
        result = ((result * 31) + this.gPRIX_Failure_Rate);
        result = ((result * 31) + ((this.gPRIX_Failure_Rate_ == null) ? 0 : this.gPRIX_Failure_Rate_.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MechanicalFailures) == false) {
            return false;
        }
        MechanicalFailures rhs = ((MechanicalFailures) other);
        return (((((((this.cURNT_Failure_Rate == rhs.cURNT_Failure_Rate) && (this.rPLAY_Failure_Rate == rhs.rPLAY_Failure_Rate)) && (this.mULTI_Failure_Rate == rhs.mULTI_Failure_Rate)) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && (this.cHAMP_Failure_Rate == rhs.cHAMP_Failure_Rate)) && (this.gPRIX_Failure_Rate == rhs.gPRIX_Failure_Rate)) && ((this.gPRIX_Failure_Rate_ == rhs.gPRIX_Failure_Rate_) || ((this.gPRIX_Failure_Rate_ != null) && this.gPRIX_Failure_Rate_.equals(rhs.gPRIX_Failure_Rate_))));
    }

}
