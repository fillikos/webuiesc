package de.fillikos.rf2.esctool.data.rf2data.player;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Antilock Brakes",
        "Auto Blip",
        "Auto Blip#",
        "Auto Clutch",
        "Auto Headlights",
        "Auto Headlights#",
        "Auto Lift",
        "Auto Lift#",
        "Auto Shift Override Time",
        "Auto Shift Override Time#",
        "Auto Windscreen Wipers",
        "Auto Windscreen Wipers#",
        "Autopit",
        "Brake Help",
        "Display TGM",
        "Drive AI Physics",
        "Drive AI Physics#",
        "Hold Brakes",
        "Hold Brakes#",
        "Hold Clutch On Start",
        "Hold Clutch On Start#",
        "Invulnerability",
        "Manual Shift Override Time",
        "Manual Shift Override Time#",
        "No AI Control",
        "No AI Control#",
        "Old Tire Model",
        "Old Tire Model#",
        "Opposite Lock",
        "Repeat Shifts",
        "Repeat Shifts#",
        "Shift Mode",
        "Spin Recovery",
        "Stability Control",
        "Start Engine",
        "Start Engine#",
        "Steering Help",
        "Steering Help#",
        "Throttle Control",
        "Track Markers",
        "Track Markers#"
})
@Generated("jsonschema2pojo")
public class DrivingAids {

    @JsonProperty("Antilock Brakes")
    private int antilock_Brakes;
    @JsonProperty("Auto Blip")
    private boolean auto_Blip;
    @JsonProperty("Auto Blip#")
    private String auto_Blip_;
    @JsonProperty("Auto Clutch")
    private int auto_Clutch;
    @JsonProperty("Auto Headlights")
    private boolean auto_Headlights;
    @JsonProperty("Auto Headlights#")
    private String auto_Headlights_;
    @JsonProperty("Auto Lift")
    private boolean auto_Lift;
    @JsonProperty("Auto Lift#")
    private String auto_Lift_;
    @JsonProperty("Auto Shift Override Time")
    private float auto_Shift_Override_Time;
    @JsonProperty("Auto Shift Override Time#")
    private String auto_Shift_Override_Time_;
    @JsonProperty("Auto Windscreen Wipers")
    private boolean auto_Windscreen_Wipers;
    @JsonProperty("Auto Windscreen Wipers#")
    private String auto_Windscreen_Wipers_;
    @JsonProperty("Autopit")
    private int autopit;
    @JsonProperty("Brake Help")
    private int brake_Help;
    @JsonProperty("Display TGM")
    private int display_TGM;
    @JsonProperty("Drive AI Physics")
    private boolean drive_AI_Physics;
    @JsonProperty("Drive AI Physics#")
    private String drive_AI_Physics_;
    @JsonProperty("Hold Brakes")
    private boolean hold_Brakes;
    @JsonProperty("Hold Brakes#")
    private String hold_Brakes_;
    @JsonProperty("Hold Clutch On Start")
    private boolean hold_Clutch_On_Start;
    @JsonProperty("Hold Clutch On Start#")
    private String hold_Clutch_On_Start_;
    @JsonProperty("Invulnerability")
    private int invulnerability;
    @JsonProperty("Manual Shift Override Time")
    private float manual_Shift_Override_Time;
    @JsonProperty("Manual Shift Override Time#")
    private String manual_Shift_Override_Time_;
    @JsonProperty("No AI Control")
    private int no_AI_Control;
    @JsonProperty("No AI Control#")
    private String no_AI_Control_;
    @JsonProperty("Old Tire Model")
    private boolean old_Tire_Model;
    @JsonProperty("Old Tire Model#")
    private String old_Tire_Model_;
    @JsonProperty("Opposite Lock")
    private int opposite_Lock;
    @JsonProperty("Repeat Shifts")
    private int repeat_Shifts;
    @JsonProperty("Repeat Shifts#")
    private String repeat_Shifts_;
    @JsonProperty("Shift Mode")
    private int shift_Mode;
    @JsonProperty("Spin Recovery")
    private int spin_Recovery;
    @JsonProperty("Stability Control")
    private int stability_Control;
    @JsonProperty("Start Engine")
    private boolean start_Engine;
    @JsonProperty("Start Engine#")
    private String start_Engine_;
    @JsonProperty("Steering Help")
    private int steering_Help;
    @JsonProperty("Steering Help#")
    private String steering_Help_;
    @JsonProperty("Throttle Control")
    private int throttle_Control;
    @JsonProperty("Track Markers")
    private boolean track_Markers;
    @JsonProperty("Track Markers#")
    private String track_Markers_;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public DrivingAids() {
    }

    /**
     * @param throttle_Control
     * @param auto_Windscreen_Wipers_
     * @param auto_Lift
     * @param start_Engine_
     * @param auto_Windscreen_Wipers
     * @param display_TGM
     * @param auto_Blip
     * @param hold_Brakes
     * @param shift_Mode
     * @param track_Markers
     * @param invulnerability
     * @param auto_Clutch
     * @param track_Markers_
     * @param old_Tire_Model_
     * @param spin_Recovery
     * @param auto_Headlights
     * @param manual_Shift_Override_Time_
     * @param steering_Help
     * @param hold_Brakes_
     * @param repeat_Shifts
     * @param hold_Clutch_On_Start_
     * @param drive_AI_Physics
     * @param repeat_Shifts_
     * @param stability_Control
     * @param brake_Help
     * @param steering_Help_
     * @param antilock_Brakes
     * @param old_Tire_Model
     * @param drive_AI_Physics_
     * @param start_Engine
     * @param auto_Headlights_
     * @param opposite_Lock
     * @param auto_Shift_Override_Time
     * @param hold_Clutch_On_Start
     * @param autopit
     * @param auto_Lift_
     * @param auto_Blip_
     * @param manual_Shift_Override_Time
     * @param auto_Shift_Override_Time_
     * @param no_AI_Control_
     * @param no_AI_Control
     */
    public DrivingAids(int antilock_Brakes, boolean auto_Blip, String auto_Blip_, int auto_Clutch, boolean auto_Headlights, String auto_Headlights_, boolean auto_Lift, String auto_Lift_, float auto_Shift_Override_Time, String auto_Shift_Override_Time_, boolean auto_Windscreen_Wipers, String auto_Windscreen_Wipers_, int autopit, int brake_Help, int display_TGM, boolean drive_AI_Physics, String drive_AI_Physics_, boolean hold_Brakes, String hold_Brakes_, boolean hold_Clutch_On_Start, String hold_Clutch_On_Start_, int invulnerability, float manual_Shift_Override_Time, String manual_Shift_Override_Time_, int no_AI_Control, String no_AI_Control_, boolean old_Tire_Model, String old_Tire_Model_, int opposite_Lock, int repeat_Shifts, String repeat_Shifts_, int shift_Mode, int spin_Recovery, int stability_Control, boolean start_Engine, String start_Engine_, int steering_Help, String steering_Help_, int throttle_Control, boolean track_Markers, String track_Markers_) {
        super();
        this.antilock_Brakes = antilock_Brakes;
        this.auto_Blip = auto_Blip;
        this.auto_Blip_ = auto_Blip_;
        this.auto_Clutch = auto_Clutch;
        this.auto_Headlights = auto_Headlights;
        this.auto_Headlights_ = auto_Headlights_;
        this.auto_Lift = auto_Lift;
        this.auto_Lift_ = auto_Lift_;
        this.auto_Shift_Override_Time = auto_Shift_Override_Time;
        this.auto_Shift_Override_Time_ = auto_Shift_Override_Time_;
        this.auto_Windscreen_Wipers = auto_Windscreen_Wipers;
        this.auto_Windscreen_Wipers_ = auto_Windscreen_Wipers_;
        this.autopit = autopit;
        this.brake_Help = brake_Help;
        this.display_TGM = display_TGM;
        this.drive_AI_Physics = drive_AI_Physics;
        this.drive_AI_Physics_ = drive_AI_Physics_;
        this.hold_Brakes = hold_Brakes;
        this.hold_Brakes_ = hold_Brakes_;
        this.hold_Clutch_On_Start = hold_Clutch_On_Start;
        this.hold_Clutch_On_Start_ = hold_Clutch_On_Start_;
        this.invulnerability = invulnerability;
        this.manual_Shift_Override_Time = manual_Shift_Override_Time;
        this.manual_Shift_Override_Time_ = manual_Shift_Override_Time_;
        this.no_AI_Control = no_AI_Control;
        this.no_AI_Control_ = no_AI_Control_;
        this.old_Tire_Model = old_Tire_Model;
        this.old_Tire_Model_ = old_Tire_Model_;
        this.opposite_Lock = opposite_Lock;
        this.repeat_Shifts = repeat_Shifts;
        this.repeat_Shifts_ = repeat_Shifts_;
        this.shift_Mode = shift_Mode;
        this.spin_Recovery = spin_Recovery;
        this.stability_Control = stability_Control;
        this.start_Engine = start_Engine;
        this.start_Engine_ = start_Engine_;
        this.steering_Help = steering_Help;
        this.steering_Help_ = steering_Help_;
        this.throttle_Control = throttle_Control;
        this.track_Markers = track_Markers;
        this.track_Markers_ = track_Markers_;
    }

    @JsonProperty("Antilock Brakes")
    public int getAntilock_Brakes() {
        return antilock_Brakes;
    }

    @JsonProperty("Antilock Brakes")
    public void setAntilock_Brakes(int antilock_Brakes) {
        this.antilock_Brakes = antilock_Brakes;
    }

    @JsonProperty("Auto Blip")
    public boolean isAuto_Blip() {
        return auto_Blip;
    }

    @JsonProperty("Auto Blip")
    public void setAuto_Blip(boolean auto_Blip) {
        this.auto_Blip = auto_Blip;
    }

    @JsonProperty("Auto Blip#")
    public String getAuto_Blip_() {
        return auto_Blip_;
    }

    @JsonProperty("Auto Blip#")
    public void setAuto_Blip_(String auto_Blip_) {
        this.auto_Blip_ = auto_Blip_;
    }

    @JsonProperty("Auto Clutch")
    public int getAuto_Clutch() {
        return auto_Clutch;
    }

    @JsonProperty("Auto Clutch")
    public void setAuto_Clutch(int auto_Clutch) {
        this.auto_Clutch = auto_Clutch;
    }

    @JsonProperty("Auto Headlights")
    public boolean isAuto_Headlights() {
        return auto_Headlights;
    }

    @JsonProperty("Auto Headlights")
    public void setAuto_Headlights(boolean auto_Headlights) {
        this.auto_Headlights = auto_Headlights;
    }

    @JsonProperty("Auto Headlights#")
    public String getAuto_Headlights_() {
        return auto_Headlights_;
    }

    @JsonProperty("Auto Headlights#")
    public void setAuto_Headlights_(String auto_Headlights_) {
        this.auto_Headlights_ = auto_Headlights_;
    }

    @JsonProperty("Auto Lift")
    public boolean isAuto_Lift() {
        return auto_Lift;
    }

    @JsonProperty("Auto Lift")
    public void setAuto_Lift(boolean auto_Lift) {
        this.auto_Lift = auto_Lift;
    }

    @JsonProperty("Auto Lift#")
    public String getAuto_Lift_() {
        return auto_Lift_;
    }

    @JsonProperty("Auto Lift#")
    public void setAuto_Lift_(String auto_Lift_) {
        this.auto_Lift_ = auto_Lift_;
    }

    @JsonProperty("Auto Shift Override Time")
    public float getAuto_Shift_Override_Time() {
        return auto_Shift_Override_Time;
    }

    @JsonProperty("Auto Shift Override Time")
    public void setAuto_Shift_Override_Time(float auto_Shift_Override_Time) {
        this.auto_Shift_Override_Time = auto_Shift_Override_Time;
    }

    @JsonProperty("Auto Shift Override Time#")
    public String getAuto_Shift_Override_Time_() {
        return auto_Shift_Override_Time_;
    }

    @JsonProperty("Auto Shift Override Time#")
    public void setAuto_Shift_Override_Time_(String auto_Shift_Override_Time_) {
        this.auto_Shift_Override_Time_ = auto_Shift_Override_Time_;
    }

    @JsonProperty("Auto Windscreen Wipers")
    public boolean isAuto_Windscreen_Wipers() {
        return auto_Windscreen_Wipers;
    }

    @JsonProperty("Auto Windscreen Wipers")
    public void setAuto_Windscreen_Wipers(boolean auto_Windscreen_Wipers) {
        this.auto_Windscreen_Wipers = auto_Windscreen_Wipers;
    }

    @JsonProperty("Auto Windscreen Wipers#")
    public String getAuto_Windscreen_Wipers_() {
        return auto_Windscreen_Wipers_;
    }

    @JsonProperty("Auto Windscreen Wipers#")
    public void setAuto_Windscreen_Wipers_(String auto_Windscreen_Wipers_) {
        this.auto_Windscreen_Wipers_ = auto_Windscreen_Wipers_;
    }

    @JsonProperty("Autopit")
    public int getAutopit() {
        return autopit;
    }

    @JsonProperty("Autopit")
    public void setAutopit(int autopit) {
        this.autopit = autopit;
    }

    @JsonProperty("Brake Help")
    public int getBrake_Help() {
        return brake_Help;
    }

    @JsonProperty("Brake Help")
    public void setBrake_Help(int brake_Help) {
        this.brake_Help = brake_Help;
    }

    @JsonProperty("Display TGM")
    public int getDisplay_TGM() {
        return display_TGM;
    }

    @JsonProperty("Display TGM")
    public void setDisplay_TGM(int display_TGM) {
        this.display_TGM = display_TGM;
    }

    @JsonProperty("Drive AI Physics")
    public boolean isDrive_AI_Physics() {
        return drive_AI_Physics;
    }

    @JsonProperty("Drive AI Physics")
    public void setDrive_AI_Physics(boolean drive_AI_Physics) {
        this.drive_AI_Physics = drive_AI_Physics;
    }

    @JsonProperty("Drive AI Physics#")
    public String getDrive_AI_Physics_() {
        return drive_AI_Physics_;
    }

    @JsonProperty("Drive AI Physics#")
    public void setDrive_AI_Physics_(String drive_AI_Physics_) {
        this.drive_AI_Physics_ = drive_AI_Physics_;
    }

    @JsonProperty("Hold Brakes")
    public boolean isHold_Brakes() {
        return hold_Brakes;
    }

    @JsonProperty("Hold Brakes")
    public void setHold_Brakes(boolean hold_Brakes) {
        this.hold_Brakes = hold_Brakes;
    }

    @JsonProperty("Hold Brakes#")
    public String getHold_Brakes_() {
        return hold_Brakes_;
    }

    @JsonProperty("Hold Brakes#")
    public void setHold_Brakes_(String hold_Brakes_) {
        this.hold_Brakes_ = hold_Brakes_;
    }

    @JsonProperty("Hold Clutch On Start")
    public boolean isHold_Clutch_On_Start() {
        return hold_Clutch_On_Start;
    }

    @JsonProperty("Hold Clutch On Start")
    public void setHold_Clutch_On_Start(boolean hold_Clutch_On_Start) {
        this.hold_Clutch_On_Start = hold_Clutch_On_Start;
    }

    @JsonProperty("Hold Clutch On Start#")
    public String getHold_Clutch_On_Start_() {
        return hold_Clutch_On_Start_;
    }

    @JsonProperty("Hold Clutch On Start#")
    public void setHold_Clutch_On_Start_(String hold_Clutch_On_Start_) {
        this.hold_Clutch_On_Start_ = hold_Clutch_On_Start_;
    }

    @JsonProperty("Invulnerability")
    public int getInvulnerability() {
        return invulnerability;
    }

    @JsonProperty("Invulnerability")
    public void setInvulnerability(int invulnerability) {
        this.invulnerability = invulnerability;
    }

    @JsonProperty("Manual Shift Override Time")
    public float getManual_Shift_Override_Time() {
        return manual_Shift_Override_Time;
    }

    @JsonProperty("Manual Shift Override Time")
    public void setManual_Shift_Override_Time(float manual_Shift_Override_Time) {
        this.manual_Shift_Override_Time = manual_Shift_Override_Time;
    }

    @JsonProperty("Manual Shift Override Time#")
    public String getManual_Shift_Override_Time_() {
        return manual_Shift_Override_Time_;
    }

    @JsonProperty("Manual Shift Override Time#")
    public void setManual_Shift_Override_Time_(String manual_Shift_Override_Time_) {
        this.manual_Shift_Override_Time_ = manual_Shift_Override_Time_;
    }

    @JsonProperty("No AI Control")
    public int getNo_AI_Control() {
        return no_AI_Control;
    }

    @JsonProperty("No AI Control")
    public void setNo_AI_Control(int no_AI_Control) {
        this.no_AI_Control = no_AI_Control;
    }

    @JsonProperty("No AI Control#")
    public String getNo_AI_Control_() {
        return no_AI_Control_;
    }

    @JsonProperty("No AI Control#")
    public void setNo_AI_Control_(String no_AI_Control_) {
        this.no_AI_Control_ = no_AI_Control_;
    }

    @JsonProperty("Old Tire Model")
    public boolean isOld_Tire_Model() {
        return old_Tire_Model;
    }

    @JsonProperty("Old Tire Model")
    public void setOld_Tire_Model(boolean old_Tire_Model) {
        this.old_Tire_Model = old_Tire_Model;
    }

    @JsonProperty("Old Tire Model#")
    public String getOld_Tire_Model_() {
        return old_Tire_Model_;
    }

    @JsonProperty("Old Tire Model#")
    public void setOld_Tire_Model_(String old_Tire_Model_) {
        this.old_Tire_Model_ = old_Tire_Model_;
    }

    @JsonProperty("Opposite Lock")
    public int getOpposite_Lock() {
        return opposite_Lock;
    }

    @JsonProperty("Opposite Lock")
    public void setOpposite_Lock(int opposite_Lock) {
        this.opposite_Lock = opposite_Lock;
    }

    @JsonProperty("Repeat Shifts")
    public int getRepeat_Shifts() {
        return repeat_Shifts;
    }

    @JsonProperty("Repeat Shifts")
    public void setRepeat_Shifts(int repeat_Shifts) {
        this.repeat_Shifts = repeat_Shifts;
    }

    @JsonProperty("Repeat Shifts#")
    public String getRepeat_Shifts_() {
        return repeat_Shifts_;
    }

    @JsonProperty("Repeat Shifts#")
    public void setRepeat_Shifts_(String repeat_Shifts_) {
        this.repeat_Shifts_ = repeat_Shifts_;
    }

    @JsonProperty("Shift Mode")
    public int getShift_Mode() {
        return shift_Mode;
    }

    @JsonProperty("Shift Mode")
    public void setShift_Mode(int shift_Mode) {
        this.shift_Mode = shift_Mode;
    }

    @JsonProperty("Spin Recovery")
    public int getSpin_Recovery() {
        return spin_Recovery;
    }

    @JsonProperty("Spin Recovery")
    public void setSpin_Recovery(int spin_Recovery) {
        this.spin_Recovery = spin_Recovery;
    }

    @JsonProperty("Stability Control")
    public int getStability_Control() {
        return stability_Control;
    }

    @JsonProperty("Stability Control")
    public void setStability_Control(int stability_Control) {
        this.stability_Control = stability_Control;
    }

    @JsonProperty("Start Engine")
    public boolean isStart_Engine() {
        return start_Engine;
    }

    @JsonProperty("Start Engine")
    public void setStart_Engine(boolean start_Engine) {
        this.start_Engine = start_Engine;
    }

    @JsonProperty("Start Engine#")
    public String getStart_Engine_() {
        return start_Engine_;
    }

    @JsonProperty("Start Engine#")
    public void setStart_Engine_(String start_Engine_) {
        this.start_Engine_ = start_Engine_;
    }

    @JsonProperty("Steering Help")
    public int getSteering_Help() {
        return steering_Help;
    }

    @JsonProperty("Steering Help")
    public void setSteering_Help(int steering_Help) {
        this.steering_Help = steering_Help;
    }

    @JsonProperty("Steering Help#")
    public String getSteering_Help_() {
        return steering_Help_;
    }

    @JsonProperty("Steering Help#")
    public void setSteering_Help_(String steering_Help_) {
        this.steering_Help_ = steering_Help_;
    }

    @JsonProperty("Throttle Control")
    public int getThrottle_Control() {
        return throttle_Control;
    }

    @JsonProperty("Throttle Control")
    public void setThrottle_Control(int throttle_Control) {
        this.throttle_Control = throttle_Control;
    }

    @JsonProperty("Track Markers")
    public boolean isTrack_Markers() {
        return track_Markers;
    }

    @JsonProperty("Track Markers")
    public void setTrack_Markers(boolean track_Markers) {
        this.track_Markers = track_Markers;
    }

    @JsonProperty("Track Markers#")
    public String getTrack_Markers_() {
        return track_Markers_;
    }

    @JsonProperty("Track Markers#")
    public void setTrack_Markers_(String track_Markers_) {
        this.track_Markers_ = track_Markers_;
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
        sb.append(DrivingAids.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("antilock_Brakes");
        sb.append('=');
        sb.append(this.antilock_Brakes);
        sb.append(',');
        sb.append("auto_Blip");
        sb.append('=');
        sb.append(this.auto_Blip);
        sb.append(',');
        sb.append("auto_Blip_");
        sb.append('=');
        sb.append(((this.auto_Blip_ == null) ? "<null>" : this.auto_Blip_));
        sb.append(',');
        sb.append("auto_Clutch");
        sb.append('=');
        sb.append(this.auto_Clutch);
        sb.append(',');
        sb.append("auto_Headlights");
        sb.append('=');
        sb.append(this.auto_Headlights);
        sb.append(',');
        sb.append("auto_Headlights_");
        sb.append('=');
        sb.append(((this.auto_Headlights_ == null) ? "<null>" : this.auto_Headlights_));
        sb.append(',');
        sb.append("auto_Lift");
        sb.append('=');
        sb.append(this.auto_Lift);
        sb.append(',');
        sb.append("auto_Lift_");
        sb.append('=');
        sb.append(((this.auto_Lift_ == null) ? "<null>" : this.auto_Lift_));
        sb.append(',');
        sb.append("auto_Shift_Override_Time");
        sb.append('=');
        sb.append(this.auto_Shift_Override_Time);
        sb.append(',');
        sb.append("auto_Shift_Override_Time_");
        sb.append('=');
        sb.append(((this.auto_Shift_Override_Time_ == null) ? "<null>" : this.auto_Shift_Override_Time_));
        sb.append(',');
        sb.append("auto_Windscreen_Wipers");
        sb.append('=');
        sb.append(this.auto_Windscreen_Wipers);
        sb.append(',');
        sb.append("auto_Windscreen_Wipers_");
        sb.append('=');
        sb.append(((this.auto_Windscreen_Wipers_ == null) ? "<null>" : this.auto_Windscreen_Wipers_));
        sb.append(',');
        sb.append("autopit");
        sb.append('=');
        sb.append(this.autopit);
        sb.append(',');
        sb.append("brake_Help");
        sb.append('=');
        sb.append(this.brake_Help);
        sb.append(',');
        sb.append("display_TGM");
        sb.append('=');
        sb.append(this.display_TGM);
        sb.append(',');
        sb.append("drive_AI_Physics");
        sb.append('=');
        sb.append(this.drive_AI_Physics);
        sb.append(',');
        sb.append("drive_AI_Physics_");
        sb.append('=');
        sb.append(((this.drive_AI_Physics_ == null) ? "<null>" : this.drive_AI_Physics_));
        sb.append(',');
        sb.append("hold_Brakes");
        sb.append('=');
        sb.append(this.hold_Brakes);
        sb.append(',');
        sb.append("hold_Brakes_");
        sb.append('=');
        sb.append(((this.hold_Brakes_ == null) ? "<null>" : this.hold_Brakes_));
        sb.append(',');
        sb.append("hold_Clutch_On_Start");
        sb.append('=');
        sb.append(this.hold_Clutch_On_Start);
        sb.append(',');
        sb.append("hold_Clutch_On_Start_");
        sb.append('=');
        sb.append(((this.hold_Clutch_On_Start_ == null) ? "<null>" : this.hold_Clutch_On_Start_));
        sb.append(',');
        sb.append("invulnerability");
        sb.append('=');
        sb.append(this.invulnerability);
        sb.append(',');
        sb.append("manual_Shift_Override_Time");
        sb.append('=');
        sb.append(this.manual_Shift_Override_Time);
        sb.append(',');
        sb.append("manual_Shift_Override_Time_");
        sb.append('=');
        sb.append(((this.manual_Shift_Override_Time_ == null) ? "<null>" : this.manual_Shift_Override_Time_));
        sb.append(',');
        sb.append("no_AI_Control");
        sb.append('=');
        sb.append(this.no_AI_Control);
        sb.append(',');
        sb.append("no_AI_Control_");
        sb.append('=');
        sb.append(((this.no_AI_Control_ == null) ? "<null>" : this.no_AI_Control_));
        sb.append(',');
        sb.append("old_Tire_Model");
        sb.append('=');
        sb.append(this.old_Tire_Model);
        sb.append(',');
        sb.append("old_Tire_Model_");
        sb.append('=');
        sb.append(((this.old_Tire_Model_ == null) ? "<null>" : this.old_Tire_Model_));
        sb.append(',');
        sb.append("opposite_Lock");
        sb.append('=');
        sb.append(this.opposite_Lock);
        sb.append(',');
        sb.append("repeat_Shifts");
        sb.append('=');
        sb.append(this.repeat_Shifts);
        sb.append(',');
        sb.append("repeat_Shifts_");
        sb.append('=');
        sb.append(((this.repeat_Shifts_ == null) ? "<null>" : this.repeat_Shifts_));
        sb.append(',');
        sb.append("shift_Mode");
        sb.append('=');
        sb.append(this.shift_Mode);
        sb.append(',');
        sb.append("spin_Recovery");
        sb.append('=');
        sb.append(this.spin_Recovery);
        sb.append(',');
        sb.append("stability_Control");
        sb.append('=');
        sb.append(this.stability_Control);
        sb.append(',');
        sb.append("start_Engine");
        sb.append('=');
        sb.append(this.start_Engine);
        sb.append(',');
        sb.append("start_Engine_");
        sb.append('=');
        sb.append(((this.start_Engine_ == null) ? "<null>" : this.start_Engine_));
        sb.append(',');
        sb.append("steering_Help");
        sb.append('=');
        sb.append(this.steering_Help);
        sb.append(',');
        sb.append("steering_Help_");
        sb.append('=');
        sb.append(((this.steering_Help_ == null) ? "<null>" : this.steering_Help_));
        sb.append(',');
        sb.append("throttle_Control");
        sb.append('=');
        sb.append(this.throttle_Control);
        sb.append(',');
        sb.append("track_Markers");
        sb.append('=');
        sb.append(this.track_Markers);
        sb.append(',');
        sb.append("track_Markers_");
        sb.append('=');
        sb.append(((this.track_Markers_ == null) ? "<null>" : this.track_Markers_));
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
        result = ((result * 31) + this.throttle_Control);
        result = ((result * 31) + ((this.auto_Windscreen_Wipers_ == null) ? 0 : this.auto_Windscreen_Wipers_.hashCode()));
        result = ((result * 31) + (this.auto_Lift ? 1 : 0));
        result = ((result * 31) + ((this.start_Engine_ == null) ? 0 : this.start_Engine_.hashCode()));
        result = ((result * 31) + (this.auto_Windscreen_Wipers ? 1 : 0));
        result = ((result * 31) + this.display_TGM);
        result = ((result * 31) + (this.auto_Blip ? 1 : 0));
        result = ((result * 31) + (this.hold_Brakes ? 1 : 0));
        result = ((result * 31) + this.shift_Mode);
        result = ((result * 31) + (this.track_Markers ? 1 : 0));
        result = ((result * 31) + this.invulnerability);
        result = ((result * 31) + this.auto_Clutch);
        result = ((result * 31) + ((this.track_Markers_ == null) ? 0 : this.track_Markers_.hashCode()));
        result = ((result * 31) + ((this.old_Tire_Model_ == null) ? 0 : this.old_Tire_Model_.hashCode()));
        result = ((result * 31) + this.spin_Recovery);
        result = ((result * 31) + (this.auto_Headlights ? 1 : 0));
        result = ((result * 31) + ((this.manual_Shift_Override_Time_ == null) ? 0 : this.manual_Shift_Override_Time_.hashCode()));
        result = ((result * 31) + this.steering_Help);
        result = ((result * 31) + ((this.hold_Brakes_ == null) ? 0 : this.hold_Brakes_.hashCode()));
        result = ((result * 31) + this.repeat_Shifts);
        result = ((result * 31) + ((this.hold_Clutch_On_Start_ == null) ? 0 : this.hold_Clutch_On_Start_.hashCode()));
        result = ((result * 31) + (this.drive_AI_Physics ? 1 : 0));
        result = ((result * 31) + ((this.repeat_Shifts_ == null) ? 0 : this.repeat_Shifts_.hashCode()));
        result = ((result * 31) + this.stability_Control);
        result = ((result * 31) + this.brake_Help);
        result = ((result * 31) + ((this.steering_Help_ == null) ? 0 : this.steering_Help_.hashCode()));
        result = ((result * 31) + this.antilock_Brakes);
        result = ((result * 31) + (this.old_Tire_Model ? 1 : 0));
        result = ((result * 31) + ((this.drive_AI_Physics_ == null) ? 0 : this.drive_AI_Physics_.hashCode()));
        result = ((result * 31) + (this.start_Engine ? 1 : 0));
        result = ((result * 31) + ((this.auto_Headlights_ == null) ? 0 : this.auto_Headlights_.hashCode()));
        result = ((result * 31) + this.opposite_Lock);
        result = ((result * 31) + Float.floatToIntBits(this.auto_Shift_Override_Time));
        result = ((result * 31) + (this.hold_Clutch_On_Start ? 1 : 0));
        result = ((result * 31) + this.autopit);
        result = ((result * 31) + ((this.auto_Lift_ == null) ? 0 : this.auto_Lift_.hashCode()));
        result = ((result * 31) + ((this.auto_Blip_ == null) ? 0 : this.auto_Blip_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.manual_Shift_Override_Time));
        result = ((result * 31) + ((this.auto_Shift_Override_Time_ == null) ? 0 : this.auto_Shift_Override_Time_.hashCode()));
        result = ((result * 31) + ((this.no_AI_Control_ == null) ? 0 : this.no_AI_Control_.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + this.no_AI_Control);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DrivingAids) == false) {
            return false;
        }
        DrivingAids rhs = ((DrivingAids) other);
        return ((((((((((((((((((((((((((((((((((((((((((this.throttle_Control == rhs.throttle_Control) && ((this.auto_Windscreen_Wipers_ == rhs.auto_Windscreen_Wipers_) || ((this.auto_Windscreen_Wipers_ != null) && this.auto_Windscreen_Wipers_.equals(rhs.auto_Windscreen_Wipers_)))) && (this.auto_Lift == rhs.auto_Lift)) && ((this.start_Engine_ == rhs.start_Engine_) || ((this.start_Engine_ != null) && this.start_Engine_.equals(rhs.start_Engine_)))) && (this.auto_Windscreen_Wipers == rhs.auto_Windscreen_Wipers)) && (this.display_TGM == rhs.display_TGM)) && (this.auto_Blip == rhs.auto_Blip)) && (this.hold_Brakes == rhs.hold_Brakes)) && (this.shift_Mode == rhs.shift_Mode)) && (this.track_Markers == rhs.track_Markers)) && (this.invulnerability == rhs.invulnerability)) && (this.auto_Clutch == rhs.auto_Clutch)) && ((this.track_Markers_ == rhs.track_Markers_) || ((this.track_Markers_ != null) && this.track_Markers_.equals(rhs.track_Markers_)))) && ((this.old_Tire_Model_ == rhs.old_Tire_Model_) || ((this.old_Tire_Model_ != null) && this.old_Tire_Model_.equals(rhs.old_Tire_Model_)))) && (this.spin_Recovery == rhs.spin_Recovery)) && (this.auto_Headlights == rhs.auto_Headlights)) && ((this.manual_Shift_Override_Time_ == rhs.manual_Shift_Override_Time_) || ((this.manual_Shift_Override_Time_ != null) && this.manual_Shift_Override_Time_.equals(rhs.manual_Shift_Override_Time_)))) && (this.steering_Help == rhs.steering_Help)) && ((this.hold_Brakes_ == rhs.hold_Brakes_) || ((this.hold_Brakes_ != null) && this.hold_Brakes_.equals(rhs.hold_Brakes_)))) && (this.repeat_Shifts == rhs.repeat_Shifts)) && ((this.hold_Clutch_On_Start_ == rhs.hold_Clutch_On_Start_) || ((this.hold_Clutch_On_Start_ != null) && this.hold_Clutch_On_Start_.equals(rhs.hold_Clutch_On_Start_)))) && (this.drive_AI_Physics == rhs.drive_AI_Physics)) && ((this.repeat_Shifts_ == rhs.repeat_Shifts_) || ((this.repeat_Shifts_ != null) && this.repeat_Shifts_.equals(rhs.repeat_Shifts_)))) && (this.stability_Control == rhs.stability_Control)) && (this.brake_Help == rhs.brake_Help)) && ((this.steering_Help_ == rhs.steering_Help_) || ((this.steering_Help_ != null) && this.steering_Help_.equals(rhs.steering_Help_)))) && (this.antilock_Brakes == rhs.antilock_Brakes)) && (this.old_Tire_Model == rhs.old_Tire_Model)) && ((this.drive_AI_Physics_ == rhs.drive_AI_Physics_) || ((this.drive_AI_Physics_ != null) && this.drive_AI_Physics_.equals(rhs.drive_AI_Physics_)))) && (this.start_Engine == rhs.start_Engine)) && ((this.auto_Headlights_ == rhs.auto_Headlights_) || ((this.auto_Headlights_ != null) && this.auto_Headlights_.equals(rhs.auto_Headlights_)))) && (this.opposite_Lock == rhs.opposite_Lock)) && (Float.floatToIntBits(this.auto_Shift_Override_Time) == Float.floatToIntBits(rhs.auto_Shift_Override_Time))) && (this.hold_Clutch_On_Start == rhs.hold_Clutch_On_Start)) && (this.autopit == rhs.autopit)) && ((this.auto_Lift_ == rhs.auto_Lift_) || ((this.auto_Lift_ != null) && this.auto_Lift_.equals(rhs.auto_Lift_)))) && ((this.auto_Blip_ == rhs.auto_Blip_) || ((this.auto_Blip_ != null) && this.auto_Blip_.equals(rhs.auto_Blip_)))) && (Float.floatToIntBits(this.manual_Shift_Override_Time) == Float.floatToIntBits(rhs.manual_Shift_Override_Time))) && ((this.auto_Shift_Override_Time_ == rhs.auto_Shift_Override_Time_) || ((this.auto_Shift_Override_Time_ != null) && this.auto_Shift_Override_Time_.equals(rhs.auto_Shift_Override_Time_)))) && ((this.no_AI_Control_ == rhs.no_AI_Control_) || ((this.no_AI_Control_ != null) && this.no_AI_Control_.equals(rhs.no_AI_Control_)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && (this.no_AI_Control == rhs.no_AI_Control));
    }

}
