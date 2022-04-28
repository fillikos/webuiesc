package de.fillikos.rf2.esctool.data.rf2data;


import com.fasterxml.jackson.annotation.*;
import de.fillikos.rf2.esctool.data.rf2data.multiplayer.MultiplayerGeneralOptions;
import de.fillikos.rf2.esctool.data.rf2data.multiplayer.MultiplayerServerOptions;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Multiplayer General Options",
        "Multiplayer Server Options"
})
@Generated("jsonschema2pojo")
public class MultiplayerJson {

    @JsonProperty("Multiplayer General Options")
    private MultiplayerGeneralOptions multiplayer_General_Options;
    @JsonProperty("Multiplayer Server Options")
    private MultiplayerServerOptions multiplayer_Server_Options;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public MultiplayerJson() {
    }

    /**
     * @param multiplayer_General_Options
     * @param multiplayer_Server_Options
     */
    public MultiplayerJson(MultiplayerGeneralOptions multiplayer_General_Options, MultiplayerServerOptions multiplayer_Server_Options) {
        super();
        this.multiplayer_General_Options = multiplayer_General_Options;
        this.multiplayer_Server_Options = multiplayer_Server_Options;
    }

    @JsonProperty("Multiplayer General Options")
    public MultiplayerGeneralOptions getMultiplayer_General_Options() {
        return multiplayer_General_Options;
    }

    @JsonProperty("Multiplayer General Options")
    public void setMultiplayer_General_Options(MultiplayerGeneralOptions multiplayer_General_Options) {
        this.multiplayer_General_Options = multiplayer_General_Options;
    }

    @JsonProperty("Multiplayer Server Options")
    public MultiplayerServerOptions getMultiplayer_Server_Options() {
        return multiplayer_Server_Options;
    }

    @JsonProperty("Multiplayer Server Options")
    public void setMultiplayer_Server_Options(MultiplayerServerOptions multiplayer_Server_Options) {
        this.multiplayer_Server_Options = multiplayer_Server_Options;
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
        sb.append(MultiplayerJson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("multiplayer_General_Options");
        sb.append('=');
        sb.append(((this.multiplayer_General_Options == null) ? "<null>" : this.multiplayer_General_Options));
        sb.append(',');
        sb.append("multiplayer_Server_Options");
        sb.append('=');
        sb.append(((this.multiplayer_Server_Options == null) ? "<null>" : this.multiplayer_Server_Options));
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
        result = ((result * 31) + ((this.multiplayer_General_Options == null) ? 0 : this.multiplayer_General_Options.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.multiplayer_Server_Options == null) ? 0 : this.multiplayer_Server_Options.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MultiplayerJson) == false) {
            return false;
        }
        MultiplayerJson rhs = ((MultiplayerJson) other);
        return ((((this.multiplayer_General_Options == rhs.multiplayer_General_Options) || ((this.multiplayer_General_Options != null) && this.multiplayer_General_Options.equals(rhs.multiplayer_General_Options))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.multiplayer_Server_Options == rhs.multiplayer_Server_Options) || ((this.multiplayer_Server_Options != null) && this.multiplayer_Server_Options.equals(rhs.multiplayer_Server_Options))));
    }

}
