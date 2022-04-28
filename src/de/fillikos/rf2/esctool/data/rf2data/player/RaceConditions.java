package de.fillikos.rf2.esctool.data.rf2data.player;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Adjust Frozen Order",
        "Adjust Frozen Order#",
        "CHAMP BlueFlags",
        "CHAMP Disable Semi Final Logic",
        "CHAMP Flag Rules",
        "CHAMP Formation Lap",
        "CHAMP Grid Walkthrough",
        "CHAMP Num Qual Sessions",
        "CHAMP Num Race Sessions",
        "CHAMP ParcFerme",
        "CHAMP PrivatePractice",
        "CHAMP PrivateQualifying",
        "CHAMP RaceStartingTime",
        "CHAMP RaceTimeScale",
        "CHAMP Reconnaissance",
        "CHAMP Safety Car Collidable",
        "CHAMP Safety Car Thresh",
        "CHAMP TimeScaledWeather",
        "CHAMP Track Cuts Allowed",
        "CHAMP Unsportsmanlike Sensitivity",
        "CHAMP Weather",
        "CURNT BlueFlags",
        "CURNT Disable Semi Final Logic",
        "CURNT Flag Rules",
        "CURNT Formation Lap",
        "CURNT Grid Walkthrough",
        "CURNT Num Qual Sessions",
        "CURNT Num Race Sessions",
        "CURNT ParcFerme",
        "CURNT PrivatePractice",
        "CURNT PrivateQualifying",
        "CURNT RaceStartingTime",
        "CURNT RaceTimeScale",
        "CURNT Reconnaissance",
        "CURNT Safety Car Collidable",
        "CURNT Safety Car Thresh",
        "CURNT TimeScaledWeather",
        "CURNT Track Cuts Allowed",
        "CURNT Unsportsmanlike Sensitivity",
        "CURNT Weather",
        "Force Formation",
        "Force Formation#",
        "GPRIX BlueFlags",
        "GPRIX BlueFlags#",
        "GPRIX Disable Semi Final Logic",
        "GPRIX Flag Rules",
        "GPRIX Flag Rules#",
        "GPRIX Formation Lap",
        "GPRIX Formation Lap#",
        "GPRIX Grid Walkthrough",
        "GPRIX Grid Walkthrough#",
        "GPRIX Num Qual Sessions",
        "GPRIX Num Qual Sessions#",
        "GPRIX Num Race Sessions",
        "GPRIX Num Race Sessions#",
        "GPRIX ParcFerme",
        "GPRIX ParcFerme#",
        "GPRIX PrivatePractice",
        "GPRIX PrivatePractice#",
        "GPRIX PrivateQualifying",
        "GPRIX PrivateQualifying#",
        "GPRIX RaceStartingTime",
        "GPRIX RaceStartingTime#",
        "GPRIX RaceTimeScale",
        "GPRIX RaceTimeScale#",
        "GPRIX Reconnaissance",
        "GPRIX Reconnaissance#",
        "GPRIX Safety Car Collidable",
        "GPRIX Safety Car Collidable#",
        "GPRIX Safety Car Thresh",
        "GPRIX Safety Car Thresh#",
        "GPRIX TimeScaledWeather",
        "GPRIX TimeScaledWeather#",
        "GPRIX Track Cuts Allowed",
        "GPRIX Track Cuts Allowed#",
        "GPRIX Unsportsmanlike Sensitivity",
        "GPRIX Unsportsmanlike Sensitivity#",
        "GPRIX Weather",
        "GPRIX Weather#",
        "MULTI BlueFlags",
        "MULTI Disable Semi Final Logic",
        "MULTI Flag Rules",
        "MULTI Formation Lap",
        "MULTI Grid Walkthrough",
        "MULTI Num Qual Sessions",
        "MULTI Num Race Sessions",
        "MULTI ParcFerme",
        "MULTI PrivatePractice",
        "MULTI PrivateQualifying",
        "MULTI RaceStartingTime",
        "MULTI RaceTimeScale",
        "MULTI Reconnaissance",
        "MULTI Safety Car Collidable",
        "MULTI Safety Car Thresh",
        "MULTI TimeScaledWeather",
        "MULTI Track Cuts Allowed",
        "MULTI Unsportsmanlike Sensitivity",
        "MULTI Weather",
        "Practice1StartingTime",
        "Practice1StartingTime#",
        "QualifyingStartingTime",
        "QualifyingStartingTime#",
        "RPLAY BlueFlags",
        "RPLAY Disable Semi Final Logic",
        "RPLAY Flag Rules",
        "RPLAY Formation Lap",
        "RPLAY Grid Walkthrough",
        "RPLAY Num Qual Sessions",
        "RPLAY Num Race Sessions",
        "RPLAY ParcFerme",
        "RPLAY PrivatePractice",
        "RPLAY PrivateQualifying",
        "RPLAY RaceStartingTime",
        "RPLAY RaceTimeScale",
        "RPLAY Reconnaissance",
        "RPLAY Safety Car Collidable",
        "RPLAY Safety Car Thresh",
        "RPLAY TimeScaledWeather",
        "RPLAY Track Cuts Allowed",
        "RPLAY Unsportsmanlike Sensitivity",
        "RPLAY Weather",
        "Race Timer",
        "Race Timer#",
        "RealRoadTimeScalePractice",
        "RealRoadTimeScalePractice#",
        "RealRoadTimeScaleQualifying",
        "RealRoadTimeScaleQualifying#",
        "RealRoadTimeScaleRace",
        "RealRoadTimeScaleRace#",
        "Recon Pit Closed",
        "Recon Pit Closed#",
        "Recon Pit Open",
        "Recon Pit Open#",
        "Recon Timer",
        "Recon Timer#",
        "Run Practice1",
        "Run Practice2",
        "Run Practice3",
        "Run Practice4",
        "Run Warmup",
        "WarmupStartingTime",
        "WarmupStartingTime#"
})
@Generated("jsonschema2pojo")
public class RaceConditions {

    @JsonProperty("Adjust Frozen Order")
    private int adjust_Frozen_Order;
    @JsonProperty("Adjust Frozen Order#")
    private String adjust_Frozen_Order_;
    @JsonProperty("CHAMP BlueFlags")
    private int cHAMP_BlueFlags;
    @JsonProperty("CHAMP Disable Semi Final Logic")
    private boolean cHAMP_Disable_Semi_Final_Logic;
    @JsonProperty("CHAMP Flag Rules")
    private int cHAMP_Flag_Rules;
    @JsonProperty("CHAMP Formation Lap")
    private int cHAMP_Formation_Lap;
    @JsonProperty("CHAMP Grid Walkthrough")
    private int cHAMP_Grid_Walkthrough;
    @JsonProperty("CHAMP Num Qual Sessions")
    private int cHAMP_Num_Qual_Sessions;
    @JsonProperty("CHAMP Num Race Sessions")
    private int cHAMP_Num_Race_Sessions;
    @JsonProperty("CHAMP ParcFerme")
    private int cHAMP_ParcFerme;
    @JsonProperty("CHAMP PrivatePractice")
    private int cHAMP_PrivatePractice;
    @JsonProperty("CHAMP PrivateQualifying")
    private int cHAMP_PrivateQualifying;
    @JsonProperty("CHAMP RaceStartingTime")
    private int cHAMP_RaceStartingTime;
    @JsonProperty("CHAMP RaceTimeScale")
    private int cHAMP_RaceTimeScale;
    @JsonProperty("CHAMP Reconnaissance")
    private int cHAMP_Reconnaissance;
    @JsonProperty("CHAMP Safety Car Collidable")
    private boolean cHAMP_Safety_Car_Collidable;
    @JsonProperty("CHAMP Safety Car Thresh")
    private int cHAMP_Safety_Car_Thresh;
    @JsonProperty("CHAMP TimeScaledWeather")
    private boolean cHAMP_TimeScaledWeather;
    @JsonProperty("CHAMP Track Cuts Allowed")
    private int cHAMP_Track_Cuts_Allowed;
    @JsonProperty("CHAMP Unsportsmanlike Sensitivity")
    private float cHAMP_Unsportsmanlike_Sensitivity;
    @JsonProperty("CHAMP Weather")
    private int cHAMP_Weather;
    @JsonProperty("CURNT BlueFlags")
    private int cURNT_BlueFlags;
    @JsonProperty("CURNT Disable Semi Final Logic")
    private boolean cURNT_Disable_Semi_Final_Logic;
    @JsonProperty("CURNT Flag Rules")
    private int cURNT_Flag_Rules;
    @JsonProperty("CURNT Formation Lap")
    private int cURNT_Formation_Lap;
    @JsonProperty("CURNT Grid Walkthrough")
    private int cURNT_Grid_Walkthrough;
    @JsonProperty("CURNT Num Qual Sessions")
    private int cURNT_Num_Qual_Sessions;
    @JsonProperty("CURNT Num Race Sessions")
    private int cURNT_Num_Race_Sessions;
    @JsonProperty("CURNT ParcFerme")
    private int cURNT_ParcFerme;
    @JsonProperty("CURNT PrivatePractice")
    private int cURNT_PrivatePractice;
    @JsonProperty("CURNT PrivateQualifying")
    private int cURNT_PrivateQualifying;
    @JsonProperty("CURNT RaceStartingTime")
    private int cURNT_RaceStartingTime;
    @JsonProperty("CURNT RaceTimeScale")
    private int cURNT_RaceTimeScale;
    @JsonProperty("CURNT Reconnaissance")
    private int cURNT_Reconnaissance;
    @JsonProperty("CURNT Safety Car Collidable")
    private boolean cURNT_Safety_Car_Collidable;
    @JsonProperty("CURNT Safety Car Thresh")
    private int cURNT_Safety_Car_Thresh;
    @JsonProperty("CURNT TimeScaledWeather")
    private boolean cURNT_TimeScaledWeather;
    @JsonProperty("CURNT Track Cuts Allowed")
    private int cURNT_Track_Cuts_Allowed;
    @JsonProperty("CURNT Unsportsmanlike Sensitivity")
    private float cURNT_Unsportsmanlike_Sensitivity;
    @JsonProperty("CURNT Weather")
    private int cURNT_Weather;
    @JsonProperty("Force Formation")
    private int force_Formation;
    @JsonProperty("Force Formation#")
    private String force_Formation_;
    @JsonProperty("GPRIX BlueFlags")
    private int gPRIX_BlueFlags;
    @JsonProperty("GPRIX BlueFlags#")
    private String gPRIX_BlueFlags_;
    @JsonProperty("GPRIX Disable Semi Final Logic")
    private boolean gPRIX_Disable_Semi_Final_Logic;
    @JsonProperty("GPRIX Flag Rules")
    private int gPRIX_Flag_Rules;
    @JsonProperty("GPRIX Flag Rules#")
    private String gPRIX_Flag_Rules_;
    @JsonProperty("GPRIX Formation Lap")
    private int gPRIX_Formation_Lap;
    @JsonProperty("GPRIX Formation Lap#")
    private String gPRIX_Formation_Lap_;
    @JsonProperty("GPRIX Grid Walkthrough")
    private int gPRIX_Grid_Walkthrough;
    @JsonProperty("GPRIX Grid Walkthrough#")
    private String gPRIX_Grid_Walkthrough_;
    @JsonProperty("GPRIX Num Qual Sessions")
    private int gPRIX_Num_Qual_Sessions;
    @JsonProperty("GPRIX Num Qual Sessions#")
    private String gPRIX_Num_Qual_Sessions_;
    @JsonProperty("GPRIX Num Race Sessions")
    private int gPRIX_Num_Race_Sessions;
    @JsonProperty("GPRIX Num Race Sessions#")
    private String gPRIX_Num_Race_Sessions_;
    @JsonProperty("GPRIX ParcFerme")
    private int gPRIX_ParcFerme;
    @JsonProperty("GPRIX ParcFerme#")
    private String gPRIX_ParcFerme_;
    @JsonProperty("GPRIX PrivatePractice")
    private int gPRIX_PrivatePractice;
    @JsonProperty("GPRIX PrivatePractice#")
    private String gPRIX_PrivatePractice_;
    @JsonProperty("GPRIX PrivateQualifying")
    private int gPRIX_PrivateQualifying;
    @JsonProperty("GPRIX PrivateQualifying#")
    private String gPRIX_PrivateQualifying_;
    @JsonProperty("GPRIX RaceStartingTime")
    private int gPRIX_RaceStartingTime;
    @JsonProperty("GPRIX RaceStartingTime#")
    private String gPRIX_RaceStartingTime_;
    @JsonProperty("GPRIX RaceTimeScale")
    private int gPRIX_RaceTimeScale;
    @JsonProperty("GPRIX RaceTimeScale#")
    private String gPRIX_RaceTimeScale_;
    @JsonProperty("GPRIX Reconnaissance")
    private int gPRIX_Reconnaissance;
    @JsonProperty("GPRIX Reconnaissance#")
    private String gPRIX_Reconnaissance_;
    @JsonProperty("GPRIX Safety Car Collidable")
    private boolean gPRIX_Safety_Car_Collidable;
    @JsonProperty("GPRIX Safety Car Collidable#")
    private String gPRIX_Safety_Car_Collidable_;
    @JsonProperty("GPRIX Safety Car Thresh")
    private int gPRIX_Safety_Car_Thresh;
    @JsonProperty("GPRIX Safety Car Thresh#")
    private String gPRIX_Safety_Car_Thresh_;
    @JsonProperty("GPRIX TimeScaledWeather")
    private boolean gPRIX_TimeScaledWeather;
    @JsonProperty("GPRIX TimeScaledWeather#")
    private String gPRIX_TimeScaledWeather_;
    @JsonProperty("GPRIX Track Cuts Allowed")
    private int gPRIX_Track_Cuts_Allowed;
    @JsonProperty("GPRIX Track Cuts Allowed#")
    private String gPRIX_Track_Cuts_Allowed_;
    @JsonProperty("GPRIX Unsportsmanlike Sensitivity")
    private float gPRIX_Unsportsmanlike_Sensitivity;
    @JsonProperty("GPRIX Unsportsmanlike Sensitivity#")
    private String gPRIX_Unsportsmanlike_Sensitivity_;
    @JsonProperty("GPRIX Weather")
    private int gPRIX_Weather;
    @JsonProperty("GPRIX Weather#")
    private String gPRIX_Weather_;
    @JsonProperty("MULTI BlueFlags")
    private int mULTI_BlueFlags;
    @JsonProperty("MULTI Disable Semi Final Logic")
    private boolean mULTI_Disable_Semi_Final_Logic;
    @JsonProperty("MULTI Flag Rules")
    private int mULTI_Flag_Rules;
    @JsonProperty("MULTI Formation Lap")
    private int mULTI_Formation_Lap;
    @JsonProperty("MULTI Grid Walkthrough")
    private int mULTI_Grid_Walkthrough;
    @JsonProperty("MULTI Num Qual Sessions")
    private int mULTI_Num_Qual_Sessions;
    @JsonProperty("MULTI Num Race Sessions")
    private int mULTI_Num_Race_Sessions;
    @JsonProperty("MULTI ParcFerme")
    private int mULTI_ParcFerme;
    @JsonProperty("MULTI PrivatePractice")
    private int mULTI_PrivatePractice;
    @JsonProperty("MULTI PrivateQualifying")
    private int mULTI_PrivateQualifying;
    @JsonProperty("MULTI RaceStartingTime")
    private int mULTI_RaceStartingTime;
    @JsonProperty("MULTI RaceTimeScale")
    private int mULTI_RaceTimeScale;
    @JsonProperty("MULTI Reconnaissance")
    private int mULTI_Reconnaissance;
    @JsonProperty("MULTI Safety Car Collidable")
    private boolean mULTI_Safety_Car_Collidable;
    @JsonProperty("MULTI Safety Car Thresh")
    private int mULTI_Safety_Car_Thresh;
    @JsonProperty("MULTI TimeScaledWeather")
    private boolean mULTI_TimeScaledWeather;
    @JsonProperty("MULTI Track Cuts Allowed")
    private int mULTI_Track_Cuts_Allowed;
    @JsonProperty("MULTI Unsportsmanlike Sensitivity")
    private float mULTI_Unsportsmanlike_Sensitivity;
    @JsonProperty("MULTI Weather")
    private int mULTI_Weather;
    @JsonProperty("Practice1StartingTime")
    private int practice1StartingTime;
    @JsonProperty("Practice1StartingTime#")
    private String practice1StartingTime_;
    @JsonProperty("QualifyingStartingTime")
    private int qualifyingStartingTime;
    @JsonProperty("QualifyingStartingTime#")
    private String qualifyingStartingTime_;
    @JsonProperty("RPLAY BlueFlags")
    private int rPLAY_BlueFlags;
    @JsonProperty("RPLAY Disable Semi Final Logic")
    private boolean rPLAY_Disable_Semi_Final_Logic;
    @JsonProperty("RPLAY Flag Rules")
    private int rPLAY_Flag_Rules;
    @JsonProperty("RPLAY Formation Lap")
    private int rPLAY_Formation_Lap;
    @JsonProperty("RPLAY Grid Walkthrough")
    private int rPLAY_Grid_Walkthrough;
    @JsonProperty("RPLAY Num Qual Sessions")
    private int rPLAY_Num_Qual_Sessions;
    @JsonProperty("RPLAY Num Race Sessions")
    private int rPLAY_Num_Race_Sessions;
    @JsonProperty("RPLAY ParcFerme")
    private int rPLAY_ParcFerme;
    @JsonProperty("RPLAY PrivatePractice")
    private int rPLAY_PrivatePractice;
    @JsonProperty("RPLAY PrivateQualifying")
    private int rPLAY_PrivateQualifying;
    @JsonProperty("RPLAY RaceStartingTime")
    private int rPLAY_RaceStartingTime;
    @JsonProperty("RPLAY RaceTimeScale")
    private int rPLAY_RaceTimeScale;
    @JsonProperty("RPLAY Reconnaissance")
    private int rPLAY_Reconnaissance;
    @JsonProperty("RPLAY Safety Car Collidable")
    private boolean rPLAY_Safety_Car_Collidable;
    @JsonProperty("RPLAY Safety Car Thresh")
    private int rPLAY_Safety_Car_Thresh;
    @JsonProperty("RPLAY TimeScaledWeather")
    private boolean rPLAY_TimeScaledWeather;
    @JsonProperty("RPLAY Track Cuts Allowed")
    private int rPLAY_Track_Cuts_Allowed;
    @JsonProperty("RPLAY Unsportsmanlike Sensitivity")
    private float rPLAY_Unsportsmanlike_Sensitivity;
    @JsonProperty("RPLAY Weather")
    private int rPLAY_Weather;
    @JsonProperty("Race Timer")
    private int race_Timer;
    @JsonProperty("Race Timer#")
    private String race_Timer_;
    @JsonProperty("RealRoadTimeScalePractice")
    private int realRoadTimeScalePractice;
    @JsonProperty("RealRoadTimeScalePractice#")
    private String realRoadTimeScalePractice_;
    @JsonProperty("RealRoadTimeScaleQualifying")
    private int realRoadTimeScaleQualifying;
    @JsonProperty("RealRoadTimeScaleQualifying#")
    private String realRoadTimeScaleQualifying_;
    @JsonProperty("RealRoadTimeScaleRace")
    private int realRoadTimeScaleRace;
    @JsonProperty("RealRoadTimeScaleRace#")
    private String realRoadTimeScaleRace_;
    @JsonProperty("Recon Pit Closed")
    private int recon_Pit_Closed;
    @JsonProperty("Recon Pit Closed#")
    private String recon_Pit_Closed_;
    @JsonProperty("Recon Pit Open")
    private int recon_Pit_Open;
    @JsonProperty("Recon Pit Open#")
    private String recon_Pit_Open_;
    @JsonProperty("Recon Timer")
    private boolean recon_Timer;
    @JsonProperty("Recon Timer#")
    private String recon_Timer_;
    @JsonProperty("Run Practice1")
    private boolean run_Practice1;
    @JsonProperty("Run Practice2")
    private boolean run_Practice2;
    @JsonProperty("Run Practice3")
    private boolean run_Practice3;
    @JsonProperty("Run Practice4")
    private boolean run_Practice4;
    @JsonProperty("Run Warmup")
    private boolean run_Warmup;
    @JsonProperty("WarmupStartingTime")
    private int warmupStartingTime;
    @JsonProperty("WarmupStartingTime#")
    private String warmupStartingTime_;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public RaceConditions() {
    }

    /**
     * @param rPLAY_Safety_Car_Thresh
     * @param cURNT_TimeScaledWeather
     * @param cHAMP_Formation_Lap
     * @param mULTI_Reconnaissance
     * @param mULTI_Disable_Semi_Final_Logic
     * @param rPLAY_Track_Cuts_Allowed
     * @param cURNT_Track_Cuts_Allowed
     * @param cURNT_RaceTimeScale
     * @param gPRIX_RaceTimeScale_
     * @param force_Formation_
     * @param cURNT_BlueFlags
     * @param gPRIX_Disable_Semi_Final_Logic
     * @param practice1StartingTime
     * @param adjust_Frozen_Order
     * @param gPRIX_PrivatePractice_
     * @param adjust_Frozen_Order_
     * @param recon_Pit_Open
     * @param run_Warmup
     * @param cURNT_Flag_Rules
     * @param gPRIX_BlueFlags
     * @param practice1StartingTime_
     * @param gPRIX_Flag_Rules_
     * @param cURNT_Num_Qual_Sessions
     * @param gPRIX_Track_Cuts_Allowed_
     * @param mULTI_RaceStartingTime
     * @param cURNT_Formation_Lap
     * @param cURNT_Safety_Car_Thresh
     * @param gPRIX_Unsportsmanlike_Sensitivity_
     * @param realRoadTimeScaleRace_
     * @param cHAMP_RaceStartingTime
     * @param cHAMP_Weather
     * @param mULTI_Num_Race_Sessions
     * @param mULTI_Weather
     * @param rPLAY_Num_Qual_Sessions
     * @param cURNT_PrivatePractice
     * @param mULTI_Flag_Rules
     * @param gPRIX_Num_Race_Sessions
     * @param gPRIX_Flag_Rules
     * @param realRoadTimeScaleQualifying
     * @param gPRIX_Reconnaissance_
     * @param cHAMP_PrivatePractice
     * @param rPLAY_Unsportsmanlike_Sensitivity
     * @param recon_Timer_
     * @param qualifyingStartingTime_
     * @param rPLAY_Num_Race_Sessions
     * @param race_Timer
     * @param cURNT_Grid_Walkthrough
     * @param cHAMP_ParcFerme
     * @param rPLAY_PrivatePractice
     * @param cHAMP_TimeScaledWeather
     * @param mULTI_Safety_Car_Collidable
     * @param rPLAY_Safety_Car_Collidable
     * @param mULTI_BlueFlags
     * @param realRoadTimeScalePractice_
     * @param gPRIX_Safety_Car_Thresh_
     * @param mULTI_PrivatePractice
     * @param cHAMP_Reconnaissance
     * @param mULTI_Formation_Lap
     * @param qualifyingStartingTime
     * @param gPRIX_PrivateQualifying
     * @param gPRIX_TimeScaledWeather
     * @param cHAMP_Num_Qual_Sessions
     * @param gPRIX_Grid_Walkthrough
     * @param warmupStartingTime_
     * @param gPRIX_BlueFlags_
     * @param cHAMP_PrivateQualifying
     * @param mULTI_Safety_Car_Thresh
     * @param rPLAY_RaceStartingTime
     * @param rPLAY_Formation_Lap
     * @param cURNT_Safety_Car_Collidable
     * @param gPRIX_Reconnaissance
     * @param gPRIX_PrivateQualifying_
     * @param rPLAY_Reconnaissance
     * @param rPLAY_PrivateQualifying
     * @param gPRIX_Weather
     * @param gPRIX_Formation_Lap
     * @param gPRIX_Grid_Walkthrough_
     * @param realRoadTimeScaleRace
     * @param cURNT_ParcFerme
     * @param recon_Pit_Open_
     * @param gPRIX_RaceStartingTime
     * @param gPRIX_Num_Qual_Sessions
     * @param recon_Timer
     * @param gPRIX_Track_Cuts_Allowed
     * @param rPLAY_RaceTimeScale
     * @param gPRIX_TimeScaledWeather_
     * @param gPRIX_Formation_Lap_
     * @param cHAMP_Flag_Rules
     * @param gPRIX_Safety_Car_Collidable_
     * @param rPLAY_Flag_Rules
     * @param gPRIX_Num_Qual_Sessions_
     * @param gPRIX_RaceTimeScale
     * @param rPLAY_Grid_Walkthrough
     * @param cHAMP_Track_Cuts_Allowed
     * @param gPRIX_RaceStartingTime_
     * @param gPRIX_Safety_Car_Collidable
     * @param cHAMP_Unsportsmanlike_Sensitivity
     * @param race_Timer_
     * @param cURNT_PrivateQualifying
     * @param force_Formation
     * @param gPRIX_Weather_
     * @param gPRIX_Unsportsmanlike_Sensitivity
     * @param cHAMP_Num_Race_Sessions
     * @param mULTI_Unsportsmanlike_Sensitivity
     * @param mULTI_Num_Qual_Sessions
     * @param cHAMP_BlueFlags
     * @param cHAMP_Safety_Car_Collidable
     * @param recon_Pit_Closed_
     * @param cURNT_Disable_Semi_Final_Logic
     * @param cHAMP_Disable_Semi_Final_Logic
     * @param rPLAY_ParcFerme
     * @param mULTI_RaceTimeScale
     * @param gPRIX_PrivatePractice
     * @param cURNT_Reconnaissance
     * @param rPLAY_Disable_Semi_Final_Logic
     * @param cURNT_RaceStartingTime
     * @param realRoadTimeScaleQualifying_
     * @param cHAMP_Grid_Walkthrough
     * @param cURNT_Unsportsmanlike_Sensitivity
     * @param rPLAY_TimeScaledWeather
     * @param rPLAY_Weather
     * @param rPLAY_BlueFlags
     * @param cHAMP_RaceTimeScale
     * @param recon_Pit_Closed
     * @param gPRIX_ParcFerme
     * @param cURNT_Weather
     * @param warmupStartingTime
     * @param gPRIX_Num_Race_Sessions_
     * @param mULTI_TimeScaledWeather
     * @param mULTI_ParcFerme
     * @param mULTI_Track_Cuts_Allowed
     * @param mULTI_PrivateQualifying
     * @param mULTI_Grid_Walkthrough
     * @param realRoadTimeScalePractice
     * @param cHAMP_Safety_Car_Thresh
     * @param gPRIX_Safety_Car_Thresh
     * @param run_Practice1
     * @param run_Practice2
     * @param run_Practice3
     * @param gPRIX_ParcFerme_
     * @param run_Practice4
     * @param cURNT_Num_Race_Sessions
     */
    public RaceConditions(int adjust_Frozen_Order, String adjust_Frozen_Order_, int cHAMP_BlueFlags, boolean cHAMP_Disable_Semi_Final_Logic, int cHAMP_Flag_Rules, int cHAMP_Formation_Lap, int cHAMP_Grid_Walkthrough, int cHAMP_Num_Qual_Sessions, int cHAMP_Num_Race_Sessions, int cHAMP_ParcFerme, int cHAMP_PrivatePractice, int cHAMP_PrivateQualifying, int cHAMP_RaceStartingTime, int cHAMP_RaceTimeScale, int cHAMP_Reconnaissance, boolean cHAMP_Safety_Car_Collidable, int cHAMP_Safety_Car_Thresh, boolean cHAMP_TimeScaledWeather, int cHAMP_Track_Cuts_Allowed, float cHAMP_Unsportsmanlike_Sensitivity, int cHAMP_Weather, int cURNT_BlueFlags, boolean cURNT_Disable_Semi_Final_Logic, int cURNT_Flag_Rules, int cURNT_Formation_Lap, int cURNT_Grid_Walkthrough, int cURNT_Num_Qual_Sessions, int cURNT_Num_Race_Sessions, int cURNT_ParcFerme, int cURNT_PrivatePractice, int cURNT_PrivateQualifying, int cURNT_RaceStartingTime, int cURNT_RaceTimeScale, int cURNT_Reconnaissance, boolean cURNT_Safety_Car_Collidable, int cURNT_Safety_Car_Thresh, boolean cURNT_TimeScaledWeather, int cURNT_Track_Cuts_Allowed, float cURNT_Unsportsmanlike_Sensitivity, int cURNT_Weather, int force_Formation, String force_Formation_, int gPRIX_BlueFlags, String gPRIX_BlueFlags_, boolean gPRIX_Disable_Semi_Final_Logic, int gPRIX_Flag_Rules, String gPRIX_Flag_Rules_, int gPRIX_Formation_Lap, String gPRIX_Formation_Lap_, int gPRIX_Grid_Walkthrough, String gPRIX_Grid_Walkthrough_, int gPRIX_Num_Qual_Sessions, String gPRIX_Num_Qual_Sessions_, int gPRIX_Num_Race_Sessions, String gPRIX_Num_Race_Sessions_, int gPRIX_ParcFerme, String gPRIX_ParcFerme_, int gPRIX_PrivatePractice, String gPRIX_PrivatePractice_, int gPRIX_PrivateQualifying, String gPRIX_PrivateQualifying_, int gPRIX_RaceStartingTime, String gPRIX_RaceStartingTime_, int gPRIX_RaceTimeScale, String gPRIX_RaceTimeScale_, int gPRIX_Reconnaissance, String gPRIX_Reconnaissance_, boolean gPRIX_Safety_Car_Collidable, String gPRIX_Safety_Car_Collidable_, int gPRIX_Safety_Car_Thresh, String gPRIX_Safety_Car_Thresh_, boolean gPRIX_TimeScaledWeather, String gPRIX_TimeScaledWeather_, int gPRIX_Track_Cuts_Allowed, String gPRIX_Track_Cuts_Allowed_, float gPRIX_Unsportsmanlike_Sensitivity, String gPRIX_Unsportsmanlike_Sensitivity_, int gPRIX_Weather, String gPRIX_Weather_, int mULTI_BlueFlags, boolean mULTI_Disable_Semi_Final_Logic, int mULTI_Flag_Rules, int mULTI_Formation_Lap, int mULTI_Grid_Walkthrough, int mULTI_Num_Qual_Sessions, int mULTI_Num_Race_Sessions, int mULTI_ParcFerme, int mULTI_PrivatePractice, int mULTI_PrivateQualifying, int mULTI_RaceStartingTime, int mULTI_RaceTimeScale, int mULTI_Reconnaissance, boolean mULTI_Safety_Car_Collidable, int mULTI_Safety_Car_Thresh, boolean mULTI_TimeScaledWeather, int mULTI_Track_Cuts_Allowed, float mULTI_Unsportsmanlike_Sensitivity, int mULTI_Weather, int practice1StartingTime, String practice1StartingTime_, int qualifyingStartingTime, String qualifyingStartingTime_, int rPLAY_BlueFlags, boolean rPLAY_Disable_Semi_Final_Logic, int rPLAY_Flag_Rules, int rPLAY_Formation_Lap, int rPLAY_Grid_Walkthrough, int rPLAY_Num_Qual_Sessions, int rPLAY_Num_Race_Sessions, int rPLAY_ParcFerme, int rPLAY_PrivatePractice, int rPLAY_PrivateQualifying, int rPLAY_RaceStartingTime, int rPLAY_RaceTimeScale, int rPLAY_Reconnaissance, boolean rPLAY_Safety_Car_Collidable, int rPLAY_Safety_Car_Thresh, boolean rPLAY_TimeScaledWeather, int rPLAY_Track_Cuts_Allowed, float rPLAY_Unsportsmanlike_Sensitivity, int rPLAY_Weather, int race_Timer, String race_Timer_, int realRoadTimeScalePractice, String realRoadTimeScalePractice_, int realRoadTimeScaleQualifying, String realRoadTimeScaleQualifying_, int realRoadTimeScaleRace, String realRoadTimeScaleRace_, int recon_Pit_Closed, String recon_Pit_Closed_, int recon_Pit_Open, String recon_Pit_Open_, boolean recon_Timer, String recon_Timer_, boolean run_Practice1, boolean run_Practice2, boolean run_Practice3, boolean run_Practice4, boolean run_Warmup, int warmupStartingTime, String warmupStartingTime_) {
        super();
        this.adjust_Frozen_Order = adjust_Frozen_Order;
        this.adjust_Frozen_Order_ = adjust_Frozen_Order_;
        this.cHAMP_BlueFlags = cHAMP_BlueFlags;
        this.cHAMP_Disable_Semi_Final_Logic = cHAMP_Disable_Semi_Final_Logic;
        this.cHAMP_Flag_Rules = cHAMP_Flag_Rules;
        this.cHAMP_Formation_Lap = cHAMP_Formation_Lap;
        this.cHAMP_Grid_Walkthrough = cHAMP_Grid_Walkthrough;
        this.cHAMP_Num_Qual_Sessions = cHAMP_Num_Qual_Sessions;
        this.cHAMP_Num_Race_Sessions = cHAMP_Num_Race_Sessions;
        this.cHAMP_ParcFerme = cHAMP_ParcFerme;
        this.cHAMP_PrivatePractice = cHAMP_PrivatePractice;
        this.cHAMP_PrivateQualifying = cHAMP_PrivateQualifying;
        this.cHAMP_RaceStartingTime = cHAMP_RaceStartingTime;
        this.cHAMP_RaceTimeScale = cHAMP_RaceTimeScale;
        this.cHAMP_Reconnaissance = cHAMP_Reconnaissance;
        this.cHAMP_Safety_Car_Collidable = cHAMP_Safety_Car_Collidable;
        this.cHAMP_Safety_Car_Thresh = cHAMP_Safety_Car_Thresh;
        this.cHAMP_TimeScaledWeather = cHAMP_TimeScaledWeather;
        this.cHAMP_Track_Cuts_Allowed = cHAMP_Track_Cuts_Allowed;
        this.cHAMP_Unsportsmanlike_Sensitivity = cHAMP_Unsportsmanlike_Sensitivity;
        this.cHAMP_Weather = cHAMP_Weather;
        this.cURNT_BlueFlags = cURNT_BlueFlags;
        this.cURNT_Disable_Semi_Final_Logic = cURNT_Disable_Semi_Final_Logic;
        this.cURNT_Flag_Rules = cURNT_Flag_Rules;
        this.cURNT_Formation_Lap = cURNT_Formation_Lap;
        this.cURNT_Grid_Walkthrough = cURNT_Grid_Walkthrough;
        this.cURNT_Num_Qual_Sessions = cURNT_Num_Qual_Sessions;
        this.cURNT_Num_Race_Sessions = cURNT_Num_Race_Sessions;
        this.cURNT_ParcFerme = cURNT_ParcFerme;
        this.cURNT_PrivatePractice = cURNT_PrivatePractice;
        this.cURNT_PrivateQualifying = cURNT_PrivateQualifying;
        this.cURNT_RaceStartingTime = cURNT_RaceStartingTime;
        this.cURNT_RaceTimeScale = cURNT_RaceTimeScale;
        this.cURNT_Reconnaissance = cURNT_Reconnaissance;
        this.cURNT_Safety_Car_Collidable = cURNT_Safety_Car_Collidable;
        this.cURNT_Safety_Car_Thresh = cURNT_Safety_Car_Thresh;
        this.cURNT_TimeScaledWeather = cURNT_TimeScaledWeather;
        this.cURNT_Track_Cuts_Allowed = cURNT_Track_Cuts_Allowed;
        this.cURNT_Unsportsmanlike_Sensitivity = cURNT_Unsportsmanlike_Sensitivity;
        this.cURNT_Weather = cURNT_Weather;
        this.force_Formation = force_Formation;
        this.force_Formation_ = force_Formation_;
        this.gPRIX_BlueFlags = gPRIX_BlueFlags;
        this.gPRIX_BlueFlags_ = gPRIX_BlueFlags_;
        this.gPRIX_Disable_Semi_Final_Logic = gPRIX_Disable_Semi_Final_Logic;
        this.gPRIX_Flag_Rules = gPRIX_Flag_Rules;
        this.gPRIX_Flag_Rules_ = gPRIX_Flag_Rules_;
        this.gPRIX_Formation_Lap = gPRIX_Formation_Lap;
        this.gPRIX_Formation_Lap_ = gPRIX_Formation_Lap_;
        this.gPRIX_Grid_Walkthrough = gPRIX_Grid_Walkthrough;
        this.gPRIX_Grid_Walkthrough_ = gPRIX_Grid_Walkthrough_;
        this.gPRIX_Num_Qual_Sessions = gPRIX_Num_Qual_Sessions;
        this.gPRIX_Num_Qual_Sessions_ = gPRIX_Num_Qual_Sessions_;
        this.gPRIX_Num_Race_Sessions = gPRIX_Num_Race_Sessions;
        this.gPRIX_Num_Race_Sessions_ = gPRIX_Num_Race_Sessions_;
        this.gPRIX_ParcFerme = gPRIX_ParcFerme;
        this.gPRIX_ParcFerme_ = gPRIX_ParcFerme_;
        this.gPRIX_PrivatePractice = gPRIX_PrivatePractice;
        this.gPRIX_PrivatePractice_ = gPRIX_PrivatePractice_;
        this.gPRIX_PrivateQualifying = gPRIX_PrivateQualifying;
        this.gPRIX_PrivateQualifying_ = gPRIX_PrivateQualifying_;
        this.gPRIX_RaceStartingTime = gPRIX_RaceStartingTime;
        this.gPRIX_RaceStartingTime_ = gPRIX_RaceStartingTime_;
        this.gPRIX_RaceTimeScale = gPRIX_RaceTimeScale;
        this.gPRIX_RaceTimeScale_ = gPRIX_RaceTimeScale_;
        this.gPRIX_Reconnaissance = gPRIX_Reconnaissance;
        this.gPRIX_Reconnaissance_ = gPRIX_Reconnaissance_;
        this.gPRIX_Safety_Car_Collidable = gPRIX_Safety_Car_Collidable;
        this.gPRIX_Safety_Car_Collidable_ = gPRIX_Safety_Car_Collidable_;
        this.gPRIX_Safety_Car_Thresh = gPRIX_Safety_Car_Thresh;
        this.gPRIX_Safety_Car_Thresh_ = gPRIX_Safety_Car_Thresh_;
        this.gPRIX_TimeScaledWeather = gPRIX_TimeScaledWeather;
        this.gPRIX_TimeScaledWeather_ = gPRIX_TimeScaledWeather_;
        this.gPRIX_Track_Cuts_Allowed = gPRIX_Track_Cuts_Allowed;
        this.gPRIX_Track_Cuts_Allowed_ = gPRIX_Track_Cuts_Allowed_;
        this.gPRIX_Unsportsmanlike_Sensitivity = gPRIX_Unsportsmanlike_Sensitivity;
        this.gPRIX_Unsportsmanlike_Sensitivity_ = gPRIX_Unsportsmanlike_Sensitivity_;
        this.gPRIX_Weather = gPRIX_Weather;
        this.gPRIX_Weather_ = gPRIX_Weather_;
        this.mULTI_BlueFlags = mULTI_BlueFlags;
        this.mULTI_Disable_Semi_Final_Logic = mULTI_Disable_Semi_Final_Logic;
        this.mULTI_Flag_Rules = mULTI_Flag_Rules;
        this.mULTI_Formation_Lap = mULTI_Formation_Lap;
        this.mULTI_Grid_Walkthrough = mULTI_Grid_Walkthrough;
        this.mULTI_Num_Qual_Sessions = mULTI_Num_Qual_Sessions;
        this.mULTI_Num_Race_Sessions = mULTI_Num_Race_Sessions;
        this.mULTI_ParcFerme = mULTI_ParcFerme;
        this.mULTI_PrivatePractice = mULTI_PrivatePractice;
        this.mULTI_PrivateQualifying = mULTI_PrivateQualifying;
        this.mULTI_RaceStartingTime = mULTI_RaceStartingTime;
        this.mULTI_RaceTimeScale = mULTI_RaceTimeScale;
        this.mULTI_Reconnaissance = mULTI_Reconnaissance;
        this.mULTI_Safety_Car_Collidable = mULTI_Safety_Car_Collidable;
        this.mULTI_Safety_Car_Thresh = mULTI_Safety_Car_Thresh;
        this.mULTI_TimeScaledWeather = mULTI_TimeScaledWeather;
        this.mULTI_Track_Cuts_Allowed = mULTI_Track_Cuts_Allowed;
        this.mULTI_Unsportsmanlike_Sensitivity = mULTI_Unsportsmanlike_Sensitivity;
        this.mULTI_Weather = mULTI_Weather;
        this.practice1StartingTime = practice1StartingTime;
        this.practice1StartingTime_ = practice1StartingTime_;
        this.qualifyingStartingTime = qualifyingStartingTime;
        this.qualifyingStartingTime_ = qualifyingStartingTime_;
        this.rPLAY_BlueFlags = rPLAY_BlueFlags;
        this.rPLAY_Disable_Semi_Final_Logic = rPLAY_Disable_Semi_Final_Logic;
        this.rPLAY_Flag_Rules = rPLAY_Flag_Rules;
        this.rPLAY_Formation_Lap = rPLAY_Formation_Lap;
        this.rPLAY_Grid_Walkthrough = rPLAY_Grid_Walkthrough;
        this.rPLAY_Num_Qual_Sessions = rPLAY_Num_Qual_Sessions;
        this.rPLAY_Num_Race_Sessions = rPLAY_Num_Race_Sessions;
        this.rPLAY_ParcFerme = rPLAY_ParcFerme;
        this.rPLAY_PrivatePractice = rPLAY_PrivatePractice;
        this.rPLAY_PrivateQualifying = rPLAY_PrivateQualifying;
        this.rPLAY_RaceStartingTime = rPLAY_RaceStartingTime;
        this.rPLAY_RaceTimeScale = rPLAY_RaceTimeScale;
        this.rPLAY_Reconnaissance = rPLAY_Reconnaissance;
        this.rPLAY_Safety_Car_Collidable = rPLAY_Safety_Car_Collidable;
        this.rPLAY_Safety_Car_Thresh = rPLAY_Safety_Car_Thresh;
        this.rPLAY_TimeScaledWeather = rPLAY_TimeScaledWeather;
        this.rPLAY_Track_Cuts_Allowed = rPLAY_Track_Cuts_Allowed;
        this.rPLAY_Unsportsmanlike_Sensitivity = rPLAY_Unsportsmanlike_Sensitivity;
        this.rPLAY_Weather = rPLAY_Weather;
        this.race_Timer = race_Timer;
        this.race_Timer_ = race_Timer_;
        this.realRoadTimeScalePractice = realRoadTimeScalePractice;
        this.realRoadTimeScalePractice_ = realRoadTimeScalePractice_;
        this.realRoadTimeScaleQualifying = realRoadTimeScaleQualifying;
        this.realRoadTimeScaleQualifying_ = realRoadTimeScaleQualifying_;
        this.realRoadTimeScaleRace = realRoadTimeScaleRace;
        this.realRoadTimeScaleRace_ = realRoadTimeScaleRace_;
        this.recon_Pit_Closed = recon_Pit_Closed;
        this.recon_Pit_Closed_ = recon_Pit_Closed_;
        this.recon_Pit_Open = recon_Pit_Open;
        this.recon_Pit_Open_ = recon_Pit_Open_;
        this.recon_Timer = recon_Timer;
        this.recon_Timer_ = recon_Timer_;
        this.run_Practice1 = run_Practice1;
        this.run_Practice2 = run_Practice2;
        this.run_Practice3 = run_Practice3;
        this.run_Practice4 = run_Practice4;
        this.run_Warmup = run_Warmup;
        this.warmupStartingTime = warmupStartingTime;
        this.warmupStartingTime_ = warmupStartingTime_;
    }

    @JsonProperty("Adjust Frozen Order")
    public int getAdjust_Frozen_Order() {
        return adjust_Frozen_Order;
    }

    @JsonProperty("Adjust Frozen Order")
    public void setAdjust_Frozen_Order(int adjust_Frozen_Order) {
        this.adjust_Frozen_Order = adjust_Frozen_Order;
    }

    @JsonProperty("Adjust Frozen Order#")
    public String getAdjust_Frozen_Order_() {
        return adjust_Frozen_Order_;
    }

    @JsonProperty("Adjust Frozen Order#")
    public void setAdjust_Frozen_Order_(String adjust_Frozen_Order_) {
        this.adjust_Frozen_Order_ = adjust_Frozen_Order_;
    }

    @JsonProperty("CHAMP BlueFlags")
    public int getCHAMP_BlueFlags() {
        return cHAMP_BlueFlags;
    }

    @JsonProperty("CHAMP BlueFlags")
    public void setCHAMP_BlueFlags(int cHAMP_BlueFlags) {
        this.cHAMP_BlueFlags = cHAMP_BlueFlags;
    }

    @JsonProperty("CHAMP Disable Semi Final Logic")
    public boolean isCHAMP_Disable_Semi_Final_Logic() {
        return cHAMP_Disable_Semi_Final_Logic;
    }

    @JsonProperty("CHAMP Disable Semi Final Logic")
    public void setCHAMP_Disable_Semi_Final_Logic(boolean cHAMP_Disable_Semi_Final_Logic) {
        this.cHAMP_Disable_Semi_Final_Logic = cHAMP_Disable_Semi_Final_Logic;
    }

    @JsonProperty("CHAMP Flag Rules")
    public int getCHAMP_Flag_Rules() {
        return cHAMP_Flag_Rules;
    }

    @JsonProperty("CHAMP Flag Rules")
    public void setCHAMP_Flag_Rules(int cHAMP_Flag_Rules) {
        this.cHAMP_Flag_Rules = cHAMP_Flag_Rules;
    }

    @JsonProperty("CHAMP Formation Lap")
    public int getCHAMP_Formation_Lap() {
        return cHAMP_Formation_Lap;
    }

    @JsonProperty("CHAMP Formation Lap")
    public void setCHAMP_Formation_Lap(int cHAMP_Formation_Lap) {
        this.cHAMP_Formation_Lap = cHAMP_Formation_Lap;
    }

    @JsonProperty("CHAMP Grid Walkthrough")
    public int getCHAMP_Grid_Walkthrough() {
        return cHAMP_Grid_Walkthrough;
    }

    @JsonProperty("CHAMP Grid Walkthrough")
    public void setCHAMP_Grid_Walkthrough(int cHAMP_Grid_Walkthrough) {
        this.cHAMP_Grid_Walkthrough = cHAMP_Grid_Walkthrough;
    }

    @JsonProperty("CHAMP Num Qual Sessions")
    public int getCHAMP_Num_Qual_Sessions() {
        return cHAMP_Num_Qual_Sessions;
    }

    @JsonProperty("CHAMP Num Qual Sessions")
    public void setCHAMP_Num_Qual_Sessions(int cHAMP_Num_Qual_Sessions) {
        this.cHAMP_Num_Qual_Sessions = cHAMP_Num_Qual_Sessions;
    }

    @JsonProperty("CHAMP Num Race Sessions")
    public int getCHAMP_Num_Race_Sessions() {
        return cHAMP_Num_Race_Sessions;
    }

    @JsonProperty("CHAMP Num Race Sessions")
    public void setCHAMP_Num_Race_Sessions(int cHAMP_Num_Race_Sessions) {
        this.cHAMP_Num_Race_Sessions = cHAMP_Num_Race_Sessions;
    }

    @JsonProperty("CHAMP ParcFerme")
    public int getCHAMP_ParcFerme() {
        return cHAMP_ParcFerme;
    }

    @JsonProperty("CHAMP ParcFerme")
    public void setCHAMP_ParcFerme(int cHAMP_ParcFerme) {
        this.cHAMP_ParcFerme = cHAMP_ParcFerme;
    }

    @JsonProperty("CHAMP PrivatePractice")
    public int getCHAMP_PrivatePractice() {
        return cHAMP_PrivatePractice;
    }

    @JsonProperty("CHAMP PrivatePractice")
    public void setCHAMP_PrivatePractice(int cHAMP_PrivatePractice) {
        this.cHAMP_PrivatePractice = cHAMP_PrivatePractice;
    }

    @JsonProperty("CHAMP PrivateQualifying")
    public int getCHAMP_PrivateQualifying() {
        return cHAMP_PrivateQualifying;
    }

    @JsonProperty("CHAMP PrivateQualifying")
    public void setCHAMP_PrivateQualifying(int cHAMP_PrivateQualifying) {
        this.cHAMP_PrivateQualifying = cHAMP_PrivateQualifying;
    }

    @JsonProperty("CHAMP RaceStartingTime")
    public int getCHAMP_RaceStartingTime() {
        return cHAMP_RaceStartingTime;
    }

    @JsonProperty("CHAMP RaceStartingTime")
    public void setCHAMP_RaceStartingTime(int cHAMP_RaceStartingTime) {
        this.cHAMP_RaceStartingTime = cHAMP_RaceStartingTime;
    }

    @JsonProperty("CHAMP RaceTimeScale")
    public int getCHAMP_RaceTimeScale() {
        return cHAMP_RaceTimeScale;
    }

    @JsonProperty("CHAMP RaceTimeScale")
    public void setCHAMP_RaceTimeScale(int cHAMP_RaceTimeScale) {
        this.cHAMP_RaceTimeScale = cHAMP_RaceTimeScale;
    }

    @JsonProperty("CHAMP Reconnaissance")
    public int getCHAMP_Reconnaissance() {
        return cHAMP_Reconnaissance;
    }

    @JsonProperty("CHAMP Reconnaissance")
    public void setCHAMP_Reconnaissance(int cHAMP_Reconnaissance) {
        this.cHAMP_Reconnaissance = cHAMP_Reconnaissance;
    }

    @JsonProperty("CHAMP Safety Car Collidable")
    public boolean isCHAMP_Safety_Car_Collidable() {
        return cHAMP_Safety_Car_Collidable;
    }

    @JsonProperty("CHAMP Safety Car Collidable")
    public void setCHAMP_Safety_Car_Collidable(boolean cHAMP_Safety_Car_Collidable) {
        this.cHAMP_Safety_Car_Collidable = cHAMP_Safety_Car_Collidable;
    }

    @JsonProperty("CHAMP Safety Car Thresh")
    public int getCHAMP_Safety_Car_Thresh() {
        return cHAMP_Safety_Car_Thresh;
    }

    @JsonProperty("CHAMP Safety Car Thresh")
    public void setCHAMP_Safety_Car_Thresh(int cHAMP_Safety_Car_Thresh) {
        this.cHAMP_Safety_Car_Thresh = cHAMP_Safety_Car_Thresh;
    }

    @JsonProperty("CHAMP TimeScaledWeather")
    public boolean isCHAMP_TimeScaledWeather() {
        return cHAMP_TimeScaledWeather;
    }

    @JsonProperty("CHAMP TimeScaledWeather")
    public void setCHAMP_TimeScaledWeather(boolean cHAMP_TimeScaledWeather) {
        this.cHAMP_TimeScaledWeather = cHAMP_TimeScaledWeather;
    }

    @JsonProperty("CHAMP Track Cuts Allowed")
    public int getCHAMP_Track_Cuts_Allowed() {
        return cHAMP_Track_Cuts_Allowed;
    }

    @JsonProperty("CHAMP Track Cuts Allowed")
    public void setCHAMP_Track_Cuts_Allowed(int cHAMP_Track_Cuts_Allowed) {
        this.cHAMP_Track_Cuts_Allowed = cHAMP_Track_Cuts_Allowed;
    }

    @JsonProperty("CHAMP Unsportsmanlike Sensitivity")
    public float getCHAMP_Unsportsmanlike_Sensitivity() {
        return cHAMP_Unsportsmanlike_Sensitivity;
    }

    @JsonProperty("CHAMP Unsportsmanlike Sensitivity")
    public void setCHAMP_Unsportsmanlike_Sensitivity(float cHAMP_Unsportsmanlike_Sensitivity) {
        this.cHAMP_Unsportsmanlike_Sensitivity = cHAMP_Unsportsmanlike_Sensitivity;
    }

    @JsonProperty("CHAMP Weather")
    public int getCHAMP_Weather() {
        return cHAMP_Weather;
    }

    @JsonProperty("CHAMP Weather")
    public void setCHAMP_Weather(int cHAMP_Weather) {
        this.cHAMP_Weather = cHAMP_Weather;
    }

    @JsonProperty("CURNT BlueFlags")
    public int getCURNT_BlueFlags() {
        return cURNT_BlueFlags;
    }

    @JsonProperty("CURNT BlueFlags")
    public void setCURNT_BlueFlags(int cURNT_BlueFlags) {
        this.cURNT_BlueFlags = cURNT_BlueFlags;
    }

    @JsonProperty("CURNT Disable Semi Final Logic")
    public boolean isCURNT_Disable_Semi_Final_Logic() {
        return cURNT_Disable_Semi_Final_Logic;
    }

    @JsonProperty("CURNT Disable Semi Final Logic")
    public void setCURNT_Disable_Semi_Final_Logic(boolean cURNT_Disable_Semi_Final_Logic) {
        this.cURNT_Disable_Semi_Final_Logic = cURNT_Disable_Semi_Final_Logic;
    }

    @JsonProperty("CURNT Flag Rules")
    public int getCURNT_Flag_Rules() {
        return cURNT_Flag_Rules;
    }

    @JsonProperty("CURNT Flag Rules")
    public void setCURNT_Flag_Rules(int cURNT_Flag_Rules) {
        this.cURNT_Flag_Rules = cURNT_Flag_Rules;
    }

    @JsonProperty("CURNT Formation Lap")
    public int getCURNT_Formation_Lap() {
        return cURNT_Formation_Lap;
    }

    @JsonProperty("CURNT Formation Lap")
    public void setCURNT_Formation_Lap(int cURNT_Formation_Lap) {
        this.cURNT_Formation_Lap = cURNT_Formation_Lap;
    }

    @JsonProperty("CURNT Grid Walkthrough")
    public int getCURNT_Grid_Walkthrough() {
        return cURNT_Grid_Walkthrough;
    }

    @JsonProperty("CURNT Grid Walkthrough")
    public void setCURNT_Grid_Walkthrough(int cURNT_Grid_Walkthrough) {
        this.cURNT_Grid_Walkthrough = cURNT_Grid_Walkthrough;
    }

    @JsonProperty("CURNT Num Qual Sessions")
    public int getCURNT_Num_Qual_Sessions() {
        return cURNT_Num_Qual_Sessions;
    }

    @JsonProperty("CURNT Num Qual Sessions")
    public void setCURNT_Num_Qual_Sessions(int cURNT_Num_Qual_Sessions) {
        this.cURNT_Num_Qual_Sessions = cURNT_Num_Qual_Sessions;
    }

    @JsonProperty("CURNT Num Race Sessions")
    public int getCURNT_Num_Race_Sessions() {
        return cURNT_Num_Race_Sessions;
    }

    @JsonProperty("CURNT Num Race Sessions")
    public void setCURNT_Num_Race_Sessions(int cURNT_Num_Race_Sessions) {
        this.cURNT_Num_Race_Sessions = cURNT_Num_Race_Sessions;
    }

    @JsonProperty("CURNT ParcFerme")
    public int getCURNT_ParcFerme() {
        return cURNT_ParcFerme;
    }

    @JsonProperty("CURNT ParcFerme")
    public void setCURNT_ParcFerme(int cURNT_ParcFerme) {
        this.cURNT_ParcFerme = cURNT_ParcFerme;
    }

    @JsonProperty("CURNT PrivatePractice")
    public int getCURNT_PrivatePractice() {
        return cURNT_PrivatePractice;
    }

    @JsonProperty("CURNT PrivatePractice")
    public void setCURNT_PrivatePractice(int cURNT_PrivatePractice) {
        this.cURNT_PrivatePractice = cURNT_PrivatePractice;
    }

    @JsonProperty("CURNT PrivateQualifying")
    public int getCURNT_PrivateQualifying() {
        return cURNT_PrivateQualifying;
    }

    @JsonProperty("CURNT PrivateQualifying")
    public void setCURNT_PrivateQualifying(int cURNT_PrivateQualifying) {
        this.cURNT_PrivateQualifying = cURNT_PrivateQualifying;
    }

    @JsonProperty("CURNT RaceStartingTime")
    public int getCURNT_RaceStartingTime() {
        return cURNT_RaceStartingTime;
    }

    @JsonProperty("CURNT RaceStartingTime")
    public void setCURNT_RaceStartingTime(int cURNT_RaceStartingTime) {
        this.cURNT_RaceStartingTime = cURNT_RaceStartingTime;
    }

    @JsonProperty("CURNT RaceTimeScale")
    public int getCURNT_RaceTimeScale() {
        return cURNT_RaceTimeScale;
    }

    @JsonProperty("CURNT RaceTimeScale")
    public void setCURNT_RaceTimeScale(int cURNT_RaceTimeScale) {
        this.cURNT_RaceTimeScale = cURNT_RaceTimeScale;
    }

    @JsonProperty("CURNT Reconnaissance")
    public int getCURNT_Reconnaissance() {
        return cURNT_Reconnaissance;
    }

    @JsonProperty("CURNT Reconnaissance")
    public void setCURNT_Reconnaissance(int cURNT_Reconnaissance) {
        this.cURNT_Reconnaissance = cURNT_Reconnaissance;
    }

    @JsonProperty("CURNT Safety Car Collidable")
    public boolean isCURNT_Safety_Car_Collidable() {
        return cURNT_Safety_Car_Collidable;
    }

    @JsonProperty("CURNT Safety Car Collidable")
    public void setCURNT_Safety_Car_Collidable(boolean cURNT_Safety_Car_Collidable) {
        this.cURNT_Safety_Car_Collidable = cURNT_Safety_Car_Collidable;
    }

    @JsonProperty("CURNT Safety Car Thresh")
    public int getCURNT_Safety_Car_Thresh() {
        return cURNT_Safety_Car_Thresh;
    }

    @JsonProperty("CURNT Safety Car Thresh")
    public void setCURNT_Safety_Car_Thresh(int cURNT_Safety_Car_Thresh) {
        this.cURNT_Safety_Car_Thresh = cURNT_Safety_Car_Thresh;
    }

    @JsonProperty("CURNT TimeScaledWeather")
    public boolean isCURNT_TimeScaledWeather() {
        return cURNT_TimeScaledWeather;
    }

    @JsonProperty("CURNT TimeScaledWeather")
    public void setCURNT_TimeScaledWeather(boolean cURNT_TimeScaledWeather) {
        this.cURNT_TimeScaledWeather = cURNT_TimeScaledWeather;
    }

    @JsonProperty("CURNT Track Cuts Allowed")
    public int getCURNT_Track_Cuts_Allowed() {
        return cURNT_Track_Cuts_Allowed;
    }

    @JsonProperty("CURNT Track Cuts Allowed")
    public void setCURNT_Track_Cuts_Allowed(int cURNT_Track_Cuts_Allowed) {
        this.cURNT_Track_Cuts_Allowed = cURNT_Track_Cuts_Allowed;
    }

    @JsonProperty("CURNT Unsportsmanlike Sensitivity")
    public float getCURNT_Unsportsmanlike_Sensitivity() {
        return cURNT_Unsportsmanlike_Sensitivity;
    }

    @JsonProperty("CURNT Unsportsmanlike Sensitivity")
    public void setCURNT_Unsportsmanlike_Sensitivity(float cURNT_Unsportsmanlike_Sensitivity) {
        this.cURNT_Unsportsmanlike_Sensitivity = cURNT_Unsportsmanlike_Sensitivity;
    }

    @JsonProperty("CURNT Weather")
    public int getCURNT_Weather() {
        return cURNT_Weather;
    }

    @JsonProperty("CURNT Weather")
    public void setCURNT_Weather(int cURNT_Weather) {
        this.cURNT_Weather = cURNT_Weather;
    }

    @JsonProperty("Force Formation")
    public int getForce_Formation() {
        return force_Formation;
    }

    @JsonProperty("Force Formation")
    public void setForce_Formation(int force_Formation) {
        this.force_Formation = force_Formation;
    }

    @JsonProperty("Force Formation#")
    public String getForce_Formation_() {
        return force_Formation_;
    }

    @JsonProperty("Force Formation#")
    public void setForce_Formation_(String force_Formation_) {
        this.force_Formation_ = force_Formation_;
    }

    @JsonProperty("GPRIX BlueFlags")
    public int getGPRIX_BlueFlags() {
        return gPRIX_BlueFlags;
    }

    @JsonProperty("GPRIX BlueFlags")
    public void setGPRIX_BlueFlags(int gPRIX_BlueFlags) {
        this.gPRIX_BlueFlags = gPRIX_BlueFlags;
    }

    @JsonProperty("GPRIX BlueFlags#")
    public String getGPRIX_BlueFlags_() {
        return gPRIX_BlueFlags_;
    }

    @JsonProperty("GPRIX BlueFlags#")
    public void setGPRIX_BlueFlags_(String gPRIX_BlueFlags_) {
        this.gPRIX_BlueFlags_ = gPRIX_BlueFlags_;
    }

    @JsonProperty("GPRIX Disable Semi Final Logic")
    public boolean isGPRIX_Disable_Semi_Final_Logic() {
        return gPRIX_Disable_Semi_Final_Logic;
    }

    @JsonProperty("GPRIX Disable Semi Final Logic")
    public void setGPRIX_Disable_Semi_Final_Logic(boolean gPRIX_Disable_Semi_Final_Logic) {
        this.gPRIX_Disable_Semi_Final_Logic = gPRIX_Disable_Semi_Final_Logic;
    }

    @JsonProperty("GPRIX Flag Rules")
    public int getGPRIX_Flag_Rules() {
        return gPRIX_Flag_Rules;
    }

    @JsonProperty("GPRIX Flag Rules")
    public void setGPRIX_Flag_Rules(int gPRIX_Flag_Rules) {
        this.gPRIX_Flag_Rules = gPRIX_Flag_Rules;
    }

    @JsonProperty("GPRIX Flag Rules#")
    public String getGPRIX_Flag_Rules_() {
        return gPRIX_Flag_Rules_;
    }

    @JsonProperty("GPRIX Flag Rules#")
    public void setGPRIX_Flag_Rules_(String gPRIX_Flag_Rules_) {
        this.gPRIX_Flag_Rules_ = gPRIX_Flag_Rules_;
    }

    @JsonProperty("GPRIX Formation Lap")
    public int getGPRIX_Formation_Lap() {
        return gPRIX_Formation_Lap;
    }

    @JsonProperty("GPRIX Formation Lap")
    public void setGPRIX_Formation_Lap(int gPRIX_Formation_Lap) {
        this.gPRIX_Formation_Lap = gPRIX_Formation_Lap;
    }

    @JsonProperty("GPRIX Formation Lap#")
    public String getGPRIX_Formation_Lap_() {
        return gPRIX_Formation_Lap_;
    }

    @JsonProperty("GPRIX Formation Lap#")
    public void setGPRIX_Formation_Lap_(String gPRIX_Formation_Lap_) {
        this.gPRIX_Formation_Lap_ = gPRIX_Formation_Lap_;
    }

    @JsonProperty("GPRIX Grid Walkthrough")
    public int getGPRIX_Grid_Walkthrough() {
        return gPRIX_Grid_Walkthrough;
    }

    @JsonProperty("GPRIX Grid Walkthrough")
    public void setGPRIX_Grid_Walkthrough(int gPRIX_Grid_Walkthrough) {
        this.gPRIX_Grid_Walkthrough = gPRIX_Grid_Walkthrough;
    }

    @JsonProperty("GPRIX Grid Walkthrough#")
    public String getGPRIX_Grid_Walkthrough_() {
        return gPRIX_Grid_Walkthrough_;
    }

    @JsonProperty("GPRIX Grid Walkthrough#")
    public void setGPRIX_Grid_Walkthrough_(String gPRIX_Grid_Walkthrough_) {
        this.gPRIX_Grid_Walkthrough_ = gPRIX_Grid_Walkthrough_;
    }

    @JsonProperty("GPRIX Num Qual Sessions")
    public int getGPRIX_Num_Qual_Sessions() {
        return gPRIX_Num_Qual_Sessions;
    }

    @JsonProperty("GPRIX Num Qual Sessions")
    public void setGPRIX_Num_Qual_Sessions(int gPRIX_Num_Qual_Sessions) {
        this.gPRIX_Num_Qual_Sessions = gPRIX_Num_Qual_Sessions;
    }

    @JsonProperty("GPRIX Num Qual Sessions#")
    public String getGPRIX_Num_Qual_Sessions_() {
        return gPRIX_Num_Qual_Sessions_;
    }

    @JsonProperty("GPRIX Num Qual Sessions#")
    public void setGPRIX_Num_Qual_Sessions_(String gPRIX_Num_Qual_Sessions_) {
        this.gPRIX_Num_Qual_Sessions_ = gPRIX_Num_Qual_Sessions_;
    }

    @JsonProperty("GPRIX Num Race Sessions")
    public int getGPRIX_Num_Race_Sessions() {
        return gPRIX_Num_Race_Sessions;
    }

    @JsonProperty("GPRIX Num Race Sessions")
    public void setGPRIX_Num_Race_Sessions(int gPRIX_Num_Race_Sessions) {
        this.gPRIX_Num_Race_Sessions = gPRIX_Num_Race_Sessions;
    }

    @JsonProperty("GPRIX Num Race Sessions#")
    public String getGPRIX_Num_Race_Sessions_() {
        return gPRIX_Num_Race_Sessions_;
    }

    @JsonProperty("GPRIX Num Race Sessions#")
    public void setGPRIX_Num_Race_Sessions_(String gPRIX_Num_Race_Sessions_) {
        this.gPRIX_Num_Race_Sessions_ = gPRIX_Num_Race_Sessions_;
    }

    @JsonProperty("GPRIX ParcFerme")
    public int getGPRIX_ParcFerme() {
        return gPRIX_ParcFerme;
    }

    @JsonProperty("GPRIX ParcFerme")
    public void setGPRIX_ParcFerme(int gPRIX_ParcFerme) {
        this.gPRIX_ParcFerme = gPRIX_ParcFerme;
    }

    @JsonProperty("GPRIX ParcFerme#")
    public String getGPRIX_ParcFerme_() {
        return gPRIX_ParcFerme_;
    }

    @JsonProperty("GPRIX ParcFerme#")
    public void setGPRIX_ParcFerme_(String gPRIX_ParcFerme_) {
        this.gPRIX_ParcFerme_ = gPRIX_ParcFerme_;
    }

    @JsonProperty("GPRIX PrivatePractice")
    public int getGPRIX_PrivatePractice() {
        return gPRIX_PrivatePractice;
    }

    @JsonProperty("GPRIX PrivatePractice")
    public void setGPRIX_PrivatePractice(int gPRIX_PrivatePractice) {
        this.gPRIX_PrivatePractice = gPRIX_PrivatePractice;
    }

    @JsonProperty("GPRIX PrivatePractice#")
    public String getGPRIX_PrivatePractice_() {
        return gPRIX_PrivatePractice_;
    }

    @JsonProperty("GPRIX PrivatePractice#")
    public void setGPRIX_PrivatePractice_(String gPRIX_PrivatePractice_) {
        this.gPRIX_PrivatePractice_ = gPRIX_PrivatePractice_;
    }

    @JsonProperty("GPRIX PrivateQualifying")
    public int getGPRIX_PrivateQualifying() {
        return gPRIX_PrivateQualifying;
    }

    @JsonProperty("GPRIX PrivateQualifying")
    public void setGPRIX_PrivateQualifying(int gPRIX_PrivateQualifying) {
        this.gPRIX_PrivateQualifying = gPRIX_PrivateQualifying;
    }

    @JsonProperty("GPRIX PrivateQualifying#")
    public String getGPRIX_PrivateQualifying_() {
        return gPRIX_PrivateQualifying_;
    }

    @JsonProperty("GPRIX PrivateQualifying#")
    public void setGPRIX_PrivateQualifying_(String gPRIX_PrivateQualifying_) {
        this.gPRIX_PrivateQualifying_ = gPRIX_PrivateQualifying_;
    }

    @JsonProperty("GPRIX RaceStartingTime")
    public int getGPRIX_RaceStartingTime() {
        return gPRIX_RaceStartingTime;
    }

    @JsonProperty("GPRIX RaceStartingTime")
    public void setGPRIX_RaceStartingTime(int gPRIX_RaceStartingTime) {
        this.gPRIX_RaceStartingTime = gPRIX_RaceStartingTime;
    }

    @JsonProperty("GPRIX RaceStartingTime#")
    public String getGPRIX_RaceStartingTime_() {
        return gPRIX_RaceStartingTime_;
    }

    @JsonProperty("GPRIX RaceStartingTime#")
    public void setGPRIX_RaceStartingTime_(String gPRIX_RaceStartingTime_) {
        this.gPRIX_RaceStartingTime_ = gPRIX_RaceStartingTime_;
    }

    @JsonProperty("GPRIX RaceTimeScale")
    public int getGPRIX_RaceTimeScale() {
        return gPRIX_RaceTimeScale;
    }

    @JsonProperty("GPRIX RaceTimeScale")
    public void setGPRIX_RaceTimeScale(int gPRIX_RaceTimeScale) {
        this.gPRIX_RaceTimeScale = gPRIX_RaceTimeScale;
    }

    @JsonProperty("GPRIX RaceTimeScale#")
    public String getGPRIX_RaceTimeScale_() {
        return gPRIX_RaceTimeScale_;
    }

    @JsonProperty("GPRIX RaceTimeScale#")
    public void setGPRIX_RaceTimeScale_(String gPRIX_RaceTimeScale_) {
        this.gPRIX_RaceTimeScale_ = gPRIX_RaceTimeScale_;
    }

    @JsonProperty("GPRIX Reconnaissance")
    public int getGPRIX_Reconnaissance() {
        return gPRIX_Reconnaissance;
    }

    @JsonProperty("GPRIX Reconnaissance")
    public void setGPRIX_Reconnaissance(int gPRIX_Reconnaissance) {
        this.gPRIX_Reconnaissance = gPRIX_Reconnaissance;
    }

    @JsonProperty("GPRIX Reconnaissance#")
    public String getGPRIX_Reconnaissance_() {
        return gPRIX_Reconnaissance_;
    }

    @JsonProperty("GPRIX Reconnaissance#")
    public void setGPRIX_Reconnaissance_(String gPRIX_Reconnaissance_) {
        this.gPRIX_Reconnaissance_ = gPRIX_Reconnaissance_;
    }

    @JsonProperty("GPRIX Safety Car Collidable")
    public boolean isGPRIX_Safety_Car_Collidable() {
        return gPRIX_Safety_Car_Collidable;
    }

    @JsonProperty("GPRIX Safety Car Collidable")
    public void setGPRIX_Safety_Car_Collidable(boolean gPRIX_Safety_Car_Collidable) {
        this.gPRIX_Safety_Car_Collidable = gPRIX_Safety_Car_Collidable;
    }

    @JsonProperty("GPRIX Safety Car Collidable#")
    public String getGPRIX_Safety_Car_Collidable_() {
        return gPRIX_Safety_Car_Collidable_;
    }

    @JsonProperty("GPRIX Safety Car Collidable#")
    public void setGPRIX_Safety_Car_Collidable_(String gPRIX_Safety_Car_Collidable_) {
        this.gPRIX_Safety_Car_Collidable_ = gPRIX_Safety_Car_Collidable_;
    }

    @JsonProperty("GPRIX Safety Car Thresh")
    public int getGPRIX_Safety_Car_Thresh() {
        return gPRIX_Safety_Car_Thresh;
    }

    @JsonProperty("GPRIX Safety Car Thresh")
    public void setGPRIX_Safety_Car_Thresh(int gPRIX_Safety_Car_Thresh) {
        this.gPRIX_Safety_Car_Thresh = gPRIX_Safety_Car_Thresh;
    }

    @JsonProperty("GPRIX Safety Car Thresh#")
    public String getGPRIX_Safety_Car_Thresh_() {
        return gPRIX_Safety_Car_Thresh_;
    }

    @JsonProperty("GPRIX Safety Car Thresh#")
    public void setGPRIX_Safety_Car_Thresh_(String gPRIX_Safety_Car_Thresh_) {
        this.gPRIX_Safety_Car_Thresh_ = gPRIX_Safety_Car_Thresh_;
    }

    @JsonProperty("GPRIX TimeScaledWeather")
    public boolean isGPRIX_TimeScaledWeather() {
        return gPRIX_TimeScaledWeather;
    }

    @JsonProperty("GPRIX TimeScaledWeather")
    public void setGPRIX_TimeScaledWeather(boolean gPRIX_TimeScaledWeather) {
        this.gPRIX_TimeScaledWeather = gPRIX_TimeScaledWeather;
    }

    @JsonProperty("GPRIX TimeScaledWeather#")
    public String getGPRIX_TimeScaledWeather_() {
        return gPRIX_TimeScaledWeather_;
    }

    @JsonProperty("GPRIX TimeScaledWeather#")
    public void setGPRIX_TimeScaledWeather_(String gPRIX_TimeScaledWeather_) {
        this.gPRIX_TimeScaledWeather_ = gPRIX_TimeScaledWeather_;
    }

    @JsonProperty("GPRIX Track Cuts Allowed")
    public int getGPRIX_Track_Cuts_Allowed() {
        return gPRIX_Track_Cuts_Allowed;
    }

    @JsonProperty("GPRIX Track Cuts Allowed")
    public void setGPRIX_Track_Cuts_Allowed(int gPRIX_Track_Cuts_Allowed) {
        this.gPRIX_Track_Cuts_Allowed = gPRIX_Track_Cuts_Allowed;
    }

    @JsonProperty("GPRIX Track Cuts Allowed#")
    public String getGPRIX_Track_Cuts_Allowed_() {
        return gPRIX_Track_Cuts_Allowed_;
    }

    @JsonProperty("GPRIX Track Cuts Allowed#")
    public void setGPRIX_Track_Cuts_Allowed_(String gPRIX_Track_Cuts_Allowed_) {
        this.gPRIX_Track_Cuts_Allowed_ = gPRIX_Track_Cuts_Allowed_;
    }

    @JsonProperty("GPRIX Unsportsmanlike Sensitivity")
    public float getGPRIX_Unsportsmanlike_Sensitivity() {
        return gPRIX_Unsportsmanlike_Sensitivity;
    }

    @JsonProperty("GPRIX Unsportsmanlike Sensitivity")
    public void setGPRIX_Unsportsmanlike_Sensitivity(float gPRIX_Unsportsmanlike_Sensitivity) {
        this.gPRIX_Unsportsmanlike_Sensitivity = gPRIX_Unsportsmanlike_Sensitivity;
    }

    @JsonProperty("GPRIX Unsportsmanlike Sensitivity#")
    public String getGPRIX_Unsportsmanlike_Sensitivity_() {
        return gPRIX_Unsportsmanlike_Sensitivity_;
    }

    @JsonProperty("GPRIX Unsportsmanlike Sensitivity#")
    public void setGPRIX_Unsportsmanlike_Sensitivity_(String gPRIX_Unsportsmanlike_Sensitivity_) {
        this.gPRIX_Unsportsmanlike_Sensitivity_ = gPRIX_Unsportsmanlike_Sensitivity_;
    }

    @JsonProperty("GPRIX Weather")
    public int getGPRIX_Weather() {
        return gPRIX_Weather;
    }

    @JsonProperty("GPRIX Weather")
    public void setGPRIX_Weather(int gPRIX_Weather) {
        this.gPRIX_Weather = gPRIX_Weather;
    }

    @JsonProperty("GPRIX Weather#")
    public String getGPRIX_Weather_() {
        return gPRIX_Weather_;
    }

    @JsonProperty("GPRIX Weather#")
    public void setGPRIX_Weather_(String gPRIX_Weather_) {
        this.gPRIX_Weather_ = gPRIX_Weather_;
    }

    @JsonProperty("MULTI BlueFlags")
    public int getMULTI_BlueFlags() {
        return mULTI_BlueFlags;
    }

    @JsonProperty("MULTI BlueFlags")
    public void setMULTI_BlueFlags(int mULTI_BlueFlags) {
        this.mULTI_BlueFlags = mULTI_BlueFlags;
    }

    @JsonProperty("MULTI Disable Semi Final Logic")
    public boolean isMULTI_Disable_Semi_Final_Logic() {
        return mULTI_Disable_Semi_Final_Logic;
    }

    @JsonProperty("MULTI Disable Semi Final Logic")
    public void setMULTI_Disable_Semi_Final_Logic(boolean mULTI_Disable_Semi_Final_Logic) {
        this.mULTI_Disable_Semi_Final_Logic = mULTI_Disable_Semi_Final_Logic;
    }

    @JsonProperty("MULTI Flag Rules")
    public int getMULTI_Flag_Rules() {
        return mULTI_Flag_Rules;
    }

    @JsonProperty("MULTI Flag Rules")
    public void setMULTI_Flag_Rules(int mULTI_Flag_Rules) {
        this.mULTI_Flag_Rules = mULTI_Flag_Rules;
    }

    @JsonProperty("MULTI Formation Lap")
    public int getMULTI_Formation_Lap() {
        return mULTI_Formation_Lap;
    }

    @JsonProperty("MULTI Formation Lap")
    public void setMULTI_Formation_Lap(int mULTI_Formation_Lap) {
        this.mULTI_Formation_Lap = mULTI_Formation_Lap;
    }

    @JsonProperty("MULTI Grid Walkthrough")
    public int getMULTI_Grid_Walkthrough() {
        return mULTI_Grid_Walkthrough;
    }

    @JsonProperty("MULTI Grid Walkthrough")
    public void setMULTI_Grid_Walkthrough(int mULTI_Grid_Walkthrough) {
        this.mULTI_Grid_Walkthrough = mULTI_Grid_Walkthrough;
    }

    @JsonProperty("MULTI Num Qual Sessions")
    public int getMULTI_Num_Qual_Sessions() {
        return mULTI_Num_Qual_Sessions;
    }

    @JsonProperty("MULTI Num Qual Sessions")
    public void setMULTI_Num_Qual_Sessions(int mULTI_Num_Qual_Sessions) {
        this.mULTI_Num_Qual_Sessions = mULTI_Num_Qual_Sessions;
    }

    @JsonProperty("MULTI Num Race Sessions")
    public int getMULTI_Num_Race_Sessions() {
        return mULTI_Num_Race_Sessions;
    }

    @JsonProperty("MULTI Num Race Sessions")
    public void setMULTI_Num_Race_Sessions(int mULTI_Num_Race_Sessions) {
        this.mULTI_Num_Race_Sessions = mULTI_Num_Race_Sessions;
    }

    @JsonProperty("MULTI ParcFerme")
    public int getMULTI_ParcFerme() {
        return mULTI_ParcFerme;
    }

    @JsonProperty("MULTI ParcFerme")
    public void setMULTI_ParcFerme(int mULTI_ParcFerme) {
        this.mULTI_ParcFerme = mULTI_ParcFerme;
    }

    @JsonProperty("MULTI PrivatePractice")
    public int getMULTI_PrivatePractice() {
        return mULTI_PrivatePractice;
    }

    @JsonProperty("MULTI PrivatePractice")
    public void setMULTI_PrivatePractice(int mULTI_PrivatePractice) {
        this.mULTI_PrivatePractice = mULTI_PrivatePractice;
    }

    @JsonProperty("MULTI PrivateQualifying")
    public int getMULTI_PrivateQualifying() {
        return mULTI_PrivateQualifying;
    }

    @JsonProperty("MULTI PrivateQualifying")
    public void setMULTI_PrivateQualifying(int mULTI_PrivateQualifying) {
        this.mULTI_PrivateQualifying = mULTI_PrivateQualifying;
    }

    @JsonProperty("MULTI RaceStartingTime")
    public int getMULTI_RaceStartingTime() {
        return mULTI_RaceStartingTime;
    }

    @JsonProperty("MULTI RaceStartingTime")
    public void setMULTI_RaceStartingTime(int mULTI_RaceStartingTime) {
        this.mULTI_RaceStartingTime = mULTI_RaceStartingTime;
    }

    @JsonProperty("MULTI RaceTimeScale")
    public int getMULTI_RaceTimeScale() {
        return mULTI_RaceTimeScale;
    }

    @JsonProperty("MULTI RaceTimeScale")
    public void setMULTI_RaceTimeScale(int mULTI_RaceTimeScale) {
        this.mULTI_RaceTimeScale = mULTI_RaceTimeScale;
    }

    @JsonProperty("MULTI Reconnaissance")
    public int getMULTI_Reconnaissance() {
        return mULTI_Reconnaissance;
    }

    @JsonProperty("MULTI Reconnaissance")
    public void setMULTI_Reconnaissance(int mULTI_Reconnaissance) {
        this.mULTI_Reconnaissance = mULTI_Reconnaissance;
    }

    @JsonProperty("MULTI Safety Car Collidable")
    public boolean isMULTI_Safety_Car_Collidable() {
        return mULTI_Safety_Car_Collidable;
    }

    @JsonProperty("MULTI Safety Car Collidable")
    public void setMULTI_Safety_Car_Collidable(boolean mULTI_Safety_Car_Collidable) {
        this.mULTI_Safety_Car_Collidable = mULTI_Safety_Car_Collidable;
    }

    @JsonProperty("MULTI Safety Car Thresh")
    public int getMULTI_Safety_Car_Thresh() {
        return mULTI_Safety_Car_Thresh;
    }

    @JsonProperty("MULTI Safety Car Thresh")
    public void setMULTI_Safety_Car_Thresh(int mULTI_Safety_Car_Thresh) {
        this.mULTI_Safety_Car_Thresh = mULTI_Safety_Car_Thresh;
    }

    @JsonProperty("MULTI TimeScaledWeather")
    public boolean isMULTI_TimeScaledWeather() {
        return mULTI_TimeScaledWeather;
    }

    @JsonProperty("MULTI TimeScaledWeather")
    public void setMULTI_TimeScaledWeather(boolean mULTI_TimeScaledWeather) {
        this.mULTI_TimeScaledWeather = mULTI_TimeScaledWeather;
    }

    @JsonProperty("MULTI Track Cuts Allowed")
    public int getMULTI_Track_Cuts_Allowed() {
        return mULTI_Track_Cuts_Allowed;
    }

    @JsonProperty("MULTI Track Cuts Allowed")
    public void setMULTI_Track_Cuts_Allowed(int mULTI_Track_Cuts_Allowed) {
        this.mULTI_Track_Cuts_Allowed = mULTI_Track_Cuts_Allowed;
    }

    @JsonProperty("MULTI Unsportsmanlike Sensitivity")
    public float getMULTI_Unsportsmanlike_Sensitivity() {
        return mULTI_Unsportsmanlike_Sensitivity;
    }

    @JsonProperty("MULTI Unsportsmanlike Sensitivity")
    public void setMULTI_Unsportsmanlike_Sensitivity(float mULTI_Unsportsmanlike_Sensitivity) {
        this.mULTI_Unsportsmanlike_Sensitivity = mULTI_Unsportsmanlike_Sensitivity;
    }

    @JsonProperty("MULTI Weather")
    public int getMULTI_Weather() {
        return mULTI_Weather;
    }

    @JsonProperty("MULTI Weather")
    public void setMULTI_Weather(int mULTI_Weather) {
        this.mULTI_Weather = mULTI_Weather;
    }

    @JsonProperty("Practice1StartingTime")
    public int getPractice1StartingTime() {
        return practice1StartingTime;
    }

    @JsonProperty("Practice1StartingTime")
    public void setPractice1StartingTime(int practice1StartingTime) {
        this.practice1StartingTime = practice1StartingTime;
    }

    @JsonProperty("Practice1StartingTime#")
    public String getPractice1StartingTime_() {
        return practice1StartingTime_;
    }

    @JsonProperty("Practice1StartingTime#")
    public void setPractice1StartingTime_(String practice1StartingTime_) {
        this.practice1StartingTime_ = practice1StartingTime_;
    }

    @JsonProperty("QualifyingStartingTime")
    public int getQualifyingStartingTime() {
        return qualifyingStartingTime;
    }

    @JsonProperty("QualifyingStartingTime")
    public void setQualifyingStartingTime(int qualifyingStartingTime) {
        this.qualifyingStartingTime = qualifyingStartingTime;
    }

    @JsonProperty("QualifyingStartingTime#")
    public String getQualifyingStartingTime_() {
        return qualifyingStartingTime_;
    }

    @JsonProperty("QualifyingStartingTime#")
    public void setQualifyingStartingTime_(String qualifyingStartingTime_) {
        this.qualifyingStartingTime_ = qualifyingStartingTime_;
    }

    @JsonProperty("RPLAY BlueFlags")
    public int getRPLAY_BlueFlags() {
        return rPLAY_BlueFlags;
    }

    @JsonProperty("RPLAY BlueFlags")
    public void setRPLAY_BlueFlags(int rPLAY_BlueFlags) {
        this.rPLAY_BlueFlags = rPLAY_BlueFlags;
    }

    @JsonProperty("RPLAY Disable Semi Final Logic")
    public boolean isRPLAY_Disable_Semi_Final_Logic() {
        return rPLAY_Disable_Semi_Final_Logic;
    }

    @JsonProperty("RPLAY Disable Semi Final Logic")
    public void setRPLAY_Disable_Semi_Final_Logic(boolean rPLAY_Disable_Semi_Final_Logic) {
        this.rPLAY_Disable_Semi_Final_Logic = rPLAY_Disable_Semi_Final_Logic;
    }

    @JsonProperty("RPLAY Flag Rules")
    public int getRPLAY_Flag_Rules() {
        return rPLAY_Flag_Rules;
    }

    @JsonProperty("RPLAY Flag Rules")
    public void setRPLAY_Flag_Rules(int rPLAY_Flag_Rules) {
        this.rPLAY_Flag_Rules = rPLAY_Flag_Rules;
    }

    @JsonProperty("RPLAY Formation Lap")
    public int getRPLAY_Formation_Lap() {
        return rPLAY_Formation_Lap;
    }

    @JsonProperty("RPLAY Formation Lap")
    public void setRPLAY_Formation_Lap(int rPLAY_Formation_Lap) {
        this.rPLAY_Formation_Lap = rPLAY_Formation_Lap;
    }

    @JsonProperty("RPLAY Grid Walkthrough")
    public int getRPLAY_Grid_Walkthrough() {
        return rPLAY_Grid_Walkthrough;
    }

    @JsonProperty("RPLAY Grid Walkthrough")
    public void setRPLAY_Grid_Walkthrough(int rPLAY_Grid_Walkthrough) {
        this.rPLAY_Grid_Walkthrough = rPLAY_Grid_Walkthrough;
    }

    @JsonProperty("RPLAY Num Qual Sessions")
    public int getRPLAY_Num_Qual_Sessions() {
        return rPLAY_Num_Qual_Sessions;
    }

    @JsonProperty("RPLAY Num Qual Sessions")
    public void setRPLAY_Num_Qual_Sessions(int rPLAY_Num_Qual_Sessions) {
        this.rPLAY_Num_Qual_Sessions = rPLAY_Num_Qual_Sessions;
    }

    @JsonProperty("RPLAY Num Race Sessions")
    public int getRPLAY_Num_Race_Sessions() {
        return rPLAY_Num_Race_Sessions;
    }

    @JsonProperty("RPLAY Num Race Sessions")
    public void setRPLAY_Num_Race_Sessions(int rPLAY_Num_Race_Sessions) {
        this.rPLAY_Num_Race_Sessions = rPLAY_Num_Race_Sessions;
    }

    @JsonProperty("RPLAY ParcFerme")
    public int getRPLAY_ParcFerme() {
        return rPLAY_ParcFerme;
    }

    @JsonProperty("RPLAY ParcFerme")
    public void setRPLAY_ParcFerme(int rPLAY_ParcFerme) {
        this.rPLAY_ParcFerme = rPLAY_ParcFerme;
    }

    @JsonProperty("RPLAY PrivatePractice")
    public int getRPLAY_PrivatePractice() {
        return rPLAY_PrivatePractice;
    }

    @JsonProperty("RPLAY PrivatePractice")
    public void setRPLAY_PrivatePractice(int rPLAY_PrivatePractice) {
        this.rPLAY_PrivatePractice = rPLAY_PrivatePractice;
    }

    @JsonProperty("RPLAY PrivateQualifying")
    public int getRPLAY_PrivateQualifying() {
        return rPLAY_PrivateQualifying;
    }

    @JsonProperty("RPLAY PrivateQualifying")
    public void setRPLAY_PrivateQualifying(int rPLAY_PrivateQualifying) {
        this.rPLAY_PrivateQualifying = rPLAY_PrivateQualifying;
    }

    @JsonProperty("RPLAY RaceStartingTime")
    public int getRPLAY_RaceStartingTime() {
        return rPLAY_RaceStartingTime;
    }

    @JsonProperty("RPLAY RaceStartingTime")
    public void setRPLAY_RaceStartingTime(int rPLAY_RaceStartingTime) {
        this.rPLAY_RaceStartingTime = rPLAY_RaceStartingTime;
    }

    @JsonProperty("RPLAY RaceTimeScale")
    public int getRPLAY_RaceTimeScale() {
        return rPLAY_RaceTimeScale;
    }

    @JsonProperty("RPLAY RaceTimeScale")
    public void setRPLAY_RaceTimeScale(int rPLAY_RaceTimeScale) {
        this.rPLAY_RaceTimeScale = rPLAY_RaceTimeScale;
    }

    @JsonProperty("RPLAY Reconnaissance")
    public int getRPLAY_Reconnaissance() {
        return rPLAY_Reconnaissance;
    }

    @JsonProperty("RPLAY Reconnaissance")
    public void setRPLAY_Reconnaissance(int rPLAY_Reconnaissance) {
        this.rPLAY_Reconnaissance = rPLAY_Reconnaissance;
    }

    @JsonProperty("RPLAY Safety Car Collidable")
    public boolean isRPLAY_Safety_Car_Collidable() {
        return rPLAY_Safety_Car_Collidable;
    }

    @JsonProperty("RPLAY Safety Car Collidable")
    public void setRPLAY_Safety_Car_Collidable(boolean rPLAY_Safety_Car_Collidable) {
        this.rPLAY_Safety_Car_Collidable = rPLAY_Safety_Car_Collidable;
    }

    @JsonProperty("RPLAY Safety Car Thresh")
    public int getRPLAY_Safety_Car_Thresh() {
        return rPLAY_Safety_Car_Thresh;
    }

    @JsonProperty("RPLAY Safety Car Thresh")
    public void setRPLAY_Safety_Car_Thresh(int rPLAY_Safety_Car_Thresh) {
        this.rPLAY_Safety_Car_Thresh = rPLAY_Safety_Car_Thresh;
    }

    @JsonProperty("RPLAY TimeScaledWeather")
    public boolean isRPLAY_TimeScaledWeather() {
        return rPLAY_TimeScaledWeather;
    }

    @JsonProperty("RPLAY TimeScaledWeather")
    public void setRPLAY_TimeScaledWeather(boolean rPLAY_TimeScaledWeather) {
        this.rPLAY_TimeScaledWeather = rPLAY_TimeScaledWeather;
    }

    @JsonProperty("RPLAY Track Cuts Allowed")
    public int getRPLAY_Track_Cuts_Allowed() {
        return rPLAY_Track_Cuts_Allowed;
    }

    @JsonProperty("RPLAY Track Cuts Allowed")
    public void setRPLAY_Track_Cuts_Allowed(int rPLAY_Track_Cuts_Allowed) {
        this.rPLAY_Track_Cuts_Allowed = rPLAY_Track_Cuts_Allowed;
    }

    @JsonProperty("RPLAY Unsportsmanlike Sensitivity")
    public float getRPLAY_Unsportsmanlike_Sensitivity() {
        return rPLAY_Unsportsmanlike_Sensitivity;
    }

    @JsonProperty("RPLAY Unsportsmanlike Sensitivity")
    public void setRPLAY_Unsportsmanlike_Sensitivity(float rPLAY_Unsportsmanlike_Sensitivity) {
        this.rPLAY_Unsportsmanlike_Sensitivity = rPLAY_Unsportsmanlike_Sensitivity;
    }

    @JsonProperty("RPLAY Weather")
    public int getRPLAY_Weather() {
        return rPLAY_Weather;
    }

    @JsonProperty("RPLAY Weather")
    public void setRPLAY_Weather(int rPLAY_Weather) {
        this.rPLAY_Weather = rPLAY_Weather;
    }

    @JsonProperty("Race Timer")
    public int getRace_Timer() {
        return race_Timer;
    }

    @JsonProperty("Race Timer")
    public void setRace_Timer(int race_Timer) {
        this.race_Timer = race_Timer;
    }

    @JsonProperty("Race Timer#")
    public String getRace_Timer_() {
        return race_Timer_;
    }

    @JsonProperty("Race Timer#")
    public void setRace_Timer_(String race_Timer_) {
        this.race_Timer_ = race_Timer_;
    }

    @JsonProperty("RealRoadTimeScalePractice")
    public int getRealRoadTimeScalePractice() {
        return realRoadTimeScalePractice;
    }

    @JsonProperty("RealRoadTimeScalePractice")
    public void setRealRoadTimeScalePractice(int realRoadTimeScalePractice) {
        this.realRoadTimeScalePractice = realRoadTimeScalePractice;
    }

    @JsonProperty("RealRoadTimeScalePractice#")
    public String getRealRoadTimeScalePractice_() {
        return realRoadTimeScalePractice_;
    }

    @JsonProperty("RealRoadTimeScalePractice#")
    public void setRealRoadTimeScalePractice_(String realRoadTimeScalePractice_) {
        this.realRoadTimeScalePractice_ = realRoadTimeScalePractice_;
    }

    @JsonProperty("RealRoadTimeScaleQualifying")
    public int getRealRoadTimeScaleQualifying() {
        return realRoadTimeScaleQualifying;
    }

    @JsonProperty("RealRoadTimeScaleQualifying")
    public void setRealRoadTimeScaleQualifying(int realRoadTimeScaleQualifying) {
        this.realRoadTimeScaleQualifying = realRoadTimeScaleQualifying;
    }

    @JsonProperty("RealRoadTimeScaleQualifying#")
    public String getRealRoadTimeScaleQualifying_() {
        return realRoadTimeScaleQualifying_;
    }

    @JsonProperty("RealRoadTimeScaleQualifying#")
    public void setRealRoadTimeScaleQualifying_(String realRoadTimeScaleQualifying_) {
        this.realRoadTimeScaleQualifying_ = realRoadTimeScaleQualifying_;
    }

    @JsonProperty("RealRoadTimeScaleRace")
    public int getRealRoadTimeScaleRace() {
        return realRoadTimeScaleRace;
    }

    @JsonProperty("RealRoadTimeScaleRace")
    public void setRealRoadTimeScaleRace(int realRoadTimeScaleRace) {
        this.realRoadTimeScaleRace = realRoadTimeScaleRace;
    }

    @JsonProperty("RealRoadTimeScaleRace#")
    public String getRealRoadTimeScaleRace_() {
        return realRoadTimeScaleRace_;
    }

    @JsonProperty("RealRoadTimeScaleRace#")
    public void setRealRoadTimeScaleRace_(String realRoadTimeScaleRace_) {
        this.realRoadTimeScaleRace_ = realRoadTimeScaleRace_;
    }

    @JsonProperty("Recon Pit Closed")
    public int getRecon_Pit_Closed() {
        return recon_Pit_Closed;
    }

    @JsonProperty("Recon Pit Closed")
    public void setRecon_Pit_Closed(int recon_Pit_Closed) {
        this.recon_Pit_Closed = recon_Pit_Closed;
    }

    @JsonProperty("Recon Pit Closed#")
    public String getRecon_Pit_Closed_() {
        return recon_Pit_Closed_;
    }

    @JsonProperty("Recon Pit Closed#")
    public void setRecon_Pit_Closed_(String recon_Pit_Closed_) {
        this.recon_Pit_Closed_ = recon_Pit_Closed_;
    }

    @JsonProperty("Recon Pit Open")
    public int getRecon_Pit_Open() {
        return recon_Pit_Open;
    }

    @JsonProperty("Recon Pit Open")
    public void setRecon_Pit_Open(int recon_Pit_Open) {
        this.recon_Pit_Open = recon_Pit_Open;
    }

    @JsonProperty("Recon Pit Open#")
    public String getRecon_Pit_Open_() {
        return recon_Pit_Open_;
    }

    @JsonProperty("Recon Pit Open#")
    public void setRecon_Pit_Open_(String recon_Pit_Open_) {
        this.recon_Pit_Open_ = recon_Pit_Open_;
    }

    @JsonProperty("Recon Timer")
    public boolean isRecon_Timer() {
        return recon_Timer;
    }

    @JsonProperty("Recon Timer")
    public void setRecon_Timer(boolean recon_Timer) {
        this.recon_Timer = recon_Timer;
    }

    @JsonProperty("Recon Timer#")
    public String getRecon_Timer_() {
        return recon_Timer_;
    }

    @JsonProperty("Recon Timer#")
    public void setRecon_Timer_(String recon_Timer_) {
        this.recon_Timer_ = recon_Timer_;
    }

    @JsonProperty("Run Practice1")
    public boolean isRun_Practice1() {
        return run_Practice1;
    }

    @JsonProperty("Run Practice1")
    public void setRun_Practice1(boolean run_Practice1) {
        this.run_Practice1 = run_Practice1;
    }

    @JsonProperty("Run Practice2")
    public boolean isRun_Practice2() {
        return run_Practice2;
    }

    @JsonProperty("Run Practice2")
    public void setRun_Practice2(boolean run_Practice2) {
        this.run_Practice2 = run_Practice2;
    }

    @JsonProperty("Run Practice3")
    public boolean isRun_Practice3() {
        return run_Practice3;
    }

    @JsonProperty("Run Practice3")
    public void setRun_Practice3(boolean run_Practice3) {
        this.run_Practice3 = run_Practice3;
    }

    @JsonProperty("Run Practice4")
    public boolean isRun_Practice4() {
        return run_Practice4;
    }

    @JsonProperty("Run Practice4")
    public void setRun_Practice4(boolean run_Practice4) {
        this.run_Practice4 = run_Practice4;
    }

    @JsonProperty("Run Warmup")
    public boolean isRun_Warmup() {
        return run_Warmup;
    }

    @JsonProperty("Run Warmup")
    public void setRun_Warmup(boolean run_Warmup) {
        this.run_Warmup = run_Warmup;
    }

    @JsonProperty("WarmupStartingTime")
    public int getWarmupStartingTime() {
        return warmupStartingTime;
    }

    @JsonProperty("WarmupStartingTime")
    public void setWarmupStartingTime(int warmupStartingTime) {
        this.warmupStartingTime = warmupStartingTime;
    }

    @JsonProperty("WarmupStartingTime#")
    public String getWarmupStartingTime_() {
        return warmupStartingTime_;
    }

    @JsonProperty("WarmupStartingTime#")
    public void setWarmupStartingTime_(String warmupStartingTime_) {
        this.warmupStartingTime_ = warmupStartingTime_;
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
        sb.append(RaceConditions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adjust_Frozen_Order");
        sb.append('=');
        sb.append(this.adjust_Frozen_Order);
        sb.append(',');
        sb.append("adjust_Frozen_Order_");
        sb.append('=');
        sb.append(((this.adjust_Frozen_Order_ == null) ? "<null>" : this.adjust_Frozen_Order_));
        sb.append(',');
        sb.append("cHAMP_BlueFlags");
        sb.append('=');
        sb.append(this.cHAMP_BlueFlags);
        sb.append(',');
        sb.append("cHAMP_Disable_Semi_Final_Logic");
        sb.append('=');
        sb.append(this.cHAMP_Disable_Semi_Final_Logic);
        sb.append(',');
        sb.append("cHAMP_Flag_Rules");
        sb.append('=');
        sb.append(this.cHAMP_Flag_Rules);
        sb.append(',');
        sb.append("cHAMP_Formation_Lap");
        sb.append('=');
        sb.append(this.cHAMP_Formation_Lap);
        sb.append(',');
        sb.append("cHAMP_Grid_Walkthrough");
        sb.append('=');
        sb.append(this.cHAMP_Grid_Walkthrough);
        sb.append(',');
        sb.append("cHAMP_Num_Qual_Sessions");
        sb.append('=');
        sb.append(this.cHAMP_Num_Qual_Sessions);
        sb.append(',');
        sb.append("cHAMP_Num_Race_Sessions");
        sb.append('=');
        sb.append(this.cHAMP_Num_Race_Sessions);
        sb.append(',');
        sb.append("cHAMP_ParcFerme");
        sb.append('=');
        sb.append(this.cHAMP_ParcFerme);
        sb.append(',');
        sb.append("cHAMP_PrivatePractice");
        sb.append('=');
        sb.append(this.cHAMP_PrivatePractice);
        sb.append(',');
        sb.append("cHAMP_PrivateQualifying");
        sb.append('=');
        sb.append(this.cHAMP_PrivateQualifying);
        sb.append(',');
        sb.append("cHAMP_RaceStartingTime");
        sb.append('=');
        sb.append(this.cHAMP_RaceStartingTime);
        sb.append(',');
        sb.append("cHAMP_RaceTimeScale");
        sb.append('=');
        sb.append(this.cHAMP_RaceTimeScale);
        sb.append(',');
        sb.append("cHAMP_Reconnaissance");
        sb.append('=');
        sb.append(this.cHAMP_Reconnaissance);
        sb.append(',');
        sb.append("cHAMP_Safety_Car_Collidable");
        sb.append('=');
        sb.append(this.cHAMP_Safety_Car_Collidable);
        sb.append(',');
        sb.append("cHAMP_Safety_Car_Thresh");
        sb.append('=');
        sb.append(this.cHAMP_Safety_Car_Thresh);
        sb.append(',');
        sb.append("cHAMP_TimeScaledWeather");
        sb.append('=');
        sb.append(this.cHAMP_TimeScaledWeather);
        sb.append(',');
        sb.append("cHAMP_Track_Cuts_Allowed");
        sb.append('=');
        sb.append(this.cHAMP_Track_Cuts_Allowed);
        sb.append(',');
        sb.append("cHAMP_Unsportsmanlike_Sensitivity");
        sb.append('=');
        sb.append(this.cHAMP_Unsportsmanlike_Sensitivity);
        sb.append(',');
        sb.append("cHAMP_Weather");
        sb.append('=');
        sb.append(this.cHAMP_Weather);
        sb.append(',');
        sb.append("cURNT_BlueFlags");
        sb.append('=');
        sb.append(this.cURNT_BlueFlags);
        sb.append(',');
        sb.append("cURNT_Disable_Semi_Final_Logic");
        sb.append('=');
        sb.append(this.cURNT_Disable_Semi_Final_Logic);
        sb.append(',');
        sb.append("cURNT_Flag_Rules");
        sb.append('=');
        sb.append(this.cURNT_Flag_Rules);
        sb.append(',');
        sb.append("cURNT_Formation_Lap");
        sb.append('=');
        sb.append(this.cURNT_Formation_Lap);
        sb.append(',');
        sb.append("cURNT_Grid_Walkthrough");
        sb.append('=');
        sb.append(this.cURNT_Grid_Walkthrough);
        sb.append(',');
        sb.append("cURNT_Num_Qual_Sessions");
        sb.append('=');
        sb.append(this.cURNT_Num_Qual_Sessions);
        sb.append(',');
        sb.append("cURNT_Num_Race_Sessions");
        sb.append('=');
        sb.append(this.cURNT_Num_Race_Sessions);
        sb.append(',');
        sb.append("cURNT_ParcFerme");
        sb.append('=');
        sb.append(this.cURNT_ParcFerme);
        sb.append(',');
        sb.append("cURNT_PrivatePractice");
        sb.append('=');
        sb.append(this.cURNT_PrivatePractice);
        sb.append(',');
        sb.append("cURNT_PrivateQualifying");
        sb.append('=');
        sb.append(this.cURNT_PrivateQualifying);
        sb.append(',');
        sb.append("cURNT_RaceStartingTime");
        sb.append('=');
        sb.append(this.cURNT_RaceStartingTime);
        sb.append(',');
        sb.append("cURNT_RaceTimeScale");
        sb.append('=');
        sb.append(this.cURNT_RaceTimeScale);
        sb.append(',');
        sb.append("cURNT_Reconnaissance");
        sb.append('=');
        sb.append(this.cURNT_Reconnaissance);
        sb.append(',');
        sb.append("cURNT_Safety_Car_Collidable");
        sb.append('=');
        sb.append(this.cURNT_Safety_Car_Collidable);
        sb.append(',');
        sb.append("cURNT_Safety_Car_Thresh");
        sb.append('=');
        sb.append(this.cURNT_Safety_Car_Thresh);
        sb.append(',');
        sb.append("cURNT_TimeScaledWeather");
        sb.append('=');
        sb.append(this.cURNT_TimeScaledWeather);
        sb.append(',');
        sb.append("cURNT_Track_Cuts_Allowed");
        sb.append('=');
        sb.append(this.cURNT_Track_Cuts_Allowed);
        sb.append(',');
        sb.append("cURNT_Unsportsmanlike_Sensitivity");
        sb.append('=');
        sb.append(this.cURNT_Unsportsmanlike_Sensitivity);
        sb.append(',');
        sb.append("cURNT_Weather");
        sb.append('=');
        sb.append(this.cURNT_Weather);
        sb.append(',');
        sb.append("force_Formation");
        sb.append('=');
        sb.append(this.force_Formation);
        sb.append(',');
        sb.append("force_Formation_");
        sb.append('=');
        sb.append(((this.force_Formation_ == null) ? "<null>" : this.force_Formation_));
        sb.append(',');
        sb.append("gPRIX_BlueFlags");
        sb.append('=');
        sb.append(this.gPRIX_BlueFlags);
        sb.append(',');
        sb.append("gPRIX_BlueFlags_");
        sb.append('=');
        sb.append(((this.gPRIX_BlueFlags_ == null) ? "<null>" : this.gPRIX_BlueFlags_));
        sb.append(',');
        sb.append("gPRIX_Disable_Semi_Final_Logic");
        sb.append('=');
        sb.append(this.gPRIX_Disable_Semi_Final_Logic);
        sb.append(',');
        sb.append("gPRIX_Flag_Rules");
        sb.append('=');
        sb.append(this.gPRIX_Flag_Rules);
        sb.append(',');
        sb.append("gPRIX_Flag_Rules_");
        sb.append('=');
        sb.append(((this.gPRIX_Flag_Rules_ == null) ? "<null>" : this.gPRIX_Flag_Rules_));
        sb.append(',');
        sb.append("gPRIX_Formation_Lap");
        sb.append('=');
        sb.append(this.gPRIX_Formation_Lap);
        sb.append(',');
        sb.append("gPRIX_Formation_Lap_");
        sb.append('=');
        sb.append(((this.gPRIX_Formation_Lap_ == null) ? "<null>" : this.gPRIX_Formation_Lap_));
        sb.append(',');
        sb.append("gPRIX_Grid_Walkthrough");
        sb.append('=');
        sb.append(this.gPRIX_Grid_Walkthrough);
        sb.append(',');
        sb.append("gPRIX_Grid_Walkthrough_");
        sb.append('=');
        sb.append(((this.gPRIX_Grid_Walkthrough_ == null) ? "<null>" : this.gPRIX_Grid_Walkthrough_));
        sb.append(',');
        sb.append("gPRIX_Num_Qual_Sessions");
        sb.append('=');
        sb.append(this.gPRIX_Num_Qual_Sessions);
        sb.append(',');
        sb.append("gPRIX_Num_Qual_Sessions_");
        sb.append('=');
        sb.append(((this.gPRIX_Num_Qual_Sessions_ == null) ? "<null>" : this.gPRIX_Num_Qual_Sessions_));
        sb.append(',');
        sb.append("gPRIX_Num_Race_Sessions");
        sb.append('=');
        sb.append(this.gPRIX_Num_Race_Sessions);
        sb.append(',');
        sb.append("gPRIX_Num_Race_Sessions_");
        sb.append('=');
        sb.append(((this.gPRIX_Num_Race_Sessions_ == null) ? "<null>" : this.gPRIX_Num_Race_Sessions_));
        sb.append(',');
        sb.append("gPRIX_ParcFerme");
        sb.append('=');
        sb.append(this.gPRIX_ParcFerme);
        sb.append(',');
        sb.append("gPRIX_ParcFerme_");
        sb.append('=');
        sb.append(((this.gPRIX_ParcFerme_ == null) ? "<null>" : this.gPRIX_ParcFerme_));
        sb.append(',');
        sb.append("gPRIX_PrivatePractice");
        sb.append('=');
        sb.append(this.gPRIX_PrivatePractice);
        sb.append(',');
        sb.append("gPRIX_PrivatePractice_");
        sb.append('=');
        sb.append(((this.gPRIX_PrivatePractice_ == null) ? "<null>" : this.gPRIX_PrivatePractice_));
        sb.append(',');
        sb.append("gPRIX_PrivateQualifying");
        sb.append('=');
        sb.append(this.gPRIX_PrivateQualifying);
        sb.append(',');
        sb.append("gPRIX_PrivateQualifying_");
        sb.append('=');
        sb.append(((this.gPRIX_PrivateQualifying_ == null) ? "<null>" : this.gPRIX_PrivateQualifying_));
        sb.append(',');
        sb.append("gPRIX_RaceStartingTime");
        sb.append('=');
        sb.append(this.gPRIX_RaceStartingTime);
        sb.append(',');
        sb.append("gPRIX_RaceStartingTime_");
        sb.append('=');
        sb.append(((this.gPRIX_RaceStartingTime_ == null) ? "<null>" : this.gPRIX_RaceStartingTime_));
        sb.append(',');
        sb.append("gPRIX_RaceTimeScale");
        sb.append('=');
        sb.append(this.gPRIX_RaceTimeScale);
        sb.append(',');
        sb.append("gPRIX_RaceTimeScale_");
        sb.append('=');
        sb.append(((this.gPRIX_RaceTimeScale_ == null) ? "<null>" : this.gPRIX_RaceTimeScale_));
        sb.append(',');
        sb.append("gPRIX_Reconnaissance");
        sb.append('=');
        sb.append(this.gPRIX_Reconnaissance);
        sb.append(',');
        sb.append("gPRIX_Reconnaissance_");
        sb.append('=');
        sb.append(((this.gPRIX_Reconnaissance_ == null) ? "<null>" : this.gPRIX_Reconnaissance_));
        sb.append(',');
        sb.append("gPRIX_Safety_Car_Collidable");
        sb.append('=');
        sb.append(this.gPRIX_Safety_Car_Collidable);
        sb.append(',');
        sb.append("gPRIX_Safety_Car_Collidable_");
        sb.append('=');
        sb.append(((this.gPRIX_Safety_Car_Collidable_ == null) ? "<null>" : this.gPRIX_Safety_Car_Collidable_));
        sb.append(',');
        sb.append("gPRIX_Safety_Car_Thresh");
        sb.append('=');
        sb.append(this.gPRIX_Safety_Car_Thresh);
        sb.append(',');
        sb.append("gPRIX_Safety_Car_Thresh_");
        sb.append('=');
        sb.append(((this.gPRIX_Safety_Car_Thresh_ == null) ? "<null>" : this.gPRIX_Safety_Car_Thresh_));
        sb.append(',');
        sb.append("gPRIX_TimeScaledWeather");
        sb.append('=');
        sb.append(this.gPRIX_TimeScaledWeather);
        sb.append(',');
        sb.append("gPRIX_TimeScaledWeather_");
        sb.append('=');
        sb.append(((this.gPRIX_TimeScaledWeather_ == null) ? "<null>" : this.gPRIX_TimeScaledWeather_));
        sb.append(',');
        sb.append("gPRIX_Track_Cuts_Allowed");
        sb.append('=');
        sb.append(this.gPRIX_Track_Cuts_Allowed);
        sb.append(',');
        sb.append("gPRIX_Track_Cuts_Allowed_");
        sb.append('=');
        sb.append(((this.gPRIX_Track_Cuts_Allowed_ == null) ? "<null>" : this.gPRIX_Track_Cuts_Allowed_));
        sb.append(',');
        sb.append("gPRIX_Unsportsmanlike_Sensitivity");
        sb.append('=');
        sb.append(this.gPRIX_Unsportsmanlike_Sensitivity);
        sb.append(',');
        sb.append("gPRIX_Unsportsmanlike_Sensitivity_");
        sb.append('=');
        sb.append(((this.gPRIX_Unsportsmanlike_Sensitivity_ == null) ? "<null>" : this.gPRIX_Unsportsmanlike_Sensitivity_));
        sb.append(',');
        sb.append("gPRIX_Weather");
        sb.append('=');
        sb.append(this.gPRIX_Weather);
        sb.append(',');
        sb.append("gPRIX_Weather_");
        sb.append('=');
        sb.append(((this.gPRIX_Weather_ == null) ? "<null>" : this.gPRIX_Weather_));
        sb.append(',');
        sb.append("mULTI_BlueFlags");
        sb.append('=');
        sb.append(this.mULTI_BlueFlags);
        sb.append(',');
        sb.append("mULTI_Disable_Semi_Final_Logic");
        sb.append('=');
        sb.append(this.mULTI_Disable_Semi_Final_Logic);
        sb.append(',');
        sb.append("mULTI_Flag_Rules");
        sb.append('=');
        sb.append(this.mULTI_Flag_Rules);
        sb.append(',');
        sb.append("mULTI_Formation_Lap");
        sb.append('=');
        sb.append(this.mULTI_Formation_Lap);
        sb.append(',');
        sb.append("mULTI_Grid_Walkthrough");
        sb.append('=');
        sb.append(this.mULTI_Grid_Walkthrough);
        sb.append(',');
        sb.append("mULTI_Num_Qual_Sessions");
        sb.append('=');
        sb.append(this.mULTI_Num_Qual_Sessions);
        sb.append(',');
        sb.append("mULTI_Num_Race_Sessions");
        sb.append('=');
        sb.append(this.mULTI_Num_Race_Sessions);
        sb.append(',');
        sb.append("mULTI_ParcFerme");
        sb.append('=');
        sb.append(this.mULTI_ParcFerme);
        sb.append(',');
        sb.append("mULTI_PrivatePractice");
        sb.append('=');
        sb.append(this.mULTI_PrivatePractice);
        sb.append(',');
        sb.append("mULTI_PrivateQualifying");
        sb.append('=');
        sb.append(this.mULTI_PrivateQualifying);
        sb.append(',');
        sb.append("mULTI_RaceStartingTime");
        sb.append('=');
        sb.append(this.mULTI_RaceStartingTime);
        sb.append(',');
        sb.append("mULTI_RaceTimeScale");
        sb.append('=');
        sb.append(this.mULTI_RaceTimeScale);
        sb.append(',');
        sb.append("mULTI_Reconnaissance");
        sb.append('=');
        sb.append(this.mULTI_Reconnaissance);
        sb.append(',');
        sb.append("mULTI_Safety_Car_Collidable");
        sb.append('=');
        sb.append(this.mULTI_Safety_Car_Collidable);
        sb.append(',');
        sb.append("mULTI_Safety_Car_Thresh");
        sb.append('=');
        sb.append(this.mULTI_Safety_Car_Thresh);
        sb.append(',');
        sb.append("mULTI_TimeScaledWeather");
        sb.append('=');
        sb.append(this.mULTI_TimeScaledWeather);
        sb.append(',');
        sb.append("mULTI_Track_Cuts_Allowed");
        sb.append('=');
        sb.append(this.mULTI_Track_Cuts_Allowed);
        sb.append(',');
        sb.append("mULTI_Unsportsmanlike_Sensitivity");
        sb.append('=');
        sb.append(this.mULTI_Unsportsmanlike_Sensitivity);
        sb.append(',');
        sb.append("mULTI_Weather");
        sb.append('=');
        sb.append(this.mULTI_Weather);
        sb.append(',');
        sb.append("practice1StartingTime");
        sb.append('=');
        sb.append(this.practice1StartingTime);
        sb.append(',');
        sb.append("practice1StartingTime_");
        sb.append('=');
        sb.append(((this.practice1StartingTime_ == null) ? "<null>" : this.practice1StartingTime_));
        sb.append(',');
        sb.append("qualifyingStartingTime");
        sb.append('=');
        sb.append(this.qualifyingStartingTime);
        sb.append(',');
        sb.append("qualifyingStartingTime_");
        sb.append('=');
        sb.append(((this.qualifyingStartingTime_ == null) ? "<null>" : this.qualifyingStartingTime_));
        sb.append(',');
        sb.append("rPLAY_BlueFlags");
        sb.append('=');
        sb.append(this.rPLAY_BlueFlags);
        sb.append(',');
        sb.append("rPLAY_Disable_Semi_Final_Logic");
        sb.append('=');
        sb.append(this.rPLAY_Disable_Semi_Final_Logic);
        sb.append(',');
        sb.append("rPLAY_Flag_Rules");
        sb.append('=');
        sb.append(this.rPLAY_Flag_Rules);
        sb.append(',');
        sb.append("rPLAY_Formation_Lap");
        sb.append('=');
        sb.append(this.rPLAY_Formation_Lap);
        sb.append(',');
        sb.append("rPLAY_Grid_Walkthrough");
        sb.append('=');
        sb.append(this.rPLAY_Grid_Walkthrough);
        sb.append(',');
        sb.append("rPLAY_Num_Qual_Sessions");
        sb.append('=');
        sb.append(this.rPLAY_Num_Qual_Sessions);
        sb.append(',');
        sb.append("rPLAY_Num_Race_Sessions");
        sb.append('=');
        sb.append(this.rPLAY_Num_Race_Sessions);
        sb.append(',');
        sb.append("rPLAY_ParcFerme");
        sb.append('=');
        sb.append(this.rPLAY_ParcFerme);
        sb.append(',');
        sb.append("rPLAY_PrivatePractice");
        sb.append('=');
        sb.append(this.rPLAY_PrivatePractice);
        sb.append(',');
        sb.append("rPLAY_PrivateQualifying");
        sb.append('=');
        sb.append(this.rPLAY_PrivateQualifying);
        sb.append(',');
        sb.append("rPLAY_RaceStartingTime");
        sb.append('=');
        sb.append(this.rPLAY_RaceStartingTime);
        sb.append(',');
        sb.append("rPLAY_RaceTimeScale");
        sb.append('=');
        sb.append(this.rPLAY_RaceTimeScale);
        sb.append(',');
        sb.append("rPLAY_Reconnaissance");
        sb.append('=');
        sb.append(this.rPLAY_Reconnaissance);
        sb.append(',');
        sb.append("rPLAY_Safety_Car_Collidable");
        sb.append('=');
        sb.append(this.rPLAY_Safety_Car_Collidable);
        sb.append(',');
        sb.append("rPLAY_Safety_Car_Thresh");
        sb.append('=');
        sb.append(this.rPLAY_Safety_Car_Thresh);
        sb.append(',');
        sb.append("rPLAY_TimeScaledWeather");
        sb.append('=');
        sb.append(this.rPLAY_TimeScaledWeather);
        sb.append(',');
        sb.append("rPLAY_Track_Cuts_Allowed");
        sb.append('=');
        sb.append(this.rPLAY_Track_Cuts_Allowed);
        sb.append(',');
        sb.append("rPLAY_Unsportsmanlike_Sensitivity");
        sb.append('=');
        sb.append(this.rPLAY_Unsportsmanlike_Sensitivity);
        sb.append(',');
        sb.append("rPLAY_Weather");
        sb.append('=');
        sb.append(this.rPLAY_Weather);
        sb.append(',');
        sb.append("race_Timer");
        sb.append('=');
        sb.append(this.race_Timer);
        sb.append(',');
        sb.append("race_Timer_");
        sb.append('=');
        sb.append(((this.race_Timer_ == null) ? "<null>" : this.race_Timer_));
        sb.append(',');
        sb.append("realRoadTimeScalePractice");
        sb.append('=');
        sb.append(this.realRoadTimeScalePractice);
        sb.append(',');
        sb.append("realRoadTimeScalePractice_");
        sb.append('=');
        sb.append(((this.realRoadTimeScalePractice_ == null) ? "<null>" : this.realRoadTimeScalePractice_));
        sb.append(',');
        sb.append("realRoadTimeScaleQualifying");
        sb.append('=');
        sb.append(this.realRoadTimeScaleQualifying);
        sb.append(',');
        sb.append("realRoadTimeScaleQualifying_");
        sb.append('=');
        sb.append(((this.realRoadTimeScaleQualifying_ == null) ? "<null>" : this.realRoadTimeScaleQualifying_));
        sb.append(',');
        sb.append("realRoadTimeScaleRace");
        sb.append('=');
        sb.append(this.realRoadTimeScaleRace);
        sb.append(',');
        sb.append("realRoadTimeScaleRace_");
        sb.append('=');
        sb.append(((this.realRoadTimeScaleRace_ == null) ? "<null>" : this.realRoadTimeScaleRace_));
        sb.append(',');
        sb.append("recon_Pit_Closed");
        sb.append('=');
        sb.append(this.recon_Pit_Closed);
        sb.append(',');
        sb.append("recon_Pit_Closed_");
        sb.append('=');
        sb.append(((this.recon_Pit_Closed_ == null) ? "<null>" : this.recon_Pit_Closed_));
        sb.append(',');
        sb.append("recon_Pit_Open");
        sb.append('=');
        sb.append(this.recon_Pit_Open);
        sb.append(',');
        sb.append("recon_Pit_Open_");
        sb.append('=');
        sb.append(((this.recon_Pit_Open_ == null) ? "<null>" : this.recon_Pit_Open_));
        sb.append(',');
        sb.append("recon_Timer");
        sb.append('=');
        sb.append(this.recon_Timer);
        sb.append(',');
        sb.append("recon_Timer_");
        sb.append('=');
        sb.append(((this.recon_Timer_ == null) ? "<null>" : this.recon_Timer_));
        sb.append(',');
        sb.append("run_Practice1");
        sb.append('=');
        sb.append(this.run_Practice1);
        sb.append(',');
        sb.append("run_Practice2");
        sb.append('=');
        sb.append(this.run_Practice2);
        sb.append(',');
        sb.append("run_Practice3");
        sb.append('=');
        sb.append(this.run_Practice3);
        sb.append(',');
        sb.append("run_Practice4");
        sb.append('=');
        sb.append(this.run_Practice4);
        sb.append(',');
        sb.append("run_Warmup");
        sb.append('=');
        sb.append(this.run_Warmup);
        sb.append(',');
        sb.append("warmupStartingTime");
        sb.append('=');
        sb.append(this.warmupStartingTime);
        sb.append(',');
        sb.append("warmupStartingTime_");
        sb.append('=');
        sb.append(((this.warmupStartingTime_ == null) ? "<null>" : this.warmupStartingTime_));
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
        result = ((result * 31) + this.rPLAY_Safety_Car_Thresh);
        result = ((result * 31) + (this.cURNT_TimeScaledWeather ? 1 : 0));
        result = ((result * 31) + this.cHAMP_Formation_Lap);
        result = ((result * 31) + this.mULTI_Reconnaissance);
        result = ((result * 31) + (this.mULTI_Disable_Semi_Final_Logic ? 1 : 0));
        result = ((result * 31) + this.rPLAY_Track_Cuts_Allowed);
        result = ((result * 31) + this.cURNT_Track_Cuts_Allowed);
        result = ((result * 31) + this.cURNT_RaceTimeScale);
        result = ((result * 31) + ((this.gPRIX_RaceTimeScale_ == null) ? 0 : this.gPRIX_RaceTimeScale_.hashCode()));
        result = ((result * 31) + ((this.force_Formation_ == null) ? 0 : this.force_Formation_.hashCode()));
        result = ((result * 31) + this.cURNT_BlueFlags);
        result = ((result * 31) + (this.gPRIX_Disable_Semi_Final_Logic ? 1 : 0));
        result = ((result * 31) + this.practice1StartingTime);
        result = ((result * 31) + this.adjust_Frozen_Order);
        result = ((result * 31) + ((this.gPRIX_PrivatePractice_ == null) ? 0 : this.gPRIX_PrivatePractice_.hashCode()));
        result = ((result * 31) + ((this.adjust_Frozen_Order_ == null) ? 0 : this.adjust_Frozen_Order_.hashCode()));
        result = ((result * 31) + this.recon_Pit_Open);
        result = ((result * 31) + (this.run_Warmup ? 1 : 0));
        result = ((result * 31) + this.cURNT_Flag_Rules);
        result = ((result * 31) + this.gPRIX_BlueFlags);
        result = ((result * 31) + ((this.practice1StartingTime_ == null) ? 0 : this.practice1StartingTime_.hashCode()));
        result = ((result * 31) + ((this.gPRIX_Flag_Rules_ == null) ? 0 : this.gPRIX_Flag_Rules_.hashCode()));
        result = ((result * 31) + this.cURNT_Num_Qual_Sessions);
        result = ((result * 31) + ((this.gPRIX_Track_Cuts_Allowed_ == null) ? 0 : this.gPRIX_Track_Cuts_Allowed_.hashCode()));
        result = ((result * 31) + this.mULTI_RaceStartingTime);
        result = ((result * 31) + this.cURNT_Formation_Lap);
        result = ((result * 31) + this.cURNT_Safety_Car_Thresh);
        result = ((result * 31) + ((this.gPRIX_Unsportsmanlike_Sensitivity_ == null) ? 0 : this.gPRIX_Unsportsmanlike_Sensitivity_.hashCode()));
        result = ((result * 31) + ((this.realRoadTimeScaleRace_ == null) ? 0 : this.realRoadTimeScaleRace_.hashCode()));
        result = ((result * 31) + this.cHAMP_RaceStartingTime);
        result = ((result * 31) + this.cHAMP_Weather);
        result = ((result * 31) + this.mULTI_Num_Race_Sessions);
        result = ((result * 31) + this.mULTI_Weather);
        result = ((result * 31) + this.rPLAY_Num_Qual_Sessions);
        result = ((result * 31) + this.cURNT_PrivatePractice);
        result = ((result * 31) + this.mULTI_Flag_Rules);
        result = ((result * 31) + this.gPRIX_Num_Race_Sessions);
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + this.gPRIX_Flag_Rules);
        result = ((result * 31) + this.realRoadTimeScaleQualifying);
        result = ((result * 31) + ((this.gPRIX_Reconnaissance_ == null) ? 0 : this.gPRIX_Reconnaissance_.hashCode()));
        result = ((result * 31) + this.cHAMP_PrivatePractice);
        result = ((result * 31) + Float.floatToIntBits(this.rPLAY_Unsportsmanlike_Sensitivity));
        result = ((result * 31) + ((this.recon_Timer_ == null) ? 0 : this.recon_Timer_.hashCode()));
        result = ((result * 31) + ((this.qualifyingStartingTime_ == null) ? 0 : this.qualifyingStartingTime_.hashCode()));
        result = ((result * 31) + this.rPLAY_Num_Race_Sessions);
        result = ((result * 31) + this.race_Timer);
        result = ((result * 31) + this.cURNT_Grid_Walkthrough);
        result = ((result * 31) + this.cHAMP_ParcFerme);
        result = ((result * 31) + this.rPLAY_PrivatePractice);
        result = ((result * 31) + (this.cHAMP_TimeScaledWeather ? 1 : 0));
        result = ((result * 31) + (this.mULTI_Safety_Car_Collidable ? 1 : 0));
        result = ((result * 31) + (this.rPLAY_Safety_Car_Collidable ? 1 : 0));
        result = ((result * 31) + this.mULTI_BlueFlags);
        result = ((result * 31) + ((this.realRoadTimeScalePractice_ == null) ? 0 : this.realRoadTimeScalePractice_.hashCode()));
        result = ((result * 31) + ((this.gPRIX_Safety_Car_Thresh_ == null) ? 0 : this.gPRIX_Safety_Car_Thresh_.hashCode()));
        result = ((result * 31) + this.mULTI_PrivatePractice);
        result = ((result * 31) + this.cHAMP_Reconnaissance);
        result = ((result * 31) + this.mULTI_Formation_Lap);
        result = ((result * 31) + this.qualifyingStartingTime);
        result = ((result * 31) + this.gPRIX_PrivateQualifying);
        result = ((result * 31) + (this.gPRIX_TimeScaledWeather ? 1 : 0));
        result = ((result * 31) + this.cHAMP_Num_Qual_Sessions);
        result = ((result * 31) + this.gPRIX_Grid_Walkthrough);
        result = ((result * 31) + ((this.warmupStartingTime_ == null) ? 0 : this.warmupStartingTime_.hashCode()));
        result = ((result * 31) + ((this.gPRIX_BlueFlags_ == null) ? 0 : this.gPRIX_BlueFlags_.hashCode()));
        result = ((result * 31) + this.cHAMP_PrivateQualifying);
        result = ((result * 31) + this.mULTI_Safety_Car_Thresh);
        result = ((result * 31) + this.rPLAY_RaceStartingTime);
        result = ((result * 31) + this.rPLAY_Formation_Lap);
        result = ((result * 31) + (this.cURNT_Safety_Car_Collidable ? 1 : 0));
        result = ((result * 31) + this.gPRIX_Reconnaissance);
        result = ((result * 31) + ((this.gPRIX_PrivateQualifying_ == null) ? 0 : this.gPRIX_PrivateQualifying_.hashCode()));
        result = ((result * 31) + this.rPLAY_Reconnaissance);
        result = ((result * 31) + this.rPLAY_PrivateQualifying);
        result = ((result * 31) + this.gPRIX_Weather);
        result = ((result * 31) + this.gPRIX_Formation_Lap);
        result = ((result * 31) + ((this.gPRIX_Grid_Walkthrough_ == null) ? 0 : this.gPRIX_Grid_Walkthrough_.hashCode()));
        result = ((result * 31) + this.realRoadTimeScaleRace);
        result = ((result * 31) + this.cURNT_ParcFerme);
        result = ((result * 31) + ((this.recon_Pit_Open_ == null) ? 0 : this.recon_Pit_Open_.hashCode()));
        result = ((result * 31) + this.gPRIX_RaceStartingTime);
        result = ((result * 31) + this.gPRIX_Num_Qual_Sessions);
        result = ((result * 31) + (this.recon_Timer ? 1 : 0));
        result = ((result * 31) + this.gPRIX_Track_Cuts_Allowed);
        result = ((result * 31) + this.rPLAY_RaceTimeScale);
        result = ((result * 31) + ((this.gPRIX_TimeScaledWeather_ == null) ? 0 : this.gPRIX_TimeScaledWeather_.hashCode()));
        result = ((result * 31) + ((this.gPRIX_Formation_Lap_ == null) ? 0 : this.gPRIX_Formation_Lap_.hashCode()));
        result = ((result * 31) + this.cHAMP_Flag_Rules);
        result = ((result * 31) + ((this.gPRIX_Safety_Car_Collidable_ == null) ? 0 : this.gPRIX_Safety_Car_Collidable_.hashCode()));
        result = ((result * 31) + this.rPLAY_Flag_Rules);
        result = ((result * 31) + ((this.gPRIX_Num_Qual_Sessions_ == null) ? 0 : this.gPRIX_Num_Qual_Sessions_.hashCode()));
        result = ((result * 31) + this.gPRIX_RaceTimeScale);
        result = ((result * 31) + this.rPLAY_Grid_Walkthrough);
        result = ((result * 31) + this.cHAMP_Track_Cuts_Allowed);
        result = ((result * 31) + ((this.gPRIX_RaceStartingTime_ == null) ? 0 : this.gPRIX_RaceStartingTime_.hashCode()));
        result = ((result * 31) + (this.gPRIX_Safety_Car_Collidable ? 1 : 0));
        result = ((result * 31) + Float.floatToIntBits(this.cHAMP_Unsportsmanlike_Sensitivity));
        result = ((result * 31) + ((this.race_Timer_ == null) ? 0 : this.race_Timer_.hashCode()));
        result = ((result * 31) + this.cURNT_PrivateQualifying);
        result = ((result * 31) + this.force_Formation);
        result = ((result * 31) + ((this.gPRIX_Weather_ == null) ? 0 : this.gPRIX_Weather_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.gPRIX_Unsportsmanlike_Sensitivity));
        result = ((result * 31) + this.cHAMP_Num_Race_Sessions);
        result = ((result * 31) + Float.floatToIntBits(this.mULTI_Unsportsmanlike_Sensitivity));
        result = ((result * 31) + this.mULTI_Num_Qual_Sessions);
        result = ((result * 31) + this.cHAMP_BlueFlags);
        result = ((result * 31) + (this.cHAMP_Safety_Car_Collidable ? 1 : 0));
        result = ((result * 31) + ((this.recon_Pit_Closed_ == null) ? 0 : this.recon_Pit_Closed_.hashCode()));
        result = ((result * 31) + (this.cURNT_Disable_Semi_Final_Logic ? 1 : 0));
        result = ((result * 31) + (this.cHAMP_Disable_Semi_Final_Logic ? 1 : 0));
        result = ((result * 31) + this.rPLAY_ParcFerme);
        result = ((result * 31) + this.mULTI_RaceTimeScale);
        result = ((result * 31) + this.gPRIX_PrivatePractice);
        result = ((result * 31) + this.cURNT_Reconnaissance);
        result = ((result * 31) + (this.rPLAY_Disable_Semi_Final_Logic ? 1 : 0));
        result = ((result * 31) + this.cURNT_RaceStartingTime);
        result = ((result * 31) + ((this.realRoadTimeScaleQualifying_ == null) ? 0 : this.realRoadTimeScaleQualifying_.hashCode()));
        result = ((result * 31) + this.cHAMP_Grid_Walkthrough);
        result = ((result * 31) + Float.floatToIntBits(this.cURNT_Unsportsmanlike_Sensitivity));
        result = ((result * 31) + (this.rPLAY_TimeScaledWeather ? 1 : 0));
        result = ((result * 31) + this.rPLAY_Weather);
        result = ((result * 31) + this.rPLAY_BlueFlags);
        result = ((result * 31) + this.cHAMP_RaceTimeScale);
        result = ((result * 31) + this.recon_Pit_Closed);
        result = ((result * 31) + this.gPRIX_ParcFerme);
        result = ((result * 31) + this.cURNT_Weather);
        result = ((result * 31) + this.warmupStartingTime);
        result = ((result * 31) + ((this.gPRIX_Num_Race_Sessions_ == null) ? 0 : this.gPRIX_Num_Race_Sessions_.hashCode()));
        result = ((result * 31) + (this.mULTI_TimeScaledWeather ? 1 : 0));
        result = ((result * 31) + this.mULTI_ParcFerme);
        result = ((result * 31) + this.mULTI_Track_Cuts_Allowed);
        result = ((result * 31) + this.mULTI_PrivateQualifying);
        result = ((result * 31) + this.mULTI_Grid_Walkthrough);
        result = ((result * 31) + this.realRoadTimeScalePractice);
        result = ((result * 31) + this.cHAMP_Safety_Car_Thresh);
        result = ((result * 31) + this.gPRIX_Safety_Car_Thresh);
        result = ((result * 31) + (this.run_Practice1 ? 1 : 0));
        result = ((result * 31) + (this.run_Practice2 ? 1 : 0));
        result = ((result * 31) + (this.run_Practice3 ? 1 : 0));
        result = ((result * 31) + ((this.gPRIX_ParcFerme_ == null) ? 0 : this.gPRIX_ParcFerme_.hashCode()));
        result = ((result * 31) + (this.run_Practice4 ? 1 : 0));
        result = ((result * 31) + this.cURNT_Num_Race_Sessions);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RaceConditions) == false) {
            return false;
        }
        RaceConditions rhs = ((RaceConditions) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.rPLAY_Safety_Car_Thresh == rhs.rPLAY_Safety_Car_Thresh) && (this.cURNT_TimeScaledWeather == rhs.cURNT_TimeScaledWeather)) && (this.cHAMP_Formation_Lap == rhs.cHAMP_Formation_Lap)) && (this.mULTI_Reconnaissance == rhs.mULTI_Reconnaissance)) && (this.mULTI_Disable_Semi_Final_Logic == rhs.mULTI_Disable_Semi_Final_Logic)) && (this.rPLAY_Track_Cuts_Allowed == rhs.rPLAY_Track_Cuts_Allowed)) && (this.cURNT_Track_Cuts_Allowed == rhs.cURNT_Track_Cuts_Allowed)) && (this.cURNT_RaceTimeScale == rhs.cURNT_RaceTimeScale)) && ((this.gPRIX_RaceTimeScale_ == rhs.gPRIX_RaceTimeScale_) || ((this.gPRIX_RaceTimeScale_ != null) && this.gPRIX_RaceTimeScale_.equals(rhs.gPRIX_RaceTimeScale_)))) && ((this.force_Formation_ == rhs.force_Formation_) || ((this.force_Formation_ != null) && this.force_Formation_.equals(rhs.force_Formation_)))) && (this.cURNT_BlueFlags == rhs.cURNT_BlueFlags)) && (this.gPRIX_Disable_Semi_Final_Logic == rhs.gPRIX_Disable_Semi_Final_Logic)) && (this.practice1StartingTime == rhs.practice1StartingTime)) && (this.adjust_Frozen_Order == rhs.adjust_Frozen_Order)) && ((this.gPRIX_PrivatePractice_ == rhs.gPRIX_PrivatePractice_) || ((this.gPRIX_PrivatePractice_ != null) && this.gPRIX_PrivatePractice_.equals(rhs.gPRIX_PrivatePractice_)))) && ((this.adjust_Frozen_Order_ == rhs.adjust_Frozen_Order_) || ((this.adjust_Frozen_Order_ != null) && this.adjust_Frozen_Order_.equals(rhs.adjust_Frozen_Order_)))) && (this.recon_Pit_Open == rhs.recon_Pit_Open)) && (this.run_Warmup == rhs.run_Warmup)) && (this.cURNT_Flag_Rules == rhs.cURNT_Flag_Rules)) && (this.gPRIX_BlueFlags == rhs.gPRIX_BlueFlags)) && ((this.practice1StartingTime_ == rhs.practice1StartingTime_) || ((this.practice1StartingTime_ != null) && this.practice1StartingTime_.equals(rhs.practice1StartingTime_)))) && ((this.gPRIX_Flag_Rules_ == rhs.gPRIX_Flag_Rules_) || ((this.gPRIX_Flag_Rules_ != null) && this.gPRIX_Flag_Rules_.equals(rhs.gPRIX_Flag_Rules_)))) && (this.cURNT_Num_Qual_Sessions == rhs.cURNT_Num_Qual_Sessions)) && ((this.gPRIX_Track_Cuts_Allowed_ == rhs.gPRIX_Track_Cuts_Allowed_) || ((this.gPRIX_Track_Cuts_Allowed_ != null) && this.gPRIX_Track_Cuts_Allowed_.equals(rhs.gPRIX_Track_Cuts_Allowed_)))) && (this.mULTI_RaceStartingTime == rhs.mULTI_RaceStartingTime)) && (this.cURNT_Formation_Lap == rhs.cURNT_Formation_Lap)) && (this.cURNT_Safety_Car_Thresh == rhs.cURNT_Safety_Car_Thresh)) && ((this.gPRIX_Unsportsmanlike_Sensitivity_ == rhs.gPRIX_Unsportsmanlike_Sensitivity_) || ((this.gPRIX_Unsportsmanlike_Sensitivity_ != null) && this.gPRIX_Unsportsmanlike_Sensitivity_.equals(rhs.gPRIX_Unsportsmanlike_Sensitivity_)))) && ((this.realRoadTimeScaleRace_ == rhs.realRoadTimeScaleRace_) || ((this.realRoadTimeScaleRace_ != null) && this.realRoadTimeScaleRace_.equals(rhs.realRoadTimeScaleRace_)))) && (this.cHAMP_RaceStartingTime == rhs.cHAMP_RaceStartingTime)) && (this.cHAMP_Weather == rhs.cHAMP_Weather)) && (this.mULTI_Num_Race_Sessions == rhs.mULTI_Num_Race_Sessions)) && (this.mULTI_Weather == rhs.mULTI_Weather)) && (this.rPLAY_Num_Qual_Sessions == rhs.rPLAY_Num_Qual_Sessions)) && (this.cURNT_PrivatePractice == rhs.cURNT_PrivatePractice)) && (this.mULTI_Flag_Rules == rhs.mULTI_Flag_Rules)) && (this.gPRIX_Num_Race_Sessions == rhs.gPRIX_Num_Race_Sessions)) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && (this.gPRIX_Flag_Rules == rhs.gPRIX_Flag_Rules)) && (this.realRoadTimeScaleQualifying == rhs.realRoadTimeScaleQualifying)) && ((this.gPRIX_Reconnaissance_ == rhs.gPRIX_Reconnaissance_) || ((this.gPRIX_Reconnaissance_ != null) && this.gPRIX_Reconnaissance_.equals(rhs.gPRIX_Reconnaissance_)))) && (this.cHAMP_PrivatePractice == rhs.cHAMP_PrivatePractice)) && (Float.floatToIntBits(this.rPLAY_Unsportsmanlike_Sensitivity) == Float.floatToIntBits(rhs.rPLAY_Unsportsmanlike_Sensitivity))) && ((this.recon_Timer_ == rhs.recon_Timer_) || ((this.recon_Timer_ != null) && this.recon_Timer_.equals(rhs.recon_Timer_)))) && ((this.qualifyingStartingTime_ == rhs.qualifyingStartingTime_) || ((this.qualifyingStartingTime_ != null) && this.qualifyingStartingTime_.equals(rhs.qualifyingStartingTime_)))) && (this.rPLAY_Num_Race_Sessions == rhs.rPLAY_Num_Race_Sessions)) && (this.race_Timer == rhs.race_Timer)) && (this.cURNT_Grid_Walkthrough == rhs.cURNT_Grid_Walkthrough)) && (this.cHAMP_ParcFerme == rhs.cHAMP_ParcFerme)) && (this.rPLAY_PrivatePractice == rhs.rPLAY_PrivatePractice)) && (this.cHAMP_TimeScaledWeather == rhs.cHAMP_TimeScaledWeather)) && (this.mULTI_Safety_Car_Collidable == rhs.mULTI_Safety_Car_Collidable)) && (this.rPLAY_Safety_Car_Collidable == rhs.rPLAY_Safety_Car_Collidable)) && (this.mULTI_BlueFlags == rhs.mULTI_BlueFlags)) && ((this.realRoadTimeScalePractice_ == rhs.realRoadTimeScalePractice_) || ((this.realRoadTimeScalePractice_ != null) && this.realRoadTimeScalePractice_.equals(rhs.realRoadTimeScalePractice_)))) && ((this.gPRIX_Safety_Car_Thresh_ == rhs.gPRIX_Safety_Car_Thresh_) || ((this.gPRIX_Safety_Car_Thresh_ != null) && this.gPRIX_Safety_Car_Thresh_.equals(rhs.gPRIX_Safety_Car_Thresh_)))) && (this.mULTI_PrivatePractice == rhs.mULTI_PrivatePractice)) && (this.cHAMP_Reconnaissance == rhs.cHAMP_Reconnaissance)) && (this.mULTI_Formation_Lap == rhs.mULTI_Formation_Lap)) && (this.qualifyingStartingTime == rhs.qualifyingStartingTime)) && (this.gPRIX_PrivateQualifying == rhs.gPRIX_PrivateQualifying)) && (this.gPRIX_TimeScaledWeather == rhs.gPRIX_TimeScaledWeather)) && (this.cHAMP_Num_Qual_Sessions == rhs.cHAMP_Num_Qual_Sessions)) && (this.gPRIX_Grid_Walkthrough == rhs.gPRIX_Grid_Walkthrough)) && ((this.warmupStartingTime_ == rhs.warmupStartingTime_) || ((this.warmupStartingTime_ != null) && this.warmupStartingTime_.equals(rhs.warmupStartingTime_)))) && ((this.gPRIX_BlueFlags_ == rhs.gPRIX_BlueFlags_) || ((this.gPRIX_BlueFlags_ != null) && this.gPRIX_BlueFlags_.equals(rhs.gPRIX_BlueFlags_)))) && (this.cHAMP_PrivateQualifying == rhs.cHAMP_PrivateQualifying)) && (this.mULTI_Safety_Car_Thresh == rhs.mULTI_Safety_Car_Thresh)) && (this.rPLAY_RaceStartingTime == rhs.rPLAY_RaceStartingTime)) && (this.rPLAY_Formation_Lap == rhs.rPLAY_Formation_Lap)) && (this.cURNT_Safety_Car_Collidable == rhs.cURNT_Safety_Car_Collidable)) && (this.gPRIX_Reconnaissance == rhs.gPRIX_Reconnaissance)) && ((this.gPRIX_PrivateQualifying_ == rhs.gPRIX_PrivateQualifying_) || ((this.gPRIX_PrivateQualifying_ != null) && this.gPRIX_PrivateQualifying_.equals(rhs.gPRIX_PrivateQualifying_)))) && (this.rPLAY_Reconnaissance == rhs.rPLAY_Reconnaissance)) && (this.rPLAY_PrivateQualifying == rhs.rPLAY_PrivateQualifying)) && (this.gPRIX_Weather == rhs.gPRIX_Weather)) && (this.gPRIX_Formation_Lap == rhs.gPRIX_Formation_Lap)) && ((this.gPRIX_Grid_Walkthrough_ == rhs.gPRIX_Grid_Walkthrough_) || ((this.gPRIX_Grid_Walkthrough_ != null) && this.gPRIX_Grid_Walkthrough_.equals(rhs.gPRIX_Grid_Walkthrough_)))) && (this.realRoadTimeScaleRace == rhs.realRoadTimeScaleRace)) && (this.cURNT_ParcFerme == rhs.cURNT_ParcFerme)) && ((this.recon_Pit_Open_ == rhs.recon_Pit_Open_) || ((this.recon_Pit_Open_ != null) && this.recon_Pit_Open_.equals(rhs.recon_Pit_Open_)))) && (this.gPRIX_RaceStartingTime == rhs.gPRIX_RaceStartingTime)) && (this.gPRIX_Num_Qual_Sessions == rhs.gPRIX_Num_Qual_Sessions)) && (this.recon_Timer == rhs.recon_Timer)) && (this.gPRIX_Track_Cuts_Allowed == rhs.gPRIX_Track_Cuts_Allowed)) && (this.rPLAY_RaceTimeScale == rhs.rPLAY_RaceTimeScale)) && ((this.gPRIX_TimeScaledWeather_ == rhs.gPRIX_TimeScaledWeather_) || ((this.gPRIX_TimeScaledWeather_ != null) && this.gPRIX_TimeScaledWeather_.equals(rhs.gPRIX_TimeScaledWeather_)))) && ((this.gPRIX_Formation_Lap_ == rhs.gPRIX_Formation_Lap_) || ((this.gPRIX_Formation_Lap_ != null) && this.gPRIX_Formation_Lap_.equals(rhs.gPRIX_Formation_Lap_)))) && (this.cHAMP_Flag_Rules == rhs.cHAMP_Flag_Rules)) && ((this.gPRIX_Safety_Car_Collidable_ == rhs.gPRIX_Safety_Car_Collidable_) || ((this.gPRIX_Safety_Car_Collidable_ != null) && this.gPRIX_Safety_Car_Collidable_.equals(rhs.gPRIX_Safety_Car_Collidable_)))) && (this.rPLAY_Flag_Rules == rhs.rPLAY_Flag_Rules)) && ((this.gPRIX_Num_Qual_Sessions_ == rhs.gPRIX_Num_Qual_Sessions_) || ((this.gPRIX_Num_Qual_Sessions_ != null) && this.gPRIX_Num_Qual_Sessions_.equals(rhs.gPRIX_Num_Qual_Sessions_)))) && (this.gPRIX_RaceTimeScale == rhs.gPRIX_RaceTimeScale)) && (this.rPLAY_Grid_Walkthrough == rhs.rPLAY_Grid_Walkthrough)) && (this.cHAMP_Track_Cuts_Allowed == rhs.cHAMP_Track_Cuts_Allowed)) && ((this.gPRIX_RaceStartingTime_ == rhs.gPRIX_RaceStartingTime_) || ((this.gPRIX_RaceStartingTime_ != null) && this.gPRIX_RaceStartingTime_.equals(rhs.gPRIX_RaceStartingTime_)))) && (this.gPRIX_Safety_Car_Collidable == rhs.gPRIX_Safety_Car_Collidable)) && (Float.floatToIntBits(this.cHAMP_Unsportsmanlike_Sensitivity) == Float.floatToIntBits(rhs.cHAMP_Unsportsmanlike_Sensitivity))) && ((this.race_Timer_ == rhs.race_Timer_) || ((this.race_Timer_ != null) && this.race_Timer_.equals(rhs.race_Timer_)))) && (this.cURNT_PrivateQualifying == rhs.cURNT_PrivateQualifying)) && (this.force_Formation == rhs.force_Formation)) && ((this.gPRIX_Weather_ == rhs.gPRIX_Weather_) || ((this.gPRIX_Weather_ != null) && this.gPRIX_Weather_.equals(rhs.gPRIX_Weather_)))) && (Float.floatToIntBits(this.gPRIX_Unsportsmanlike_Sensitivity) == Float.floatToIntBits(rhs.gPRIX_Unsportsmanlike_Sensitivity))) && (this.cHAMP_Num_Race_Sessions == rhs.cHAMP_Num_Race_Sessions)) && (Float.floatToIntBits(this.mULTI_Unsportsmanlike_Sensitivity) == Float.floatToIntBits(rhs.mULTI_Unsportsmanlike_Sensitivity))) && (this.mULTI_Num_Qual_Sessions == rhs.mULTI_Num_Qual_Sessions)) && (this.cHAMP_BlueFlags == rhs.cHAMP_BlueFlags)) && (this.cHAMP_Safety_Car_Collidable == rhs.cHAMP_Safety_Car_Collidable)) && ((this.recon_Pit_Closed_ == rhs.recon_Pit_Closed_) || ((this.recon_Pit_Closed_ != null) && this.recon_Pit_Closed_.equals(rhs.recon_Pit_Closed_)))) && (this.cURNT_Disable_Semi_Final_Logic == rhs.cURNT_Disable_Semi_Final_Logic)) && (this.cHAMP_Disable_Semi_Final_Logic == rhs.cHAMP_Disable_Semi_Final_Logic)) && (this.rPLAY_ParcFerme == rhs.rPLAY_ParcFerme)) && (this.mULTI_RaceTimeScale == rhs.mULTI_RaceTimeScale)) && (this.gPRIX_PrivatePractice == rhs.gPRIX_PrivatePractice)) && (this.cURNT_Reconnaissance == rhs.cURNT_Reconnaissance)) && (this.rPLAY_Disable_Semi_Final_Logic == rhs.rPLAY_Disable_Semi_Final_Logic)) && (this.cURNT_RaceStartingTime == rhs.cURNT_RaceStartingTime)) && ((this.realRoadTimeScaleQualifying_ == rhs.realRoadTimeScaleQualifying_) || ((this.realRoadTimeScaleQualifying_ != null) && this.realRoadTimeScaleQualifying_.equals(rhs.realRoadTimeScaleQualifying_)))) && (this.cHAMP_Grid_Walkthrough == rhs.cHAMP_Grid_Walkthrough)) && (Float.floatToIntBits(this.cURNT_Unsportsmanlike_Sensitivity) == Float.floatToIntBits(rhs.cURNT_Unsportsmanlike_Sensitivity))) && (this.rPLAY_TimeScaledWeather == rhs.rPLAY_TimeScaledWeather)) && (this.rPLAY_Weather == rhs.rPLAY_Weather)) && (this.rPLAY_BlueFlags == rhs.rPLAY_BlueFlags)) && (this.cHAMP_RaceTimeScale == rhs.cHAMP_RaceTimeScale)) && (this.recon_Pit_Closed == rhs.recon_Pit_Closed)) && (this.gPRIX_ParcFerme == rhs.gPRIX_ParcFerme)) && (this.cURNT_Weather == rhs.cURNT_Weather)) && (this.warmupStartingTime == rhs.warmupStartingTime)) && ((this.gPRIX_Num_Race_Sessions_ == rhs.gPRIX_Num_Race_Sessions_) || ((this.gPRIX_Num_Race_Sessions_ != null) && this.gPRIX_Num_Race_Sessions_.equals(rhs.gPRIX_Num_Race_Sessions_)))) && (this.mULTI_TimeScaledWeather == rhs.mULTI_TimeScaledWeather)) && (this.mULTI_ParcFerme == rhs.mULTI_ParcFerme)) && (this.mULTI_Track_Cuts_Allowed == rhs.mULTI_Track_Cuts_Allowed)) && (this.mULTI_PrivateQualifying == rhs.mULTI_PrivateQualifying)) && (this.mULTI_Grid_Walkthrough == rhs.mULTI_Grid_Walkthrough)) && (this.realRoadTimeScalePractice == rhs.realRoadTimeScalePractice)) && (this.cHAMP_Safety_Car_Thresh == rhs.cHAMP_Safety_Car_Thresh)) && (this.gPRIX_Safety_Car_Thresh == rhs.gPRIX_Safety_Car_Thresh)) && (this.run_Practice1 == rhs.run_Practice1)) && (this.run_Practice2 == rhs.run_Practice2)) && (this.run_Practice3 == rhs.run_Practice3)) && ((this.gPRIX_ParcFerme_ == rhs.gPRIX_ParcFerme_) || ((this.gPRIX_ParcFerme_ != null) && this.gPRIX_ParcFerme_.equals(rhs.gPRIX_ParcFerme_)))) && (this.run_Practice4 == rhs.run_Practice4)) && (this.cURNT_Num_Race_Sessions == rhs.cURNT_Num_Race_Sessions));
    }

}
