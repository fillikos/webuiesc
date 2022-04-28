package de.fillikos.rf2.esctool.data.rf2data.player;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Current Control File",
        "UI Gamepad Mouse - Final Speed (pixel/seconds)",
        "UI Gamepad Mouse - Final Speed (pixel/seconds)#",
        "UI Gamepad Mouse - Initial Speed (pixel/seconds)",
        "UI Gamepad Mouse - Initial Speed (pixel/seconds)#",
        "UI Gamepad Mouse - Time before accelerating (seconds)",
        "UI Gamepad Mouse - Time before accelerating (seconds)#",
        "UI Gamepad Mouse - Time to reach max speed (seconds)",
        "UI Gamepad Mouse - Time to reach max speed (seconds)#"
})
@Generated("jsonschema2pojo")
public class Controls {

    @JsonProperty("Current Control File")
    private String current_Control_File;
    @JsonProperty("UI Gamepad Mouse - Final Speed (pixel/seconds)")
    private int uI_Gamepad_Mouse___Final_Speed__pixel_seconds_;
    @JsonProperty("UI Gamepad Mouse - Final Speed (pixel/seconds)#")
    private String uI_Gamepad_Mouse___Final_Speed__pixel_seconds__;
    @JsonProperty("UI Gamepad Mouse - Initial Speed (pixel/seconds)")
    private int uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_;
    @JsonProperty("UI Gamepad Mouse - Initial Speed (pixel/seconds)#")
    private String uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__;
    @JsonProperty("UI Gamepad Mouse - Time before accelerating (seconds)")
    private float uI_Gamepad_Mouse___Time_before_accelerating__seconds_;
    @JsonProperty("UI Gamepad Mouse - Time before accelerating (seconds)#")
    private String uI_Gamepad_Mouse___Time_before_accelerating__seconds__;
    @JsonProperty("UI Gamepad Mouse - Time to reach max speed (seconds)")
    private float uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_;
    @JsonProperty("UI Gamepad Mouse - Time to reach max speed (seconds)#")
    private String uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Controls() {
    }

    /**
     * @param uI_Gamepad_Mouse___Time_before_accelerating__seconds_
     * @param uI_Gamepad_Mouse___Time_before_accelerating__seconds__
     * @param uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_
     * @param uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_
     * @param uI_Gamepad_Mouse___Final_Speed__pixel_seconds__
     * @param current_Control_File
     * @param uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__
     * @param uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__
     * @param uI_Gamepad_Mouse___Final_Speed__pixel_seconds_
     */
    public Controls(String current_Control_File, int uI_Gamepad_Mouse___Final_Speed__pixel_seconds_, String uI_Gamepad_Mouse___Final_Speed__pixel_seconds__, int uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_, String uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__, float uI_Gamepad_Mouse___Time_before_accelerating__seconds_, String uI_Gamepad_Mouse___Time_before_accelerating__seconds__, float uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_, String uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__) {
        super();
        this.current_Control_File = current_Control_File;
        this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds_ = uI_Gamepad_Mouse___Final_Speed__pixel_seconds_;
        this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds__ = uI_Gamepad_Mouse___Final_Speed__pixel_seconds__;
        this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_ = uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_;
        this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__ = uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__;
        this.uI_Gamepad_Mouse___Time_before_accelerating__seconds_ = uI_Gamepad_Mouse___Time_before_accelerating__seconds_;
        this.uI_Gamepad_Mouse___Time_before_accelerating__seconds__ = uI_Gamepad_Mouse___Time_before_accelerating__seconds__;
        this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_ = uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_;
        this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__ = uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__;
    }

    @JsonProperty("Current Control File")
    public String getCurrent_Control_File() {
        return current_Control_File;
    }

    @JsonProperty("Current Control File")
    public void setCurrent_Control_File(String current_Control_File) {
        this.current_Control_File = current_Control_File;
    }

    @JsonProperty("UI Gamepad Mouse - Final Speed (pixel/seconds)")
    public int getUI_Gamepad_Mouse___Final_Speed__pixel_seconds_() {
        return uI_Gamepad_Mouse___Final_Speed__pixel_seconds_;
    }

    @JsonProperty("UI Gamepad Mouse - Final Speed (pixel/seconds)")
    public void setUI_Gamepad_Mouse___Final_Speed__pixel_seconds_(int uI_Gamepad_Mouse___Final_Speed__pixel_seconds_) {
        this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds_ = uI_Gamepad_Mouse___Final_Speed__pixel_seconds_;
    }

    @JsonProperty("UI Gamepad Mouse - Final Speed (pixel/seconds)#")
    public String getUI_Gamepad_Mouse___Final_Speed__pixel_seconds__() {
        return uI_Gamepad_Mouse___Final_Speed__pixel_seconds__;
    }

    @JsonProperty("UI Gamepad Mouse - Final Speed (pixel/seconds)#")
    public void setUI_Gamepad_Mouse___Final_Speed__pixel_seconds__(String uI_Gamepad_Mouse___Final_Speed__pixel_seconds__) {
        this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds__ = uI_Gamepad_Mouse___Final_Speed__pixel_seconds__;
    }

    @JsonProperty("UI Gamepad Mouse - Initial Speed (pixel/seconds)")
    public int getUI_Gamepad_Mouse___Initial_Speed__pixel_seconds_() {
        return uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_;
    }

    @JsonProperty("UI Gamepad Mouse - Initial Speed (pixel/seconds)")
    public void setUI_Gamepad_Mouse___Initial_Speed__pixel_seconds_(int uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_) {
        this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_ = uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_;
    }

    @JsonProperty("UI Gamepad Mouse - Initial Speed (pixel/seconds)#")
    public String getUI_Gamepad_Mouse___Initial_Speed__pixel_seconds__() {
        return uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__;
    }

    @JsonProperty("UI Gamepad Mouse - Initial Speed (pixel/seconds)#")
    public void setUI_Gamepad_Mouse___Initial_Speed__pixel_seconds__(String uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__) {
        this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__ = uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__;
    }

    @JsonProperty("UI Gamepad Mouse - Time before accelerating (seconds)")
    public float getUI_Gamepad_Mouse___Time_before_accelerating__seconds_() {
        return uI_Gamepad_Mouse___Time_before_accelerating__seconds_;
    }

    @JsonProperty("UI Gamepad Mouse - Time before accelerating (seconds)")
    public void setUI_Gamepad_Mouse___Time_before_accelerating__seconds_(float uI_Gamepad_Mouse___Time_before_accelerating__seconds_) {
        this.uI_Gamepad_Mouse___Time_before_accelerating__seconds_ = uI_Gamepad_Mouse___Time_before_accelerating__seconds_;
    }

    @JsonProperty("UI Gamepad Mouse - Time before accelerating (seconds)#")
    public String getUI_Gamepad_Mouse___Time_before_accelerating__seconds__() {
        return uI_Gamepad_Mouse___Time_before_accelerating__seconds__;
    }

    @JsonProperty("UI Gamepad Mouse - Time before accelerating (seconds)#")
    public void setUI_Gamepad_Mouse___Time_before_accelerating__seconds__(String uI_Gamepad_Mouse___Time_before_accelerating__seconds__) {
        this.uI_Gamepad_Mouse___Time_before_accelerating__seconds__ = uI_Gamepad_Mouse___Time_before_accelerating__seconds__;
    }

    @JsonProperty("UI Gamepad Mouse - Time to reach max speed (seconds)")
    public float getUI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_() {
        return uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_;
    }

    @JsonProperty("UI Gamepad Mouse - Time to reach max speed (seconds)")
    public void setUI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_(float uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_) {
        this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_ = uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_;
    }

    @JsonProperty("UI Gamepad Mouse - Time to reach max speed (seconds)#")
    public String getUI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__() {
        return uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__;
    }

    @JsonProperty("UI Gamepad Mouse - Time to reach max speed (seconds)#")
    public void setUI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__(String uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__) {
        this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__ = uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__;
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
        sb.append(Controls.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("current_Control_File");
        sb.append('=');
        sb.append(((this.current_Control_File == null) ? "<null>" : this.current_Control_File));
        sb.append(',');
        sb.append("uI_Gamepad_Mouse___Final_Speed__pixel_seconds_");
        sb.append('=');
        sb.append(this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds_);
        sb.append(',');
        sb.append("uI_Gamepad_Mouse___Final_Speed__pixel_seconds__");
        sb.append('=');
        sb.append(((this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds__ == null) ? "<null>" : this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds__));
        sb.append(',');
        sb.append("uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_");
        sb.append('=');
        sb.append(this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_);
        sb.append(',');
        sb.append("uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__");
        sb.append('=');
        sb.append(((this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__ == null) ? "<null>" : this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__));
        sb.append(',');
        sb.append("uI_Gamepad_Mouse___Time_before_accelerating__seconds_");
        sb.append('=');
        sb.append(this.uI_Gamepad_Mouse___Time_before_accelerating__seconds_);
        sb.append(',');
        sb.append("uI_Gamepad_Mouse___Time_before_accelerating__seconds__");
        sb.append('=');
        sb.append(((this.uI_Gamepad_Mouse___Time_before_accelerating__seconds__ == null) ? "<null>" : this.uI_Gamepad_Mouse___Time_before_accelerating__seconds__));
        sb.append(',');
        sb.append("uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_");
        sb.append('=');
        sb.append(this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_);
        sb.append(',');
        sb.append("uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__");
        sb.append('=');
        sb.append(((this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__ == null) ? "<null>" : this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__));
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
        result = ((result * 31) + Float.floatToIntBits(this.uI_Gamepad_Mouse___Time_before_accelerating__seconds_));
        result = ((result * 31) + ((this.uI_Gamepad_Mouse___Time_before_accelerating__seconds__ == null) ? 0 : this.uI_Gamepad_Mouse___Time_before_accelerating__seconds__.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_));
        result = ((result * 31) + this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_);
        result = ((result * 31) + ((this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds__ == null) ? 0 : this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds__.hashCode()));
        result = ((result * 31) + ((this.current_Control_File == null) ? 0 : this.current_Control_File.hashCode()));
        result = ((result * 31) + ((this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__ == null) ? 0 : this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__.hashCode()));
        result = ((result * 31) + ((this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__ == null) ? 0 : this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__.hashCode()));
        result = ((result * 31) + this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds_);
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Controls) == false) {
            return false;
        }
        Controls rhs = ((Controls) other);
        return ((((((((((Float.floatToIntBits(this.uI_Gamepad_Mouse___Time_before_accelerating__seconds_) == Float.floatToIntBits(rhs.uI_Gamepad_Mouse___Time_before_accelerating__seconds_)) && ((this.uI_Gamepad_Mouse___Time_before_accelerating__seconds__ == rhs.uI_Gamepad_Mouse___Time_before_accelerating__seconds__) || ((this.uI_Gamepad_Mouse___Time_before_accelerating__seconds__ != null) && this.uI_Gamepad_Mouse___Time_before_accelerating__seconds__.equals(rhs.uI_Gamepad_Mouse___Time_before_accelerating__seconds__)))) && (Float.floatToIntBits(this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_) == Float.floatToIntBits(rhs.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds_))) && (this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_ == rhs.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds_)) && ((this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds__ == rhs.uI_Gamepad_Mouse___Final_Speed__pixel_seconds__) || ((this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds__ != null) && this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds__.equals(rhs.uI_Gamepad_Mouse___Final_Speed__pixel_seconds__)))) && ((this.current_Control_File == rhs.current_Control_File) || ((this.current_Control_File != null) && this.current_Control_File.equals(rhs.current_Control_File)))) && ((this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__ == rhs.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__) || ((this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__ != null) && this.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__.equals(rhs.uI_Gamepad_Mouse___Time_to_reach_max_speed__seconds__)))) && ((this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__ == rhs.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__) || ((this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__ != null) && this.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__.equals(rhs.uI_Gamepad_Mouse___Initial_Speed__pixel_seconds__)))) && (this.uI_Gamepad_Mouse___Final_Speed__pixel_seconds_ == rhs.uI_Gamepad_Mouse___Final_Speed__pixel_seconds_)) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
