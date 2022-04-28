package de.fillikos.rf2.esctool.data.rf2data;


import com.fasterxml.jackson.annotation.*;
import de.fillikos.rf2.esctool.data.rf2data.player.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CHAT",
        "Controls",
        "DRIVER",
        "DRIVING AIDS",
        "Game Options",
        "Graphic Options",
        "Mechanical Failures",
        "Miscellaneous",
        "Race Conditions",
        "SCENE",
        "Sound Options"
})
@Generated("jsonschema2pojo")
public class PlayerJson {

    @JsonProperty("CHAT")
    private Chat chat;
    @JsonProperty("Controls")
    private Controls controls;
    @JsonProperty("DRIVER")
    private Driver driver;
    @JsonProperty("DRIVING AIDS")
    private DrivingAids drivingAids;
    @JsonProperty("Game Options")
    private GameOptions gameOptions;
    @JsonProperty("Graphic Options")
    private GraphicOptions graphicOptions;
    @JsonProperty("Mechanical Failures")
    private MechanicalFailures mechanicalFailures;
    @JsonProperty("Miscellaneous")
    private Miscellaneous miscellaneous;
    @JsonProperty("Race Conditions")
    private RaceConditions raceConditions;
    @JsonProperty("SCENE")
    private Scene scene;
    @JsonProperty("Sound Options")
    private SoundOptions soundOptions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public PlayerJson() {
    }

    /**
     * @param graphicOptions
     * @param driver
     * @param raceConditions
     * @param controls
     * @param mechanicalFailures
     * @param miscellaneous
     * @param gameOptions
     * @param chat
     * @param scene
     * @param drivingAids
     * @param soundOptions
     */
    public PlayerJson(Chat chat, Controls controls, Driver driver, DrivingAids drivingAids, GameOptions gameOptions, GraphicOptions graphicOptions, MechanicalFailures mechanicalFailures, Miscellaneous miscellaneous, RaceConditions raceConditions, Scene scene, SoundOptions soundOptions) {
        super();
        this.chat = chat;
        this.controls = controls;
        this.driver = driver;
        this.drivingAids = drivingAids;
        this.gameOptions = gameOptions;
        this.graphicOptions = graphicOptions;
        this.mechanicalFailures = mechanicalFailures;
        this.miscellaneous = miscellaneous;
        this.raceConditions = raceConditions;
        this.scene = scene;
        this.soundOptions = soundOptions;
    }

    @JsonProperty("CHAT")
    public Chat getCHAT() {
        return chat;
    }

    @JsonProperty("CHAT")
    public void setCHAT(Chat cHAT) {
        this.chat = cHAT;
    }

    @JsonProperty("Controls")
    public Controls getControls() {
        return controls;
    }

    @JsonProperty("Controls")
    public void setControls(Controls controls) {
        this.controls = controls;
    }

    @JsonProperty("DRIVER")
    public Driver getDRIVER() {
        return driver;
    }

    @JsonProperty("DRIVER")
    public void setDRIVER(Driver dRIVER) {
        this.driver = dRIVER;
    }

    @JsonProperty("DRIVING AIDS")
    public DrivingAids getDRIVING_AIDS() {
        return drivingAids;
    }

    @JsonProperty("DRIVING AIDS")
    public void setDRIVING_AIDS(DrivingAids dRIVING_AIDS) {
        this.drivingAids = dRIVING_AIDS;
    }

    @JsonProperty("Game Options")
    public GameOptions getGameOptions() {
        return gameOptions;
    }

    @JsonProperty("Game Options")
    public void setGameOptions(GameOptions gameOptions) {
        this.gameOptions = gameOptions;
    }

    @JsonProperty("Graphic Options")
    public GraphicOptions getGraphicOptions() {
        return graphicOptions;
    }

    @JsonProperty("Graphic Options")
    public void setGraphicOptions(GraphicOptions graphicOptions) {
        this.graphicOptions = graphicOptions;
    }

    @JsonProperty("Mechanical Failures")
    public MechanicalFailures getMechanicalFailures() {
        return mechanicalFailures;
    }

    @JsonProperty("Mechanical Failures")
    public void setMechanicalFailures(MechanicalFailures mechanicalFailures) {
        this.mechanicalFailures = mechanicalFailures;
    }

    @JsonProperty("Miscellaneous")
    public Miscellaneous getMiscellaneous() {
        return miscellaneous;
    }

    @JsonProperty("Miscellaneous")
    public void setMiscellaneous(Miscellaneous miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    @JsonProperty("Race Conditions")
    public RaceConditions getRaceConditions() {
        return raceConditions;
    }

    @JsonProperty("Race Conditions")
    public void setRaceConditions(RaceConditions raceConditions) {
        this.raceConditions = raceConditions;
    }

    @JsonProperty("SCENE")
    public Scene getSCENE() {
        return scene;
    }

    @JsonProperty("SCENE")
    public void setSCENE(Scene sCENE) {
        this.scene = sCENE;
    }

    @JsonProperty("Sound Options")
    public SoundOptions getSoundOptions() {
        return soundOptions;
    }

    @JsonProperty("Sound Options")
    public void setSoundOptions(SoundOptions soundOptions) {
        this.soundOptions = soundOptions;
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
        sb.append(PlayerJson.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cHAT");
        sb.append('=');
        sb.append(((this.chat == null) ? "<null>" : this.chat));
        sb.append(',');
        sb.append("controls");
        sb.append('=');
        sb.append(((this.controls == null) ? "<null>" : this.controls));
        sb.append(',');
        sb.append("dRIVER");
        sb.append('=');
        sb.append(((this.driver == null) ? "<null>" : this.driver));
        sb.append(',');
        sb.append("dRIVING_AIDS");
        sb.append('=');
        sb.append(((this.drivingAids == null) ? "<null>" : this.drivingAids));
        sb.append(',');
        sb.append("game_Options");
        sb.append('=');
        sb.append(((this.gameOptions == null) ? "<null>" : this.gameOptions));
        sb.append(',');
        sb.append("graphic_Options");
        sb.append('=');
        sb.append(((this.graphicOptions == null) ? "<null>" : this.graphicOptions));
        sb.append(',');
        sb.append("mechanical_Failures");
        sb.append('=');
        sb.append(((this.mechanicalFailures == null) ? "<null>" : this.mechanicalFailures));
        sb.append(',');
        sb.append("miscellaneous");
        sb.append('=');
        sb.append(((this.miscellaneous == null) ? "<null>" : this.miscellaneous));
        sb.append(',');
        sb.append("race_Conditions");
        sb.append('=');
        sb.append(((this.raceConditions == null) ? "<null>" : this.raceConditions));
        sb.append(',');
        sb.append("sCENE");
        sb.append('=');
        sb.append(((this.scene == null) ? "<null>" : this.scene));
        sb.append(',');
        sb.append("sound_Options");
        sb.append('=');
        sb.append(((this.soundOptions == null) ? "<null>" : this.soundOptions));
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
        result = ((result * 31) + ((this.driver == null) ? 0 : this.driver.hashCode()));
        result = ((result * 31) + ((this.controls == null) ? 0 : this.controls.hashCode()));
        result = ((result * 31) + ((this.mechanicalFailures == null) ? 0 : this.mechanicalFailures.hashCode()));
        result = ((result * 31) + ((this.miscellaneous == null) ? 0 : this.miscellaneous.hashCode()));
        result = ((result * 31) + ((this.gameOptions == null) ? 0 : this.gameOptions.hashCode()));
        result = ((result * 31) + ((this.soundOptions == null) ? 0 : this.soundOptions.hashCode()));
        result = ((result * 31) + ((this.graphicOptions == null) ? 0 : this.graphicOptions.hashCode()));
        result = ((result * 31) + ((this.raceConditions == null) ? 0 : this.raceConditions.hashCode()));
        result = ((result * 31) + ((this.chat == null) ? 0 : this.chat.hashCode()));
        result = ((result * 31) + ((this.scene == null) ? 0 : this.scene.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.drivingAids == null) ? 0 : this.drivingAids.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlayerJson) == false) {
            return false;
        }
        PlayerJson rhs = ((PlayerJson) other);
        return (((((((((((((this.driver == rhs.driver) || ((this.driver != null) && this.driver.equals(rhs.driver))) && ((this.controls == rhs.controls) || ((this.controls != null) && this.controls.equals(rhs.controls)))) && ((this.mechanicalFailures == rhs.mechanicalFailures) || ((this.mechanicalFailures != null) && this.mechanicalFailures.equals(rhs.mechanicalFailures)))) && ((this.miscellaneous == rhs.miscellaneous) || ((this.miscellaneous != null) && this.miscellaneous.equals(rhs.miscellaneous)))) && ((this.gameOptions == rhs.gameOptions) || ((this.gameOptions != null) && this.gameOptions.equals(rhs.gameOptions)))) && ((this.soundOptions == rhs.soundOptions) || ((this.soundOptions != null) && this.soundOptions.equals(rhs.soundOptions)))) && ((this.graphicOptions == rhs.graphicOptions) || ((this.graphicOptions != null) && this.graphicOptions.equals(rhs.graphicOptions)))) && ((this.raceConditions == rhs.raceConditions) || ((this.raceConditions != null) && this.raceConditions.equals(rhs.raceConditions)))) && ((this.chat == rhs.chat) || ((this.chat != null) && this.chat.equals(rhs.chat)))) && ((this.scene == rhs.scene) || ((this.scene != null) && this.scene.equals(rhs.scene)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.drivingAids == rhs.drivingAids) || ((this.drivingAids != null) && this.drivingAids.equals(rhs.drivingAids))));
    }

}
