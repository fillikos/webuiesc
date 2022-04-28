package de.fillikos.rf2.esctool.data.rf2data.player;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "AI Aggression",
        "AI Brake_Grip Usage",
        "AI Brake_Grip Usage#",
        "AI Brake_Power Usage",
        "AI Brake_Power Usage#",
        "AI Calibrate Sample Size",
        "AI Calibrate Sample Size#",
        "AI Corner_Grip Usage",
        "AI Corner_Grip Usage#",
        "AI Formation by Position",
        "AI Formation by Position#",
        "AI Fuel Mult",
        "AI Fuel Mult#",
        "AI Limiter",
        "AI Limiter#",
        "AI Logic Override",
        "AI Logic Override#",
        "AI Mistakes",
        "AI Mistakes#",
        "AI Power Calibration",
        "AI Power Calibration#",
        "Active Sleep Time",
        "Active Sleep Time#",
        "Attack Zone AR Time",
        "Attack Zone AR Time#",
        "Auto Line Smoothing",
        "Auto Line Smoothing#",
        "Auto Skip Garaged Vehicles",
        "Auto Skip Garaged Vehicles#",
        "Auto-change Opponent List",
        "Auto-change Opponent List#",
        "Autocalibrate AI Mode",
        "Autocalibrate AI Mode#",
        "Automatic Pit Menu",
        "Automatic Pit Menu#",
        "Basic Display",
        "Basic Rules",
        "CHAMP AI Driver Strength",
        "CHAMP Allowed Vehicles",
        "CHAMP CrashRecovery",
        "CHAMP Damage Multiplier",
        "CHAMP FreeSettings",
        "CHAMP Fuel Consumption Multiplier",
        "CHAMP Opponents",
        "CHAMP Race Finish Criteria",
        "CHAMP Race Laps",
        "CHAMP Race Length",
        "CHAMP Race Time",
        "CHAMP Speed Compensation",
        "CHAMP Tire Wear Multiplier",
        "CURNT AI Driver Strength",
        "CURNT Allowed Vehicles",
        "CURNT CrashRecovery",
        "CURNT Damage Multiplier",
        "CURNT FreeSettings",
        "CURNT Fuel Consumption Multiplier",
        "CURNT Opponents",
        "CURNT Race Finish Criteria",
        "CURNT Race Laps",
        "CURNT Race Length",
        "CURNT Race Time",
        "CURNT Speed Compensation",
        "CURNT Tire Wear Multiplier",
        "Championship Basic Rules",
        "Compress Replay",
        "Compress Replay#",
        "Damper Units",
        "Damper Units#",
        "Difficulty",
        "Disable NetComm",
        "Disable NetComm#",
        "Disable Resume in Replay",
        "Disable Resume in Replay#",
        "Disconnected Results",
        "Disconnected Results#",
        "Display Driver Stats",
        "Display Track Stats",
        "Exit Confirmation",
        "Exit Confirmation#",
        "Find Default Setup",
        "Find Default Setup#",
        "Fixed AI Setups",
        "Fixed AI Setups#",
        "Fixed Setups",
        "Fixed Setups#",
        "Fixed Upgrades",
        "Fixed Upgrades#",
        "Full Player Replay",
        "Full Player Replay#",
        "GPRIX AI Driver Strength",
        "GPRIX AI Driver Strength#",
        "GPRIX Allowed Vehicles",
        "GPRIX CrashRecovery",
        "GPRIX CrashRecovery#",
        "GPRIX Damage Multiplier",
        "GPRIX Damage Multiplier#",
        "GPRIX FreeSettings",
        "GPRIX FreeSettings#",
        "GPRIX Fuel Consumption Multiplier",
        "GPRIX Opponents",
        "GPRIX Race Finish Criteria",
        "GPRIX Race Finish Criteria#",
        "GPRIX Race Laps",
        "GPRIX Race Length",
        "GPRIX Race Time",
        "GPRIX Race Time#",
        "GPRIX Speed Compensation",
        "GPRIX Speed Compensation#",
        "GPRIX Tire Wear Multiplier",
        "Ghost AI",
        "Ghost AI#",
        "Horizontal Tire Temps",
        "Horizontal Tire Temps#",
        "Inactive Sleep Time",
        "Inactive Sleep Time#",
        "Instant Replay Length",
        "Keep Received Setups",
        "Keep Received Setups#",
        "MULTI AI Driver Strength",
        "MULTI Allowed Vehicles",
        "MULTI CrashRecovery",
        "MULTI Damage Multiplier",
        "MULTI FreeSettings",
        "MULTI Fuel Consumption Multiplier",
        "MULTI Opponents",
        "MULTI Race Finish Criteria",
        "MULTI Race Laps",
        "MULTI Race Length",
        "MULTI Race Time",
        "MULTI Speed Compensation",
        "MULTI Tire Wear Multiplier",
        "Measurement Units",
        "Measurement Units#",
        "Message Center Detail",
        "Miscellaneous",
        "Monitor AI Postfix",
        "Monitor AI Postfix#",
        "Monitor Admin Postfix",
        "Monitor Admin Postfix#",
        "Monitor Auto Replay",
        "Monitor Auto Replay#",
        "Multi-session Results",
        "Multi-session Results#",
        "Number Race Results",
        "Number Race Results#",
        "Number Track Replays",
        "Number Track Replays#",
        "One Lap To Go Warning",
        "One Lap To Go Warning#",
        "Pause If Focus Lost",
        "Pause If Focus Lost#",
        "Pitstop Description",
        "Pitstop Description#",
        "Play Movies",
        "RPLAY AI Driver Strength",
        "RPLAY Allowed Vehicles",
        "RPLAY CrashRecovery",
        "RPLAY Damage Multiplier",
        "RPLAY FreeSettings",
        "RPLAY Fuel Consumption Multiplier",
        "RPLAY Opponents",
        "RPLAY Race Finish Criteria",
        "RPLAY Race Laps",
        "RPLAY Race Length",
        "RPLAY Race Time",
        "RPLAY Speed Compensation",
        "RPLAY Tire Wear Multiplier",
        "Race Stint Offset",
        "Race Stint Offset#",
        "RealTimeLogging",
        "RealTimeLogging#",
        "Realtime Splits",
        "Realtime Splits#",
        "Record Hotlaps",
        "Record Hotlaps#",
        "Record Replays",
        "Record Replays#",
        "Record To Memory",
        "Record To Memory#",
        "Relative Fuel Strategy",
        "Relative Fuel Strategy#",
        "Relevant Setups Only",
        "Relevant Setups Only#",
        "Replay Base Fidelity",
        "Save All Replay Sessions",
        "Save All Replay Sessions#",
        "Settings Type",
        "Show Extra Lap",
        "Show Extra Lap#",
        "Smart Pitcrew",
        "Smart Pitcrew#",
        "Speed Comp Dist",
        "Speed Comp Dist#",
        "Speed Units",
        "Speed Units#",
        "Spotter Behind",
        "Spotter Behind#",
        "Spotter Detail",
        "Spotter Detail#",
        "Spotter Laptimes",
        "Spotter Laptimes#",
        "Standings Func",
        "Standings Func#",
        "Starting Pos",
        "Starting Pos#",
        "Temporary Replay Keys",
        "Temporary Replay Keys#",
        "Tooltips",
        "Transparent Trainer Alpha",
        "Transparent Trainer Alpha#",
        "Transparent Trainer Lap",
        "Transparent Trainer Lap#",
        "Transparent Trainer Lead Time",
        "Transparent Trainer Lead Time#",
        "Transparent Trainer Proximity",
        "Transparent Trainer Proximity#",
        "User Vehicle Data",
        "User Vehicle Data#",
        "Vehicle Removal",
        "Vehicle Removal#",
        "Wait For All Plugins To Load",
        "Wait For All Plugins To Load#",
        "practice length",
        "practice length#",
        "qualifying laps",
        "qualifying laps#",
        "qualifying length",
        "qualifying length#",
        "warmup length",
        "warmup length#"
})
@Generated("jsonschema2pojo")
public class GameOptions {

    @JsonProperty("AI Aggression")
    private float aI_Aggression;
    @JsonProperty("AI Brake_Grip Usage")
    private float aI_Brake_Grip_Usage;
    @JsonProperty("AI Brake_Grip Usage#")
    private String aI_Brake_Grip_Usage_;
    @JsonProperty("AI Brake_Power Usage")
    private float aI_Brake_Power_Usage;
    @JsonProperty("AI Brake_Power Usage#")
    private String aI_Brake_Power_Usage_;
    @JsonProperty("AI Calibrate Sample Size")
    private int aI_Calibrate_Sample_Size;
    @JsonProperty("AI Calibrate Sample Size#")
    private String aI_Calibrate_Sample_Size_;
    @JsonProperty("AI Corner_Grip Usage")
    private float aI_Corner_Grip_Usage;
    @JsonProperty("AI Corner_Grip Usage#")
    private String aI_Corner_Grip_Usage_;
    @JsonProperty("AI Formation by Position")
    private boolean aI_Formation_by_Position;
    @JsonProperty("AI Formation by Position#")
    private String aI_Formation_by_Position_;
    @JsonProperty("AI Fuel Mult")
    private float aI_Fuel_Mult;
    @JsonProperty("AI Fuel Mult#")
    private String aI_Fuel_Mult_;
    @JsonProperty("AI Limiter")
    private int aI_Limiter;
    @JsonProperty("AI Limiter#")
    private String aI_Limiter_;
    @JsonProperty("AI Logic Override")
    private int aI_Logic_Override;
    @JsonProperty("AI Logic Override#")
    private String aI_Logic_Override_;
    @JsonProperty("AI Mistakes")
    private int aI_Mistakes;
    @JsonProperty("AI Mistakes#")
    private String aI_Mistakes_;
    @JsonProperty("AI Power Calibration")
    private int aI_Power_Calibration;
    @JsonProperty("AI Power Calibration#")
    private String aI_Power_Calibration_;
    @JsonProperty("Active Sleep Time")
    private int active_Sleep_Time;
    @JsonProperty("Active Sleep Time#")
    private String active_Sleep_Time_;
    @JsonProperty("Attack Zone AR Time")
    private int attack_Zone_AR_Time;
    @JsonProperty("Attack Zone AR Time#")
    private String attack_Zone_AR_Time_;
    @JsonProperty("Auto Line Smoothing")
    private int auto_Line_Smoothing;
    @JsonProperty("Auto Line Smoothing#")
    private String auto_Line_Smoothing_;
    @JsonProperty("Auto Skip Garaged Vehicles")
    private boolean auto_Skip_Garaged_Vehicles;
    @JsonProperty("Auto Skip Garaged Vehicles#")
    private String auto_Skip_Garaged_Vehicles_;
    @JsonProperty("Auto-change Opponent List")
    private boolean auto_change_Opponent_List;
    @JsonProperty("Auto-change Opponent List#")
    private String auto_change_Opponent_List_;
    @JsonProperty("Autocalibrate AI Mode")
    private int autocalibrate_AI_Mode;
    @JsonProperty("Autocalibrate AI Mode#")
    private String autocalibrate_AI_Mode_;
    @JsonProperty("Automatic Pit Menu")
    private int automatic_Pit_Menu;
    @JsonProperty("Automatic Pit Menu#")
    private String automatic_Pit_Menu_;
    @JsonProperty("Basic Display")
    private int basic_Display;
    @JsonProperty("Basic Rules")
    private int basic_Rules;
    @JsonProperty("CHAMP AI Driver Strength")
    private int cHAMP_AI_Driver_Strength;
    @JsonProperty("CHAMP Allowed Vehicles")
    private String cHAMP_Allowed_Vehicles;
    @JsonProperty("CHAMP CrashRecovery")
    private int cHAMP_CrashRecovery;
    @JsonProperty("CHAMP Damage Multiplier")
    private int cHAMP_Damage_Multiplier;
    @JsonProperty("CHAMP FreeSettings")
    private int cHAMP_FreeSettings;
    @JsonProperty("CHAMP Fuel Consumption Multiplier")
    private int cHAMP_Fuel_Consumption_Multiplier;
    @JsonProperty("CHAMP Opponents")
    private int cHAMP_Opponents;
    @JsonProperty("CHAMP Race Finish Criteria")
    private int cHAMP_Race_Finish_Criteria;
    @JsonProperty("CHAMP Race Laps")
    private int cHAMP_Race_Laps;
    @JsonProperty("CHAMP Race Length")
    private float cHAMP_Race_Length;
    @JsonProperty("CHAMP Race Time")
    private int cHAMP_Race_Time;
    @JsonProperty("CHAMP Speed Compensation")
    private int cHAMP_Speed_Compensation;
    @JsonProperty("CHAMP Tire Wear Multiplier")
    private int cHAMP_Tire_Wear_Multiplier;
    @JsonProperty("CURNT AI Driver Strength")
    private int cURNT_AI_Driver_Strength;
    @JsonProperty("CURNT Allowed Vehicles")
    private String cURNT_Allowed_Vehicles;
    @JsonProperty("CURNT CrashRecovery")
    private int cURNT_CrashRecovery;
    @JsonProperty("CURNT Damage Multiplier")
    private int cURNT_Damage_Multiplier;
    @JsonProperty("CURNT FreeSettings")
    private int cURNT_FreeSettings;
    @JsonProperty("CURNT Fuel Consumption Multiplier")
    private int cURNT_Fuel_Consumption_Multiplier;
    @JsonProperty("CURNT Opponents")
    private int cURNT_Opponents;
    @JsonProperty("CURNT Race Finish Criteria")
    private int cURNT_Race_Finish_Criteria;
    @JsonProperty("CURNT Race Laps")
    private int cURNT_Race_Laps;
    @JsonProperty("CURNT Race Length")
    private float cURNT_Race_Length;
    @JsonProperty("CURNT Race Time")
    private int cURNT_Race_Time;
    @JsonProperty("CURNT Speed Compensation")
    private int cURNT_Speed_Compensation;
    @JsonProperty("CURNT Tire Wear Multiplier")
    private int cURNT_Tire_Wear_Multiplier;
    @JsonProperty("Championship Basic Rules")
    private int championship_Basic_Rules;
    @JsonProperty("Compress Replay")
    private int compress_Replay;
    @JsonProperty("Compress Replay#")
    private String compress_Replay_;
    @JsonProperty("Damper Units")
    private boolean damper_Units;
    @JsonProperty("Damper Units#")
    private String damper_Units_;
    @JsonProperty("Difficulty")
    private int difficulty;
    @JsonProperty("Disable NetComm")
    private boolean disable_NetComm;
    @JsonProperty("Disable NetComm#")
    private String disable_NetComm_;
    @JsonProperty("Disable Resume in Replay")
    private int disable_Resume_in_Replay;
    @JsonProperty("Disable Resume in Replay#")
    private String disable_Resume_in_Replay_;
    @JsonProperty("Disconnected Results")
    private boolean disconnected_Results;
    @JsonProperty("Disconnected Results#")
    private String disconnected_Results_;
    @JsonProperty("Display Driver Stats")
    private boolean display_Driver_Stats;
    @JsonProperty("Display Track Stats")
    private boolean display_Track_Stats;
    @JsonProperty("Exit Confirmation")
    private int exit_Confirmation;
    @JsonProperty("Exit Confirmation#")
    private String exit_Confirmation_;
    @JsonProperty("Find Default Setup")
    private boolean find_Default_Setup;
    @JsonProperty("Find Default Setup#")
    private String find_Default_Setup_;
    @JsonProperty("Fixed AI Setups")
    private boolean fixed_AI_Setups;
    @JsonProperty("Fixed AI Setups#")
    private String fixed_AI_Setups_;
    @JsonProperty("Fixed Setups")
    private boolean fixed_Setups;
    @JsonProperty("Fixed Setups#")
    private String fixed_Setups_;
    @JsonProperty("Fixed Upgrades")
    private boolean fixed_Upgrades;
    @JsonProperty("Fixed Upgrades#")
    private String fixed_Upgrades_;
    @JsonProperty("Full Player Replay")
    private boolean full_Player_Replay;
    @JsonProperty("Full Player Replay#")
    private String full_Player_Replay_;
    @JsonProperty("GPRIX AI Driver Strength")
    private int gPRIX_AI_Driver_Strength;
    @JsonProperty("GPRIX AI Driver Strength#")
    private String gPRIX_AI_Driver_Strength_;
    @JsonProperty("GPRIX Allowed Vehicles")
    private String gPRIX_Allowed_Vehicles;
    @JsonProperty("GPRIX CrashRecovery")
    private int gPRIX_CrashRecovery;
    @JsonProperty("GPRIX CrashRecovery#")
    private String gPRIX_CrashRecovery_;
    @JsonProperty("GPRIX Damage Multiplier")
    private int gPRIX_Damage_Multiplier;
    @JsonProperty("GPRIX Damage Multiplier#")
    private String gPRIX_Damage_Multiplier_;
    @JsonProperty("GPRIX FreeSettings")
    private int gPRIX_FreeSettings;
    @JsonProperty("GPRIX FreeSettings#")
    private String gPRIX_FreeSettings_;
    @JsonProperty("GPRIX Fuel Consumption Multiplier")
    private int gPRIX_Fuel_Consumption_Multiplier;
    @JsonProperty("GPRIX Opponents")
    private int gPRIX_Opponents;
    @JsonProperty("GPRIX Race Finish Criteria")
    private int gPRIX_Race_Finish_Criteria;
    @JsonProperty("GPRIX Race Finish Criteria#")
    private String gPRIX_Race_Finish_Criteria_;
    @JsonProperty("GPRIX Race Laps")
    private int gPRIX_Race_Laps;
    @JsonProperty("GPRIX Race Length")
    private float gPRIX_Race_Length;
    @JsonProperty("GPRIX Race Time")
    private int gPRIX_Race_Time;
    @JsonProperty("GPRIX Race Time#")
    private String gPRIX_Race_Time_;
    @JsonProperty("GPRIX Speed Compensation")
    private int gPRIX_Speed_Compensation;
    @JsonProperty("GPRIX Speed Compensation#")
    private String gPRIX_Speed_Compensation_;
    @JsonProperty("GPRIX Tire Wear Multiplier")
    private int gPRIX_Tire_Wear_Multiplier;
    @JsonProperty("Ghost AI")
    private int ghost_AI;
    @JsonProperty("Ghost AI#")
    private String ghost_AI_;
    @JsonProperty("Horizontal Tire Temps")
    private boolean horizontal_Tire_Temps;
    @JsonProperty("Horizontal Tire Temps#")
    private String horizontal_Tire_Temps_;
    @JsonProperty("Inactive Sleep Time")
    private int inactive_Sleep_Time;
    @JsonProperty("Inactive Sleep Time#")
    private String inactive_Sleep_Time_;
    @JsonProperty("Instant Replay Length")
    private int instant_Replay_Length;
    @JsonProperty("Keep Received Setups")
    private int keep_Received_Setups;
    @JsonProperty("Keep Received Setups#")
    private String keep_Received_Setups_;
    @JsonProperty("MULTI AI Driver Strength")
    private int mULTI_AI_Driver_Strength;
    @JsonProperty("MULTI Allowed Vehicles")
    private String mULTI_Allowed_Vehicles;
    @JsonProperty("MULTI CrashRecovery")
    private int mULTI_CrashRecovery;
    @JsonProperty("MULTI Damage Multiplier")
    private int mULTI_Damage_Multiplier;
    @JsonProperty("MULTI FreeSettings")
    private int mULTI_FreeSettings;
    @JsonProperty("MULTI Fuel Consumption Multiplier")
    private int mULTI_Fuel_Consumption_Multiplier;
    @JsonProperty("MULTI Opponents")
    private int mULTI_Opponents;
    @JsonProperty("MULTI Race Finish Criteria")
    private int mULTI_Race_Finish_Criteria;
    @JsonProperty("MULTI Race Laps")
    private int mULTI_Race_Laps;
    @JsonProperty("MULTI Race Length")
    private float mULTI_Race_Length;
    @JsonProperty("MULTI Race Time")
    private int mULTI_Race_Time;
    @JsonProperty("MULTI Speed Compensation")
    private int mULTI_Speed_Compensation;
    @JsonProperty("MULTI Tire Wear Multiplier")
    private int mULTI_Tire_Wear_Multiplier;
    @JsonProperty("Measurement Units")
    private int measurement_Units;
    @JsonProperty("Measurement Units#")
    private String measurement_Units_;
    @JsonProperty("Message Center Detail")
    private int message_Center_Detail;
    @JsonProperty("Miscellaneous")
    private int miscellaneous;
    @JsonProperty("Monitor AI Postfix")
    private String monitor_AI_Postfix;
    @JsonProperty("Monitor AI Postfix#")
    private String monitor_AI_Postfix_;
    @JsonProperty("Monitor Admin Postfix")
    private String monitor_Admin_Postfix;
    @JsonProperty("Monitor Admin Postfix#")
    private String monitor_Admin_Postfix_;
    @JsonProperty("Monitor Auto Replay")
    private boolean monitor_Auto_Replay;
    @JsonProperty("Monitor Auto Replay#")
    private String monitor_Auto_Replay_;
    @JsonProperty("Multi-session Results")
    private boolean multi_session_Results;
    @JsonProperty("Multi-session Results#")
    private String multi_session_Results_;
    @JsonProperty("Number Race Results")
    private int number_Race_Results;
    @JsonProperty("Number Race Results#")
    private String number_Race_Results_;
    @JsonProperty("Number Track Replays")
    private int number_Track_Replays;
    @JsonProperty("Number Track Replays#")
    private String number_Track_Replays_;
    @JsonProperty("One Lap To Go Warning")
    private int one_Lap_To_Go_Warning;
    @JsonProperty("One Lap To Go Warning#")
    private String one_Lap_To_Go_Warning_;
    @JsonProperty("Pause If Focus Lost")
    private boolean pause_If_Focus_Lost;
    @JsonProperty("Pause If Focus Lost#")
    private String pause_If_Focus_Lost_;
    @JsonProperty("Pitstop Description")
    private boolean pitstop_Description;
    @JsonProperty("Pitstop Description#")
    private String pitstop_Description_;
    @JsonProperty("Play Movies")
    private int play_Movies;
    @JsonProperty("RPLAY AI Driver Strength")
    private int rPLAY_AI_Driver_Strength;
    @JsonProperty("RPLAY Allowed Vehicles")
    private String rPLAY_Allowed_Vehicles;
    @JsonProperty("RPLAY CrashRecovery")
    private int rPLAY_CrashRecovery;
    @JsonProperty("RPLAY Damage Multiplier")
    private int rPLAY_Damage_Multiplier;
    @JsonProperty("RPLAY FreeSettings")
    private int rPLAY_FreeSettings;
    @JsonProperty("RPLAY Fuel Consumption Multiplier")
    private int rPLAY_Fuel_Consumption_Multiplier;
    @JsonProperty("RPLAY Opponents")
    private int rPLAY_Opponents;
    @JsonProperty("RPLAY Race Finish Criteria")
    private int rPLAY_Race_Finish_Criteria;
    @JsonProperty("RPLAY Race Laps")
    private int rPLAY_Race_Laps;
    @JsonProperty("RPLAY Race Length")
    private float rPLAY_Race_Length;
    @JsonProperty("RPLAY Race Time")
    private int rPLAY_Race_Time;
    @JsonProperty("RPLAY Speed Compensation")
    private int rPLAY_Speed_Compensation;
    @JsonProperty("RPLAY Tire Wear Multiplier")
    private int rPLAY_Tire_Wear_Multiplier;
    @JsonProperty("Race Stint Offset")
    private int race_Stint_Offset;
    @JsonProperty("Race Stint Offset#")
    private String race_Stint_Offset_;
    @JsonProperty("RealTimeLogging")
    private int realTimeLogging;
    @JsonProperty("RealTimeLogging#")
    private String realTimeLogging_;
    @JsonProperty("Realtime Splits")
    private boolean realtime_Splits;
    @JsonProperty("Realtime Splits#")
    private String realtime_Splits_;
    @JsonProperty("Record Hotlaps")
    private int record_Hotlaps;
    @JsonProperty("Record Hotlaps#")
    private String record_Hotlaps_;
    @JsonProperty("Record Replays")
    private int record_Replays;
    @JsonProperty("Record Replays#")
    private String record_Replays_;
    @JsonProperty("Record To Memory")
    private boolean record_To_Memory;
    @JsonProperty("Record To Memory#")
    private String record_To_Memory_;
    @JsonProperty("Relative Fuel Strategy")
    private boolean relative_Fuel_Strategy;
    @JsonProperty("Relative Fuel Strategy#")
    private String relative_Fuel_Strategy_;
    @JsonProperty("Relevant Setups Only")
    private int relevant_Setups_Only;
    @JsonProperty("Relevant Setups Only#")
    private String relevant_Setups_Only_;
    @JsonProperty("Replay Base Fidelity")
    private int replay_Base_Fidelity;
    @JsonProperty("Save All Replay Sessions")
    private boolean save_All_Replay_Sessions;
    @JsonProperty("Save All Replay Sessions#")
    private String save_All_Replay_Sessions_;
    @JsonProperty("Settings Type")
    private int settings_Type;
    @JsonProperty("Show Extra Lap")
    private int show_Extra_Lap;
    @JsonProperty("Show Extra Lap#")
    private String show_Extra_Lap_;
    @JsonProperty("Smart Pitcrew")
    private boolean smart_Pitcrew;
    @JsonProperty("Smart Pitcrew#")
    private String smart_Pitcrew_;
    @JsonProperty("Speed Comp Dist")
    private int speed_Comp_Dist;
    @JsonProperty("Speed Comp Dist#")
    private String speed_Comp_Dist_;
    @JsonProperty("Speed Units")
    private boolean speed_Units;
    @JsonProperty("Speed Units#")
    private String speed_Units_;
    @JsonProperty("Spotter Behind")
    private int spotter_Behind;
    @JsonProperty("Spotter Behind#")
    private String spotter_Behind_;
    @JsonProperty("Spotter Detail")
    private int spotter_Detail;
    @JsonProperty("Spotter Detail#")
    private String spotter_Detail_;
    @JsonProperty("Spotter Laptimes")
    private int spotter_Laptimes;
    @JsonProperty("Spotter Laptimes#")
    private String spotter_Laptimes_;
    @JsonProperty("Standings Func")
    private int standings_Func;
    @JsonProperty("Standings Func#")
    private String standings_Func_;
    @JsonProperty("Starting Pos")
    private int starting_Pos;
    @JsonProperty("Starting Pos#")
    private String starting_Pos_;
    @JsonProperty("Temporary Replay Keys")
    private boolean temporary_Replay_Keys;
    @JsonProperty("Temporary Replay Keys#")
    private String temporary_Replay_Keys_;
    @JsonProperty("Tooltips")
    private boolean tooltips;
    @JsonProperty("Transparent Trainer Alpha")
    private float transparent_Trainer_Alpha;
    @JsonProperty("Transparent Trainer Alpha#")
    private String transparent_Trainer_Alpha_;
    @JsonProperty("Transparent Trainer Lap")
    private int transparent_Trainer_Lap;
    @JsonProperty("Transparent Trainer Lap#")
    private String transparent_Trainer_Lap_;
    @JsonProperty("Transparent Trainer Lead Time")
    private float transparent_Trainer_Lead_Time;
    @JsonProperty("Transparent Trainer Lead Time#")
    private String transparent_Trainer_Lead_Time_;
    @JsonProperty("Transparent Trainer Proximity")
    private int transparent_Trainer_Proximity;
    @JsonProperty("Transparent Trainer Proximity#")
    private String transparent_Trainer_Proximity_;
    @JsonProperty("User Vehicle Data")
    private boolean user_Vehicle_Data;
    @JsonProperty("User Vehicle Data#")
    private String user_Vehicle_Data_;
    @JsonProperty("Vehicle Removal")
    private int vehicle_Removal;
    @JsonProperty("Vehicle Removal#")
    private String vehicle_Removal_;
    @JsonProperty("Wait For All Plugins To Load")
    private boolean wait_For_All_Plugins_To_Load;
    @JsonProperty("Wait For All Plugins To Load#")
    private String wait_For_All_Plugins_To_Load_;
    @JsonProperty("practice length")
    private int practice_length;
    @JsonProperty("practice length#")
    private String practice_length_;
    @JsonProperty("qualifying laps")
    private int qualifying_laps;
    @JsonProperty("qualifying laps#")
    private String qualifying_laps_;
    @JsonProperty("qualifying length")
    private int qualifying_length;
    @JsonProperty("qualifying length#")
    private String qualifying_length_;
    @JsonProperty("warmup length")
    private int warmup_length;
    @JsonProperty("warmup length#")
    private String warmup_length_;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public GameOptions() {
    }

    /**
     * @param practice_length_
     * @param aI_Formation_by_Position_
     * @param fixed_Upgrades
     * @param wait_For_All_Plugins_To_Load
     * @param rPLAY_Allowed_Vehicles
     * @param cURNT_Race_Laps
     * @param full_Player_Replay_
     * @param settings_Type
     * @param horizontal_Tire_Temps_
     * @param attack_Zone_AR_Time_
     * @param disable_NetComm
     * @param display_Driver_Stats
     * @param gPRIX_CrashRecovery
     * @param ghost_AI_
     * @param horizontal_Tire_Temps
     * @param aI_Brake_Power_Usage_
     * @param number_Track_Replays
     * @param gPRIX_AI_Driver_Strength_
     * @param relevant_Setups_Only
     * @param cHAMP_Speed_Compensation
     * @param message_Center_Detail
     * @param realtime_Splits_
     * @param cURNT_Fuel_Consumption_Multiplier
     * @param fixed_Setups
     * @param standings_Func
     * @param spotter_Detail_
     * @param aI_Brake_Grip_Usage_
     * @param mULTI_Race_Length
     * @param cURNT_Tire_Wear_Multiplier
     * @param show_Extra_Lap
     * @param measurement_Units
     * @param aI_Brake_Power_Usage
     * @param gPRIX_Speed_Compensation
     * @param qualifying_length_
     * @param cHAMP_Race_Laps
     * @param gPRIX_FreeSettings_
     * @param miscellaneous
     * @param spotter_Behind
     * @param rPLAY_Damage_Multiplier
     * @param rPLAY_Race_Finish_Criteria
     * @param exit_Confirmation_
     * @param race_Stint_Offset
     * @param aI_Brake_Grip_Usage
     * @param mULTI_Race_Time
     * @param transparent_Trainer_Proximity
     * @param cHAMP_Race_Length
     * @param fixed_Upgrades_
     * @param mULTI_FreeSettings
     * @param instant_Replay_Length
     * @param rPLAY_Speed_Compensation
     * @param number_Race_Results_
     * @param starting_Pos_
     * @param aI_Limiter_
     * @param speed_Units_
     * @param user_Vehicle_Data_
     * @param cURNT_Race_Length
     * @param rPLAY_Fuel_Consumption_Multiplier
     * @param gPRIX_Race_Finish_Criteria_
     * @param temporary_Replay_Keys
     * @param number_Track_Replays_
     * @param damper_Units
     * @param auto_change_Opponent_List_
     * @param gPRIX_Race_Time
     * @param autocalibrate_AI_Mode_
     * @param auto_Skip_Garaged_Vehicles_
     * @param mULTI_Damage_Multiplier
     * @param transparent_Trainer_Lead_Time_
     * @param number_Race_Results
     * @param automatic_Pit_Menu_
     * @param record_Replays
     * @param spotter_Laptimes
     * @param save_All_Replay_Sessions_
     * @param pause_If_Focus_Lost
     * @param fixed_AI_Setups_
     * @param gPRIX_Race_Time_
     * @param inactive_Sleep_Time_
     * @param basic_Display
     * @param transparent_Trainer_Lap_
     * @param disable_NetComm_
     * @param gPRIX_Fuel_Consumption_Multiplier
     * @param auto_Line_Smoothing_
     * @param difficulty
     * @param gPRIX_Speed_Compensation_
     * @param aI_Aggression
     * @param gPRIX_Opponents
     * @param gPRIX_FreeSettings
     * @param one_Lap_To_Go_Warning_
     * @param transparent_Trainer_Proximity_
     * @param aI_Power_Calibration
     * @param fixed_Setups_
     * @param aI_Calibrate_Sample_Size
     * @param gPRIX_AI_Driver_Strength
     * @param cHAMP_Allowed_Vehicles
     * @param speed_Comp_Dist_
     * @param disconnected_Results
     * @param user_Vehicle_Data
     * @param attack_Zone_AR_Time
     * @param ghost_AI
     * @param spotter_Behind_
     * @param monitor_Auto_Replay_
     * @param mULTI_Race_Laps
     * @param mULTI_Fuel_Consumption_Multiplier
     * @param warmup_length_
     * @param aI_Corner_Grip_Usage_
     * @param aI_Power_Calibration_
     * @param compress_Replay
     * @param basic_Rules
     * @param damper_Units_
     * @param aI_Calibrate_Sample_Size_
     * @param pause_If_Focus_Lost_
     * @param rPLAY_Race_Time
     * @param cHAMP_AI_Driver_Strength
     * @param transparent_Trainer_Alpha_
     * @param rPLAY_AI_Driver_Strength
     * @param aI_Fuel_Mult_
     * @param rPLAY_Tire_Wear_Multiplier
     * @param realTimeLogging_
     * @param relevant_Setups_Only_
     * @param mULTI_Race_Finish_Criteria
     * @param rPLAY_Opponents
     * @param smart_Pitcrew
     * @param realtime_Splits
     * @param multi_session_Results
     * @param one_Lap_To_Go_Warning
     * @param starting_Pos
     * @param wait_For_All_Plugins_To_Load_
     * @param relative_Fuel_Strategy
     * @param active_Sleep_Time
     * @param auto_Skip_Garaged_Vehicles
     * @param monitor_AI_Postfix
     * @param mULTI_Allowed_Vehicles
     * @param keep_Received_Setups
     * @param cHAMP_FreeSettings
     * @param cURNT_Allowed_Vehicles
     * @param mULTI_Tire_Wear_Multiplier
     * @param cURNT_AI_Driver_Strength
     * @param cURNT_Speed_Compensation
     * @param spotter_Laptimes_
     * @param disable_Resume_in_Replay
     * @param aI_Mistakes_
     * @param transparent_Trainer_Alpha
     * @param replay_Base_Fidelity
     * @param cURNT_Damage_Multiplier
     * @param automatic_Pit_Menu
     * @param inactive_Sleep_Time
     * @param autocalibrate_AI_Mode
     * @param cHAMP_Opponents
     * @param compress_Replay_
     * @param play_Movies
     * @param cURNT_Race_Finish_Criteria
     * @param rPLAY_FreeSettings
     * @param aI_Fuel_Mult
     * @param record_Hotlaps_
     * @param cHAMP_Tire_Wear_Multiplier
     * @param fixed_AI_Setups
     * @param rPLAY_Race_Laps
     * @param cURNT_CrashRecovery
     * @param disconnected_Results_
     * @param championship_Basic_Rules
     * @param active_Sleep_Time_
     * @param gPRIX_Race_Length
     * @param aI_Corner_Grip_Usage
     * @param auto_Line_Smoothing
     * @param gPRIX_Damage_Multiplier_
     * @param keep_Received_Setups_
     * @param cURNT_Race_Time
     * @param qualifying_length
     * @param aI_Logic_Override
     * @param disable_Resume_in_Replay_
     * @param gPRIX_CrashRecovery_
     * @param qualifying_laps
     * @param find_Default_Setup
     * @param cURNT_Opponents
     * @param standings_Func_
     * @param gPRIX_Allowed_Vehicles
     * @param transparent_Trainer_Lap
     * @param multi_session_Results_
     * @param qualifying_laps_
     * @param mULTI_CrashRecovery
     * @param full_Player_Replay
     * @param mULTI_AI_Driver_Strength
     * @param monitor_Admin_Postfix_
     * @param show_Extra_Lap_
     * @param rPLAY_Race_Length
     * @param mULTI_Speed_Compensation
     * @param measurement_Units_
     * @param record_To_Memory_
     * @param smart_Pitcrew_
     * @param monitor_AI_Postfix_
     * @param pitstop_Description_
     * @param cHAMP_Fuel_Consumption_Multiplier
     * @param temporary_Replay_Keys_
     * @param mULTI_Opponents
     * @param record_To_Memory
     * @param gPRIX_Race_Finish_Criteria
     * @param find_Default_Setup_
     * @param display_Track_Stats
     * @param aI_Mistakes
     * @param warmup_length
     * @param spotter_Detail
     * @param monitor_Admin_Postfix
     * @param vehicle_Removal
     * @param exit_Confirmation
     * @param vehicle_Removal_
     * @param tooltips
     * @param realTimeLogging
     * @param aI_Formation_by_Position
     * @param record_Replays_
     * @param practice_length
     * @param aI_Limiter
     * @param aI_Logic_Override_
     * @param cHAMP_Race_Time
     * @param speed_Comp_Dist
     * @param race_Stint_Offset_
     * @param cHAMP_CrashRecovery
     * @param cURNT_FreeSettings
     * @param relative_Fuel_Strategy_
     * @param auto_change_Opponent_List
     * @param record_Hotlaps
     * @param gPRIX_Race_Laps
     * @param pitstop_Description
     * @param transparent_Trainer_Lead_Time
     * @param monitor_Auto_Replay
     * @param rPLAY_CrashRecovery
     * @param speed_Units
     * @param save_All_Replay_Sessions
     * @param gPRIX_Tire_Wear_Multiplier
     * @param cHAMP_Race_Finish_Criteria
     * @param gPRIX_Damage_Multiplier
     * @param cHAMP_Damage_Multiplier
     */
    public GameOptions(float aI_Aggression, float aI_Brake_Grip_Usage, String aI_Brake_Grip_Usage_, float aI_Brake_Power_Usage, String aI_Brake_Power_Usage_, int aI_Calibrate_Sample_Size, String aI_Calibrate_Sample_Size_, float aI_Corner_Grip_Usage, String aI_Corner_Grip_Usage_, boolean aI_Formation_by_Position, String aI_Formation_by_Position_, float aI_Fuel_Mult, String aI_Fuel_Mult_, int aI_Limiter, String aI_Limiter_, int aI_Logic_Override, String aI_Logic_Override_, int aI_Mistakes, String aI_Mistakes_, int aI_Power_Calibration, String aI_Power_Calibration_, int active_Sleep_Time, String active_Sleep_Time_, int attack_Zone_AR_Time, String attack_Zone_AR_Time_, int auto_Line_Smoothing, String auto_Line_Smoothing_, boolean auto_Skip_Garaged_Vehicles, String auto_Skip_Garaged_Vehicles_, boolean auto_change_Opponent_List, String auto_change_Opponent_List_, int autocalibrate_AI_Mode, String autocalibrate_AI_Mode_, int automatic_Pit_Menu, String automatic_Pit_Menu_, int basic_Display, int basic_Rules, int cHAMP_AI_Driver_Strength, String cHAMP_Allowed_Vehicles, int cHAMP_CrashRecovery, int cHAMP_Damage_Multiplier, int cHAMP_FreeSettings, int cHAMP_Fuel_Consumption_Multiplier, int cHAMP_Opponents, int cHAMP_Race_Finish_Criteria, int cHAMP_Race_Laps, float cHAMP_Race_Length, int cHAMP_Race_Time, int cHAMP_Speed_Compensation, int cHAMP_Tire_Wear_Multiplier, int cURNT_AI_Driver_Strength, String cURNT_Allowed_Vehicles, int cURNT_CrashRecovery, int cURNT_Damage_Multiplier, int cURNT_FreeSettings, int cURNT_Fuel_Consumption_Multiplier, int cURNT_Opponents, int cURNT_Race_Finish_Criteria, int cURNT_Race_Laps, float cURNT_Race_Length, int cURNT_Race_Time, int cURNT_Speed_Compensation, int cURNT_Tire_Wear_Multiplier, int championship_Basic_Rules, int compress_Replay, String compress_Replay_, boolean damper_Units, String damper_Units_, int difficulty, boolean disable_NetComm, String disable_NetComm_, int disable_Resume_in_Replay, String disable_Resume_in_Replay_, boolean disconnected_Results, String disconnected_Results_, boolean display_Driver_Stats, boolean display_Track_Stats, int exit_Confirmation, String exit_Confirmation_, boolean find_Default_Setup, String find_Default_Setup_, boolean fixed_AI_Setups, String fixed_AI_Setups_, boolean fixed_Setups, String fixed_Setups_, boolean fixed_Upgrades, String fixed_Upgrades_, boolean full_Player_Replay, String full_Player_Replay_, int gPRIX_AI_Driver_Strength, String gPRIX_AI_Driver_Strength_, String gPRIX_Allowed_Vehicles, int gPRIX_CrashRecovery, String gPRIX_CrashRecovery_, int gPRIX_Damage_Multiplier, String gPRIX_Damage_Multiplier_, int gPRIX_FreeSettings, String gPRIX_FreeSettings_, int gPRIX_Fuel_Consumption_Multiplier, int gPRIX_Opponents, int gPRIX_Race_Finish_Criteria, String gPRIX_Race_Finish_Criteria_, int gPRIX_Race_Laps, float gPRIX_Race_Length, int gPRIX_Race_Time, String gPRIX_Race_Time_, int gPRIX_Speed_Compensation, String gPRIX_Speed_Compensation_, int gPRIX_Tire_Wear_Multiplier, int ghost_AI, String ghost_AI_, boolean horizontal_Tire_Temps, String horizontal_Tire_Temps_, int inactive_Sleep_Time, String inactive_Sleep_Time_, int instant_Replay_Length, int keep_Received_Setups, String keep_Received_Setups_, int mULTI_AI_Driver_Strength, String mULTI_Allowed_Vehicles, int mULTI_CrashRecovery, int mULTI_Damage_Multiplier, int mULTI_FreeSettings, int mULTI_Fuel_Consumption_Multiplier, int mULTI_Opponents, int mULTI_Race_Finish_Criteria, int mULTI_Race_Laps, float mULTI_Race_Length, int mULTI_Race_Time, int mULTI_Speed_Compensation, int mULTI_Tire_Wear_Multiplier, int measurement_Units, String measurement_Units_, int message_Center_Detail, int miscellaneous, String monitor_AI_Postfix, String monitor_AI_Postfix_, String monitor_Admin_Postfix, String monitor_Admin_Postfix_, boolean monitor_Auto_Replay, String monitor_Auto_Replay_, boolean multi_session_Results, String multi_session_Results_, int number_Race_Results, String number_Race_Results_, int number_Track_Replays, String number_Track_Replays_, int one_Lap_To_Go_Warning, String one_Lap_To_Go_Warning_, boolean pause_If_Focus_Lost, String pause_If_Focus_Lost_, boolean pitstop_Description, String pitstop_Description_, int play_Movies, int rPLAY_AI_Driver_Strength, String rPLAY_Allowed_Vehicles, int rPLAY_CrashRecovery, int rPLAY_Damage_Multiplier, int rPLAY_FreeSettings, int rPLAY_Fuel_Consumption_Multiplier, int rPLAY_Opponents, int rPLAY_Race_Finish_Criteria, int rPLAY_Race_Laps, float rPLAY_Race_Length, int rPLAY_Race_Time, int rPLAY_Speed_Compensation, int rPLAY_Tire_Wear_Multiplier, int race_Stint_Offset, String race_Stint_Offset_, int realTimeLogging, String realTimeLogging_, boolean realtime_Splits, String realtime_Splits_, int record_Hotlaps, String record_Hotlaps_, int record_Replays, String record_Replays_, boolean record_To_Memory, String record_To_Memory_, boolean relative_Fuel_Strategy, String relative_Fuel_Strategy_, int relevant_Setups_Only, String relevant_Setups_Only_, int replay_Base_Fidelity, boolean save_All_Replay_Sessions, String save_All_Replay_Sessions_, int settings_Type, int show_Extra_Lap, String show_Extra_Lap_, boolean smart_Pitcrew, String smart_Pitcrew_, int speed_Comp_Dist, String speed_Comp_Dist_, boolean speed_Units, String speed_Units_, int spotter_Behind, String spotter_Behind_, int spotter_Detail, String spotter_Detail_, int spotter_Laptimes, String spotter_Laptimes_, int standings_Func, String standings_Func_, int starting_Pos, String starting_Pos_, boolean temporary_Replay_Keys, String temporary_Replay_Keys_, boolean tooltips, float transparent_Trainer_Alpha, String transparent_Trainer_Alpha_, int transparent_Trainer_Lap, String transparent_Trainer_Lap_, float transparent_Trainer_Lead_Time, String transparent_Trainer_Lead_Time_, int transparent_Trainer_Proximity, String transparent_Trainer_Proximity_, boolean user_Vehicle_Data, String user_Vehicle_Data_, int vehicle_Removal, String vehicle_Removal_, boolean wait_For_All_Plugins_To_Load, String wait_For_All_Plugins_To_Load_, int practice_length, String practice_length_, int qualifying_laps, String qualifying_laps_, int qualifying_length, String qualifying_length_, int warmup_length, String warmup_length_) {
        super();
        this.aI_Aggression = aI_Aggression;
        this.aI_Brake_Grip_Usage = aI_Brake_Grip_Usage;
        this.aI_Brake_Grip_Usage_ = aI_Brake_Grip_Usage_;
        this.aI_Brake_Power_Usage = aI_Brake_Power_Usage;
        this.aI_Brake_Power_Usage_ = aI_Brake_Power_Usage_;
        this.aI_Calibrate_Sample_Size = aI_Calibrate_Sample_Size;
        this.aI_Calibrate_Sample_Size_ = aI_Calibrate_Sample_Size_;
        this.aI_Corner_Grip_Usage = aI_Corner_Grip_Usage;
        this.aI_Corner_Grip_Usage_ = aI_Corner_Grip_Usage_;
        this.aI_Formation_by_Position = aI_Formation_by_Position;
        this.aI_Formation_by_Position_ = aI_Formation_by_Position_;
        this.aI_Fuel_Mult = aI_Fuel_Mult;
        this.aI_Fuel_Mult_ = aI_Fuel_Mult_;
        this.aI_Limiter = aI_Limiter;
        this.aI_Limiter_ = aI_Limiter_;
        this.aI_Logic_Override = aI_Logic_Override;
        this.aI_Logic_Override_ = aI_Logic_Override_;
        this.aI_Mistakes = aI_Mistakes;
        this.aI_Mistakes_ = aI_Mistakes_;
        this.aI_Power_Calibration = aI_Power_Calibration;
        this.aI_Power_Calibration_ = aI_Power_Calibration_;
        this.active_Sleep_Time = active_Sleep_Time;
        this.active_Sleep_Time_ = active_Sleep_Time_;
        this.attack_Zone_AR_Time = attack_Zone_AR_Time;
        this.attack_Zone_AR_Time_ = attack_Zone_AR_Time_;
        this.auto_Line_Smoothing = auto_Line_Smoothing;
        this.auto_Line_Smoothing_ = auto_Line_Smoothing_;
        this.auto_Skip_Garaged_Vehicles = auto_Skip_Garaged_Vehicles;
        this.auto_Skip_Garaged_Vehicles_ = auto_Skip_Garaged_Vehicles_;
        this.auto_change_Opponent_List = auto_change_Opponent_List;
        this.auto_change_Opponent_List_ = auto_change_Opponent_List_;
        this.autocalibrate_AI_Mode = autocalibrate_AI_Mode;
        this.autocalibrate_AI_Mode_ = autocalibrate_AI_Mode_;
        this.automatic_Pit_Menu = automatic_Pit_Menu;
        this.automatic_Pit_Menu_ = automatic_Pit_Menu_;
        this.basic_Display = basic_Display;
        this.basic_Rules = basic_Rules;
        this.cHAMP_AI_Driver_Strength = cHAMP_AI_Driver_Strength;
        this.cHAMP_Allowed_Vehicles = cHAMP_Allowed_Vehicles;
        this.cHAMP_CrashRecovery = cHAMP_CrashRecovery;
        this.cHAMP_Damage_Multiplier = cHAMP_Damage_Multiplier;
        this.cHAMP_FreeSettings = cHAMP_FreeSettings;
        this.cHAMP_Fuel_Consumption_Multiplier = cHAMP_Fuel_Consumption_Multiplier;
        this.cHAMP_Opponents = cHAMP_Opponents;
        this.cHAMP_Race_Finish_Criteria = cHAMP_Race_Finish_Criteria;
        this.cHAMP_Race_Laps = cHAMP_Race_Laps;
        this.cHAMP_Race_Length = cHAMP_Race_Length;
        this.cHAMP_Race_Time = cHAMP_Race_Time;
        this.cHAMP_Speed_Compensation = cHAMP_Speed_Compensation;
        this.cHAMP_Tire_Wear_Multiplier = cHAMP_Tire_Wear_Multiplier;
        this.cURNT_AI_Driver_Strength = cURNT_AI_Driver_Strength;
        this.cURNT_Allowed_Vehicles = cURNT_Allowed_Vehicles;
        this.cURNT_CrashRecovery = cURNT_CrashRecovery;
        this.cURNT_Damage_Multiplier = cURNT_Damage_Multiplier;
        this.cURNT_FreeSettings = cURNT_FreeSettings;
        this.cURNT_Fuel_Consumption_Multiplier = cURNT_Fuel_Consumption_Multiplier;
        this.cURNT_Opponents = cURNT_Opponents;
        this.cURNT_Race_Finish_Criteria = cURNT_Race_Finish_Criteria;
        this.cURNT_Race_Laps = cURNT_Race_Laps;
        this.cURNT_Race_Length = cURNT_Race_Length;
        this.cURNT_Race_Time = cURNT_Race_Time;
        this.cURNT_Speed_Compensation = cURNT_Speed_Compensation;
        this.cURNT_Tire_Wear_Multiplier = cURNT_Tire_Wear_Multiplier;
        this.championship_Basic_Rules = championship_Basic_Rules;
        this.compress_Replay = compress_Replay;
        this.compress_Replay_ = compress_Replay_;
        this.damper_Units = damper_Units;
        this.damper_Units_ = damper_Units_;
        this.difficulty = difficulty;
        this.disable_NetComm = disable_NetComm;
        this.disable_NetComm_ = disable_NetComm_;
        this.disable_Resume_in_Replay = disable_Resume_in_Replay;
        this.disable_Resume_in_Replay_ = disable_Resume_in_Replay_;
        this.disconnected_Results = disconnected_Results;
        this.disconnected_Results_ = disconnected_Results_;
        this.display_Driver_Stats = display_Driver_Stats;
        this.display_Track_Stats = display_Track_Stats;
        this.exit_Confirmation = exit_Confirmation;
        this.exit_Confirmation_ = exit_Confirmation_;
        this.find_Default_Setup = find_Default_Setup;
        this.find_Default_Setup_ = find_Default_Setup_;
        this.fixed_AI_Setups = fixed_AI_Setups;
        this.fixed_AI_Setups_ = fixed_AI_Setups_;
        this.fixed_Setups = fixed_Setups;
        this.fixed_Setups_ = fixed_Setups_;
        this.fixed_Upgrades = fixed_Upgrades;
        this.fixed_Upgrades_ = fixed_Upgrades_;
        this.full_Player_Replay = full_Player_Replay;
        this.full_Player_Replay_ = full_Player_Replay_;
        this.gPRIX_AI_Driver_Strength = gPRIX_AI_Driver_Strength;
        this.gPRIX_AI_Driver_Strength_ = gPRIX_AI_Driver_Strength_;
        this.gPRIX_Allowed_Vehicles = gPRIX_Allowed_Vehicles;
        this.gPRIX_CrashRecovery = gPRIX_CrashRecovery;
        this.gPRIX_CrashRecovery_ = gPRIX_CrashRecovery_;
        this.gPRIX_Damage_Multiplier = gPRIX_Damage_Multiplier;
        this.gPRIX_Damage_Multiplier_ = gPRIX_Damage_Multiplier_;
        this.gPRIX_FreeSettings = gPRIX_FreeSettings;
        this.gPRIX_FreeSettings_ = gPRIX_FreeSettings_;
        this.gPRIX_Fuel_Consumption_Multiplier = gPRIX_Fuel_Consumption_Multiplier;
        this.gPRIX_Opponents = gPRIX_Opponents;
        this.gPRIX_Race_Finish_Criteria = gPRIX_Race_Finish_Criteria;
        this.gPRIX_Race_Finish_Criteria_ = gPRIX_Race_Finish_Criteria_;
        this.gPRIX_Race_Laps = gPRIX_Race_Laps;
        this.gPRIX_Race_Length = gPRIX_Race_Length;
        this.gPRIX_Race_Time = gPRIX_Race_Time;
        this.gPRIX_Race_Time_ = gPRIX_Race_Time_;
        this.gPRIX_Speed_Compensation = gPRIX_Speed_Compensation;
        this.gPRIX_Speed_Compensation_ = gPRIX_Speed_Compensation_;
        this.gPRIX_Tire_Wear_Multiplier = gPRIX_Tire_Wear_Multiplier;
        this.ghost_AI = ghost_AI;
        this.ghost_AI_ = ghost_AI_;
        this.horizontal_Tire_Temps = horizontal_Tire_Temps;
        this.horizontal_Tire_Temps_ = horizontal_Tire_Temps_;
        this.inactive_Sleep_Time = inactive_Sleep_Time;
        this.inactive_Sleep_Time_ = inactive_Sleep_Time_;
        this.instant_Replay_Length = instant_Replay_Length;
        this.keep_Received_Setups = keep_Received_Setups;
        this.keep_Received_Setups_ = keep_Received_Setups_;
        this.mULTI_AI_Driver_Strength = mULTI_AI_Driver_Strength;
        this.mULTI_Allowed_Vehicles = mULTI_Allowed_Vehicles;
        this.mULTI_CrashRecovery = mULTI_CrashRecovery;
        this.mULTI_Damage_Multiplier = mULTI_Damage_Multiplier;
        this.mULTI_FreeSettings = mULTI_FreeSettings;
        this.mULTI_Fuel_Consumption_Multiplier = mULTI_Fuel_Consumption_Multiplier;
        this.mULTI_Opponents = mULTI_Opponents;
        this.mULTI_Race_Finish_Criteria = mULTI_Race_Finish_Criteria;
        this.mULTI_Race_Laps = mULTI_Race_Laps;
        this.mULTI_Race_Length = mULTI_Race_Length;
        this.mULTI_Race_Time = mULTI_Race_Time;
        this.mULTI_Speed_Compensation = mULTI_Speed_Compensation;
        this.mULTI_Tire_Wear_Multiplier = mULTI_Tire_Wear_Multiplier;
        this.measurement_Units = measurement_Units;
        this.measurement_Units_ = measurement_Units_;
        this.message_Center_Detail = message_Center_Detail;
        this.miscellaneous = miscellaneous;
        this.monitor_AI_Postfix = monitor_AI_Postfix;
        this.monitor_AI_Postfix_ = monitor_AI_Postfix_;
        this.monitor_Admin_Postfix = monitor_Admin_Postfix;
        this.monitor_Admin_Postfix_ = monitor_Admin_Postfix_;
        this.monitor_Auto_Replay = monitor_Auto_Replay;
        this.monitor_Auto_Replay_ = monitor_Auto_Replay_;
        this.multi_session_Results = multi_session_Results;
        this.multi_session_Results_ = multi_session_Results_;
        this.number_Race_Results = number_Race_Results;
        this.number_Race_Results_ = number_Race_Results_;
        this.number_Track_Replays = number_Track_Replays;
        this.number_Track_Replays_ = number_Track_Replays_;
        this.one_Lap_To_Go_Warning = one_Lap_To_Go_Warning;
        this.one_Lap_To_Go_Warning_ = one_Lap_To_Go_Warning_;
        this.pause_If_Focus_Lost = pause_If_Focus_Lost;
        this.pause_If_Focus_Lost_ = pause_If_Focus_Lost_;
        this.pitstop_Description = pitstop_Description;
        this.pitstop_Description_ = pitstop_Description_;
        this.play_Movies = play_Movies;
        this.rPLAY_AI_Driver_Strength = rPLAY_AI_Driver_Strength;
        this.rPLAY_Allowed_Vehicles = rPLAY_Allowed_Vehicles;
        this.rPLAY_CrashRecovery = rPLAY_CrashRecovery;
        this.rPLAY_Damage_Multiplier = rPLAY_Damage_Multiplier;
        this.rPLAY_FreeSettings = rPLAY_FreeSettings;
        this.rPLAY_Fuel_Consumption_Multiplier = rPLAY_Fuel_Consumption_Multiplier;
        this.rPLAY_Opponents = rPLAY_Opponents;
        this.rPLAY_Race_Finish_Criteria = rPLAY_Race_Finish_Criteria;
        this.rPLAY_Race_Laps = rPLAY_Race_Laps;
        this.rPLAY_Race_Length = rPLAY_Race_Length;
        this.rPLAY_Race_Time = rPLAY_Race_Time;
        this.rPLAY_Speed_Compensation = rPLAY_Speed_Compensation;
        this.rPLAY_Tire_Wear_Multiplier = rPLAY_Tire_Wear_Multiplier;
        this.race_Stint_Offset = race_Stint_Offset;
        this.race_Stint_Offset_ = race_Stint_Offset_;
        this.realTimeLogging = realTimeLogging;
        this.realTimeLogging_ = realTimeLogging_;
        this.realtime_Splits = realtime_Splits;
        this.realtime_Splits_ = realtime_Splits_;
        this.record_Hotlaps = record_Hotlaps;
        this.record_Hotlaps_ = record_Hotlaps_;
        this.record_Replays = record_Replays;
        this.record_Replays_ = record_Replays_;
        this.record_To_Memory = record_To_Memory;
        this.record_To_Memory_ = record_To_Memory_;
        this.relative_Fuel_Strategy = relative_Fuel_Strategy;
        this.relative_Fuel_Strategy_ = relative_Fuel_Strategy_;
        this.relevant_Setups_Only = relevant_Setups_Only;
        this.relevant_Setups_Only_ = relevant_Setups_Only_;
        this.replay_Base_Fidelity = replay_Base_Fidelity;
        this.save_All_Replay_Sessions = save_All_Replay_Sessions;
        this.save_All_Replay_Sessions_ = save_All_Replay_Sessions_;
        this.settings_Type = settings_Type;
        this.show_Extra_Lap = show_Extra_Lap;
        this.show_Extra_Lap_ = show_Extra_Lap_;
        this.smart_Pitcrew = smart_Pitcrew;
        this.smart_Pitcrew_ = smart_Pitcrew_;
        this.speed_Comp_Dist = speed_Comp_Dist;
        this.speed_Comp_Dist_ = speed_Comp_Dist_;
        this.speed_Units = speed_Units;
        this.speed_Units_ = speed_Units_;
        this.spotter_Behind = spotter_Behind;
        this.spotter_Behind_ = spotter_Behind_;
        this.spotter_Detail = spotter_Detail;
        this.spotter_Detail_ = spotter_Detail_;
        this.spotter_Laptimes = spotter_Laptimes;
        this.spotter_Laptimes_ = spotter_Laptimes_;
        this.standings_Func = standings_Func;
        this.standings_Func_ = standings_Func_;
        this.starting_Pos = starting_Pos;
        this.starting_Pos_ = starting_Pos_;
        this.temporary_Replay_Keys = temporary_Replay_Keys;
        this.temporary_Replay_Keys_ = temporary_Replay_Keys_;
        this.tooltips = tooltips;
        this.transparent_Trainer_Alpha = transparent_Trainer_Alpha;
        this.transparent_Trainer_Alpha_ = transparent_Trainer_Alpha_;
        this.transparent_Trainer_Lap = transparent_Trainer_Lap;
        this.transparent_Trainer_Lap_ = transparent_Trainer_Lap_;
        this.transparent_Trainer_Lead_Time = transparent_Trainer_Lead_Time;
        this.transparent_Trainer_Lead_Time_ = transparent_Trainer_Lead_Time_;
        this.transparent_Trainer_Proximity = transparent_Trainer_Proximity;
        this.transparent_Trainer_Proximity_ = transparent_Trainer_Proximity_;
        this.user_Vehicle_Data = user_Vehicle_Data;
        this.user_Vehicle_Data_ = user_Vehicle_Data_;
        this.vehicle_Removal = vehicle_Removal;
        this.vehicle_Removal_ = vehicle_Removal_;
        this.wait_For_All_Plugins_To_Load = wait_For_All_Plugins_To_Load;
        this.wait_For_All_Plugins_To_Load_ = wait_For_All_Plugins_To_Load_;
        this.practice_length = practice_length;
        this.practice_length_ = practice_length_;
        this.qualifying_laps = qualifying_laps;
        this.qualifying_laps_ = qualifying_laps_;
        this.qualifying_length = qualifying_length;
        this.qualifying_length_ = qualifying_length_;
        this.warmup_length = warmup_length;
        this.warmup_length_ = warmup_length_;
    }

    @JsonProperty("AI Aggression")
    public float getAI_Aggression() {
        return aI_Aggression;
    }

    @JsonProperty("AI Aggression")
    public void setAI_Aggression(float aI_Aggression) {
        this.aI_Aggression = aI_Aggression;
    }

    @JsonProperty("AI Brake_Grip Usage")
    public float getAI_Brake_Grip_Usage() {
        return aI_Brake_Grip_Usage;
    }

    @JsonProperty("AI Brake_Grip Usage")
    public void setAI_Brake_Grip_Usage(float aI_Brake_Grip_Usage) {
        this.aI_Brake_Grip_Usage = aI_Brake_Grip_Usage;
    }

    @JsonProperty("AI Brake_Grip Usage#")
    public String getAI_Brake_Grip_Usage_() {
        return aI_Brake_Grip_Usage_;
    }

    @JsonProperty("AI Brake_Grip Usage#")
    public void setAI_Brake_Grip_Usage_(String aI_Brake_Grip_Usage_) {
        this.aI_Brake_Grip_Usage_ = aI_Brake_Grip_Usage_;
    }

    @JsonProperty("AI Brake_Power Usage")
    public float getAI_Brake_Power_Usage() {
        return aI_Brake_Power_Usage;
    }

    @JsonProperty("AI Brake_Power Usage")
    public void setAI_Brake_Power_Usage(float aI_Brake_Power_Usage) {
        this.aI_Brake_Power_Usage = aI_Brake_Power_Usage;
    }

    @JsonProperty("AI Brake_Power Usage#")
    public String getAI_Brake_Power_Usage_() {
        return aI_Brake_Power_Usage_;
    }

    @JsonProperty("AI Brake_Power Usage#")
    public void setAI_Brake_Power_Usage_(String aI_Brake_Power_Usage_) {
        this.aI_Brake_Power_Usage_ = aI_Brake_Power_Usage_;
    }

    @JsonProperty("AI Calibrate Sample Size")
    public int getAI_Calibrate_Sample_Size() {
        return aI_Calibrate_Sample_Size;
    }

    @JsonProperty("AI Calibrate Sample Size")
    public void setAI_Calibrate_Sample_Size(int aI_Calibrate_Sample_Size) {
        this.aI_Calibrate_Sample_Size = aI_Calibrate_Sample_Size;
    }

    @JsonProperty("AI Calibrate Sample Size#")
    public String getAI_Calibrate_Sample_Size_() {
        return aI_Calibrate_Sample_Size_;
    }

    @JsonProperty("AI Calibrate Sample Size#")
    public void setAI_Calibrate_Sample_Size_(String aI_Calibrate_Sample_Size_) {
        this.aI_Calibrate_Sample_Size_ = aI_Calibrate_Sample_Size_;
    }

    @JsonProperty("AI Corner_Grip Usage")
    public float getAI_Corner_Grip_Usage() {
        return aI_Corner_Grip_Usage;
    }

    @JsonProperty("AI Corner_Grip Usage")
    public void setAI_Corner_Grip_Usage(float aI_Corner_Grip_Usage) {
        this.aI_Corner_Grip_Usage = aI_Corner_Grip_Usage;
    }

    @JsonProperty("AI Corner_Grip Usage#")
    public String getAI_Corner_Grip_Usage_() {
        return aI_Corner_Grip_Usage_;
    }

    @JsonProperty("AI Corner_Grip Usage#")
    public void setAI_Corner_Grip_Usage_(String aI_Corner_Grip_Usage_) {
        this.aI_Corner_Grip_Usage_ = aI_Corner_Grip_Usage_;
    }

    @JsonProperty("AI Formation by Position")
    public boolean isAI_Formation_by_Position() {
        return aI_Formation_by_Position;
    }

    @JsonProperty("AI Formation by Position")
    public void setAI_Formation_by_Position(boolean aI_Formation_by_Position) {
        this.aI_Formation_by_Position = aI_Formation_by_Position;
    }

    @JsonProperty("AI Formation by Position#")
    public String getAI_Formation_by_Position_() {
        return aI_Formation_by_Position_;
    }

    @JsonProperty("AI Formation by Position#")
    public void setAI_Formation_by_Position_(String aI_Formation_by_Position_) {
        this.aI_Formation_by_Position_ = aI_Formation_by_Position_;
    }

    @JsonProperty("AI Fuel Mult")
    public float getAI_Fuel_Mult() {
        return aI_Fuel_Mult;
    }

    @JsonProperty("AI Fuel Mult")
    public void setAI_Fuel_Mult(float aI_Fuel_Mult) {
        this.aI_Fuel_Mult = aI_Fuel_Mult;
    }

    @JsonProperty("AI Fuel Mult#")
    public String getAI_Fuel_Mult_() {
        return aI_Fuel_Mult_;
    }

    @JsonProperty("AI Fuel Mult#")
    public void setAI_Fuel_Mult_(String aI_Fuel_Mult_) {
        this.aI_Fuel_Mult_ = aI_Fuel_Mult_;
    }

    @JsonProperty("AI Limiter")
    public int getAI_Limiter() {
        return aI_Limiter;
    }

    @JsonProperty("AI Limiter")
    public void setAI_Limiter(int aI_Limiter) {
        this.aI_Limiter = aI_Limiter;
    }

    @JsonProperty("AI Limiter#")
    public String getAI_Limiter_() {
        return aI_Limiter_;
    }

    @JsonProperty("AI Limiter#")
    public void setAI_Limiter_(String aI_Limiter_) {
        this.aI_Limiter_ = aI_Limiter_;
    }

    @JsonProperty("AI Logic Override")
    public int getAI_Logic_Override() {
        return aI_Logic_Override;
    }

    @JsonProperty("AI Logic Override")
    public void setAI_Logic_Override(int aI_Logic_Override) {
        this.aI_Logic_Override = aI_Logic_Override;
    }

    @JsonProperty("AI Logic Override#")
    public String getAI_Logic_Override_() {
        return aI_Logic_Override_;
    }

    @JsonProperty("AI Logic Override#")
    public void setAI_Logic_Override_(String aI_Logic_Override_) {
        this.aI_Logic_Override_ = aI_Logic_Override_;
    }

    @JsonProperty("AI Mistakes")
    public int getAI_Mistakes() {
        return aI_Mistakes;
    }

    @JsonProperty("AI Mistakes")
    public void setAI_Mistakes(int aI_Mistakes) {
        this.aI_Mistakes = aI_Mistakes;
    }

    @JsonProperty("AI Mistakes#")
    public String getAI_Mistakes_() {
        return aI_Mistakes_;
    }

    @JsonProperty("AI Mistakes#")
    public void setAI_Mistakes_(String aI_Mistakes_) {
        this.aI_Mistakes_ = aI_Mistakes_;
    }

    @JsonProperty("AI Power Calibration")
    public int getAI_Power_Calibration() {
        return aI_Power_Calibration;
    }

    @JsonProperty("AI Power Calibration")
    public void setAI_Power_Calibration(int aI_Power_Calibration) {
        this.aI_Power_Calibration = aI_Power_Calibration;
    }

    @JsonProperty("AI Power Calibration#")
    public String getAI_Power_Calibration_() {
        return aI_Power_Calibration_;
    }

    @JsonProperty("AI Power Calibration#")
    public void setAI_Power_Calibration_(String aI_Power_Calibration_) {
        this.aI_Power_Calibration_ = aI_Power_Calibration_;
    }

    @JsonProperty("Active Sleep Time")
    public int getActive_Sleep_Time() {
        return active_Sleep_Time;
    }

    @JsonProperty("Active Sleep Time")
    public void setActive_Sleep_Time(int active_Sleep_Time) {
        this.active_Sleep_Time = active_Sleep_Time;
    }

    @JsonProperty("Active Sleep Time#")
    public String getActive_Sleep_Time_() {
        return active_Sleep_Time_;
    }

    @JsonProperty("Active Sleep Time#")
    public void setActive_Sleep_Time_(String active_Sleep_Time_) {
        this.active_Sleep_Time_ = active_Sleep_Time_;
    }

    @JsonProperty("Attack Zone AR Time")
    public int getAttack_Zone_AR_Time() {
        return attack_Zone_AR_Time;
    }

    @JsonProperty("Attack Zone AR Time")
    public void setAttack_Zone_AR_Time(int attack_Zone_AR_Time) {
        this.attack_Zone_AR_Time = attack_Zone_AR_Time;
    }

    @JsonProperty("Attack Zone AR Time#")
    public String getAttack_Zone_AR_Time_() {
        return attack_Zone_AR_Time_;
    }

    @JsonProperty("Attack Zone AR Time#")
    public void setAttack_Zone_AR_Time_(String attack_Zone_AR_Time_) {
        this.attack_Zone_AR_Time_ = attack_Zone_AR_Time_;
    }

    @JsonProperty("Auto Line Smoothing")
    public int getAuto_Line_Smoothing() {
        return auto_Line_Smoothing;
    }

    @JsonProperty("Auto Line Smoothing")
    public void setAuto_Line_Smoothing(int auto_Line_Smoothing) {
        this.auto_Line_Smoothing = auto_Line_Smoothing;
    }

    @JsonProperty("Auto Line Smoothing#")
    public String getAuto_Line_Smoothing_() {
        return auto_Line_Smoothing_;
    }

    @JsonProperty("Auto Line Smoothing#")
    public void setAuto_Line_Smoothing_(String auto_Line_Smoothing_) {
        this.auto_Line_Smoothing_ = auto_Line_Smoothing_;
    }

    @JsonProperty("Auto Skip Garaged Vehicles")
    public boolean isAuto_Skip_Garaged_Vehicles() {
        return auto_Skip_Garaged_Vehicles;
    }

    @JsonProperty("Auto Skip Garaged Vehicles")
    public void setAuto_Skip_Garaged_Vehicles(boolean auto_Skip_Garaged_Vehicles) {
        this.auto_Skip_Garaged_Vehicles = auto_Skip_Garaged_Vehicles;
    }

    @JsonProperty("Auto Skip Garaged Vehicles#")
    public String getAuto_Skip_Garaged_Vehicles_() {
        return auto_Skip_Garaged_Vehicles_;
    }

    @JsonProperty("Auto Skip Garaged Vehicles#")
    public void setAuto_Skip_Garaged_Vehicles_(String auto_Skip_Garaged_Vehicles_) {
        this.auto_Skip_Garaged_Vehicles_ = auto_Skip_Garaged_Vehicles_;
    }

    @JsonProperty("Auto-change Opponent List")
    public boolean isAuto_change_Opponent_List() {
        return auto_change_Opponent_List;
    }

    @JsonProperty("Auto-change Opponent List")
    public void setAuto_change_Opponent_List(boolean auto_change_Opponent_List) {
        this.auto_change_Opponent_List = auto_change_Opponent_List;
    }

    @JsonProperty("Auto-change Opponent List#")
    public String getAuto_change_Opponent_List_() {
        return auto_change_Opponent_List_;
    }

    @JsonProperty("Auto-change Opponent List#")
    public void setAuto_change_Opponent_List_(String auto_change_Opponent_List_) {
        this.auto_change_Opponent_List_ = auto_change_Opponent_List_;
    }

    @JsonProperty("Autocalibrate AI Mode")
    public int getAutocalibrate_AI_Mode() {
        return autocalibrate_AI_Mode;
    }

    @JsonProperty("Autocalibrate AI Mode")
    public void setAutocalibrate_AI_Mode(int autocalibrate_AI_Mode) {
        this.autocalibrate_AI_Mode = autocalibrate_AI_Mode;
    }

    @JsonProperty("Autocalibrate AI Mode#")
    public String getAutocalibrate_AI_Mode_() {
        return autocalibrate_AI_Mode_;
    }

    @JsonProperty("Autocalibrate AI Mode#")
    public void setAutocalibrate_AI_Mode_(String autocalibrate_AI_Mode_) {
        this.autocalibrate_AI_Mode_ = autocalibrate_AI_Mode_;
    }

    @JsonProperty("Automatic Pit Menu")
    public int getAutomatic_Pit_Menu() {
        return automatic_Pit_Menu;
    }

    @JsonProperty("Automatic Pit Menu")
    public void setAutomatic_Pit_Menu(int automatic_Pit_Menu) {
        this.automatic_Pit_Menu = automatic_Pit_Menu;
    }

    @JsonProperty("Automatic Pit Menu#")
    public String getAutomatic_Pit_Menu_() {
        return automatic_Pit_Menu_;
    }

    @JsonProperty("Automatic Pit Menu#")
    public void setAutomatic_Pit_Menu_(String automatic_Pit_Menu_) {
        this.automatic_Pit_Menu_ = automatic_Pit_Menu_;
    }

    @JsonProperty("Basic Display")
    public int getBasic_Display() {
        return basic_Display;
    }

    @JsonProperty("Basic Display")
    public void setBasic_Display(int basic_Display) {
        this.basic_Display = basic_Display;
    }

    @JsonProperty("Basic Rules")
    public int getBasic_Rules() {
        return basic_Rules;
    }

    @JsonProperty("Basic Rules")
    public void setBasic_Rules(int basic_Rules) {
        this.basic_Rules = basic_Rules;
    }

    @JsonProperty("CHAMP AI Driver Strength")
    public int getCHAMP_AI_Driver_Strength() {
        return cHAMP_AI_Driver_Strength;
    }

    @JsonProperty("CHAMP AI Driver Strength")
    public void setCHAMP_AI_Driver_Strength(int cHAMP_AI_Driver_Strength) {
        this.cHAMP_AI_Driver_Strength = cHAMP_AI_Driver_Strength;
    }

    @JsonProperty("CHAMP Allowed Vehicles")
    public String getCHAMP_Allowed_Vehicles() {
        return cHAMP_Allowed_Vehicles;
    }

    @JsonProperty("CHAMP Allowed Vehicles")
    public void setCHAMP_Allowed_Vehicles(String cHAMP_Allowed_Vehicles) {
        this.cHAMP_Allowed_Vehicles = cHAMP_Allowed_Vehicles;
    }

    @JsonProperty("CHAMP CrashRecovery")
    public int getCHAMP_CrashRecovery() {
        return cHAMP_CrashRecovery;
    }

    @JsonProperty("CHAMP CrashRecovery")
    public void setCHAMP_CrashRecovery(int cHAMP_CrashRecovery) {
        this.cHAMP_CrashRecovery = cHAMP_CrashRecovery;
    }

    @JsonProperty("CHAMP Damage Multiplier")
    public int getCHAMP_Damage_Multiplier() {
        return cHAMP_Damage_Multiplier;
    }

    @JsonProperty("CHAMP Damage Multiplier")
    public void setCHAMP_Damage_Multiplier(int cHAMP_Damage_Multiplier) {
        this.cHAMP_Damage_Multiplier = cHAMP_Damage_Multiplier;
    }

    @JsonProperty("CHAMP FreeSettings")
    public int getCHAMP_FreeSettings() {
        return cHAMP_FreeSettings;
    }

    @JsonProperty("CHAMP FreeSettings")
    public void setCHAMP_FreeSettings(int cHAMP_FreeSettings) {
        this.cHAMP_FreeSettings = cHAMP_FreeSettings;
    }

    @JsonProperty("CHAMP Fuel Consumption Multiplier")
    public int getCHAMP_Fuel_Consumption_Multiplier() {
        return cHAMP_Fuel_Consumption_Multiplier;
    }

    @JsonProperty("CHAMP Fuel Consumption Multiplier")
    public void setCHAMP_Fuel_Consumption_Multiplier(int cHAMP_Fuel_Consumption_Multiplier) {
        this.cHAMP_Fuel_Consumption_Multiplier = cHAMP_Fuel_Consumption_Multiplier;
    }

    @JsonProperty("CHAMP Opponents")
    public int getCHAMP_Opponents() {
        return cHAMP_Opponents;
    }

    @JsonProperty("CHAMP Opponents")
    public void setCHAMP_Opponents(int cHAMP_Opponents) {
        this.cHAMP_Opponents = cHAMP_Opponents;
    }

    @JsonProperty("CHAMP Race Finish Criteria")
    public int getCHAMP_Race_Finish_Criteria() {
        return cHAMP_Race_Finish_Criteria;
    }

    @JsonProperty("CHAMP Race Finish Criteria")
    public void setCHAMP_Race_Finish_Criteria(int cHAMP_Race_Finish_Criteria) {
        this.cHAMP_Race_Finish_Criteria = cHAMP_Race_Finish_Criteria;
    }

    @JsonProperty("CHAMP Race Laps")
    public int getCHAMP_Race_Laps() {
        return cHAMP_Race_Laps;
    }

    @JsonProperty("CHAMP Race Laps")
    public void setCHAMP_Race_Laps(int cHAMP_Race_Laps) {
        this.cHAMP_Race_Laps = cHAMP_Race_Laps;
    }

    @JsonProperty("CHAMP Race Length")
    public float getCHAMP_Race_Length() {
        return cHAMP_Race_Length;
    }

    @JsonProperty("CHAMP Race Length")
    public void setCHAMP_Race_Length(float cHAMP_Race_Length) {
        this.cHAMP_Race_Length = cHAMP_Race_Length;
    }

    @JsonProperty("CHAMP Race Time")
    public int getCHAMP_Race_Time() {
        return cHAMP_Race_Time;
    }

    @JsonProperty("CHAMP Race Time")
    public void setCHAMP_Race_Time(int cHAMP_Race_Time) {
        this.cHAMP_Race_Time = cHAMP_Race_Time;
    }

    @JsonProperty("CHAMP Speed Compensation")
    public int getCHAMP_Speed_Compensation() {
        return cHAMP_Speed_Compensation;
    }

    @JsonProperty("CHAMP Speed Compensation")
    public void setCHAMP_Speed_Compensation(int cHAMP_Speed_Compensation) {
        this.cHAMP_Speed_Compensation = cHAMP_Speed_Compensation;
    }

    @JsonProperty("CHAMP Tire Wear Multiplier")
    public int getCHAMP_Tire_Wear_Multiplier() {
        return cHAMP_Tire_Wear_Multiplier;
    }

    @JsonProperty("CHAMP Tire Wear Multiplier")
    public void setCHAMP_Tire_Wear_Multiplier(int cHAMP_Tire_Wear_Multiplier) {
        this.cHAMP_Tire_Wear_Multiplier = cHAMP_Tire_Wear_Multiplier;
    }

    @JsonProperty("CURNT AI Driver Strength")
    public int getCURNT_AI_Driver_Strength() {
        return cURNT_AI_Driver_Strength;
    }

    @JsonProperty("CURNT AI Driver Strength")
    public void setCURNT_AI_Driver_Strength(int cURNT_AI_Driver_Strength) {
        this.cURNT_AI_Driver_Strength = cURNT_AI_Driver_Strength;
    }

    @JsonProperty("CURNT Allowed Vehicles")
    public String getCURNT_Allowed_Vehicles() {
        return cURNT_Allowed_Vehicles;
    }

    @JsonProperty("CURNT Allowed Vehicles")
    public void setCURNT_Allowed_Vehicles(String cURNT_Allowed_Vehicles) {
        this.cURNT_Allowed_Vehicles = cURNT_Allowed_Vehicles;
    }

    @JsonProperty("CURNT CrashRecovery")
    public int getCURNT_CrashRecovery() {
        return cURNT_CrashRecovery;
    }

    @JsonProperty("CURNT CrashRecovery")
    public void setCURNT_CrashRecovery(int cURNT_CrashRecovery) {
        this.cURNT_CrashRecovery = cURNT_CrashRecovery;
    }

    @JsonProperty("CURNT Damage Multiplier")
    public int getCURNT_Damage_Multiplier() {
        return cURNT_Damage_Multiplier;
    }

    @JsonProperty("CURNT Damage Multiplier")
    public void setCURNT_Damage_Multiplier(int cURNT_Damage_Multiplier) {
        this.cURNT_Damage_Multiplier = cURNT_Damage_Multiplier;
    }

    @JsonProperty("CURNT FreeSettings")
    public int getCURNT_FreeSettings() {
        return cURNT_FreeSettings;
    }

    @JsonProperty("CURNT FreeSettings")
    public void setCURNT_FreeSettings(int cURNT_FreeSettings) {
        this.cURNT_FreeSettings = cURNT_FreeSettings;
    }

    @JsonProperty("CURNT Fuel Consumption Multiplier")
    public int getCURNT_Fuel_Consumption_Multiplier() {
        return cURNT_Fuel_Consumption_Multiplier;
    }

    @JsonProperty("CURNT Fuel Consumption Multiplier")
    public void setCURNT_Fuel_Consumption_Multiplier(int cURNT_Fuel_Consumption_Multiplier) {
        this.cURNT_Fuel_Consumption_Multiplier = cURNT_Fuel_Consumption_Multiplier;
    }

    @JsonProperty("CURNT Opponents")
    public int getCURNT_Opponents() {
        return cURNT_Opponents;
    }

    @JsonProperty("CURNT Opponents")
    public void setCURNT_Opponents(int cURNT_Opponents) {
        this.cURNT_Opponents = cURNT_Opponents;
    }

    @JsonProperty("CURNT Race Finish Criteria")
    public int getCURNT_Race_Finish_Criteria() {
        return cURNT_Race_Finish_Criteria;
    }

    @JsonProperty("CURNT Race Finish Criteria")
    public void setCURNT_Race_Finish_Criteria(int cURNT_Race_Finish_Criteria) {
        this.cURNT_Race_Finish_Criteria = cURNT_Race_Finish_Criteria;
    }

    @JsonProperty("CURNT Race Laps")
    public int getCURNT_Race_Laps() {
        return cURNT_Race_Laps;
    }

    @JsonProperty("CURNT Race Laps")
    public void setCURNT_Race_Laps(int cURNT_Race_Laps) {
        this.cURNT_Race_Laps = cURNT_Race_Laps;
    }

    @JsonProperty("CURNT Race Length")
    public float getCURNT_Race_Length() {
        return cURNT_Race_Length;
    }

    @JsonProperty("CURNT Race Length")
    public void setCURNT_Race_Length(float cURNT_Race_Length) {
        this.cURNT_Race_Length = cURNT_Race_Length;
    }

    @JsonProperty("CURNT Race Time")
    public int getCURNT_Race_Time() {
        return cURNT_Race_Time;
    }

    @JsonProperty("CURNT Race Time")
    public void setCURNT_Race_Time(int cURNT_Race_Time) {
        this.cURNT_Race_Time = cURNT_Race_Time;
    }

    @JsonProperty("CURNT Speed Compensation")
    public int getCURNT_Speed_Compensation() {
        return cURNT_Speed_Compensation;
    }

    @JsonProperty("CURNT Speed Compensation")
    public void setCURNT_Speed_Compensation(int cURNT_Speed_Compensation) {
        this.cURNT_Speed_Compensation = cURNT_Speed_Compensation;
    }

    @JsonProperty("CURNT Tire Wear Multiplier")
    public int getCURNT_Tire_Wear_Multiplier() {
        return cURNT_Tire_Wear_Multiplier;
    }

    @JsonProperty("CURNT Tire Wear Multiplier")
    public void setCURNT_Tire_Wear_Multiplier(int cURNT_Tire_Wear_Multiplier) {
        this.cURNT_Tire_Wear_Multiplier = cURNT_Tire_Wear_Multiplier;
    }

    @JsonProperty("Championship Basic Rules")
    public int getChampionship_Basic_Rules() {
        return championship_Basic_Rules;
    }

    @JsonProperty("Championship Basic Rules")
    public void setChampionship_Basic_Rules(int championship_Basic_Rules) {
        this.championship_Basic_Rules = championship_Basic_Rules;
    }

    @JsonProperty("Compress Replay")
    public int getCompress_Replay() {
        return compress_Replay;
    }

    @JsonProperty("Compress Replay")
    public void setCompress_Replay(int compress_Replay) {
        this.compress_Replay = compress_Replay;
    }

    @JsonProperty("Compress Replay#")
    public String getCompress_Replay_() {
        return compress_Replay_;
    }

    @JsonProperty("Compress Replay#")
    public void setCompress_Replay_(String compress_Replay_) {
        this.compress_Replay_ = compress_Replay_;
    }

    @JsonProperty("Damper Units")
    public boolean isDamper_Units() {
        return damper_Units;
    }

    @JsonProperty("Damper Units")
    public void setDamper_Units(boolean damper_Units) {
        this.damper_Units = damper_Units;
    }

    @JsonProperty("Damper Units#")
    public String getDamper_Units_() {
        return damper_Units_;
    }

    @JsonProperty("Damper Units#")
    public void setDamper_Units_(String damper_Units_) {
        this.damper_Units_ = damper_Units_;
    }

    @JsonProperty("Difficulty")
    public int getDifficulty() {
        return difficulty;
    }

    @JsonProperty("Difficulty")
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @JsonProperty("Disable NetComm")
    public boolean isDisable_NetComm() {
        return disable_NetComm;
    }

    @JsonProperty("Disable NetComm")
    public void setDisable_NetComm(boolean disable_NetComm) {
        this.disable_NetComm = disable_NetComm;
    }

    @JsonProperty("Disable NetComm#")
    public String getDisable_NetComm_() {
        return disable_NetComm_;
    }

    @JsonProperty("Disable NetComm#")
    public void setDisable_NetComm_(String disable_NetComm_) {
        this.disable_NetComm_ = disable_NetComm_;
    }

    @JsonProperty("Disable Resume in Replay")
    public int getDisable_Resume_in_Replay() {
        return disable_Resume_in_Replay;
    }

    @JsonProperty("Disable Resume in Replay")
    public void setDisable_Resume_in_Replay(int disable_Resume_in_Replay) {
        this.disable_Resume_in_Replay = disable_Resume_in_Replay;
    }

    @JsonProperty("Disable Resume in Replay#")
    public String getDisable_Resume_in_Replay_() {
        return disable_Resume_in_Replay_;
    }

    @JsonProperty("Disable Resume in Replay#")
    public void setDisable_Resume_in_Replay_(String disable_Resume_in_Replay_) {
        this.disable_Resume_in_Replay_ = disable_Resume_in_Replay_;
    }

    @JsonProperty("Disconnected Results")
    public boolean isDisconnected_Results() {
        return disconnected_Results;
    }

    @JsonProperty("Disconnected Results")
    public void setDisconnected_Results(boolean disconnected_Results) {
        this.disconnected_Results = disconnected_Results;
    }

    @JsonProperty("Disconnected Results#")
    public String getDisconnected_Results_() {
        return disconnected_Results_;
    }

    @JsonProperty("Disconnected Results#")
    public void setDisconnected_Results_(String disconnected_Results_) {
        this.disconnected_Results_ = disconnected_Results_;
    }

    @JsonProperty("Display Driver Stats")
    public boolean isDisplay_Driver_Stats() {
        return display_Driver_Stats;
    }

    @JsonProperty("Display Driver Stats")
    public void setDisplay_Driver_Stats(boolean display_Driver_Stats) {
        this.display_Driver_Stats = display_Driver_Stats;
    }

    @JsonProperty("Display Track Stats")
    public boolean isDisplay_Track_Stats() {
        return display_Track_Stats;
    }

    @JsonProperty("Display Track Stats")
    public void setDisplay_Track_Stats(boolean display_Track_Stats) {
        this.display_Track_Stats = display_Track_Stats;
    }

    @JsonProperty("Exit Confirmation")
    public int getExit_Confirmation() {
        return exit_Confirmation;
    }

    @JsonProperty("Exit Confirmation")
    public void setExit_Confirmation(int exit_Confirmation) {
        this.exit_Confirmation = exit_Confirmation;
    }

    @JsonProperty("Exit Confirmation#")
    public String getExit_Confirmation_() {
        return exit_Confirmation_;
    }

    @JsonProperty("Exit Confirmation#")
    public void setExit_Confirmation_(String exit_Confirmation_) {
        this.exit_Confirmation_ = exit_Confirmation_;
    }

    @JsonProperty("Find Default Setup")
    public boolean isFind_Default_Setup() {
        return find_Default_Setup;
    }

    @JsonProperty("Find Default Setup")
    public void setFind_Default_Setup(boolean find_Default_Setup) {
        this.find_Default_Setup = find_Default_Setup;
    }

    @JsonProperty("Find Default Setup#")
    public String getFind_Default_Setup_() {
        return find_Default_Setup_;
    }

    @JsonProperty("Find Default Setup#")
    public void setFind_Default_Setup_(String find_Default_Setup_) {
        this.find_Default_Setup_ = find_Default_Setup_;
    }

    @JsonProperty("Fixed AI Setups")
    public boolean isFixed_AI_Setups() {
        return fixed_AI_Setups;
    }

    @JsonProperty("Fixed AI Setups")
    public void setFixed_AI_Setups(boolean fixed_AI_Setups) {
        this.fixed_AI_Setups = fixed_AI_Setups;
    }

    @JsonProperty("Fixed AI Setups#")
    public String getFixed_AI_Setups_() {
        return fixed_AI_Setups_;
    }

    @JsonProperty("Fixed AI Setups#")
    public void setFixed_AI_Setups_(String fixed_AI_Setups_) {
        this.fixed_AI_Setups_ = fixed_AI_Setups_;
    }

    @JsonProperty("Fixed Setups")
    public boolean isFixed_Setups() {
        return fixed_Setups;
    }

    @JsonProperty("Fixed Setups")
    public void setFixed_Setups(boolean fixed_Setups) {
        this.fixed_Setups = fixed_Setups;
    }

    @JsonProperty("Fixed Setups#")
    public String getFixed_Setups_() {
        return fixed_Setups_;
    }

    @JsonProperty("Fixed Setups#")
    public void setFixed_Setups_(String fixed_Setups_) {
        this.fixed_Setups_ = fixed_Setups_;
    }

    @JsonProperty("Fixed Upgrades")
    public boolean isFixed_Upgrades() {
        return fixed_Upgrades;
    }

    @JsonProperty("Fixed Upgrades")
    public void setFixed_Upgrades(boolean fixed_Upgrades) {
        this.fixed_Upgrades = fixed_Upgrades;
    }

    @JsonProperty("Fixed Upgrades#")
    public String getFixed_Upgrades_() {
        return fixed_Upgrades_;
    }

    @JsonProperty("Fixed Upgrades#")
    public void setFixed_Upgrades_(String fixed_Upgrades_) {
        this.fixed_Upgrades_ = fixed_Upgrades_;
    }

    @JsonProperty("Full Player Replay")
    public boolean isFull_Player_Replay() {
        return full_Player_Replay;
    }

    @JsonProperty("Full Player Replay")
    public void setFull_Player_Replay(boolean full_Player_Replay) {
        this.full_Player_Replay = full_Player_Replay;
    }

    @JsonProperty("Full Player Replay#")
    public String getFull_Player_Replay_() {
        return full_Player_Replay_;
    }

    @JsonProperty("Full Player Replay#")
    public void setFull_Player_Replay_(String full_Player_Replay_) {
        this.full_Player_Replay_ = full_Player_Replay_;
    }

    @JsonProperty("GPRIX AI Driver Strength")
    public int getGPRIX_AI_Driver_Strength() {
        return gPRIX_AI_Driver_Strength;
    }

    @JsonProperty("GPRIX AI Driver Strength")
    public void setGPRIX_AI_Driver_Strength(int gPRIX_AI_Driver_Strength) {
        this.gPRIX_AI_Driver_Strength = gPRIX_AI_Driver_Strength;
    }

    @JsonProperty("GPRIX AI Driver Strength#")
    public String getGPRIX_AI_Driver_Strength_() {
        return gPRIX_AI_Driver_Strength_;
    }

    @JsonProperty("GPRIX AI Driver Strength#")
    public void setGPRIX_AI_Driver_Strength_(String gPRIX_AI_Driver_Strength_) {
        this.gPRIX_AI_Driver_Strength_ = gPRIX_AI_Driver_Strength_;
    }

    @JsonProperty("GPRIX Allowed Vehicles")
    public String getGPRIX_Allowed_Vehicles() {
        return gPRIX_Allowed_Vehicles;
    }

    @JsonProperty("GPRIX Allowed Vehicles")
    public void setGPRIX_Allowed_Vehicles(String gPRIX_Allowed_Vehicles) {
        this.gPRIX_Allowed_Vehicles = gPRIX_Allowed_Vehicles;
    }

    @JsonProperty("GPRIX CrashRecovery")
    public int getGPRIX_CrashRecovery() {
        return gPRIX_CrashRecovery;
    }

    @JsonProperty("GPRIX CrashRecovery")
    public void setGPRIX_CrashRecovery(int gPRIX_CrashRecovery) {
        this.gPRIX_CrashRecovery = gPRIX_CrashRecovery;
    }

    @JsonProperty("GPRIX CrashRecovery#")
    public String getGPRIX_CrashRecovery_() {
        return gPRIX_CrashRecovery_;
    }

    @JsonProperty("GPRIX CrashRecovery#")
    public void setGPRIX_CrashRecovery_(String gPRIX_CrashRecovery_) {
        this.gPRIX_CrashRecovery_ = gPRIX_CrashRecovery_;
    }

    @JsonProperty("GPRIX Damage Multiplier")
    public int getGPRIX_Damage_Multiplier() {
        return gPRIX_Damage_Multiplier;
    }

    @JsonProperty("GPRIX Damage Multiplier")
    public void setGPRIX_Damage_Multiplier(int gPRIX_Damage_Multiplier) {
        this.gPRIX_Damage_Multiplier = gPRIX_Damage_Multiplier;
    }

    @JsonProperty("GPRIX Damage Multiplier#")
    public String getGPRIX_Damage_Multiplier_() {
        return gPRIX_Damage_Multiplier_;
    }

    @JsonProperty("GPRIX Damage Multiplier#")
    public void setGPRIX_Damage_Multiplier_(String gPRIX_Damage_Multiplier_) {
        this.gPRIX_Damage_Multiplier_ = gPRIX_Damage_Multiplier_;
    }

    @JsonProperty("GPRIX FreeSettings")
    public int getGPRIX_FreeSettings() {
        return gPRIX_FreeSettings;
    }

    @JsonProperty("GPRIX FreeSettings")
    public void setGPRIX_FreeSettings(int gPRIX_FreeSettings) {
        this.gPRIX_FreeSettings = gPRIX_FreeSettings;
    }

    @JsonProperty("GPRIX FreeSettings#")
    public String getGPRIX_FreeSettings_() {
        return gPRIX_FreeSettings_;
    }

    @JsonProperty("GPRIX FreeSettings#")
    public void setGPRIX_FreeSettings_(String gPRIX_FreeSettings_) {
        this.gPRIX_FreeSettings_ = gPRIX_FreeSettings_;
    }

    @JsonProperty("GPRIX Fuel Consumption Multiplier")
    public int getGPRIX_Fuel_Consumption_Multiplier() {
        return gPRIX_Fuel_Consumption_Multiplier;
    }

    @JsonProperty("GPRIX Fuel Consumption Multiplier")
    public void setGPRIX_Fuel_Consumption_Multiplier(int gPRIX_Fuel_Consumption_Multiplier) {
        this.gPRIX_Fuel_Consumption_Multiplier = gPRIX_Fuel_Consumption_Multiplier;
    }

    @JsonProperty("GPRIX Opponents")
    public int getGPRIX_Opponents() {
        return gPRIX_Opponents;
    }

    @JsonProperty("GPRIX Opponents")
    public void setGPRIX_Opponents(int gPRIX_Opponents) {
        this.gPRIX_Opponents = gPRIX_Opponents;
    }

    @JsonProperty("GPRIX Race Finish Criteria")
    public int getGPRIX_Race_Finish_Criteria() {
        return gPRIX_Race_Finish_Criteria;
    }

    @JsonProperty("GPRIX Race Finish Criteria")
    public void setGPRIX_Race_Finish_Criteria(int gPRIX_Race_Finish_Criteria) {
        this.gPRIX_Race_Finish_Criteria = gPRIX_Race_Finish_Criteria;
    }

    @JsonProperty("GPRIX Race Finish Criteria#")
    public String getGPRIX_Race_Finish_Criteria_() {
        return gPRIX_Race_Finish_Criteria_;
    }

    @JsonProperty("GPRIX Race Finish Criteria#")
    public void setGPRIX_Race_Finish_Criteria_(String gPRIX_Race_Finish_Criteria_) {
        this.gPRIX_Race_Finish_Criteria_ = gPRIX_Race_Finish_Criteria_;
    }

    @JsonProperty("GPRIX Race Laps")
    public int getGPRIX_Race_Laps() {
        return gPRIX_Race_Laps;
    }

    @JsonProperty("GPRIX Race Laps")
    public void setGPRIX_Race_Laps(int gPRIX_Race_Laps) {
        this.gPRIX_Race_Laps = gPRIX_Race_Laps;
    }

    @JsonProperty("GPRIX Race Length")
    public float getGPRIX_Race_Length() {
        return gPRIX_Race_Length;
    }

    @JsonProperty("GPRIX Race Length")
    public void setGPRIX_Race_Length(float gPRIX_Race_Length) {
        this.gPRIX_Race_Length = gPRIX_Race_Length;
    }

    @JsonProperty("GPRIX Race Time")
    public int getGPRIX_Race_Time() {
        return gPRIX_Race_Time;
    }

    @JsonProperty("GPRIX Race Time")
    public void setGPRIX_Race_Time(int gPRIX_Race_Time) {
        this.gPRIX_Race_Time = gPRIX_Race_Time;
    }

    @JsonProperty("GPRIX Race Time#")
    public String getGPRIX_Race_Time_() {
        return gPRIX_Race_Time_;
    }

    @JsonProperty("GPRIX Race Time#")
    public void setGPRIX_Race_Time_(String gPRIX_Race_Time_) {
        this.gPRIX_Race_Time_ = gPRIX_Race_Time_;
    }

    @JsonProperty("GPRIX Speed Compensation")
    public int getGPRIX_Speed_Compensation() {
        return gPRIX_Speed_Compensation;
    }

    @JsonProperty("GPRIX Speed Compensation")
    public void setGPRIX_Speed_Compensation(int gPRIX_Speed_Compensation) {
        this.gPRIX_Speed_Compensation = gPRIX_Speed_Compensation;
    }

    @JsonProperty("GPRIX Speed Compensation#")
    public String getGPRIX_Speed_Compensation_() {
        return gPRIX_Speed_Compensation_;
    }

    @JsonProperty("GPRIX Speed Compensation#")
    public void setGPRIX_Speed_Compensation_(String gPRIX_Speed_Compensation_) {
        this.gPRIX_Speed_Compensation_ = gPRIX_Speed_Compensation_;
    }

    @JsonProperty("GPRIX Tire Wear Multiplier")
    public int getGPRIX_Tire_Wear_Multiplier() {
        return gPRIX_Tire_Wear_Multiplier;
    }

    @JsonProperty("GPRIX Tire Wear Multiplier")
    public void setGPRIX_Tire_Wear_Multiplier(int gPRIX_Tire_Wear_Multiplier) {
        this.gPRIX_Tire_Wear_Multiplier = gPRIX_Tire_Wear_Multiplier;
    }

    @JsonProperty("Ghost AI")
    public int getGhost_AI() {
        return ghost_AI;
    }

    @JsonProperty("Ghost AI")
    public void setGhost_AI(int ghost_AI) {
        this.ghost_AI = ghost_AI;
    }

    @JsonProperty("Ghost AI#")
    public String getGhost_AI_() {
        return ghost_AI_;
    }

    @JsonProperty("Ghost AI#")
    public void setGhost_AI_(String ghost_AI_) {
        this.ghost_AI_ = ghost_AI_;
    }

    @JsonProperty("Horizontal Tire Temps")
    public boolean isHorizontal_Tire_Temps() {
        return horizontal_Tire_Temps;
    }

    @JsonProperty("Horizontal Tire Temps")
    public void setHorizontal_Tire_Temps(boolean horizontal_Tire_Temps) {
        this.horizontal_Tire_Temps = horizontal_Tire_Temps;
    }

    @JsonProperty("Horizontal Tire Temps#")
    public String getHorizontal_Tire_Temps_() {
        return horizontal_Tire_Temps_;
    }

    @JsonProperty("Horizontal Tire Temps#")
    public void setHorizontal_Tire_Temps_(String horizontal_Tire_Temps_) {
        this.horizontal_Tire_Temps_ = horizontal_Tire_Temps_;
    }

    @JsonProperty("Inactive Sleep Time")
    public int getInactive_Sleep_Time() {
        return inactive_Sleep_Time;
    }

    @JsonProperty("Inactive Sleep Time")
    public void setInactive_Sleep_Time(int inactive_Sleep_Time) {
        this.inactive_Sleep_Time = inactive_Sleep_Time;
    }

    @JsonProperty("Inactive Sleep Time#")
    public String getInactive_Sleep_Time_() {
        return inactive_Sleep_Time_;
    }

    @JsonProperty("Inactive Sleep Time#")
    public void setInactive_Sleep_Time_(String inactive_Sleep_Time_) {
        this.inactive_Sleep_Time_ = inactive_Sleep_Time_;
    }

    @JsonProperty("Instant Replay Length")
    public int getInstant_Replay_Length() {
        return instant_Replay_Length;
    }

    @JsonProperty("Instant Replay Length")
    public void setInstant_Replay_Length(int instant_Replay_Length) {
        this.instant_Replay_Length = instant_Replay_Length;
    }

    @JsonProperty("Keep Received Setups")
    public int getKeep_Received_Setups() {
        return keep_Received_Setups;
    }

    @JsonProperty("Keep Received Setups")
    public void setKeep_Received_Setups(int keep_Received_Setups) {
        this.keep_Received_Setups = keep_Received_Setups;
    }

    @JsonProperty("Keep Received Setups#")
    public String getKeep_Received_Setups_() {
        return keep_Received_Setups_;
    }

    @JsonProperty("Keep Received Setups#")
    public void setKeep_Received_Setups_(String keep_Received_Setups_) {
        this.keep_Received_Setups_ = keep_Received_Setups_;
    }

    @JsonProperty("MULTI AI Driver Strength")
    public int getMULTI_AI_Driver_Strength() {
        return mULTI_AI_Driver_Strength;
    }

    @JsonProperty("MULTI AI Driver Strength")
    public void setMULTI_AI_Driver_Strength(int mULTI_AI_Driver_Strength) {
        this.mULTI_AI_Driver_Strength = mULTI_AI_Driver_Strength;
    }

    @JsonProperty("MULTI Allowed Vehicles")
    public String getMULTI_Allowed_Vehicles() {
        return mULTI_Allowed_Vehicles;
    }

    @JsonProperty("MULTI Allowed Vehicles")
    public void setMULTI_Allowed_Vehicles(String mULTI_Allowed_Vehicles) {
        this.mULTI_Allowed_Vehicles = mULTI_Allowed_Vehicles;
    }

    @JsonProperty("MULTI CrashRecovery")
    public int getMULTI_CrashRecovery() {
        return mULTI_CrashRecovery;
    }

    @JsonProperty("MULTI CrashRecovery")
    public void setMULTI_CrashRecovery(int mULTI_CrashRecovery) {
        this.mULTI_CrashRecovery = mULTI_CrashRecovery;
    }

    @JsonProperty("MULTI Damage Multiplier")
    public int getMULTI_Damage_Multiplier() {
        return mULTI_Damage_Multiplier;
    }

    @JsonProperty("MULTI Damage Multiplier")
    public void setMULTI_Damage_Multiplier(int mULTI_Damage_Multiplier) {
        this.mULTI_Damage_Multiplier = mULTI_Damage_Multiplier;
    }

    @JsonProperty("MULTI FreeSettings")
    public int getMULTI_FreeSettings() {
        return mULTI_FreeSettings;
    }

    @JsonProperty("MULTI FreeSettings")
    public void setMULTI_FreeSettings(int mULTI_FreeSettings) {
        this.mULTI_FreeSettings = mULTI_FreeSettings;
    }

    @JsonProperty("MULTI Fuel Consumption Multiplier")
    public int getMULTI_Fuel_Consumption_Multiplier() {
        return mULTI_Fuel_Consumption_Multiplier;
    }

    @JsonProperty("MULTI Fuel Consumption Multiplier")
    public void setMULTI_Fuel_Consumption_Multiplier(int mULTI_Fuel_Consumption_Multiplier) {
        this.mULTI_Fuel_Consumption_Multiplier = mULTI_Fuel_Consumption_Multiplier;
    }

    @JsonProperty("MULTI Opponents")
    public int getMULTI_Opponents() {
        return mULTI_Opponents;
    }

    @JsonProperty("MULTI Opponents")
    public void setMULTI_Opponents(int mULTI_Opponents) {
        this.mULTI_Opponents = mULTI_Opponents;
    }

    @JsonProperty("MULTI Race Finish Criteria")
    public int getMULTI_Race_Finish_Criteria() {
        return mULTI_Race_Finish_Criteria;
    }

    @JsonProperty("MULTI Race Finish Criteria")
    public void setMULTI_Race_Finish_Criteria(int mULTI_Race_Finish_Criteria) {
        this.mULTI_Race_Finish_Criteria = mULTI_Race_Finish_Criteria;
    }

    @JsonProperty("MULTI Race Laps")
    public int getMULTI_Race_Laps() {
        return mULTI_Race_Laps;
    }

    @JsonProperty("MULTI Race Laps")
    public void setMULTI_Race_Laps(int mULTI_Race_Laps) {
        this.mULTI_Race_Laps = mULTI_Race_Laps;
    }

    @JsonProperty("MULTI Race Length")
    public float getMULTI_Race_Length() {
        return mULTI_Race_Length;
    }

    @JsonProperty("MULTI Race Length")
    public void setMULTI_Race_Length(float mULTI_Race_Length) {
        this.mULTI_Race_Length = mULTI_Race_Length;
    }

    @JsonProperty("MULTI Race Time")
    public int getMULTI_Race_Time() {
        return mULTI_Race_Time;
    }

    @JsonProperty("MULTI Race Time")
    public void setMULTI_Race_Time(int mULTI_Race_Time) {
        this.mULTI_Race_Time = mULTI_Race_Time;
    }

    @JsonProperty("MULTI Speed Compensation")
    public int getMULTI_Speed_Compensation() {
        return mULTI_Speed_Compensation;
    }

    @JsonProperty("MULTI Speed Compensation")
    public void setMULTI_Speed_Compensation(int mULTI_Speed_Compensation) {
        this.mULTI_Speed_Compensation = mULTI_Speed_Compensation;
    }

    @JsonProperty("MULTI Tire Wear Multiplier")
    public int getMULTI_Tire_Wear_Multiplier() {
        return mULTI_Tire_Wear_Multiplier;
    }

    @JsonProperty("MULTI Tire Wear Multiplier")
    public void setMULTI_Tire_Wear_Multiplier(int mULTI_Tire_Wear_Multiplier) {
        this.mULTI_Tire_Wear_Multiplier = mULTI_Tire_Wear_Multiplier;
    }

    @JsonProperty("Measurement Units")
    public int getMeasurement_Units() {
        return measurement_Units;
    }

    @JsonProperty("Measurement Units")
    public void setMeasurement_Units(int measurement_Units) {
        this.measurement_Units = measurement_Units;
    }

    @JsonProperty("Measurement Units#")
    public String getMeasurement_Units_() {
        return measurement_Units_;
    }

    @JsonProperty("Measurement Units#")
    public void setMeasurement_Units_(String measurement_Units_) {
        this.measurement_Units_ = measurement_Units_;
    }

    @JsonProperty("Message Center Detail")
    public int getMessage_Center_Detail() {
        return message_Center_Detail;
    }

    @JsonProperty("Message Center Detail")
    public void setMessage_Center_Detail(int message_Center_Detail) {
        this.message_Center_Detail = message_Center_Detail;
    }

    @JsonProperty("Miscellaneous")
    public int getMiscellaneous() {
        return miscellaneous;
    }

    @JsonProperty("Miscellaneous")
    public void setMiscellaneous(int miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    @JsonProperty("Monitor AI Postfix")
    public String getMonitor_AI_Postfix() {
        return monitor_AI_Postfix;
    }

    @JsonProperty("Monitor AI Postfix")
    public void setMonitor_AI_Postfix(String monitor_AI_Postfix) {
        this.monitor_AI_Postfix = monitor_AI_Postfix;
    }

    @JsonProperty("Monitor AI Postfix#")
    public String getMonitor_AI_Postfix_() {
        return monitor_AI_Postfix_;
    }

    @JsonProperty("Monitor AI Postfix#")
    public void setMonitor_AI_Postfix_(String monitor_AI_Postfix_) {
        this.monitor_AI_Postfix_ = monitor_AI_Postfix_;
    }

    @JsonProperty("Monitor Admin Postfix")
    public String getMonitor_Admin_Postfix() {
        return monitor_Admin_Postfix;
    }

    @JsonProperty("Monitor Admin Postfix")
    public void setMonitor_Admin_Postfix(String monitor_Admin_Postfix) {
        this.monitor_Admin_Postfix = monitor_Admin_Postfix;
    }

    @JsonProperty("Monitor Admin Postfix#")
    public String getMonitor_Admin_Postfix_() {
        return monitor_Admin_Postfix_;
    }

    @JsonProperty("Monitor Admin Postfix#")
    public void setMonitor_Admin_Postfix_(String monitor_Admin_Postfix_) {
        this.monitor_Admin_Postfix_ = monitor_Admin_Postfix_;
    }

    @JsonProperty("Monitor Auto Replay")
    public boolean isMonitor_Auto_Replay() {
        return monitor_Auto_Replay;
    }

    @JsonProperty("Monitor Auto Replay")
    public void setMonitor_Auto_Replay(boolean monitor_Auto_Replay) {
        this.monitor_Auto_Replay = monitor_Auto_Replay;
    }

    @JsonProperty("Monitor Auto Replay#")
    public String getMonitor_Auto_Replay_() {
        return monitor_Auto_Replay_;
    }

    @JsonProperty("Monitor Auto Replay#")
    public void setMonitor_Auto_Replay_(String monitor_Auto_Replay_) {
        this.monitor_Auto_Replay_ = monitor_Auto_Replay_;
    }

    @JsonProperty("Multi-session Results")
    public boolean isMulti_session_Results() {
        return multi_session_Results;
    }

    @JsonProperty("Multi-session Results")
    public void setMulti_session_Results(boolean multi_session_Results) {
        this.multi_session_Results = multi_session_Results;
    }

    @JsonProperty("Multi-session Results#")
    public String getMulti_session_Results_() {
        return multi_session_Results_;
    }

    @JsonProperty("Multi-session Results#")
    public void setMulti_session_Results_(String multi_session_Results_) {
        this.multi_session_Results_ = multi_session_Results_;
    }

    @JsonProperty("Number Race Results")
    public int getNumber_Race_Results() {
        return number_Race_Results;
    }

    @JsonProperty("Number Race Results")
    public void setNumber_Race_Results(int number_Race_Results) {
        this.number_Race_Results = number_Race_Results;
    }

    @JsonProperty("Number Race Results#")
    public String getNumber_Race_Results_() {
        return number_Race_Results_;
    }

    @JsonProperty("Number Race Results#")
    public void setNumber_Race_Results_(String number_Race_Results_) {
        this.number_Race_Results_ = number_Race_Results_;
    }

    @JsonProperty("Number Track Replays")
    public int getNumber_Track_Replays() {
        return number_Track_Replays;
    }

    @JsonProperty("Number Track Replays")
    public void setNumber_Track_Replays(int number_Track_Replays) {
        this.number_Track_Replays = number_Track_Replays;
    }

    @JsonProperty("Number Track Replays#")
    public String getNumber_Track_Replays_() {
        return number_Track_Replays_;
    }

    @JsonProperty("Number Track Replays#")
    public void setNumber_Track_Replays_(String number_Track_Replays_) {
        this.number_Track_Replays_ = number_Track_Replays_;
    }

    @JsonProperty("One Lap To Go Warning")
    public int getOne_Lap_To_Go_Warning() {
        return one_Lap_To_Go_Warning;
    }

    @JsonProperty("One Lap To Go Warning")
    public void setOne_Lap_To_Go_Warning(int one_Lap_To_Go_Warning) {
        this.one_Lap_To_Go_Warning = one_Lap_To_Go_Warning;
    }

    @JsonProperty("One Lap To Go Warning#")
    public String getOne_Lap_To_Go_Warning_() {
        return one_Lap_To_Go_Warning_;
    }

    @JsonProperty("One Lap To Go Warning#")
    public void setOne_Lap_To_Go_Warning_(String one_Lap_To_Go_Warning_) {
        this.one_Lap_To_Go_Warning_ = one_Lap_To_Go_Warning_;
    }

    @JsonProperty("Pause If Focus Lost")
    public boolean isPause_If_Focus_Lost() {
        return pause_If_Focus_Lost;
    }

    @JsonProperty("Pause If Focus Lost")
    public void setPause_If_Focus_Lost(boolean pause_If_Focus_Lost) {
        this.pause_If_Focus_Lost = pause_If_Focus_Lost;
    }

    @JsonProperty("Pause If Focus Lost#")
    public String getPause_If_Focus_Lost_() {
        return pause_If_Focus_Lost_;
    }

    @JsonProperty("Pause If Focus Lost#")
    public void setPause_If_Focus_Lost_(String pause_If_Focus_Lost_) {
        this.pause_If_Focus_Lost_ = pause_If_Focus_Lost_;
    }

    @JsonProperty("Pitstop Description")
    public boolean isPitstop_Description() {
        return pitstop_Description;
    }

    @JsonProperty("Pitstop Description")
    public void setPitstop_Description(boolean pitstop_Description) {
        this.pitstop_Description = pitstop_Description;
    }

    @JsonProperty("Pitstop Description#")
    public String getPitstop_Description_() {
        return pitstop_Description_;
    }

    @JsonProperty("Pitstop Description#")
    public void setPitstop_Description_(String pitstop_Description_) {
        this.pitstop_Description_ = pitstop_Description_;
    }

    @JsonProperty("Play Movies")
    public int getPlay_Movies() {
        return play_Movies;
    }

    @JsonProperty("Play Movies")
    public void setPlay_Movies(int play_Movies) {
        this.play_Movies = play_Movies;
    }

    @JsonProperty("RPLAY AI Driver Strength")
    public int getRPLAY_AI_Driver_Strength() {
        return rPLAY_AI_Driver_Strength;
    }

    @JsonProperty("RPLAY AI Driver Strength")
    public void setRPLAY_AI_Driver_Strength(int rPLAY_AI_Driver_Strength) {
        this.rPLAY_AI_Driver_Strength = rPLAY_AI_Driver_Strength;
    }

    @JsonProperty("RPLAY Allowed Vehicles")
    public String getRPLAY_Allowed_Vehicles() {
        return rPLAY_Allowed_Vehicles;
    }

    @JsonProperty("RPLAY Allowed Vehicles")
    public void setRPLAY_Allowed_Vehicles(String rPLAY_Allowed_Vehicles) {
        this.rPLAY_Allowed_Vehicles = rPLAY_Allowed_Vehicles;
    }

    @JsonProperty("RPLAY CrashRecovery")
    public int getRPLAY_CrashRecovery() {
        return rPLAY_CrashRecovery;
    }

    @JsonProperty("RPLAY CrashRecovery")
    public void setRPLAY_CrashRecovery(int rPLAY_CrashRecovery) {
        this.rPLAY_CrashRecovery = rPLAY_CrashRecovery;
    }

    @JsonProperty("RPLAY Damage Multiplier")
    public int getRPLAY_Damage_Multiplier() {
        return rPLAY_Damage_Multiplier;
    }

    @JsonProperty("RPLAY Damage Multiplier")
    public void setRPLAY_Damage_Multiplier(int rPLAY_Damage_Multiplier) {
        this.rPLAY_Damage_Multiplier = rPLAY_Damage_Multiplier;
    }

    @JsonProperty("RPLAY FreeSettings")
    public int getRPLAY_FreeSettings() {
        return rPLAY_FreeSettings;
    }

    @JsonProperty("RPLAY FreeSettings")
    public void setRPLAY_FreeSettings(int rPLAY_FreeSettings) {
        this.rPLAY_FreeSettings = rPLAY_FreeSettings;
    }

    @JsonProperty("RPLAY Fuel Consumption Multiplier")
    public int getRPLAY_Fuel_Consumption_Multiplier() {
        return rPLAY_Fuel_Consumption_Multiplier;
    }

    @JsonProperty("RPLAY Fuel Consumption Multiplier")
    public void setRPLAY_Fuel_Consumption_Multiplier(int rPLAY_Fuel_Consumption_Multiplier) {
        this.rPLAY_Fuel_Consumption_Multiplier = rPLAY_Fuel_Consumption_Multiplier;
    }

    @JsonProperty("RPLAY Opponents")
    public int getRPLAY_Opponents() {
        return rPLAY_Opponents;
    }

    @JsonProperty("RPLAY Opponents")
    public void setRPLAY_Opponents(int rPLAY_Opponents) {
        this.rPLAY_Opponents = rPLAY_Opponents;
    }

    @JsonProperty("RPLAY Race Finish Criteria")
    public int getRPLAY_Race_Finish_Criteria() {
        return rPLAY_Race_Finish_Criteria;
    }

    @JsonProperty("RPLAY Race Finish Criteria")
    public void setRPLAY_Race_Finish_Criteria(int rPLAY_Race_Finish_Criteria) {
        this.rPLAY_Race_Finish_Criteria = rPLAY_Race_Finish_Criteria;
    }

    @JsonProperty("RPLAY Race Laps")
    public int getRPLAY_Race_Laps() {
        return rPLAY_Race_Laps;
    }

    @JsonProperty("RPLAY Race Laps")
    public void setRPLAY_Race_Laps(int rPLAY_Race_Laps) {
        this.rPLAY_Race_Laps = rPLAY_Race_Laps;
    }

    @JsonProperty("RPLAY Race Length")
    public float getRPLAY_Race_Length() {
        return rPLAY_Race_Length;
    }

    @JsonProperty("RPLAY Race Length")
    public void setRPLAY_Race_Length(float rPLAY_Race_Length) {
        this.rPLAY_Race_Length = rPLAY_Race_Length;
    }

    @JsonProperty("RPLAY Race Time")
    public int getRPLAY_Race_Time() {
        return rPLAY_Race_Time;
    }

    @JsonProperty("RPLAY Race Time")
    public void setRPLAY_Race_Time(int rPLAY_Race_Time) {
        this.rPLAY_Race_Time = rPLAY_Race_Time;
    }

    @JsonProperty("RPLAY Speed Compensation")
    public int getRPLAY_Speed_Compensation() {
        return rPLAY_Speed_Compensation;
    }

    @JsonProperty("RPLAY Speed Compensation")
    public void setRPLAY_Speed_Compensation(int rPLAY_Speed_Compensation) {
        this.rPLAY_Speed_Compensation = rPLAY_Speed_Compensation;
    }

    @JsonProperty("RPLAY Tire Wear Multiplier")
    public int getRPLAY_Tire_Wear_Multiplier() {
        return rPLAY_Tire_Wear_Multiplier;
    }

    @JsonProperty("RPLAY Tire Wear Multiplier")
    public void setRPLAY_Tire_Wear_Multiplier(int rPLAY_Tire_Wear_Multiplier) {
        this.rPLAY_Tire_Wear_Multiplier = rPLAY_Tire_Wear_Multiplier;
    }

    @JsonProperty("Race Stint Offset")
    public int getRace_Stint_Offset() {
        return race_Stint_Offset;
    }

    @JsonProperty("Race Stint Offset")
    public void setRace_Stint_Offset(int race_Stint_Offset) {
        this.race_Stint_Offset = race_Stint_Offset;
    }

    @JsonProperty("Race Stint Offset#")
    public String getRace_Stint_Offset_() {
        return race_Stint_Offset_;
    }

    @JsonProperty("Race Stint Offset#")
    public void setRace_Stint_Offset_(String race_Stint_Offset_) {
        this.race_Stint_Offset_ = race_Stint_Offset_;
    }

    @JsonProperty("RealTimeLogging")
    public int getRealTimeLogging() {
        return realTimeLogging;
    }

    @JsonProperty("RealTimeLogging")
    public void setRealTimeLogging(int realTimeLogging) {
        this.realTimeLogging = realTimeLogging;
    }

    @JsonProperty("RealTimeLogging#")
    public String getRealTimeLogging_() {
        return realTimeLogging_;
    }

    @JsonProperty("RealTimeLogging#")
    public void setRealTimeLogging_(String realTimeLogging_) {
        this.realTimeLogging_ = realTimeLogging_;
    }

    @JsonProperty("Realtime Splits")
    public boolean isRealtime_Splits() {
        return realtime_Splits;
    }

    @JsonProperty("Realtime Splits")
    public void setRealtime_Splits(boolean realtime_Splits) {
        this.realtime_Splits = realtime_Splits;
    }

    @JsonProperty("Realtime Splits#")
    public String getRealtime_Splits_() {
        return realtime_Splits_;
    }

    @JsonProperty("Realtime Splits#")
    public void setRealtime_Splits_(String realtime_Splits_) {
        this.realtime_Splits_ = realtime_Splits_;
    }

    @JsonProperty("Record Hotlaps")
    public int getRecord_Hotlaps() {
        return record_Hotlaps;
    }

    @JsonProperty("Record Hotlaps")
    public void setRecord_Hotlaps(int record_Hotlaps) {
        this.record_Hotlaps = record_Hotlaps;
    }

    @JsonProperty("Record Hotlaps#")
    public String getRecord_Hotlaps_() {
        return record_Hotlaps_;
    }

    @JsonProperty("Record Hotlaps#")
    public void setRecord_Hotlaps_(String record_Hotlaps_) {
        this.record_Hotlaps_ = record_Hotlaps_;
    }

    @JsonProperty("Record Replays")
    public int getRecord_Replays() {
        return record_Replays;
    }

    @JsonProperty("Record Replays")
    public void setRecord_Replays(int record_Replays) {
        this.record_Replays = record_Replays;
    }

    @JsonProperty("Record Replays#")
    public String getRecord_Replays_() {
        return record_Replays_;
    }

    @JsonProperty("Record Replays#")
    public void setRecord_Replays_(String record_Replays_) {
        this.record_Replays_ = record_Replays_;
    }

    @JsonProperty("Record To Memory")
    public boolean isRecord_To_Memory() {
        return record_To_Memory;
    }

    @JsonProperty("Record To Memory")
    public void setRecord_To_Memory(boolean record_To_Memory) {
        this.record_To_Memory = record_To_Memory;
    }

    @JsonProperty("Record To Memory#")
    public String getRecord_To_Memory_() {
        return record_To_Memory_;
    }

    @JsonProperty("Record To Memory#")
    public void setRecord_To_Memory_(String record_To_Memory_) {
        this.record_To_Memory_ = record_To_Memory_;
    }

    @JsonProperty("Relative Fuel Strategy")
    public boolean isRelative_Fuel_Strategy() {
        return relative_Fuel_Strategy;
    }

    @JsonProperty("Relative Fuel Strategy")
    public void setRelative_Fuel_Strategy(boolean relative_Fuel_Strategy) {
        this.relative_Fuel_Strategy = relative_Fuel_Strategy;
    }

    @JsonProperty("Relative Fuel Strategy#")
    public String getRelative_Fuel_Strategy_() {
        return relative_Fuel_Strategy_;
    }

    @JsonProperty("Relative Fuel Strategy#")
    public void setRelative_Fuel_Strategy_(String relative_Fuel_Strategy_) {
        this.relative_Fuel_Strategy_ = relative_Fuel_Strategy_;
    }

    @JsonProperty("Relevant Setups Only")
    public int getRelevant_Setups_Only() {
        return relevant_Setups_Only;
    }

    @JsonProperty("Relevant Setups Only")
    public void setRelevant_Setups_Only(int relevant_Setups_Only) {
        this.relevant_Setups_Only = relevant_Setups_Only;
    }

    @JsonProperty("Relevant Setups Only#")
    public String getRelevant_Setups_Only_() {
        return relevant_Setups_Only_;
    }

    @JsonProperty("Relevant Setups Only#")
    public void setRelevant_Setups_Only_(String relevant_Setups_Only_) {
        this.relevant_Setups_Only_ = relevant_Setups_Only_;
    }

    @JsonProperty("Replay Base Fidelity")
    public int getReplay_Base_Fidelity() {
        return replay_Base_Fidelity;
    }

    @JsonProperty("Replay Base Fidelity")
    public void setReplay_Base_Fidelity(int replay_Base_Fidelity) {
        this.replay_Base_Fidelity = replay_Base_Fidelity;
    }

    @JsonProperty("Save All Replay Sessions")
    public boolean isSave_All_Replay_Sessions() {
        return save_All_Replay_Sessions;
    }

    @JsonProperty("Save All Replay Sessions")
    public void setSave_All_Replay_Sessions(boolean save_All_Replay_Sessions) {
        this.save_All_Replay_Sessions = save_All_Replay_Sessions;
    }

    @JsonProperty("Save All Replay Sessions#")
    public String getSave_All_Replay_Sessions_() {
        return save_All_Replay_Sessions_;
    }

    @JsonProperty("Save All Replay Sessions#")
    public void setSave_All_Replay_Sessions_(String save_All_Replay_Sessions_) {
        this.save_All_Replay_Sessions_ = save_All_Replay_Sessions_;
    }

    @JsonProperty("Settings Type")
    public int getSettings_Type() {
        return settings_Type;
    }

    @JsonProperty("Settings Type")
    public void setSettings_Type(int settings_Type) {
        this.settings_Type = settings_Type;
    }

    @JsonProperty("Show Extra Lap")
    public int getShow_Extra_Lap() {
        return show_Extra_Lap;
    }

    @JsonProperty("Show Extra Lap")
    public void setShow_Extra_Lap(int show_Extra_Lap) {
        this.show_Extra_Lap = show_Extra_Lap;
    }

    @JsonProperty("Show Extra Lap#")
    public String getShow_Extra_Lap_() {
        return show_Extra_Lap_;
    }

    @JsonProperty("Show Extra Lap#")
    public void setShow_Extra_Lap_(String show_Extra_Lap_) {
        this.show_Extra_Lap_ = show_Extra_Lap_;
    }

    @JsonProperty("Smart Pitcrew")
    public boolean isSmart_Pitcrew() {
        return smart_Pitcrew;
    }

    @JsonProperty("Smart Pitcrew")
    public void setSmart_Pitcrew(boolean smart_Pitcrew) {
        this.smart_Pitcrew = smart_Pitcrew;
    }

    @JsonProperty("Smart Pitcrew#")
    public String getSmart_Pitcrew_() {
        return smart_Pitcrew_;
    }

    @JsonProperty("Smart Pitcrew#")
    public void setSmart_Pitcrew_(String smart_Pitcrew_) {
        this.smart_Pitcrew_ = smart_Pitcrew_;
    }

    @JsonProperty("Speed Comp Dist")
    public int getSpeed_Comp_Dist() {
        return speed_Comp_Dist;
    }

    @JsonProperty("Speed Comp Dist")
    public void setSpeed_Comp_Dist(int speed_Comp_Dist) {
        this.speed_Comp_Dist = speed_Comp_Dist;
    }

    @JsonProperty("Speed Comp Dist#")
    public String getSpeed_Comp_Dist_() {
        return speed_Comp_Dist_;
    }

    @JsonProperty("Speed Comp Dist#")
    public void setSpeed_Comp_Dist_(String speed_Comp_Dist_) {
        this.speed_Comp_Dist_ = speed_Comp_Dist_;
    }

    @JsonProperty("Speed Units")
    public boolean isSpeed_Units() {
        return speed_Units;
    }

    @JsonProperty("Speed Units")
    public void setSpeed_Units(boolean speed_Units) {
        this.speed_Units = speed_Units;
    }

    @JsonProperty("Speed Units#")
    public String getSpeed_Units_() {
        return speed_Units_;
    }

    @JsonProperty("Speed Units#")
    public void setSpeed_Units_(String speed_Units_) {
        this.speed_Units_ = speed_Units_;
    }

    @JsonProperty("Spotter Behind")
    public int getSpotter_Behind() {
        return spotter_Behind;
    }

    @JsonProperty("Spotter Behind")
    public void setSpotter_Behind(int spotter_Behind) {
        this.spotter_Behind = spotter_Behind;
    }

    @JsonProperty("Spotter Behind#")
    public String getSpotter_Behind_() {
        return spotter_Behind_;
    }

    @JsonProperty("Spotter Behind#")
    public void setSpotter_Behind_(String spotter_Behind_) {
        this.spotter_Behind_ = spotter_Behind_;
    }

    @JsonProperty("Spotter Detail")
    public int getSpotter_Detail() {
        return spotter_Detail;
    }

    @JsonProperty("Spotter Detail")
    public void setSpotter_Detail(int spotter_Detail) {
        this.spotter_Detail = spotter_Detail;
    }

    @JsonProperty("Spotter Detail#")
    public String getSpotter_Detail_() {
        return spotter_Detail_;
    }

    @JsonProperty("Spotter Detail#")
    public void setSpotter_Detail_(String spotter_Detail_) {
        this.spotter_Detail_ = spotter_Detail_;
    }

    @JsonProperty("Spotter Laptimes")
    public int getSpotter_Laptimes() {
        return spotter_Laptimes;
    }

    @JsonProperty("Spotter Laptimes")
    public void setSpotter_Laptimes(int spotter_Laptimes) {
        this.spotter_Laptimes = spotter_Laptimes;
    }

    @JsonProperty("Spotter Laptimes#")
    public String getSpotter_Laptimes_() {
        return spotter_Laptimes_;
    }

    @JsonProperty("Spotter Laptimes#")
    public void setSpotter_Laptimes_(String spotter_Laptimes_) {
        this.spotter_Laptimes_ = spotter_Laptimes_;
    }

    @JsonProperty("Standings Func")
    public int getStandings_Func() {
        return standings_Func;
    }

    @JsonProperty("Standings Func")
    public void setStandings_Func(int standings_Func) {
        this.standings_Func = standings_Func;
    }

    @JsonProperty("Standings Func#")
    public String getStandings_Func_() {
        return standings_Func_;
    }

    @JsonProperty("Standings Func#")
    public void setStandings_Func_(String standings_Func_) {
        this.standings_Func_ = standings_Func_;
    }

    @JsonProperty("Starting Pos")
    public int getStarting_Pos() {
        return starting_Pos;
    }

    @JsonProperty("Starting Pos")
    public void setStarting_Pos(int starting_Pos) {
        this.starting_Pos = starting_Pos;
    }

    @JsonProperty("Starting Pos#")
    public String getStarting_Pos_() {
        return starting_Pos_;
    }

    @JsonProperty("Starting Pos#")
    public void setStarting_Pos_(String starting_Pos_) {
        this.starting_Pos_ = starting_Pos_;
    }

    @JsonProperty("Temporary Replay Keys")
    public boolean isTemporary_Replay_Keys() {
        return temporary_Replay_Keys;
    }

    @JsonProperty("Temporary Replay Keys")
    public void setTemporary_Replay_Keys(boolean temporary_Replay_Keys) {
        this.temporary_Replay_Keys = temporary_Replay_Keys;
    }

    @JsonProperty("Temporary Replay Keys#")
    public String getTemporary_Replay_Keys_() {
        return temporary_Replay_Keys_;
    }

    @JsonProperty("Temporary Replay Keys#")
    public void setTemporary_Replay_Keys_(String temporary_Replay_Keys_) {
        this.temporary_Replay_Keys_ = temporary_Replay_Keys_;
    }

    @JsonProperty("Tooltips")
    public boolean isTooltips() {
        return tooltips;
    }

    @JsonProperty("Tooltips")
    public void setTooltips(boolean tooltips) {
        this.tooltips = tooltips;
    }

    @JsonProperty("Transparent Trainer Alpha")
    public float getTransparent_Trainer_Alpha() {
        return transparent_Trainer_Alpha;
    }

    @JsonProperty("Transparent Trainer Alpha")
    public void setTransparent_Trainer_Alpha(float transparent_Trainer_Alpha) {
        this.transparent_Trainer_Alpha = transparent_Trainer_Alpha;
    }

    @JsonProperty("Transparent Trainer Alpha#")
    public String getTransparent_Trainer_Alpha_() {
        return transparent_Trainer_Alpha_;
    }

    @JsonProperty("Transparent Trainer Alpha#")
    public void setTransparent_Trainer_Alpha_(String transparent_Trainer_Alpha_) {
        this.transparent_Trainer_Alpha_ = transparent_Trainer_Alpha_;
    }

    @JsonProperty("Transparent Trainer Lap")
    public int getTransparent_Trainer_Lap() {
        return transparent_Trainer_Lap;
    }

    @JsonProperty("Transparent Trainer Lap")
    public void setTransparent_Trainer_Lap(int transparent_Trainer_Lap) {
        this.transparent_Trainer_Lap = transparent_Trainer_Lap;
    }

    @JsonProperty("Transparent Trainer Lap#")
    public String getTransparent_Trainer_Lap_() {
        return transparent_Trainer_Lap_;
    }

    @JsonProperty("Transparent Trainer Lap#")
    public void setTransparent_Trainer_Lap_(String transparent_Trainer_Lap_) {
        this.transparent_Trainer_Lap_ = transparent_Trainer_Lap_;
    }

    @JsonProperty("Transparent Trainer Lead Time")
    public float getTransparent_Trainer_Lead_Time() {
        return transparent_Trainer_Lead_Time;
    }

    @JsonProperty("Transparent Trainer Lead Time")
    public void setTransparent_Trainer_Lead_Time(float transparent_Trainer_Lead_Time) {
        this.transparent_Trainer_Lead_Time = transparent_Trainer_Lead_Time;
    }

    @JsonProperty("Transparent Trainer Lead Time#")
    public String getTransparent_Trainer_Lead_Time_() {
        return transparent_Trainer_Lead_Time_;
    }

    @JsonProperty("Transparent Trainer Lead Time#")
    public void setTransparent_Trainer_Lead_Time_(String transparent_Trainer_Lead_Time_) {
        this.transparent_Trainer_Lead_Time_ = transparent_Trainer_Lead_Time_;
    }

    @JsonProperty("Transparent Trainer Proximity")
    public int getTransparent_Trainer_Proximity() {
        return transparent_Trainer_Proximity;
    }

    @JsonProperty("Transparent Trainer Proximity")
    public void setTransparent_Trainer_Proximity(int transparent_Trainer_Proximity) {
        this.transparent_Trainer_Proximity = transparent_Trainer_Proximity;
    }

    @JsonProperty("Transparent Trainer Proximity#")
    public String getTransparent_Trainer_Proximity_() {
        return transparent_Trainer_Proximity_;
    }

    @JsonProperty("Transparent Trainer Proximity#")
    public void setTransparent_Trainer_Proximity_(String transparent_Trainer_Proximity_) {
        this.transparent_Trainer_Proximity_ = transparent_Trainer_Proximity_;
    }

    @JsonProperty("User Vehicle Data")
    public boolean isUser_Vehicle_Data() {
        return user_Vehicle_Data;
    }

    @JsonProperty("User Vehicle Data")
    public void setUser_Vehicle_Data(boolean user_Vehicle_Data) {
        this.user_Vehicle_Data = user_Vehicle_Data;
    }

    @JsonProperty("User Vehicle Data#")
    public String getUser_Vehicle_Data_() {
        return user_Vehicle_Data_;
    }

    @JsonProperty("User Vehicle Data#")
    public void setUser_Vehicle_Data_(String user_Vehicle_Data_) {
        this.user_Vehicle_Data_ = user_Vehicle_Data_;
    }

    @JsonProperty("Vehicle Removal")
    public int getVehicle_Removal() {
        return vehicle_Removal;
    }

    @JsonProperty("Vehicle Removal")
    public void setVehicle_Removal(int vehicle_Removal) {
        this.vehicle_Removal = vehicle_Removal;
    }

    @JsonProperty("Vehicle Removal#")
    public String getVehicle_Removal_() {
        return vehicle_Removal_;
    }

    @JsonProperty("Vehicle Removal#")
    public void setVehicle_Removal_(String vehicle_Removal_) {
        this.vehicle_Removal_ = vehicle_Removal_;
    }

    @JsonProperty("Wait For All Plugins To Load")
    public boolean isWait_For_All_Plugins_To_Load() {
        return wait_For_All_Plugins_To_Load;
    }

    @JsonProperty("Wait For All Plugins To Load")
    public void setWait_For_All_Plugins_To_Load(boolean wait_For_All_Plugins_To_Load) {
        this.wait_For_All_Plugins_To_Load = wait_For_All_Plugins_To_Load;
    }

    @JsonProperty("Wait For All Plugins To Load#")
    public String getWait_For_All_Plugins_To_Load_() {
        return wait_For_All_Plugins_To_Load_;
    }

    @JsonProperty("Wait For All Plugins To Load#")
    public void setWait_For_All_Plugins_To_Load_(String wait_For_All_Plugins_To_Load_) {
        this.wait_For_All_Plugins_To_Load_ = wait_For_All_Plugins_To_Load_;
    }

    @JsonProperty("practice length")
    public int getPractice_length() {
        return practice_length;
    }

    @JsonProperty("practice length")
    public void setPractice_length(int practice_length) {
        this.practice_length = practice_length;
    }

    @JsonProperty("practice length#")
    public String getPractice_length_() {
        return practice_length_;
    }

    @JsonProperty("practice length#")
    public void setPractice_length_(String practice_length_) {
        this.practice_length_ = practice_length_;
    }

    @JsonProperty("qualifying laps")
    public int getQualifying_laps() {
        return qualifying_laps;
    }

    @JsonProperty("qualifying laps")
    public void setQualifying_laps(int qualifying_laps) {
        this.qualifying_laps = qualifying_laps;
    }

    @JsonProperty("qualifying laps#")
    public String getQualifying_laps_() {
        return qualifying_laps_;
    }

    @JsonProperty("qualifying laps#")
    public void setQualifying_laps_(String qualifying_laps_) {
        this.qualifying_laps_ = qualifying_laps_;
    }

    @JsonProperty("qualifying length")
    public int getQualifying_length() {
        return qualifying_length;
    }

    @JsonProperty("qualifying length")
    public void setQualifying_length(int qualifying_length) {
        this.qualifying_length = qualifying_length;
    }

    @JsonProperty("qualifying length#")
    public String getQualifying_length_() {
        return qualifying_length_;
    }

    @JsonProperty("qualifying length#")
    public void setQualifying_length_(String qualifying_length_) {
        this.qualifying_length_ = qualifying_length_;
    }

    @JsonProperty("warmup length")
    public int getWarmup_length() {
        return warmup_length;
    }

    @JsonProperty("warmup length")
    public void setWarmup_length(int warmup_length) {
        this.warmup_length = warmup_length;
    }

    @JsonProperty("warmup length#")
    public String getWarmup_length_() {
        return warmup_length_;
    }

    @JsonProperty("warmup length#")
    public void setWarmup_length_(String warmup_length_) {
        this.warmup_length_ = warmup_length_;
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
        sb.append(GameOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aI_Aggression");
        sb.append('=');
        sb.append(this.aI_Aggression);
        sb.append(',');
        sb.append("aI_Brake_Grip_Usage");
        sb.append('=');
        sb.append(this.aI_Brake_Grip_Usage);
        sb.append(',');
        sb.append("aI_Brake_Grip_Usage_");
        sb.append('=');
        sb.append(((this.aI_Brake_Grip_Usage_ == null) ? "<null>" : this.aI_Brake_Grip_Usage_));
        sb.append(',');
        sb.append("aI_Brake_Power_Usage");
        sb.append('=');
        sb.append(this.aI_Brake_Power_Usage);
        sb.append(',');
        sb.append("aI_Brake_Power_Usage_");
        sb.append('=');
        sb.append(((this.aI_Brake_Power_Usage_ == null) ? "<null>" : this.aI_Brake_Power_Usage_));
        sb.append(',');
        sb.append("aI_Calibrate_Sample_Size");
        sb.append('=');
        sb.append(this.aI_Calibrate_Sample_Size);
        sb.append(',');
        sb.append("aI_Calibrate_Sample_Size_");
        sb.append('=');
        sb.append(((this.aI_Calibrate_Sample_Size_ == null) ? "<null>" : this.aI_Calibrate_Sample_Size_));
        sb.append(',');
        sb.append("aI_Corner_Grip_Usage");
        sb.append('=');
        sb.append(this.aI_Corner_Grip_Usage);
        sb.append(',');
        sb.append("aI_Corner_Grip_Usage_");
        sb.append('=');
        sb.append(((this.aI_Corner_Grip_Usage_ == null) ? "<null>" : this.aI_Corner_Grip_Usage_));
        sb.append(',');
        sb.append("aI_Formation_by_Position");
        sb.append('=');
        sb.append(this.aI_Formation_by_Position);
        sb.append(',');
        sb.append("aI_Formation_by_Position_");
        sb.append('=');
        sb.append(((this.aI_Formation_by_Position_ == null) ? "<null>" : this.aI_Formation_by_Position_));
        sb.append(',');
        sb.append("aI_Fuel_Mult");
        sb.append('=');
        sb.append(this.aI_Fuel_Mult);
        sb.append(',');
        sb.append("aI_Fuel_Mult_");
        sb.append('=');
        sb.append(((this.aI_Fuel_Mult_ == null) ? "<null>" : this.aI_Fuel_Mult_));
        sb.append(',');
        sb.append("aI_Limiter");
        sb.append('=');
        sb.append(this.aI_Limiter);
        sb.append(',');
        sb.append("aI_Limiter_");
        sb.append('=');
        sb.append(((this.aI_Limiter_ == null) ? "<null>" : this.aI_Limiter_));
        sb.append(',');
        sb.append("aI_Logic_Override");
        sb.append('=');
        sb.append(this.aI_Logic_Override);
        sb.append(',');
        sb.append("aI_Logic_Override_");
        sb.append('=');
        sb.append(((this.aI_Logic_Override_ == null) ? "<null>" : this.aI_Logic_Override_));
        sb.append(',');
        sb.append("aI_Mistakes");
        sb.append('=');
        sb.append(this.aI_Mistakes);
        sb.append(',');
        sb.append("aI_Mistakes_");
        sb.append('=');
        sb.append(((this.aI_Mistakes_ == null) ? "<null>" : this.aI_Mistakes_));
        sb.append(',');
        sb.append("aI_Power_Calibration");
        sb.append('=');
        sb.append(this.aI_Power_Calibration);
        sb.append(',');
        sb.append("aI_Power_Calibration_");
        sb.append('=');
        sb.append(((this.aI_Power_Calibration_ == null) ? "<null>" : this.aI_Power_Calibration_));
        sb.append(',');
        sb.append("active_Sleep_Time");
        sb.append('=');
        sb.append(this.active_Sleep_Time);
        sb.append(',');
        sb.append("active_Sleep_Time_");
        sb.append('=');
        sb.append(((this.active_Sleep_Time_ == null) ? "<null>" : this.active_Sleep_Time_));
        sb.append(',');
        sb.append("attack_Zone_AR_Time");
        sb.append('=');
        sb.append(this.attack_Zone_AR_Time);
        sb.append(',');
        sb.append("attack_Zone_AR_Time_");
        sb.append('=');
        sb.append(((this.attack_Zone_AR_Time_ == null) ? "<null>" : this.attack_Zone_AR_Time_));
        sb.append(',');
        sb.append("auto_Line_Smoothing");
        sb.append('=');
        sb.append(this.auto_Line_Smoothing);
        sb.append(',');
        sb.append("auto_Line_Smoothing_");
        sb.append('=');
        sb.append(((this.auto_Line_Smoothing_ == null) ? "<null>" : this.auto_Line_Smoothing_));
        sb.append(',');
        sb.append("auto_Skip_Garaged_Vehicles");
        sb.append('=');
        sb.append(this.auto_Skip_Garaged_Vehicles);
        sb.append(',');
        sb.append("auto_Skip_Garaged_Vehicles_");
        sb.append('=');
        sb.append(((this.auto_Skip_Garaged_Vehicles_ == null) ? "<null>" : this.auto_Skip_Garaged_Vehicles_));
        sb.append(',');
        sb.append("auto_change_Opponent_List");
        sb.append('=');
        sb.append(this.auto_change_Opponent_List);
        sb.append(',');
        sb.append("auto_change_Opponent_List_");
        sb.append('=');
        sb.append(((this.auto_change_Opponent_List_ == null) ? "<null>" : this.auto_change_Opponent_List_));
        sb.append(',');
        sb.append("autocalibrate_AI_Mode");
        sb.append('=');
        sb.append(this.autocalibrate_AI_Mode);
        sb.append(',');
        sb.append("autocalibrate_AI_Mode_");
        sb.append('=');
        sb.append(((this.autocalibrate_AI_Mode_ == null) ? "<null>" : this.autocalibrate_AI_Mode_));
        sb.append(',');
        sb.append("automatic_Pit_Menu");
        sb.append('=');
        sb.append(this.automatic_Pit_Menu);
        sb.append(',');
        sb.append("automatic_Pit_Menu_");
        sb.append('=');
        sb.append(((this.automatic_Pit_Menu_ == null) ? "<null>" : this.automatic_Pit_Menu_));
        sb.append(',');
        sb.append("basic_Display");
        sb.append('=');
        sb.append(this.basic_Display);
        sb.append(',');
        sb.append("basic_Rules");
        sb.append('=');
        sb.append(this.basic_Rules);
        sb.append(',');
        sb.append("cHAMP_AI_Driver_Strength");
        sb.append('=');
        sb.append(this.cHAMP_AI_Driver_Strength);
        sb.append(',');
        sb.append("cHAMP_Allowed_Vehicles");
        sb.append('=');
        sb.append(((this.cHAMP_Allowed_Vehicles == null) ? "<null>" : this.cHAMP_Allowed_Vehicles));
        sb.append(',');
        sb.append("cHAMP_CrashRecovery");
        sb.append('=');
        sb.append(this.cHAMP_CrashRecovery);
        sb.append(',');
        sb.append("cHAMP_Damage_Multiplier");
        sb.append('=');
        sb.append(this.cHAMP_Damage_Multiplier);
        sb.append(',');
        sb.append("cHAMP_FreeSettings");
        sb.append('=');
        sb.append(this.cHAMP_FreeSettings);
        sb.append(',');
        sb.append("cHAMP_Fuel_Consumption_Multiplier");
        sb.append('=');
        sb.append(this.cHAMP_Fuel_Consumption_Multiplier);
        sb.append(',');
        sb.append("cHAMP_Opponents");
        sb.append('=');
        sb.append(this.cHAMP_Opponents);
        sb.append(',');
        sb.append("cHAMP_Race_Finish_Criteria");
        sb.append('=');
        sb.append(this.cHAMP_Race_Finish_Criteria);
        sb.append(',');
        sb.append("cHAMP_Race_Laps");
        sb.append('=');
        sb.append(this.cHAMP_Race_Laps);
        sb.append(',');
        sb.append("cHAMP_Race_Length");
        sb.append('=');
        sb.append(this.cHAMP_Race_Length);
        sb.append(',');
        sb.append("cHAMP_Race_Time");
        sb.append('=');
        sb.append(this.cHAMP_Race_Time);
        sb.append(',');
        sb.append("cHAMP_Speed_Compensation");
        sb.append('=');
        sb.append(this.cHAMP_Speed_Compensation);
        sb.append(',');
        sb.append("cHAMP_Tire_Wear_Multiplier");
        sb.append('=');
        sb.append(this.cHAMP_Tire_Wear_Multiplier);
        sb.append(',');
        sb.append("cURNT_AI_Driver_Strength");
        sb.append('=');
        sb.append(this.cURNT_AI_Driver_Strength);
        sb.append(',');
        sb.append("cURNT_Allowed_Vehicles");
        sb.append('=');
        sb.append(((this.cURNT_Allowed_Vehicles == null) ? "<null>" : this.cURNT_Allowed_Vehicles));
        sb.append(',');
        sb.append("cURNT_CrashRecovery");
        sb.append('=');
        sb.append(this.cURNT_CrashRecovery);
        sb.append(',');
        sb.append("cURNT_Damage_Multiplier");
        sb.append('=');
        sb.append(this.cURNT_Damage_Multiplier);
        sb.append(',');
        sb.append("cURNT_FreeSettings");
        sb.append('=');
        sb.append(this.cURNT_FreeSettings);
        sb.append(',');
        sb.append("cURNT_Fuel_Consumption_Multiplier");
        sb.append('=');
        sb.append(this.cURNT_Fuel_Consumption_Multiplier);
        sb.append(',');
        sb.append("cURNT_Opponents");
        sb.append('=');
        sb.append(this.cURNT_Opponents);
        sb.append(',');
        sb.append("cURNT_Race_Finish_Criteria");
        sb.append('=');
        sb.append(this.cURNT_Race_Finish_Criteria);
        sb.append(',');
        sb.append("cURNT_Race_Laps");
        sb.append('=');
        sb.append(this.cURNT_Race_Laps);
        sb.append(',');
        sb.append("cURNT_Race_Length");
        sb.append('=');
        sb.append(this.cURNT_Race_Length);
        sb.append(',');
        sb.append("cURNT_Race_Time");
        sb.append('=');
        sb.append(this.cURNT_Race_Time);
        sb.append(',');
        sb.append("cURNT_Speed_Compensation");
        sb.append('=');
        sb.append(this.cURNT_Speed_Compensation);
        sb.append(',');
        sb.append("cURNT_Tire_Wear_Multiplier");
        sb.append('=');
        sb.append(this.cURNT_Tire_Wear_Multiplier);
        sb.append(',');
        sb.append("championship_Basic_Rules");
        sb.append('=');
        sb.append(this.championship_Basic_Rules);
        sb.append(',');
        sb.append("compress_Replay");
        sb.append('=');
        sb.append(this.compress_Replay);
        sb.append(',');
        sb.append("compress_Replay_");
        sb.append('=');
        sb.append(((this.compress_Replay_ == null) ? "<null>" : this.compress_Replay_));
        sb.append(',');
        sb.append("damper_Units");
        sb.append('=');
        sb.append(this.damper_Units);
        sb.append(',');
        sb.append("damper_Units_");
        sb.append('=');
        sb.append(((this.damper_Units_ == null) ? "<null>" : this.damper_Units_));
        sb.append(',');
        sb.append("difficulty");
        sb.append('=');
        sb.append(this.difficulty);
        sb.append(',');
        sb.append("disable_NetComm");
        sb.append('=');
        sb.append(this.disable_NetComm);
        sb.append(',');
        sb.append("disable_NetComm_");
        sb.append('=');
        sb.append(((this.disable_NetComm_ == null) ? "<null>" : this.disable_NetComm_));
        sb.append(',');
        sb.append("disable_Resume_in_Replay");
        sb.append('=');
        sb.append(this.disable_Resume_in_Replay);
        sb.append(',');
        sb.append("disable_Resume_in_Replay_");
        sb.append('=');
        sb.append(((this.disable_Resume_in_Replay_ == null) ? "<null>" : this.disable_Resume_in_Replay_));
        sb.append(',');
        sb.append("disconnected_Results");
        sb.append('=');
        sb.append(this.disconnected_Results);
        sb.append(',');
        sb.append("disconnected_Results_");
        sb.append('=');
        sb.append(((this.disconnected_Results_ == null) ? "<null>" : this.disconnected_Results_));
        sb.append(',');
        sb.append("display_Driver_Stats");
        sb.append('=');
        sb.append(this.display_Driver_Stats);
        sb.append(',');
        sb.append("display_Track_Stats");
        sb.append('=');
        sb.append(this.display_Track_Stats);
        sb.append(',');
        sb.append("exit_Confirmation");
        sb.append('=');
        sb.append(this.exit_Confirmation);
        sb.append(',');
        sb.append("exit_Confirmation_");
        sb.append('=');
        sb.append(((this.exit_Confirmation_ == null) ? "<null>" : this.exit_Confirmation_));
        sb.append(',');
        sb.append("find_Default_Setup");
        sb.append('=');
        sb.append(this.find_Default_Setup);
        sb.append(',');
        sb.append("find_Default_Setup_");
        sb.append('=');
        sb.append(((this.find_Default_Setup_ == null) ? "<null>" : this.find_Default_Setup_));
        sb.append(',');
        sb.append("fixed_AI_Setups");
        sb.append('=');
        sb.append(this.fixed_AI_Setups);
        sb.append(',');
        sb.append("fixed_AI_Setups_");
        sb.append('=');
        sb.append(((this.fixed_AI_Setups_ == null) ? "<null>" : this.fixed_AI_Setups_));
        sb.append(',');
        sb.append("fixed_Setups");
        sb.append('=');
        sb.append(this.fixed_Setups);
        sb.append(',');
        sb.append("fixed_Setups_");
        sb.append('=');
        sb.append(((this.fixed_Setups_ == null) ? "<null>" : this.fixed_Setups_));
        sb.append(',');
        sb.append("fixed_Upgrades");
        sb.append('=');
        sb.append(this.fixed_Upgrades);
        sb.append(',');
        sb.append("fixed_Upgrades_");
        sb.append('=');
        sb.append(((this.fixed_Upgrades_ == null) ? "<null>" : this.fixed_Upgrades_));
        sb.append(',');
        sb.append("full_Player_Replay");
        sb.append('=');
        sb.append(this.full_Player_Replay);
        sb.append(',');
        sb.append("full_Player_Replay_");
        sb.append('=');
        sb.append(((this.full_Player_Replay_ == null) ? "<null>" : this.full_Player_Replay_));
        sb.append(',');
        sb.append("gPRIX_AI_Driver_Strength");
        sb.append('=');
        sb.append(this.gPRIX_AI_Driver_Strength);
        sb.append(',');
        sb.append("gPRIX_AI_Driver_Strength_");
        sb.append('=');
        sb.append(((this.gPRIX_AI_Driver_Strength_ == null) ? "<null>" : this.gPRIX_AI_Driver_Strength_));
        sb.append(',');
        sb.append("gPRIX_Allowed_Vehicles");
        sb.append('=');
        sb.append(((this.gPRIX_Allowed_Vehicles == null) ? "<null>" : this.gPRIX_Allowed_Vehicles));
        sb.append(',');
        sb.append("gPRIX_CrashRecovery");
        sb.append('=');
        sb.append(this.gPRIX_CrashRecovery);
        sb.append(',');
        sb.append("gPRIX_CrashRecovery_");
        sb.append('=');
        sb.append(((this.gPRIX_CrashRecovery_ == null) ? "<null>" : this.gPRIX_CrashRecovery_));
        sb.append(',');
        sb.append("gPRIX_Damage_Multiplier");
        sb.append('=');
        sb.append(this.gPRIX_Damage_Multiplier);
        sb.append(',');
        sb.append("gPRIX_Damage_Multiplier_");
        sb.append('=');
        sb.append(((this.gPRIX_Damage_Multiplier_ == null) ? "<null>" : this.gPRIX_Damage_Multiplier_));
        sb.append(',');
        sb.append("gPRIX_FreeSettings");
        sb.append('=');
        sb.append(this.gPRIX_FreeSettings);
        sb.append(',');
        sb.append("gPRIX_FreeSettings_");
        sb.append('=');
        sb.append(((this.gPRIX_FreeSettings_ == null) ? "<null>" : this.gPRIX_FreeSettings_));
        sb.append(',');
        sb.append("gPRIX_Fuel_Consumption_Multiplier");
        sb.append('=');
        sb.append(this.gPRIX_Fuel_Consumption_Multiplier);
        sb.append(',');
        sb.append("gPRIX_Opponents");
        sb.append('=');
        sb.append(this.gPRIX_Opponents);
        sb.append(',');
        sb.append("gPRIX_Race_Finish_Criteria");
        sb.append('=');
        sb.append(this.gPRIX_Race_Finish_Criteria);
        sb.append(',');
        sb.append("gPRIX_Race_Finish_Criteria_");
        sb.append('=');
        sb.append(((this.gPRIX_Race_Finish_Criteria_ == null) ? "<null>" : this.gPRIX_Race_Finish_Criteria_));
        sb.append(',');
        sb.append("gPRIX_Race_Laps");
        sb.append('=');
        sb.append(this.gPRIX_Race_Laps);
        sb.append(',');
        sb.append("gPRIX_Race_Length");
        sb.append('=');
        sb.append(this.gPRIX_Race_Length);
        sb.append(',');
        sb.append("gPRIX_Race_Time");
        sb.append('=');
        sb.append(this.gPRIX_Race_Time);
        sb.append(',');
        sb.append("gPRIX_Race_Time_");
        sb.append('=');
        sb.append(((this.gPRIX_Race_Time_ == null) ? "<null>" : this.gPRIX_Race_Time_));
        sb.append(',');
        sb.append("gPRIX_Speed_Compensation");
        sb.append('=');
        sb.append(this.gPRIX_Speed_Compensation);
        sb.append(',');
        sb.append("gPRIX_Speed_Compensation_");
        sb.append('=');
        sb.append(((this.gPRIX_Speed_Compensation_ == null) ? "<null>" : this.gPRIX_Speed_Compensation_));
        sb.append(',');
        sb.append("gPRIX_Tire_Wear_Multiplier");
        sb.append('=');
        sb.append(this.gPRIX_Tire_Wear_Multiplier);
        sb.append(',');
        sb.append("ghost_AI");
        sb.append('=');
        sb.append(this.ghost_AI);
        sb.append(',');
        sb.append("ghost_AI_");
        sb.append('=');
        sb.append(((this.ghost_AI_ == null) ? "<null>" : this.ghost_AI_));
        sb.append(',');
        sb.append("horizontal_Tire_Temps");
        sb.append('=');
        sb.append(this.horizontal_Tire_Temps);
        sb.append(',');
        sb.append("horizontal_Tire_Temps_");
        sb.append('=');
        sb.append(((this.horizontal_Tire_Temps_ == null) ? "<null>" : this.horizontal_Tire_Temps_));
        sb.append(',');
        sb.append("inactive_Sleep_Time");
        sb.append('=');
        sb.append(this.inactive_Sleep_Time);
        sb.append(',');
        sb.append("inactive_Sleep_Time_");
        sb.append('=');
        sb.append(((this.inactive_Sleep_Time_ == null) ? "<null>" : this.inactive_Sleep_Time_));
        sb.append(',');
        sb.append("instant_Replay_Length");
        sb.append('=');
        sb.append(this.instant_Replay_Length);
        sb.append(',');
        sb.append("keep_Received_Setups");
        sb.append('=');
        sb.append(this.keep_Received_Setups);
        sb.append(',');
        sb.append("keep_Received_Setups_");
        sb.append('=');
        sb.append(((this.keep_Received_Setups_ == null) ? "<null>" : this.keep_Received_Setups_));
        sb.append(',');
        sb.append("mULTI_AI_Driver_Strength");
        sb.append('=');
        sb.append(this.mULTI_AI_Driver_Strength);
        sb.append(',');
        sb.append("mULTI_Allowed_Vehicles");
        sb.append('=');
        sb.append(((this.mULTI_Allowed_Vehicles == null) ? "<null>" : this.mULTI_Allowed_Vehicles));
        sb.append(',');
        sb.append("mULTI_CrashRecovery");
        sb.append('=');
        sb.append(this.mULTI_CrashRecovery);
        sb.append(',');
        sb.append("mULTI_Damage_Multiplier");
        sb.append('=');
        sb.append(this.mULTI_Damage_Multiplier);
        sb.append(',');
        sb.append("mULTI_FreeSettings");
        sb.append('=');
        sb.append(this.mULTI_FreeSettings);
        sb.append(',');
        sb.append("mULTI_Fuel_Consumption_Multiplier");
        sb.append('=');
        sb.append(this.mULTI_Fuel_Consumption_Multiplier);
        sb.append(',');
        sb.append("mULTI_Opponents");
        sb.append('=');
        sb.append(this.mULTI_Opponents);
        sb.append(',');
        sb.append("mULTI_Race_Finish_Criteria");
        sb.append('=');
        sb.append(this.mULTI_Race_Finish_Criteria);
        sb.append(',');
        sb.append("mULTI_Race_Laps");
        sb.append('=');
        sb.append(this.mULTI_Race_Laps);
        sb.append(',');
        sb.append("mULTI_Race_Length");
        sb.append('=');
        sb.append(this.mULTI_Race_Length);
        sb.append(',');
        sb.append("mULTI_Race_Time");
        sb.append('=');
        sb.append(this.mULTI_Race_Time);
        sb.append(',');
        sb.append("mULTI_Speed_Compensation");
        sb.append('=');
        sb.append(this.mULTI_Speed_Compensation);
        sb.append(',');
        sb.append("mULTI_Tire_Wear_Multiplier");
        sb.append('=');
        sb.append(this.mULTI_Tire_Wear_Multiplier);
        sb.append(',');
        sb.append("measurement_Units");
        sb.append('=');
        sb.append(this.measurement_Units);
        sb.append(',');
        sb.append("measurement_Units_");
        sb.append('=');
        sb.append(((this.measurement_Units_ == null) ? "<null>" : this.measurement_Units_));
        sb.append(',');
        sb.append("message_Center_Detail");
        sb.append('=');
        sb.append(this.message_Center_Detail);
        sb.append(',');
        sb.append("miscellaneous");
        sb.append('=');
        sb.append(this.miscellaneous);
        sb.append(',');
        sb.append("monitor_AI_Postfix");
        sb.append('=');
        sb.append(((this.monitor_AI_Postfix == null) ? "<null>" : this.monitor_AI_Postfix));
        sb.append(',');
        sb.append("monitor_AI_Postfix_");
        sb.append('=');
        sb.append(((this.monitor_AI_Postfix_ == null) ? "<null>" : this.monitor_AI_Postfix_));
        sb.append(',');
        sb.append("monitor_Admin_Postfix");
        sb.append('=');
        sb.append(((this.monitor_Admin_Postfix == null) ? "<null>" : this.monitor_Admin_Postfix));
        sb.append(',');
        sb.append("monitor_Admin_Postfix_");
        sb.append('=');
        sb.append(((this.monitor_Admin_Postfix_ == null) ? "<null>" : this.monitor_Admin_Postfix_));
        sb.append(',');
        sb.append("monitor_Auto_Replay");
        sb.append('=');
        sb.append(this.monitor_Auto_Replay);
        sb.append(',');
        sb.append("monitor_Auto_Replay_");
        sb.append('=');
        sb.append(((this.monitor_Auto_Replay_ == null) ? "<null>" : this.monitor_Auto_Replay_));
        sb.append(',');
        sb.append("multi_session_Results");
        sb.append('=');
        sb.append(this.multi_session_Results);
        sb.append(',');
        sb.append("multi_session_Results_");
        sb.append('=');
        sb.append(((this.multi_session_Results_ == null) ? "<null>" : this.multi_session_Results_));
        sb.append(',');
        sb.append("number_Race_Results");
        sb.append('=');
        sb.append(this.number_Race_Results);
        sb.append(',');
        sb.append("number_Race_Results_");
        sb.append('=');
        sb.append(((this.number_Race_Results_ == null) ? "<null>" : this.number_Race_Results_));
        sb.append(',');
        sb.append("number_Track_Replays");
        sb.append('=');
        sb.append(this.number_Track_Replays);
        sb.append(',');
        sb.append("number_Track_Replays_");
        sb.append('=');
        sb.append(((this.number_Track_Replays_ == null) ? "<null>" : this.number_Track_Replays_));
        sb.append(',');
        sb.append("one_Lap_To_Go_Warning");
        sb.append('=');
        sb.append(this.one_Lap_To_Go_Warning);
        sb.append(',');
        sb.append("one_Lap_To_Go_Warning_");
        sb.append('=');
        sb.append(((this.one_Lap_To_Go_Warning_ == null) ? "<null>" : this.one_Lap_To_Go_Warning_));
        sb.append(',');
        sb.append("pause_If_Focus_Lost");
        sb.append('=');
        sb.append(this.pause_If_Focus_Lost);
        sb.append(',');
        sb.append("pause_If_Focus_Lost_");
        sb.append('=');
        sb.append(((this.pause_If_Focus_Lost_ == null) ? "<null>" : this.pause_If_Focus_Lost_));
        sb.append(',');
        sb.append("pitstop_Description");
        sb.append('=');
        sb.append(this.pitstop_Description);
        sb.append(',');
        sb.append("pitstop_Description_");
        sb.append('=');
        sb.append(((this.pitstop_Description_ == null) ? "<null>" : this.pitstop_Description_));
        sb.append(',');
        sb.append("play_Movies");
        sb.append('=');
        sb.append(this.play_Movies);
        sb.append(',');
        sb.append("rPLAY_AI_Driver_Strength");
        sb.append('=');
        sb.append(this.rPLAY_AI_Driver_Strength);
        sb.append(',');
        sb.append("rPLAY_Allowed_Vehicles");
        sb.append('=');
        sb.append(((this.rPLAY_Allowed_Vehicles == null) ? "<null>" : this.rPLAY_Allowed_Vehicles));
        sb.append(',');
        sb.append("rPLAY_CrashRecovery");
        sb.append('=');
        sb.append(this.rPLAY_CrashRecovery);
        sb.append(',');
        sb.append("rPLAY_Damage_Multiplier");
        sb.append('=');
        sb.append(this.rPLAY_Damage_Multiplier);
        sb.append(',');
        sb.append("rPLAY_FreeSettings");
        sb.append('=');
        sb.append(this.rPLAY_FreeSettings);
        sb.append(',');
        sb.append("rPLAY_Fuel_Consumption_Multiplier");
        sb.append('=');
        sb.append(this.rPLAY_Fuel_Consumption_Multiplier);
        sb.append(',');
        sb.append("rPLAY_Opponents");
        sb.append('=');
        sb.append(this.rPLAY_Opponents);
        sb.append(',');
        sb.append("rPLAY_Race_Finish_Criteria");
        sb.append('=');
        sb.append(this.rPLAY_Race_Finish_Criteria);
        sb.append(',');
        sb.append("rPLAY_Race_Laps");
        sb.append('=');
        sb.append(this.rPLAY_Race_Laps);
        sb.append(',');
        sb.append("rPLAY_Race_Length");
        sb.append('=');
        sb.append(this.rPLAY_Race_Length);
        sb.append(',');
        sb.append("rPLAY_Race_Time");
        sb.append('=');
        sb.append(this.rPLAY_Race_Time);
        sb.append(',');
        sb.append("rPLAY_Speed_Compensation");
        sb.append('=');
        sb.append(this.rPLAY_Speed_Compensation);
        sb.append(',');
        sb.append("rPLAY_Tire_Wear_Multiplier");
        sb.append('=');
        sb.append(this.rPLAY_Tire_Wear_Multiplier);
        sb.append(',');
        sb.append("race_Stint_Offset");
        sb.append('=');
        sb.append(this.race_Stint_Offset);
        sb.append(',');
        sb.append("race_Stint_Offset_");
        sb.append('=');
        sb.append(((this.race_Stint_Offset_ == null) ? "<null>" : this.race_Stint_Offset_));
        sb.append(',');
        sb.append("realTimeLogging");
        sb.append('=');
        sb.append(this.realTimeLogging);
        sb.append(',');
        sb.append("realTimeLogging_");
        sb.append('=');
        sb.append(((this.realTimeLogging_ == null) ? "<null>" : this.realTimeLogging_));
        sb.append(',');
        sb.append("realtime_Splits");
        sb.append('=');
        sb.append(this.realtime_Splits);
        sb.append(',');
        sb.append("realtime_Splits_");
        sb.append('=');
        sb.append(((this.realtime_Splits_ == null) ? "<null>" : this.realtime_Splits_));
        sb.append(',');
        sb.append("record_Hotlaps");
        sb.append('=');
        sb.append(this.record_Hotlaps);
        sb.append(',');
        sb.append("record_Hotlaps_");
        sb.append('=');
        sb.append(((this.record_Hotlaps_ == null) ? "<null>" : this.record_Hotlaps_));
        sb.append(',');
        sb.append("record_Replays");
        sb.append('=');
        sb.append(this.record_Replays);
        sb.append(',');
        sb.append("record_Replays_");
        sb.append('=');
        sb.append(((this.record_Replays_ == null) ? "<null>" : this.record_Replays_));
        sb.append(',');
        sb.append("record_To_Memory");
        sb.append('=');
        sb.append(this.record_To_Memory);
        sb.append(',');
        sb.append("record_To_Memory_");
        sb.append('=');
        sb.append(((this.record_To_Memory_ == null) ? "<null>" : this.record_To_Memory_));
        sb.append(',');
        sb.append("relative_Fuel_Strategy");
        sb.append('=');
        sb.append(this.relative_Fuel_Strategy);
        sb.append(',');
        sb.append("relative_Fuel_Strategy_");
        sb.append('=');
        sb.append(((this.relative_Fuel_Strategy_ == null) ? "<null>" : this.relative_Fuel_Strategy_));
        sb.append(',');
        sb.append("relevant_Setups_Only");
        sb.append('=');
        sb.append(this.relevant_Setups_Only);
        sb.append(',');
        sb.append("relevant_Setups_Only_");
        sb.append('=');
        sb.append(((this.relevant_Setups_Only_ == null) ? "<null>" : this.relevant_Setups_Only_));
        sb.append(',');
        sb.append("replay_Base_Fidelity");
        sb.append('=');
        sb.append(this.replay_Base_Fidelity);
        sb.append(',');
        sb.append("save_All_Replay_Sessions");
        sb.append('=');
        sb.append(this.save_All_Replay_Sessions);
        sb.append(',');
        sb.append("save_All_Replay_Sessions_");
        sb.append('=');
        sb.append(((this.save_All_Replay_Sessions_ == null) ? "<null>" : this.save_All_Replay_Sessions_));
        sb.append(',');
        sb.append("settings_Type");
        sb.append('=');
        sb.append(this.settings_Type);
        sb.append(',');
        sb.append("show_Extra_Lap");
        sb.append('=');
        sb.append(this.show_Extra_Lap);
        sb.append(',');
        sb.append("show_Extra_Lap_");
        sb.append('=');
        sb.append(((this.show_Extra_Lap_ == null) ? "<null>" : this.show_Extra_Lap_));
        sb.append(',');
        sb.append("smart_Pitcrew");
        sb.append('=');
        sb.append(this.smart_Pitcrew);
        sb.append(',');
        sb.append("smart_Pitcrew_");
        sb.append('=');
        sb.append(((this.smart_Pitcrew_ == null) ? "<null>" : this.smart_Pitcrew_));
        sb.append(',');
        sb.append("speed_Comp_Dist");
        sb.append('=');
        sb.append(this.speed_Comp_Dist);
        sb.append(',');
        sb.append("speed_Comp_Dist_");
        sb.append('=');
        sb.append(((this.speed_Comp_Dist_ == null) ? "<null>" : this.speed_Comp_Dist_));
        sb.append(',');
        sb.append("speed_Units");
        sb.append('=');
        sb.append(this.speed_Units);
        sb.append(',');
        sb.append("speed_Units_");
        sb.append('=');
        sb.append(((this.speed_Units_ == null) ? "<null>" : this.speed_Units_));
        sb.append(',');
        sb.append("spotter_Behind");
        sb.append('=');
        sb.append(this.spotter_Behind);
        sb.append(',');
        sb.append("spotter_Behind_");
        sb.append('=');
        sb.append(((this.spotter_Behind_ == null) ? "<null>" : this.spotter_Behind_));
        sb.append(',');
        sb.append("spotter_Detail");
        sb.append('=');
        sb.append(this.spotter_Detail);
        sb.append(',');
        sb.append("spotter_Detail_");
        sb.append('=');
        sb.append(((this.spotter_Detail_ == null) ? "<null>" : this.spotter_Detail_));
        sb.append(',');
        sb.append("spotter_Laptimes");
        sb.append('=');
        sb.append(this.spotter_Laptimes);
        sb.append(',');
        sb.append("spotter_Laptimes_");
        sb.append('=');
        sb.append(((this.spotter_Laptimes_ == null) ? "<null>" : this.spotter_Laptimes_));
        sb.append(',');
        sb.append("standings_Func");
        sb.append('=');
        sb.append(this.standings_Func);
        sb.append(',');
        sb.append("standings_Func_");
        sb.append('=');
        sb.append(((this.standings_Func_ == null) ? "<null>" : this.standings_Func_));
        sb.append(',');
        sb.append("starting_Pos");
        sb.append('=');
        sb.append(this.starting_Pos);
        sb.append(',');
        sb.append("starting_Pos_");
        sb.append('=');
        sb.append(((this.starting_Pos_ == null) ? "<null>" : this.starting_Pos_));
        sb.append(',');
        sb.append("temporary_Replay_Keys");
        sb.append('=');
        sb.append(this.temporary_Replay_Keys);
        sb.append(',');
        sb.append("temporary_Replay_Keys_");
        sb.append('=');
        sb.append(((this.temporary_Replay_Keys_ == null) ? "<null>" : this.temporary_Replay_Keys_));
        sb.append(',');
        sb.append("tooltips");
        sb.append('=');
        sb.append(this.tooltips);
        sb.append(',');
        sb.append("transparent_Trainer_Alpha");
        sb.append('=');
        sb.append(this.transparent_Trainer_Alpha);
        sb.append(',');
        sb.append("transparent_Trainer_Alpha_");
        sb.append('=');
        sb.append(((this.transparent_Trainer_Alpha_ == null) ? "<null>" : this.transparent_Trainer_Alpha_));
        sb.append(',');
        sb.append("transparent_Trainer_Lap");
        sb.append('=');
        sb.append(this.transparent_Trainer_Lap);
        sb.append(',');
        sb.append("transparent_Trainer_Lap_");
        sb.append('=');
        sb.append(((this.transparent_Trainer_Lap_ == null) ? "<null>" : this.transparent_Trainer_Lap_));
        sb.append(',');
        sb.append("transparent_Trainer_Lead_Time");
        sb.append('=');
        sb.append(this.transparent_Trainer_Lead_Time);
        sb.append(',');
        sb.append("transparent_Trainer_Lead_Time_");
        sb.append('=');
        sb.append(((this.transparent_Trainer_Lead_Time_ == null) ? "<null>" : this.transparent_Trainer_Lead_Time_));
        sb.append(',');
        sb.append("transparent_Trainer_Proximity");
        sb.append('=');
        sb.append(this.transparent_Trainer_Proximity);
        sb.append(',');
        sb.append("transparent_Trainer_Proximity_");
        sb.append('=');
        sb.append(((this.transparent_Trainer_Proximity_ == null) ? "<null>" : this.transparent_Trainer_Proximity_));
        sb.append(',');
        sb.append("user_Vehicle_Data");
        sb.append('=');
        sb.append(this.user_Vehicle_Data);
        sb.append(',');
        sb.append("user_Vehicle_Data_");
        sb.append('=');
        sb.append(((this.user_Vehicle_Data_ == null) ? "<null>" : this.user_Vehicle_Data_));
        sb.append(',');
        sb.append("vehicle_Removal");
        sb.append('=');
        sb.append(this.vehicle_Removal);
        sb.append(',');
        sb.append("vehicle_Removal_");
        sb.append('=');
        sb.append(((this.vehicle_Removal_ == null) ? "<null>" : this.vehicle_Removal_));
        sb.append(',');
        sb.append("wait_For_All_Plugins_To_Load");
        sb.append('=');
        sb.append(this.wait_For_All_Plugins_To_Load);
        sb.append(',');
        sb.append("wait_For_All_Plugins_To_Load_");
        sb.append('=');
        sb.append(((this.wait_For_All_Plugins_To_Load_ == null) ? "<null>" : this.wait_For_All_Plugins_To_Load_));
        sb.append(',');
        sb.append("practice_length");
        sb.append('=');
        sb.append(this.practice_length);
        sb.append(',');
        sb.append("practice_length_");
        sb.append('=');
        sb.append(((this.practice_length_ == null) ? "<null>" : this.practice_length_));
        sb.append(',');
        sb.append("qualifying_laps");
        sb.append('=');
        sb.append(this.qualifying_laps);
        sb.append(',');
        sb.append("qualifying_laps_");
        sb.append('=');
        sb.append(((this.qualifying_laps_ == null) ? "<null>" : this.qualifying_laps_));
        sb.append(',');
        sb.append("qualifying_length");
        sb.append('=');
        sb.append(this.qualifying_length);
        sb.append(',');
        sb.append("qualifying_length_");
        sb.append('=');
        sb.append(((this.qualifying_length_ == null) ? "<null>" : this.qualifying_length_));
        sb.append(',');
        sb.append("warmup_length");
        sb.append('=');
        sb.append(this.warmup_length);
        sb.append(',');
        sb.append("warmup_length_");
        sb.append('=');
        sb.append(((this.warmup_length_ == null) ? "<null>" : this.warmup_length_));
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
        result = ((result * 31) + ((this.practice_length_ == null) ? 0 : this.practice_length_.hashCode()));
        result = ((result * 31) + ((this.aI_Formation_by_Position_ == null) ? 0 : this.aI_Formation_by_Position_.hashCode()));
        result = ((result * 31) + (this.fixed_Upgrades ? 1 : 0));
        result = ((result * 31) + (this.wait_For_All_Plugins_To_Load ? 1 : 0));
        result = ((result * 31) + ((this.rPLAY_Allowed_Vehicles == null) ? 0 : this.rPLAY_Allowed_Vehicles.hashCode()));
        result = ((result * 31) + this.cURNT_Race_Laps);
        result = ((result * 31) + ((this.full_Player_Replay_ == null) ? 0 : this.full_Player_Replay_.hashCode()));
        result = ((result * 31) + this.settings_Type);
        result = ((result * 31) + ((this.horizontal_Tire_Temps_ == null) ? 0 : this.horizontal_Tire_Temps_.hashCode()));
        result = ((result * 31) + ((this.attack_Zone_AR_Time_ == null) ? 0 : this.attack_Zone_AR_Time_.hashCode()));
        result = ((result * 31) + (this.disable_NetComm ? 1 : 0));
        result = ((result * 31) + (this.display_Driver_Stats ? 1 : 0));
        result = ((result * 31) + this.gPRIX_CrashRecovery);
        result = ((result * 31) + ((this.ghost_AI_ == null) ? 0 : this.ghost_AI_.hashCode()));
        result = ((result * 31) + (this.horizontal_Tire_Temps ? 1 : 0));
        result = ((result * 31) + ((this.aI_Brake_Power_Usage_ == null) ? 0 : this.aI_Brake_Power_Usage_.hashCode()));
        result = ((result * 31) + this.number_Track_Replays);
        result = ((result * 31) + ((this.gPRIX_AI_Driver_Strength_ == null) ? 0 : this.gPRIX_AI_Driver_Strength_.hashCode()));
        result = ((result * 31) + this.relevant_Setups_Only);
        result = ((result * 31) + this.cHAMP_Speed_Compensation);
        result = ((result * 31) + this.message_Center_Detail);
        result = ((result * 31) + ((this.realtime_Splits_ == null) ? 0 : this.realtime_Splits_.hashCode()));
        result = ((result * 31) + this.cURNT_Fuel_Consumption_Multiplier);
        result = ((result * 31) + (this.fixed_Setups ? 1 : 0));
        result = ((result * 31) + this.standings_Func);
        result = ((result * 31) + ((this.spotter_Detail_ == null) ? 0 : this.spotter_Detail_.hashCode()));
        result = ((result * 31) + ((this.aI_Brake_Grip_Usage_ == null) ? 0 : this.aI_Brake_Grip_Usage_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.mULTI_Race_Length));
        result = ((result * 31) + this.cURNT_Tire_Wear_Multiplier);
        result = ((result * 31) + this.show_Extra_Lap);
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + this.measurement_Units);
        result = ((result * 31) + Float.floatToIntBits(this.aI_Brake_Power_Usage));
        result = ((result * 31) + this.gPRIX_Speed_Compensation);
        result = ((result * 31) + ((this.qualifying_length_ == null) ? 0 : this.qualifying_length_.hashCode()));
        result = ((result * 31) + this.cHAMP_Race_Laps);
        result = ((result * 31) + ((this.gPRIX_FreeSettings_ == null) ? 0 : this.gPRIX_FreeSettings_.hashCode()));
        result = ((result * 31) + this.miscellaneous);
        result = ((result * 31) + this.spotter_Behind);
        result = ((result * 31) + this.rPLAY_Damage_Multiplier);
        result = ((result * 31) + this.rPLAY_Race_Finish_Criteria);
        result = ((result * 31) + ((this.exit_Confirmation_ == null) ? 0 : this.exit_Confirmation_.hashCode()));
        result = ((result * 31) + this.race_Stint_Offset);
        result = ((result * 31) + Float.floatToIntBits(this.aI_Brake_Grip_Usage));
        result = ((result * 31) + this.mULTI_Race_Time);
        result = ((result * 31) + this.transparent_Trainer_Proximity);
        result = ((result * 31) + Float.floatToIntBits(this.cHAMP_Race_Length));
        result = ((result * 31) + ((this.fixed_Upgrades_ == null) ? 0 : this.fixed_Upgrades_.hashCode()));
        result = ((result * 31) + this.mULTI_FreeSettings);
        result = ((result * 31) + this.instant_Replay_Length);
        result = ((result * 31) + this.rPLAY_Speed_Compensation);
        result = ((result * 31) + ((this.number_Race_Results_ == null) ? 0 : this.number_Race_Results_.hashCode()));
        result = ((result * 31) + ((this.starting_Pos_ == null) ? 0 : this.starting_Pos_.hashCode()));
        result = ((result * 31) + ((this.aI_Limiter_ == null) ? 0 : this.aI_Limiter_.hashCode()));
        result = ((result * 31) + ((this.speed_Units_ == null) ? 0 : this.speed_Units_.hashCode()));
        result = ((result * 31) + ((this.user_Vehicle_Data_ == null) ? 0 : this.user_Vehicle_Data_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.cURNT_Race_Length));
        result = ((result * 31) + this.rPLAY_Fuel_Consumption_Multiplier);
        result = ((result * 31) + ((this.gPRIX_Race_Finish_Criteria_ == null) ? 0 : this.gPRIX_Race_Finish_Criteria_.hashCode()));
        result = ((result * 31) + (this.temporary_Replay_Keys ? 1 : 0));
        result = ((result * 31) + ((this.number_Track_Replays_ == null) ? 0 : this.number_Track_Replays_.hashCode()));
        result = ((result * 31) + (this.damper_Units ? 1 : 0));
        result = ((result * 31) + ((this.auto_change_Opponent_List_ == null) ? 0 : this.auto_change_Opponent_List_.hashCode()));
        result = ((result * 31) + this.gPRIX_Race_Time);
        result = ((result * 31) + ((this.autocalibrate_AI_Mode_ == null) ? 0 : this.autocalibrate_AI_Mode_.hashCode()));
        result = ((result * 31) + ((this.auto_Skip_Garaged_Vehicles_ == null) ? 0 : this.auto_Skip_Garaged_Vehicles_.hashCode()));
        result = ((result * 31) + this.mULTI_Damage_Multiplier);
        result = ((result * 31) + ((this.transparent_Trainer_Lead_Time_ == null) ? 0 : this.transparent_Trainer_Lead_Time_.hashCode()));
        result = ((result * 31) + this.number_Race_Results);
        result = ((result * 31) + ((this.automatic_Pit_Menu_ == null) ? 0 : this.automatic_Pit_Menu_.hashCode()));
        result = ((result * 31) + this.record_Replays);
        result = ((result * 31) + this.spotter_Laptimes);
        result = ((result * 31) + ((this.save_All_Replay_Sessions_ == null) ? 0 : this.save_All_Replay_Sessions_.hashCode()));
        result = ((result * 31) + (this.pause_If_Focus_Lost ? 1 : 0));
        result = ((result * 31) + ((this.fixed_AI_Setups_ == null) ? 0 : this.fixed_AI_Setups_.hashCode()));
        result = ((result * 31) + ((this.gPRIX_Race_Time_ == null) ? 0 : this.gPRIX_Race_Time_.hashCode()));
        result = ((result * 31) + ((this.inactive_Sleep_Time_ == null) ? 0 : this.inactive_Sleep_Time_.hashCode()));
        result = ((result * 31) + this.basic_Display);
        result = ((result * 31) + ((this.transparent_Trainer_Lap_ == null) ? 0 : this.transparent_Trainer_Lap_.hashCode()));
        result = ((result * 31) + ((this.disable_NetComm_ == null) ? 0 : this.disable_NetComm_.hashCode()));
        result = ((result * 31) + this.gPRIX_Fuel_Consumption_Multiplier);
        result = ((result * 31) + ((this.auto_Line_Smoothing_ == null) ? 0 : this.auto_Line_Smoothing_.hashCode()));
        result = ((result * 31) + this.difficulty);
        result = ((result * 31) + ((this.gPRIX_Speed_Compensation_ == null) ? 0 : this.gPRIX_Speed_Compensation_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.aI_Aggression));
        result = ((result * 31) + this.gPRIX_Opponents);
        result = ((result * 31) + this.gPRIX_FreeSettings);
        result = ((result * 31) + ((this.one_Lap_To_Go_Warning_ == null) ? 0 : this.one_Lap_To_Go_Warning_.hashCode()));
        result = ((result * 31) + ((this.transparent_Trainer_Proximity_ == null) ? 0 : this.transparent_Trainer_Proximity_.hashCode()));
        result = ((result * 31) + this.aI_Power_Calibration);
        result = ((result * 31) + ((this.fixed_Setups_ == null) ? 0 : this.fixed_Setups_.hashCode()));
        result = ((result * 31) + this.aI_Calibrate_Sample_Size);
        result = ((result * 31) + this.gPRIX_AI_Driver_Strength);
        result = ((result * 31) + ((this.cHAMP_Allowed_Vehicles == null) ? 0 : this.cHAMP_Allowed_Vehicles.hashCode()));
        result = ((result * 31) + ((this.speed_Comp_Dist_ == null) ? 0 : this.speed_Comp_Dist_.hashCode()));
        result = ((result * 31) + (this.disconnected_Results ? 1 : 0));
        result = ((result * 31) + (this.user_Vehicle_Data ? 1 : 0));
        result = ((result * 31) + this.attack_Zone_AR_Time);
        result = ((result * 31) + this.ghost_AI);
        result = ((result * 31) + ((this.spotter_Behind_ == null) ? 0 : this.spotter_Behind_.hashCode()));
        result = ((result * 31) + ((this.monitor_Auto_Replay_ == null) ? 0 : this.monitor_Auto_Replay_.hashCode()));
        result = ((result * 31) + this.mULTI_Race_Laps);
        result = ((result * 31) + this.mULTI_Fuel_Consumption_Multiplier);
        result = ((result * 31) + ((this.warmup_length_ == null) ? 0 : this.warmup_length_.hashCode()));
        result = ((result * 31) + ((this.aI_Corner_Grip_Usage_ == null) ? 0 : this.aI_Corner_Grip_Usage_.hashCode()));
        result = ((result * 31) + ((this.aI_Power_Calibration_ == null) ? 0 : this.aI_Power_Calibration_.hashCode()));
        result = ((result * 31) + this.compress_Replay);
        result = ((result * 31) + this.basic_Rules);
        result = ((result * 31) + ((this.damper_Units_ == null) ? 0 : this.damper_Units_.hashCode()));
        result = ((result * 31) + ((this.aI_Calibrate_Sample_Size_ == null) ? 0 : this.aI_Calibrate_Sample_Size_.hashCode()));
        result = ((result * 31) + ((this.pause_If_Focus_Lost_ == null) ? 0 : this.pause_If_Focus_Lost_.hashCode()));
        result = ((result * 31) + this.rPLAY_Race_Time);
        result = ((result * 31) + this.cHAMP_AI_Driver_Strength);
        result = ((result * 31) + ((this.transparent_Trainer_Alpha_ == null) ? 0 : this.transparent_Trainer_Alpha_.hashCode()));
        result = ((result * 31) + this.rPLAY_AI_Driver_Strength);
        result = ((result * 31) + ((this.aI_Fuel_Mult_ == null) ? 0 : this.aI_Fuel_Mult_.hashCode()));
        result = ((result * 31) + this.rPLAY_Tire_Wear_Multiplier);
        result = ((result * 31) + ((this.realTimeLogging_ == null) ? 0 : this.realTimeLogging_.hashCode()));
        result = ((result * 31) + ((this.relevant_Setups_Only_ == null) ? 0 : this.relevant_Setups_Only_.hashCode()));
        result = ((result * 31) + this.mULTI_Race_Finish_Criteria);
        result = ((result * 31) + this.rPLAY_Opponents);
        result = ((result * 31) + (this.smart_Pitcrew ? 1 : 0));
        result = ((result * 31) + (this.realtime_Splits ? 1 : 0));
        result = ((result * 31) + (this.multi_session_Results ? 1 : 0));
        result = ((result * 31) + this.one_Lap_To_Go_Warning);
        result = ((result * 31) + this.starting_Pos);
        result = ((result * 31) + ((this.wait_For_All_Plugins_To_Load_ == null) ? 0 : this.wait_For_All_Plugins_To_Load_.hashCode()));
        result = ((result * 31) + (this.relative_Fuel_Strategy ? 1 : 0));
        result = ((result * 31) + this.active_Sleep_Time);
        result = ((result * 31) + (this.auto_Skip_Garaged_Vehicles ? 1 : 0));
        result = ((result * 31) + ((this.monitor_AI_Postfix == null) ? 0 : this.monitor_AI_Postfix.hashCode()));
        result = ((result * 31) + ((this.mULTI_Allowed_Vehicles == null) ? 0 : this.mULTI_Allowed_Vehicles.hashCode()));
        result = ((result * 31) + this.keep_Received_Setups);
        result = ((result * 31) + this.cHAMP_FreeSettings);
        result = ((result * 31) + ((this.cURNT_Allowed_Vehicles == null) ? 0 : this.cURNT_Allowed_Vehicles.hashCode()));
        result = ((result * 31) + this.mULTI_Tire_Wear_Multiplier);
        result = ((result * 31) + this.cURNT_AI_Driver_Strength);
        result = ((result * 31) + this.cURNT_Speed_Compensation);
        result = ((result * 31) + ((this.spotter_Laptimes_ == null) ? 0 : this.spotter_Laptimes_.hashCode()));
        result = ((result * 31) + this.disable_Resume_in_Replay);
        result = ((result * 31) + ((this.aI_Mistakes_ == null) ? 0 : this.aI_Mistakes_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.transparent_Trainer_Alpha));
        result = ((result * 31) + this.replay_Base_Fidelity);
        result = ((result * 31) + this.cURNT_Damage_Multiplier);
        result = ((result * 31) + this.automatic_Pit_Menu);
        result = ((result * 31) + this.inactive_Sleep_Time);
        result = ((result * 31) + this.autocalibrate_AI_Mode);
        result = ((result * 31) + this.cHAMP_Opponents);
        result = ((result * 31) + ((this.compress_Replay_ == null) ? 0 : this.compress_Replay_.hashCode()));
        result = ((result * 31) + this.play_Movies);
        result = ((result * 31) + this.cURNT_Race_Finish_Criteria);
        result = ((result * 31) + this.rPLAY_FreeSettings);
        result = ((result * 31) + Float.floatToIntBits(this.aI_Fuel_Mult));
        result = ((result * 31) + ((this.record_Hotlaps_ == null) ? 0 : this.record_Hotlaps_.hashCode()));
        result = ((result * 31) + this.cHAMP_Tire_Wear_Multiplier);
        result = ((result * 31) + (this.fixed_AI_Setups ? 1 : 0));
        result = ((result * 31) + this.rPLAY_Race_Laps);
        result = ((result * 31) + this.cURNT_CrashRecovery);
        result = ((result * 31) + ((this.disconnected_Results_ == null) ? 0 : this.disconnected_Results_.hashCode()));
        result = ((result * 31) + this.championship_Basic_Rules);
        result = ((result * 31) + ((this.active_Sleep_Time_ == null) ? 0 : this.active_Sleep_Time_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.gPRIX_Race_Length));
        result = ((result * 31) + Float.floatToIntBits(this.aI_Corner_Grip_Usage));
        result = ((result * 31) + this.auto_Line_Smoothing);
        result = ((result * 31) + ((this.gPRIX_Damage_Multiplier_ == null) ? 0 : this.gPRIX_Damage_Multiplier_.hashCode()));
        result = ((result * 31) + ((this.keep_Received_Setups_ == null) ? 0 : this.keep_Received_Setups_.hashCode()));
        result = ((result * 31) + this.cURNT_Race_Time);
        result = ((result * 31) + this.qualifying_length);
        result = ((result * 31) + this.aI_Logic_Override);
        result = ((result * 31) + ((this.disable_Resume_in_Replay_ == null) ? 0 : this.disable_Resume_in_Replay_.hashCode()));
        result = ((result * 31) + ((this.gPRIX_CrashRecovery_ == null) ? 0 : this.gPRIX_CrashRecovery_.hashCode()));
        result = ((result * 31) + this.qualifying_laps);
        result = ((result * 31) + (this.find_Default_Setup ? 1 : 0));
        result = ((result * 31) + this.cURNT_Opponents);
        result = ((result * 31) + ((this.standings_Func_ == null) ? 0 : this.standings_Func_.hashCode()));
        result = ((result * 31) + ((this.gPRIX_Allowed_Vehicles == null) ? 0 : this.gPRIX_Allowed_Vehicles.hashCode()));
        result = ((result * 31) + this.transparent_Trainer_Lap);
        result = ((result * 31) + ((this.multi_session_Results_ == null) ? 0 : this.multi_session_Results_.hashCode()));
        result = ((result * 31) + ((this.qualifying_laps_ == null) ? 0 : this.qualifying_laps_.hashCode()));
        result = ((result * 31) + this.mULTI_CrashRecovery);
        result = ((result * 31) + (this.full_Player_Replay ? 1 : 0));
        result = ((result * 31) + this.mULTI_AI_Driver_Strength);
        result = ((result * 31) + ((this.monitor_Admin_Postfix_ == null) ? 0 : this.monitor_Admin_Postfix_.hashCode()));
        result = ((result * 31) + ((this.show_Extra_Lap_ == null) ? 0 : this.show_Extra_Lap_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.rPLAY_Race_Length));
        result = ((result * 31) + this.mULTI_Speed_Compensation);
        result = ((result * 31) + ((this.measurement_Units_ == null) ? 0 : this.measurement_Units_.hashCode()));
        result = ((result * 31) + ((this.record_To_Memory_ == null) ? 0 : this.record_To_Memory_.hashCode()));
        result = ((result * 31) + ((this.smart_Pitcrew_ == null) ? 0 : this.smart_Pitcrew_.hashCode()));
        result = ((result * 31) + ((this.monitor_AI_Postfix_ == null) ? 0 : this.monitor_AI_Postfix_.hashCode()));
        result = ((result * 31) + ((this.pitstop_Description_ == null) ? 0 : this.pitstop_Description_.hashCode()));
        result = ((result * 31) + this.cHAMP_Fuel_Consumption_Multiplier);
        result = ((result * 31) + ((this.temporary_Replay_Keys_ == null) ? 0 : this.temporary_Replay_Keys_.hashCode()));
        result = ((result * 31) + this.mULTI_Opponents);
        result = ((result * 31) + (this.record_To_Memory ? 1 : 0));
        result = ((result * 31) + this.gPRIX_Race_Finish_Criteria);
        result = ((result * 31) + ((this.find_Default_Setup_ == null) ? 0 : this.find_Default_Setup_.hashCode()));
        result = ((result * 31) + (this.display_Track_Stats ? 1 : 0));
        result = ((result * 31) + this.aI_Mistakes);
        result = ((result * 31) + this.warmup_length);
        result = ((result * 31) + this.spotter_Detail);
        result = ((result * 31) + ((this.monitor_Admin_Postfix == null) ? 0 : this.monitor_Admin_Postfix.hashCode()));
        result = ((result * 31) + this.vehicle_Removal);
        result = ((result * 31) + this.exit_Confirmation);
        result = ((result * 31) + ((this.vehicle_Removal_ == null) ? 0 : this.vehicle_Removal_.hashCode()));
        result = ((result * 31) + (this.tooltips ? 1 : 0));
        result = ((result * 31) + this.realTimeLogging);
        result = ((result * 31) + (this.aI_Formation_by_Position ? 1 : 0));
        result = ((result * 31) + ((this.record_Replays_ == null) ? 0 : this.record_Replays_.hashCode()));
        result = ((result * 31) + this.practice_length);
        result = ((result * 31) + this.aI_Limiter);
        result = ((result * 31) + ((this.aI_Logic_Override_ == null) ? 0 : this.aI_Logic_Override_.hashCode()));
        result = ((result * 31) + this.cHAMP_Race_Time);
        result = ((result * 31) + this.speed_Comp_Dist);
        result = ((result * 31) + ((this.race_Stint_Offset_ == null) ? 0 : this.race_Stint_Offset_.hashCode()));
        result = ((result * 31) + this.cHAMP_CrashRecovery);
        result = ((result * 31) + this.cURNT_FreeSettings);
        result = ((result * 31) + ((this.relative_Fuel_Strategy_ == null) ? 0 : this.relative_Fuel_Strategy_.hashCode()));
        result = ((result * 31) + (this.auto_change_Opponent_List ? 1 : 0));
        result = ((result * 31) + this.record_Hotlaps);
        result = ((result * 31) + this.gPRIX_Race_Laps);
        result = ((result * 31) + (this.pitstop_Description ? 1 : 0));
        result = ((result * 31) + Float.floatToIntBits(this.transparent_Trainer_Lead_Time));
        result = ((result * 31) + (this.monitor_Auto_Replay ? 1 : 0));
        result = ((result * 31) + this.rPLAY_CrashRecovery);
        result = ((result * 31) + (this.speed_Units ? 1 : 0));
        result = ((result * 31) + (this.save_All_Replay_Sessions ? 1 : 0));
        result = ((result * 31) + this.gPRIX_Tire_Wear_Multiplier);
        result = ((result * 31) + this.cHAMP_Race_Finish_Criteria);
        result = ((result * 31) + this.gPRIX_Damage_Multiplier);
        result = ((result * 31) + this.cHAMP_Damage_Multiplier);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameOptions) == false) {
            return false;
        }
        GameOptions rhs = ((GameOptions) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.practice_length_ == rhs.practice_length_) || ((this.practice_length_ != null) && this.practice_length_.equals(rhs.practice_length_))) && ((this.aI_Formation_by_Position_ == rhs.aI_Formation_by_Position_) || ((this.aI_Formation_by_Position_ != null) && this.aI_Formation_by_Position_.equals(rhs.aI_Formation_by_Position_)))) && (this.fixed_Upgrades == rhs.fixed_Upgrades)) && (this.wait_For_All_Plugins_To_Load == rhs.wait_For_All_Plugins_To_Load)) && ((this.rPLAY_Allowed_Vehicles == rhs.rPLAY_Allowed_Vehicles) || ((this.rPLAY_Allowed_Vehicles != null) && this.rPLAY_Allowed_Vehicles.equals(rhs.rPLAY_Allowed_Vehicles)))) && (this.cURNT_Race_Laps == rhs.cURNT_Race_Laps)) && ((this.full_Player_Replay_ == rhs.full_Player_Replay_) || ((this.full_Player_Replay_ != null) && this.full_Player_Replay_.equals(rhs.full_Player_Replay_)))) && (this.settings_Type == rhs.settings_Type)) && ((this.horizontal_Tire_Temps_ == rhs.horizontal_Tire_Temps_) || ((this.horizontal_Tire_Temps_ != null) && this.horizontal_Tire_Temps_.equals(rhs.horizontal_Tire_Temps_)))) && ((this.attack_Zone_AR_Time_ == rhs.attack_Zone_AR_Time_) || ((this.attack_Zone_AR_Time_ != null) && this.attack_Zone_AR_Time_.equals(rhs.attack_Zone_AR_Time_)))) && (this.disable_NetComm == rhs.disable_NetComm)) && (this.display_Driver_Stats == rhs.display_Driver_Stats)) && (this.gPRIX_CrashRecovery == rhs.gPRIX_CrashRecovery)) && ((this.ghost_AI_ == rhs.ghost_AI_) || ((this.ghost_AI_ != null) && this.ghost_AI_.equals(rhs.ghost_AI_)))) && (this.horizontal_Tire_Temps == rhs.horizontal_Tire_Temps)) && ((this.aI_Brake_Power_Usage_ == rhs.aI_Brake_Power_Usage_) || ((this.aI_Brake_Power_Usage_ != null) && this.aI_Brake_Power_Usage_.equals(rhs.aI_Brake_Power_Usage_)))) && (this.number_Track_Replays == rhs.number_Track_Replays)) && ((this.gPRIX_AI_Driver_Strength_ == rhs.gPRIX_AI_Driver_Strength_) || ((this.gPRIX_AI_Driver_Strength_ != null) && this.gPRIX_AI_Driver_Strength_.equals(rhs.gPRIX_AI_Driver_Strength_)))) && (this.relevant_Setups_Only == rhs.relevant_Setups_Only)) && (this.cHAMP_Speed_Compensation == rhs.cHAMP_Speed_Compensation)) && (this.message_Center_Detail == rhs.message_Center_Detail)) && ((this.realtime_Splits_ == rhs.realtime_Splits_) || ((this.realtime_Splits_ != null) && this.realtime_Splits_.equals(rhs.realtime_Splits_)))) && (this.cURNT_Fuel_Consumption_Multiplier == rhs.cURNT_Fuel_Consumption_Multiplier)) && (this.fixed_Setups == rhs.fixed_Setups)) && (this.standings_Func == rhs.standings_Func)) && ((this.spotter_Detail_ == rhs.spotter_Detail_) || ((this.spotter_Detail_ != null) && this.spotter_Detail_.equals(rhs.spotter_Detail_)))) && ((this.aI_Brake_Grip_Usage_ == rhs.aI_Brake_Grip_Usage_) || ((this.aI_Brake_Grip_Usage_ != null) && this.aI_Brake_Grip_Usage_.equals(rhs.aI_Brake_Grip_Usage_)))) && (Float.floatToIntBits(this.mULTI_Race_Length) == Float.floatToIntBits(rhs.mULTI_Race_Length))) && (this.cURNT_Tire_Wear_Multiplier == rhs.cURNT_Tire_Wear_Multiplier)) && (this.show_Extra_Lap == rhs.show_Extra_Lap)) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && (this.measurement_Units == rhs.measurement_Units)) && (Float.floatToIntBits(this.aI_Brake_Power_Usage) == Float.floatToIntBits(rhs.aI_Brake_Power_Usage))) && (this.gPRIX_Speed_Compensation == rhs.gPRIX_Speed_Compensation)) && ((this.qualifying_length_ == rhs.qualifying_length_) || ((this.qualifying_length_ != null) && this.qualifying_length_.equals(rhs.qualifying_length_)))) && (this.cHAMP_Race_Laps == rhs.cHAMP_Race_Laps)) && ((this.gPRIX_FreeSettings_ == rhs.gPRIX_FreeSettings_) || ((this.gPRIX_FreeSettings_ != null) && this.gPRIX_FreeSettings_.equals(rhs.gPRIX_FreeSettings_)))) && (this.miscellaneous == rhs.miscellaneous)) && (this.spotter_Behind == rhs.spotter_Behind)) && (this.rPLAY_Damage_Multiplier == rhs.rPLAY_Damage_Multiplier)) && (this.rPLAY_Race_Finish_Criteria == rhs.rPLAY_Race_Finish_Criteria)) && ((this.exit_Confirmation_ == rhs.exit_Confirmation_) || ((this.exit_Confirmation_ != null) && this.exit_Confirmation_.equals(rhs.exit_Confirmation_)))) && (this.race_Stint_Offset == rhs.race_Stint_Offset)) && (Float.floatToIntBits(this.aI_Brake_Grip_Usage) == Float.floatToIntBits(rhs.aI_Brake_Grip_Usage))) && (this.mULTI_Race_Time == rhs.mULTI_Race_Time)) && (this.transparent_Trainer_Proximity == rhs.transparent_Trainer_Proximity)) && (Float.floatToIntBits(this.cHAMP_Race_Length) == Float.floatToIntBits(rhs.cHAMP_Race_Length))) && ((this.fixed_Upgrades_ == rhs.fixed_Upgrades_) || ((this.fixed_Upgrades_ != null) && this.fixed_Upgrades_.equals(rhs.fixed_Upgrades_)))) && (this.mULTI_FreeSettings == rhs.mULTI_FreeSettings)) && (this.instant_Replay_Length == rhs.instant_Replay_Length)) && (this.rPLAY_Speed_Compensation == rhs.rPLAY_Speed_Compensation)) && ((this.number_Race_Results_ == rhs.number_Race_Results_) || ((this.number_Race_Results_ != null) && this.number_Race_Results_.equals(rhs.number_Race_Results_)))) && ((this.starting_Pos_ == rhs.starting_Pos_) || ((this.starting_Pos_ != null) && this.starting_Pos_.equals(rhs.starting_Pos_)))) && ((this.aI_Limiter_ == rhs.aI_Limiter_) || ((this.aI_Limiter_ != null) && this.aI_Limiter_.equals(rhs.aI_Limiter_)))) && ((this.speed_Units_ == rhs.speed_Units_) || ((this.speed_Units_ != null) && this.speed_Units_.equals(rhs.speed_Units_)))) && ((this.user_Vehicle_Data_ == rhs.user_Vehicle_Data_) || ((this.user_Vehicle_Data_ != null) && this.user_Vehicle_Data_.equals(rhs.user_Vehicle_Data_)))) && (Float.floatToIntBits(this.cURNT_Race_Length) == Float.floatToIntBits(rhs.cURNT_Race_Length))) && (this.rPLAY_Fuel_Consumption_Multiplier == rhs.rPLAY_Fuel_Consumption_Multiplier)) && ((this.gPRIX_Race_Finish_Criteria_ == rhs.gPRIX_Race_Finish_Criteria_) || ((this.gPRIX_Race_Finish_Criteria_ != null) && this.gPRIX_Race_Finish_Criteria_.equals(rhs.gPRIX_Race_Finish_Criteria_)))) && (this.temporary_Replay_Keys == rhs.temporary_Replay_Keys)) && ((this.number_Track_Replays_ == rhs.number_Track_Replays_) || ((this.number_Track_Replays_ != null) && this.number_Track_Replays_.equals(rhs.number_Track_Replays_)))) && (this.damper_Units == rhs.damper_Units)) && ((this.auto_change_Opponent_List_ == rhs.auto_change_Opponent_List_) || ((this.auto_change_Opponent_List_ != null) && this.auto_change_Opponent_List_.equals(rhs.auto_change_Opponent_List_)))) && (this.gPRIX_Race_Time == rhs.gPRIX_Race_Time)) && ((this.autocalibrate_AI_Mode_ == rhs.autocalibrate_AI_Mode_) || ((this.autocalibrate_AI_Mode_ != null) && this.autocalibrate_AI_Mode_.equals(rhs.autocalibrate_AI_Mode_)))) && ((this.auto_Skip_Garaged_Vehicles_ == rhs.auto_Skip_Garaged_Vehicles_) || ((this.auto_Skip_Garaged_Vehicles_ != null) && this.auto_Skip_Garaged_Vehicles_.equals(rhs.auto_Skip_Garaged_Vehicles_)))) && (this.mULTI_Damage_Multiplier == rhs.mULTI_Damage_Multiplier)) && ((this.transparent_Trainer_Lead_Time_ == rhs.transparent_Trainer_Lead_Time_) || ((this.transparent_Trainer_Lead_Time_ != null) && this.transparent_Trainer_Lead_Time_.equals(rhs.transparent_Trainer_Lead_Time_)))) && (this.number_Race_Results == rhs.number_Race_Results)) && ((this.automatic_Pit_Menu_ == rhs.automatic_Pit_Menu_) || ((this.automatic_Pit_Menu_ != null) && this.automatic_Pit_Menu_.equals(rhs.automatic_Pit_Menu_)))) && (this.record_Replays == rhs.record_Replays)) && (this.spotter_Laptimes == rhs.spotter_Laptimes)) && ((this.save_All_Replay_Sessions_ == rhs.save_All_Replay_Sessions_) || ((this.save_All_Replay_Sessions_ != null) && this.save_All_Replay_Sessions_.equals(rhs.save_All_Replay_Sessions_)))) && (this.pause_If_Focus_Lost == rhs.pause_If_Focus_Lost)) && ((this.fixed_AI_Setups_ == rhs.fixed_AI_Setups_) || ((this.fixed_AI_Setups_ != null) && this.fixed_AI_Setups_.equals(rhs.fixed_AI_Setups_)))) && ((this.gPRIX_Race_Time_ == rhs.gPRIX_Race_Time_) || ((this.gPRIX_Race_Time_ != null) && this.gPRIX_Race_Time_.equals(rhs.gPRIX_Race_Time_)))) && ((this.inactive_Sleep_Time_ == rhs.inactive_Sleep_Time_) || ((this.inactive_Sleep_Time_ != null) && this.inactive_Sleep_Time_.equals(rhs.inactive_Sleep_Time_)))) && (this.basic_Display == rhs.basic_Display)) && ((this.transparent_Trainer_Lap_ == rhs.transparent_Trainer_Lap_) || ((this.transparent_Trainer_Lap_ != null) && this.transparent_Trainer_Lap_.equals(rhs.transparent_Trainer_Lap_)))) && ((this.disable_NetComm_ == rhs.disable_NetComm_) || ((this.disable_NetComm_ != null) && this.disable_NetComm_.equals(rhs.disable_NetComm_)))) && (this.gPRIX_Fuel_Consumption_Multiplier == rhs.gPRIX_Fuel_Consumption_Multiplier)) && ((this.auto_Line_Smoothing_ == rhs.auto_Line_Smoothing_) || ((this.auto_Line_Smoothing_ != null) && this.auto_Line_Smoothing_.equals(rhs.auto_Line_Smoothing_)))) && (this.difficulty == rhs.difficulty)) && ((this.gPRIX_Speed_Compensation_ == rhs.gPRIX_Speed_Compensation_) || ((this.gPRIX_Speed_Compensation_ != null) && this.gPRIX_Speed_Compensation_.equals(rhs.gPRIX_Speed_Compensation_)))) && (Float.floatToIntBits(this.aI_Aggression) == Float.floatToIntBits(rhs.aI_Aggression))) && (this.gPRIX_Opponents == rhs.gPRIX_Opponents)) && (this.gPRIX_FreeSettings == rhs.gPRIX_FreeSettings)) && ((this.one_Lap_To_Go_Warning_ == rhs.one_Lap_To_Go_Warning_) || ((this.one_Lap_To_Go_Warning_ != null) && this.one_Lap_To_Go_Warning_.equals(rhs.one_Lap_To_Go_Warning_)))) && ((this.transparent_Trainer_Proximity_ == rhs.transparent_Trainer_Proximity_) || ((this.transparent_Trainer_Proximity_ != null) && this.transparent_Trainer_Proximity_.equals(rhs.transparent_Trainer_Proximity_)))) && (this.aI_Power_Calibration == rhs.aI_Power_Calibration)) && ((this.fixed_Setups_ == rhs.fixed_Setups_) || ((this.fixed_Setups_ != null) && this.fixed_Setups_.equals(rhs.fixed_Setups_)))) && (this.aI_Calibrate_Sample_Size == rhs.aI_Calibrate_Sample_Size)) && (this.gPRIX_AI_Driver_Strength == rhs.gPRIX_AI_Driver_Strength)) && ((this.cHAMP_Allowed_Vehicles == rhs.cHAMP_Allowed_Vehicles) || ((this.cHAMP_Allowed_Vehicles != null) && this.cHAMP_Allowed_Vehicles.equals(rhs.cHAMP_Allowed_Vehicles)))) && ((this.speed_Comp_Dist_ == rhs.speed_Comp_Dist_) || ((this.speed_Comp_Dist_ != null) && this.speed_Comp_Dist_.equals(rhs.speed_Comp_Dist_)))) && (this.disconnected_Results == rhs.disconnected_Results)) && (this.user_Vehicle_Data == rhs.user_Vehicle_Data)) && (this.attack_Zone_AR_Time == rhs.attack_Zone_AR_Time)) && (this.ghost_AI == rhs.ghost_AI)) && ((this.spotter_Behind_ == rhs.spotter_Behind_) || ((this.spotter_Behind_ != null) && this.spotter_Behind_.equals(rhs.spotter_Behind_)))) && ((this.monitor_Auto_Replay_ == rhs.monitor_Auto_Replay_) || ((this.monitor_Auto_Replay_ != null) && this.monitor_Auto_Replay_.equals(rhs.monitor_Auto_Replay_)))) && (this.mULTI_Race_Laps == rhs.mULTI_Race_Laps)) && (this.mULTI_Fuel_Consumption_Multiplier == rhs.mULTI_Fuel_Consumption_Multiplier)) && ((this.warmup_length_ == rhs.warmup_length_) || ((this.warmup_length_ != null) && this.warmup_length_.equals(rhs.warmup_length_)))) && ((this.aI_Corner_Grip_Usage_ == rhs.aI_Corner_Grip_Usage_) || ((this.aI_Corner_Grip_Usage_ != null) && this.aI_Corner_Grip_Usage_.equals(rhs.aI_Corner_Grip_Usage_)))) && ((this.aI_Power_Calibration_ == rhs.aI_Power_Calibration_) || ((this.aI_Power_Calibration_ != null) && this.aI_Power_Calibration_.equals(rhs.aI_Power_Calibration_)))) && (this.compress_Replay == rhs.compress_Replay)) && (this.basic_Rules == rhs.basic_Rules)) && ((this.damper_Units_ == rhs.damper_Units_) || ((this.damper_Units_ != null) && this.damper_Units_.equals(rhs.damper_Units_)))) && ((this.aI_Calibrate_Sample_Size_ == rhs.aI_Calibrate_Sample_Size_) || ((this.aI_Calibrate_Sample_Size_ != null) && this.aI_Calibrate_Sample_Size_.equals(rhs.aI_Calibrate_Sample_Size_)))) && ((this.pause_If_Focus_Lost_ == rhs.pause_If_Focus_Lost_) || ((this.pause_If_Focus_Lost_ != null) && this.pause_If_Focus_Lost_.equals(rhs.pause_If_Focus_Lost_)))) && (this.rPLAY_Race_Time == rhs.rPLAY_Race_Time)) && (this.cHAMP_AI_Driver_Strength == rhs.cHAMP_AI_Driver_Strength)) && ((this.transparent_Trainer_Alpha_ == rhs.transparent_Trainer_Alpha_) || ((this.transparent_Trainer_Alpha_ != null) && this.transparent_Trainer_Alpha_.equals(rhs.transparent_Trainer_Alpha_)))) && (this.rPLAY_AI_Driver_Strength == rhs.rPLAY_AI_Driver_Strength)) && ((this.aI_Fuel_Mult_ == rhs.aI_Fuel_Mult_) || ((this.aI_Fuel_Mult_ != null) && this.aI_Fuel_Mult_.equals(rhs.aI_Fuel_Mult_)))) && (this.rPLAY_Tire_Wear_Multiplier == rhs.rPLAY_Tire_Wear_Multiplier)) && ((this.realTimeLogging_ == rhs.realTimeLogging_) || ((this.realTimeLogging_ != null) && this.realTimeLogging_.equals(rhs.realTimeLogging_)))) && ((this.relevant_Setups_Only_ == rhs.relevant_Setups_Only_) || ((this.relevant_Setups_Only_ != null) && this.relevant_Setups_Only_.equals(rhs.relevant_Setups_Only_)))) && (this.mULTI_Race_Finish_Criteria == rhs.mULTI_Race_Finish_Criteria)) && (this.rPLAY_Opponents == rhs.rPLAY_Opponents)) && (this.smart_Pitcrew == rhs.smart_Pitcrew)) && (this.realtime_Splits == rhs.realtime_Splits)) && (this.multi_session_Results == rhs.multi_session_Results)) && (this.one_Lap_To_Go_Warning == rhs.one_Lap_To_Go_Warning)) && (this.starting_Pos == rhs.starting_Pos)) && ((this.wait_For_All_Plugins_To_Load_ == rhs.wait_For_All_Plugins_To_Load_) || ((this.wait_For_All_Plugins_To_Load_ != null) && this.wait_For_All_Plugins_To_Load_.equals(rhs.wait_For_All_Plugins_To_Load_)))) && (this.relative_Fuel_Strategy == rhs.relative_Fuel_Strategy)) && (this.active_Sleep_Time == rhs.active_Sleep_Time)) && (this.auto_Skip_Garaged_Vehicles == rhs.auto_Skip_Garaged_Vehicles)) && ((this.monitor_AI_Postfix == rhs.monitor_AI_Postfix) || ((this.monitor_AI_Postfix != null) && this.monitor_AI_Postfix.equals(rhs.monitor_AI_Postfix)))) && ((this.mULTI_Allowed_Vehicles == rhs.mULTI_Allowed_Vehicles) || ((this.mULTI_Allowed_Vehicles != null) && this.mULTI_Allowed_Vehicles.equals(rhs.mULTI_Allowed_Vehicles)))) && (this.keep_Received_Setups == rhs.keep_Received_Setups)) && (this.cHAMP_FreeSettings == rhs.cHAMP_FreeSettings)) && ((this.cURNT_Allowed_Vehicles == rhs.cURNT_Allowed_Vehicles) || ((this.cURNT_Allowed_Vehicles != null) && this.cURNT_Allowed_Vehicles.equals(rhs.cURNT_Allowed_Vehicles)))) && (this.mULTI_Tire_Wear_Multiplier == rhs.mULTI_Tire_Wear_Multiplier)) && (this.cURNT_AI_Driver_Strength == rhs.cURNT_AI_Driver_Strength)) && (this.cURNT_Speed_Compensation == rhs.cURNT_Speed_Compensation)) && ((this.spotter_Laptimes_ == rhs.spotter_Laptimes_) || ((this.spotter_Laptimes_ != null) && this.spotter_Laptimes_.equals(rhs.spotter_Laptimes_)))) && (this.disable_Resume_in_Replay == rhs.disable_Resume_in_Replay)) && ((this.aI_Mistakes_ == rhs.aI_Mistakes_) || ((this.aI_Mistakes_ != null) && this.aI_Mistakes_.equals(rhs.aI_Mistakes_)))) && (Float.floatToIntBits(this.transparent_Trainer_Alpha) == Float.floatToIntBits(rhs.transparent_Trainer_Alpha))) && (this.replay_Base_Fidelity == rhs.replay_Base_Fidelity)) && (this.cURNT_Damage_Multiplier == rhs.cURNT_Damage_Multiplier)) && (this.automatic_Pit_Menu == rhs.automatic_Pit_Menu)) && (this.inactive_Sleep_Time == rhs.inactive_Sleep_Time)) && (this.autocalibrate_AI_Mode == rhs.autocalibrate_AI_Mode)) && (this.cHAMP_Opponents == rhs.cHAMP_Opponents)) && ((this.compress_Replay_ == rhs.compress_Replay_) || ((this.compress_Replay_ != null) && this.compress_Replay_.equals(rhs.compress_Replay_)))) && (this.play_Movies == rhs.play_Movies)) && (this.cURNT_Race_Finish_Criteria == rhs.cURNT_Race_Finish_Criteria)) && (this.rPLAY_FreeSettings == rhs.rPLAY_FreeSettings)) && (Float.floatToIntBits(this.aI_Fuel_Mult) == Float.floatToIntBits(rhs.aI_Fuel_Mult))) && ((this.record_Hotlaps_ == rhs.record_Hotlaps_) || ((this.record_Hotlaps_ != null) && this.record_Hotlaps_.equals(rhs.record_Hotlaps_)))) && (this.cHAMP_Tire_Wear_Multiplier == rhs.cHAMP_Tire_Wear_Multiplier)) && (this.fixed_AI_Setups == rhs.fixed_AI_Setups)) && (this.rPLAY_Race_Laps == rhs.rPLAY_Race_Laps)) && (this.cURNT_CrashRecovery == rhs.cURNT_CrashRecovery)) && ((this.disconnected_Results_ == rhs.disconnected_Results_) || ((this.disconnected_Results_ != null) && this.disconnected_Results_.equals(rhs.disconnected_Results_)))) && (this.championship_Basic_Rules == rhs.championship_Basic_Rules)) && ((this.active_Sleep_Time_ == rhs.active_Sleep_Time_) || ((this.active_Sleep_Time_ != null) && this.active_Sleep_Time_.equals(rhs.active_Sleep_Time_)))) && (Float.floatToIntBits(this.gPRIX_Race_Length) == Float.floatToIntBits(rhs.gPRIX_Race_Length))) && (Float.floatToIntBits(this.aI_Corner_Grip_Usage) == Float.floatToIntBits(rhs.aI_Corner_Grip_Usage))) && (this.auto_Line_Smoothing == rhs.auto_Line_Smoothing)) && ((this.gPRIX_Damage_Multiplier_ == rhs.gPRIX_Damage_Multiplier_) || ((this.gPRIX_Damage_Multiplier_ != null) && this.gPRIX_Damage_Multiplier_.equals(rhs.gPRIX_Damage_Multiplier_)))) && ((this.keep_Received_Setups_ == rhs.keep_Received_Setups_) || ((this.keep_Received_Setups_ != null) && this.keep_Received_Setups_.equals(rhs.keep_Received_Setups_)))) && (this.cURNT_Race_Time == rhs.cURNT_Race_Time)) && (this.qualifying_length == rhs.qualifying_length)) && (this.aI_Logic_Override == rhs.aI_Logic_Override)) && ((this.disable_Resume_in_Replay_ == rhs.disable_Resume_in_Replay_) || ((this.disable_Resume_in_Replay_ != null) && this.disable_Resume_in_Replay_.equals(rhs.disable_Resume_in_Replay_)))) && ((this.gPRIX_CrashRecovery_ == rhs.gPRIX_CrashRecovery_) || ((this.gPRIX_CrashRecovery_ != null) && this.gPRIX_CrashRecovery_.equals(rhs.gPRIX_CrashRecovery_)))) && (this.qualifying_laps == rhs.qualifying_laps)) && (this.find_Default_Setup == rhs.find_Default_Setup)) && (this.cURNT_Opponents == rhs.cURNT_Opponents)) && ((this.standings_Func_ == rhs.standings_Func_) || ((this.standings_Func_ != null) && this.standings_Func_.equals(rhs.standings_Func_)))) && ((this.gPRIX_Allowed_Vehicles == rhs.gPRIX_Allowed_Vehicles) || ((this.gPRIX_Allowed_Vehicles != null) && this.gPRIX_Allowed_Vehicles.equals(rhs.gPRIX_Allowed_Vehicles)))) && (this.transparent_Trainer_Lap == rhs.transparent_Trainer_Lap)) && ((this.multi_session_Results_ == rhs.multi_session_Results_) || ((this.multi_session_Results_ != null) && this.multi_session_Results_.equals(rhs.multi_session_Results_)))) && ((this.qualifying_laps_ == rhs.qualifying_laps_) || ((this.qualifying_laps_ != null) && this.qualifying_laps_.equals(rhs.qualifying_laps_)))) && (this.mULTI_CrashRecovery == rhs.mULTI_CrashRecovery)) && (this.full_Player_Replay == rhs.full_Player_Replay)) && (this.mULTI_AI_Driver_Strength == rhs.mULTI_AI_Driver_Strength)) && ((this.monitor_Admin_Postfix_ == rhs.monitor_Admin_Postfix_) || ((this.monitor_Admin_Postfix_ != null) && this.monitor_Admin_Postfix_.equals(rhs.monitor_Admin_Postfix_)))) && ((this.show_Extra_Lap_ == rhs.show_Extra_Lap_) || ((this.show_Extra_Lap_ != null) && this.show_Extra_Lap_.equals(rhs.show_Extra_Lap_)))) && (Float.floatToIntBits(this.rPLAY_Race_Length) == Float.floatToIntBits(rhs.rPLAY_Race_Length))) && (this.mULTI_Speed_Compensation == rhs.mULTI_Speed_Compensation)) && ((this.measurement_Units_ == rhs.measurement_Units_) || ((this.measurement_Units_ != null) && this.measurement_Units_.equals(rhs.measurement_Units_)))) && ((this.record_To_Memory_ == rhs.record_To_Memory_) || ((this.record_To_Memory_ != null) && this.record_To_Memory_.equals(rhs.record_To_Memory_)))) && ((this.smart_Pitcrew_ == rhs.smart_Pitcrew_) || ((this.smart_Pitcrew_ != null) && this.smart_Pitcrew_.equals(rhs.smart_Pitcrew_)))) && ((this.monitor_AI_Postfix_ == rhs.monitor_AI_Postfix_) || ((this.monitor_AI_Postfix_ != null) && this.monitor_AI_Postfix_.equals(rhs.monitor_AI_Postfix_)))) && ((this.pitstop_Description_ == rhs.pitstop_Description_) || ((this.pitstop_Description_ != null) && this.pitstop_Description_.equals(rhs.pitstop_Description_)))) && (this.cHAMP_Fuel_Consumption_Multiplier == rhs.cHAMP_Fuel_Consumption_Multiplier)) && ((this.temporary_Replay_Keys_ == rhs.temporary_Replay_Keys_) || ((this.temporary_Replay_Keys_ != null) && this.temporary_Replay_Keys_.equals(rhs.temporary_Replay_Keys_)))) && (this.mULTI_Opponents == rhs.mULTI_Opponents)) && (this.record_To_Memory == rhs.record_To_Memory)) && (this.gPRIX_Race_Finish_Criteria == rhs.gPRIX_Race_Finish_Criteria)) && ((this.find_Default_Setup_ == rhs.find_Default_Setup_) || ((this.find_Default_Setup_ != null) && this.find_Default_Setup_.equals(rhs.find_Default_Setup_)))) && (this.display_Track_Stats == rhs.display_Track_Stats)) && (this.aI_Mistakes == rhs.aI_Mistakes)) && (this.warmup_length == rhs.warmup_length)) && (this.spotter_Detail == rhs.spotter_Detail)) && ((this.monitor_Admin_Postfix == rhs.monitor_Admin_Postfix) || ((this.monitor_Admin_Postfix != null) && this.monitor_Admin_Postfix.equals(rhs.monitor_Admin_Postfix)))) && (this.vehicle_Removal == rhs.vehicle_Removal)) && (this.exit_Confirmation == rhs.exit_Confirmation)) && ((this.vehicle_Removal_ == rhs.vehicle_Removal_) || ((this.vehicle_Removal_ != null) && this.vehicle_Removal_.equals(rhs.vehicle_Removal_)))) && (this.tooltips == rhs.tooltips)) && (this.realTimeLogging == rhs.realTimeLogging)) && (this.aI_Formation_by_Position == rhs.aI_Formation_by_Position)) && ((this.record_Replays_ == rhs.record_Replays_) || ((this.record_Replays_ != null) && this.record_Replays_.equals(rhs.record_Replays_)))) && (this.practice_length == rhs.practice_length)) && (this.aI_Limiter == rhs.aI_Limiter)) && ((this.aI_Logic_Override_ == rhs.aI_Logic_Override_) || ((this.aI_Logic_Override_ != null) && this.aI_Logic_Override_.equals(rhs.aI_Logic_Override_)))) && (this.cHAMP_Race_Time == rhs.cHAMP_Race_Time)) && (this.speed_Comp_Dist == rhs.speed_Comp_Dist)) && ((this.race_Stint_Offset_ == rhs.race_Stint_Offset_) || ((this.race_Stint_Offset_ != null) && this.race_Stint_Offset_.equals(rhs.race_Stint_Offset_)))) && (this.cHAMP_CrashRecovery == rhs.cHAMP_CrashRecovery)) && (this.cURNT_FreeSettings == rhs.cURNT_FreeSettings)) && ((this.relative_Fuel_Strategy_ == rhs.relative_Fuel_Strategy_) || ((this.relative_Fuel_Strategy_ != null) && this.relative_Fuel_Strategy_.equals(rhs.relative_Fuel_Strategy_)))) && (this.auto_change_Opponent_List == rhs.auto_change_Opponent_List)) && (this.record_Hotlaps == rhs.record_Hotlaps)) && (this.gPRIX_Race_Laps == rhs.gPRIX_Race_Laps)) && (this.pitstop_Description == rhs.pitstop_Description)) && (Float.floatToIntBits(this.transparent_Trainer_Lead_Time) == Float.floatToIntBits(rhs.transparent_Trainer_Lead_Time))) && (this.monitor_Auto_Replay == rhs.monitor_Auto_Replay)) && (this.rPLAY_CrashRecovery == rhs.rPLAY_CrashRecovery)) && (this.speed_Units == rhs.speed_Units)) && (this.save_All_Replay_Sessions == rhs.save_All_Replay_Sessions)) && (this.gPRIX_Tire_Wear_Multiplier == rhs.gPRIX_Tire_Wear_Multiplier)) && (this.cHAMP_Race_Finish_Criteria == rhs.cHAMP_Race_Finish_Criteria)) && (this.gPRIX_Damage_Multiplier == rhs.gPRIX_Damage_Multiplier)) && (this.cHAMP_Damage_Multiplier == rhs.cHAMP_Damage_Multiplier));
    }

}
