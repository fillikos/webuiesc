package de.fillikos.rf2.esctool.data.rf2data.player;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "AI Database File",
        "Options Component",
        "Options Dir",
        "Options File",
        "Options Version",
        "Scene Description",
        "Scene File",
        "Scene Signature"
})
@Generated("jsonschema2pojo")
public class Scene {

    @JsonProperty("AI Database File")
    private String aI_Database_File;
    @JsonProperty("Options Component")
    private String options_Component;
    @JsonProperty("Options Dir")
    private String options_Dir;
    @JsonProperty("Options File")
    private String options_File;
    @JsonProperty("Options Version")
    private String options_Version;
    @JsonProperty("Scene Description")
    private String scene_Description;
    @JsonProperty("Scene File")
    private String scene_File;
    @JsonProperty("Scene Signature")
    private String scene_Signature;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Scene() {
    }

    /**
     * @param scene_File
     * @param scene_Signature
     * @param options_Component
     * @param aI_Database_File
     * @param options_File
     * @param scene_Description
     * @param options_Version
     * @param options_Dir
     */
    public Scene(String aI_Database_File, String options_Component, String options_Dir, String options_File, String options_Version, String scene_Description, String scene_File, String scene_Signature) {
        super();
        this.aI_Database_File = aI_Database_File;
        this.options_Component = options_Component;
        this.options_Dir = options_Dir;
        this.options_File = options_File;
        this.options_Version = options_Version;
        this.scene_Description = scene_Description;
        this.scene_File = scene_File;
        this.scene_Signature = scene_Signature;
    }

    @JsonProperty("AI Database File")
    public String getAI_Database_File() {
        return aI_Database_File;
    }

    @JsonProperty("AI Database File")
    public void setAI_Database_File(String aI_Database_File) {
        this.aI_Database_File = aI_Database_File;
    }

    @JsonProperty("Options Component")
    public String getOptions_Component() {
        return options_Component;
    }

    @JsonProperty("Options Component")
    public void setOptions_Component(String options_Component) {
        this.options_Component = options_Component;
    }

    @JsonProperty("Options Dir")
    public String getOptions_Dir() {
        return options_Dir;
    }

    @JsonProperty("Options Dir")
    public void setOptions_Dir(String options_Dir) {
        this.options_Dir = options_Dir;
    }

    @JsonProperty("Options File")
    public String getOptions_File() {
        return options_File;
    }

    @JsonProperty("Options File")
    public void setOptions_File(String options_File) {
        this.options_File = options_File;
    }

    @JsonProperty("Options Version")
    public String getOptions_Version() {
        return options_Version;
    }

    @JsonProperty("Options Version")
    public void setOptions_Version(String options_Version) {
        this.options_Version = options_Version;
    }

    @JsonProperty("Scene Description")
    public String getScene_Description() {
        return scene_Description;
    }

    @JsonProperty("Scene Description")
    public void setScene_Description(String scene_Description) {
        this.scene_Description = scene_Description;
    }

    @JsonProperty("Scene File")
    public String getScene_File() {
        return scene_File;
    }

    @JsonProperty("Scene File")
    public void setScene_File(String scene_File) {
        this.scene_File = scene_File;
    }

    @JsonProperty("Scene Signature")
    public String getScene_Signature() {
        return scene_Signature;
    }

    @JsonProperty("Scene Signature")
    public void setScene_Signature(String scene_Signature) {
        this.scene_Signature = scene_Signature;
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
        sb.append(Scene.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aI_Database_File");
        sb.append('=');
        sb.append(((this.aI_Database_File == null) ? "<null>" : this.aI_Database_File));
        sb.append(',');
        sb.append("options_Component");
        sb.append('=');
        sb.append(((this.options_Component == null) ? "<null>" : this.options_Component));
        sb.append(',');
        sb.append("options_Dir");
        sb.append('=');
        sb.append(((this.options_Dir == null) ? "<null>" : this.options_Dir));
        sb.append(',');
        sb.append("options_File");
        sb.append('=');
        sb.append(((this.options_File == null) ? "<null>" : this.options_File));
        sb.append(',');
        sb.append("options_Version");
        sb.append('=');
        sb.append(((this.options_Version == null) ? "<null>" : this.options_Version));
        sb.append(',');
        sb.append("scene_Description");
        sb.append('=');
        sb.append(((this.scene_Description == null) ? "<null>" : this.scene_Description));
        sb.append(',');
        sb.append("scene_File");
        sb.append('=');
        sb.append(((this.scene_File == null) ? "<null>" : this.scene_File));
        sb.append(',');
        sb.append("scene_Signature");
        sb.append('=');
        sb.append(((this.scene_Signature == null) ? "<null>" : this.scene_Signature));
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
        result = ((result * 31) + ((this.scene_File == null) ? 0 : this.scene_File.hashCode()));
        result = ((result * 31) + ((this.scene_Signature == null) ? 0 : this.scene_Signature.hashCode()));
        result = ((result * 31) + ((this.options_Component == null) ? 0 : this.options_Component.hashCode()));
        result = ((result * 31) + ((this.aI_Database_File == null) ? 0 : this.aI_Database_File.hashCode()));
        result = ((result * 31) + ((this.options_File == null) ? 0 : this.options_File.hashCode()));
        result = ((result * 31) + ((this.scene_Description == null) ? 0 : this.scene_Description.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.options_Version == null) ? 0 : this.options_Version.hashCode()));
        result = ((result * 31) + ((this.options_Dir == null) ? 0 : this.options_Dir.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scene) == false) {
            return false;
        }
        Scene rhs = ((Scene) other);
        return ((((((((((this.scene_File == rhs.scene_File) || ((this.scene_File != null) && this.scene_File.equals(rhs.scene_File))) && ((this.scene_Signature == rhs.scene_Signature) || ((this.scene_Signature != null) && this.scene_Signature.equals(rhs.scene_Signature)))) && ((this.options_Component == rhs.options_Component) || ((this.options_Component != null) && this.options_Component.equals(rhs.options_Component)))) && ((this.aI_Database_File == rhs.aI_Database_File) || ((this.aI_Database_File != null) && this.aI_Database_File.equals(rhs.aI_Database_File)))) && ((this.options_File == rhs.options_File) || ((this.options_File != null) && this.options_File.equals(rhs.options_File)))) && ((this.scene_Description == rhs.scene_Description) || ((this.scene_Description != null) && this.scene_Description.equals(rhs.scene_Description)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.options_Version == rhs.options_Version) || ((this.options_Version != null) && this.options_Version.equals(rhs.options_Version)))) && ((this.options_Dir == rhs.options_Dir) || ((this.options_Dir != null) && this.options_Dir.equals(rhs.options_Dir))));
    }

}
