package de.fillikos.rf2.esctool.data.rf2data.player;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Buffer Count",
        "Buffer Count#",
        "Camera Volume",
        "Camera Volume#",
        "Engine Volume",
        "Engine Volume Reduction",
        "Engine Volume Reduction#",
        "Engine Volume#",
        "Maximum Effects",
        "Maximum Effects#",
        "Music",
        "Music Volume",
        "Music Volume#",
        "Music#",
        "Net Race Warning",
        "Net Race Warning#",
        "Number of output channels",
        "Number of output channels#",
        "Options Volume",
        "Options Volume#",
        "Other Volume Ratio",
        "Other Volume Ratio#",
        "Pit Volume",
        "Pit Volume#",
        "Player Volume Ratio",
        "Player Volume Ratio#",
        "Rain Volume Mult",
        "Rain Volume Mult#",
        "Realtime In Monitor",
        "Realtime In Monitor#",
        "Reverb Decay",
        "Reverb Decay#",
        "Reverb Dry Volume",
        "Reverb Dry Volume#",
        "Reverb Max Dist",
        "Reverb Max Dist#",
        "Reverb Wet Volume",
        "Reverb Wet Volume#",
        "SoundFX Volume",
        "SoundFX Volume#",
        "Speed Of Sound",
        "Speed Of Sound#",
        "Spotter Volume",
        "Spotter Volume#",
        "Thunder Volume Mult",
        "Thunder Volume Mult#",
        "Tire Volume Ratio",
        "Tire Volume Ratio#",
        "Track Load Commentary",
        "Track Load Commentary#",
        "Trackside Ambient",
        "Trackside Ambient#",
        "Trackside Exp Shape",
        "Trackside Exp Shape#",
        "Trackside Range",
        "Trackside Range#",
        "Trackside Shape",
        "Trackside Shape#",
        "Traction Control",
        "Traction Control#",
        "Vehicle Roadnoise FreqMin",
        "Vehicle Roadnoise FreqMult",
        "Vehicle Roadnoise VolMult",
        "Vehicle Roadnoise VolSpeed",
        "Vehicle Scrubbing VolMult",
        "Vehicle Skidding FreqGrip",
        "Vehicle Skidding FreqSpeed",
        "Vehicle Skidding VolMult"
})
@Generated("jsonschema2pojo")
public class SoundOptions {

    @JsonProperty("Buffer Count")
    private int buffer_Count;
    @JsonProperty("Buffer Count#")
    private String buffer_Count_;
    @JsonProperty("Camera Volume")
    private int camera_Volume;
    @JsonProperty("Camera Volume#")
    private String camera_Volume_;
    @JsonProperty("Engine Volume")
    private int engine_Volume;
    @JsonProperty("Engine Volume Reduction")
    private int engine_Volume_Reduction;
    @JsonProperty("Engine Volume Reduction#")
    private String engine_Volume_Reduction_;
    @JsonProperty("Engine Volume#")
    private String engine_Volume_;
    @JsonProperty("Maximum Effects")
    private int maximum_Effects;
    @JsonProperty("Maximum Effects#")
    private String maximum_Effects_;
    @JsonProperty("Music")
    private int music;
    @JsonProperty("Music Volume")
    private float music_Volume;
    @JsonProperty("Music Volume#")
    private String music_Volume_;
    @JsonProperty("Music#")
    private String music_;
    @JsonProperty("Net Race Warning")
    private String net_Race_Warning;
    @JsonProperty("Net Race Warning#")
    private String net_Race_Warning_;
    @JsonProperty("Number of output channels")
    private int number_of_output_channels;
    @JsonProperty("Number of output channels#")
    private String number_of_output_channels_;
    @JsonProperty("Options Volume")
    private float options_Volume;
    @JsonProperty("Options Volume#")
    private String options_Volume_;
    @JsonProperty("Other Volume Ratio")
    private float other_Volume_Ratio;
    @JsonProperty("Other Volume Ratio#")
    private String other_Volume_Ratio_;
    @JsonProperty("Pit Volume")
    private float pit_Volume;
    @JsonProperty("Pit Volume#")
    private String pit_Volume_;
    @JsonProperty("Player Volume Ratio")
    private int player_Volume_Ratio;
    @JsonProperty("Player Volume Ratio#")
    private String player_Volume_Ratio_;
    @JsonProperty("Rain Volume Mult")
    private float rain_Volume_Mult;
    @JsonProperty("Rain Volume Mult#")
    private String rain_Volume_Mult_;
    @JsonProperty("Realtime In Monitor")
    private boolean realtime_In_Monitor;
    @JsonProperty("Realtime In Monitor#")
    private String realtime_In_Monitor_;
    @JsonProperty("Reverb Decay")
    private float reverb_Decay;
    @JsonProperty("Reverb Decay#")
    private String reverb_Decay_;
    @JsonProperty("Reverb Dry Volume")
    private float reverb_Dry_Volume;
    @JsonProperty("Reverb Dry Volume#")
    private String reverb_Dry_Volume_;
    @JsonProperty("Reverb Max Dist")
    private int reverb_Max_Dist;
    @JsonProperty("Reverb Max Dist#")
    private String reverb_Max_Dist_;
    @JsonProperty("Reverb Wet Volume")
    private float reverb_Wet_Volume;
    @JsonProperty("Reverb Wet Volume#")
    private String reverb_Wet_Volume_;
    @JsonProperty("SoundFX Volume")
    private int soundFX_Volume;
    @JsonProperty("SoundFX Volume#")
    private String soundFX_Volume_;
    @JsonProperty("Speed Of Sound")
    private int speed_Of_Sound;
    @JsonProperty("Speed Of Sound#")
    private String speed_Of_Sound_;
    @JsonProperty("Spotter Volume")
    private float spotter_Volume;
    @JsonProperty("Spotter Volume#")
    private String spotter_Volume_;
    @JsonProperty("Thunder Volume Mult")
    private float thunder_Volume_Mult;
    @JsonProperty("Thunder Volume Mult#")
    private String thunder_Volume_Mult_;
    @JsonProperty("Tire Volume Ratio")
    private float tire_Volume_Ratio;
    @JsonProperty("Tire Volume Ratio#")
    private String tire_Volume_Ratio_;
    @JsonProperty("Track Load Commentary")
    private boolean track_Load_Commentary;
    @JsonProperty("Track Load Commentary#")
    private String track_Load_Commentary_;
    @JsonProperty("Trackside Ambient")
    private int trackside_Ambient;
    @JsonProperty("Trackside Ambient#")
    private String trackside_Ambient_;
    @JsonProperty("Trackside Exp Shape")
    private float trackside_Exp_Shape;
    @JsonProperty("Trackside Exp Shape#")
    private String trackside_Exp_Shape_;
    @JsonProperty("Trackside Range")
    private int trackside_Range;
    @JsonProperty("Trackside Range#")
    private String trackside_Range_;
    @JsonProperty("Trackside Shape")
    private float trackside_Shape;
    @JsonProperty("Trackside Shape#")
    private String trackside_Shape_;
    @JsonProperty("Traction Control")
    private float traction_Control;
    @JsonProperty("Traction Control#")
    private String traction_Control_;
    @JsonProperty("Vehicle Roadnoise FreqMin")
    private float vehicle_Roadnoise_FreqMin;
    @JsonProperty("Vehicle Roadnoise FreqMult")
    private float vehicle_Roadnoise_FreqMult;
    @JsonProperty("Vehicle Roadnoise VolMult")
    private float vehicle_Roadnoise_VolMult;
    @JsonProperty("Vehicle Roadnoise VolSpeed")
    private int vehicle_Roadnoise_VolSpeed;
    @JsonProperty("Vehicle Scrubbing VolMult")
    private float vehicle_Scrubbing_VolMult;
    @JsonProperty("Vehicle Skidding FreqGrip")
    private float vehicle_Skidding_FreqGrip;
    @JsonProperty("Vehicle Skidding FreqSpeed")
    private float vehicle_Skidding_FreqSpeed;
    @JsonProperty("Vehicle Skidding VolMult")
    private float vehicle_Skidding_VolMult;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public SoundOptions() {
    }

    /**
     * @param trackside_Ambient_
     * @param realtime_In_Monitor_
     * @param other_Volume_Ratio_
     * @param maximum_Effects_
     * @param trackside_Range
     * @param trackside_Range_
     * @param maximum_Effects
     * @param music_Volume_
     * @param reverb_Max_Dist
     * @param reverb_Dry_Volume
     * @param vehicle_Roadnoise_VolSpeed
     * @param trackside_Exp_Shape_
     * @param trackside_Shape_
     * @param speed_Of_Sound_
     * @param engine_Volume_Reduction
     * @param music
     * @param options_Volume_
     * @param vehicle_Skidding_FreqSpeed
     * @param soundFX_Volume_
     * @param trackside_Exp_Shape
     * @param reverb_Dry_Volume_
     * @param tire_Volume_Ratio
     * @param track_Load_Commentary_
     * @param trackside_Ambient
     * @param reverb_Decay_
     * @param rain_Volume_Mult_
     * @param net_Race_Warning_
     * @param soundFX_Volume
     * @param thunder_Volume_Mult
     * @param camera_Volume_
     * @param reverb_Wet_Volume_
     * @param net_Race_Warning
     * @param player_Volume_Ratio
     * @param spotter_Volume
     * @param camera_Volume
     * @param track_Load_Commentary
     * @param number_of_output_channels
     * @param buffer_Count_
     * @param traction_Control
     * @param engine_Volume
     * @param thunder_Volume_Mult_
     * @param engine_Volume_Reduction_
     * @param vehicle_Skidding_FreqGrip
     * @param vehicle_Skidding_VolMult
     * @param options_Volume
     * @param reverb_Max_Dist_
     * @param reverb_Decay
     * @param player_Volume_Ratio_
     * @param traction_Control_
     * @param vehicle_Roadnoise_VolMult
     * @param music_Volume
     * @param buffer_Count
     * @param number_of_output_channels_
     * @param realtime_In_Monitor
     * @param vehicle_Roadnoise_FreqMin
     * @param pit_Volume
     * @param vehicle_Roadnoise_FreqMult
     * @param reverb_Wet_Volume
     * @param speed_Of_Sound
     * @param pit_Volume_
     * @param vehicle_Scrubbing_VolMult
     * @param spotter_Volume_
     * @param engine_Volume_
     * @param rain_Volume_Mult
     * @param tire_Volume_Ratio_
     * @param other_Volume_Ratio
     * @param music_
     * @param trackside_Shape
     */
    public SoundOptions(int buffer_Count, String buffer_Count_, int camera_Volume, String camera_Volume_, int engine_Volume, int engine_Volume_Reduction, String engine_Volume_Reduction_, String engine_Volume_, int maximum_Effects, String maximum_Effects_, int music, float music_Volume, String music_Volume_, String music_, String net_Race_Warning, String net_Race_Warning_, int number_of_output_channels, String number_of_output_channels_, float options_Volume, String options_Volume_, float other_Volume_Ratio, String other_Volume_Ratio_, float pit_Volume, String pit_Volume_, int player_Volume_Ratio, String player_Volume_Ratio_, float rain_Volume_Mult, String rain_Volume_Mult_, boolean realtime_In_Monitor, String realtime_In_Monitor_, float reverb_Decay, String reverb_Decay_, float reverb_Dry_Volume, String reverb_Dry_Volume_, int reverb_Max_Dist, String reverb_Max_Dist_, float reverb_Wet_Volume, String reverb_Wet_Volume_, int soundFX_Volume, String soundFX_Volume_, int speed_Of_Sound, String speed_Of_Sound_, float spotter_Volume, String spotter_Volume_, float thunder_Volume_Mult, String thunder_Volume_Mult_, float tire_Volume_Ratio, String tire_Volume_Ratio_, boolean track_Load_Commentary, String track_Load_Commentary_, int trackside_Ambient, String trackside_Ambient_, float trackside_Exp_Shape, String trackside_Exp_Shape_, int trackside_Range, String trackside_Range_, float trackside_Shape, String trackside_Shape_, float traction_Control, String traction_Control_, float vehicle_Roadnoise_FreqMin, float vehicle_Roadnoise_FreqMult, float vehicle_Roadnoise_VolMult, int vehicle_Roadnoise_VolSpeed, float vehicle_Scrubbing_VolMult, float vehicle_Skidding_FreqGrip, float vehicle_Skidding_FreqSpeed, float vehicle_Skidding_VolMult) {
        super();
        this.buffer_Count = buffer_Count;
        this.buffer_Count_ = buffer_Count_;
        this.camera_Volume = camera_Volume;
        this.camera_Volume_ = camera_Volume_;
        this.engine_Volume = engine_Volume;
        this.engine_Volume_Reduction = engine_Volume_Reduction;
        this.engine_Volume_Reduction_ = engine_Volume_Reduction_;
        this.engine_Volume_ = engine_Volume_;
        this.maximum_Effects = maximum_Effects;
        this.maximum_Effects_ = maximum_Effects_;
        this.music = music;
        this.music_Volume = music_Volume;
        this.music_Volume_ = music_Volume_;
        this.music_ = music_;
        this.net_Race_Warning = net_Race_Warning;
        this.net_Race_Warning_ = net_Race_Warning_;
        this.number_of_output_channels = number_of_output_channels;
        this.number_of_output_channels_ = number_of_output_channels_;
        this.options_Volume = options_Volume;
        this.options_Volume_ = options_Volume_;
        this.other_Volume_Ratio = other_Volume_Ratio;
        this.other_Volume_Ratio_ = other_Volume_Ratio_;
        this.pit_Volume = pit_Volume;
        this.pit_Volume_ = pit_Volume_;
        this.player_Volume_Ratio = player_Volume_Ratio;
        this.player_Volume_Ratio_ = player_Volume_Ratio_;
        this.rain_Volume_Mult = rain_Volume_Mult;
        this.rain_Volume_Mult_ = rain_Volume_Mult_;
        this.realtime_In_Monitor = realtime_In_Monitor;
        this.realtime_In_Monitor_ = realtime_In_Monitor_;
        this.reverb_Decay = reverb_Decay;
        this.reverb_Decay_ = reverb_Decay_;
        this.reverb_Dry_Volume = reverb_Dry_Volume;
        this.reverb_Dry_Volume_ = reverb_Dry_Volume_;
        this.reverb_Max_Dist = reverb_Max_Dist;
        this.reverb_Max_Dist_ = reverb_Max_Dist_;
        this.reverb_Wet_Volume = reverb_Wet_Volume;
        this.reverb_Wet_Volume_ = reverb_Wet_Volume_;
        this.soundFX_Volume = soundFX_Volume;
        this.soundFX_Volume_ = soundFX_Volume_;
        this.speed_Of_Sound = speed_Of_Sound;
        this.speed_Of_Sound_ = speed_Of_Sound_;
        this.spotter_Volume = spotter_Volume;
        this.spotter_Volume_ = spotter_Volume_;
        this.thunder_Volume_Mult = thunder_Volume_Mult;
        this.thunder_Volume_Mult_ = thunder_Volume_Mult_;
        this.tire_Volume_Ratio = tire_Volume_Ratio;
        this.tire_Volume_Ratio_ = tire_Volume_Ratio_;
        this.track_Load_Commentary = track_Load_Commentary;
        this.track_Load_Commentary_ = track_Load_Commentary_;
        this.trackside_Ambient = trackside_Ambient;
        this.trackside_Ambient_ = trackside_Ambient_;
        this.trackside_Exp_Shape = trackside_Exp_Shape;
        this.trackside_Exp_Shape_ = trackside_Exp_Shape_;
        this.trackside_Range = trackside_Range;
        this.trackside_Range_ = trackside_Range_;
        this.trackside_Shape = trackside_Shape;
        this.trackside_Shape_ = trackside_Shape_;
        this.traction_Control = traction_Control;
        this.traction_Control_ = traction_Control_;
        this.vehicle_Roadnoise_FreqMin = vehicle_Roadnoise_FreqMin;
        this.vehicle_Roadnoise_FreqMult = vehicle_Roadnoise_FreqMult;
        this.vehicle_Roadnoise_VolMult = vehicle_Roadnoise_VolMult;
        this.vehicle_Roadnoise_VolSpeed = vehicle_Roadnoise_VolSpeed;
        this.vehicle_Scrubbing_VolMult = vehicle_Scrubbing_VolMult;
        this.vehicle_Skidding_FreqGrip = vehicle_Skidding_FreqGrip;
        this.vehicle_Skidding_FreqSpeed = vehicle_Skidding_FreqSpeed;
        this.vehicle_Skidding_VolMult = vehicle_Skidding_VolMult;
    }

    @JsonProperty("Buffer Count")
    public int getBuffer_Count() {
        return buffer_Count;
    }

    @JsonProperty("Buffer Count")
    public void setBuffer_Count(int buffer_Count) {
        this.buffer_Count = buffer_Count;
    }

    @JsonProperty("Buffer Count#")
    public String getBuffer_Count_() {
        return buffer_Count_;
    }

    @JsonProperty("Buffer Count#")
    public void setBuffer_Count_(String buffer_Count_) {
        this.buffer_Count_ = buffer_Count_;
    }

    @JsonProperty("Camera Volume")
    public int getCamera_Volume() {
        return camera_Volume;
    }

    @JsonProperty("Camera Volume")
    public void setCamera_Volume(int camera_Volume) {
        this.camera_Volume = camera_Volume;
    }

    @JsonProperty("Camera Volume#")
    public String getCamera_Volume_() {
        return camera_Volume_;
    }

    @JsonProperty("Camera Volume#")
    public void setCamera_Volume_(String camera_Volume_) {
        this.camera_Volume_ = camera_Volume_;
    }

    @JsonProperty("Engine Volume")
    public int getEngine_Volume() {
        return engine_Volume;
    }

    @JsonProperty("Engine Volume")
    public void setEngine_Volume(int engine_Volume) {
        this.engine_Volume = engine_Volume;
    }

    @JsonProperty("Engine Volume Reduction")
    public int getEngine_Volume_Reduction() {
        return engine_Volume_Reduction;
    }

    @JsonProperty("Engine Volume Reduction")
    public void setEngine_Volume_Reduction(int engine_Volume_Reduction) {
        this.engine_Volume_Reduction = engine_Volume_Reduction;
    }

    @JsonProperty("Engine Volume Reduction#")
    public String getEngine_Volume_Reduction_() {
        return engine_Volume_Reduction_;
    }

    @JsonProperty("Engine Volume Reduction#")
    public void setEngine_Volume_Reduction_(String engine_Volume_Reduction_) {
        this.engine_Volume_Reduction_ = engine_Volume_Reduction_;
    }

    @JsonProperty("Engine Volume#")
    public String getEngine_Volume_() {
        return engine_Volume_;
    }

    @JsonProperty("Engine Volume#")
    public void setEngine_Volume_(String engine_Volume_) {
        this.engine_Volume_ = engine_Volume_;
    }

    @JsonProperty("Maximum Effects")
    public int getMaximum_Effects() {
        return maximum_Effects;
    }

    @JsonProperty("Maximum Effects")
    public void setMaximum_Effects(int maximum_Effects) {
        this.maximum_Effects = maximum_Effects;
    }

    @JsonProperty("Maximum Effects#")
    public String getMaximum_Effects_() {
        return maximum_Effects_;
    }

    @JsonProperty("Maximum Effects#")
    public void setMaximum_Effects_(String maximum_Effects_) {
        this.maximum_Effects_ = maximum_Effects_;
    }

    @JsonProperty("Music")
    public int getMusic() {
        return music;
    }

    @JsonProperty("Music")
    public void setMusic(int music) {
        this.music = music;
    }

    @JsonProperty("Music Volume")
    public float getMusic_Volume() {
        return music_Volume;
    }

    @JsonProperty("Music Volume")
    public void setMusic_Volume(float music_Volume) {
        this.music_Volume = music_Volume;
    }

    @JsonProperty("Music Volume#")
    public String getMusic_Volume_() {
        return music_Volume_;
    }

    @JsonProperty("Music Volume#")
    public void setMusic_Volume_(String music_Volume_) {
        this.music_Volume_ = music_Volume_;
    }

    @JsonProperty("Music#")
    public String getMusic_() {
        return music_;
    }

    @JsonProperty("Music#")
    public void setMusic_(String music_) {
        this.music_ = music_;
    }

    @JsonProperty("Net Race Warning")
    public String getNet_Race_Warning() {
        return net_Race_Warning;
    }

    @JsonProperty("Net Race Warning")
    public void setNet_Race_Warning(String net_Race_Warning) {
        this.net_Race_Warning = net_Race_Warning;
    }

    @JsonProperty("Net Race Warning#")
    public String getNet_Race_Warning_() {
        return net_Race_Warning_;
    }

    @JsonProperty("Net Race Warning#")
    public void setNet_Race_Warning_(String net_Race_Warning_) {
        this.net_Race_Warning_ = net_Race_Warning_;
    }

    @JsonProperty("Number of output channels")
    public int getNumber_of_output_channels() {
        return number_of_output_channels;
    }

    @JsonProperty("Number of output channels")
    public void setNumber_of_output_channels(int number_of_output_channels) {
        this.number_of_output_channels = number_of_output_channels;
    }

    @JsonProperty("Number of output channels#")
    public String getNumber_of_output_channels_() {
        return number_of_output_channels_;
    }

    @JsonProperty("Number of output channels#")
    public void setNumber_of_output_channels_(String number_of_output_channels_) {
        this.number_of_output_channels_ = number_of_output_channels_;
    }

    @JsonProperty("Options Volume")
    public float getOptions_Volume() {
        return options_Volume;
    }

    @JsonProperty("Options Volume")
    public void setOptions_Volume(float options_Volume) {
        this.options_Volume = options_Volume;
    }

    @JsonProperty("Options Volume#")
    public String getOptions_Volume_() {
        return options_Volume_;
    }

    @JsonProperty("Options Volume#")
    public void setOptions_Volume_(String options_Volume_) {
        this.options_Volume_ = options_Volume_;
    }

    @JsonProperty("Other Volume Ratio")
    public float getOther_Volume_Ratio() {
        return other_Volume_Ratio;
    }

    @JsonProperty("Other Volume Ratio")
    public void setOther_Volume_Ratio(float other_Volume_Ratio) {
        this.other_Volume_Ratio = other_Volume_Ratio;
    }

    @JsonProperty("Other Volume Ratio#")
    public String getOther_Volume_Ratio_() {
        return other_Volume_Ratio_;
    }

    @JsonProperty("Other Volume Ratio#")
    public void setOther_Volume_Ratio_(String other_Volume_Ratio_) {
        this.other_Volume_Ratio_ = other_Volume_Ratio_;
    }

    @JsonProperty("Pit Volume")
    public float getPit_Volume() {
        return pit_Volume;
    }

    @JsonProperty("Pit Volume")
    public void setPit_Volume(float pit_Volume) {
        this.pit_Volume = pit_Volume;
    }

    @JsonProperty("Pit Volume#")
    public String getPit_Volume_() {
        return pit_Volume_;
    }

    @JsonProperty("Pit Volume#")
    public void setPit_Volume_(String pit_Volume_) {
        this.pit_Volume_ = pit_Volume_;
    }

    @JsonProperty("Player Volume Ratio")
    public int getPlayer_Volume_Ratio() {
        return player_Volume_Ratio;
    }

    @JsonProperty("Player Volume Ratio")
    public void setPlayer_Volume_Ratio(int player_Volume_Ratio) {
        this.player_Volume_Ratio = player_Volume_Ratio;
    }

    @JsonProperty("Player Volume Ratio#")
    public String getPlayer_Volume_Ratio_() {
        return player_Volume_Ratio_;
    }

    @JsonProperty("Player Volume Ratio#")
    public void setPlayer_Volume_Ratio_(String player_Volume_Ratio_) {
        this.player_Volume_Ratio_ = player_Volume_Ratio_;
    }

    @JsonProperty("Rain Volume Mult")
    public float getRain_Volume_Mult() {
        return rain_Volume_Mult;
    }

    @JsonProperty("Rain Volume Mult")
    public void setRain_Volume_Mult(float rain_Volume_Mult) {
        this.rain_Volume_Mult = rain_Volume_Mult;
    }

    @JsonProperty("Rain Volume Mult#")
    public String getRain_Volume_Mult_() {
        return rain_Volume_Mult_;
    }

    @JsonProperty("Rain Volume Mult#")
    public void setRain_Volume_Mult_(String rain_Volume_Mult_) {
        this.rain_Volume_Mult_ = rain_Volume_Mult_;
    }

    @JsonProperty("Realtime In Monitor")
    public boolean isRealtime_In_Monitor() {
        return realtime_In_Monitor;
    }

    @JsonProperty("Realtime In Monitor")
    public void setRealtime_In_Monitor(boolean realtime_In_Monitor) {
        this.realtime_In_Monitor = realtime_In_Monitor;
    }

    @JsonProperty("Realtime In Monitor#")
    public String getRealtime_In_Monitor_() {
        return realtime_In_Monitor_;
    }

    @JsonProperty("Realtime In Monitor#")
    public void setRealtime_In_Monitor_(String realtime_In_Monitor_) {
        this.realtime_In_Monitor_ = realtime_In_Monitor_;
    }

    @JsonProperty("Reverb Decay")
    public float getReverb_Decay() {
        return reverb_Decay;
    }

    @JsonProperty("Reverb Decay")
    public void setReverb_Decay(float reverb_Decay) {
        this.reverb_Decay = reverb_Decay;
    }

    @JsonProperty("Reverb Decay#")
    public String getReverb_Decay_() {
        return reverb_Decay_;
    }

    @JsonProperty("Reverb Decay#")
    public void setReverb_Decay_(String reverb_Decay_) {
        this.reverb_Decay_ = reverb_Decay_;
    }

    @JsonProperty("Reverb Dry Volume")
    public float getReverb_Dry_Volume() {
        return reverb_Dry_Volume;
    }

    @JsonProperty("Reverb Dry Volume")
    public void setReverb_Dry_Volume(float reverb_Dry_Volume) {
        this.reverb_Dry_Volume = reverb_Dry_Volume;
    }

    @JsonProperty("Reverb Dry Volume#")
    public String getReverb_Dry_Volume_() {
        return reverb_Dry_Volume_;
    }

    @JsonProperty("Reverb Dry Volume#")
    public void setReverb_Dry_Volume_(String reverb_Dry_Volume_) {
        this.reverb_Dry_Volume_ = reverb_Dry_Volume_;
    }

    @JsonProperty("Reverb Max Dist")
    public int getReverb_Max_Dist() {
        return reverb_Max_Dist;
    }

    @JsonProperty("Reverb Max Dist")
    public void setReverb_Max_Dist(int reverb_Max_Dist) {
        this.reverb_Max_Dist = reverb_Max_Dist;
    }

    @JsonProperty("Reverb Max Dist#")
    public String getReverb_Max_Dist_() {
        return reverb_Max_Dist_;
    }

    @JsonProperty("Reverb Max Dist#")
    public void setReverb_Max_Dist_(String reverb_Max_Dist_) {
        this.reverb_Max_Dist_ = reverb_Max_Dist_;
    }

    @JsonProperty("Reverb Wet Volume")
    public float getReverb_Wet_Volume() {
        return reverb_Wet_Volume;
    }

    @JsonProperty("Reverb Wet Volume")
    public void setReverb_Wet_Volume(float reverb_Wet_Volume) {
        this.reverb_Wet_Volume = reverb_Wet_Volume;
    }

    @JsonProperty("Reverb Wet Volume#")
    public String getReverb_Wet_Volume_() {
        return reverb_Wet_Volume_;
    }

    @JsonProperty("Reverb Wet Volume#")
    public void setReverb_Wet_Volume_(String reverb_Wet_Volume_) {
        this.reverb_Wet_Volume_ = reverb_Wet_Volume_;
    }

    @JsonProperty("SoundFX Volume")
    public int getSoundFX_Volume() {
        return soundFX_Volume;
    }

    @JsonProperty("SoundFX Volume")
    public void setSoundFX_Volume(int soundFX_Volume) {
        this.soundFX_Volume = soundFX_Volume;
    }

    @JsonProperty("SoundFX Volume#")
    public String getSoundFX_Volume_() {
        return soundFX_Volume_;
    }

    @JsonProperty("SoundFX Volume#")
    public void setSoundFX_Volume_(String soundFX_Volume_) {
        this.soundFX_Volume_ = soundFX_Volume_;
    }

    @JsonProperty("Speed Of Sound")
    public int getSpeed_Of_Sound() {
        return speed_Of_Sound;
    }

    @JsonProperty("Speed Of Sound")
    public void setSpeed_Of_Sound(int speed_Of_Sound) {
        this.speed_Of_Sound = speed_Of_Sound;
    }

    @JsonProperty("Speed Of Sound#")
    public String getSpeed_Of_Sound_() {
        return speed_Of_Sound_;
    }

    @JsonProperty("Speed Of Sound#")
    public void setSpeed_Of_Sound_(String speed_Of_Sound_) {
        this.speed_Of_Sound_ = speed_Of_Sound_;
    }

    @JsonProperty("Spotter Volume")
    public float getSpotter_Volume() {
        return spotter_Volume;
    }

    @JsonProperty("Spotter Volume")
    public void setSpotter_Volume(float spotter_Volume) {
        this.spotter_Volume = spotter_Volume;
    }

    @JsonProperty("Spotter Volume#")
    public String getSpotter_Volume_() {
        return spotter_Volume_;
    }

    @JsonProperty("Spotter Volume#")
    public void setSpotter_Volume_(String spotter_Volume_) {
        this.spotter_Volume_ = spotter_Volume_;
    }

    @JsonProperty("Thunder Volume Mult")
    public float getThunder_Volume_Mult() {
        return thunder_Volume_Mult;
    }

    @JsonProperty("Thunder Volume Mult")
    public void setThunder_Volume_Mult(float thunder_Volume_Mult) {
        this.thunder_Volume_Mult = thunder_Volume_Mult;
    }

    @JsonProperty("Thunder Volume Mult#")
    public String getThunder_Volume_Mult_() {
        return thunder_Volume_Mult_;
    }

    @JsonProperty("Thunder Volume Mult#")
    public void setThunder_Volume_Mult_(String thunder_Volume_Mult_) {
        this.thunder_Volume_Mult_ = thunder_Volume_Mult_;
    }

    @JsonProperty("Tire Volume Ratio")
    public float getTire_Volume_Ratio() {
        return tire_Volume_Ratio;
    }

    @JsonProperty("Tire Volume Ratio")
    public void setTire_Volume_Ratio(float tire_Volume_Ratio) {
        this.tire_Volume_Ratio = tire_Volume_Ratio;
    }

    @JsonProperty("Tire Volume Ratio#")
    public String getTire_Volume_Ratio_() {
        return tire_Volume_Ratio_;
    }

    @JsonProperty("Tire Volume Ratio#")
    public void setTire_Volume_Ratio_(String tire_Volume_Ratio_) {
        this.tire_Volume_Ratio_ = tire_Volume_Ratio_;
    }

    @JsonProperty("Track Load Commentary")
    public boolean isTrack_Load_Commentary() {
        return track_Load_Commentary;
    }

    @JsonProperty("Track Load Commentary")
    public void setTrack_Load_Commentary(boolean track_Load_Commentary) {
        this.track_Load_Commentary = track_Load_Commentary;
    }

    @JsonProperty("Track Load Commentary#")
    public String getTrack_Load_Commentary_() {
        return track_Load_Commentary_;
    }

    @JsonProperty("Track Load Commentary#")
    public void setTrack_Load_Commentary_(String track_Load_Commentary_) {
        this.track_Load_Commentary_ = track_Load_Commentary_;
    }

    @JsonProperty("Trackside Ambient")
    public int getTrackside_Ambient() {
        return trackside_Ambient;
    }

    @JsonProperty("Trackside Ambient")
    public void setTrackside_Ambient(int trackside_Ambient) {
        this.trackside_Ambient = trackside_Ambient;
    }

    @JsonProperty("Trackside Ambient#")
    public String getTrackside_Ambient_() {
        return trackside_Ambient_;
    }

    @JsonProperty("Trackside Ambient#")
    public void setTrackside_Ambient_(String trackside_Ambient_) {
        this.trackside_Ambient_ = trackside_Ambient_;
    }

    @JsonProperty("Trackside Exp Shape")
    public float getTrackside_Exp_Shape() {
        return trackside_Exp_Shape;
    }

    @JsonProperty("Trackside Exp Shape")
    public void setTrackside_Exp_Shape(float trackside_Exp_Shape) {
        this.trackside_Exp_Shape = trackside_Exp_Shape;
    }

    @JsonProperty("Trackside Exp Shape#")
    public String getTrackside_Exp_Shape_() {
        return trackside_Exp_Shape_;
    }

    @JsonProperty("Trackside Exp Shape#")
    public void setTrackside_Exp_Shape_(String trackside_Exp_Shape_) {
        this.trackside_Exp_Shape_ = trackside_Exp_Shape_;
    }

    @JsonProperty("Trackside Range")
    public int getTrackside_Range() {
        return trackside_Range;
    }

    @JsonProperty("Trackside Range")
    public void setTrackside_Range(int trackside_Range) {
        this.trackside_Range = trackside_Range;
    }

    @JsonProperty("Trackside Range#")
    public String getTrackside_Range_() {
        return trackside_Range_;
    }

    @JsonProperty("Trackside Range#")
    public void setTrackside_Range_(String trackside_Range_) {
        this.trackside_Range_ = trackside_Range_;
    }

    @JsonProperty("Trackside Shape")
    public float getTrackside_Shape() {
        return trackside_Shape;
    }

    @JsonProperty("Trackside Shape")
    public void setTrackside_Shape(float trackside_Shape) {
        this.trackside_Shape = trackside_Shape;
    }

    @JsonProperty("Trackside Shape#")
    public String getTrackside_Shape_() {
        return trackside_Shape_;
    }

    @JsonProperty("Trackside Shape#")
    public void setTrackside_Shape_(String trackside_Shape_) {
        this.trackside_Shape_ = trackside_Shape_;
    }

    @JsonProperty("Traction Control")
    public float getTraction_Control() {
        return traction_Control;
    }

    @JsonProperty("Traction Control")
    public void setTraction_Control(float traction_Control) {
        this.traction_Control = traction_Control;
    }

    @JsonProperty("Traction Control#")
    public String getTraction_Control_() {
        return traction_Control_;
    }

    @JsonProperty("Traction Control#")
    public void setTraction_Control_(String traction_Control_) {
        this.traction_Control_ = traction_Control_;
    }

    @JsonProperty("Vehicle Roadnoise FreqMin")
    public float getVehicle_Roadnoise_FreqMin() {
        return vehicle_Roadnoise_FreqMin;
    }

    @JsonProperty("Vehicle Roadnoise FreqMin")
    public void setVehicle_Roadnoise_FreqMin(float vehicle_Roadnoise_FreqMin) {
        this.vehicle_Roadnoise_FreqMin = vehicle_Roadnoise_FreqMin;
    }

    @JsonProperty("Vehicle Roadnoise FreqMult")
    public float getVehicle_Roadnoise_FreqMult() {
        return vehicle_Roadnoise_FreqMult;
    }

    @JsonProperty("Vehicle Roadnoise FreqMult")
    public void setVehicle_Roadnoise_FreqMult(float vehicle_Roadnoise_FreqMult) {
        this.vehicle_Roadnoise_FreqMult = vehicle_Roadnoise_FreqMult;
    }

    @JsonProperty("Vehicle Roadnoise VolMult")
    public float getVehicle_Roadnoise_VolMult() {
        return vehicle_Roadnoise_VolMult;
    }

    @JsonProperty("Vehicle Roadnoise VolMult")
    public void setVehicle_Roadnoise_VolMult(float vehicle_Roadnoise_VolMult) {
        this.vehicle_Roadnoise_VolMult = vehicle_Roadnoise_VolMult;
    }

    @JsonProperty("Vehicle Roadnoise VolSpeed")
    public int getVehicle_Roadnoise_VolSpeed() {
        return vehicle_Roadnoise_VolSpeed;
    }

    @JsonProperty("Vehicle Roadnoise VolSpeed")
    public void setVehicle_Roadnoise_VolSpeed(int vehicle_Roadnoise_VolSpeed) {
        this.vehicle_Roadnoise_VolSpeed = vehicle_Roadnoise_VolSpeed;
    }

    @JsonProperty("Vehicle Scrubbing VolMult")
    public float getVehicle_Scrubbing_VolMult() {
        return vehicle_Scrubbing_VolMult;
    }

    @JsonProperty("Vehicle Scrubbing VolMult")
    public void setVehicle_Scrubbing_VolMult(float vehicle_Scrubbing_VolMult) {
        this.vehicle_Scrubbing_VolMult = vehicle_Scrubbing_VolMult;
    }

    @JsonProperty("Vehicle Skidding FreqGrip")
    public float getVehicle_Skidding_FreqGrip() {
        return vehicle_Skidding_FreqGrip;
    }

    @JsonProperty("Vehicle Skidding FreqGrip")
    public void setVehicle_Skidding_FreqGrip(float vehicle_Skidding_FreqGrip) {
        this.vehicle_Skidding_FreqGrip = vehicle_Skidding_FreqGrip;
    }

    @JsonProperty("Vehicle Skidding FreqSpeed")
    public float getVehicle_Skidding_FreqSpeed() {
        return vehicle_Skidding_FreqSpeed;
    }

    @JsonProperty("Vehicle Skidding FreqSpeed")
    public void setVehicle_Skidding_FreqSpeed(float vehicle_Skidding_FreqSpeed) {
        this.vehicle_Skidding_FreqSpeed = vehicle_Skidding_FreqSpeed;
    }

    @JsonProperty("Vehicle Skidding VolMult")
    public float getVehicle_Skidding_VolMult() {
        return vehicle_Skidding_VolMult;
    }

    @JsonProperty("Vehicle Skidding VolMult")
    public void setVehicle_Skidding_VolMult(float vehicle_Skidding_VolMult) {
        this.vehicle_Skidding_VolMult = vehicle_Skidding_VolMult;
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
        sb.append(SoundOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("buffer_Count");
        sb.append('=');
        sb.append(this.buffer_Count);
        sb.append(',');
        sb.append("buffer_Count_");
        sb.append('=');
        sb.append(((this.buffer_Count_ == null) ? "<null>" : this.buffer_Count_));
        sb.append(',');
        sb.append("camera_Volume");
        sb.append('=');
        sb.append(this.camera_Volume);
        sb.append(',');
        sb.append("camera_Volume_");
        sb.append('=');
        sb.append(((this.camera_Volume_ == null) ? "<null>" : this.camera_Volume_));
        sb.append(',');
        sb.append("engine_Volume");
        sb.append('=');
        sb.append(this.engine_Volume);
        sb.append(',');
        sb.append("engine_Volume_Reduction");
        sb.append('=');
        sb.append(this.engine_Volume_Reduction);
        sb.append(',');
        sb.append("engine_Volume_Reduction_");
        sb.append('=');
        sb.append(((this.engine_Volume_Reduction_ == null) ? "<null>" : this.engine_Volume_Reduction_));
        sb.append(',');
        sb.append("engine_Volume_");
        sb.append('=');
        sb.append(((this.engine_Volume_ == null) ? "<null>" : this.engine_Volume_));
        sb.append(',');
        sb.append("maximum_Effects");
        sb.append('=');
        sb.append(this.maximum_Effects);
        sb.append(',');
        sb.append("maximum_Effects_");
        sb.append('=');
        sb.append(((this.maximum_Effects_ == null) ? "<null>" : this.maximum_Effects_));
        sb.append(',');
        sb.append("music");
        sb.append('=');
        sb.append(this.music);
        sb.append(',');
        sb.append("music_Volume");
        sb.append('=');
        sb.append(this.music_Volume);
        sb.append(',');
        sb.append("music_Volume_");
        sb.append('=');
        sb.append(((this.music_Volume_ == null) ? "<null>" : this.music_Volume_));
        sb.append(',');
        sb.append("music_");
        sb.append('=');
        sb.append(((this.music_ == null) ? "<null>" : this.music_));
        sb.append(',');
        sb.append("net_Race_Warning");
        sb.append('=');
        sb.append(((this.net_Race_Warning == null) ? "<null>" : this.net_Race_Warning));
        sb.append(',');
        sb.append("net_Race_Warning_");
        sb.append('=');
        sb.append(((this.net_Race_Warning_ == null) ? "<null>" : this.net_Race_Warning_));
        sb.append(',');
        sb.append("number_of_output_channels");
        sb.append('=');
        sb.append(this.number_of_output_channels);
        sb.append(',');
        sb.append("number_of_output_channels_");
        sb.append('=');
        sb.append(((this.number_of_output_channels_ == null) ? "<null>" : this.number_of_output_channels_));
        sb.append(',');
        sb.append("options_Volume");
        sb.append('=');
        sb.append(this.options_Volume);
        sb.append(',');
        sb.append("options_Volume_");
        sb.append('=');
        sb.append(((this.options_Volume_ == null) ? "<null>" : this.options_Volume_));
        sb.append(',');
        sb.append("other_Volume_Ratio");
        sb.append('=');
        sb.append(this.other_Volume_Ratio);
        sb.append(',');
        sb.append("other_Volume_Ratio_");
        sb.append('=');
        sb.append(((this.other_Volume_Ratio_ == null) ? "<null>" : this.other_Volume_Ratio_));
        sb.append(',');
        sb.append("pit_Volume");
        sb.append('=');
        sb.append(this.pit_Volume);
        sb.append(',');
        sb.append("pit_Volume_");
        sb.append('=');
        sb.append(((this.pit_Volume_ == null) ? "<null>" : this.pit_Volume_));
        sb.append(',');
        sb.append("player_Volume_Ratio");
        sb.append('=');
        sb.append(this.player_Volume_Ratio);
        sb.append(',');
        sb.append("player_Volume_Ratio_");
        sb.append('=');
        sb.append(((this.player_Volume_Ratio_ == null) ? "<null>" : this.player_Volume_Ratio_));
        sb.append(',');
        sb.append("rain_Volume_Mult");
        sb.append('=');
        sb.append(this.rain_Volume_Mult);
        sb.append(',');
        sb.append("rain_Volume_Mult_");
        sb.append('=');
        sb.append(((this.rain_Volume_Mult_ == null) ? "<null>" : this.rain_Volume_Mult_));
        sb.append(',');
        sb.append("realtime_In_Monitor");
        sb.append('=');
        sb.append(this.realtime_In_Monitor);
        sb.append(',');
        sb.append("realtime_In_Monitor_");
        sb.append('=');
        sb.append(((this.realtime_In_Monitor_ == null) ? "<null>" : this.realtime_In_Monitor_));
        sb.append(',');
        sb.append("reverb_Decay");
        sb.append('=');
        sb.append(this.reverb_Decay);
        sb.append(',');
        sb.append("reverb_Decay_");
        sb.append('=');
        sb.append(((this.reverb_Decay_ == null) ? "<null>" : this.reverb_Decay_));
        sb.append(',');
        sb.append("reverb_Dry_Volume");
        sb.append('=');
        sb.append(this.reverb_Dry_Volume);
        sb.append(',');
        sb.append("reverb_Dry_Volume_");
        sb.append('=');
        sb.append(((this.reverb_Dry_Volume_ == null) ? "<null>" : this.reverb_Dry_Volume_));
        sb.append(',');
        sb.append("reverb_Max_Dist");
        sb.append('=');
        sb.append(this.reverb_Max_Dist);
        sb.append(',');
        sb.append("reverb_Max_Dist_");
        sb.append('=');
        sb.append(((this.reverb_Max_Dist_ == null) ? "<null>" : this.reverb_Max_Dist_));
        sb.append(',');
        sb.append("reverb_Wet_Volume");
        sb.append('=');
        sb.append(this.reverb_Wet_Volume);
        sb.append(',');
        sb.append("reverb_Wet_Volume_");
        sb.append('=');
        sb.append(((this.reverb_Wet_Volume_ == null) ? "<null>" : this.reverb_Wet_Volume_));
        sb.append(',');
        sb.append("soundFX_Volume");
        sb.append('=');
        sb.append(this.soundFX_Volume);
        sb.append(',');
        sb.append("soundFX_Volume_");
        sb.append('=');
        sb.append(((this.soundFX_Volume_ == null) ? "<null>" : this.soundFX_Volume_));
        sb.append(',');
        sb.append("speed_Of_Sound");
        sb.append('=');
        sb.append(this.speed_Of_Sound);
        sb.append(',');
        sb.append("speed_Of_Sound_");
        sb.append('=');
        sb.append(((this.speed_Of_Sound_ == null) ? "<null>" : this.speed_Of_Sound_));
        sb.append(',');
        sb.append("spotter_Volume");
        sb.append('=');
        sb.append(this.spotter_Volume);
        sb.append(',');
        sb.append("spotter_Volume_");
        sb.append('=');
        sb.append(((this.spotter_Volume_ == null) ? "<null>" : this.spotter_Volume_));
        sb.append(',');
        sb.append("thunder_Volume_Mult");
        sb.append('=');
        sb.append(this.thunder_Volume_Mult);
        sb.append(',');
        sb.append("thunder_Volume_Mult_");
        sb.append('=');
        sb.append(((this.thunder_Volume_Mult_ == null) ? "<null>" : this.thunder_Volume_Mult_));
        sb.append(',');
        sb.append("tire_Volume_Ratio");
        sb.append('=');
        sb.append(this.tire_Volume_Ratio);
        sb.append(',');
        sb.append("tire_Volume_Ratio_");
        sb.append('=');
        sb.append(((this.tire_Volume_Ratio_ == null) ? "<null>" : this.tire_Volume_Ratio_));
        sb.append(',');
        sb.append("track_Load_Commentary");
        sb.append('=');
        sb.append(this.track_Load_Commentary);
        sb.append(',');
        sb.append("track_Load_Commentary_");
        sb.append('=');
        sb.append(((this.track_Load_Commentary_ == null) ? "<null>" : this.track_Load_Commentary_));
        sb.append(',');
        sb.append("trackside_Ambient");
        sb.append('=');
        sb.append(this.trackside_Ambient);
        sb.append(',');
        sb.append("trackside_Ambient_");
        sb.append('=');
        sb.append(((this.trackside_Ambient_ == null) ? "<null>" : this.trackside_Ambient_));
        sb.append(',');
        sb.append("trackside_Exp_Shape");
        sb.append('=');
        sb.append(this.trackside_Exp_Shape);
        sb.append(',');
        sb.append("trackside_Exp_Shape_");
        sb.append('=');
        sb.append(((this.trackside_Exp_Shape_ == null) ? "<null>" : this.trackside_Exp_Shape_));
        sb.append(',');
        sb.append("trackside_Range");
        sb.append('=');
        sb.append(this.trackside_Range);
        sb.append(',');
        sb.append("trackside_Range_");
        sb.append('=');
        sb.append(((this.trackside_Range_ == null) ? "<null>" : this.trackside_Range_));
        sb.append(',');
        sb.append("trackside_Shape");
        sb.append('=');
        sb.append(this.trackside_Shape);
        sb.append(',');
        sb.append("trackside_Shape_");
        sb.append('=');
        sb.append(((this.trackside_Shape_ == null) ? "<null>" : this.trackside_Shape_));
        sb.append(',');
        sb.append("traction_Control");
        sb.append('=');
        sb.append(this.traction_Control);
        sb.append(',');
        sb.append("traction_Control_");
        sb.append('=');
        sb.append(((this.traction_Control_ == null) ? "<null>" : this.traction_Control_));
        sb.append(',');
        sb.append("vehicle_Roadnoise_FreqMin");
        sb.append('=');
        sb.append(this.vehicle_Roadnoise_FreqMin);
        sb.append(',');
        sb.append("vehicle_Roadnoise_FreqMult");
        sb.append('=');
        sb.append(this.vehicle_Roadnoise_FreqMult);
        sb.append(',');
        sb.append("vehicle_Roadnoise_VolMult");
        sb.append('=');
        sb.append(this.vehicle_Roadnoise_VolMult);
        sb.append(',');
        sb.append("vehicle_Roadnoise_VolSpeed");
        sb.append('=');
        sb.append(this.vehicle_Roadnoise_VolSpeed);
        sb.append(',');
        sb.append("vehicle_Scrubbing_VolMult");
        sb.append('=');
        sb.append(this.vehicle_Scrubbing_VolMult);
        sb.append(',');
        sb.append("vehicle_Skidding_FreqGrip");
        sb.append('=');
        sb.append(this.vehicle_Skidding_FreqGrip);
        sb.append(',');
        sb.append("vehicle_Skidding_FreqSpeed");
        sb.append('=');
        sb.append(this.vehicle_Skidding_FreqSpeed);
        sb.append(',');
        sb.append("vehicle_Skidding_VolMult");
        sb.append('=');
        sb.append(this.vehicle_Skidding_VolMult);
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
        result = ((result * 31) + ((this.trackside_Ambient_ == null) ? 0 : this.trackside_Ambient_.hashCode()));
        result = ((result * 31) + ((this.realtime_In_Monitor_ == null) ? 0 : this.realtime_In_Monitor_.hashCode()));
        result = ((result * 31) + ((this.other_Volume_Ratio_ == null) ? 0 : this.other_Volume_Ratio_.hashCode()));
        result = ((result * 31) + ((this.maximum_Effects_ == null) ? 0 : this.maximum_Effects_.hashCode()));
        result = ((result * 31) + this.trackside_Range);
        result = ((result * 31) + ((this.trackside_Range_ == null) ? 0 : this.trackside_Range_.hashCode()));
        result = ((result * 31) + this.maximum_Effects);
        result = ((result * 31) + ((this.music_Volume_ == null) ? 0 : this.music_Volume_.hashCode()));
        result = ((result * 31) + this.reverb_Max_Dist);
        result = ((result * 31) + Float.floatToIntBits(this.reverb_Dry_Volume));
        result = ((result * 31) + this.vehicle_Roadnoise_VolSpeed);
        result = ((result * 31) + ((this.trackside_Exp_Shape_ == null) ? 0 : this.trackside_Exp_Shape_.hashCode()));
        result = ((result * 31) + ((this.trackside_Shape_ == null) ? 0 : this.trackside_Shape_.hashCode()));
        result = ((result * 31) + ((this.speed_Of_Sound_ == null) ? 0 : this.speed_Of_Sound_.hashCode()));
        result = ((result * 31) + this.engine_Volume_Reduction);
        result = ((result * 31) + this.music);
        result = ((result * 31) + ((this.options_Volume_ == null) ? 0 : this.options_Volume_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.vehicle_Skidding_FreqSpeed));
        result = ((result * 31) + ((this.soundFX_Volume_ == null) ? 0 : this.soundFX_Volume_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.trackside_Exp_Shape));
        result = ((result * 31) + ((this.reverb_Dry_Volume_ == null) ? 0 : this.reverb_Dry_Volume_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.tire_Volume_Ratio));
        result = ((result * 31) + ((this.track_Load_Commentary_ == null) ? 0 : this.track_Load_Commentary_.hashCode()));
        result = ((result * 31) + this.trackside_Ambient);
        result = ((result * 31) + ((this.reverb_Decay_ == null) ? 0 : this.reverb_Decay_.hashCode()));
        result = ((result * 31) + ((this.rain_Volume_Mult_ == null) ? 0 : this.rain_Volume_Mult_.hashCode()));
        result = ((result * 31) + ((this.net_Race_Warning_ == null) ? 0 : this.net_Race_Warning_.hashCode()));
        result = ((result * 31) + this.soundFX_Volume);
        result = ((result * 31) + Float.floatToIntBits(this.thunder_Volume_Mult));
        result = ((result * 31) + ((this.camera_Volume_ == null) ? 0 : this.camera_Volume_.hashCode()));
        result = ((result * 31) + ((this.reverb_Wet_Volume_ == null) ? 0 : this.reverb_Wet_Volume_.hashCode()));
        result = ((result * 31) + ((this.net_Race_Warning == null) ? 0 : this.net_Race_Warning.hashCode()));
        result = ((result * 31) + this.player_Volume_Ratio);
        result = ((result * 31) + Float.floatToIntBits(this.spotter_Volume));
        result = ((result * 31) + this.camera_Volume);
        result = ((result * 31) + (this.track_Load_Commentary ? 1 : 0));
        result = ((result * 31) + this.number_of_output_channels);
        result = ((result * 31) + ((this.buffer_Count_ == null) ? 0 : this.buffer_Count_.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.traction_Control));
        result = ((result * 31) + this.engine_Volume);
        result = ((result * 31) + ((this.thunder_Volume_Mult_ == null) ? 0 : this.thunder_Volume_Mult_.hashCode()));
        result = ((result * 31) + ((this.engine_Volume_Reduction_ == null) ? 0 : this.engine_Volume_Reduction_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.vehicle_Skidding_FreqGrip));
        result = ((result * 31) + Float.floatToIntBits(this.vehicle_Skidding_VolMult));
        result = ((result * 31) + Float.floatToIntBits(this.options_Volume));
        result = ((result * 31) + ((this.reverb_Max_Dist_ == null) ? 0 : this.reverb_Max_Dist_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.reverb_Decay));
        result = ((result * 31) + ((this.player_Volume_Ratio_ == null) ? 0 : this.player_Volume_Ratio_.hashCode()));
        result = ((result * 31) + ((this.traction_Control_ == null) ? 0 : this.traction_Control_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.vehicle_Roadnoise_VolMult));
        result = ((result * 31) + Float.floatToIntBits(this.music_Volume));
        result = ((result * 31) + this.buffer_Count);
        result = ((result * 31) + ((this.number_of_output_channels_ == null) ? 0 : this.number_of_output_channels_.hashCode()));
        result = ((result * 31) + (this.realtime_In_Monitor ? 1 : 0));
        result = ((result * 31) + Float.floatToIntBits(this.vehicle_Roadnoise_FreqMin));
        result = ((result * 31) + Float.floatToIntBits(this.pit_Volume));
        result = ((result * 31) + Float.floatToIntBits(this.vehicle_Roadnoise_FreqMult));
        result = ((result * 31) + Float.floatToIntBits(this.reverb_Wet_Volume));
        result = ((result * 31) + this.speed_Of_Sound);
        result = ((result * 31) + ((this.pit_Volume_ == null) ? 0 : this.pit_Volume_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.vehicle_Scrubbing_VolMult));
        result = ((result * 31) + ((this.spotter_Volume_ == null) ? 0 : this.spotter_Volume_.hashCode()));
        result = ((result * 31) + ((this.engine_Volume_ == null) ? 0 : this.engine_Volume_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.rain_Volume_Mult));
        result = ((result * 31) + ((this.tire_Volume_Ratio_ == null) ? 0 : this.tire_Volume_Ratio_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.other_Volume_Ratio));
        result = ((result * 31) + ((this.music_ == null) ? 0 : this.music_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.trackside_Shape));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SoundOptions) == false) {
            return false;
        }
        SoundOptions rhs = ((SoundOptions) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.trackside_Ambient_ == rhs.trackside_Ambient_) || ((this.trackside_Ambient_ != null) && this.trackside_Ambient_.equals(rhs.trackside_Ambient_))) && ((this.realtime_In_Monitor_ == rhs.realtime_In_Monitor_) || ((this.realtime_In_Monitor_ != null) && this.realtime_In_Monitor_.equals(rhs.realtime_In_Monitor_)))) && ((this.other_Volume_Ratio_ == rhs.other_Volume_Ratio_) || ((this.other_Volume_Ratio_ != null) && this.other_Volume_Ratio_.equals(rhs.other_Volume_Ratio_)))) && ((this.maximum_Effects_ == rhs.maximum_Effects_) || ((this.maximum_Effects_ != null) && this.maximum_Effects_.equals(rhs.maximum_Effects_)))) && (this.trackside_Range == rhs.trackside_Range)) && ((this.trackside_Range_ == rhs.trackside_Range_) || ((this.trackside_Range_ != null) && this.trackside_Range_.equals(rhs.trackside_Range_)))) && (this.maximum_Effects == rhs.maximum_Effects)) && ((this.music_Volume_ == rhs.music_Volume_) || ((this.music_Volume_ != null) && this.music_Volume_.equals(rhs.music_Volume_)))) && (this.reverb_Max_Dist == rhs.reverb_Max_Dist)) && (Float.floatToIntBits(this.reverb_Dry_Volume) == Float.floatToIntBits(rhs.reverb_Dry_Volume))) && (this.vehicle_Roadnoise_VolSpeed == rhs.vehicle_Roadnoise_VolSpeed)) && ((this.trackside_Exp_Shape_ == rhs.trackside_Exp_Shape_) || ((this.trackside_Exp_Shape_ != null) && this.trackside_Exp_Shape_.equals(rhs.trackside_Exp_Shape_)))) && ((this.trackside_Shape_ == rhs.trackside_Shape_) || ((this.trackside_Shape_ != null) && this.trackside_Shape_.equals(rhs.trackside_Shape_)))) && ((this.speed_Of_Sound_ == rhs.speed_Of_Sound_) || ((this.speed_Of_Sound_ != null) && this.speed_Of_Sound_.equals(rhs.speed_Of_Sound_)))) && (this.engine_Volume_Reduction == rhs.engine_Volume_Reduction)) && (this.music == rhs.music)) && ((this.options_Volume_ == rhs.options_Volume_) || ((this.options_Volume_ != null) && this.options_Volume_.equals(rhs.options_Volume_)))) && (Float.floatToIntBits(this.vehicle_Skidding_FreqSpeed) == Float.floatToIntBits(rhs.vehicle_Skidding_FreqSpeed))) && ((this.soundFX_Volume_ == rhs.soundFX_Volume_) || ((this.soundFX_Volume_ != null) && this.soundFX_Volume_.equals(rhs.soundFX_Volume_)))) && (Float.floatToIntBits(this.trackside_Exp_Shape) == Float.floatToIntBits(rhs.trackside_Exp_Shape))) && ((this.reverb_Dry_Volume_ == rhs.reverb_Dry_Volume_) || ((this.reverb_Dry_Volume_ != null) && this.reverb_Dry_Volume_.equals(rhs.reverb_Dry_Volume_)))) && (Float.floatToIntBits(this.tire_Volume_Ratio) == Float.floatToIntBits(rhs.tire_Volume_Ratio))) && ((this.track_Load_Commentary_ == rhs.track_Load_Commentary_) || ((this.track_Load_Commentary_ != null) && this.track_Load_Commentary_.equals(rhs.track_Load_Commentary_)))) && (this.trackside_Ambient == rhs.trackside_Ambient)) && ((this.reverb_Decay_ == rhs.reverb_Decay_) || ((this.reverb_Decay_ != null) && this.reverb_Decay_.equals(rhs.reverb_Decay_)))) && ((this.rain_Volume_Mult_ == rhs.rain_Volume_Mult_) || ((this.rain_Volume_Mult_ != null) && this.rain_Volume_Mult_.equals(rhs.rain_Volume_Mult_)))) && ((this.net_Race_Warning_ == rhs.net_Race_Warning_) || ((this.net_Race_Warning_ != null) && this.net_Race_Warning_.equals(rhs.net_Race_Warning_)))) && (this.soundFX_Volume == rhs.soundFX_Volume)) && (Float.floatToIntBits(this.thunder_Volume_Mult) == Float.floatToIntBits(rhs.thunder_Volume_Mult))) && ((this.camera_Volume_ == rhs.camera_Volume_) || ((this.camera_Volume_ != null) && this.camera_Volume_.equals(rhs.camera_Volume_)))) && ((this.reverb_Wet_Volume_ == rhs.reverb_Wet_Volume_) || ((this.reverb_Wet_Volume_ != null) && this.reverb_Wet_Volume_.equals(rhs.reverb_Wet_Volume_)))) && ((this.net_Race_Warning == rhs.net_Race_Warning) || ((this.net_Race_Warning != null) && this.net_Race_Warning.equals(rhs.net_Race_Warning)))) && (this.player_Volume_Ratio == rhs.player_Volume_Ratio)) && (Float.floatToIntBits(this.spotter_Volume) == Float.floatToIntBits(rhs.spotter_Volume))) && (this.camera_Volume == rhs.camera_Volume)) && (this.track_Load_Commentary == rhs.track_Load_Commentary)) && (this.number_of_output_channels == rhs.number_of_output_channels)) && ((this.buffer_Count_ == rhs.buffer_Count_) || ((this.buffer_Count_ != null) && this.buffer_Count_.equals(rhs.buffer_Count_)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && (Float.floatToIntBits(this.traction_Control) == Float.floatToIntBits(rhs.traction_Control))) && (this.engine_Volume == rhs.engine_Volume)) && ((this.thunder_Volume_Mult_ == rhs.thunder_Volume_Mult_) || ((this.thunder_Volume_Mult_ != null) && this.thunder_Volume_Mult_.equals(rhs.thunder_Volume_Mult_)))) && ((this.engine_Volume_Reduction_ == rhs.engine_Volume_Reduction_) || ((this.engine_Volume_Reduction_ != null) && this.engine_Volume_Reduction_.equals(rhs.engine_Volume_Reduction_)))) && (Float.floatToIntBits(this.vehicle_Skidding_FreqGrip) == Float.floatToIntBits(rhs.vehicle_Skidding_FreqGrip))) && (Float.floatToIntBits(this.vehicle_Skidding_VolMult) == Float.floatToIntBits(rhs.vehicle_Skidding_VolMult))) && (Float.floatToIntBits(this.options_Volume) == Float.floatToIntBits(rhs.options_Volume))) && ((this.reverb_Max_Dist_ == rhs.reverb_Max_Dist_) || ((this.reverb_Max_Dist_ != null) && this.reverb_Max_Dist_.equals(rhs.reverb_Max_Dist_)))) && (Float.floatToIntBits(this.reverb_Decay) == Float.floatToIntBits(rhs.reverb_Decay))) && ((this.player_Volume_Ratio_ == rhs.player_Volume_Ratio_) || ((this.player_Volume_Ratio_ != null) && this.player_Volume_Ratio_.equals(rhs.player_Volume_Ratio_)))) && ((this.traction_Control_ == rhs.traction_Control_) || ((this.traction_Control_ != null) && this.traction_Control_.equals(rhs.traction_Control_)))) && (Float.floatToIntBits(this.vehicle_Roadnoise_VolMult) == Float.floatToIntBits(rhs.vehicle_Roadnoise_VolMult))) && (Float.floatToIntBits(this.music_Volume) == Float.floatToIntBits(rhs.music_Volume))) && (this.buffer_Count == rhs.buffer_Count)) && ((this.number_of_output_channels_ == rhs.number_of_output_channels_) || ((this.number_of_output_channels_ != null) && this.number_of_output_channels_.equals(rhs.number_of_output_channels_)))) && (this.realtime_In_Monitor == rhs.realtime_In_Monitor)) && (Float.floatToIntBits(this.vehicle_Roadnoise_FreqMin) == Float.floatToIntBits(rhs.vehicle_Roadnoise_FreqMin))) && (Float.floatToIntBits(this.pit_Volume) == Float.floatToIntBits(rhs.pit_Volume))) && (Float.floatToIntBits(this.vehicle_Roadnoise_FreqMult) == Float.floatToIntBits(rhs.vehicle_Roadnoise_FreqMult))) && (Float.floatToIntBits(this.reverb_Wet_Volume) == Float.floatToIntBits(rhs.reverb_Wet_Volume))) && (this.speed_Of_Sound == rhs.speed_Of_Sound)) && ((this.pit_Volume_ == rhs.pit_Volume_) || ((this.pit_Volume_ != null) && this.pit_Volume_.equals(rhs.pit_Volume_)))) && (Float.floatToIntBits(this.vehicle_Scrubbing_VolMult) == Float.floatToIntBits(rhs.vehicle_Scrubbing_VolMult))) && ((this.spotter_Volume_ == rhs.spotter_Volume_) || ((this.spotter_Volume_ != null) && this.spotter_Volume_.equals(rhs.spotter_Volume_)))) && ((this.engine_Volume_ == rhs.engine_Volume_) || ((this.engine_Volume_ != null) && this.engine_Volume_.equals(rhs.engine_Volume_)))) && (Float.floatToIntBits(this.rain_Volume_Mult) == Float.floatToIntBits(rhs.rain_Volume_Mult))) && ((this.tire_Volume_Ratio_ == rhs.tire_Volume_Ratio_) || ((this.tire_Volume_Ratio_ != null) && this.tire_Volume_Ratio_.equals(rhs.tire_Volume_Ratio_)))) && (Float.floatToIntBits(this.other_Volume_Ratio) == Float.floatToIntBits(rhs.other_Volume_Ratio))) && ((this.music_ == rhs.music_) || ((this.music_ != null) && this.music_.equals(rhs.music_)))) && (Float.floatToIntBits(this.trackside_Shape) == Float.floatToIntBits(rhs.trackside_Shape)));
    }

}
