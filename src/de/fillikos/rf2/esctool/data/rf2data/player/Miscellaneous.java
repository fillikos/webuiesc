package de.fillikos.rf2.esctool.data.rf2data.player;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Auto Install Uninstalled Content In Packages Directory",
        "PlayerFilesReadOnly",
        "UI Auto Switch with Mod",
        "UI Auto Switch with Mod#",
        "UI State",
        "UI State#",
        "WebUI port",
        "WebUI port#",
        "enable UI Keyboard Nav",
        "enable UI Keyboard Nav#"
})
@Generated("jsonschema2pojo")
public class Miscellaneous {

    @JsonProperty("Auto Install Uninstalled Content In Packages Directory")
    private int auto_Install_Uninstalled_Content_In_Packages_Directory;
    @JsonProperty("PlayerFilesReadOnly")
    private int playerFilesReadOnly;
    @JsonProperty("UI Auto Switch with Mod")
    private int uI_Auto_Switch_with_Mod;
    @JsonProperty("UI Auto Switch with Mod#")
    private String uI_Auto_Switch_with_Mod_;
    @JsonProperty("UI State")
    private int uI_State;
    @JsonProperty("UI State#")
    private String uI_State_;
    @JsonProperty("WebUI port")
    private int webUI_port;
    @JsonProperty("WebUI port#")
    private String webUI_port_;
    @JsonProperty("enable UI Keyboard Nav")
    private int enable_UI_Keyboard_Nav;
    @JsonProperty("enable UI Keyboard Nav#")
    private String enable_UI_Keyboard_Nav_;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Miscellaneous() {
    }

    /**
     * @param auto_Install_Uninstalled_Content_In_Packages_Directory
     * @param webUI_port
     * @param uI_State
     * @param uI_State_
     * @param playerFilesReadOnly
     * @param webUI_port_
     * @param uI_Auto_Switch_with_Mod_
     * @param enable_UI_Keyboard_Nav_
     * @param uI_Auto_Switch_with_Mod
     * @param enable_UI_Keyboard_Nav
     */
    public Miscellaneous(int auto_Install_Uninstalled_Content_In_Packages_Directory, int playerFilesReadOnly, int uI_Auto_Switch_with_Mod, String uI_Auto_Switch_with_Mod_, int uI_State, String uI_State_, int webUI_port, String webUI_port_, int enable_UI_Keyboard_Nav, String enable_UI_Keyboard_Nav_) {
        super();
        this.auto_Install_Uninstalled_Content_In_Packages_Directory = auto_Install_Uninstalled_Content_In_Packages_Directory;
        this.playerFilesReadOnly = playerFilesReadOnly;
        this.uI_Auto_Switch_with_Mod = uI_Auto_Switch_with_Mod;
        this.uI_Auto_Switch_with_Mod_ = uI_Auto_Switch_with_Mod_;
        this.uI_State = uI_State;
        this.uI_State_ = uI_State_;
        this.webUI_port = webUI_port;
        this.webUI_port_ = webUI_port_;
        this.enable_UI_Keyboard_Nav = enable_UI_Keyboard_Nav;
        this.enable_UI_Keyboard_Nav_ = enable_UI_Keyboard_Nav_;
    }

    @JsonProperty("Auto Install Uninstalled Content In Packages Directory")
    public int getAuto_Install_Uninstalled_Content_In_Packages_Directory() {
        return auto_Install_Uninstalled_Content_In_Packages_Directory;
    }

    @JsonProperty("Auto Install Uninstalled Content In Packages Directory")
    public void setAuto_Install_Uninstalled_Content_In_Packages_Directory(int auto_Install_Uninstalled_Content_In_Packages_Directory) {
        this.auto_Install_Uninstalled_Content_In_Packages_Directory = auto_Install_Uninstalled_Content_In_Packages_Directory;
    }

    @JsonProperty("PlayerFilesReadOnly")
    public int getPlayerFilesReadOnly() {
        return playerFilesReadOnly;
    }

    @JsonProperty("PlayerFilesReadOnly")
    public void setPlayerFilesReadOnly(int playerFilesReadOnly) {
        this.playerFilesReadOnly = playerFilesReadOnly;
    }

    @JsonProperty("UI Auto Switch with Mod")
    public int getUI_Auto_Switch_with_Mod() {
        return uI_Auto_Switch_with_Mod;
    }

    @JsonProperty("UI Auto Switch with Mod")
    public void setUI_Auto_Switch_with_Mod(int uI_Auto_Switch_with_Mod) {
        this.uI_Auto_Switch_with_Mod = uI_Auto_Switch_with_Mod;
    }

    @JsonProperty("UI Auto Switch with Mod#")
    public String getUI_Auto_Switch_with_Mod_() {
        return uI_Auto_Switch_with_Mod_;
    }

    @JsonProperty("UI Auto Switch with Mod#")
    public void setUI_Auto_Switch_with_Mod_(String uI_Auto_Switch_with_Mod_) {
        this.uI_Auto_Switch_with_Mod_ = uI_Auto_Switch_with_Mod_;
    }

    @JsonProperty("UI State")
    public int getUI_State() {
        return uI_State;
    }

    @JsonProperty("UI State")
    public void setUI_State(int uI_State) {
        this.uI_State = uI_State;
    }

    @JsonProperty("UI State#")
    public String getUI_State_() {
        return uI_State_;
    }

    @JsonProperty("UI State#")
    public void setUI_State_(String uI_State_) {
        this.uI_State_ = uI_State_;
    }

    @JsonProperty("WebUI port")
    public int getWebUI_port() {
        return webUI_port;
    }

    @JsonProperty("WebUI port")
    public void setWebUI_port(int webUI_port) {
        this.webUI_port = webUI_port;
    }

    @JsonProperty("WebUI port#")
    public String getWebUI_port_() {
        return webUI_port_;
    }

    @JsonProperty("WebUI port#")
    public void setWebUI_port_(String webUI_port_) {
        this.webUI_port_ = webUI_port_;
    }

    @JsonProperty("enable UI Keyboard Nav")
    public int getEnable_UI_Keyboard_Nav() {
        return enable_UI_Keyboard_Nav;
    }

    @JsonProperty("enable UI Keyboard Nav")
    public void setEnable_UI_Keyboard_Nav(int enable_UI_Keyboard_Nav) {
        this.enable_UI_Keyboard_Nav = enable_UI_Keyboard_Nav;
    }

    @JsonProperty("enable UI Keyboard Nav#")
    public String getEnable_UI_Keyboard_Nav_() {
        return enable_UI_Keyboard_Nav_;
    }

    @JsonProperty("enable UI Keyboard Nav#")
    public void setEnable_UI_Keyboard_Nav_(String enable_UI_Keyboard_Nav_) {
        this.enable_UI_Keyboard_Nav_ = enable_UI_Keyboard_Nav_;
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
        sb.append(Miscellaneous.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("auto_Install_Uninstalled_Content_In_Packages_Directory");
        sb.append('=');
        sb.append(this.auto_Install_Uninstalled_Content_In_Packages_Directory);
        sb.append(',');
        sb.append("playerFilesReadOnly");
        sb.append('=');
        sb.append(this.playerFilesReadOnly);
        sb.append(',');
        sb.append("uI_Auto_Switch_with_Mod");
        sb.append('=');
        sb.append(this.uI_Auto_Switch_with_Mod);
        sb.append(',');
        sb.append("uI_Auto_Switch_with_Mod_");
        sb.append('=');
        sb.append(((this.uI_Auto_Switch_with_Mod_ == null) ? "<null>" : this.uI_Auto_Switch_with_Mod_));
        sb.append(',');
        sb.append("uI_State");
        sb.append('=');
        sb.append(this.uI_State);
        sb.append(',');
        sb.append("uI_State_");
        sb.append('=');
        sb.append(((this.uI_State_ == null) ? "<null>" : this.uI_State_));
        sb.append(',');
        sb.append("webUI_port");
        sb.append('=');
        sb.append(this.webUI_port);
        sb.append(',');
        sb.append("webUI_port_");
        sb.append('=');
        sb.append(((this.webUI_port_ == null) ? "<null>" : this.webUI_port_));
        sb.append(',');
        sb.append("enable_UI_Keyboard_Nav");
        sb.append('=');
        sb.append(this.enable_UI_Keyboard_Nav);
        sb.append(',');
        sb.append("enable_UI_Keyboard_Nav_");
        sb.append('=');
        sb.append(((this.enable_UI_Keyboard_Nav_ == null) ? "<null>" : this.enable_UI_Keyboard_Nav_));
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
        result = ((result * 31) + this.auto_Install_Uninstalled_Content_In_Packages_Directory);
        result = ((result * 31) + this.webUI_port);
        result = ((result * 31) + this.uI_State);
        result = ((result * 31) + ((this.uI_State_ == null) ? 0 : this.uI_State_.hashCode()));
        result = ((result * 31) + this.playerFilesReadOnly);
        result = ((result * 31) + ((this.webUI_port_ == null) ? 0 : this.webUI_port_.hashCode()));
        result = ((result * 31) + ((this.uI_Auto_Switch_with_Mod_ == null) ? 0 : this.uI_Auto_Switch_with_Mod_.hashCode()));
        result = ((result * 31) + ((this.enable_UI_Keyboard_Nav_ == null) ? 0 : this.enable_UI_Keyboard_Nav_.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + this.uI_Auto_Switch_with_Mod);
        result = ((result * 31) + this.enable_UI_Keyboard_Nav);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Miscellaneous) == false) {
            return false;
        }
        Miscellaneous rhs = ((Miscellaneous) other);
        return (((((((((((this.auto_Install_Uninstalled_Content_In_Packages_Directory == rhs.auto_Install_Uninstalled_Content_In_Packages_Directory) && (this.webUI_port == rhs.webUI_port)) && (this.uI_State == rhs.uI_State)) && ((this.uI_State_ == rhs.uI_State_) || ((this.uI_State_ != null) && this.uI_State_.equals(rhs.uI_State_)))) && (this.playerFilesReadOnly == rhs.playerFilesReadOnly)) && ((this.webUI_port_ == rhs.webUI_port_) || ((this.webUI_port_ != null) && this.webUI_port_.equals(rhs.webUI_port_)))) && ((this.uI_Auto_Switch_with_Mod_ == rhs.uI_Auto_Switch_with_Mod_) || ((this.uI_Auto_Switch_with_Mod_ != null) && this.uI_Auto_Switch_with_Mod_.equals(rhs.uI_Auto_Switch_with_Mod_)))) && ((this.enable_UI_Keyboard_Nav_ == rhs.enable_UI_Keyboard_Nav_) || ((this.enable_UI_Keyboard_Nav_ != null) && this.enable_UI_Keyboard_Nav_.equals(rhs.enable_UI_Keyboard_Nav_)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && (this.uI_Auto_Switch_with_Mod == rhs.uI_Auto_Switch_with_Mod)) && (this.enable_UI_Keyboard_Nav == rhs.enable_UI_Keyboard_Nav));
    }

}
