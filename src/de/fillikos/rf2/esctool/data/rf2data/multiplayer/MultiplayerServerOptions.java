package de.fillikos.rf2.esctool.data.rf2data.multiplayer;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Admin Functionality",
        "Admin Functionality#",
        "Admin Password",
        "Admin Password#",
        "Allow AI Toggle",
        "Allow AI Toggle#",
        "Allow Any Event",
        "Allow Any Event#",
        "Allow Hotlap Completion",
        "Allow Hotlap Completion#",
        "Allow Hotswaps",
        "Allow Hotswaps#",
        "Allow Passenger Chat",
        "Allow Passenger Chat#",
        "Allow Passengers",
        "Allow Passengers#",
        "Allow Spectator Chat",
        "Allow Spectator Chat#",
        "Allow Spectators",
        "Allow Spectators#",
        "Allowed Antilock Brakes",
        "Allowed Antilock Brakes#",
        "Allowed Auto Blip",
        "Allowed Auto Blip#",
        "Allowed Auto Clutch",
        "Allowed Auto Clutch#",
        "Allowed Auto Lift",
        "Allowed Auto Lift#",
        "Allowed Auto Pit",
        "Allowed Auto Pit#",
        "Allowed Auto Shift",
        "Allowed Auto Shift#",
        "Allowed Brake Help",
        "Allowed Brake Help#",
        "Allowed Invulnerability",
        "Allowed Invulnerability#",
        "Allowed Opposite Lock",
        "Allowed Opposite Lock#",
        "Allowed Spin Recovery",
        "Allowed Spin Recovery#",
        "Allowed Stability Control",
        "Allowed Stability Control#",
        "Allowed Steering Help",
        "Allowed Steering Help#",
        "Allowed Traction Control",
        "Allowed Traction Control#",
        "Assign Parking",
        "Assign Parking#",
        "Client Fuel Visible",
        "Client Fuel Visible#",
        "Closed Qualify Sessions",
        "Closed Qualify Sessions#",
        "Closed Race Sessions",
        "Closed Race Sessions#",
        "Collision Fade Thresh",
        "Collision Fade Thresh#",
        "Default Game Name",
        "Default Game Name#",
        "Delay After Race",
        "Delay After Race#",
        "Delay Between Sessions",
        "Delay Between Sessions#",
        "Driver Swap Setups",
        "Driver Swap Setups#",
        "Enable Autodownloads",
        "Enable Autodownloads#",
        "Enforce Real Name",
        "Enforce Real Name#",
        "Forced Driving View",
        "Forced Driving View#",
        "HTTP Server Document Root",
        "HTTP Server Document Root#",
        "HTTP Server Max File Size",
        "HTTP Server Max File Size#",
        "HTTP Server Send Rate",
        "HTTP Server Send Rate#",
        "Isolation",
        "Isolation#",
        "Join Password",
        "Join Password#",
        "Lessen Restrictions",
        "Lessen Restrictions#",
        "Loading Priority",
        "Loading Priority#",
        "Loading Sleep Time",
        "Loading Sleep Time#",
        "Loose Content Transfer",
        "Loose Content Transfer#",
        "Max Data Per Client",
        "Max Data Per Client#",
        "Max MP Players",
        "Maximum AI",
        "Maximum AI#",
        "Minimum AI",
        "Minimum AI#",
        "Must Be Stopped",
        "Must Be Stopped#",
        "Nagle Algorithm",
        "Nagle Algorithm#",
        "Pause At Start Of First Session",
        "Pause At Start Of First Session#",
        "Pause While Zero Players",
        "Pause While Zero Players#",
        "Pit Speed Override",
        "Pit Speed Override#",
        "Plugin Heartbeat Rate",
        "Plugin Heartbeat Rate#",
        "Practice 1 Time",
        "Practice 1 Time#",
        "Qualifying Laps",
        "Qualifying Laps#",
        "Qualifying Time",
        "Qualifying Time#",
        "Race Client Wait",
        "Race Client Wait#",
        "Race Rejoin",
        "Race Rejoin#",
        "Server Session End Timeout",
        "Server Session End Timeout#",
        "SuperAdminPassword",
        "SuperAdminPassword#",
        "Test Day",
        "Test Day#",
        "Unique Vehicle Check",
        "Unique Vehicle Check#",
        "Unthrottle ID",
        "Unthrottle ID#",
        "Unthrottle Prefix",
        "Unthrottle Prefix#",
        "Vote Max Race Restarts",
        "Vote Max Race Restarts#",
        "Vote Min Voters",
        "Vote Min Voters#",
        "Vote Percentage Add AI",
        "Vote Percentage Add AI#",
        "Vote Percentage Next Session",
        "Vote Percentage Next Session#",
        "Vote Percentage Other",
        "Vote Percentage Other#",
        "Warmup Time",
        "Warmup Time#"
})
@Generated("jsonschema2pojo")
public class MultiplayerServerOptions {

    @JsonProperty("Admin Functionality")
    private int admin_Functionality;
    @JsonProperty("Admin Functionality#")
    private String admin_Functionality_;
    @JsonProperty("Admin Password")
    private String admin_Password;
    @JsonProperty("Admin Password#")
    private String admin_Password_;
    @JsonProperty("Allow AI Toggle")
    private boolean allow_AI_Toggle;
    @JsonProperty("Allow AI Toggle#")
    private String allow_AI_Toggle_;
    @JsonProperty("Allow Any Event")
    private int allow_Any_Event;
    @JsonProperty("Allow Any Event#")
    private String allow_Any_Event_;
    @JsonProperty("Allow Hotlap Completion")
    private int allow_Hotlap_Completion;
    @JsonProperty("Allow Hotlap Completion#")
    private String allow_Hotlap_Completion_;
    @JsonProperty("Allow Hotswaps")
    private boolean allow_Hotswaps;
    @JsonProperty("Allow Hotswaps#")
    private String allow_Hotswaps_;
    @JsonProperty("Allow Passenger Chat")
    private boolean allow_Passenger_Chat;
    @JsonProperty("Allow Passenger Chat#")
    private String allow_Passenger_Chat_;
    @JsonProperty("Allow Passengers")
    private boolean allow_Passengers;
    @JsonProperty("Allow Passengers#")
    private String allow_Passengers_;
    @JsonProperty("Allow Spectator Chat")
    private boolean allow_Spectator_Chat;
    @JsonProperty("Allow Spectator Chat#")
    private String allow_Spectator_Chat_;
    @JsonProperty("Allow Spectators")
    private boolean allow_Spectators;
    @JsonProperty("Allow Spectators#")
    private String allow_Spectators_;
    @JsonProperty("Allowed Antilock Brakes")
    private int allowed_Antilock_Brakes;
    @JsonProperty("Allowed Antilock Brakes#")
    private String allowed_Antilock_Brakes_;
    @JsonProperty("Allowed Auto Blip")
    private int allowed_Auto_Blip;
    @JsonProperty("Allowed Auto Blip#")
    private String allowed_Auto_Blip_;
    @JsonProperty("Allowed Auto Clutch")
    private int allowed_Auto_Clutch;
    @JsonProperty("Allowed Auto Clutch#")
    private String allowed_Auto_Clutch_;
    @JsonProperty("Allowed Auto Lift")
    private int allowed_Auto_Lift;
    @JsonProperty("Allowed Auto Lift#")
    private String allowed_Auto_Lift_;
    @JsonProperty("Allowed Auto Pit")
    private int allowed_Auto_Pit;
    @JsonProperty("Allowed Auto Pit#")
    private String allowed_Auto_Pit_;
    @JsonProperty("Allowed Auto Shift")
    private int allowed_Auto_Shift;
    @JsonProperty("Allowed Auto Shift#")
    private String allowed_Auto_Shift_;
    @JsonProperty("Allowed Brake Help")
    private int allowed_Brake_Help;
    @JsonProperty("Allowed Brake Help#")
    private String allowed_Brake_Help_;
    @JsonProperty("Allowed Invulnerability")
    private int allowed_Invulnerability;
    @JsonProperty("Allowed Invulnerability#")
    private String allowed_Invulnerability_;
    @JsonProperty("Allowed Opposite Lock")
    private int allowed_Opposite_Lock;
    @JsonProperty("Allowed Opposite Lock#")
    private String allowed_Opposite_Lock_;
    @JsonProperty("Allowed Spin Recovery")
    private int allowed_Spin_Recovery;
    @JsonProperty("Allowed Spin Recovery#")
    private String allowed_Spin_Recovery_;
    @JsonProperty("Allowed Stability Control")
    private int allowed_Stability_Control;
    @JsonProperty("Allowed Stability Control#")
    private String allowed_Stability_Control_;
    @JsonProperty("Allowed Steering Help")
    private int allowed_Steering_Help;
    @JsonProperty("Allowed Steering Help#")
    private String allowed_Steering_Help_;
    @JsonProperty("Allowed Traction Control")
    private int allowed_Traction_Control;
    @JsonProperty("Allowed Traction Control#")
    private String allowed_Traction_Control_;
    @JsonProperty("Assign Parking")
    private boolean assign_Parking;
    @JsonProperty("Assign Parking#")
    private String assign_Parking_;
    @JsonProperty("Client Fuel Visible")
    private int client_Fuel_Visible;
    @JsonProperty("Client Fuel Visible#")
    private String client_Fuel_Visible_;
    @JsonProperty("Closed Qualify Sessions")
    private int closed_Qualify_Sessions;
    @JsonProperty("Closed Qualify Sessions#")
    private String closed_Qualify_Sessions_;
    @JsonProperty("Closed Race Sessions")
    private int closed_Race_Sessions;
    @JsonProperty("Closed Race Sessions#")
    private String closed_Race_Sessions_;
    @JsonProperty("Collision Fade Thresh")
    private float collision_Fade_Thresh;
    @JsonProperty("Collision Fade Thresh#")
    private String collision_Fade_Thresh_;
    @JsonProperty("Default Game Name")
    private String default_Game_Name;
    @JsonProperty("Default Game Name#")
    private String default_Game_Name_;
    @JsonProperty("Delay After Race")
    private int delay_After_Race;
    @JsonProperty("Delay After Race#")
    private String delay_After_Race_;
    @JsonProperty("Delay Between Sessions")
    private int delay_Between_Sessions;
    @JsonProperty("Delay Between Sessions#")
    private String delay_Between_Sessions_;
    @JsonProperty("Driver Swap Setups")
    private boolean driver_Swap_Setups;
    @JsonProperty("Driver Swap Setups#")
    private String driver_Swap_Setups_;
    @JsonProperty("Enable Autodownloads")
    private boolean enable_Autodownloads;
    @JsonProperty("Enable Autodownloads#")
    private String enable_Autodownloads_;
    @JsonProperty("Enforce Real Name")
    private boolean enforce_Real_Name;
    @JsonProperty("Enforce Real Name#")
    private String enforce_Real_Name_;
    @JsonProperty("Forced Driving View")
    private int forced_Driving_View;
    @JsonProperty("Forced Driving View#")
    private String forced_Driving_View_;
    @JsonProperty("HTTP Server Document Root")
    private String hTTP_Server_Document_Root;
    @JsonProperty("HTTP Server Document Root#")
    private String hTTP_Server_Document_Root_;
    @JsonProperty("HTTP Server Max File Size")
    private int hTTP_Server_Max_File_Size;
    @JsonProperty("HTTP Server Max File Size#")
    private String hTTP_Server_Max_File_Size_;
    @JsonProperty("HTTP Server Send Rate")
    private long hTTP_Server_Send_Rate;
    @JsonProperty("HTTP Server Send Rate#")
    private String hTTP_Server_Send_Rate_;
    @JsonProperty("Isolation")
    private int isolation;
    @JsonProperty("Isolation#")
    private String isolation_;
    @JsonProperty("Join Password")
    private String join_Password;
    @JsonProperty("Join Password#")
    private String join_Password_;
    @JsonProperty("Lessen Restrictions")
    private boolean lessen_Restrictions;
    @JsonProperty("Lessen Restrictions#")
    private String lessen_Restrictions_;
    @JsonProperty("Loading Priority")
    private int loading_Priority;
    @JsonProperty("Loading Priority#")
    private String loading_Priority_;
    @JsonProperty("Loading Sleep Time")
    private int loading_Sleep_Time;
    @JsonProperty("Loading Sleep Time#")
    private String loading_Sleep_Time_;
    @JsonProperty("Loose Content Transfer")
    private int loose_Content_Transfer;
    @JsonProperty("Loose Content Transfer#")
    private String loose_Content_Transfer_;
    @JsonProperty("Max Data Per Client")
    private int max_Data_Per_Client;
    @JsonProperty("Max Data Per Client#")
    private String max_Data_Per_Client_;
    @JsonProperty("Max MP Players")
    private int max_MP_Players;
    @JsonProperty("Maximum AI")
    private int maximum_AI;
    @JsonProperty("Maximum AI#")
    private String maximum_AI_;
    @JsonProperty("Minimum AI")
    private int minimum_AI;
    @JsonProperty("Minimum AI#")
    private String minimum_AI_;
    @JsonProperty("Must Be Stopped")
    private boolean must_Be_Stopped;
    @JsonProperty("Must Be Stopped#")
    private String must_Be_Stopped_;
    @JsonProperty("Nagle Algorithm")
    private boolean nagle_Algorithm;
    @JsonProperty("Nagle Algorithm#")
    private String nagle_Algorithm_;
    @JsonProperty("Pause At Start Of First Session")
    private boolean pause_At_Start_Of_First_Session;
    @JsonProperty("Pause At Start Of First Session#")
    private String pause_At_Start_Of_First_Session_;
    @JsonProperty("Pause While Zero Players")
    private boolean pause_While_Zero_Players;
    @JsonProperty("Pause While Zero Players#")
    private String pause_While_Zero_Players_;
    @JsonProperty("Pit Speed Override")
    private int pit_Speed_Override;
    @JsonProperty("Pit Speed Override#")
    private String pit_Speed_Override_;
    @JsonProperty("Plugin Heartbeat Rate")
    private int plugin_Heartbeat_Rate;
    @JsonProperty("Plugin Heartbeat Rate#")
    private String plugin_Heartbeat_Rate_;
    @JsonProperty("Practice 1 Time")
    private int practice_1_Time;
    @JsonProperty("Practice 1 Time#")
    private String practice_1_Time_;
    @JsonProperty("Qualifying Laps")
    private int qualifying_Laps;
    @JsonProperty("Qualifying Laps#")
    private String qualifying_Laps_;
    @JsonProperty("Qualifying Time")
    private int qualifying_Time;
    @JsonProperty("Qualifying Time#")
    private String qualifying_Time_;
    @JsonProperty("Race Client Wait")
    private int race_Client_Wait;
    @JsonProperty("Race Client Wait#")
    private String race_Client_Wait_;
    @JsonProperty("Race Rejoin")
    private int race_Rejoin;
    @JsonProperty("Race Rejoin#")
    private String race_Rejoin_;
    @JsonProperty("Server Session End Timeout")
    private int server_Session_End_Timeout;
    @JsonProperty("Server Session End Timeout#")
    private String server_Session_End_Timeout_;
    @JsonProperty("SuperAdminPassword")
    private String superAdminPassword;
    @JsonProperty("SuperAdminPassword#")
    private String superAdminPassword_;
    @JsonProperty("Test Day")
    private boolean test_Day;
    @JsonProperty("Test Day#")
    private String test_Day_;
    @JsonProperty("Unique Vehicle Check")
    private boolean unique_Vehicle_Check;
    @JsonProperty("Unique Vehicle Check#")
    private String unique_Vehicle_Check_;
    @JsonProperty("Unthrottle ID")
    private int unthrottle_ID;
    @JsonProperty("Unthrottle ID#")
    private String unthrottle_ID_;
    @JsonProperty("Unthrottle Prefix")
    private String unthrottle_Prefix;
    @JsonProperty("Unthrottle Prefix#")
    private String unthrottle_Prefix_;
    @JsonProperty("Vote Max Race Restarts")
    private int vote_Max_Race_Restarts;
    @JsonProperty("Vote Max Race Restarts#")
    private String vote_Max_Race_Restarts_;
    @JsonProperty("Vote Min Voters")
    private int vote_Min_Voters;
    @JsonProperty("Vote Min Voters#")
    private String vote_Min_Voters_;
    @JsonProperty("Vote Percentage Add AI")
    private int vote_Percentage_Add_AI;
    @JsonProperty("Vote Percentage Add AI#")
    private String vote_Percentage_Add_AI_;
    @JsonProperty("Vote Percentage Next Session")
    private int vote_Percentage_Next_Session;
    @JsonProperty("Vote Percentage Next Session#")
    private String vote_Percentage_Next_Session_;
    @JsonProperty("Vote Percentage Other")
    private int vote_Percentage_Other;
    @JsonProperty("Vote Percentage Other#")
    private String vote_Percentage_Other_;
    @JsonProperty("Warmup Time")
    private int warmup_Time;
    @JsonProperty("Warmup Time#")
    private String warmup_Time_;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public MultiplayerServerOptions() {
    }

    /**
     * @param allow_Passenger_Chat
     * @param allowed_Traction_Control
     * @param admin_Password_
     * @param join_Password_
     * @param superAdminPassword
     * @param allowed_Steering_Help
     * @param loading_Sleep_Time_
     * @param vote_Percentage_Other_
     * @param vote_Percentage_Add_AI_
     * @param enforce_Real_Name
     * @param allow_Hotlap_Completion
     * @param allowed_Opposite_Lock_
     * @param pause_While_Zero_Players_
     * @param forced_Driving_View_
     * @param vote_Percentage_Add_AI
     * @param allow_Spectator_Chat_
     * @param allow_Spectators_
     * @param vote_Max_Race_Restarts
     * @param default_Game_Name
     * @param forced_Driving_View
     * @param allowed_Auto_Clutch_
     * @param loading_Priority_
     * @param practice_1_Time
     * @param qualifying_Laps_
     * @param unthrottle_ID
     * @param isolation
     * @param collision_Fade_Thresh
     * @param lessen_Restrictions_
     * @param unthrottle_Prefix_
     * @param pause_At_Start_Of_First_Session
     * @param allowed_Spin_Recovery_
     * @param loose_Content_Transfer_
     * @param allow_AI_Toggle_
     * @param allowed_Opposite_Lock
     * @param race_Rejoin
     * @param allowed_Auto_Blip
     * @param loading_Priority
     * @param pit_Speed_Override
     * @param allowed_Auto_Pit_
     * @param qualifying_Laps
     * @param client_Fuel_Visible
     * @param nagle_Algorithm
     * @param enable_Autodownloads_
     * @param closed_Qualify_Sessions
     * @param race_Rejoin_
     * @param delay_After_Race_
     * @param warmup_Time_
     * @param allowed_Auto_Lift
     * @param allow_Passengers
     * @param vote_Percentage_Other
     * @param allowed_Brake_Help
     * @param vote_Percentage_Next_Session
     * @param allow_Passengers_
     * @param join_Password
     * @param nagle_Algorithm_
     * @param test_Day_
     * @param closed_Race_Sessions_
     * @param enforce_Real_Name_
     * @param unique_Vehicle_Check_
     * @param allow_Any_Event
     * @param maximum_AI
     * @param vote_Percentage_Next_Session_
     * @param allowed_Auto_Clutch
     * @param allowed_Auto_Shift_
     * @param allowed_Auto_Pit
     * @param lessen_Restrictions
     * @param race_Client_Wait
     * @param hTTP_Server_Document_Root_
     * @param allow_Passenger_Chat_
     * @param allowed_Spin_Recovery
     * @param hTTP_Server_Max_File_Size_
     * @param delay_Between_Sessions_
     * @param unthrottle_Prefix
     * @param allow_Hotlap_Completion_
     * @param allowed_Auto_Blip_
     * @param superAdminPassword_
     * @param delay_After_Race
     * @param pause_While_Zero_Players
     * @param plugin_Heartbeat_Rate_
     * @param minimum_AI_
     * @param allowed_Invulnerability
     * @param driver_Swap_Setups_
     * @param hTTP_Server_Send_Rate
     * @param vote_Min_Voters_
     * @param admin_Functionality_
     * @param allow_Hotswaps_
     * @param delay_Between_Sessions
     * @param hTTP_Server_Document_Root
     * @param admin_Password
     * @param plugin_Heartbeat_Rate
     * @param must_Be_Stopped
     * @param allow_Any_Event_
     * @param vote_Max_Race_Restarts_
     * @param enable_Autodownloads
     * @param max_Data_Per_Client
     * @param allowed_Auto_Shift
     * @param allowed_Brake_Help_
     * @param must_Be_Stopped_
     * @param allowed_Invulnerability_
     * @param assign_Parking_
     * @param assign_Parking
     * @param client_Fuel_Visible_
     * @param default_Game_Name_
     * @param max_MP_Players
     * @param hTTP_Server_Send_Rate_
     * @param qualifying_Time_
     * @param allow_Spectator_Chat
     * @param max_Data_Per_Client_
     * @param allow_AI_Toggle
     * @param hTTP_Server_Max_File_Size
     * @param allowed_Antilock_Brakes
     * @param pause_At_Start_Of_First_Session_
     * @param qualifying_Time
     * @param admin_Functionality
     * @param minimum_AI
     * @param driver_Swap_Setups
     * @param warmup_Time
     * @param allowed_Antilock_Brakes_
     * @param collision_Fade_Thresh_
     * @param vote_Min_Voters
     * @param race_Client_Wait_
     * @param allowed_Stability_Control
     * @param maximum_AI_
     * @param test_Day
     * @param server_Session_End_Timeout_
     * @param allowed_Stability_Control_
     * @param isolation_
     * @param server_Session_End_Timeout
     * @param closed_Qualify_Sessions_
     * @param closed_Race_Sessions
     * @param allow_Spectators
     * @param loose_Content_Transfer
     * @param allow_Hotswaps
     * @param allowed_Traction_Control_
     * @param allowed_Auto_Lift_
     * @param pit_Speed_Override_
     * @param unique_Vehicle_Check
     * @param practice_1_Time_
     * @param unthrottle_ID_
     * @param loading_Sleep_Time
     * @param allowed_Steering_Help_
     */
    public MultiplayerServerOptions(int admin_Functionality, String admin_Functionality_, String admin_Password, String admin_Password_, boolean allow_AI_Toggle, String allow_AI_Toggle_, int allow_Any_Event, String allow_Any_Event_, int allow_Hotlap_Completion, String allow_Hotlap_Completion_, boolean allow_Hotswaps, String allow_Hotswaps_, boolean allow_Passenger_Chat, String allow_Passenger_Chat_, boolean allow_Passengers, String allow_Passengers_, boolean allow_Spectator_Chat, String allow_Spectator_Chat_, boolean allow_Spectators, String allow_Spectators_, int allowed_Antilock_Brakes, String allowed_Antilock_Brakes_, int allowed_Auto_Blip, String allowed_Auto_Blip_, int allowed_Auto_Clutch, String allowed_Auto_Clutch_, int allowed_Auto_Lift, String allowed_Auto_Lift_, int allowed_Auto_Pit, String allowed_Auto_Pit_, int allowed_Auto_Shift, String allowed_Auto_Shift_, int allowed_Brake_Help, String allowed_Brake_Help_, int allowed_Invulnerability, String allowed_Invulnerability_, int allowed_Opposite_Lock, String allowed_Opposite_Lock_, int allowed_Spin_Recovery, String allowed_Spin_Recovery_, int allowed_Stability_Control, String allowed_Stability_Control_, int allowed_Steering_Help, String allowed_Steering_Help_, int allowed_Traction_Control, String allowed_Traction_Control_, boolean assign_Parking, String assign_Parking_, int client_Fuel_Visible, String client_Fuel_Visible_, int closed_Qualify_Sessions, String closed_Qualify_Sessions_, int closed_Race_Sessions, String closed_Race_Sessions_, float collision_Fade_Thresh, String collision_Fade_Thresh_, String default_Game_Name, String default_Game_Name_, int delay_After_Race, String delay_After_Race_, int delay_Between_Sessions, String delay_Between_Sessions_, boolean driver_Swap_Setups, String driver_Swap_Setups_, boolean enable_Autodownloads, String enable_Autodownloads_, boolean enforce_Real_Name, String enforce_Real_Name_, int forced_Driving_View, String forced_Driving_View_, String hTTP_Server_Document_Root, String hTTP_Server_Document_Root_, int hTTP_Server_Max_File_Size, String hTTP_Server_Max_File_Size_, long hTTP_Server_Send_Rate, String hTTP_Server_Send_Rate_, int isolation, String isolation_, String join_Password, String join_Password_, boolean lessen_Restrictions, String lessen_Restrictions_, int loading_Priority, String loading_Priority_, int loading_Sleep_Time, String loading_Sleep_Time_, int loose_Content_Transfer, String loose_Content_Transfer_, int max_Data_Per_Client, String max_Data_Per_Client_, int max_MP_Players, int maximum_AI, String maximum_AI_, int minimum_AI, String minimum_AI_, boolean must_Be_Stopped, String must_Be_Stopped_, boolean nagle_Algorithm, String nagle_Algorithm_, boolean pause_At_Start_Of_First_Session, String pause_At_Start_Of_First_Session_, boolean pause_While_Zero_Players, String pause_While_Zero_Players_, int pit_Speed_Override, String pit_Speed_Override_, int plugin_Heartbeat_Rate, String plugin_Heartbeat_Rate_, int practice_1_Time, String practice_1_Time_, int qualifying_Laps, String qualifying_Laps_, int qualifying_Time, String qualifying_Time_, int race_Client_Wait, String race_Client_Wait_, int race_Rejoin, String race_Rejoin_, int server_Session_End_Timeout, String server_Session_End_Timeout_, String superAdminPassword, String superAdminPassword_, boolean test_Day, String test_Day_, boolean unique_Vehicle_Check, String unique_Vehicle_Check_, int unthrottle_ID, String unthrottle_ID_, String unthrottle_Prefix, String unthrottle_Prefix_, int vote_Max_Race_Restarts, String vote_Max_Race_Restarts_, int vote_Min_Voters, String vote_Min_Voters_, int vote_Percentage_Add_AI, String vote_Percentage_Add_AI_, int vote_Percentage_Next_Session, String vote_Percentage_Next_Session_, int vote_Percentage_Other, String vote_Percentage_Other_, int warmup_Time, String warmup_Time_) {
        super();
        this.admin_Functionality = admin_Functionality;
        this.admin_Functionality_ = admin_Functionality_;
        this.admin_Password = admin_Password;
        this.admin_Password_ = admin_Password_;
        this.allow_AI_Toggle = allow_AI_Toggle;
        this.allow_AI_Toggle_ = allow_AI_Toggle_;
        this.allow_Any_Event = allow_Any_Event;
        this.allow_Any_Event_ = allow_Any_Event_;
        this.allow_Hotlap_Completion = allow_Hotlap_Completion;
        this.allow_Hotlap_Completion_ = allow_Hotlap_Completion_;
        this.allow_Hotswaps = allow_Hotswaps;
        this.allow_Hotswaps_ = allow_Hotswaps_;
        this.allow_Passenger_Chat = allow_Passenger_Chat;
        this.allow_Passenger_Chat_ = allow_Passenger_Chat_;
        this.allow_Passengers = allow_Passengers;
        this.allow_Passengers_ = allow_Passengers_;
        this.allow_Spectator_Chat = allow_Spectator_Chat;
        this.allow_Spectator_Chat_ = allow_Spectator_Chat_;
        this.allow_Spectators = allow_Spectators;
        this.allow_Spectators_ = allow_Spectators_;
        this.allowed_Antilock_Brakes = allowed_Antilock_Brakes;
        this.allowed_Antilock_Brakes_ = allowed_Antilock_Brakes_;
        this.allowed_Auto_Blip = allowed_Auto_Blip;
        this.allowed_Auto_Blip_ = allowed_Auto_Blip_;
        this.allowed_Auto_Clutch = allowed_Auto_Clutch;
        this.allowed_Auto_Clutch_ = allowed_Auto_Clutch_;
        this.allowed_Auto_Lift = allowed_Auto_Lift;
        this.allowed_Auto_Lift_ = allowed_Auto_Lift_;
        this.allowed_Auto_Pit = allowed_Auto_Pit;
        this.allowed_Auto_Pit_ = allowed_Auto_Pit_;
        this.allowed_Auto_Shift = allowed_Auto_Shift;
        this.allowed_Auto_Shift_ = allowed_Auto_Shift_;
        this.allowed_Brake_Help = allowed_Brake_Help;
        this.allowed_Brake_Help_ = allowed_Brake_Help_;
        this.allowed_Invulnerability = allowed_Invulnerability;
        this.allowed_Invulnerability_ = allowed_Invulnerability_;
        this.allowed_Opposite_Lock = allowed_Opposite_Lock;
        this.allowed_Opposite_Lock_ = allowed_Opposite_Lock_;
        this.allowed_Spin_Recovery = allowed_Spin_Recovery;
        this.allowed_Spin_Recovery_ = allowed_Spin_Recovery_;
        this.allowed_Stability_Control = allowed_Stability_Control;
        this.allowed_Stability_Control_ = allowed_Stability_Control_;
        this.allowed_Steering_Help = allowed_Steering_Help;
        this.allowed_Steering_Help_ = allowed_Steering_Help_;
        this.allowed_Traction_Control = allowed_Traction_Control;
        this.allowed_Traction_Control_ = allowed_Traction_Control_;
        this.assign_Parking = assign_Parking;
        this.assign_Parking_ = assign_Parking_;
        this.client_Fuel_Visible = client_Fuel_Visible;
        this.client_Fuel_Visible_ = client_Fuel_Visible_;
        this.closed_Qualify_Sessions = closed_Qualify_Sessions;
        this.closed_Qualify_Sessions_ = closed_Qualify_Sessions_;
        this.closed_Race_Sessions = closed_Race_Sessions;
        this.closed_Race_Sessions_ = closed_Race_Sessions_;
        this.collision_Fade_Thresh = collision_Fade_Thresh;
        this.collision_Fade_Thresh_ = collision_Fade_Thresh_;
        this.default_Game_Name = default_Game_Name;
        this.default_Game_Name_ = default_Game_Name_;
        this.delay_After_Race = delay_After_Race;
        this.delay_After_Race_ = delay_After_Race_;
        this.delay_Between_Sessions = delay_Between_Sessions;
        this.delay_Between_Sessions_ = delay_Between_Sessions_;
        this.driver_Swap_Setups = driver_Swap_Setups;
        this.driver_Swap_Setups_ = driver_Swap_Setups_;
        this.enable_Autodownloads = enable_Autodownloads;
        this.enable_Autodownloads_ = enable_Autodownloads_;
        this.enforce_Real_Name = enforce_Real_Name;
        this.enforce_Real_Name_ = enforce_Real_Name_;
        this.forced_Driving_View = forced_Driving_View;
        this.forced_Driving_View_ = forced_Driving_View_;
        this.hTTP_Server_Document_Root = hTTP_Server_Document_Root;
        this.hTTP_Server_Document_Root_ = hTTP_Server_Document_Root_;
        this.hTTP_Server_Max_File_Size = hTTP_Server_Max_File_Size;
        this.hTTP_Server_Max_File_Size_ = hTTP_Server_Max_File_Size_;
        this.hTTP_Server_Send_Rate = hTTP_Server_Send_Rate;
        this.hTTP_Server_Send_Rate_ = hTTP_Server_Send_Rate_;
        this.isolation = isolation;
        this.isolation_ = isolation_;
        this.join_Password = join_Password;
        this.join_Password_ = join_Password_;
        this.lessen_Restrictions = lessen_Restrictions;
        this.lessen_Restrictions_ = lessen_Restrictions_;
        this.loading_Priority = loading_Priority;
        this.loading_Priority_ = loading_Priority_;
        this.loading_Sleep_Time = loading_Sleep_Time;
        this.loading_Sleep_Time_ = loading_Sleep_Time_;
        this.loose_Content_Transfer = loose_Content_Transfer;
        this.loose_Content_Transfer_ = loose_Content_Transfer_;
        this.max_Data_Per_Client = max_Data_Per_Client;
        this.max_Data_Per_Client_ = max_Data_Per_Client_;
        this.max_MP_Players = max_MP_Players;
        this.maximum_AI = maximum_AI;
        this.maximum_AI_ = maximum_AI_;
        this.minimum_AI = minimum_AI;
        this.minimum_AI_ = minimum_AI_;
        this.must_Be_Stopped = must_Be_Stopped;
        this.must_Be_Stopped_ = must_Be_Stopped_;
        this.nagle_Algorithm = nagle_Algorithm;
        this.nagle_Algorithm_ = nagle_Algorithm_;
        this.pause_At_Start_Of_First_Session = pause_At_Start_Of_First_Session;
        this.pause_At_Start_Of_First_Session_ = pause_At_Start_Of_First_Session_;
        this.pause_While_Zero_Players = pause_While_Zero_Players;
        this.pause_While_Zero_Players_ = pause_While_Zero_Players_;
        this.pit_Speed_Override = pit_Speed_Override;
        this.pit_Speed_Override_ = pit_Speed_Override_;
        this.plugin_Heartbeat_Rate = plugin_Heartbeat_Rate;
        this.plugin_Heartbeat_Rate_ = plugin_Heartbeat_Rate_;
        this.practice_1_Time = practice_1_Time;
        this.practice_1_Time_ = practice_1_Time_;
        this.qualifying_Laps = qualifying_Laps;
        this.qualifying_Laps_ = qualifying_Laps_;
        this.qualifying_Time = qualifying_Time;
        this.qualifying_Time_ = qualifying_Time_;
        this.race_Client_Wait = race_Client_Wait;
        this.race_Client_Wait_ = race_Client_Wait_;
        this.race_Rejoin = race_Rejoin;
        this.race_Rejoin_ = race_Rejoin_;
        this.server_Session_End_Timeout = server_Session_End_Timeout;
        this.server_Session_End_Timeout_ = server_Session_End_Timeout_;
        this.superAdminPassword = superAdminPassword;
        this.superAdminPassword_ = superAdminPassword_;
        this.test_Day = test_Day;
        this.test_Day_ = test_Day_;
        this.unique_Vehicle_Check = unique_Vehicle_Check;
        this.unique_Vehicle_Check_ = unique_Vehicle_Check_;
        this.unthrottle_ID = unthrottle_ID;
        this.unthrottle_ID_ = unthrottle_ID_;
        this.unthrottle_Prefix = unthrottle_Prefix;
        this.unthrottle_Prefix_ = unthrottle_Prefix_;
        this.vote_Max_Race_Restarts = vote_Max_Race_Restarts;
        this.vote_Max_Race_Restarts_ = vote_Max_Race_Restarts_;
        this.vote_Min_Voters = vote_Min_Voters;
        this.vote_Min_Voters_ = vote_Min_Voters_;
        this.vote_Percentage_Add_AI = vote_Percentage_Add_AI;
        this.vote_Percentage_Add_AI_ = vote_Percentage_Add_AI_;
        this.vote_Percentage_Next_Session = vote_Percentage_Next_Session;
        this.vote_Percentage_Next_Session_ = vote_Percentage_Next_Session_;
        this.vote_Percentage_Other = vote_Percentage_Other;
        this.vote_Percentage_Other_ = vote_Percentage_Other_;
        this.warmup_Time = warmup_Time;
        this.warmup_Time_ = warmup_Time_;
    }

    @JsonProperty("Admin Functionality")
    public int getAdmin_Functionality() {
        return admin_Functionality;
    }

    @JsonProperty("Admin Functionality")
    public void setAdmin_Functionality(int admin_Functionality) {
        this.admin_Functionality = admin_Functionality;
    }

    @JsonProperty("Admin Functionality#")
    public String getAdmin_Functionality_() {
        return admin_Functionality_;
    }

    @JsonProperty("Admin Functionality#")
    public void setAdmin_Functionality_(String admin_Functionality_) {
        this.admin_Functionality_ = admin_Functionality_;
    }

    @JsonProperty("Admin Password")
    public String getAdmin_Password() {
        return admin_Password;
    }

    @JsonProperty("Admin Password")
    public void setAdmin_Password(String admin_Password) {
        this.admin_Password = admin_Password;
    }

    @JsonProperty("Admin Password#")
    public String getAdmin_Password_() {
        return admin_Password_;
    }

    @JsonProperty("Admin Password#")
    public void setAdmin_Password_(String admin_Password_) {
        this.admin_Password_ = admin_Password_;
    }

    @JsonProperty("Allow AI Toggle")
    public boolean isAllow_AI_Toggle() {
        return allow_AI_Toggle;
    }

    @JsonProperty("Allow AI Toggle")
    public void setAllow_AI_Toggle(boolean allow_AI_Toggle) {
        this.allow_AI_Toggle = allow_AI_Toggle;
    }

    @JsonProperty("Allow AI Toggle#")
    public String getAllow_AI_Toggle_() {
        return allow_AI_Toggle_;
    }

    @JsonProperty("Allow AI Toggle#")
    public void setAllow_AI_Toggle_(String allow_AI_Toggle_) {
        this.allow_AI_Toggle_ = allow_AI_Toggle_;
    }

    @JsonProperty("Allow Any Event")
    public int getAllow_Any_Event() {
        return allow_Any_Event;
    }

    @JsonProperty("Allow Any Event")
    public void setAllow_Any_Event(int allow_Any_Event) {
        this.allow_Any_Event = allow_Any_Event;
    }

    @JsonProperty("Allow Any Event#")
    public String getAllow_Any_Event_() {
        return allow_Any_Event_;
    }

    @JsonProperty("Allow Any Event#")
    public void setAllow_Any_Event_(String allow_Any_Event_) {
        this.allow_Any_Event_ = allow_Any_Event_;
    }

    @JsonProperty("Allow Hotlap Completion")
    public int getAllow_Hotlap_Completion() {
        return allow_Hotlap_Completion;
    }

    @JsonProperty("Allow Hotlap Completion")
    public void setAllow_Hotlap_Completion(int allow_Hotlap_Completion) {
        this.allow_Hotlap_Completion = allow_Hotlap_Completion;
    }

    @JsonProperty("Allow Hotlap Completion#")
    public String getAllow_Hotlap_Completion_() {
        return allow_Hotlap_Completion_;
    }

    @JsonProperty("Allow Hotlap Completion#")
    public void setAllow_Hotlap_Completion_(String allow_Hotlap_Completion_) {
        this.allow_Hotlap_Completion_ = allow_Hotlap_Completion_;
    }

    @JsonProperty("Allow Hotswaps")
    public boolean isAllow_Hotswaps() {
        return allow_Hotswaps;
    }

    @JsonProperty("Allow Hotswaps")
    public void setAllow_Hotswaps(boolean allow_Hotswaps) {
        this.allow_Hotswaps = allow_Hotswaps;
    }

    @JsonProperty("Allow Hotswaps#")
    public String getAllow_Hotswaps_() {
        return allow_Hotswaps_;
    }

    @JsonProperty("Allow Hotswaps#")
    public void setAllow_Hotswaps_(String allow_Hotswaps_) {
        this.allow_Hotswaps_ = allow_Hotswaps_;
    }

    @JsonProperty("Allow Passenger Chat")
    public boolean isAllow_Passenger_Chat() {
        return allow_Passenger_Chat;
    }

    @JsonProperty("Allow Passenger Chat")
    public void setAllow_Passenger_Chat(boolean allow_Passenger_Chat) {
        this.allow_Passenger_Chat = allow_Passenger_Chat;
    }

    @JsonProperty("Allow Passenger Chat#")
    public String getAllow_Passenger_Chat_() {
        return allow_Passenger_Chat_;
    }

    @JsonProperty("Allow Passenger Chat#")
    public void setAllow_Passenger_Chat_(String allow_Passenger_Chat_) {
        this.allow_Passenger_Chat_ = allow_Passenger_Chat_;
    }

    @JsonProperty("Allow Passengers")
    public boolean isAllow_Passengers() {
        return allow_Passengers;
    }

    @JsonProperty("Allow Passengers")
    public void setAllow_Passengers(boolean allow_Passengers) {
        this.allow_Passengers = allow_Passengers;
    }

    @JsonProperty("Allow Passengers#")
    public String getAllow_Passengers_() {
        return allow_Passengers_;
    }

    @JsonProperty("Allow Passengers#")
    public void setAllow_Passengers_(String allow_Passengers_) {
        this.allow_Passengers_ = allow_Passengers_;
    }

    @JsonProperty("Allow Spectator Chat")
    public boolean isAllow_Spectator_Chat() {
        return allow_Spectator_Chat;
    }

    @JsonProperty("Allow Spectator Chat")
    public void setAllow_Spectator_Chat(boolean allow_Spectator_Chat) {
        this.allow_Spectator_Chat = allow_Spectator_Chat;
    }

    @JsonProperty("Allow Spectator Chat#")
    public String getAllow_Spectator_Chat_() {
        return allow_Spectator_Chat_;
    }

    @JsonProperty("Allow Spectator Chat#")
    public void setAllow_Spectator_Chat_(String allow_Spectator_Chat_) {
        this.allow_Spectator_Chat_ = allow_Spectator_Chat_;
    }

    @JsonProperty("Allow Spectators")
    public boolean isAllow_Spectators() {
        return allow_Spectators;
    }

    @JsonProperty("Allow Spectators")
    public void setAllow_Spectators(boolean allow_Spectators) {
        this.allow_Spectators = allow_Spectators;
    }

    @JsonProperty("Allow Spectators#")
    public String getAllow_Spectators_() {
        return allow_Spectators_;
    }

    @JsonProperty("Allow Spectators#")
    public void setAllow_Spectators_(String allow_Spectators_) {
        this.allow_Spectators_ = allow_Spectators_;
    }

    @JsonProperty("Allowed Antilock Brakes")
    public int getAllowed_Antilock_Brakes() {
        return allowed_Antilock_Brakes;
    }

    @JsonProperty("Allowed Antilock Brakes")
    public void setAllowed_Antilock_Brakes(int allowed_Antilock_Brakes) {
        this.allowed_Antilock_Brakes = allowed_Antilock_Brakes;
    }

    @JsonProperty("Allowed Antilock Brakes#")
    public String getAllowed_Antilock_Brakes_() {
        return allowed_Antilock_Brakes_;
    }

    @JsonProperty("Allowed Antilock Brakes#")
    public void setAllowed_Antilock_Brakes_(String allowed_Antilock_Brakes_) {
        this.allowed_Antilock_Brakes_ = allowed_Antilock_Brakes_;
    }

    @JsonProperty("Allowed Auto Blip")
    public int getAllowed_Auto_Blip() {
        return allowed_Auto_Blip;
    }

    @JsonProperty("Allowed Auto Blip")
    public void setAllowed_Auto_Blip(int allowed_Auto_Blip) {
        this.allowed_Auto_Blip = allowed_Auto_Blip;
    }

    @JsonProperty("Allowed Auto Blip#")
    public String getAllowed_Auto_Blip_() {
        return allowed_Auto_Blip_;
    }

    @JsonProperty("Allowed Auto Blip#")
    public void setAllowed_Auto_Blip_(String allowed_Auto_Blip_) {
        this.allowed_Auto_Blip_ = allowed_Auto_Blip_;
    }

    @JsonProperty("Allowed Auto Clutch")
    public int getAllowed_Auto_Clutch() {
        return allowed_Auto_Clutch;
    }

    @JsonProperty("Allowed Auto Clutch")
    public void setAllowed_Auto_Clutch(int allowed_Auto_Clutch) {
        this.allowed_Auto_Clutch = allowed_Auto_Clutch;
    }

    @JsonProperty("Allowed Auto Clutch#")
    public String getAllowed_Auto_Clutch_() {
        return allowed_Auto_Clutch_;
    }

    @JsonProperty("Allowed Auto Clutch#")
    public void setAllowed_Auto_Clutch_(String allowed_Auto_Clutch_) {
        this.allowed_Auto_Clutch_ = allowed_Auto_Clutch_;
    }

    @JsonProperty("Allowed Auto Lift")
    public int getAllowed_Auto_Lift() {
        return allowed_Auto_Lift;
    }

    @JsonProperty("Allowed Auto Lift")
    public void setAllowed_Auto_Lift(int allowed_Auto_Lift) {
        this.allowed_Auto_Lift = allowed_Auto_Lift;
    }

    @JsonProperty("Allowed Auto Lift#")
    public String getAllowed_Auto_Lift_() {
        return allowed_Auto_Lift_;
    }

    @JsonProperty("Allowed Auto Lift#")
    public void setAllowed_Auto_Lift_(String allowed_Auto_Lift_) {
        this.allowed_Auto_Lift_ = allowed_Auto_Lift_;
    }

    @JsonProperty("Allowed Auto Pit")
    public int getAllowed_Auto_Pit() {
        return allowed_Auto_Pit;
    }

    @JsonProperty("Allowed Auto Pit")
    public void setAllowed_Auto_Pit(int allowed_Auto_Pit) {
        this.allowed_Auto_Pit = allowed_Auto_Pit;
    }

    @JsonProperty("Allowed Auto Pit#")
    public String getAllowed_Auto_Pit_() {
        return allowed_Auto_Pit_;
    }

    @JsonProperty("Allowed Auto Pit#")
    public void setAllowed_Auto_Pit_(String allowed_Auto_Pit_) {
        this.allowed_Auto_Pit_ = allowed_Auto_Pit_;
    }

    @JsonProperty("Allowed Auto Shift")
    public int getAllowed_Auto_Shift() {
        return allowed_Auto_Shift;
    }

    @JsonProperty("Allowed Auto Shift")
    public void setAllowed_Auto_Shift(int allowed_Auto_Shift) {
        this.allowed_Auto_Shift = allowed_Auto_Shift;
    }

    @JsonProperty("Allowed Auto Shift#")
    public String getAllowed_Auto_Shift_() {
        return allowed_Auto_Shift_;
    }

    @JsonProperty("Allowed Auto Shift#")
    public void setAllowed_Auto_Shift_(String allowed_Auto_Shift_) {
        this.allowed_Auto_Shift_ = allowed_Auto_Shift_;
    }

    @JsonProperty("Allowed Brake Help")
    public int getAllowed_Brake_Help() {
        return allowed_Brake_Help;
    }

    @JsonProperty("Allowed Brake Help")
    public void setAllowed_Brake_Help(int allowed_Brake_Help) {
        this.allowed_Brake_Help = allowed_Brake_Help;
    }

    @JsonProperty("Allowed Brake Help#")
    public String getAllowed_Brake_Help_() {
        return allowed_Brake_Help_;
    }

    @JsonProperty("Allowed Brake Help#")
    public void setAllowed_Brake_Help_(String allowed_Brake_Help_) {
        this.allowed_Brake_Help_ = allowed_Brake_Help_;
    }

    @JsonProperty("Allowed Invulnerability")
    public int getAllowed_Invulnerability() {
        return allowed_Invulnerability;
    }

    @JsonProperty("Allowed Invulnerability")
    public void setAllowed_Invulnerability(int allowed_Invulnerability) {
        this.allowed_Invulnerability = allowed_Invulnerability;
    }

    @JsonProperty("Allowed Invulnerability#")
    public String getAllowed_Invulnerability_() {
        return allowed_Invulnerability_;
    }

    @JsonProperty("Allowed Invulnerability#")
    public void setAllowed_Invulnerability_(String allowed_Invulnerability_) {
        this.allowed_Invulnerability_ = allowed_Invulnerability_;
    }

    @JsonProperty("Allowed Opposite Lock")
    public int getAllowed_Opposite_Lock() {
        return allowed_Opposite_Lock;
    }

    @JsonProperty("Allowed Opposite Lock")
    public void setAllowed_Opposite_Lock(int allowed_Opposite_Lock) {
        this.allowed_Opposite_Lock = allowed_Opposite_Lock;
    }

    @JsonProperty("Allowed Opposite Lock#")
    public String getAllowed_Opposite_Lock_() {
        return allowed_Opposite_Lock_;
    }

    @JsonProperty("Allowed Opposite Lock#")
    public void setAllowed_Opposite_Lock_(String allowed_Opposite_Lock_) {
        this.allowed_Opposite_Lock_ = allowed_Opposite_Lock_;
    }

    @JsonProperty("Allowed Spin Recovery")
    public int getAllowed_Spin_Recovery() {
        return allowed_Spin_Recovery;
    }

    @JsonProperty("Allowed Spin Recovery")
    public void setAllowed_Spin_Recovery(int allowed_Spin_Recovery) {
        this.allowed_Spin_Recovery = allowed_Spin_Recovery;
    }

    @JsonProperty("Allowed Spin Recovery#")
    public String getAllowed_Spin_Recovery_() {
        return allowed_Spin_Recovery_;
    }

    @JsonProperty("Allowed Spin Recovery#")
    public void setAllowed_Spin_Recovery_(String allowed_Spin_Recovery_) {
        this.allowed_Spin_Recovery_ = allowed_Spin_Recovery_;
    }

    @JsonProperty("Allowed Stability Control")
    public int getAllowed_Stability_Control() {
        return allowed_Stability_Control;
    }

    @JsonProperty("Allowed Stability Control")
    public void setAllowed_Stability_Control(int allowed_Stability_Control) {
        this.allowed_Stability_Control = allowed_Stability_Control;
    }

    @JsonProperty("Allowed Stability Control#")
    public String getAllowed_Stability_Control_() {
        return allowed_Stability_Control_;
    }

    @JsonProperty("Allowed Stability Control#")
    public void setAllowed_Stability_Control_(String allowed_Stability_Control_) {
        this.allowed_Stability_Control_ = allowed_Stability_Control_;
    }

    @JsonProperty("Allowed Steering Help")
    public int getAllowed_Steering_Help() {
        return allowed_Steering_Help;
    }

    @JsonProperty("Allowed Steering Help")
    public void setAllowed_Steering_Help(int allowed_Steering_Help) {
        this.allowed_Steering_Help = allowed_Steering_Help;
    }

    @JsonProperty("Allowed Steering Help#")
    public String getAllowed_Steering_Help_() {
        return allowed_Steering_Help_;
    }

    @JsonProperty("Allowed Steering Help#")
    public void setAllowed_Steering_Help_(String allowed_Steering_Help_) {
        this.allowed_Steering_Help_ = allowed_Steering_Help_;
    }

    @JsonProperty("Allowed Traction Control")
    public int getAllowed_Traction_Control() {
        return allowed_Traction_Control;
    }

    @JsonProperty("Allowed Traction Control")
    public void setAllowed_Traction_Control(int allowed_Traction_Control) {
        this.allowed_Traction_Control = allowed_Traction_Control;
    }

    @JsonProperty("Allowed Traction Control#")
    public String getAllowed_Traction_Control_() {
        return allowed_Traction_Control_;
    }

    @JsonProperty("Allowed Traction Control#")
    public void setAllowed_Traction_Control_(String allowed_Traction_Control_) {
        this.allowed_Traction_Control_ = allowed_Traction_Control_;
    }

    @JsonProperty("Assign Parking")
    public boolean isAssign_Parking() {
        return assign_Parking;
    }

    @JsonProperty("Assign Parking")
    public void setAssign_Parking(boolean assign_Parking) {
        this.assign_Parking = assign_Parking;
    }

    @JsonProperty("Assign Parking#")
    public String getAssign_Parking_() {
        return assign_Parking_;
    }

    @JsonProperty("Assign Parking#")
    public void setAssign_Parking_(String assign_Parking_) {
        this.assign_Parking_ = assign_Parking_;
    }

    @JsonProperty("Client Fuel Visible")
    public int getClient_Fuel_Visible() {
        return client_Fuel_Visible;
    }

    @JsonProperty("Client Fuel Visible")
    public void setClient_Fuel_Visible(int client_Fuel_Visible) {
        this.client_Fuel_Visible = client_Fuel_Visible;
    }

    @JsonProperty("Client Fuel Visible#")
    public String getClient_Fuel_Visible_() {
        return client_Fuel_Visible_;
    }

    @JsonProperty("Client Fuel Visible#")
    public void setClient_Fuel_Visible_(String client_Fuel_Visible_) {
        this.client_Fuel_Visible_ = client_Fuel_Visible_;
    }

    @JsonProperty("Closed Qualify Sessions")
    public int getClosed_Qualify_Sessions() {
        return closed_Qualify_Sessions;
    }

    @JsonProperty("Closed Qualify Sessions")
    public void setClosed_Qualify_Sessions(int closed_Qualify_Sessions) {
        this.closed_Qualify_Sessions = closed_Qualify_Sessions;
    }

    @JsonProperty("Closed Qualify Sessions#")
    public String getClosed_Qualify_Sessions_() {
        return closed_Qualify_Sessions_;
    }

    @JsonProperty("Closed Qualify Sessions#")
    public void setClosed_Qualify_Sessions_(String closed_Qualify_Sessions_) {
        this.closed_Qualify_Sessions_ = closed_Qualify_Sessions_;
    }

    @JsonProperty("Closed Race Sessions")
    public int getClosed_Race_Sessions() {
        return closed_Race_Sessions;
    }

    @JsonProperty("Closed Race Sessions")
    public void setClosed_Race_Sessions(int closed_Race_Sessions) {
        this.closed_Race_Sessions = closed_Race_Sessions;
    }

    @JsonProperty("Closed Race Sessions#")
    public String getClosed_Race_Sessions_() {
        return closed_Race_Sessions_;
    }

    @JsonProperty("Closed Race Sessions#")
    public void setClosed_Race_Sessions_(String closed_Race_Sessions_) {
        this.closed_Race_Sessions_ = closed_Race_Sessions_;
    }

    @JsonProperty("Collision Fade Thresh")
    public float getCollision_Fade_Thresh() {
        return collision_Fade_Thresh;
    }

    @JsonProperty("Collision Fade Thresh")
    public void setCollision_Fade_Thresh(float collision_Fade_Thresh) {
        this.collision_Fade_Thresh = collision_Fade_Thresh;
    }

    @JsonProperty("Collision Fade Thresh#")
    public String getCollision_Fade_Thresh_() {
        return collision_Fade_Thresh_;
    }

    @JsonProperty("Collision Fade Thresh#")
    public void setCollision_Fade_Thresh_(String collision_Fade_Thresh_) {
        this.collision_Fade_Thresh_ = collision_Fade_Thresh_;
    }

    @JsonProperty("Default Game Name")
    public String getDefault_Game_Name() {
        return default_Game_Name;
    }

    @JsonProperty("Default Game Name")
    public void setDefault_Game_Name(String default_Game_Name) {
        this.default_Game_Name = default_Game_Name;
    }

    @JsonProperty("Default Game Name#")
    public String getDefault_Game_Name_() {
        return default_Game_Name_;
    }

    @JsonProperty("Default Game Name#")
    public void setDefault_Game_Name_(String default_Game_Name_) {
        this.default_Game_Name_ = default_Game_Name_;
    }

    @JsonProperty("Delay After Race")
    public int getDelay_After_Race() {
        return delay_After_Race;
    }

    @JsonProperty("Delay After Race")
    public void setDelay_After_Race(int delay_After_Race) {
        this.delay_After_Race = delay_After_Race;
    }

    @JsonProperty("Delay After Race#")
    public String getDelay_After_Race_() {
        return delay_After_Race_;
    }

    @JsonProperty("Delay After Race#")
    public void setDelay_After_Race_(String delay_After_Race_) {
        this.delay_After_Race_ = delay_After_Race_;
    }

    @JsonProperty("Delay Between Sessions")
    public int getDelay_Between_Sessions() {
        return delay_Between_Sessions;
    }

    @JsonProperty("Delay Between Sessions")
    public void setDelay_Between_Sessions(int delay_Between_Sessions) {
        this.delay_Between_Sessions = delay_Between_Sessions;
    }

    @JsonProperty("Delay Between Sessions#")
    public String getDelay_Between_Sessions_() {
        return delay_Between_Sessions_;
    }

    @JsonProperty("Delay Between Sessions#")
    public void setDelay_Between_Sessions_(String delay_Between_Sessions_) {
        this.delay_Between_Sessions_ = delay_Between_Sessions_;
    }

    @JsonProperty("Driver Swap Setups")
    public boolean isDriver_Swap_Setups() {
        return driver_Swap_Setups;
    }

    @JsonProperty("Driver Swap Setups")
    public void setDriver_Swap_Setups(boolean driver_Swap_Setups) {
        this.driver_Swap_Setups = driver_Swap_Setups;
    }

    @JsonProperty("Driver Swap Setups#")
    public String getDriver_Swap_Setups_() {
        return driver_Swap_Setups_;
    }

    @JsonProperty("Driver Swap Setups#")
    public void setDriver_Swap_Setups_(String driver_Swap_Setups_) {
        this.driver_Swap_Setups_ = driver_Swap_Setups_;
    }

    @JsonProperty("Enable Autodownloads")
    public boolean isEnable_Autodownloads() {
        return enable_Autodownloads;
    }

    @JsonProperty("Enable Autodownloads")
    public void setEnable_Autodownloads(boolean enable_Autodownloads) {
        this.enable_Autodownloads = enable_Autodownloads;
    }

    @JsonProperty("Enable Autodownloads#")
    public String getEnable_Autodownloads_() {
        return enable_Autodownloads_;
    }

    @JsonProperty("Enable Autodownloads#")
    public void setEnable_Autodownloads_(String enable_Autodownloads_) {
        this.enable_Autodownloads_ = enable_Autodownloads_;
    }

    @JsonProperty("Enforce Real Name")
    public boolean isEnforce_Real_Name() {
        return enforce_Real_Name;
    }

    @JsonProperty("Enforce Real Name")
    public void setEnforce_Real_Name(boolean enforce_Real_Name) {
        this.enforce_Real_Name = enforce_Real_Name;
    }

    @JsonProperty("Enforce Real Name#")
    public String getEnforce_Real_Name_() {
        return enforce_Real_Name_;
    }

    @JsonProperty("Enforce Real Name#")
    public void setEnforce_Real_Name_(String enforce_Real_Name_) {
        this.enforce_Real_Name_ = enforce_Real_Name_;
    }

    @JsonProperty("Forced Driving View")
    public int getForced_Driving_View() {
        return forced_Driving_View;
    }

    @JsonProperty("Forced Driving View")
    public void setForced_Driving_View(int forced_Driving_View) {
        this.forced_Driving_View = forced_Driving_View;
    }

    @JsonProperty("Forced Driving View#")
    public String getForced_Driving_View_() {
        return forced_Driving_View_;
    }

    @JsonProperty("Forced Driving View#")
    public void setForced_Driving_View_(String forced_Driving_View_) {
        this.forced_Driving_View_ = forced_Driving_View_;
    }

    @JsonProperty("HTTP Server Document Root")
    public String getHTTP_Server_Document_Root() {
        return hTTP_Server_Document_Root;
    }

    @JsonProperty("HTTP Server Document Root")
    public void setHTTP_Server_Document_Root(String hTTP_Server_Document_Root) {
        this.hTTP_Server_Document_Root = hTTP_Server_Document_Root;
    }

    @JsonProperty("HTTP Server Document Root#")
    public String getHTTP_Server_Document_Root_() {
        return hTTP_Server_Document_Root_;
    }

    @JsonProperty("HTTP Server Document Root#")
    public void setHTTP_Server_Document_Root_(String hTTP_Server_Document_Root_) {
        this.hTTP_Server_Document_Root_ = hTTP_Server_Document_Root_;
    }

    @JsonProperty("HTTP Server Max File Size")
    public int getHTTP_Server_Max_File_Size() {
        return hTTP_Server_Max_File_Size;
    }

    @JsonProperty("HTTP Server Max File Size")
    public void setHTTP_Server_Max_File_Size(int hTTP_Server_Max_File_Size) {
        this.hTTP_Server_Max_File_Size = hTTP_Server_Max_File_Size;
    }

    @JsonProperty("HTTP Server Max File Size#")
    public String getHTTP_Server_Max_File_Size_() {
        return hTTP_Server_Max_File_Size_;
    }

    @JsonProperty("HTTP Server Max File Size#")
    public void setHTTP_Server_Max_File_Size_(String hTTP_Server_Max_File_Size_) {
        this.hTTP_Server_Max_File_Size_ = hTTP_Server_Max_File_Size_;
    }

    @JsonProperty("HTTP Server Send Rate")
    public long getHTTP_Server_Send_Rate() {
        return hTTP_Server_Send_Rate;
    }

    @JsonProperty("HTTP Server Send Rate")
    public void setHTTP_Server_Send_Rate(long hTTP_Server_Send_Rate) {
        this.hTTP_Server_Send_Rate = hTTP_Server_Send_Rate;
    }

    @JsonProperty("HTTP Server Send Rate#")
    public String getHTTP_Server_Send_Rate_() {
        return hTTP_Server_Send_Rate_;
    }

    @JsonProperty("HTTP Server Send Rate#")
    public void setHTTP_Server_Send_Rate_(String hTTP_Server_Send_Rate_) {
        this.hTTP_Server_Send_Rate_ = hTTP_Server_Send_Rate_;
    }

    @JsonProperty("Isolation")
    public int getIsolation() {
        return isolation;
    }

    @JsonProperty("Isolation")
    public void setIsolation(int isolation) {
        this.isolation = isolation;
    }

    @JsonProperty("Isolation#")
    public String getIsolation_() {
        return isolation_;
    }

    @JsonProperty("Isolation#")
    public void setIsolation_(String isolation_) {
        this.isolation_ = isolation_;
    }

    @JsonProperty("Join Password")
    public String getJoin_Password() {
        return join_Password;
    }

    @JsonProperty("Join Password")
    public void setJoin_Password(String join_Password) {
        this.join_Password = join_Password;
    }

    @JsonProperty("Join Password#")
    public String getJoin_Password_() {
        return join_Password_;
    }

    @JsonProperty("Join Password#")
    public void setJoin_Password_(String join_Password_) {
        this.join_Password_ = join_Password_;
    }

    @JsonProperty("Lessen Restrictions")
    public boolean isLessen_Restrictions() {
        return lessen_Restrictions;
    }

    @JsonProperty("Lessen Restrictions")
    public void setLessen_Restrictions(boolean lessen_Restrictions) {
        this.lessen_Restrictions = lessen_Restrictions;
    }

    @JsonProperty("Lessen Restrictions#")
    public String getLessen_Restrictions_() {
        return lessen_Restrictions_;
    }

    @JsonProperty("Lessen Restrictions#")
    public void setLessen_Restrictions_(String lessen_Restrictions_) {
        this.lessen_Restrictions_ = lessen_Restrictions_;
    }

    @JsonProperty("Loading Priority")
    public int getLoading_Priority() {
        return loading_Priority;
    }

    @JsonProperty("Loading Priority")
    public void setLoading_Priority(int loading_Priority) {
        this.loading_Priority = loading_Priority;
    }

    @JsonProperty("Loading Priority#")
    public String getLoading_Priority_() {
        return loading_Priority_;
    }

    @JsonProperty("Loading Priority#")
    public void setLoading_Priority_(String loading_Priority_) {
        this.loading_Priority_ = loading_Priority_;
    }

    @JsonProperty("Loading Sleep Time")
    public int getLoading_Sleep_Time() {
        return loading_Sleep_Time;
    }

    @JsonProperty("Loading Sleep Time")
    public void setLoading_Sleep_Time(int loading_Sleep_Time) {
        this.loading_Sleep_Time = loading_Sleep_Time;
    }

    @JsonProperty("Loading Sleep Time#")
    public String getLoading_Sleep_Time_() {
        return loading_Sleep_Time_;
    }

    @JsonProperty("Loading Sleep Time#")
    public void setLoading_Sleep_Time_(String loading_Sleep_Time_) {
        this.loading_Sleep_Time_ = loading_Sleep_Time_;
    }

    @JsonProperty("Loose Content Transfer")
    public int getLoose_Content_Transfer() {
        return loose_Content_Transfer;
    }

    @JsonProperty("Loose Content Transfer")
    public void setLoose_Content_Transfer(int loose_Content_Transfer) {
        this.loose_Content_Transfer = loose_Content_Transfer;
    }

    @JsonProperty("Loose Content Transfer#")
    public String getLoose_Content_Transfer_() {
        return loose_Content_Transfer_;
    }

    @JsonProperty("Loose Content Transfer#")
    public void setLoose_Content_Transfer_(String loose_Content_Transfer_) {
        this.loose_Content_Transfer_ = loose_Content_Transfer_;
    }

    @JsonProperty("Max Data Per Client")
    public int getMax_Data_Per_Client() {
        return max_Data_Per_Client;
    }

    @JsonProperty("Max Data Per Client")
    public void setMax_Data_Per_Client(int max_Data_Per_Client) {
        this.max_Data_Per_Client = max_Data_Per_Client;
    }

    @JsonProperty("Max Data Per Client#")
    public String getMax_Data_Per_Client_() {
        return max_Data_Per_Client_;
    }

    @JsonProperty("Max Data Per Client#")
    public void setMax_Data_Per_Client_(String max_Data_Per_Client_) {
        this.max_Data_Per_Client_ = max_Data_Per_Client_;
    }

    @JsonProperty("Max MP Players")
    public int getMax_MP_Players() {
        return max_MP_Players;
    }

    @JsonProperty("Max MP Players")
    public void setMax_MP_Players(int max_MP_Players) {
        this.max_MP_Players = max_MP_Players;
    }

    @JsonProperty("Maximum AI")
    public int getMaximum_AI() {
        return maximum_AI;
    }

    @JsonProperty("Maximum AI")
    public void setMaximum_AI(int maximum_AI) {
        this.maximum_AI = maximum_AI;
    }

    @JsonProperty("Maximum AI#")
    public String getMaximum_AI_() {
        return maximum_AI_;
    }

    @JsonProperty("Maximum AI#")
    public void setMaximum_AI_(String maximum_AI_) {
        this.maximum_AI_ = maximum_AI_;
    }

    @JsonProperty("Minimum AI")
    public int getMinimum_AI() {
        return minimum_AI;
    }

    @JsonProperty("Minimum AI")
    public void setMinimum_AI(int minimum_AI) {
        this.minimum_AI = minimum_AI;
    }

    @JsonProperty("Minimum AI#")
    public String getMinimum_AI_() {
        return minimum_AI_;
    }

    @JsonProperty("Minimum AI#")
    public void setMinimum_AI_(String minimum_AI_) {
        this.minimum_AI_ = minimum_AI_;
    }

    @JsonProperty("Must Be Stopped")
    public boolean isMust_Be_Stopped() {
        return must_Be_Stopped;
    }

    @JsonProperty("Must Be Stopped")
    public void setMust_Be_Stopped(boolean must_Be_Stopped) {
        this.must_Be_Stopped = must_Be_Stopped;
    }

    @JsonProperty("Must Be Stopped#")
    public String getMust_Be_Stopped_() {
        return must_Be_Stopped_;
    }

    @JsonProperty("Must Be Stopped#")
    public void setMust_Be_Stopped_(String must_Be_Stopped_) {
        this.must_Be_Stopped_ = must_Be_Stopped_;
    }

    @JsonProperty("Nagle Algorithm")
    public boolean isNagle_Algorithm() {
        return nagle_Algorithm;
    }

    @JsonProperty("Nagle Algorithm")
    public void setNagle_Algorithm(boolean nagle_Algorithm) {
        this.nagle_Algorithm = nagle_Algorithm;
    }

    @JsonProperty("Nagle Algorithm#")
    public String getNagle_Algorithm_() {
        return nagle_Algorithm_;
    }

    @JsonProperty("Nagle Algorithm#")
    public void setNagle_Algorithm_(String nagle_Algorithm_) {
        this.nagle_Algorithm_ = nagle_Algorithm_;
    }

    @JsonProperty("Pause At Start Of First Session")
    public boolean isPause_At_Start_Of_First_Session() {
        return pause_At_Start_Of_First_Session;
    }

    @JsonProperty("Pause At Start Of First Session")
    public void setPause_At_Start_Of_First_Session(boolean pause_At_Start_Of_First_Session) {
        this.pause_At_Start_Of_First_Session = pause_At_Start_Of_First_Session;
    }

    @JsonProperty("Pause At Start Of First Session#")
    public String getPause_At_Start_Of_First_Session_() {
        return pause_At_Start_Of_First_Session_;
    }

    @JsonProperty("Pause At Start Of First Session#")
    public void setPause_At_Start_Of_First_Session_(String pause_At_Start_Of_First_Session_) {
        this.pause_At_Start_Of_First_Session_ = pause_At_Start_Of_First_Session_;
    }

    @JsonProperty("Pause While Zero Players")
    public boolean isPause_While_Zero_Players() {
        return pause_While_Zero_Players;
    }

    @JsonProperty("Pause While Zero Players")
    public void setPause_While_Zero_Players(boolean pause_While_Zero_Players) {
        this.pause_While_Zero_Players = pause_While_Zero_Players;
    }

    @JsonProperty("Pause While Zero Players#")
    public String getPause_While_Zero_Players_() {
        return pause_While_Zero_Players_;
    }

    @JsonProperty("Pause While Zero Players#")
    public void setPause_While_Zero_Players_(String pause_While_Zero_Players_) {
        this.pause_While_Zero_Players_ = pause_While_Zero_Players_;
    }

    @JsonProperty("Pit Speed Override")
    public int getPit_Speed_Override() {
        return pit_Speed_Override;
    }

    @JsonProperty("Pit Speed Override")
    public void setPit_Speed_Override(int pit_Speed_Override) {
        this.pit_Speed_Override = pit_Speed_Override;
    }

    @JsonProperty("Pit Speed Override#")
    public String getPit_Speed_Override_() {
        return pit_Speed_Override_;
    }

    @JsonProperty("Pit Speed Override#")
    public void setPit_Speed_Override_(String pit_Speed_Override_) {
        this.pit_Speed_Override_ = pit_Speed_Override_;
    }

    @JsonProperty("Plugin Heartbeat Rate")
    public int getPlugin_Heartbeat_Rate() {
        return plugin_Heartbeat_Rate;
    }

    @JsonProperty("Plugin Heartbeat Rate")
    public void setPlugin_Heartbeat_Rate(int plugin_Heartbeat_Rate) {
        this.plugin_Heartbeat_Rate = plugin_Heartbeat_Rate;
    }

    @JsonProperty("Plugin Heartbeat Rate#")
    public String getPlugin_Heartbeat_Rate_() {
        return plugin_Heartbeat_Rate_;
    }

    @JsonProperty("Plugin Heartbeat Rate#")
    public void setPlugin_Heartbeat_Rate_(String plugin_Heartbeat_Rate_) {
        this.plugin_Heartbeat_Rate_ = plugin_Heartbeat_Rate_;
    }

    @JsonProperty("Practice 1 Time")
    public int getPractice_1_Time() {
        return practice_1_Time;
    }

    @JsonProperty("Practice 1 Time")
    public void setPractice_1_Time(int practice_1_Time) {
        this.practice_1_Time = practice_1_Time;
    }

    @JsonProperty("Practice 1 Time#")
    public String getPractice_1_Time_() {
        return practice_1_Time_;
    }

    @JsonProperty("Practice 1 Time#")
    public void setPractice_1_Time_(String practice_1_Time_) {
        this.practice_1_Time_ = practice_1_Time_;
    }

    @JsonProperty("Qualifying Laps")
    public int getQualifying_Laps() {
        return qualifying_Laps;
    }

    @JsonProperty("Qualifying Laps")
    public void setQualifying_Laps(int qualifying_Laps) {
        this.qualifying_Laps = qualifying_Laps;
    }

    @JsonProperty("Qualifying Laps#")
    public String getQualifying_Laps_() {
        return qualifying_Laps_;
    }

    @JsonProperty("Qualifying Laps#")
    public void setQualifying_Laps_(String qualifying_Laps_) {
        this.qualifying_Laps_ = qualifying_Laps_;
    }

    @JsonProperty("Qualifying Time")
    public int getQualifying_Time() {
        return qualifying_Time;
    }

    @JsonProperty("Qualifying Time")
    public void setQualifying_Time(int qualifying_Time) {
        this.qualifying_Time = qualifying_Time;
    }

    @JsonProperty("Qualifying Time#")
    public String getQualifying_Time_() {
        return qualifying_Time_;
    }

    @JsonProperty("Qualifying Time#")
    public void setQualifying_Time_(String qualifying_Time_) {
        this.qualifying_Time_ = qualifying_Time_;
    }

    @JsonProperty("Race Client Wait")
    public int getRace_Client_Wait() {
        return race_Client_Wait;
    }

    @JsonProperty("Race Client Wait")
    public void setRace_Client_Wait(int race_Client_Wait) {
        this.race_Client_Wait = race_Client_Wait;
    }

    @JsonProperty("Race Client Wait#")
    public String getRace_Client_Wait_() {
        return race_Client_Wait_;
    }

    @JsonProperty("Race Client Wait#")
    public void setRace_Client_Wait_(String race_Client_Wait_) {
        this.race_Client_Wait_ = race_Client_Wait_;
    }

    @JsonProperty("Race Rejoin")
    public int getRace_Rejoin() {
        return race_Rejoin;
    }

    @JsonProperty("Race Rejoin")
    public void setRace_Rejoin(int race_Rejoin) {
        this.race_Rejoin = race_Rejoin;
    }

    @JsonProperty("Race Rejoin#")
    public String getRace_Rejoin_() {
        return race_Rejoin_;
    }

    @JsonProperty("Race Rejoin#")
    public void setRace_Rejoin_(String race_Rejoin_) {
        this.race_Rejoin_ = race_Rejoin_;
    }

    @JsonProperty("Server Session End Timeout")
    public int getServer_Session_End_Timeout() {
        return server_Session_End_Timeout;
    }

    @JsonProperty("Server Session End Timeout")
    public void setServer_Session_End_Timeout(int server_Session_End_Timeout) {
        this.server_Session_End_Timeout = server_Session_End_Timeout;
    }

    @JsonProperty("Server Session End Timeout#")
    public String getServer_Session_End_Timeout_() {
        return server_Session_End_Timeout_;
    }

    @JsonProperty("Server Session End Timeout#")
    public void setServer_Session_End_Timeout_(String server_Session_End_Timeout_) {
        this.server_Session_End_Timeout_ = server_Session_End_Timeout_;
    }

    @JsonProperty("SuperAdminPassword")
    public String getSuperAdminPassword() {
        return superAdminPassword;
    }

    @JsonProperty("SuperAdminPassword")
    public void setSuperAdminPassword(String superAdminPassword) {
        this.superAdminPassword = superAdminPassword;
    }

    @JsonProperty("SuperAdminPassword#")
    public String getSuperAdminPassword_() {
        return superAdminPassword_;
    }

    @JsonProperty("SuperAdminPassword#")
    public void setSuperAdminPassword_(String superAdminPassword_) {
        this.superAdminPassword_ = superAdminPassword_;
    }

    @JsonProperty("Test Day")
    public boolean isTest_Day() {
        return test_Day;
    }

    @JsonProperty("Test Day")
    public void setTest_Day(boolean test_Day) {
        this.test_Day = test_Day;
    }

    @JsonProperty("Test Day#")
    public String getTest_Day_() {
        return test_Day_;
    }

    @JsonProperty("Test Day#")
    public void setTest_Day_(String test_Day_) {
        this.test_Day_ = test_Day_;
    }

    @JsonProperty("Unique Vehicle Check")
    public boolean isUnique_Vehicle_Check() {
        return unique_Vehicle_Check;
    }

    @JsonProperty("Unique Vehicle Check")
    public void setUnique_Vehicle_Check(boolean unique_Vehicle_Check) {
        this.unique_Vehicle_Check = unique_Vehicle_Check;
    }

    @JsonProperty("Unique Vehicle Check#")
    public String getUnique_Vehicle_Check_() {
        return unique_Vehicle_Check_;
    }

    @JsonProperty("Unique Vehicle Check#")
    public void setUnique_Vehicle_Check_(String unique_Vehicle_Check_) {
        this.unique_Vehicle_Check_ = unique_Vehicle_Check_;
    }

    @JsonProperty("Unthrottle ID")
    public int getUnthrottle_ID() {
        return unthrottle_ID;
    }

    @JsonProperty("Unthrottle ID")
    public void setUnthrottle_ID(int unthrottle_ID) {
        this.unthrottle_ID = unthrottle_ID;
    }

    @JsonProperty("Unthrottle ID#")
    public String getUnthrottle_ID_() {
        return unthrottle_ID_;
    }

    @JsonProperty("Unthrottle ID#")
    public void setUnthrottle_ID_(String unthrottle_ID_) {
        this.unthrottle_ID_ = unthrottle_ID_;
    }

    @JsonProperty("Unthrottle Prefix")
    public String getUnthrottle_Prefix() {
        return unthrottle_Prefix;
    }

    @JsonProperty("Unthrottle Prefix")
    public void setUnthrottle_Prefix(String unthrottle_Prefix) {
        this.unthrottle_Prefix = unthrottle_Prefix;
    }

    @JsonProperty("Unthrottle Prefix#")
    public String getUnthrottle_Prefix_() {
        return unthrottle_Prefix_;
    }

    @JsonProperty("Unthrottle Prefix#")
    public void setUnthrottle_Prefix_(String unthrottle_Prefix_) {
        this.unthrottle_Prefix_ = unthrottle_Prefix_;
    }

    @JsonProperty("Vote Max Race Restarts")
    public int getVote_Max_Race_Restarts() {
        return vote_Max_Race_Restarts;
    }

    @JsonProperty("Vote Max Race Restarts")
    public void setVote_Max_Race_Restarts(int vote_Max_Race_Restarts) {
        this.vote_Max_Race_Restarts = vote_Max_Race_Restarts;
    }

    @JsonProperty("Vote Max Race Restarts#")
    public String getVote_Max_Race_Restarts_() {
        return vote_Max_Race_Restarts_;
    }

    @JsonProperty("Vote Max Race Restarts#")
    public void setVote_Max_Race_Restarts_(String vote_Max_Race_Restarts_) {
        this.vote_Max_Race_Restarts_ = vote_Max_Race_Restarts_;
    }

    @JsonProperty("Vote Min Voters")
    public int getVote_Min_Voters() {
        return vote_Min_Voters;
    }

    @JsonProperty("Vote Min Voters")
    public void setVote_Min_Voters(int vote_Min_Voters) {
        this.vote_Min_Voters = vote_Min_Voters;
    }

    @JsonProperty("Vote Min Voters#")
    public String getVote_Min_Voters_() {
        return vote_Min_Voters_;
    }

    @JsonProperty("Vote Min Voters#")
    public void setVote_Min_Voters_(String vote_Min_Voters_) {
        this.vote_Min_Voters_ = vote_Min_Voters_;
    }

    @JsonProperty("Vote Percentage Add AI")
    public int getVote_Percentage_Add_AI() {
        return vote_Percentage_Add_AI;
    }

    @JsonProperty("Vote Percentage Add AI")
    public void setVote_Percentage_Add_AI(int vote_Percentage_Add_AI) {
        this.vote_Percentage_Add_AI = vote_Percentage_Add_AI;
    }

    @JsonProperty("Vote Percentage Add AI#")
    public String getVote_Percentage_Add_AI_() {
        return vote_Percentage_Add_AI_;
    }

    @JsonProperty("Vote Percentage Add AI#")
    public void setVote_Percentage_Add_AI_(String vote_Percentage_Add_AI_) {
        this.vote_Percentage_Add_AI_ = vote_Percentage_Add_AI_;
    }

    @JsonProperty("Vote Percentage Next Session")
    public int getVote_Percentage_Next_Session() {
        return vote_Percentage_Next_Session;
    }

    @JsonProperty("Vote Percentage Next Session")
    public void setVote_Percentage_Next_Session(int vote_Percentage_Next_Session) {
        this.vote_Percentage_Next_Session = vote_Percentage_Next_Session;
    }

    @JsonProperty("Vote Percentage Next Session#")
    public String getVote_Percentage_Next_Session_() {
        return vote_Percentage_Next_Session_;
    }

    @JsonProperty("Vote Percentage Next Session#")
    public void setVote_Percentage_Next_Session_(String vote_Percentage_Next_Session_) {
        this.vote_Percentage_Next_Session_ = vote_Percentage_Next_Session_;
    }

    @JsonProperty("Vote Percentage Other")
    public int getVote_Percentage_Other() {
        return vote_Percentage_Other;
    }

    @JsonProperty("Vote Percentage Other")
    public void setVote_Percentage_Other(int vote_Percentage_Other) {
        this.vote_Percentage_Other = vote_Percentage_Other;
    }

    @JsonProperty("Vote Percentage Other#")
    public String getVote_Percentage_Other_() {
        return vote_Percentage_Other_;
    }

    @JsonProperty("Vote Percentage Other#")
    public void setVote_Percentage_Other_(String vote_Percentage_Other_) {
        this.vote_Percentage_Other_ = vote_Percentage_Other_;
    }

    @JsonProperty("Warmup Time")
    public int getWarmup_Time() {
        return warmup_Time;
    }

    @JsonProperty("Warmup Time")
    public void setWarmup_Time(int warmup_Time) {
        this.warmup_Time = warmup_Time;
    }

    @JsonProperty("Warmup Time#")
    public String getWarmup_Time_() {
        return warmup_Time_;
    }

    @JsonProperty("Warmup Time#")
    public void setWarmup_Time_(String warmup_Time_) {
        this.warmup_Time_ = warmup_Time_;
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
        sb.append(MultiplayerServerOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("admin_Functionality");
        sb.append('=');
        sb.append(this.admin_Functionality);
        sb.append(',');
        sb.append("admin_Functionality_");
        sb.append('=');
        sb.append(((this.admin_Functionality_ == null) ? "<null>" : this.admin_Functionality_));
        sb.append(',');
        sb.append("admin_Password");
        sb.append('=');
        sb.append(((this.admin_Password == null) ? "<null>" : this.admin_Password));
        sb.append(',');
        sb.append("admin_Password_");
        sb.append('=');
        sb.append(((this.admin_Password_ == null) ? "<null>" : this.admin_Password_));
        sb.append(',');
        sb.append("allow_AI_Toggle");
        sb.append('=');
        sb.append(this.allow_AI_Toggle);
        sb.append(',');
        sb.append("allow_AI_Toggle_");
        sb.append('=');
        sb.append(((this.allow_AI_Toggle_ == null) ? "<null>" : this.allow_AI_Toggle_));
        sb.append(',');
        sb.append("allow_Any_Event");
        sb.append('=');
        sb.append(this.allow_Any_Event);
        sb.append(',');
        sb.append("allow_Any_Event_");
        sb.append('=');
        sb.append(((this.allow_Any_Event_ == null) ? "<null>" : this.allow_Any_Event_));
        sb.append(',');
        sb.append("allow_Hotlap_Completion");
        sb.append('=');
        sb.append(this.allow_Hotlap_Completion);
        sb.append(',');
        sb.append("allow_Hotlap_Completion_");
        sb.append('=');
        sb.append(((this.allow_Hotlap_Completion_ == null) ? "<null>" : this.allow_Hotlap_Completion_));
        sb.append(',');
        sb.append("allow_Hotswaps");
        sb.append('=');
        sb.append(this.allow_Hotswaps);
        sb.append(',');
        sb.append("allow_Hotswaps_");
        sb.append('=');
        sb.append(((this.allow_Hotswaps_ == null) ? "<null>" : this.allow_Hotswaps_));
        sb.append(',');
        sb.append("allow_Passenger_Chat");
        sb.append('=');
        sb.append(this.allow_Passenger_Chat);
        sb.append(',');
        sb.append("allow_Passenger_Chat_");
        sb.append('=');
        sb.append(((this.allow_Passenger_Chat_ == null) ? "<null>" : this.allow_Passenger_Chat_));
        sb.append(',');
        sb.append("allow_Passengers");
        sb.append('=');
        sb.append(this.allow_Passengers);
        sb.append(',');
        sb.append("allow_Passengers_");
        sb.append('=');
        sb.append(((this.allow_Passengers_ == null) ? "<null>" : this.allow_Passengers_));
        sb.append(',');
        sb.append("allow_Spectator_Chat");
        sb.append('=');
        sb.append(this.allow_Spectator_Chat);
        sb.append(',');
        sb.append("allow_Spectator_Chat_");
        sb.append('=');
        sb.append(((this.allow_Spectator_Chat_ == null) ? "<null>" : this.allow_Spectator_Chat_));
        sb.append(',');
        sb.append("allow_Spectators");
        sb.append('=');
        sb.append(this.allow_Spectators);
        sb.append(',');
        sb.append("allow_Spectators_");
        sb.append('=');
        sb.append(((this.allow_Spectators_ == null) ? "<null>" : this.allow_Spectators_));
        sb.append(',');
        sb.append("allowed_Antilock_Brakes");
        sb.append('=');
        sb.append(this.allowed_Antilock_Brakes);
        sb.append(',');
        sb.append("allowed_Antilock_Brakes_");
        sb.append('=');
        sb.append(((this.allowed_Antilock_Brakes_ == null) ? "<null>" : this.allowed_Antilock_Brakes_));
        sb.append(',');
        sb.append("allowed_Auto_Blip");
        sb.append('=');
        sb.append(this.allowed_Auto_Blip);
        sb.append(',');
        sb.append("allowed_Auto_Blip_");
        sb.append('=');
        sb.append(((this.allowed_Auto_Blip_ == null) ? "<null>" : this.allowed_Auto_Blip_));
        sb.append(',');
        sb.append("allowed_Auto_Clutch");
        sb.append('=');
        sb.append(this.allowed_Auto_Clutch);
        sb.append(',');
        sb.append("allowed_Auto_Clutch_");
        sb.append('=');
        sb.append(((this.allowed_Auto_Clutch_ == null) ? "<null>" : this.allowed_Auto_Clutch_));
        sb.append(',');
        sb.append("allowed_Auto_Lift");
        sb.append('=');
        sb.append(this.allowed_Auto_Lift);
        sb.append(',');
        sb.append("allowed_Auto_Lift_");
        sb.append('=');
        sb.append(((this.allowed_Auto_Lift_ == null) ? "<null>" : this.allowed_Auto_Lift_));
        sb.append(',');
        sb.append("allowed_Auto_Pit");
        sb.append('=');
        sb.append(this.allowed_Auto_Pit);
        sb.append(',');
        sb.append("allowed_Auto_Pit_");
        sb.append('=');
        sb.append(((this.allowed_Auto_Pit_ == null) ? "<null>" : this.allowed_Auto_Pit_));
        sb.append(',');
        sb.append("allowed_Auto_Shift");
        sb.append('=');
        sb.append(this.allowed_Auto_Shift);
        sb.append(',');
        sb.append("allowed_Auto_Shift_");
        sb.append('=');
        sb.append(((this.allowed_Auto_Shift_ == null) ? "<null>" : this.allowed_Auto_Shift_));
        sb.append(',');
        sb.append("allowed_Brake_Help");
        sb.append('=');
        sb.append(this.allowed_Brake_Help);
        sb.append(',');
        sb.append("allowed_Brake_Help_");
        sb.append('=');
        sb.append(((this.allowed_Brake_Help_ == null) ? "<null>" : this.allowed_Brake_Help_));
        sb.append(',');
        sb.append("allowed_Invulnerability");
        sb.append('=');
        sb.append(this.allowed_Invulnerability);
        sb.append(',');
        sb.append("allowed_Invulnerability_");
        sb.append('=');
        sb.append(((this.allowed_Invulnerability_ == null) ? "<null>" : this.allowed_Invulnerability_));
        sb.append(',');
        sb.append("allowed_Opposite_Lock");
        sb.append('=');
        sb.append(this.allowed_Opposite_Lock);
        sb.append(',');
        sb.append("allowed_Opposite_Lock_");
        sb.append('=');
        sb.append(((this.allowed_Opposite_Lock_ == null) ? "<null>" : this.allowed_Opposite_Lock_));
        sb.append(',');
        sb.append("allowed_Spin_Recovery");
        sb.append('=');
        sb.append(this.allowed_Spin_Recovery);
        sb.append(',');
        sb.append("allowed_Spin_Recovery_");
        sb.append('=');
        sb.append(((this.allowed_Spin_Recovery_ == null) ? "<null>" : this.allowed_Spin_Recovery_));
        sb.append(',');
        sb.append("allowed_Stability_Control");
        sb.append('=');
        sb.append(this.allowed_Stability_Control);
        sb.append(',');
        sb.append("allowed_Stability_Control_");
        sb.append('=');
        sb.append(((this.allowed_Stability_Control_ == null) ? "<null>" : this.allowed_Stability_Control_));
        sb.append(',');
        sb.append("allowed_Steering_Help");
        sb.append('=');
        sb.append(this.allowed_Steering_Help);
        sb.append(',');
        sb.append("allowed_Steering_Help_");
        sb.append('=');
        sb.append(((this.allowed_Steering_Help_ == null) ? "<null>" : this.allowed_Steering_Help_));
        sb.append(',');
        sb.append("allowed_Traction_Control");
        sb.append('=');
        sb.append(this.allowed_Traction_Control);
        sb.append(',');
        sb.append("allowed_Traction_Control_");
        sb.append('=');
        sb.append(((this.allowed_Traction_Control_ == null) ? "<null>" : this.allowed_Traction_Control_));
        sb.append(',');
        sb.append("assign_Parking");
        sb.append('=');
        sb.append(this.assign_Parking);
        sb.append(',');
        sb.append("assign_Parking_");
        sb.append('=');
        sb.append(((this.assign_Parking_ == null) ? "<null>" : this.assign_Parking_));
        sb.append(',');
        sb.append("client_Fuel_Visible");
        sb.append('=');
        sb.append(this.client_Fuel_Visible);
        sb.append(',');
        sb.append("client_Fuel_Visible_");
        sb.append('=');
        sb.append(((this.client_Fuel_Visible_ == null) ? "<null>" : this.client_Fuel_Visible_));
        sb.append(',');
        sb.append("closed_Qualify_Sessions");
        sb.append('=');
        sb.append(this.closed_Qualify_Sessions);
        sb.append(',');
        sb.append("closed_Qualify_Sessions_");
        sb.append('=');
        sb.append(((this.closed_Qualify_Sessions_ == null) ? "<null>" : this.closed_Qualify_Sessions_));
        sb.append(',');
        sb.append("closed_Race_Sessions");
        sb.append('=');
        sb.append(this.closed_Race_Sessions);
        sb.append(',');
        sb.append("closed_Race_Sessions_");
        sb.append('=');
        sb.append(((this.closed_Race_Sessions_ == null) ? "<null>" : this.closed_Race_Sessions_));
        sb.append(',');
        sb.append("collision_Fade_Thresh");
        sb.append('=');
        sb.append(this.collision_Fade_Thresh);
        sb.append(',');
        sb.append("collision_Fade_Thresh_");
        sb.append('=');
        sb.append(((this.collision_Fade_Thresh_ == null) ? "<null>" : this.collision_Fade_Thresh_));
        sb.append(',');
        sb.append("default_Game_Name");
        sb.append('=');
        sb.append(((this.default_Game_Name == null) ? "<null>" : this.default_Game_Name));
        sb.append(',');
        sb.append("default_Game_Name_");
        sb.append('=');
        sb.append(((this.default_Game_Name_ == null) ? "<null>" : this.default_Game_Name_));
        sb.append(',');
        sb.append("delay_After_Race");
        sb.append('=');
        sb.append(this.delay_After_Race);
        sb.append(',');
        sb.append("delay_After_Race_");
        sb.append('=');
        sb.append(((this.delay_After_Race_ == null) ? "<null>" : this.delay_After_Race_));
        sb.append(',');
        sb.append("delay_Between_Sessions");
        sb.append('=');
        sb.append(this.delay_Between_Sessions);
        sb.append(',');
        sb.append("delay_Between_Sessions_");
        sb.append('=');
        sb.append(((this.delay_Between_Sessions_ == null) ? "<null>" : this.delay_Between_Sessions_));
        sb.append(',');
        sb.append("driver_Swap_Setups");
        sb.append('=');
        sb.append(this.driver_Swap_Setups);
        sb.append(',');
        sb.append("driver_Swap_Setups_");
        sb.append('=');
        sb.append(((this.driver_Swap_Setups_ == null) ? "<null>" : this.driver_Swap_Setups_));
        sb.append(',');
        sb.append("enable_Autodownloads");
        sb.append('=');
        sb.append(this.enable_Autodownloads);
        sb.append(',');
        sb.append("enable_Autodownloads_");
        sb.append('=');
        sb.append(((this.enable_Autodownloads_ == null) ? "<null>" : this.enable_Autodownloads_));
        sb.append(',');
        sb.append("enforce_Real_Name");
        sb.append('=');
        sb.append(this.enforce_Real_Name);
        sb.append(',');
        sb.append("enforce_Real_Name_");
        sb.append('=');
        sb.append(((this.enforce_Real_Name_ == null) ? "<null>" : this.enforce_Real_Name_));
        sb.append(',');
        sb.append("forced_Driving_View");
        sb.append('=');
        sb.append(this.forced_Driving_View);
        sb.append(',');
        sb.append("forced_Driving_View_");
        sb.append('=');
        sb.append(((this.forced_Driving_View_ == null) ? "<null>" : this.forced_Driving_View_));
        sb.append(',');
        sb.append("hTTP_Server_Document_Root");
        sb.append('=');
        sb.append(((this.hTTP_Server_Document_Root == null) ? "<null>" : this.hTTP_Server_Document_Root));
        sb.append(',');
        sb.append("hTTP_Server_Document_Root_");
        sb.append('=');
        sb.append(((this.hTTP_Server_Document_Root_ == null) ? "<null>" : this.hTTP_Server_Document_Root_));
        sb.append(',');
        sb.append("hTTP_Server_Max_File_Size");
        sb.append('=');
        sb.append(this.hTTP_Server_Max_File_Size);
        sb.append(',');
        sb.append("hTTP_Server_Max_File_Size_");
        sb.append('=');
        sb.append(((this.hTTP_Server_Max_File_Size_ == null) ? "<null>" : this.hTTP_Server_Max_File_Size_));
        sb.append(',');
        sb.append("hTTP_Server_Send_Rate");
        sb.append('=');
        sb.append(this.hTTP_Server_Send_Rate);
        sb.append(',');
        sb.append("hTTP_Server_Send_Rate_");
        sb.append('=');
        sb.append(((this.hTTP_Server_Send_Rate_ == null) ? "<null>" : this.hTTP_Server_Send_Rate_));
        sb.append(',');
        sb.append("isolation");
        sb.append('=');
        sb.append(this.isolation);
        sb.append(',');
        sb.append("isolation_");
        sb.append('=');
        sb.append(((this.isolation_ == null) ? "<null>" : this.isolation_));
        sb.append(',');
        sb.append("join_Password");
        sb.append('=');
        sb.append(((this.join_Password == null) ? "<null>" : this.join_Password));
        sb.append(',');
        sb.append("join_Password_");
        sb.append('=');
        sb.append(((this.join_Password_ == null) ? "<null>" : this.join_Password_));
        sb.append(',');
        sb.append("lessen_Restrictions");
        sb.append('=');
        sb.append(this.lessen_Restrictions);
        sb.append(',');
        sb.append("lessen_Restrictions_");
        sb.append('=');
        sb.append(((this.lessen_Restrictions_ == null) ? "<null>" : this.lessen_Restrictions_));
        sb.append(',');
        sb.append("loading_Priority");
        sb.append('=');
        sb.append(this.loading_Priority);
        sb.append(',');
        sb.append("loading_Priority_");
        sb.append('=');
        sb.append(((this.loading_Priority_ == null) ? "<null>" : this.loading_Priority_));
        sb.append(',');
        sb.append("loading_Sleep_Time");
        sb.append('=');
        sb.append(this.loading_Sleep_Time);
        sb.append(',');
        sb.append("loading_Sleep_Time_");
        sb.append('=');
        sb.append(((this.loading_Sleep_Time_ == null) ? "<null>" : this.loading_Sleep_Time_));
        sb.append(',');
        sb.append("loose_Content_Transfer");
        sb.append('=');
        sb.append(this.loose_Content_Transfer);
        sb.append(',');
        sb.append("loose_Content_Transfer_");
        sb.append('=');
        sb.append(((this.loose_Content_Transfer_ == null) ? "<null>" : this.loose_Content_Transfer_));
        sb.append(',');
        sb.append("max_Data_Per_Client");
        sb.append('=');
        sb.append(this.max_Data_Per_Client);
        sb.append(',');
        sb.append("max_Data_Per_Client_");
        sb.append('=');
        sb.append(((this.max_Data_Per_Client_ == null) ? "<null>" : this.max_Data_Per_Client_));
        sb.append(',');
        sb.append("max_MP_Players");
        sb.append('=');
        sb.append(this.max_MP_Players);
        sb.append(',');
        sb.append("maximum_AI");
        sb.append('=');
        sb.append(this.maximum_AI);
        sb.append(',');
        sb.append("maximum_AI_");
        sb.append('=');
        sb.append(((this.maximum_AI_ == null) ? "<null>" : this.maximum_AI_));
        sb.append(',');
        sb.append("minimum_AI");
        sb.append('=');
        sb.append(this.minimum_AI);
        sb.append(',');
        sb.append("minimum_AI_");
        sb.append('=');
        sb.append(((this.minimum_AI_ == null) ? "<null>" : this.minimum_AI_));
        sb.append(',');
        sb.append("must_Be_Stopped");
        sb.append('=');
        sb.append(this.must_Be_Stopped);
        sb.append(',');
        sb.append("must_Be_Stopped_");
        sb.append('=');
        sb.append(((this.must_Be_Stopped_ == null) ? "<null>" : this.must_Be_Stopped_));
        sb.append(',');
        sb.append("nagle_Algorithm");
        sb.append('=');
        sb.append(this.nagle_Algorithm);
        sb.append(',');
        sb.append("nagle_Algorithm_");
        sb.append('=');
        sb.append(((this.nagle_Algorithm_ == null) ? "<null>" : this.nagle_Algorithm_));
        sb.append(',');
        sb.append("pause_At_Start_Of_First_Session");
        sb.append('=');
        sb.append(this.pause_At_Start_Of_First_Session);
        sb.append(',');
        sb.append("pause_At_Start_Of_First_Session_");
        sb.append('=');
        sb.append(((this.pause_At_Start_Of_First_Session_ == null) ? "<null>" : this.pause_At_Start_Of_First_Session_));
        sb.append(',');
        sb.append("pause_While_Zero_Players");
        sb.append('=');
        sb.append(this.pause_While_Zero_Players);
        sb.append(',');
        sb.append("pause_While_Zero_Players_");
        sb.append('=');
        sb.append(((this.pause_While_Zero_Players_ == null) ? "<null>" : this.pause_While_Zero_Players_));
        sb.append(',');
        sb.append("pit_Speed_Override");
        sb.append('=');
        sb.append(this.pit_Speed_Override);
        sb.append(',');
        sb.append("pit_Speed_Override_");
        sb.append('=');
        sb.append(((this.pit_Speed_Override_ == null) ? "<null>" : this.pit_Speed_Override_));
        sb.append(',');
        sb.append("plugin_Heartbeat_Rate");
        sb.append('=');
        sb.append(this.plugin_Heartbeat_Rate);
        sb.append(',');
        sb.append("plugin_Heartbeat_Rate_");
        sb.append('=');
        sb.append(((this.plugin_Heartbeat_Rate_ == null) ? "<null>" : this.plugin_Heartbeat_Rate_));
        sb.append(',');
        sb.append("practice_1_Time");
        sb.append('=');
        sb.append(this.practice_1_Time);
        sb.append(',');
        sb.append("practice_1_Time_");
        sb.append('=');
        sb.append(((this.practice_1_Time_ == null) ? "<null>" : this.practice_1_Time_));
        sb.append(',');
        sb.append("qualifying_Laps");
        sb.append('=');
        sb.append(this.qualifying_Laps);
        sb.append(',');
        sb.append("qualifying_Laps_");
        sb.append('=');
        sb.append(((this.qualifying_Laps_ == null) ? "<null>" : this.qualifying_Laps_));
        sb.append(',');
        sb.append("qualifying_Time");
        sb.append('=');
        sb.append(this.qualifying_Time);
        sb.append(',');
        sb.append("qualifying_Time_");
        sb.append('=');
        sb.append(((this.qualifying_Time_ == null) ? "<null>" : this.qualifying_Time_));
        sb.append(',');
        sb.append("race_Client_Wait");
        sb.append('=');
        sb.append(this.race_Client_Wait);
        sb.append(',');
        sb.append("race_Client_Wait_");
        sb.append('=');
        sb.append(((this.race_Client_Wait_ == null) ? "<null>" : this.race_Client_Wait_));
        sb.append(',');
        sb.append("race_Rejoin");
        sb.append('=');
        sb.append(this.race_Rejoin);
        sb.append(',');
        sb.append("race_Rejoin_");
        sb.append('=');
        sb.append(((this.race_Rejoin_ == null) ? "<null>" : this.race_Rejoin_));
        sb.append(',');
        sb.append("server_Session_End_Timeout");
        sb.append('=');
        sb.append(this.server_Session_End_Timeout);
        sb.append(',');
        sb.append("server_Session_End_Timeout_");
        sb.append('=');
        sb.append(((this.server_Session_End_Timeout_ == null) ? "<null>" : this.server_Session_End_Timeout_));
        sb.append(',');
        sb.append("superAdminPassword");
        sb.append('=');
        sb.append(((this.superAdminPassword == null) ? "<null>" : this.superAdminPassword));
        sb.append(',');
        sb.append("superAdminPassword_");
        sb.append('=');
        sb.append(((this.superAdminPassword_ == null) ? "<null>" : this.superAdminPassword_));
        sb.append(',');
        sb.append("test_Day");
        sb.append('=');
        sb.append(this.test_Day);
        sb.append(',');
        sb.append("test_Day_");
        sb.append('=');
        sb.append(((this.test_Day_ == null) ? "<null>" : this.test_Day_));
        sb.append(',');
        sb.append("unique_Vehicle_Check");
        sb.append('=');
        sb.append(this.unique_Vehicle_Check);
        sb.append(',');
        sb.append("unique_Vehicle_Check_");
        sb.append('=');
        sb.append(((this.unique_Vehicle_Check_ == null) ? "<null>" : this.unique_Vehicle_Check_));
        sb.append(',');
        sb.append("unthrottle_ID");
        sb.append('=');
        sb.append(this.unthrottle_ID);
        sb.append(',');
        sb.append("unthrottle_ID_");
        sb.append('=');
        sb.append(((this.unthrottle_ID_ == null) ? "<null>" : this.unthrottle_ID_));
        sb.append(',');
        sb.append("unthrottle_Prefix");
        sb.append('=');
        sb.append(((this.unthrottle_Prefix == null) ? "<null>" : this.unthrottle_Prefix));
        sb.append(',');
        sb.append("unthrottle_Prefix_");
        sb.append('=');
        sb.append(((this.unthrottle_Prefix_ == null) ? "<null>" : this.unthrottle_Prefix_));
        sb.append(',');
        sb.append("vote_Max_Race_Restarts");
        sb.append('=');
        sb.append(this.vote_Max_Race_Restarts);
        sb.append(',');
        sb.append("vote_Max_Race_Restarts_");
        sb.append('=');
        sb.append(((this.vote_Max_Race_Restarts_ == null) ? "<null>" : this.vote_Max_Race_Restarts_));
        sb.append(',');
        sb.append("vote_Min_Voters");
        sb.append('=');
        sb.append(this.vote_Min_Voters);
        sb.append(',');
        sb.append("vote_Min_Voters_");
        sb.append('=');
        sb.append(((this.vote_Min_Voters_ == null) ? "<null>" : this.vote_Min_Voters_));
        sb.append(',');
        sb.append("vote_Percentage_Add_AI");
        sb.append('=');
        sb.append(this.vote_Percentage_Add_AI);
        sb.append(',');
        sb.append("vote_Percentage_Add_AI_");
        sb.append('=');
        sb.append(((this.vote_Percentage_Add_AI_ == null) ? "<null>" : this.vote_Percentage_Add_AI_));
        sb.append(',');
        sb.append("vote_Percentage_Next_Session");
        sb.append('=');
        sb.append(this.vote_Percentage_Next_Session);
        sb.append(',');
        sb.append("vote_Percentage_Next_Session_");
        sb.append('=');
        sb.append(((this.vote_Percentage_Next_Session_ == null) ? "<null>" : this.vote_Percentage_Next_Session_));
        sb.append(',');
        sb.append("vote_Percentage_Other");
        sb.append('=');
        sb.append(this.vote_Percentage_Other);
        sb.append(',');
        sb.append("vote_Percentage_Other_");
        sb.append('=');
        sb.append(((this.vote_Percentage_Other_ == null) ? "<null>" : this.vote_Percentage_Other_));
        sb.append(',');
        sb.append("warmup_Time");
        sb.append('=');
        sb.append(this.warmup_Time);
        sb.append(',');
        sb.append("warmup_Time_");
        sb.append('=');
        sb.append(((this.warmup_Time_ == null) ? "<null>" : this.warmup_Time_));
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
        result = ((result * 31) + (this.allow_Passenger_Chat ? 1 : 0));
        result = ((result * 31) + this.allowed_Traction_Control);
        result = ((result * 31) + ((this.admin_Password_ == null) ? 0 : this.admin_Password_.hashCode()));
        result = ((result * 31) + ((this.join_Password_ == null) ? 0 : this.join_Password_.hashCode()));
        result = ((result * 31) + ((this.superAdminPassword == null) ? 0 : this.superAdminPassword.hashCode()));
        result = ((result * 31) + this.allowed_Steering_Help);
        result = ((result * 31) + ((this.loading_Sleep_Time_ == null) ? 0 : this.loading_Sleep_Time_.hashCode()));
        result = ((result * 31) + ((this.vote_Percentage_Other_ == null) ? 0 : this.vote_Percentage_Other_.hashCode()));
        result = ((result * 31) + ((this.vote_Percentage_Add_AI_ == null) ? 0 : this.vote_Percentage_Add_AI_.hashCode()));
        result = ((result * 31) + (this.enforce_Real_Name ? 1 : 0));
        result = ((result * 31) + this.allow_Hotlap_Completion);
        result = ((result * 31) + ((this.allowed_Opposite_Lock_ == null) ? 0 : this.allowed_Opposite_Lock_.hashCode()));
        result = ((result * 31) + ((this.pause_While_Zero_Players_ == null) ? 0 : this.pause_While_Zero_Players_.hashCode()));
        result = ((result * 31) + ((this.forced_Driving_View_ == null) ? 0 : this.forced_Driving_View_.hashCode()));
        result = ((result * 31) + this.vote_Percentage_Add_AI);
        result = ((result * 31) + ((this.allow_Spectator_Chat_ == null) ? 0 : this.allow_Spectator_Chat_.hashCode()));
        result = ((result * 31) + ((this.allow_Spectators_ == null) ? 0 : this.allow_Spectators_.hashCode()));
        result = ((result * 31) + this.vote_Max_Race_Restarts);
        result = ((result * 31) + ((this.default_Game_Name == null) ? 0 : this.default_Game_Name.hashCode()));
        result = ((result * 31) + this.forced_Driving_View);
        result = ((result * 31) + ((this.allowed_Auto_Clutch_ == null) ? 0 : this.allowed_Auto_Clutch_.hashCode()));
        result = ((result * 31) + ((this.loading_Priority_ == null) ? 0 : this.loading_Priority_.hashCode()));
        result = ((result * 31) + this.practice_1_Time);
        result = ((result * 31) + ((this.qualifying_Laps_ == null) ? 0 : this.qualifying_Laps_.hashCode()));
        result = ((result * 31) + this.unthrottle_ID);
        result = ((result * 31) + this.isolation);
        result = ((result * 31) + Float.floatToIntBits(this.collision_Fade_Thresh));
        result = ((result * 31) + ((this.lessen_Restrictions_ == null) ? 0 : this.lessen_Restrictions_.hashCode()));
        result = ((result * 31) + ((this.unthrottle_Prefix_ == null) ? 0 : this.unthrottle_Prefix_.hashCode()));
        result = ((result * 31) + (this.pause_At_Start_Of_First_Session ? 1 : 0));
        result = ((result * 31) + ((this.allowed_Spin_Recovery_ == null) ? 0 : this.allowed_Spin_Recovery_.hashCode()));
        result = ((result * 31) + ((this.loose_Content_Transfer_ == null) ? 0 : this.loose_Content_Transfer_.hashCode()));
        result = ((result * 31) + ((this.allow_AI_Toggle_ == null) ? 0 : this.allow_AI_Toggle_.hashCode()));
        result = ((result * 31) + this.allowed_Opposite_Lock);
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + this.race_Rejoin);
        result = ((result * 31) + this.allowed_Auto_Blip);
        result = ((result * 31) + this.loading_Priority);
        result = ((result * 31) + this.pit_Speed_Override);
        result = ((result * 31) + ((this.allowed_Auto_Pit_ == null) ? 0 : this.allowed_Auto_Pit_.hashCode()));
        result = ((result * 31) + this.qualifying_Laps);
        result = ((result * 31) + this.client_Fuel_Visible);
        result = ((result * 31) + (this.nagle_Algorithm ? 1 : 0));
        result = ((result * 31) + ((this.enable_Autodownloads_ == null) ? 0 : this.enable_Autodownloads_.hashCode()));
        result = ((result * 31) + this.closed_Qualify_Sessions);
        result = ((result * 31) + ((this.race_Rejoin_ == null) ? 0 : this.race_Rejoin_.hashCode()));
        result = ((result * 31) + ((this.delay_After_Race_ == null) ? 0 : this.delay_After_Race_.hashCode()));
        result = ((result * 31) + ((this.warmup_Time_ == null) ? 0 : this.warmup_Time_.hashCode()));
        result = ((result * 31) + this.allowed_Auto_Lift);
        result = ((result * 31) + (this.allow_Passengers ? 1 : 0));
        result = ((result * 31) + this.vote_Percentage_Other);
        result = ((result * 31) + this.allowed_Brake_Help);
        result = ((result * 31) + this.vote_Percentage_Next_Session);
        result = ((result * 31) + ((this.allow_Passengers_ == null) ? 0 : this.allow_Passengers_.hashCode()));
        result = ((result * 31) + ((this.join_Password == null) ? 0 : this.join_Password.hashCode()));
        result = ((result * 31) + ((this.nagle_Algorithm_ == null) ? 0 : this.nagle_Algorithm_.hashCode()));
        result = ((result * 31) + ((this.test_Day_ == null) ? 0 : this.test_Day_.hashCode()));
        result = ((result * 31) + ((this.closed_Race_Sessions_ == null) ? 0 : this.closed_Race_Sessions_.hashCode()));
        result = ((result * 31) + ((this.enforce_Real_Name_ == null) ? 0 : this.enforce_Real_Name_.hashCode()));
        result = ((result * 31) + ((this.unique_Vehicle_Check_ == null) ? 0 : this.unique_Vehicle_Check_.hashCode()));
        result = ((result * 31) + this.allow_Any_Event);
        result = ((result * 31) + this.maximum_AI);
        result = ((result * 31) + ((this.vote_Percentage_Next_Session_ == null) ? 0 : this.vote_Percentage_Next_Session_.hashCode()));
        result = ((result * 31) + this.allowed_Auto_Clutch);
        result = ((result * 31) + ((this.allowed_Auto_Shift_ == null) ? 0 : this.allowed_Auto_Shift_.hashCode()));
        result = ((result * 31) + this.allowed_Auto_Pit);
        result = ((result * 31) + (this.lessen_Restrictions ? 1 : 0));
        result = ((result * 31) + this.race_Client_Wait);
        result = ((result * 31) + ((this.hTTP_Server_Document_Root_ == null) ? 0 : this.hTTP_Server_Document_Root_.hashCode()));
        result = ((result * 31) + ((this.allow_Passenger_Chat_ == null) ? 0 : this.allow_Passenger_Chat_.hashCode()));
        result = ((result * 31) + this.allowed_Spin_Recovery);
        result = ((result * 31) + ((this.hTTP_Server_Max_File_Size_ == null) ? 0 : this.hTTP_Server_Max_File_Size_.hashCode()));
        result = ((result * 31) + ((this.delay_Between_Sessions_ == null) ? 0 : this.delay_Between_Sessions_.hashCode()));
        result = ((result * 31) + ((this.unthrottle_Prefix == null) ? 0 : this.unthrottle_Prefix.hashCode()));
        result = ((result * 31) + ((this.allow_Hotlap_Completion_ == null) ? 0 : this.allow_Hotlap_Completion_.hashCode()));
        result = ((result * 31) + ((this.allowed_Auto_Blip_ == null) ? 0 : this.allowed_Auto_Blip_.hashCode()));
        result = ((result * 31) + ((this.superAdminPassword_ == null) ? 0 : this.superAdminPassword_.hashCode()));
        result = ((result * 31) + this.delay_After_Race);
        result = ((result * 31) + (this.pause_While_Zero_Players ? 1 : 0));
        result = ((result * 31) + ((this.plugin_Heartbeat_Rate_ == null) ? 0 : this.plugin_Heartbeat_Rate_.hashCode()));
        result = ((result * 31) + ((this.minimum_AI_ == null) ? 0 : this.minimum_AI_.hashCode()));
        result = ((result * 31) + this.allowed_Invulnerability);
        result = ((result * 31) + ((this.driver_Swap_Setups_ == null) ? 0 : this.driver_Swap_Setups_.hashCode()));
        result = ((result * 31) + ((int) (this.hTTP_Server_Send_Rate ^ (this.hTTP_Server_Send_Rate >>> 32))));
        result = ((result * 31) + ((this.vote_Min_Voters_ == null) ? 0 : this.vote_Min_Voters_.hashCode()));
        result = ((result * 31) + ((this.admin_Functionality_ == null) ? 0 : this.admin_Functionality_.hashCode()));
        result = ((result * 31) + ((this.allow_Hotswaps_ == null) ? 0 : this.allow_Hotswaps_.hashCode()));
        result = ((result * 31) + this.delay_Between_Sessions);
        result = ((result * 31) + ((this.hTTP_Server_Document_Root == null) ? 0 : this.hTTP_Server_Document_Root.hashCode()));
        result = ((result * 31) + ((this.admin_Password == null) ? 0 : this.admin_Password.hashCode()));
        result = ((result * 31) + this.plugin_Heartbeat_Rate);
        result = ((result * 31) + (this.must_Be_Stopped ? 1 : 0));
        result = ((result * 31) + ((this.allow_Any_Event_ == null) ? 0 : this.allow_Any_Event_.hashCode()));
        result = ((result * 31) + ((this.vote_Max_Race_Restarts_ == null) ? 0 : this.vote_Max_Race_Restarts_.hashCode()));
        result = ((result * 31) + (this.enable_Autodownloads ? 1 : 0));
        result = ((result * 31) + this.max_Data_Per_Client);
        result = ((result * 31) + this.allowed_Auto_Shift);
        result = ((result * 31) + ((this.allowed_Brake_Help_ == null) ? 0 : this.allowed_Brake_Help_.hashCode()));
        result = ((result * 31) + ((this.must_Be_Stopped_ == null) ? 0 : this.must_Be_Stopped_.hashCode()));
        result = ((result * 31) + ((this.allowed_Invulnerability_ == null) ? 0 : this.allowed_Invulnerability_.hashCode()));
        result = ((result * 31) + ((this.assign_Parking_ == null) ? 0 : this.assign_Parking_.hashCode()));
        result = ((result * 31) + (this.assign_Parking ? 1 : 0));
        result = ((result * 31) + ((this.client_Fuel_Visible_ == null) ? 0 : this.client_Fuel_Visible_.hashCode()));
        result = ((result * 31) + ((this.default_Game_Name_ == null) ? 0 : this.default_Game_Name_.hashCode()));
        result = ((result * 31) + this.max_MP_Players);
        result = ((result * 31) + ((this.hTTP_Server_Send_Rate_ == null) ? 0 : this.hTTP_Server_Send_Rate_.hashCode()));
        result = ((result * 31) + ((this.qualifying_Time_ == null) ? 0 : this.qualifying_Time_.hashCode()));
        result = ((result * 31) + (this.allow_Spectator_Chat ? 1 : 0));
        result = ((result * 31) + ((this.max_Data_Per_Client_ == null) ? 0 : this.max_Data_Per_Client_.hashCode()));
        result = ((result * 31) + (this.allow_AI_Toggle ? 1 : 0));
        result = ((result * 31) + this.hTTP_Server_Max_File_Size);
        result = ((result * 31) + this.allowed_Antilock_Brakes);
        result = ((result * 31) + ((this.pause_At_Start_Of_First_Session_ == null) ? 0 : this.pause_At_Start_Of_First_Session_.hashCode()));
        result = ((result * 31) + this.qualifying_Time);
        result = ((result * 31) + this.admin_Functionality);
        result = ((result * 31) + this.minimum_AI);
        result = ((result * 31) + (this.driver_Swap_Setups ? 1 : 0));
        result = ((result * 31) + this.warmup_Time);
        result = ((result * 31) + ((this.allowed_Antilock_Brakes_ == null) ? 0 : this.allowed_Antilock_Brakes_.hashCode()));
        result = ((result * 31) + ((this.collision_Fade_Thresh_ == null) ? 0 : this.collision_Fade_Thresh_.hashCode()));
        result = ((result * 31) + this.vote_Min_Voters);
        result = ((result * 31) + ((this.race_Client_Wait_ == null) ? 0 : this.race_Client_Wait_.hashCode()));
        result = ((result * 31) + this.allowed_Stability_Control);
        result = ((result * 31) + ((this.maximum_AI_ == null) ? 0 : this.maximum_AI_.hashCode()));
        result = ((result * 31) + (this.test_Day ? 1 : 0));
        result = ((result * 31) + ((this.server_Session_End_Timeout_ == null) ? 0 : this.server_Session_End_Timeout_.hashCode()));
        result = ((result * 31) + ((this.allowed_Stability_Control_ == null) ? 0 : this.allowed_Stability_Control_.hashCode()));
        result = ((result * 31) + ((this.isolation_ == null) ? 0 : this.isolation_.hashCode()));
        result = ((result * 31) + this.server_Session_End_Timeout);
        result = ((result * 31) + ((this.closed_Qualify_Sessions_ == null) ? 0 : this.closed_Qualify_Sessions_.hashCode()));
        result = ((result * 31) + this.closed_Race_Sessions);
        result = ((result * 31) + (this.allow_Spectators ? 1 : 0));
        result = ((result * 31) + this.loose_Content_Transfer);
        result = ((result * 31) + (this.allow_Hotswaps ? 1 : 0));
        result = ((result * 31) + ((this.allowed_Traction_Control_ == null) ? 0 : this.allowed_Traction_Control_.hashCode()));
        result = ((result * 31) + ((this.allowed_Auto_Lift_ == null) ? 0 : this.allowed_Auto_Lift_.hashCode()));
        result = ((result * 31) + ((this.pit_Speed_Override_ == null) ? 0 : this.pit_Speed_Override_.hashCode()));
        result = ((result * 31) + (this.unique_Vehicle_Check ? 1 : 0));
        result = ((result * 31) + ((this.practice_1_Time_ == null) ? 0 : this.practice_1_Time_.hashCode()));
        result = ((result * 31) + ((this.unthrottle_ID_ == null) ? 0 : this.unthrottle_ID_.hashCode()));
        result = ((result * 31) + this.loading_Sleep_Time);
        result = ((result * 31) + ((this.allowed_Steering_Help_ == null) ? 0 : this.allowed_Steering_Help_.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MultiplayerServerOptions) == false) {
            return false;
        }
        MultiplayerServerOptions rhs = ((MultiplayerServerOptions) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.allow_Passenger_Chat == rhs.allow_Passenger_Chat) && (this.allowed_Traction_Control == rhs.allowed_Traction_Control)) && ((this.admin_Password_ == rhs.admin_Password_) || ((this.admin_Password_ != null) && this.admin_Password_.equals(rhs.admin_Password_)))) && ((this.join_Password_ == rhs.join_Password_) || ((this.join_Password_ != null) && this.join_Password_.equals(rhs.join_Password_)))) && ((this.superAdminPassword == rhs.superAdminPassword) || ((this.superAdminPassword != null) && this.superAdminPassword.equals(rhs.superAdminPassword)))) && (this.allowed_Steering_Help == rhs.allowed_Steering_Help)) && ((this.loading_Sleep_Time_ == rhs.loading_Sleep_Time_) || ((this.loading_Sleep_Time_ != null) && this.loading_Sleep_Time_.equals(rhs.loading_Sleep_Time_)))) && ((this.vote_Percentage_Other_ == rhs.vote_Percentage_Other_) || ((this.vote_Percentage_Other_ != null) && this.vote_Percentage_Other_.equals(rhs.vote_Percentage_Other_)))) && ((this.vote_Percentage_Add_AI_ == rhs.vote_Percentage_Add_AI_) || ((this.vote_Percentage_Add_AI_ != null) && this.vote_Percentage_Add_AI_.equals(rhs.vote_Percentage_Add_AI_)))) && (this.enforce_Real_Name == rhs.enforce_Real_Name)) && (this.allow_Hotlap_Completion == rhs.allow_Hotlap_Completion)) && ((this.allowed_Opposite_Lock_ == rhs.allowed_Opposite_Lock_) || ((this.allowed_Opposite_Lock_ != null) && this.allowed_Opposite_Lock_.equals(rhs.allowed_Opposite_Lock_)))) && ((this.pause_While_Zero_Players_ == rhs.pause_While_Zero_Players_) || ((this.pause_While_Zero_Players_ != null) && this.pause_While_Zero_Players_.equals(rhs.pause_While_Zero_Players_)))) && ((this.forced_Driving_View_ == rhs.forced_Driving_View_) || ((this.forced_Driving_View_ != null) && this.forced_Driving_View_.equals(rhs.forced_Driving_View_)))) && (this.vote_Percentage_Add_AI == rhs.vote_Percentage_Add_AI)) && ((this.allow_Spectator_Chat_ == rhs.allow_Spectator_Chat_) || ((this.allow_Spectator_Chat_ != null) && this.allow_Spectator_Chat_.equals(rhs.allow_Spectator_Chat_)))) && ((this.allow_Spectators_ == rhs.allow_Spectators_) || ((this.allow_Spectators_ != null) && this.allow_Spectators_.equals(rhs.allow_Spectators_)))) && (this.vote_Max_Race_Restarts == rhs.vote_Max_Race_Restarts)) && ((this.default_Game_Name == rhs.default_Game_Name) || ((this.default_Game_Name != null) && this.default_Game_Name.equals(rhs.default_Game_Name)))) && (this.forced_Driving_View == rhs.forced_Driving_View)) && ((this.allowed_Auto_Clutch_ == rhs.allowed_Auto_Clutch_) || ((this.allowed_Auto_Clutch_ != null) && this.allowed_Auto_Clutch_.equals(rhs.allowed_Auto_Clutch_)))) && ((this.loading_Priority_ == rhs.loading_Priority_) || ((this.loading_Priority_ != null) && this.loading_Priority_.equals(rhs.loading_Priority_)))) && (this.practice_1_Time == rhs.practice_1_Time)) && ((this.qualifying_Laps_ == rhs.qualifying_Laps_) || ((this.qualifying_Laps_ != null) && this.qualifying_Laps_.equals(rhs.qualifying_Laps_)))) && (this.unthrottle_ID == rhs.unthrottle_ID)) && (this.isolation == rhs.isolation)) && (Float.floatToIntBits(this.collision_Fade_Thresh) == Float.floatToIntBits(rhs.collision_Fade_Thresh))) && ((this.lessen_Restrictions_ == rhs.lessen_Restrictions_) || ((this.lessen_Restrictions_ != null) && this.lessen_Restrictions_.equals(rhs.lessen_Restrictions_)))) && ((this.unthrottle_Prefix_ == rhs.unthrottle_Prefix_) || ((this.unthrottle_Prefix_ != null) && this.unthrottle_Prefix_.equals(rhs.unthrottle_Prefix_)))) && (this.pause_At_Start_Of_First_Session == rhs.pause_At_Start_Of_First_Session)) && ((this.allowed_Spin_Recovery_ == rhs.allowed_Spin_Recovery_) || ((this.allowed_Spin_Recovery_ != null) && this.allowed_Spin_Recovery_.equals(rhs.allowed_Spin_Recovery_)))) && ((this.loose_Content_Transfer_ == rhs.loose_Content_Transfer_) || ((this.loose_Content_Transfer_ != null) && this.loose_Content_Transfer_.equals(rhs.loose_Content_Transfer_)))) && ((this.allow_AI_Toggle_ == rhs.allow_AI_Toggle_) || ((this.allow_AI_Toggle_ != null) && this.allow_AI_Toggle_.equals(rhs.allow_AI_Toggle_)))) && (this.allowed_Opposite_Lock == rhs.allowed_Opposite_Lock)) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && (this.race_Rejoin == rhs.race_Rejoin)) && (this.allowed_Auto_Blip == rhs.allowed_Auto_Blip)) && (this.loading_Priority == rhs.loading_Priority)) && (this.pit_Speed_Override == rhs.pit_Speed_Override)) && ((this.allowed_Auto_Pit_ == rhs.allowed_Auto_Pit_) || ((this.allowed_Auto_Pit_ != null) && this.allowed_Auto_Pit_.equals(rhs.allowed_Auto_Pit_)))) && (this.qualifying_Laps == rhs.qualifying_Laps)) && (this.client_Fuel_Visible == rhs.client_Fuel_Visible)) && (this.nagle_Algorithm == rhs.nagle_Algorithm)) && ((this.enable_Autodownloads_ == rhs.enable_Autodownloads_) || ((this.enable_Autodownloads_ != null) && this.enable_Autodownloads_.equals(rhs.enable_Autodownloads_)))) && (this.closed_Qualify_Sessions == rhs.closed_Qualify_Sessions)) && ((this.race_Rejoin_ == rhs.race_Rejoin_) || ((this.race_Rejoin_ != null) && this.race_Rejoin_.equals(rhs.race_Rejoin_)))) && ((this.delay_After_Race_ == rhs.delay_After_Race_) || ((this.delay_After_Race_ != null) && this.delay_After_Race_.equals(rhs.delay_After_Race_)))) && ((this.warmup_Time_ == rhs.warmup_Time_) || ((this.warmup_Time_ != null) && this.warmup_Time_.equals(rhs.warmup_Time_)))) && (this.allowed_Auto_Lift == rhs.allowed_Auto_Lift)) && (this.allow_Passengers == rhs.allow_Passengers)) && (this.vote_Percentage_Other == rhs.vote_Percentage_Other)) && (this.allowed_Brake_Help == rhs.allowed_Brake_Help)) && (this.vote_Percentage_Next_Session == rhs.vote_Percentage_Next_Session)) && ((this.allow_Passengers_ == rhs.allow_Passengers_) || ((this.allow_Passengers_ != null) && this.allow_Passengers_.equals(rhs.allow_Passengers_)))) && ((this.join_Password == rhs.join_Password) || ((this.join_Password != null) && this.join_Password.equals(rhs.join_Password)))) && ((this.nagle_Algorithm_ == rhs.nagle_Algorithm_) || ((this.nagle_Algorithm_ != null) && this.nagle_Algorithm_.equals(rhs.nagle_Algorithm_)))) && ((this.test_Day_ == rhs.test_Day_) || ((this.test_Day_ != null) && this.test_Day_.equals(rhs.test_Day_)))) && ((this.closed_Race_Sessions_ == rhs.closed_Race_Sessions_) || ((this.closed_Race_Sessions_ != null) && this.closed_Race_Sessions_.equals(rhs.closed_Race_Sessions_)))) && ((this.enforce_Real_Name_ == rhs.enforce_Real_Name_) || ((this.enforce_Real_Name_ != null) && this.enforce_Real_Name_.equals(rhs.enforce_Real_Name_)))) && ((this.unique_Vehicle_Check_ == rhs.unique_Vehicle_Check_) || ((this.unique_Vehicle_Check_ != null) && this.unique_Vehicle_Check_.equals(rhs.unique_Vehicle_Check_)))) && (this.allow_Any_Event == rhs.allow_Any_Event)) && (this.maximum_AI == rhs.maximum_AI)) && ((this.vote_Percentage_Next_Session_ == rhs.vote_Percentage_Next_Session_) || ((this.vote_Percentage_Next_Session_ != null) && this.vote_Percentage_Next_Session_.equals(rhs.vote_Percentage_Next_Session_)))) && (this.allowed_Auto_Clutch == rhs.allowed_Auto_Clutch)) && ((this.allowed_Auto_Shift_ == rhs.allowed_Auto_Shift_) || ((this.allowed_Auto_Shift_ != null) && this.allowed_Auto_Shift_.equals(rhs.allowed_Auto_Shift_)))) && (this.allowed_Auto_Pit == rhs.allowed_Auto_Pit)) && (this.lessen_Restrictions == rhs.lessen_Restrictions)) && (this.race_Client_Wait == rhs.race_Client_Wait)) && ((this.hTTP_Server_Document_Root_ == rhs.hTTP_Server_Document_Root_) || ((this.hTTP_Server_Document_Root_ != null) && this.hTTP_Server_Document_Root_.equals(rhs.hTTP_Server_Document_Root_)))) && ((this.allow_Passenger_Chat_ == rhs.allow_Passenger_Chat_) || ((this.allow_Passenger_Chat_ != null) && this.allow_Passenger_Chat_.equals(rhs.allow_Passenger_Chat_)))) && (this.allowed_Spin_Recovery == rhs.allowed_Spin_Recovery)) && ((this.hTTP_Server_Max_File_Size_ == rhs.hTTP_Server_Max_File_Size_) || ((this.hTTP_Server_Max_File_Size_ != null) && this.hTTP_Server_Max_File_Size_.equals(rhs.hTTP_Server_Max_File_Size_)))) && ((this.delay_Between_Sessions_ == rhs.delay_Between_Sessions_) || ((this.delay_Between_Sessions_ != null) && this.delay_Between_Sessions_.equals(rhs.delay_Between_Sessions_)))) && ((this.unthrottle_Prefix == rhs.unthrottle_Prefix) || ((this.unthrottle_Prefix != null) && this.unthrottle_Prefix.equals(rhs.unthrottle_Prefix)))) && ((this.allow_Hotlap_Completion_ == rhs.allow_Hotlap_Completion_) || ((this.allow_Hotlap_Completion_ != null) && this.allow_Hotlap_Completion_.equals(rhs.allow_Hotlap_Completion_)))) && ((this.allowed_Auto_Blip_ == rhs.allowed_Auto_Blip_) || ((this.allowed_Auto_Blip_ != null) && this.allowed_Auto_Blip_.equals(rhs.allowed_Auto_Blip_)))) && ((this.superAdminPassword_ == rhs.superAdminPassword_) || ((this.superAdminPassword_ != null) && this.superAdminPassword_.equals(rhs.superAdminPassword_)))) && (this.delay_After_Race == rhs.delay_After_Race)) && (this.pause_While_Zero_Players == rhs.pause_While_Zero_Players)) && ((this.plugin_Heartbeat_Rate_ == rhs.plugin_Heartbeat_Rate_) || ((this.plugin_Heartbeat_Rate_ != null) && this.plugin_Heartbeat_Rate_.equals(rhs.plugin_Heartbeat_Rate_)))) && ((this.minimum_AI_ == rhs.minimum_AI_) || ((this.minimum_AI_ != null) && this.minimum_AI_.equals(rhs.minimum_AI_)))) && (this.allowed_Invulnerability == rhs.allowed_Invulnerability)) && ((this.driver_Swap_Setups_ == rhs.driver_Swap_Setups_) || ((this.driver_Swap_Setups_ != null) && this.driver_Swap_Setups_.equals(rhs.driver_Swap_Setups_)))) && (this.hTTP_Server_Send_Rate == rhs.hTTP_Server_Send_Rate)) && ((this.vote_Min_Voters_ == rhs.vote_Min_Voters_) || ((this.vote_Min_Voters_ != null) && this.vote_Min_Voters_.equals(rhs.vote_Min_Voters_)))) && ((this.admin_Functionality_ == rhs.admin_Functionality_) || ((this.admin_Functionality_ != null) && this.admin_Functionality_.equals(rhs.admin_Functionality_)))) && ((this.allow_Hotswaps_ == rhs.allow_Hotswaps_) || ((this.allow_Hotswaps_ != null) && this.allow_Hotswaps_.equals(rhs.allow_Hotswaps_)))) && (this.delay_Between_Sessions == rhs.delay_Between_Sessions)) && ((this.hTTP_Server_Document_Root == rhs.hTTP_Server_Document_Root) || ((this.hTTP_Server_Document_Root != null) && this.hTTP_Server_Document_Root.equals(rhs.hTTP_Server_Document_Root)))) && ((this.admin_Password == rhs.admin_Password) || ((this.admin_Password != null) && this.admin_Password.equals(rhs.admin_Password)))) && (this.plugin_Heartbeat_Rate == rhs.plugin_Heartbeat_Rate)) && (this.must_Be_Stopped == rhs.must_Be_Stopped)) && ((this.allow_Any_Event_ == rhs.allow_Any_Event_) || ((this.allow_Any_Event_ != null) && this.allow_Any_Event_.equals(rhs.allow_Any_Event_)))) && ((this.vote_Max_Race_Restarts_ == rhs.vote_Max_Race_Restarts_) || ((this.vote_Max_Race_Restarts_ != null) && this.vote_Max_Race_Restarts_.equals(rhs.vote_Max_Race_Restarts_)))) && (this.enable_Autodownloads == rhs.enable_Autodownloads)) && (this.max_Data_Per_Client == rhs.max_Data_Per_Client)) && (this.allowed_Auto_Shift == rhs.allowed_Auto_Shift)) && ((this.allowed_Brake_Help_ == rhs.allowed_Brake_Help_) || ((this.allowed_Brake_Help_ != null) && this.allowed_Brake_Help_.equals(rhs.allowed_Brake_Help_)))) && ((this.must_Be_Stopped_ == rhs.must_Be_Stopped_) || ((this.must_Be_Stopped_ != null) && this.must_Be_Stopped_.equals(rhs.must_Be_Stopped_)))) && ((this.allowed_Invulnerability_ == rhs.allowed_Invulnerability_) || ((this.allowed_Invulnerability_ != null) && this.allowed_Invulnerability_.equals(rhs.allowed_Invulnerability_)))) && ((this.assign_Parking_ == rhs.assign_Parking_) || ((this.assign_Parking_ != null) && this.assign_Parking_.equals(rhs.assign_Parking_)))) && (this.assign_Parking == rhs.assign_Parking)) && ((this.client_Fuel_Visible_ == rhs.client_Fuel_Visible_) || ((this.client_Fuel_Visible_ != null) && this.client_Fuel_Visible_.equals(rhs.client_Fuel_Visible_)))) && ((this.default_Game_Name_ == rhs.default_Game_Name_) || ((this.default_Game_Name_ != null) && this.default_Game_Name_.equals(rhs.default_Game_Name_)))) && (this.max_MP_Players == rhs.max_MP_Players)) && ((this.hTTP_Server_Send_Rate_ == rhs.hTTP_Server_Send_Rate_) || ((this.hTTP_Server_Send_Rate_ != null) && this.hTTP_Server_Send_Rate_.equals(rhs.hTTP_Server_Send_Rate_)))) && ((this.qualifying_Time_ == rhs.qualifying_Time_) || ((this.qualifying_Time_ != null) && this.qualifying_Time_.equals(rhs.qualifying_Time_)))) && (this.allow_Spectator_Chat == rhs.allow_Spectator_Chat)) && ((this.max_Data_Per_Client_ == rhs.max_Data_Per_Client_) || ((this.max_Data_Per_Client_ != null) && this.max_Data_Per_Client_.equals(rhs.max_Data_Per_Client_)))) && (this.allow_AI_Toggle == rhs.allow_AI_Toggle)) && (this.hTTP_Server_Max_File_Size == rhs.hTTP_Server_Max_File_Size)) && (this.allowed_Antilock_Brakes == rhs.allowed_Antilock_Brakes)) && ((this.pause_At_Start_Of_First_Session_ == rhs.pause_At_Start_Of_First_Session_) || ((this.pause_At_Start_Of_First_Session_ != null) && this.pause_At_Start_Of_First_Session_.equals(rhs.pause_At_Start_Of_First_Session_)))) && (this.qualifying_Time == rhs.qualifying_Time)) && (this.admin_Functionality == rhs.admin_Functionality)) && (this.minimum_AI == rhs.minimum_AI)) && (this.driver_Swap_Setups == rhs.driver_Swap_Setups)) && (this.warmup_Time == rhs.warmup_Time)) && ((this.allowed_Antilock_Brakes_ == rhs.allowed_Antilock_Brakes_) || ((this.allowed_Antilock_Brakes_ != null) && this.allowed_Antilock_Brakes_.equals(rhs.allowed_Antilock_Brakes_)))) && ((this.collision_Fade_Thresh_ == rhs.collision_Fade_Thresh_) || ((this.collision_Fade_Thresh_ != null) && this.collision_Fade_Thresh_.equals(rhs.collision_Fade_Thresh_)))) && (this.vote_Min_Voters == rhs.vote_Min_Voters)) && ((this.race_Client_Wait_ == rhs.race_Client_Wait_) || ((this.race_Client_Wait_ != null) && this.race_Client_Wait_.equals(rhs.race_Client_Wait_)))) && (this.allowed_Stability_Control == rhs.allowed_Stability_Control)) && ((this.maximum_AI_ == rhs.maximum_AI_) || ((this.maximum_AI_ != null) && this.maximum_AI_.equals(rhs.maximum_AI_)))) && (this.test_Day == rhs.test_Day)) && ((this.server_Session_End_Timeout_ == rhs.server_Session_End_Timeout_) || ((this.server_Session_End_Timeout_ != null) && this.server_Session_End_Timeout_.equals(rhs.server_Session_End_Timeout_)))) && ((this.allowed_Stability_Control_ == rhs.allowed_Stability_Control_) || ((this.allowed_Stability_Control_ != null) && this.allowed_Stability_Control_.equals(rhs.allowed_Stability_Control_)))) && ((this.isolation_ == rhs.isolation_) || ((this.isolation_ != null) && this.isolation_.equals(rhs.isolation_)))) && (this.server_Session_End_Timeout == rhs.server_Session_End_Timeout)) && ((this.closed_Qualify_Sessions_ == rhs.closed_Qualify_Sessions_) || ((this.closed_Qualify_Sessions_ != null) && this.closed_Qualify_Sessions_.equals(rhs.closed_Qualify_Sessions_)))) && (this.closed_Race_Sessions == rhs.closed_Race_Sessions)) && (this.allow_Spectators == rhs.allow_Spectators)) && (this.loose_Content_Transfer == rhs.loose_Content_Transfer)) && (this.allow_Hotswaps == rhs.allow_Hotswaps)) && ((this.allowed_Traction_Control_ == rhs.allowed_Traction_Control_) || ((this.allowed_Traction_Control_ != null) && this.allowed_Traction_Control_.equals(rhs.allowed_Traction_Control_)))) && ((this.allowed_Auto_Lift_ == rhs.allowed_Auto_Lift_) || ((this.allowed_Auto_Lift_ != null) && this.allowed_Auto_Lift_.equals(rhs.allowed_Auto_Lift_)))) && ((this.pit_Speed_Override_ == rhs.pit_Speed_Override_) || ((this.pit_Speed_Override_ != null) && this.pit_Speed_Override_.equals(rhs.pit_Speed_Override_)))) && (this.unique_Vehicle_Check == rhs.unique_Vehicle_Check)) && ((this.practice_1_Time_ == rhs.practice_1_Time_) || ((this.practice_1_Time_ != null) && this.practice_1_Time_.equals(rhs.practice_1_Time_)))) && ((this.unthrottle_ID_ == rhs.unthrottle_ID_) || ((this.unthrottle_ID_ != null) && this.unthrottle_ID_.equals(rhs.unthrottle_ID_)))) && (this.loading_Sleep_Time == rhs.loading_Sleep_Time)) && ((this.allowed_Steering_Help_ == rhs.allowed_Steering_Help_) || ((this.allowed_Steering_Help_ != null) && this.allowed_Steering_Help_.equals(rhs.allowed_Steering_Help_))));
    }

}
