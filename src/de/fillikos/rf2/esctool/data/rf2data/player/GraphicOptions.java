package de.fillikos.rf2.esctool.data.rf2data.player;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Allow HUD in cockpit",
        "Allow Letterboxing",
        "Allow Letterboxing#",
        "Always Rebuild Collision",
        "Always Rebuild Collision#",
        "Any Camera HUD",
        "Any Camera HUD#",
        "Auto Detail Framerate",
        "Auto Detail Framerate#",
        "Automap",
        "Automap#",
        "Backfire Anim Speed",
        "Box Outline",
        "Box Outline#",
        "Broadcast Overlay",
        "Car Vibration Mult1",
        "Car Vibration Mult1#",
        "Car Vibration Mult2",
        "Car Vibration Mult2#",
        "Center Mirror Horiz",
        "Center Mirror Horiz#",
        "Center Mirror Size",
        "Center Mirror Vert",
        "Cockpit Vibration Freq1",
        "Cockpit Vibration Freq1#",
        "Cockpit Vibration Freq2",
        "Cockpit Vibration Freq2#",
        "Cockpit Vibration Mult1",
        "Cockpit Vibration Mult1#",
        "Cockpit Vibration Mult2",
        "Cockpit Vibration Mult2#",
        "Compressed Textures",
        "Delay Video Swap",
        "Delay Video Swap#",
        "Display Icons",
        "Display Icons#",
        "Display Vehicle Labels",
        "Display Vehicle Labels#",
        "Dynamic Vertex Buffers",
        "Dynamic Vertex Buffers#",
        "Enable Legacy HDR Profiles",
        "Enable Legacy HDR Profiles#",
        "Engine Emitter Flow",
        "Engine Emitter Flow#",
        "Environment Reflections",
        "Environment Reflections#",
        "Exaggerate Yaw",
        "Exaggerate Yaw#",
        "Extra Visible Vehicles",
        "Extra Visible Vehicles#",
        "Full Tire Shader",
        "Full Tire Shader#",
        "Gap Check",
        "Gap Check#",
        "Garage Detail",
        "Garage Detail#",
        "Glance Angle",
        "Glance Angle#",
        "Glance Rate",
        "Glance Rate#",
        "Groove",
        "HUD",
        "HUD Component",
        "HUD Component Version",
        "HUD MFD",
        "HUD Race Stats",
        "HUD Tachometer",
        "HUD file",
        "Head Physics",
        "Head Physics#",
        "Head Rotation",
        "Head Rotation#",
        "Headlights On Cars",
        "Headlights On Cars#",
        "Heat FX Fade Speed",
        "Heat FX Fade Speed#",
        "LCD Display Modes",
        "LCD Display Modes#",
        "LSI Top",
        "LSI Top#",
        "Leanahead Angle",
        "Leanahead Angle#",
        "Left Mirror Horiz",
        "Left Mirror Horiz#",
        "Left Mirror Size",
        "Left Mirror Vert",
        "Lightning Probability",
        "Lightning Probability#",
        "Load Opponent Cockpits",
        "Load Opponent Cockpits#",
        "Logo Seconds",
        "Logo Seconds#",
        "Look Roll Angle",
        "Look Roll Angle#",
        "Look Up/Down Angle",
        "Look Up/Down Angle#",
        "Lookahead Angle",
        "Lookahead Angle#",
        "Low Detail UI",
        "MIP Mapping",
        "Max Framerate",
        "Max Framerate#",
        "Max Headlights",
        "Max Headlights#",
        "Max Visible Vehicles",
        "Mirror Adjustment Horiz",
        "Mirror Adjustment Horiz#",
        "Mirror Adjustment Vert",
        "Mirror Physical X",
        "Mirror Physical X#",
        "Mirror Physical Y",
        "Mirror Physical Y#",
        "Mirror Physical Z",
        "Moving Rearview",
        "Moving Rearview#",
        "Opponent Detail",
        "Opponent Texture Override",
        "Opponent Texture Override#",
        "Overlay Height Offset",
        "Overlay Height Offset#",
        "Overlay Z Bias",
        "Overlay Z Bias#",
        "Partial Cockpit View",
        "Partial Cockpit View#",
        "Pitcrew Detail Level",
        "Pitcrew Detail Level#",
        "Player Detail",
        "Player Detail#",
        "Player Livery",
        "Player Livery#",
        "Player Texture Override",
        "Player Texture Override#",
        "Rain FX Quality",
        "Rain FX Quality#",
        "Raindrop Flow",
        "Raindrop Flow#",
        "Rainspray Flow",
        "Rainspray Flow#",
        "Real Road System",
        "Real Road System#",
        "Rearview Cull",
        "Rearview Cull#",
        "Rearview Driving",
        "Rearview Driving#",
        "Rearview Height",
        "Rearview Independent",
        "Rearview Independent#",
        "Rearview Onboard",
        "Rearview Onboard#",
        "Rearview Particles",
        "Rearview Swingman",
        "Rearview Swingman#",
        "Rearview Width",
        "Rearview Width#",
        "Rearview_Back_Clip",
        "Rearview_Back_Clip#",
        "Rearview_Front_Clip",
        "Rearview_Front_Clip#",
        "Render Once Per VSync",
        "Render Once Per VSync#",
        "Right Mirror Horiz",
        "Right Mirror Horiz#",
        "Right Mirror Size",
        "Right Mirror Vert",
        "Road Reflections",
        "Road Reflections#",
        "Screenshot Depth Alpha",
        "Screenshot Depth Alpha#",
        "Screenshot Format",
        "Screenshot Format#",
        "Seat Adjustment Aft",
        "Seat Adjustment Aft#",
        "Seat Adjustment Up",
        "Seat Pitch",
        "Seat Pitch#",
        "Seat Roll",
        "Seat Roll#",
        "Seat Yaw",
        "Seat Yaw#",
        "Self In Rearview",
        "Self In Rearview#",
        "Shadow Blur",
        "Shadow Blur#",
        "Shadows",
        "Shadows#",
        "Smoke Flow",
        "Smoke Flow#",
        "Soft Particles",
        "Soft Particles#",
        "Spark Flow",
        "Spark Flow#",
        "Special FX",
        "Special FX#",
        "Stabilize Horizon",
        "Stabilize Horizon#",
        "Starting View",
        "Starting View#",
        "Steady Framerate Thresh",
        "Steady Framerate Thresh#",
        "Steering Wheel",
        "Steering Wheel#",
        "Sun Occlusion",
        "Sun Occlusion#",
        "Synchronize Frame",
        "Synchronize Frame#",
        "Texture Detail",
        "Texture Detail#",
        "Texture Filter",
        "Texture Filter#",
        "Texture Sharpening",
        "Texture Sharpening#",
        "Thunder Probability",
        "Thunder Probability#",
        "Tire Emitter Flow",
        "Tire Emitter Flow#",
        "Tire Ground Offset",
        "Tire Ground Offset#",
        "Track Detail",
        "Transparency AA",
        "Transparency AA#",
        "UI Background Animation",
        "UI autonomous render thread",
        "UI autonomous render thread#",
        "VR Enable Hidden Area Mask",
        "VR Enable Hidden Area Mask#",
        "VR IPD Scale",
        "VR IPD Scale#",
        "VR Projection Mode",
        "VR Projection Mode#",
        "Vehicle Flow Offset",
        "Vehicle Flow Offset#",
        "Vehicle Flow Radius",
        "Vehicle Flow Radius#",
        "Verify Refs",
        "Verify Refs#",
        "Vertical FOV Degrees",
        "Vertical FOV Degrees#",
        "Virtual Rearview In Cockpit",
        "Virtual Rearview In Cockpit#",
        "Warning Light Anim Speed",
        "Warning Light Anim Speed#",
        "Widescreen Overlays",
        "Wind and Crowd Motion",
        "Wind and Crowd Motion#"
})
@Generated("jsonschema2pojo")
public class GraphicOptions {

    @JsonProperty("Allow HUD in cockpit")
    private boolean allow_HUD_in_cockpit;
    @JsonProperty("Allow Letterboxing")
    private boolean allow_Letterboxing;
    @JsonProperty("Allow Letterboxing#")
    private String allow_Letterboxing_;
    @JsonProperty("Always Rebuild Collision")
    private boolean always_Rebuild_Collision;
    @JsonProperty("Always Rebuild Collision#")
    private String always_Rebuild_Collision_;
    @JsonProperty("Any Camera HUD")
    private boolean any_Camera_HUD;
    @JsonProperty("Any Camera HUD#")
    private String any_Camera_HUD_;
    @JsonProperty("Auto Detail Framerate")
    private int auto_Detail_Framerate;
    @JsonProperty("Auto Detail Framerate#")
    private String auto_Detail_Framerate_;
    @JsonProperty("Automap")
    private int automap;
    @JsonProperty("Automap#")
    private String automap_;
    @JsonProperty("Backfire Anim Speed")
    private int backfire_Anim_Speed;
    @JsonProperty("Box Outline")
    private int box_Outline;
    @JsonProperty("Box Outline#")
    private String box_Outline_;
    @JsonProperty("Broadcast Overlay")
    private int broadcast_Overlay;
    @JsonProperty("Car Vibration Mult1")
    private int car_Vibration_Mult1;
    @JsonProperty("Car Vibration Mult1#")
    private String car_Vibration_Mult1_;
    @JsonProperty("Car Vibration Mult2")
    private int car_Vibration_Mult2;
    @JsonProperty("Car Vibration Mult2#")
    private String car_Vibration_Mult2_;
    @JsonProperty("Center Mirror Horiz")
    private int center_Mirror_Horiz;
    @JsonProperty("Center Mirror Horiz#")
    private String center_Mirror_Horiz_;
    @JsonProperty("Center Mirror Size")
    private int center_Mirror_Size;
    @JsonProperty("Center Mirror Vert")
    private int center_Mirror_Vert;
    @JsonProperty("Cockpit Vibration Freq1")
    private int cockpit_Vibration_Freq1;
    @JsonProperty("Cockpit Vibration Freq1#")
    private String cockpit_Vibration_Freq1_;
    @JsonProperty("Cockpit Vibration Freq2")
    private int cockpit_Vibration_Freq2;
    @JsonProperty("Cockpit Vibration Freq2#")
    private String cockpit_Vibration_Freq2_;
    @JsonProperty("Cockpit Vibration Mult1")
    private int cockpit_Vibration_Mult1;
    @JsonProperty("Cockpit Vibration Mult1#")
    private String cockpit_Vibration_Mult1_;
    @JsonProperty("Cockpit Vibration Mult2")
    private int cockpit_Vibration_Mult2;
    @JsonProperty("Cockpit Vibration Mult2#")
    private String cockpit_Vibration_Mult2_;
    @JsonProperty("Compressed Textures")
    private int compressed_Textures;
    @JsonProperty("Delay Video Swap")
    private boolean delay_Video_Swap;
    @JsonProperty("Delay Video Swap#")
    private String delay_Video_Swap_;
    @JsonProperty("Display Icons")
    private int display_Icons;
    @JsonProperty("Display Icons#")
    private String display_Icons_;
    @JsonProperty("Display Vehicle Labels")
    private int display_Vehicle_Labels;
    @JsonProperty("Display Vehicle Labels#")
    private String display_Vehicle_Labels_;
    @JsonProperty("Dynamic Vertex Buffers")
    private boolean dynamic_Vertex_Buffers;
    @JsonProperty("Dynamic Vertex Buffers#")
    private String dynamic_Vertex_Buffers_;
    @JsonProperty("Enable Legacy HDR Profiles")
    private boolean enable_Legacy_HDR_Profiles;
    @JsonProperty("Enable Legacy HDR Profiles#")
    private String enable_Legacy_HDR_Profiles_;
    @JsonProperty("Engine Emitter Flow")
    private boolean engine_Emitter_Flow;
    @JsonProperty("Engine Emitter Flow#")
    private String engine_Emitter_Flow_;
    @JsonProperty("Environment Reflections")
    private int environment_Reflections;
    @JsonProperty("Environment Reflections#")
    private String environment_Reflections_;
    @JsonProperty("Exaggerate Yaw")
    private int exaggerate_Yaw;
    @JsonProperty("Exaggerate Yaw#")
    private String exaggerate_Yaw_;
    @JsonProperty("Extra Visible Vehicles")
    private int extra_Visible_Vehicles;
    @JsonProperty("Extra Visible Vehicles#")
    private String extra_Visible_Vehicles_;
    @JsonProperty("Full Tire Shader")
    private boolean full_Tire_Shader;
    @JsonProperty("Full Tire Shader#")
    private String full_Tire_Shader_;
    @JsonProperty("Gap Check")
    private int gap_Check;
    @JsonProperty("Gap Check#")
    private String gap_Check_;
    @JsonProperty("Garage Detail")
    private float garage_Detail;
    @JsonProperty("Garage Detail#")
    private String garage_Detail_;
    @JsonProperty("Glance Angle")
    private float glance_Angle;
    @JsonProperty("Glance Angle#")
    private String glance_Angle_;
    @JsonProperty("Glance Rate")
    private int glance_Rate;
    @JsonProperty("Glance Rate#")
    private String glance_Rate_;
    @JsonProperty("Groove")
    private int groove;
    @JsonProperty("HUD")
    private int hUD;
    @JsonProperty("HUD Component")
    private String hUD_Component;
    @JsonProperty("HUD Component Version")
    private String hUD_Component_Version;
    @JsonProperty("HUD MFD")
    private int hUD_MFD;
    @JsonProperty("HUD Race Stats")
    private int hUD_Race_Stats;
    @JsonProperty("HUD Tachometer")
    private int hUD_Tachometer;
    @JsonProperty("HUD file")
    private String hUD_file;
    @JsonProperty("Head Physics")
    private int head_Physics;
    @JsonProperty("Head Physics#")
    private String head_Physics_;
    @JsonProperty("Head Rotation")
    private int head_Rotation;
    @JsonProperty("Head Rotation#")
    private String head_Rotation_;
    @JsonProperty("Headlights On Cars")
    private boolean headlights_On_Cars;
    @JsonProperty("Headlights On Cars#")
    private String headlights_On_Cars_;
    @JsonProperty("Heat FX Fade Speed")
    private int heat_FX_Fade_Speed;
    @JsonProperty("Heat FX Fade Speed#")
    private String heat_FX_Fade_Speed_;
    @JsonProperty("LCD Display Modes")
    private int lCD_Display_Modes;
    @JsonProperty("LCD Display Modes#")
    private String lCD_Display_Modes_;
    @JsonProperty("LSI Top")
    private float lSI_Top;
    @JsonProperty("LSI Top#")
    private String lSI_Top_;
    @JsonProperty("Leanahead Angle")
    private int leanahead_Angle;
    @JsonProperty("Leanahead Angle#")
    private String leanahead_Angle_;
    @JsonProperty("Left Mirror Horiz")
    private int left_Mirror_Horiz;
    @JsonProperty("Left Mirror Horiz#")
    private String left_Mirror_Horiz_;
    @JsonProperty("Left Mirror Size")
    private int left_Mirror_Size;
    @JsonProperty("Left Mirror Vert")
    private int left_Mirror_Vert;
    @JsonProperty("Lightning Probability")
    private int lightning_Probability;
    @JsonProperty("Lightning Probability#")
    private String lightning_Probability_;
    @JsonProperty("Load Opponent Cockpits")
    private boolean load_Opponent_Cockpits;
    @JsonProperty("Load Opponent Cockpits#")
    private String load_Opponent_Cockpits_;
    @JsonProperty("Logo Seconds")
    private int logo_Seconds;
    @JsonProperty("Logo Seconds#")
    private String logo_Seconds_;
    @JsonProperty("Look Roll Angle")
    private float look_Roll_Angle;
    @JsonProperty("Look Roll Angle#")
    private String look_Roll_Angle_;
    @JsonProperty("Look Up/Down Angle")
    private float look_Up_Down_Angle;
    @JsonProperty("Look Up/Down Angle#")
    private String look_Up_Down_Angle_;
    @JsonProperty("Lookahead Angle")
    private int lookahead_Angle;
    @JsonProperty("Lookahead Angle#")
    private String lookahead_Angle_;
    @JsonProperty("Low Detail UI")
    private int low_Detail_UI;
    @JsonProperty("MIP Mapping")
    private int mIP_Mapping;
    @JsonProperty("Max Framerate")
    private int max_Framerate;
    @JsonProperty("Max Framerate#")
    private String max_Framerate_;
    @JsonProperty("Max Headlights")
    private int max_Headlights;
    @JsonProperty("Max Headlights#")
    private String max_Headlights_;
    @JsonProperty("Max Visible Vehicles")
    private int max_Visible_Vehicles;
    @JsonProperty("Mirror Adjustment Horiz")
    private float mirror_Adjustment_Horiz;
    @JsonProperty("Mirror Adjustment Horiz#")
    private String mirror_Adjustment_Horiz_;
    @JsonProperty("Mirror Adjustment Vert")
    private float mirror_Adjustment_Vert;
    @JsonProperty("Mirror Physical X")
    private int mirror_Physical_X;
    @JsonProperty("Mirror Physical X#")
    private String mirror_Physical_X_;
    @JsonProperty("Mirror Physical Y")
    private int mirror_Physical_Y;
    @JsonProperty("Mirror Physical Y#")
    private String mirror_Physical_Y_;
    @JsonProperty("Mirror Physical Z")
    private int mirror_Physical_Z;
    @JsonProperty("Moving Rearview")
    private int moving_Rearview;
    @JsonProperty("Moving Rearview#")
    private String moving_Rearview_;
    @JsonProperty("Opponent Detail")
    private int opponent_Detail;
    @JsonProperty("Opponent Texture Override")
    private int opponent_Texture_Override;
    @JsonProperty("Opponent Texture Override#")
    private String opponent_Texture_Override_;
    @JsonProperty("Overlay Height Offset")
    private float overlay_Height_Offset;
    @JsonProperty("Overlay Height Offset#")
    private String overlay_Height_Offset_;
    @JsonProperty("Overlay Z Bias")
    private int overlay_Z_Bias;
    @JsonProperty("Overlay Z Bias#")
    private String overlay_Z_Bias_;
    @JsonProperty("Partial Cockpit View")
    private int partial_Cockpit_View;
    @JsonProperty("Partial Cockpit View#")
    private String partial_Cockpit_View_;
    @JsonProperty("Pitcrew Detail Level")
    private int pitcrew_Detail_Level;
    @JsonProperty("Pitcrew Detail Level#")
    private String pitcrew_Detail_Level_;
    @JsonProperty("Player Detail")
    private int player_Detail;
    @JsonProperty("Player Detail#")
    private String player_Detail_;
    @JsonProperty("Player Livery")
    private String player_Livery;
    @JsonProperty("Player Livery#")
    private String player_Livery_;
    @JsonProperty("Player Texture Override")
    private int player_Texture_Override;
    @JsonProperty("Player Texture Override#")
    private String player_Texture_Override_;
    @JsonProperty("Rain FX Quality")
    private int rain_FX_Quality;
    @JsonProperty("Rain FX Quality#")
    private String rain_FX_Quality_;
    @JsonProperty("Raindrop Flow")
    private int raindrop_Flow;
    @JsonProperty("Raindrop Flow#")
    private String raindrop_Flow_;
    @JsonProperty("Rainspray Flow")
    private int rainspray_Flow;
    @JsonProperty("Rainspray Flow#")
    private String rainspray_Flow_;
    @JsonProperty("Real Road System")
    private boolean real_Road_System;
    @JsonProperty("Real Road System#")
    private String real_Road_System_;
    @JsonProperty("Rearview Cull")
    private boolean rearview_Cull;
    @JsonProperty("Rearview Cull#")
    private String rearview_Cull_;
    @JsonProperty("Rearview Driving")
    private int rearview_Driving;
    @JsonProperty("Rearview Driving#")
    private String rearview_Driving_;
    @JsonProperty("Rearview Height")
    private float rearview_Height;
    @JsonProperty("Rearview Independent")
    private boolean rearview_Independent;
    @JsonProperty("Rearview Independent#")
    private String rearview_Independent_;
    @JsonProperty("Rearview Onboard")
    private int rearview_Onboard;
    @JsonProperty("Rearview Onboard#")
    private String rearview_Onboard_;
    @JsonProperty("Rearview Particles")
    private boolean rearview_Particles;
    @JsonProperty("Rearview Swingman")
    private int rearview_Swingman;
    @JsonProperty("Rearview Swingman#")
    private String rearview_Swingman_;
    @JsonProperty("Rearview Width")
    private int rearview_Width;
    @JsonProperty("Rearview Width#")
    private String rearview_Width_;
    @JsonProperty("Rearview_Back_Clip")
    private int rearview_Back_Clip;
    @JsonProperty("Rearview_Back_Clip#")
    private String rearview_Back_Clip_;
    @JsonProperty("Rearview_Front_Clip")
    private float rearview_Front_Clip;
    @JsonProperty("Rearview_Front_Clip#")
    private String rearview_Front_Clip_;
    @JsonProperty("Render Once Per VSync")
    private int render_Once_Per_VSync;
    @JsonProperty("Render Once Per VSync#")
    private String render_Once_Per_VSync_;
    @JsonProperty("Right Mirror Horiz")
    private int right_Mirror_Horiz;
    @JsonProperty("Right Mirror Horiz#")
    private String right_Mirror_Horiz_;
    @JsonProperty("Right Mirror Size")
    private int right_Mirror_Size;
    @JsonProperty("Right Mirror Vert")
    private int right_Mirror_Vert;
    @JsonProperty("Road Reflections")
    private int road_Reflections;
    @JsonProperty("Road Reflections#")
    private String road_Reflections_;
    @JsonProperty("Screenshot Depth Alpha")
    private boolean screenshot_Depth_Alpha;
    @JsonProperty("Screenshot Depth Alpha#")
    private String screenshot_Depth_Alpha_;
    @JsonProperty("Screenshot Format")
    private int screenshot_Format;
    @JsonProperty("Screenshot Format#")
    private String screenshot_Format_;
    @JsonProperty("Seat Adjustment Aft")
    private int seat_Adjustment_Aft;
    @JsonProperty("Seat Adjustment Aft#")
    private String seat_Adjustment_Aft_;
    @JsonProperty("Seat Adjustment Up")
    private float seat_Adjustment_Up;
    @JsonProperty("Seat Pitch")
    private int seat_Pitch;
    @JsonProperty("Seat Pitch#")
    private String seat_Pitch_;
    @JsonProperty("Seat Roll")
    private int seat_Roll;
    @JsonProperty("Seat Roll#")
    private String seat_Roll_;
    @JsonProperty("Seat Yaw")
    private int seat_Yaw;
    @JsonProperty("Seat Yaw#")
    private String seat_Yaw_;
    @JsonProperty("Self In Rearview")
    private String self_In_Rearview;
    @JsonProperty("Self In Rearview#")
    private String self_In_Rearview_;
    @JsonProperty("Shadow Blur")
    private int shadow_Blur;
    @JsonProperty("Shadow Blur#")
    private String shadow_Blur_;
    @JsonProperty("Shadows")
    private int shadows;
    @JsonProperty("Shadows#")
    private String shadows_;
    @JsonProperty("Smoke Flow")
    private boolean smoke_Flow;
    @JsonProperty("Smoke Flow#")
    private String smoke_Flow_;
    @JsonProperty("Soft Particles")
    private int soft_Particles;
    @JsonProperty("Soft Particles#")
    private String soft_Particles_;
    @JsonProperty("Spark Flow")
    private int spark_Flow;
    @JsonProperty("Spark Flow#")
    private String spark_Flow_;
    @JsonProperty("Special FX")
    private int special_FX;
    @JsonProperty("Special FX#")
    private String special_FX_;
    @JsonProperty("Stabilize Horizon")
    private int stabilize_Horizon;
    @JsonProperty("Stabilize Horizon#")
    private String stabilize_Horizon_;
    @JsonProperty("Starting View")
    private int starting_View;
    @JsonProperty("Starting View#")
    private String starting_View_;
    @JsonProperty("Steady Framerate Thresh")
    private int steady_Framerate_Thresh;
    @JsonProperty("Steady Framerate Thresh#")
    private String steady_Framerate_Thresh_;
    @JsonProperty("Steering Wheel")
    private int steering_Wheel;
    @JsonProperty("Steering Wheel#")
    private String steering_Wheel_;
    @JsonProperty("Sun Occlusion")
    private boolean sun_Occlusion;
    @JsonProperty("Sun Occlusion#")
    private String sun_Occlusion_;
    @JsonProperty("Synchronize Frame")
    private int synchronize_Frame;
    @JsonProperty("Synchronize Frame#")
    private String synchronize_Frame_;
    @JsonProperty("Texture Detail")
    private int texture_Detail;
    @JsonProperty("Texture Detail#")
    private String texture_Detail_;
    @JsonProperty("Texture Filter")
    private int texture_Filter;
    @JsonProperty("Texture Filter#")
    private String texture_Filter_;
    @JsonProperty("Texture Sharpening")
    private int texture_Sharpening;
    @JsonProperty("Texture Sharpening#")
    private String texture_Sharpening_;
    @JsonProperty("Thunder Probability")
    private float thunder_Probability;
    @JsonProperty("Thunder Probability#")
    private String thunder_Probability_;
    @JsonProperty("Tire Emitter Flow")
    private boolean tire_Emitter_Flow;
    @JsonProperty("Tire Emitter Flow#")
    private String tire_Emitter_Flow_;
    @JsonProperty("Tire Ground Offset")
    private int tire_Ground_Offset;
    @JsonProperty("Tire Ground Offset#")
    private String tire_Ground_Offset_;
    @JsonProperty("Track Detail")
    private int track_Detail;
    @JsonProperty("Transparency AA")
    private boolean transparency_AA;
    @JsonProperty("Transparency AA#")
    private String transparency_AA_;
    @JsonProperty("UI Background Animation")
    private int uI_Background_Animation;
    @JsonProperty("UI autonomous render thread")
    private boolean uI_autonomous_render_thread;
    @JsonProperty("UI autonomous render thread#")
    private String uI_autonomous_render_thread_;
    @JsonProperty("VR Enable Hidden Area Mask")
    private boolean vR_Enable_Hidden_Area_Mask;
    @JsonProperty("VR Enable Hidden Area Mask#")
    private String vR_Enable_Hidden_Area_Mask_;
    @JsonProperty("VR IPD Scale")
    private float vR_IPD_Scale;
    @JsonProperty("VR IPD Scale#")
    private String vR_IPD_Scale_;
    @JsonProperty("VR Projection Mode")
    private int vR_Projection_Mode;
    @JsonProperty("VR Projection Mode#")
    private String vR_Projection_Mode_;
    @JsonProperty("Vehicle Flow Offset")
    private float vehicle_Flow_Offset;
    @JsonProperty("Vehicle Flow Offset#")
    private String vehicle_Flow_Offset_;
    @JsonProperty("Vehicle Flow Radius")
    private int vehicle_Flow_Radius;
    @JsonProperty("Vehicle Flow Radius#")
    private String vehicle_Flow_Radius_;
    @JsonProperty("Verify Refs")
    private boolean verify_Refs;
    @JsonProperty("Verify Refs#")
    private String verify_Refs_;
    @JsonProperty("Vertical FOV Degrees")
    private int vertical_FOV_Degrees;
    @JsonProperty("Vertical FOV Degrees#")
    private String vertical_FOV_Degrees_;
    @JsonProperty("Virtual Rearview In Cockpit")
    private boolean virtual_Rearview_In_Cockpit;
    @JsonProperty("Virtual Rearview In Cockpit#")
    private String virtual_Rearview_In_Cockpit_;
    @JsonProperty("Warning Light Anim Speed")
    private int warning_Light_Anim_Speed;
    @JsonProperty("Warning Light Anim Speed#")
    private String warning_Light_Anim_Speed_;
    @JsonProperty("Widescreen Overlays")
    private boolean widescreen_Overlays;
    @JsonProperty("Wind and Crowd Motion")
    private boolean wind_and_Crowd_Motion;
    @JsonProperty("Wind and Crowd Motion#")
    private String wind_and_Crowd_Motion_;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public GraphicOptions() {
    }

    /**
     * @param auto_Detail_Framerate_
     * @param seat_Yaw
     * @param dynamic_Vertex_Buffers
     * @param rearview_Independent
     * @param transparency_AA_
     * @param seat_Adjustment_Up
     * @param right_Mirror_Horiz
     * @param seat_Adjustment_Aft
     * @param hUD_Tachometer
     * @param lCD_Display_Modes_
     * @param max_Framerate
     * @param rain_FX_Quality
     * @param lookahead_Angle_
     * @param rearview_Onboard_
     * @param texture_Detail
     * @param tire_Emitter_Flow_
     * @param garage_Detail_
     * @param player_Texture_Override
     * @param glance_Angle_
     * @param headlights_On_Cars_
     * @param automap
     * @param pitcrew_Detail_Level_
     * @param soft_Particles_
     * @param warning_Light_Anim_Speed_
     * @param rearview_Back_Clip_
     * @param texture_Filter_
     * @param rearview_Width
     * @param starting_View
     * @param center_Mirror_Horiz_
     * @param left_Mirror_Vert
     * @param backfire_Anim_Speed
     * @param enable_Legacy_HDR_Profiles_
     * @param look_Roll_Angle_
     * @param texture_Detail_
     * @param self_In_Rearview
     * @param allow_Letterboxing_
     * @param sun_Occlusion_
     * @param texture_Sharpening
     * @param look_Up_Down_Angle
     * @param car_Vibration_Mult2
     * @param car_Vibration_Mult1
     * @param vR_Projection_Mode_
     * @param center_Mirror_Vert
     * @param player_Detail_
     * @param display_Vehicle_Labels_
     * @param screenshot_Format
     * @param verify_Refs_
     * @param tire_Ground_Offset
     * @param sun_Occlusion
     * @param lightning_Probability_
     * @param rain_FX_Quality_
     * @param glance_Angle
     * @param starting_View_
     * @param exaggerate_Yaw_
     * @param headlights_On_Cars
     * @param enable_Legacy_HDR_Profiles
     * @param special_FX
     * @param left_Mirror_Horiz_
     * @param max_Headlights_
     * @param display_Vehicle_Labels
     * @param hUD_file
     * @param mIP_Mapping
     * @param stabilize_Horizon
     * @param texture_Sharpening_
     * @param right_Mirror_Horiz_
     * @param hUD_Component
     * @param smoke_Flow
     * @param gap_Check
     * @param rearview_Particles
     * @param center_Mirror_Horiz
     * @param rearview_Back_Clip
     * @param box_Outline_
     * @param extra_Visible_Vehicles_
     * @param max_Headlights
     * @param delay_Video_Swap
     * @param cockpit_Vibration_Freq2_
     * @param render_Once_Per_VSync
     * @param heat_FX_Fade_Speed_
     * @param always_Rebuild_Collision
     * @param lCD_Display_Modes
     * @param rearview_Height
     * @param environment_Reflections_
     * @param spark_Flow
     * @param seat_Yaw_
     * @param vR_IPD_Scale
     * @param overlay_Z_Bias_
     * @param widescreen_Overlays
     * @param wind_and_Crowd_Motion_
     * @param glance_Rate
     * @param stabilize_Horizon_
     * @param raindrop_Flow
     * @param cockpit_Vibration_Freq1_
     * @param max_Framerate_
     * @param vR_Enable_Hidden_Area_Mask
     * @param vertical_FOV_Degrees
     * @param seat_Adjustment_Aft_
     * @param rainspray_Flow
     * @param texture_Filter
     * @param full_Tire_Shader_
     * @param lightning_Probability
     * @param mirror_Adjustment_Vert
     * @param vehicle_Flow_Offset
     * @param left_Mirror_Horiz
     * @param rearview_Cull_
     * @param shadow_Blur
     * @param glance_Rate_
     * @param allow_HUD_in_cockpit
     * @param rearview_Front_Clip
     * @param delay_Video_Swap_
     * @param hUD
     * @param heat_FX_Fade_Speed
     * @param hUD_MFD
     * @param box_Outline
     * @param any_Camera_HUD
     * @param screenshot_Depth_Alpha
     * @param display_Icons
     * @param head_Physics
     * @param shadow_Blur_
     * @param screenshot_Depth_Alpha_
     * @param hUD_Race_Stats
     * @param any_Camera_HUD_
     * @param hUD_Component_Version
     * @param transparency_AA
     * @param rearview_Onboard
     * @param track_Detail
     * @param virtual_Rearview_In_Cockpit
     * @param synchronize_Frame
     * @param leanahead_Angle
     * @param center_Mirror_Size
     * @param uI_Background_Animation
     * @param seat_Pitch_
     * @param overlay_Height_Offset_
     * @param rearview_Width_
     * @param wind_and_Crowd_Motion
     * @param rearview_Driving
     * @param raindrop_Flow_
     * @param seat_Pitch
     * @param moving_Rearview
     * @param thunder_Probability_
     * @param vehicle_Flow_Radius_
     * @param shadows
     * @param rearview_Cull
     * @param rearview_Independent_
     * @param load_Opponent_Cockpits_
     * @param vehicle_Flow_Offset_
     * @param mirror_Physical_Z
     * @param logo_Seconds
     * @param mirror_Physical_Y
     * @param low_Detail_UI
     * @param mirror_Physical_X
     * @param special_FX_
     * @param mirror_Adjustment_Horiz_
     * @param car_Vibration_Mult1_
     * @param head_Rotation_
     * @param logo_Seconds_
     * @param right_Mirror_Size
     * @param warning_Light_Anim_Speed
     * @param mirror_Physical_X_
     * @param compressed_Textures
     * @param opponent_Texture_Override_
     * @param cockpit_Vibration_Mult1
     * @param overlay_Z_Bias
     * @param cockpit_Vibration_Mult2
     * @param self_In_Rearview_
     * @param vertical_FOV_Degrees_
     * @param mirror_Adjustment_Horiz
     * @param rearview_Swingman
     * @param head_Physics_
     * @param left_Mirror_Size
     * @param steady_Framerate_Thresh
     * @param moving_Rearview_
     * @param car_Vibration_Mult2_
     * @param full_Tire_Shader
     * @param mirror_Physical_Y_
     * @param player_Livery
     * @param vR_IPD_Scale_
     * @param steering_Wheel
     * @param uI_autonomous_render_thread
     * @param always_Rebuild_Collision_
     * @param automap_
     * @param environment_Reflections
     * @param rearview_Front_Clip_
     * @param steady_Framerate_Thresh_
     * @param right_Mirror_Vert
     * @param synchronize_Frame_
     * @param opponent_Texture_Override
     * @param shadows_
     * @param soft_Particles
     * @param vehicle_Flow_Radius
     * @param cockpit_Vibration_Freq1
     * @param cockpit_Vibration_Freq2
     * @param render_Once_Per_VSync_
     * @param steering_Wheel_
     * @param vR_Projection_Mode
     * @param look_Up_Down_Angle_
     * @param player_Texture_Override_
     * @param auto_Detail_Framerate
     * @param spark_Flow_
     * @param head_Rotation
     * @param extra_Visible_Vehicles
     * @param rearview_Driving_
     * @param player_Detail
     * @param pitcrew_Detail_Level
     * @param max_Visible_Vehicles
     * @param gap_Check_
     * @param real_Road_System_
     * @param leanahead_Angle_
     * @param allow_Letterboxing
     * @param seat_Roll
     * @param verify_Refs
     * @param real_Road_System
     * @param lSI_Top_
     * @param partial_Cockpit_View
     * @param partial_Cockpit_View_
     * @param virtual_Rearview_In_Cockpit_
     * @param groove
     * @param cockpit_Vibration_Mult1_
     * @param overlay_Height_Offset
     * @param screenshot_Format_
     * @param smoke_Flow_
     * @param lSI_Top
     * @param road_Reflections_
     * @param load_Opponent_Cockpits
     * @param tire_Emitter_Flow
     * @param dynamic_Vertex_Buffers_
     * @param garage_Detail
     * @param lookahead_Angle
     * @param broadcast_Overlay
     * @param exaggerate_Yaw
     * @param engine_Emitter_Flow
     * @param rainspray_Flow_
     * @param seat_Roll_
     * @param rearview_Swingman_
     * @param player_Livery_
     * @param uI_autonomous_render_thread_
     * @param opponent_Detail
     * @param cockpit_Vibration_Mult2_
     * @param engine_Emitter_Flow_
     * @param look_Roll_Angle
     * @param vR_Enable_Hidden_Area_Mask_
     * @param road_Reflections
     * @param thunder_Probability
     * @param tire_Ground_Offset_
     * @param display_Icons_
     */
    public GraphicOptions(boolean allow_HUD_in_cockpit, boolean allow_Letterboxing, String allow_Letterboxing_, boolean always_Rebuild_Collision, String always_Rebuild_Collision_, boolean any_Camera_HUD, String any_Camera_HUD_, int auto_Detail_Framerate, String auto_Detail_Framerate_, int automap, String automap_, int backfire_Anim_Speed, int box_Outline, String box_Outline_, int broadcast_Overlay, int car_Vibration_Mult1, String car_Vibration_Mult1_, int car_Vibration_Mult2, String car_Vibration_Mult2_, int center_Mirror_Horiz, String center_Mirror_Horiz_, int center_Mirror_Size, int center_Mirror_Vert, int cockpit_Vibration_Freq1, String cockpit_Vibration_Freq1_, int cockpit_Vibration_Freq2, String cockpit_Vibration_Freq2_, int cockpit_Vibration_Mult1, String cockpit_Vibration_Mult1_, int cockpit_Vibration_Mult2, String cockpit_Vibration_Mult2_, int compressed_Textures, boolean delay_Video_Swap, String delay_Video_Swap_, int display_Icons, String display_Icons_, int display_Vehicle_Labels, String display_Vehicle_Labels_, boolean dynamic_Vertex_Buffers, String dynamic_Vertex_Buffers_, boolean enable_Legacy_HDR_Profiles, String enable_Legacy_HDR_Profiles_, boolean engine_Emitter_Flow, String engine_Emitter_Flow_, int environment_Reflections, String environment_Reflections_, int exaggerate_Yaw, String exaggerate_Yaw_, int extra_Visible_Vehicles, String extra_Visible_Vehicles_, boolean full_Tire_Shader, String full_Tire_Shader_, int gap_Check, String gap_Check_, float garage_Detail, String garage_Detail_, float glance_Angle, String glance_Angle_, int glance_Rate, String glance_Rate_, int groove, int hUD, String hUD_Component, String hUD_Component_Version, int hUD_MFD, int hUD_Race_Stats, int hUD_Tachometer, String hUD_file, int head_Physics, String head_Physics_, int head_Rotation, String head_Rotation_, boolean headlights_On_Cars, String headlights_On_Cars_, int heat_FX_Fade_Speed, String heat_FX_Fade_Speed_, int lCD_Display_Modes, String lCD_Display_Modes_, float lSI_Top, String lSI_Top_, int leanahead_Angle, String leanahead_Angle_, int left_Mirror_Horiz, String left_Mirror_Horiz_, int left_Mirror_Size, int left_Mirror_Vert, int lightning_Probability, String lightning_Probability_, boolean load_Opponent_Cockpits, String load_Opponent_Cockpits_, int logo_Seconds, String logo_Seconds_, float look_Roll_Angle, String look_Roll_Angle_, float look_Up_Down_Angle, String look_Up_Down_Angle_, int lookahead_Angle, String lookahead_Angle_, int low_Detail_UI, int mIP_Mapping, int max_Framerate, String max_Framerate_, int max_Headlights, String max_Headlights_, int max_Visible_Vehicles, float mirror_Adjustment_Horiz, String mirror_Adjustment_Horiz_, float mirror_Adjustment_Vert, int mirror_Physical_X, String mirror_Physical_X_, int mirror_Physical_Y, String mirror_Physical_Y_, int mirror_Physical_Z, int moving_Rearview, String moving_Rearview_, int opponent_Detail, int opponent_Texture_Override, String opponent_Texture_Override_, float overlay_Height_Offset, String overlay_Height_Offset_, int overlay_Z_Bias, String overlay_Z_Bias_, int partial_Cockpit_View, String partial_Cockpit_View_, int pitcrew_Detail_Level, String pitcrew_Detail_Level_, int player_Detail, String player_Detail_, String player_Livery, String player_Livery_, int player_Texture_Override, String player_Texture_Override_, int rain_FX_Quality, String rain_FX_Quality_, int raindrop_Flow, String raindrop_Flow_, int rainspray_Flow, String rainspray_Flow_, boolean real_Road_System, String real_Road_System_, boolean rearview_Cull, String rearview_Cull_, int rearview_Driving, String rearview_Driving_, float rearview_Height, boolean rearview_Independent, String rearview_Independent_, int rearview_Onboard, String rearview_Onboard_, boolean rearview_Particles, int rearview_Swingman, String rearview_Swingman_, int rearview_Width, String rearview_Width_, int rearview_Back_Clip, String rearview_Back_Clip_, float rearview_Front_Clip, String rearview_Front_Clip_, int render_Once_Per_VSync, String render_Once_Per_VSync_, int right_Mirror_Horiz, String right_Mirror_Horiz_, int right_Mirror_Size, int right_Mirror_Vert, int road_Reflections, String road_Reflections_, boolean screenshot_Depth_Alpha, String screenshot_Depth_Alpha_, int screenshot_Format, String screenshot_Format_, int seat_Adjustment_Aft, String seat_Adjustment_Aft_, float seat_Adjustment_Up, int seat_Pitch, String seat_Pitch_, int seat_Roll, String seat_Roll_, int seat_Yaw, String seat_Yaw_, String self_In_Rearview, String self_In_Rearview_, int shadow_Blur, String shadow_Blur_, int shadows, String shadows_, boolean smoke_Flow, String smoke_Flow_, int soft_Particles, String soft_Particles_, int spark_Flow, String spark_Flow_, int special_FX, String special_FX_, int stabilize_Horizon, String stabilize_Horizon_, int starting_View, String starting_View_, int steady_Framerate_Thresh, String steady_Framerate_Thresh_, int steering_Wheel, String steering_Wheel_, boolean sun_Occlusion, String sun_Occlusion_, int synchronize_Frame, String synchronize_Frame_, int texture_Detail, String texture_Detail_, int texture_Filter, String texture_Filter_, int texture_Sharpening, String texture_Sharpening_, float thunder_Probability, String thunder_Probability_, boolean tire_Emitter_Flow, String tire_Emitter_Flow_, int tire_Ground_Offset, String tire_Ground_Offset_, int track_Detail, boolean transparency_AA, String transparency_AA_, int uI_Background_Animation, boolean uI_autonomous_render_thread, String uI_autonomous_render_thread_, boolean vR_Enable_Hidden_Area_Mask, String vR_Enable_Hidden_Area_Mask_, float vR_IPD_Scale, String vR_IPD_Scale_, int vR_Projection_Mode, String vR_Projection_Mode_, float vehicle_Flow_Offset, String vehicle_Flow_Offset_, int vehicle_Flow_Radius, String vehicle_Flow_Radius_, boolean verify_Refs, String verify_Refs_, int vertical_FOV_Degrees, String vertical_FOV_Degrees_, boolean virtual_Rearview_In_Cockpit, String virtual_Rearview_In_Cockpit_, int warning_Light_Anim_Speed, String warning_Light_Anim_Speed_, boolean widescreen_Overlays, boolean wind_and_Crowd_Motion, String wind_and_Crowd_Motion_) {
        super();
        this.allow_HUD_in_cockpit = allow_HUD_in_cockpit;
        this.allow_Letterboxing = allow_Letterboxing;
        this.allow_Letterboxing_ = allow_Letterboxing_;
        this.always_Rebuild_Collision = always_Rebuild_Collision;
        this.always_Rebuild_Collision_ = always_Rebuild_Collision_;
        this.any_Camera_HUD = any_Camera_HUD;
        this.any_Camera_HUD_ = any_Camera_HUD_;
        this.auto_Detail_Framerate = auto_Detail_Framerate;
        this.auto_Detail_Framerate_ = auto_Detail_Framerate_;
        this.automap = automap;
        this.automap_ = automap_;
        this.backfire_Anim_Speed = backfire_Anim_Speed;
        this.box_Outline = box_Outline;
        this.box_Outline_ = box_Outline_;
        this.broadcast_Overlay = broadcast_Overlay;
        this.car_Vibration_Mult1 = car_Vibration_Mult1;
        this.car_Vibration_Mult1_ = car_Vibration_Mult1_;
        this.car_Vibration_Mult2 = car_Vibration_Mult2;
        this.car_Vibration_Mult2_ = car_Vibration_Mult2_;
        this.center_Mirror_Horiz = center_Mirror_Horiz;
        this.center_Mirror_Horiz_ = center_Mirror_Horiz_;
        this.center_Mirror_Size = center_Mirror_Size;
        this.center_Mirror_Vert = center_Mirror_Vert;
        this.cockpit_Vibration_Freq1 = cockpit_Vibration_Freq1;
        this.cockpit_Vibration_Freq1_ = cockpit_Vibration_Freq1_;
        this.cockpit_Vibration_Freq2 = cockpit_Vibration_Freq2;
        this.cockpit_Vibration_Freq2_ = cockpit_Vibration_Freq2_;
        this.cockpit_Vibration_Mult1 = cockpit_Vibration_Mult1;
        this.cockpit_Vibration_Mult1_ = cockpit_Vibration_Mult1_;
        this.cockpit_Vibration_Mult2 = cockpit_Vibration_Mult2;
        this.cockpit_Vibration_Mult2_ = cockpit_Vibration_Mult2_;
        this.compressed_Textures = compressed_Textures;
        this.delay_Video_Swap = delay_Video_Swap;
        this.delay_Video_Swap_ = delay_Video_Swap_;
        this.display_Icons = display_Icons;
        this.display_Icons_ = display_Icons_;
        this.display_Vehicle_Labels = display_Vehicle_Labels;
        this.display_Vehicle_Labels_ = display_Vehicle_Labels_;
        this.dynamic_Vertex_Buffers = dynamic_Vertex_Buffers;
        this.dynamic_Vertex_Buffers_ = dynamic_Vertex_Buffers_;
        this.enable_Legacy_HDR_Profiles = enable_Legacy_HDR_Profiles;
        this.enable_Legacy_HDR_Profiles_ = enable_Legacy_HDR_Profiles_;
        this.engine_Emitter_Flow = engine_Emitter_Flow;
        this.engine_Emitter_Flow_ = engine_Emitter_Flow_;
        this.environment_Reflections = environment_Reflections;
        this.environment_Reflections_ = environment_Reflections_;
        this.exaggerate_Yaw = exaggerate_Yaw;
        this.exaggerate_Yaw_ = exaggerate_Yaw_;
        this.extra_Visible_Vehicles = extra_Visible_Vehicles;
        this.extra_Visible_Vehicles_ = extra_Visible_Vehicles_;
        this.full_Tire_Shader = full_Tire_Shader;
        this.full_Tire_Shader_ = full_Tire_Shader_;
        this.gap_Check = gap_Check;
        this.gap_Check_ = gap_Check_;
        this.garage_Detail = garage_Detail;
        this.garage_Detail_ = garage_Detail_;
        this.glance_Angle = glance_Angle;
        this.glance_Angle_ = glance_Angle_;
        this.glance_Rate = glance_Rate;
        this.glance_Rate_ = glance_Rate_;
        this.groove = groove;
        this.hUD = hUD;
        this.hUD_Component = hUD_Component;
        this.hUD_Component_Version = hUD_Component_Version;
        this.hUD_MFD = hUD_MFD;
        this.hUD_Race_Stats = hUD_Race_Stats;
        this.hUD_Tachometer = hUD_Tachometer;
        this.hUD_file = hUD_file;
        this.head_Physics = head_Physics;
        this.head_Physics_ = head_Physics_;
        this.head_Rotation = head_Rotation;
        this.head_Rotation_ = head_Rotation_;
        this.headlights_On_Cars = headlights_On_Cars;
        this.headlights_On_Cars_ = headlights_On_Cars_;
        this.heat_FX_Fade_Speed = heat_FX_Fade_Speed;
        this.heat_FX_Fade_Speed_ = heat_FX_Fade_Speed_;
        this.lCD_Display_Modes = lCD_Display_Modes;
        this.lCD_Display_Modes_ = lCD_Display_Modes_;
        this.lSI_Top = lSI_Top;
        this.lSI_Top_ = lSI_Top_;
        this.leanahead_Angle = leanahead_Angle;
        this.leanahead_Angle_ = leanahead_Angle_;
        this.left_Mirror_Horiz = left_Mirror_Horiz;
        this.left_Mirror_Horiz_ = left_Mirror_Horiz_;
        this.left_Mirror_Size = left_Mirror_Size;
        this.left_Mirror_Vert = left_Mirror_Vert;
        this.lightning_Probability = lightning_Probability;
        this.lightning_Probability_ = lightning_Probability_;
        this.load_Opponent_Cockpits = load_Opponent_Cockpits;
        this.load_Opponent_Cockpits_ = load_Opponent_Cockpits_;
        this.logo_Seconds = logo_Seconds;
        this.logo_Seconds_ = logo_Seconds_;
        this.look_Roll_Angle = look_Roll_Angle;
        this.look_Roll_Angle_ = look_Roll_Angle_;
        this.look_Up_Down_Angle = look_Up_Down_Angle;
        this.look_Up_Down_Angle_ = look_Up_Down_Angle_;
        this.lookahead_Angle = lookahead_Angle;
        this.lookahead_Angle_ = lookahead_Angle_;
        this.low_Detail_UI = low_Detail_UI;
        this.mIP_Mapping = mIP_Mapping;
        this.max_Framerate = max_Framerate;
        this.max_Framerate_ = max_Framerate_;
        this.max_Headlights = max_Headlights;
        this.max_Headlights_ = max_Headlights_;
        this.max_Visible_Vehicles = max_Visible_Vehicles;
        this.mirror_Adjustment_Horiz = mirror_Adjustment_Horiz;
        this.mirror_Adjustment_Horiz_ = mirror_Adjustment_Horiz_;
        this.mirror_Adjustment_Vert = mirror_Adjustment_Vert;
        this.mirror_Physical_X = mirror_Physical_X;
        this.mirror_Physical_X_ = mirror_Physical_X_;
        this.mirror_Physical_Y = mirror_Physical_Y;
        this.mirror_Physical_Y_ = mirror_Physical_Y_;
        this.mirror_Physical_Z = mirror_Physical_Z;
        this.moving_Rearview = moving_Rearview;
        this.moving_Rearview_ = moving_Rearview_;
        this.opponent_Detail = opponent_Detail;
        this.opponent_Texture_Override = opponent_Texture_Override;
        this.opponent_Texture_Override_ = opponent_Texture_Override_;
        this.overlay_Height_Offset = overlay_Height_Offset;
        this.overlay_Height_Offset_ = overlay_Height_Offset_;
        this.overlay_Z_Bias = overlay_Z_Bias;
        this.overlay_Z_Bias_ = overlay_Z_Bias_;
        this.partial_Cockpit_View = partial_Cockpit_View;
        this.partial_Cockpit_View_ = partial_Cockpit_View_;
        this.pitcrew_Detail_Level = pitcrew_Detail_Level;
        this.pitcrew_Detail_Level_ = pitcrew_Detail_Level_;
        this.player_Detail = player_Detail;
        this.player_Detail_ = player_Detail_;
        this.player_Livery = player_Livery;
        this.player_Livery_ = player_Livery_;
        this.player_Texture_Override = player_Texture_Override;
        this.player_Texture_Override_ = player_Texture_Override_;
        this.rain_FX_Quality = rain_FX_Quality;
        this.rain_FX_Quality_ = rain_FX_Quality_;
        this.raindrop_Flow = raindrop_Flow;
        this.raindrop_Flow_ = raindrop_Flow_;
        this.rainspray_Flow = rainspray_Flow;
        this.rainspray_Flow_ = rainspray_Flow_;
        this.real_Road_System = real_Road_System;
        this.real_Road_System_ = real_Road_System_;
        this.rearview_Cull = rearview_Cull;
        this.rearview_Cull_ = rearview_Cull_;
        this.rearview_Driving = rearview_Driving;
        this.rearview_Driving_ = rearview_Driving_;
        this.rearview_Height = rearview_Height;
        this.rearview_Independent = rearview_Independent;
        this.rearview_Independent_ = rearview_Independent_;
        this.rearview_Onboard = rearview_Onboard;
        this.rearview_Onboard_ = rearview_Onboard_;
        this.rearview_Particles = rearview_Particles;
        this.rearview_Swingman = rearview_Swingman;
        this.rearview_Swingman_ = rearview_Swingman_;
        this.rearview_Width = rearview_Width;
        this.rearview_Width_ = rearview_Width_;
        this.rearview_Back_Clip = rearview_Back_Clip;
        this.rearview_Back_Clip_ = rearview_Back_Clip_;
        this.rearview_Front_Clip = rearview_Front_Clip;
        this.rearview_Front_Clip_ = rearview_Front_Clip_;
        this.render_Once_Per_VSync = render_Once_Per_VSync;
        this.render_Once_Per_VSync_ = render_Once_Per_VSync_;
        this.right_Mirror_Horiz = right_Mirror_Horiz;
        this.right_Mirror_Horiz_ = right_Mirror_Horiz_;
        this.right_Mirror_Size = right_Mirror_Size;
        this.right_Mirror_Vert = right_Mirror_Vert;
        this.road_Reflections = road_Reflections;
        this.road_Reflections_ = road_Reflections_;
        this.screenshot_Depth_Alpha = screenshot_Depth_Alpha;
        this.screenshot_Depth_Alpha_ = screenshot_Depth_Alpha_;
        this.screenshot_Format = screenshot_Format;
        this.screenshot_Format_ = screenshot_Format_;
        this.seat_Adjustment_Aft = seat_Adjustment_Aft;
        this.seat_Adjustment_Aft_ = seat_Adjustment_Aft_;
        this.seat_Adjustment_Up = seat_Adjustment_Up;
        this.seat_Pitch = seat_Pitch;
        this.seat_Pitch_ = seat_Pitch_;
        this.seat_Roll = seat_Roll;
        this.seat_Roll_ = seat_Roll_;
        this.seat_Yaw = seat_Yaw;
        this.seat_Yaw_ = seat_Yaw_;
        this.self_In_Rearview = self_In_Rearview;
        this.self_In_Rearview_ = self_In_Rearview_;
        this.shadow_Blur = shadow_Blur;
        this.shadow_Blur_ = shadow_Blur_;
        this.shadows = shadows;
        this.shadows_ = shadows_;
        this.smoke_Flow = smoke_Flow;
        this.smoke_Flow_ = smoke_Flow_;
        this.soft_Particles = soft_Particles;
        this.soft_Particles_ = soft_Particles_;
        this.spark_Flow = spark_Flow;
        this.spark_Flow_ = spark_Flow_;
        this.special_FX = special_FX;
        this.special_FX_ = special_FX_;
        this.stabilize_Horizon = stabilize_Horizon;
        this.stabilize_Horizon_ = stabilize_Horizon_;
        this.starting_View = starting_View;
        this.starting_View_ = starting_View_;
        this.steady_Framerate_Thresh = steady_Framerate_Thresh;
        this.steady_Framerate_Thresh_ = steady_Framerate_Thresh_;
        this.steering_Wheel = steering_Wheel;
        this.steering_Wheel_ = steering_Wheel_;
        this.sun_Occlusion = sun_Occlusion;
        this.sun_Occlusion_ = sun_Occlusion_;
        this.synchronize_Frame = synchronize_Frame;
        this.synchronize_Frame_ = synchronize_Frame_;
        this.texture_Detail = texture_Detail;
        this.texture_Detail_ = texture_Detail_;
        this.texture_Filter = texture_Filter;
        this.texture_Filter_ = texture_Filter_;
        this.texture_Sharpening = texture_Sharpening;
        this.texture_Sharpening_ = texture_Sharpening_;
        this.thunder_Probability = thunder_Probability;
        this.thunder_Probability_ = thunder_Probability_;
        this.tire_Emitter_Flow = tire_Emitter_Flow;
        this.tire_Emitter_Flow_ = tire_Emitter_Flow_;
        this.tire_Ground_Offset = tire_Ground_Offset;
        this.tire_Ground_Offset_ = tire_Ground_Offset_;
        this.track_Detail = track_Detail;
        this.transparency_AA = transparency_AA;
        this.transparency_AA_ = transparency_AA_;
        this.uI_Background_Animation = uI_Background_Animation;
        this.uI_autonomous_render_thread = uI_autonomous_render_thread;
        this.uI_autonomous_render_thread_ = uI_autonomous_render_thread_;
        this.vR_Enable_Hidden_Area_Mask = vR_Enable_Hidden_Area_Mask;
        this.vR_Enable_Hidden_Area_Mask_ = vR_Enable_Hidden_Area_Mask_;
        this.vR_IPD_Scale = vR_IPD_Scale;
        this.vR_IPD_Scale_ = vR_IPD_Scale_;
        this.vR_Projection_Mode = vR_Projection_Mode;
        this.vR_Projection_Mode_ = vR_Projection_Mode_;
        this.vehicle_Flow_Offset = vehicle_Flow_Offset;
        this.vehicle_Flow_Offset_ = vehicle_Flow_Offset_;
        this.vehicle_Flow_Radius = vehicle_Flow_Radius;
        this.vehicle_Flow_Radius_ = vehicle_Flow_Radius_;
        this.verify_Refs = verify_Refs;
        this.verify_Refs_ = verify_Refs_;
        this.vertical_FOV_Degrees = vertical_FOV_Degrees;
        this.vertical_FOV_Degrees_ = vertical_FOV_Degrees_;
        this.virtual_Rearview_In_Cockpit = virtual_Rearview_In_Cockpit;
        this.virtual_Rearview_In_Cockpit_ = virtual_Rearview_In_Cockpit_;
        this.warning_Light_Anim_Speed = warning_Light_Anim_Speed;
        this.warning_Light_Anim_Speed_ = warning_Light_Anim_Speed_;
        this.widescreen_Overlays = widescreen_Overlays;
        this.wind_and_Crowd_Motion = wind_and_Crowd_Motion;
        this.wind_and_Crowd_Motion_ = wind_and_Crowd_Motion_;
    }

    @JsonProperty("Allow HUD in cockpit")
    public boolean isAllow_HUD_in_cockpit() {
        return allow_HUD_in_cockpit;
    }

    @JsonProperty("Allow HUD in cockpit")
    public void setAllow_HUD_in_cockpit(boolean allow_HUD_in_cockpit) {
        this.allow_HUD_in_cockpit = allow_HUD_in_cockpit;
    }

    @JsonProperty("Allow Letterboxing")
    public boolean isAllow_Letterboxing() {
        return allow_Letterboxing;
    }

    @JsonProperty("Allow Letterboxing")
    public void setAllow_Letterboxing(boolean allow_Letterboxing) {
        this.allow_Letterboxing = allow_Letterboxing;
    }

    @JsonProperty("Allow Letterboxing#")
    public String getAllow_Letterboxing_() {
        return allow_Letterboxing_;
    }

    @JsonProperty("Allow Letterboxing#")
    public void setAllow_Letterboxing_(String allow_Letterboxing_) {
        this.allow_Letterboxing_ = allow_Letterboxing_;
    }

    @JsonProperty("Always Rebuild Collision")
    public boolean isAlways_Rebuild_Collision() {
        return always_Rebuild_Collision;
    }

    @JsonProperty("Always Rebuild Collision")
    public void setAlways_Rebuild_Collision(boolean always_Rebuild_Collision) {
        this.always_Rebuild_Collision = always_Rebuild_Collision;
    }

    @JsonProperty("Always Rebuild Collision#")
    public String getAlways_Rebuild_Collision_() {
        return always_Rebuild_Collision_;
    }

    @JsonProperty("Always Rebuild Collision#")
    public void setAlways_Rebuild_Collision_(String always_Rebuild_Collision_) {
        this.always_Rebuild_Collision_ = always_Rebuild_Collision_;
    }

    @JsonProperty("Any Camera HUD")
    public boolean isAny_Camera_HUD() {
        return any_Camera_HUD;
    }

    @JsonProperty("Any Camera HUD")
    public void setAny_Camera_HUD(boolean any_Camera_HUD) {
        this.any_Camera_HUD = any_Camera_HUD;
    }

    @JsonProperty("Any Camera HUD#")
    public String getAny_Camera_HUD_() {
        return any_Camera_HUD_;
    }

    @JsonProperty("Any Camera HUD#")
    public void setAny_Camera_HUD_(String any_Camera_HUD_) {
        this.any_Camera_HUD_ = any_Camera_HUD_;
    }

    @JsonProperty("Auto Detail Framerate")
    public int getAuto_Detail_Framerate() {
        return auto_Detail_Framerate;
    }

    @JsonProperty("Auto Detail Framerate")
    public void setAuto_Detail_Framerate(int auto_Detail_Framerate) {
        this.auto_Detail_Framerate = auto_Detail_Framerate;
    }

    @JsonProperty("Auto Detail Framerate#")
    public String getAuto_Detail_Framerate_() {
        return auto_Detail_Framerate_;
    }

    @JsonProperty("Auto Detail Framerate#")
    public void setAuto_Detail_Framerate_(String auto_Detail_Framerate_) {
        this.auto_Detail_Framerate_ = auto_Detail_Framerate_;
    }

    @JsonProperty("Automap")
    public int getAutomap() {
        return automap;
    }

    @JsonProperty("Automap")
    public void setAutomap(int automap) {
        this.automap = automap;
    }

    @JsonProperty("Automap#")
    public String getAutomap_() {
        return automap_;
    }

    @JsonProperty("Automap#")
    public void setAutomap_(String automap_) {
        this.automap_ = automap_;
    }

    @JsonProperty("Backfire Anim Speed")
    public int getBackfire_Anim_Speed() {
        return backfire_Anim_Speed;
    }

    @JsonProperty("Backfire Anim Speed")
    public void setBackfire_Anim_Speed(int backfire_Anim_Speed) {
        this.backfire_Anim_Speed = backfire_Anim_Speed;
    }

    @JsonProperty("Box Outline")
    public int getBox_Outline() {
        return box_Outline;
    }

    @JsonProperty("Box Outline")
    public void setBox_Outline(int box_Outline) {
        this.box_Outline = box_Outline;
    }

    @JsonProperty("Box Outline#")
    public String getBox_Outline_() {
        return box_Outline_;
    }

    @JsonProperty("Box Outline#")
    public void setBox_Outline_(String box_Outline_) {
        this.box_Outline_ = box_Outline_;
    }

    @JsonProperty("Broadcast Overlay")
    public int getBroadcast_Overlay() {
        return broadcast_Overlay;
    }

    @JsonProperty("Broadcast Overlay")
    public void setBroadcast_Overlay(int broadcast_Overlay) {
        this.broadcast_Overlay = broadcast_Overlay;
    }

    @JsonProperty("Car Vibration Mult1")
    public int getCar_Vibration_Mult1() {
        return car_Vibration_Mult1;
    }

    @JsonProperty("Car Vibration Mult1")
    public void setCar_Vibration_Mult1(int car_Vibration_Mult1) {
        this.car_Vibration_Mult1 = car_Vibration_Mult1;
    }

    @JsonProperty("Car Vibration Mult1#")
    public String getCar_Vibration_Mult1_() {
        return car_Vibration_Mult1_;
    }

    @JsonProperty("Car Vibration Mult1#")
    public void setCar_Vibration_Mult1_(String car_Vibration_Mult1_) {
        this.car_Vibration_Mult1_ = car_Vibration_Mult1_;
    }

    @JsonProperty("Car Vibration Mult2")
    public int getCar_Vibration_Mult2() {
        return car_Vibration_Mult2;
    }

    @JsonProperty("Car Vibration Mult2")
    public void setCar_Vibration_Mult2(int car_Vibration_Mult2) {
        this.car_Vibration_Mult2 = car_Vibration_Mult2;
    }

    @JsonProperty("Car Vibration Mult2#")
    public String getCar_Vibration_Mult2_() {
        return car_Vibration_Mult2_;
    }

    @JsonProperty("Car Vibration Mult2#")
    public void setCar_Vibration_Mult2_(String car_Vibration_Mult2_) {
        this.car_Vibration_Mult2_ = car_Vibration_Mult2_;
    }

    @JsonProperty("Center Mirror Horiz")
    public int getCenter_Mirror_Horiz() {
        return center_Mirror_Horiz;
    }

    @JsonProperty("Center Mirror Horiz")
    public void setCenter_Mirror_Horiz(int center_Mirror_Horiz) {
        this.center_Mirror_Horiz = center_Mirror_Horiz;
    }

    @JsonProperty("Center Mirror Horiz#")
    public String getCenter_Mirror_Horiz_() {
        return center_Mirror_Horiz_;
    }

    @JsonProperty("Center Mirror Horiz#")
    public void setCenter_Mirror_Horiz_(String center_Mirror_Horiz_) {
        this.center_Mirror_Horiz_ = center_Mirror_Horiz_;
    }

    @JsonProperty("Center Mirror Size")
    public int getCenter_Mirror_Size() {
        return center_Mirror_Size;
    }

    @JsonProperty("Center Mirror Size")
    public void setCenter_Mirror_Size(int center_Mirror_Size) {
        this.center_Mirror_Size = center_Mirror_Size;
    }

    @JsonProperty("Center Mirror Vert")
    public int getCenter_Mirror_Vert() {
        return center_Mirror_Vert;
    }

    @JsonProperty("Center Mirror Vert")
    public void setCenter_Mirror_Vert(int center_Mirror_Vert) {
        this.center_Mirror_Vert = center_Mirror_Vert;
    }

    @JsonProperty("Cockpit Vibration Freq1")
    public int getCockpit_Vibration_Freq1() {
        return cockpit_Vibration_Freq1;
    }

    @JsonProperty("Cockpit Vibration Freq1")
    public void setCockpit_Vibration_Freq1(int cockpit_Vibration_Freq1) {
        this.cockpit_Vibration_Freq1 = cockpit_Vibration_Freq1;
    }

    @JsonProperty("Cockpit Vibration Freq1#")
    public String getCockpit_Vibration_Freq1_() {
        return cockpit_Vibration_Freq1_;
    }

    @JsonProperty("Cockpit Vibration Freq1#")
    public void setCockpit_Vibration_Freq1_(String cockpit_Vibration_Freq1_) {
        this.cockpit_Vibration_Freq1_ = cockpit_Vibration_Freq1_;
    }

    @JsonProperty("Cockpit Vibration Freq2")
    public int getCockpit_Vibration_Freq2() {
        return cockpit_Vibration_Freq2;
    }

    @JsonProperty("Cockpit Vibration Freq2")
    public void setCockpit_Vibration_Freq2(int cockpit_Vibration_Freq2) {
        this.cockpit_Vibration_Freq2 = cockpit_Vibration_Freq2;
    }

    @JsonProperty("Cockpit Vibration Freq2#")
    public String getCockpit_Vibration_Freq2_() {
        return cockpit_Vibration_Freq2_;
    }

    @JsonProperty("Cockpit Vibration Freq2#")
    public void setCockpit_Vibration_Freq2_(String cockpit_Vibration_Freq2_) {
        this.cockpit_Vibration_Freq2_ = cockpit_Vibration_Freq2_;
    }

    @JsonProperty("Cockpit Vibration Mult1")
    public int getCockpit_Vibration_Mult1() {
        return cockpit_Vibration_Mult1;
    }

    @JsonProperty("Cockpit Vibration Mult1")
    public void setCockpit_Vibration_Mult1(int cockpit_Vibration_Mult1) {
        this.cockpit_Vibration_Mult1 = cockpit_Vibration_Mult1;
    }

    @JsonProperty("Cockpit Vibration Mult1#")
    public String getCockpit_Vibration_Mult1_() {
        return cockpit_Vibration_Mult1_;
    }

    @JsonProperty("Cockpit Vibration Mult1#")
    public void setCockpit_Vibration_Mult1_(String cockpit_Vibration_Mult1_) {
        this.cockpit_Vibration_Mult1_ = cockpit_Vibration_Mult1_;
    }

    @JsonProperty("Cockpit Vibration Mult2")
    public int getCockpit_Vibration_Mult2() {
        return cockpit_Vibration_Mult2;
    }

    @JsonProperty("Cockpit Vibration Mult2")
    public void setCockpit_Vibration_Mult2(int cockpit_Vibration_Mult2) {
        this.cockpit_Vibration_Mult2 = cockpit_Vibration_Mult2;
    }

    @JsonProperty("Cockpit Vibration Mult2#")
    public String getCockpit_Vibration_Mult2_() {
        return cockpit_Vibration_Mult2_;
    }

    @JsonProperty("Cockpit Vibration Mult2#")
    public void setCockpit_Vibration_Mult2_(String cockpit_Vibration_Mult2_) {
        this.cockpit_Vibration_Mult2_ = cockpit_Vibration_Mult2_;
    }

    @JsonProperty("Compressed Textures")
    public int getCompressed_Textures() {
        return compressed_Textures;
    }

    @JsonProperty("Compressed Textures")
    public void setCompressed_Textures(int compressed_Textures) {
        this.compressed_Textures = compressed_Textures;
    }

    @JsonProperty("Delay Video Swap")
    public boolean isDelay_Video_Swap() {
        return delay_Video_Swap;
    }

    @JsonProperty("Delay Video Swap")
    public void setDelay_Video_Swap(boolean delay_Video_Swap) {
        this.delay_Video_Swap = delay_Video_Swap;
    }

    @JsonProperty("Delay Video Swap#")
    public String getDelay_Video_Swap_() {
        return delay_Video_Swap_;
    }

    @JsonProperty("Delay Video Swap#")
    public void setDelay_Video_Swap_(String delay_Video_Swap_) {
        this.delay_Video_Swap_ = delay_Video_Swap_;
    }

    @JsonProperty("Display Icons")
    public int getDisplay_Icons() {
        return display_Icons;
    }

    @JsonProperty("Display Icons")
    public void setDisplay_Icons(int display_Icons) {
        this.display_Icons = display_Icons;
    }

    @JsonProperty("Display Icons#")
    public String getDisplay_Icons_() {
        return display_Icons_;
    }

    @JsonProperty("Display Icons#")
    public void setDisplay_Icons_(String display_Icons_) {
        this.display_Icons_ = display_Icons_;
    }

    @JsonProperty("Display Vehicle Labels")
    public int getDisplay_Vehicle_Labels() {
        return display_Vehicle_Labels;
    }

    @JsonProperty("Display Vehicle Labels")
    public void setDisplay_Vehicle_Labels(int display_Vehicle_Labels) {
        this.display_Vehicle_Labels = display_Vehicle_Labels;
    }

    @JsonProperty("Display Vehicle Labels#")
    public String getDisplay_Vehicle_Labels_() {
        return display_Vehicle_Labels_;
    }

    @JsonProperty("Display Vehicle Labels#")
    public void setDisplay_Vehicle_Labels_(String display_Vehicle_Labels_) {
        this.display_Vehicle_Labels_ = display_Vehicle_Labels_;
    }

    @JsonProperty("Dynamic Vertex Buffers")
    public boolean isDynamic_Vertex_Buffers() {
        return dynamic_Vertex_Buffers;
    }

    @JsonProperty("Dynamic Vertex Buffers")
    public void setDynamic_Vertex_Buffers(boolean dynamic_Vertex_Buffers) {
        this.dynamic_Vertex_Buffers = dynamic_Vertex_Buffers;
    }

    @JsonProperty("Dynamic Vertex Buffers#")
    public String getDynamic_Vertex_Buffers_() {
        return dynamic_Vertex_Buffers_;
    }

    @JsonProperty("Dynamic Vertex Buffers#")
    public void setDynamic_Vertex_Buffers_(String dynamic_Vertex_Buffers_) {
        this.dynamic_Vertex_Buffers_ = dynamic_Vertex_Buffers_;
    }

    @JsonProperty("Enable Legacy HDR Profiles")
    public boolean isEnable_Legacy_HDR_Profiles() {
        return enable_Legacy_HDR_Profiles;
    }

    @JsonProperty("Enable Legacy HDR Profiles")
    public void setEnable_Legacy_HDR_Profiles(boolean enable_Legacy_HDR_Profiles) {
        this.enable_Legacy_HDR_Profiles = enable_Legacy_HDR_Profiles;
    }

    @JsonProperty("Enable Legacy HDR Profiles#")
    public String getEnable_Legacy_HDR_Profiles_() {
        return enable_Legacy_HDR_Profiles_;
    }

    @JsonProperty("Enable Legacy HDR Profiles#")
    public void setEnable_Legacy_HDR_Profiles_(String enable_Legacy_HDR_Profiles_) {
        this.enable_Legacy_HDR_Profiles_ = enable_Legacy_HDR_Profiles_;
    }

    @JsonProperty("Engine Emitter Flow")
    public boolean isEngine_Emitter_Flow() {
        return engine_Emitter_Flow;
    }

    @JsonProperty("Engine Emitter Flow")
    public void setEngine_Emitter_Flow(boolean engine_Emitter_Flow) {
        this.engine_Emitter_Flow = engine_Emitter_Flow;
    }

    @JsonProperty("Engine Emitter Flow#")
    public String getEngine_Emitter_Flow_() {
        return engine_Emitter_Flow_;
    }

    @JsonProperty("Engine Emitter Flow#")
    public void setEngine_Emitter_Flow_(String engine_Emitter_Flow_) {
        this.engine_Emitter_Flow_ = engine_Emitter_Flow_;
    }

    @JsonProperty("Environment Reflections")
    public int getEnvironment_Reflections() {
        return environment_Reflections;
    }

    @JsonProperty("Environment Reflections")
    public void setEnvironment_Reflections(int environment_Reflections) {
        this.environment_Reflections = environment_Reflections;
    }

    @JsonProperty("Environment Reflections#")
    public String getEnvironment_Reflections_() {
        return environment_Reflections_;
    }

    @JsonProperty("Environment Reflections#")
    public void setEnvironment_Reflections_(String environment_Reflections_) {
        this.environment_Reflections_ = environment_Reflections_;
    }

    @JsonProperty("Exaggerate Yaw")
    public int getExaggerate_Yaw() {
        return exaggerate_Yaw;
    }

    @JsonProperty("Exaggerate Yaw")
    public void setExaggerate_Yaw(int exaggerate_Yaw) {
        this.exaggerate_Yaw = exaggerate_Yaw;
    }

    @JsonProperty("Exaggerate Yaw#")
    public String getExaggerate_Yaw_() {
        return exaggerate_Yaw_;
    }

    @JsonProperty("Exaggerate Yaw#")
    public void setExaggerate_Yaw_(String exaggerate_Yaw_) {
        this.exaggerate_Yaw_ = exaggerate_Yaw_;
    }

    @JsonProperty("Extra Visible Vehicles")
    public int getExtra_Visible_Vehicles() {
        return extra_Visible_Vehicles;
    }

    @JsonProperty("Extra Visible Vehicles")
    public void setExtra_Visible_Vehicles(int extra_Visible_Vehicles) {
        this.extra_Visible_Vehicles = extra_Visible_Vehicles;
    }

    @JsonProperty("Extra Visible Vehicles#")
    public String getExtra_Visible_Vehicles_() {
        return extra_Visible_Vehicles_;
    }

    @JsonProperty("Extra Visible Vehicles#")
    public void setExtra_Visible_Vehicles_(String extra_Visible_Vehicles_) {
        this.extra_Visible_Vehicles_ = extra_Visible_Vehicles_;
    }

    @JsonProperty("Full Tire Shader")
    public boolean isFull_Tire_Shader() {
        return full_Tire_Shader;
    }

    @JsonProperty("Full Tire Shader")
    public void setFull_Tire_Shader(boolean full_Tire_Shader) {
        this.full_Tire_Shader = full_Tire_Shader;
    }

    @JsonProperty("Full Tire Shader#")
    public String getFull_Tire_Shader_() {
        return full_Tire_Shader_;
    }

    @JsonProperty("Full Tire Shader#")
    public void setFull_Tire_Shader_(String full_Tire_Shader_) {
        this.full_Tire_Shader_ = full_Tire_Shader_;
    }

    @JsonProperty("Gap Check")
    public int getGap_Check() {
        return gap_Check;
    }

    @JsonProperty("Gap Check")
    public void setGap_Check(int gap_Check) {
        this.gap_Check = gap_Check;
    }

    @JsonProperty("Gap Check#")
    public String getGap_Check_() {
        return gap_Check_;
    }

    @JsonProperty("Gap Check#")
    public void setGap_Check_(String gap_Check_) {
        this.gap_Check_ = gap_Check_;
    }

    @JsonProperty("Garage Detail")
    public float getGarage_Detail() {
        return garage_Detail;
    }

    @JsonProperty("Garage Detail")
    public void setGarage_Detail(float garage_Detail) {
        this.garage_Detail = garage_Detail;
    }

    @JsonProperty("Garage Detail#")
    public String getGarage_Detail_() {
        return garage_Detail_;
    }

    @JsonProperty("Garage Detail#")
    public void setGarage_Detail_(String garage_Detail_) {
        this.garage_Detail_ = garage_Detail_;
    }

    @JsonProperty("Glance Angle")
    public float getGlance_Angle() {
        return glance_Angle;
    }

    @JsonProperty("Glance Angle")
    public void setGlance_Angle(float glance_Angle) {
        this.glance_Angle = glance_Angle;
    }

    @JsonProperty("Glance Angle#")
    public String getGlance_Angle_() {
        return glance_Angle_;
    }

    @JsonProperty("Glance Angle#")
    public void setGlance_Angle_(String glance_Angle_) {
        this.glance_Angle_ = glance_Angle_;
    }

    @JsonProperty("Glance Rate")
    public int getGlance_Rate() {
        return glance_Rate;
    }

    @JsonProperty("Glance Rate")
    public void setGlance_Rate(int glance_Rate) {
        this.glance_Rate = glance_Rate;
    }

    @JsonProperty("Glance Rate#")
    public String getGlance_Rate_() {
        return glance_Rate_;
    }

    @JsonProperty("Glance Rate#")
    public void setGlance_Rate_(String glance_Rate_) {
        this.glance_Rate_ = glance_Rate_;
    }

    @JsonProperty("Groove")
    public int getGroove() {
        return groove;
    }

    @JsonProperty("Groove")
    public void setGroove(int groove) {
        this.groove = groove;
    }

    @JsonProperty("HUD")
    public int getHUD() {
        return hUD;
    }

    @JsonProperty("HUD")
    public void setHUD(int hUD) {
        this.hUD = hUD;
    }

    @JsonProperty("HUD Component")
    public String getHUD_Component() {
        return hUD_Component;
    }

    @JsonProperty("HUD Component")
    public void setHUD_Component(String hUD_Component) {
        this.hUD_Component = hUD_Component;
    }

    @JsonProperty("HUD Component Version")
    public String getHUD_Component_Version() {
        return hUD_Component_Version;
    }

    @JsonProperty("HUD Component Version")
    public void setHUD_Component_Version(String hUD_Component_Version) {
        this.hUD_Component_Version = hUD_Component_Version;
    }

    @JsonProperty("HUD MFD")
    public int getHUD_MFD() {
        return hUD_MFD;
    }

    @JsonProperty("HUD MFD")
    public void setHUD_MFD(int hUD_MFD) {
        this.hUD_MFD = hUD_MFD;
    }

    @JsonProperty("HUD Race Stats")
    public int getHUD_Race_Stats() {
        return hUD_Race_Stats;
    }

    @JsonProperty("HUD Race Stats")
    public void setHUD_Race_Stats(int hUD_Race_Stats) {
        this.hUD_Race_Stats = hUD_Race_Stats;
    }

    @JsonProperty("HUD Tachometer")
    public int getHUD_Tachometer() {
        return hUD_Tachometer;
    }

    @JsonProperty("HUD Tachometer")
    public void setHUD_Tachometer(int hUD_Tachometer) {
        this.hUD_Tachometer = hUD_Tachometer;
    }

    @JsonProperty("HUD file")
    public String getHUD_file() {
        return hUD_file;
    }

    @JsonProperty("HUD file")
    public void setHUD_file(String hUD_file) {
        this.hUD_file = hUD_file;
    }

    @JsonProperty("Head Physics")
    public int getHead_Physics() {
        return head_Physics;
    }

    @JsonProperty("Head Physics")
    public void setHead_Physics(int head_Physics) {
        this.head_Physics = head_Physics;
    }

    @JsonProperty("Head Physics#")
    public String getHead_Physics_() {
        return head_Physics_;
    }

    @JsonProperty("Head Physics#")
    public void setHead_Physics_(String head_Physics_) {
        this.head_Physics_ = head_Physics_;
    }

    @JsonProperty("Head Rotation")
    public int getHead_Rotation() {
        return head_Rotation;
    }

    @JsonProperty("Head Rotation")
    public void setHead_Rotation(int head_Rotation) {
        this.head_Rotation = head_Rotation;
    }

    @JsonProperty("Head Rotation#")
    public String getHead_Rotation_() {
        return head_Rotation_;
    }

    @JsonProperty("Head Rotation#")
    public void setHead_Rotation_(String head_Rotation_) {
        this.head_Rotation_ = head_Rotation_;
    }

    @JsonProperty("Headlights On Cars")
    public boolean isHeadlights_On_Cars() {
        return headlights_On_Cars;
    }

    @JsonProperty("Headlights On Cars")
    public void setHeadlights_On_Cars(boolean headlights_On_Cars) {
        this.headlights_On_Cars = headlights_On_Cars;
    }

    @JsonProperty("Headlights On Cars#")
    public String getHeadlights_On_Cars_() {
        return headlights_On_Cars_;
    }

    @JsonProperty("Headlights On Cars#")
    public void setHeadlights_On_Cars_(String headlights_On_Cars_) {
        this.headlights_On_Cars_ = headlights_On_Cars_;
    }

    @JsonProperty("Heat FX Fade Speed")
    public int getHeat_FX_Fade_Speed() {
        return heat_FX_Fade_Speed;
    }

    @JsonProperty("Heat FX Fade Speed")
    public void setHeat_FX_Fade_Speed(int heat_FX_Fade_Speed) {
        this.heat_FX_Fade_Speed = heat_FX_Fade_Speed;
    }

    @JsonProperty("Heat FX Fade Speed#")
    public String getHeat_FX_Fade_Speed_() {
        return heat_FX_Fade_Speed_;
    }

    @JsonProperty("Heat FX Fade Speed#")
    public void setHeat_FX_Fade_Speed_(String heat_FX_Fade_Speed_) {
        this.heat_FX_Fade_Speed_ = heat_FX_Fade_Speed_;
    }

    @JsonProperty("LCD Display Modes")
    public int getLCD_Display_Modes() {
        return lCD_Display_Modes;
    }

    @JsonProperty("LCD Display Modes")
    public void setLCD_Display_Modes(int lCD_Display_Modes) {
        this.lCD_Display_Modes = lCD_Display_Modes;
    }

    @JsonProperty("LCD Display Modes#")
    public String getLCD_Display_Modes_() {
        return lCD_Display_Modes_;
    }

    @JsonProperty("LCD Display Modes#")
    public void setLCD_Display_Modes_(String lCD_Display_Modes_) {
        this.lCD_Display_Modes_ = lCD_Display_Modes_;
    }

    @JsonProperty("LSI Top")
    public float getLSI_Top() {
        return lSI_Top;
    }

    @JsonProperty("LSI Top")
    public void setLSI_Top(float lSI_Top) {
        this.lSI_Top = lSI_Top;
    }

    @JsonProperty("LSI Top#")
    public String getLSI_Top_() {
        return lSI_Top_;
    }

    @JsonProperty("LSI Top#")
    public void setLSI_Top_(String lSI_Top_) {
        this.lSI_Top_ = lSI_Top_;
    }

    @JsonProperty("Leanahead Angle")
    public int getLeanahead_Angle() {
        return leanahead_Angle;
    }

    @JsonProperty("Leanahead Angle")
    public void setLeanahead_Angle(int leanahead_Angle) {
        this.leanahead_Angle = leanahead_Angle;
    }

    @JsonProperty("Leanahead Angle#")
    public String getLeanahead_Angle_() {
        return leanahead_Angle_;
    }

    @JsonProperty("Leanahead Angle#")
    public void setLeanahead_Angle_(String leanahead_Angle_) {
        this.leanahead_Angle_ = leanahead_Angle_;
    }

    @JsonProperty("Left Mirror Horiz")
    public int getLeft_Mirror_Horiz() {
        return left_Mirror_Horiz;
    }

    @JsonProperty("Left Mirror Horiz")
    public void setLeft_Mirror_Horiz(int left_Mirror_Horiz) {
        this.left_Mirror_Horiz = left_Mirror_Horiz;
    }

    @JsonProperty("Left Mirror Horiz#")
    public String getLeft_Mirror_Horiz_() {
        return left_Mirror_Horiz_;
    }

    @JsonProperty("Left Mirror Horiz#")
    public void setLeft_Mirror_Horiz_(String left_Mirror_Horiz_) {
        this.left_Mirror_Horiz_ = left_Mirror_Horiz_;
    }

    @JsonProperty("Left Mirror Size")
    public int getLeft_Mirror_Size() {
        return left_Mirror_Size;
    }

    @JsonProperty("Left Mirror Size")
    public void setLeft_Mirror_Size(int left_Mirror_Size) {
        this.left_Mirror_Size = left_Mirror_Size;
    }

    @JsonProperty("Left Mirror Vert")
    public int getLeft_Mirror_Vert() {
        return left_Mirror_Vert;
    }

    @JsonProperty("Left Mirror Vert")
    public void setLeft_Mirror_Vert(int left_Mirror_Vert) {
        this.left_Mirror_Vert = left_Mirror_Vert;
    }

    @JsonProperty("Lightning Probability")
    public int getLightning_Probability() {
        return lightning_Probability;
    }

    @JsonProperty("Lightning Probability")
    public void setLightning_Probability(int lightning_Probability) {
        this.lightning_Probability = lightning_Probability;
    }

    @JsonProperty("Lightning Probability#")
    public String getLightning_Probability_() {
        return lightning_Probability_;
    }

    @JsonProperty("Lightning Probability#")
    public void setLightning_Probability_(String lightning_Probability_) {
        this.lightning_Probability_ = lightning_Probability_;
    }

    @JsonProperty("Load Opponent Cockpits")
    public boolean isLoad_Opponent_Cockpits() {
        return load_Opponent_Cockpits;
    }

    @JsonProperty("Load Opponent Cockpits")
    public void setLoad_Opponent_Cockpits(boolean load_Opponent_Cockpits) {
        this.load_Opponent_Cockpits = load_Opponent_Cockpits;
    }

    @JsonProperty("Load Opponent Cockpits#")
    public String getLoad_Opponent_Cockpits_() {
        return load_Opponent_Cockpits_;
    }

    @JsonProperty("Load Opponent Cockpits#")
    public void setLoad_Opponent_Cockpits_(String load_Opponent_Cockpits_) {
        this.load_Opponent_Cockpits_ = load_Opponent_Cockpits_;
    }

    @JsonProperty("Logo Seconds")
    public int getLogo_Seconds() {
        return logo_Seconds;
    }

    @JsonProperty("Logo Seconds")
    public void setLogo_Seconds(int logo_Seconds) {
        this.logo_Seconds = logo_Seconds;
    }

    @JsonProperty("Logo Seconds#")
    public String getLogo_Seconds_() {
        return logo_Seconds_;
    }

    @JsonProperty("Logo Seconds#")
    public void setLogo_Seconds_(String logo_Seconds_) {
        this.logo_Seconds_ = logo_Seconds_;
    }

    @JsonProperty("Look Roll Angle")
    public float getLook_Roll_Angle() {
        return look_Roll_Angle;
    }

    @JsonProperty("Look Roll Angle")
    public void setLook_Roll_Angle(float look_Roll_Angle) {
        this.look_Roll_Angle = look_Roll_Angle;
    }

    @JsonProperty("Look Roll Angle#")
    public String getLook_Roll_Angle_() {
        return look_Roll_Angle_;
    }

    @JsonProperty("Look Roll Angle#")
    public void setLook_Roll_Angle_(String look_Roll_Angle_) {
        this.look_Roll_Angle_ = look_Roll_Angle_;
    }

    @JsonProperty("Look Up/Down Angle")
    public float getLook_Up_Down_Angle() {
        return look_Up_Down_Angle;
    }

    @JsonProperty("Look Up/Down Angle")
    public void setLook_Up_Down_Angle(float look_Up_Down_Angle) {
        this.look_Up_Down_Angle = look_Up_Down_Angle;
    }

    @JsonProperty("Look Up/Down Angle#")
    public String getLook_Up_Down_Angle_() {
        return look_Up_Down_Angle_;
    }

    @JsonProperty("Look Up/Down Angle#")
    public void setLook_Up_Down_Angle_(String look_Up_Down_Angle_) {
        this.look_Up_Down_Angle_ = look_Up_Down_Angle_;
    }

    @JsonProperty("Lookahead Angle")
    public int getLookahead_Angle() {
        return lookahead_Angle;
    }

    @JsonProperty("Lookahead Angle")
    public void setLookahead_Angle(int lookahead_Angle) {
        this.lookahead_Angle = lookahead_Angle;
    }

    @JsonProperty("Lookahead Angle#")
    public String getLookahead_Angle_() {
        return lookahead_Angle_;
    }

    @JsonProperty("Lookahead Angle#")
    public void setLookahead_Angle_(String lookahead_Angle_) {
        this.lookahead_Angle_ = lookahead_Angle_;
    }

    @JsonProperty("Low Detail UI")
    public int getLow_Detail_UI() {
        return low_Detail_UI;
    }

    @JsonProperty("Low Detail UI")
    public void setLow_Detail_UI(int low_Detail_UI) {
        this.low_Detail_UI = low_Detail_UI;
    }

    @JsonProperty("MIP Mapping")
    public int getMIP_Mapping() {
        return mIP_Mapping;
    }

    @JsonProperty("MIP Mapping")
    public void setMIP_Mapping(int mIP_Mapping) {
        this.mIP_Mapping = mIP_Mapping;
    }

    @JsonProperty("Max Framerate")
    public int getMax_Framerate() {
        return max_Framerate;
    }

    @JsonProperty("Max Framerate")
    public void setMax_Framerate(int max_Framerate) {
        this.max_Framerate = max_Framerate;
    }

    @JsonProperty("Max Framerate#")
    public String getMax_Framerate_() {
        return max_Framerate_;
    }

    @JsonProperty("Max Framerate#")
    public void setMax_Framerate_(String max_Framerate_) {
        this.max_Framerate_ = max_Framerate_;
    }

    @JsonProperty("Max Headlights")
    public int getMax_Headlights() {
        return max_Headlights;
    }

    @JsonProperty("Max Headlights")
    public void setMax_Headlights(int max_Headlights) {
        this.max_Headlights = max_Headlights;
    }

    @JsonProperty("Max Headlights#")
    public String getMax_Headlights_() {
        return max_Headlights_;
    }

    @JsonProperty("Max Headlights#")
    public void setMax_Headlights_(String max_Headlights_) {
        this.max_Headlights_ = max_Headlights_;
    }

    @JsonProperty("Max Visible Vehicles")
    public int getMax_Visible_Vehicles() {
        return max_Visible_Vehicles;
    }

    @JsonProperty("Max Visible Vehicles")
    public void setMax_Visible_Vehicles(int max_Visible_Vehicles) {
        this.max_Visible_Vehicles = max_Visible_Vehicles;
    }

    @JsonProperty("Mirror Adjustment Horiz")
    public float getMirror_Adjustment_Horiz() {
        return mirror_Adjustment_Horiz;
    }

    @JsonProperty("Mirror Adjustment Horiz")
    public void setMirror_Adjustment_Horiz(float mirror_Adjustment_Horiz) {
        this.mirror_Adjustment_Horiz = mirror_Adjustment_Horiz;
    }

    @JsonProperty("Mirror Adjustment Horiz#")
    public String getMirror_Adjustment_Horiz_() {
        return mirror_Adjustment_Horiz_;
    }

    @JsonProperty("Mirror Adjustment Horiz#")
    public void setMirror_Adjustment_Horiz_(String mirror_Adjustment_Horiz_) {
        this.mirror_Adjustment_Horiz_ = mirror_Adjustment_Horiz_;
    }

    @JsonProperty("Mirror Adjustment Vert")
    public float getMirror_Adjustment_Vert() {
        return mirror_Adjustment_Vert;
    }

    @JsonProperty("Mirror Adjustment Vert")
    public void setMirror_Adjustment_Vert(float mirror_Adjustment_Vert) {
        this.mirror_Adjustment_Vert = mirror_Adjustment_Vert;
    }

    @JsonProperty("Mirror Physical X")
    public int getMirror_Physical_X() {
        return mirror_Physical_X;
    }

    @JsonProperty("Mirror Physical X")
    public void setMirror_Physical_X(int mirror_Physical_X) {
        this.mirror_Physical_X = mirror_Physical_X;
    }

    @JsonProperty("Mirror Physical X#")
    public String getMirror_Physical_X_() {
        return mirror_Physical_X_;
    }

    @JsonProperty("Mirror Physical X#")
    public void setMirror_Physical_X_(String mirror_Physical_X_) {
        this.mirror_Physical_X_ = mirror_Physical_X_;
    }

    @JsonProperty("Mirror Physical Y")
    public int getMirror_Physical_Y() {
        return mirror_Physical_Y;
    }

    @JsonProperty("Mirror Physical Y")
    public void setMirror_Physical_Y(int mirror_Physical_Y) {
        this.mirror_Physical_Y = mirror_Physical_Y;
    }

    @JsonProperty("Mirror Physical Y#")
    public String getMirror_Physical_Y_() {
        return mirror_Physical_Y_;
    }

    @JsonProperty("Mirror Physical Y#")
    public void setMirror_Physical_Y_(String mirror_Physical_Y_) {
        this.mirror_Physical_Y_ = mirror_Physical_Y_;
    }

    @JsonProperty("Mirror Physical Z")
    public int getMirror_Physical_Z() {
        return mirror_Physical_Z;
    }

    @JsonProperty("Mirror Physical Z")
    public void setMirror_Physical_Z(int mirror_Physical_Z) {
        this.mirror_Physical_Z = mirror_Physical_Z;
    }

    @JsonProperty("Moving Rearview")
    public int getMoving_Rearview() {
        return moving_Rearview;
    }

    @JsonProperty("Moving Rearview")
    public void setMoving_Rearview(int moving_Rearview) {
        this.moving_Rearview = moving_Rearview;
    }

    @JsonProperty("Moving Rearview#")
    public String getMoving_Rearview_() {
        return moving_Rearview_;
    }

    @JsonProperty("Moving Rearview#")
    public void setMoving_Rearview_(String moving_Rearview_) {
        this.moving_Rearview_ = moving_Rearview_;
    }

    @JsonProperty("Opponent Detail")
    public int getOpponent_Detail() {
        return opponent_Detail;
    }

    @JsonProperty("Opponent Detail")
    public void setOpponent_Detail(int opponent_Detail) {
        this.opponent_Detail = opponent_Detail;
    }

    @JsonProperty("Opponent Texture Override")
    public int getOpponent_Texture_Override() {
        return opponent_Texture_Override;
    }

    @JsonProperty("Opponent Texture Override")
    public void setOpponent_Texture_Override(int opponent_Texture_Override) {
        this.opponent_Texture_Override = opponent_Texture_Override;
    }

    @JsonProperty("Opponent Texture Override#")
    public String getOpponent_Texture_Override_() {
        return opponent_Texture_Override_;
    }

    @JsonProperty("Opponent Texture Override#")
    public void setOpponent_Texture_Override_(String opponent_Texture_Override_) {
        this.opponent_Texture_Override_ = opponent_Texture_Override_;
    }

    @JsonProperty("Overlay Height Offset")
    public float getOverlay_Height_Offset() {
        return overlay_Height_Offset;
    }

    @JsonProperty("Overlay Height Offset")
    public void setOverlay_Height_Offset(float overlay_Height_Offset) {
        this.overlay_Height_Offset = overlay_Height_Offset;
    }

    @JsonProperty("Overlay Height Offset#")
    public String getOverlay_Height_Offset_() {
        return overlay_Height_Offset_;
    }

    @JsonProperty("Overlay Height Offset#")
    public void setOverlay_Height_Offset_(String overlay_Height_Offset_) {
        this.overlay_Height_Offset_ = overlay_Height_Offset_;
    }

    @JsonProperty("Overlay Z Bias")
    public int getOverlay_Z_Bias() {
        return overlay_Z_Bias;
    }

    @JsonProperty("Overlay Z Bias")
    public void setOverlay_Z_Bias(int overlay_Z_Bias) {
        this.overlay_Z_Bias = overlay_Z_Bias;
    }

    @JsonProperty("Overlay Z Bias#")
    public String getOverlay_Z_Bias_() {
        return overlay_Z_Bias_;
    }

    @JsonProperty("Overlay Z Bias#")
    public void setOverlay_Z_Bias_(String overlay_Z_Bias_) {
        this.overlay_Z_Bias_ = overlay_Z_Bias_;
    }

    @JsonProperty("Partial Cockpit View")
    public int getPartial_Cockpit_View() {
        return partial_Cockpit_View;
    }

    @JsonProperty("Partial Cockpit View")
    public void setPartial_Cockpit_View(int partial_Cockpit_View) {
        this.partial_Cockpit_View = partial_Cockpit_View;
    }

    @JsonProperty("Partial Cockpit View#")
    public String getPartial_Cockpit_View_() {
        return partial_Cockpit_View_;
    }

    @JsonProperty("Partial Cockpit View#")
    public void setPartial_Cockpit_View_(String partial_Cockpit_View_) {
        this.partial_Cockpit_View_ = partial_Cockpit_View_;
    }

    @JsonProperty("Pitcrew Detail Level")
    public int getPitcrew_Detail_Level() {
        return pitcrew_Detail_Level;
    }

    @JsonProperty("Pitcrew Detail Level")
    public void setPitcrew_Detail_Level(int pitcrew_Detail_Level) {
        this.pitcrew_Detail_Level = pitcrew_Detail_Level;
    }

    @JsonProperty("Pitcrew Detail Level#")
    public String getPitcrew_Detail_Level_() {
        return pitcrew_Detail_Level_;
    }

    @JsonProperty("Pitcrew Detail Level#")
    public void setPitcrew_Detail_Level_(String pitcrew_Detail_Level_) {
        this.pitcrew_Detail_Level_ = pitcrew_Detail_Level_;
    }

    @JsonProperty("Player Detail")
    public int getPlayer_Detail() {
        return player_Detail;
    }

    @JsonProperty("Player Detail")
    public void setPlayer_Detail(int player_Detail) {
        this.player_Detail = player_Detail;
    }

    @JsonProperty("Player Detail#")
    public String getPlayer_Detail_() {
        return player_Detail_;
    }

    @JsonProperty("Player Detail#")
    public void setPlayer_Detail_(String player_Detail_) {
        this.player_Detail_ = player_Detail_;
    }

    @JsonProperty("Player Livery")
    public String getPlayer_Livery() {
        return player_Livery;
    }

    @JsonProperty("Player Livery")
    public void setPlayer_Livery(String player_Livery) {
        this.player_Livery = player_Livery;
    }

    @JsonProperty("Player Livery#")
    public String getPlayer_Livery_() {
        return player_Livery_;
    }

    @JsonProperty("Player Livery#")
    public void setPlayer_Livery_(String player_Livery_) {
        this.player_Livery_ = player_Livery_;
    }

    @JsonProperty("Player Texture Override")
    public int getPlayer_Texture_Override() {
        return player_Texture_Override;
    }

    @JsonProperty("Player Texture Override")
    public void setPlayer_Texture_Override(int player_Texture_Override) {
        this.player_Texture_Override = player_Texture_Override;
    }

    @JsonProperty("Player Texture Override#")
    public String getPlayer_Texture_Override_() {
        return player_Texture_Override_;
    }

    @JsonProperty("Player Texture Override#")
    public void setPlayer_Texture_Override_(String player_Texture_Override_) {
        this.player_Texture_Override_ = player_Texture_Override_;
    }

    @JsonProperty("Rain FX Quality")
    public int getRain_FX_Quality() {
        return rain_FX_Quality;
    }

    @JsonProperty("Rain FX Quality")
    public void setRain_FX_Quality(int rain_FX_Quality) {
        this.rain_FX_Quality = rain_FX_Quality;
    }

    @JsonProperty("Rain FX Quality#")
    public String getRain_FX_Quality_() {
        return rain_FX_Quality_;
    }

    @JsonProperty("Rain FX Quality#")
    public void setRain_FX_Quality_(String rain_FX_Quality_) {
        this.rain_FX_Quality_ = rain_FX_Quality_;
    }

    @JsonProperty("Raindrop Flow")
    public int getRaindrop_Flow() {
        return raindrop_Flow;
    }

    @JsonProperty("Raindrop Flow")
    public void setRaindrop_Flow(int raindrop_Flow) {
        this.raindrop_Flow = raindrop_Flow;
    }

    @JsonProperty("Raindrop Flow#")
    public String getRaindrop_Flow_() {
        return raindrop_Flow_;
    }

    @JsonProperty("Raindrop Flow#")
    public void setRaindrop_Flow_(String raindrop_Flow_) {
        this.raindrop_Flow_ = raindrop_Flow_;
    }

    @JsonProperty("Rainspray Flow")
    public int getRainspray_Flow() {
        return rainspray_Flow;
    }

    @JsonProperty("Rainspray Flow")
    public void setRainspray_Flow(int rainspray_Flow) {
        this.rainspray_Flow = rainspray_Flow;
    }

    @JsonProperty("Rainspray Flow#")
    public String getRainspray_Flow_() {
        return rainspray_Flow_;
    }

    @JsonProperty("Rainspray Flow#")
    public void setRainspray_Flow_(String rainspray_Flow_) {
        this.rainspray_Flow_ = rainspray_Flow_;
    }

    @JsonProperty("Real Road System")
    public boolean isReal_Road_System() {
        return real_Road_System;
    }

    @JsonProperty("Real Road System")
    public void setReal_Road_System(boolean real_Road_System) {
        this.real_Road_System = real_Road_System;
    }

    @JsonProperty("Real Road System#")
    public String getReal_Road_System_() {
        return real_Road_System_;
    }

    @JsonProperty("Real Road System#")
    public void setReal_Road_System_(String real_Road_System_) {
        this.real_Road_System_ = real_Road_System_;
    }

    @JsonProperty("Rearview Cull")
    public boolean isRearview_Cull() {
        return rearview_Cull;
    }

    @JsonProperty("Rearview Cull")
    public void setRearview_Cull(boolean rearview_Cull) {
        this.rearview_Cull = rearview_Cull;
    }

    @JsonProperty("Rearview Cull#")
    public String getRearview_Cull_() {
        return rearview_Cull_;
    }

    @JsonProperty("Rearview Cull#")
    public void setRearview_Cull_(String rearview_Cull_) {
        this.rearview_Cull_ = rearview_Cull_;
    }

    @JsonProperty("Rearview Driving")
    public int getRearview_Driving() {
        return rearview_Driving;
    }

    @JsonProperty("Rearview Driving")
    public void setRearview_Driving(int rearview_Driving) {
        this.rearview_Driving = rearview_Driving;
    }

    @JsonProperty("Rearview Driving#")
    public String getRearview_Driving_() {
        return rearview_Driving_;
    }

    @JsonProperty("Rearview Driving#")
    public void setRearview_Driving_(String rearview_Driving_) {
        this.rearview_Driving_ = rearview_Driving_;
    }

    @JsonProperty("Rearview Height")
    public float getRearview_Height() {
        return rearview_Height;
    }

    @JsonProperty("Rearview Height")
    public void setRearview_Height(float rearview_Height) {
        this.rearview_Height = rearview_Height;
    }

    @JsonProperty("Rearview Independent")
    public boolean isRearview_Independent() {
        return rearview_Independent;
    }

    @JsonProperty("Rearview Independent")
    public void setRearview_Independent(boolean rearview_Independent) {
        this.rearview_Independent = rearview_Independent;
    }

    @JsonProperty("Rearview Independent#")
    public String getRearview_Independent_() {
        return rearview_Independent_;
    }

    @JsonProperty("Rearview Independent#")
    public void setRearview_Independent_(String rearview_Independent_) {
        this.rearview_Independent_ = rearview_Independent_;
    }

    @JsonProperty("Rearview Onboard")
    public int getRearview_Onboard() {
        return rearview_Onboard;
    }

    @JsonProperty("Rearview Onboard")
    public void setRearview_Onboard(int rearview_Onboard) {
        this.rearview_Onboard = rearview_Onboard;
    }

    @JsonProperty("Rearview Onboard#")
    public String getRearview_Onboard_() {
        return rearview_Onboard_;
    }

    @JsonProperty("Rearview Onboard#")
    public void setRearview_Onboard_(String rearview_Onboard_) {
        this.rearview_Onboard_ = rearview_Onboard_;
    }

    @JsonProperty("Rearview Particles")
    public boolean isRearview_Particles() {
        return rearview_Particles;
    }

    @JsonProperty("Rearview Particles")
    public void setRearview_Particles(boolean rearview_Particles) {
        this.rearview_Particles = rearview_Particles;
    }

    @JsonProperty("Rearview Swingman")
    public int getRearview_Swingman() {
        return rearview_Swingman;
    }

    @JsonProperty("Rearview Swingman")
    public void setRearview_Swingman(int rearview_Swingman) {
        this.rearview_Swingman = rearview_Swingman;
    }

    @JsonProperty("Rearview Swingman#")
    public String getRearview_Swingman_() {
        return rearview_Swingman_;
    }

    @JsonProperty("Rearview Swingman#")
    public void setRearview_Swingman_(String rearview_Swingman_) {
        this.rearview_Swingman_ = rearview_Swingman_;
    }

    @JsonProperty("Rearview Width")
    public int getRearview_Width() {
        return rearview_Width;
    }

    @JsonProperty("Rearview Width")
    public void setRearview_Width(int rearview_Width) {
        this.rearview_Width = rearview_Width;
    }

    @JsonProperty("Rearview Width#")
    public String getRearview_Width_() {
        return rearview_Width_;
    }

    @JsonProperty("Rearview Width#")
    public void setRearview_Width_(String rearview_Width_) {
        this.rearview_Width_ = rearview_Width_;
    }

    @JsonProperty("Rearview_Back_Clip")
    public int getRearview_Back_Clip() {
        return rearview_Back_Clip;
    }

    @JsonProperty("Rearview_Back_Clip")
    public void setRearview_Back_Clip(int rearview_Back_Clip) {
        this.rearview_Back_Clip = rearview_Back_Clip;
    }

    @JsonProperty("Rearview_Back_Clip#")
    public String getRearview_Back_Clip_() {
        return rearview_Back_Clip_;
    }

    @JsonProperty("Rearview_Back_Clip#")
    public void setRearview_Back_Clip_(String rearview_Back_Clip_) {
        this.rearview_Back_Clip_ = rearview_Back_Clip_;
    }

    @JsonProperty("Rearview_Front_Clip")
    public float getRearview_Front_Clip() {
        return rearview_Front_Clip;
    }

    @JsonProperty("Rearview_Front_Clip")
    public void setRearview_Front_Clip(float rearview_Front_Clip) {
        this.rearview_Front_Clip = rearview_Front_Clip;
    }

    @JsonProperty("Rearview_Front_Clip#")
    public String getRearview_Front_Clip_() {
        return rearview_Front_Clip_;
    }

    @JsonProperty("Rearview_Front_Clip#")
    public void setRearview_Front_Clip_(String rearview_Front_Clip_) {
        this.rearview_Front_Clip_ = rearview_Front_Clip_;
    }

    @JsonProperty("Render Once Per VSync")
    public int getRender_Once_Per_VSync() {
        return render_Once_Per_VSync;
    }

    @JsonProperty("Render Once Per VSync")
    public void setRender_Once_Per_VSync(int render_Once_Per_VSync) {
        this.render_Once_Per_VSync = render_Once_Per_VSync;
    }

    @JsonProperty("Render Once Per VSync#")
    public String getRender_Once_Per_VSync_() {
        return render_Once_Per_VSync_;
    }

    @JsonProperty("Render Once Per VSync#")
    public void setRender_Once_Per_VSync_(String render_Once_Per_VSync_) {
        this.render_Once_Per_VSync_ = render_Once_Per_VSync_;
    }

    @JsonProperty("Right Mirror Horiz")
    public int getRight_Mirror_Horiz() {
        return right_Mirror_Horiz;
    }

    @JsonProperty("Right Mirror Horiz")
    public void setRight_Mirror_Horiz(int right_Mirror_Horiz) {
        this.right_Mirror_Horiz = right_Mirror_Horiz;
    }

    @JsonProperty("Right Mirror Horiz#")
    public String getRight_Mirror_Horiz_() {
        return right_Mirror_Horiz_;
    }

    @JsonProperty("Right Mirror Horiz#")
    public void setRight_Mirror_Horiz_(String right_Mirror_Horiz_) {
        this.right_Mirror_Horiz_ = right_Mirror_Horiz_;
    }

    @JsonProperty("Right Mirror Size")
    public int getRight_Mirror_Size() {
        return right_Mirror_Size;
    }

    @JsonProperty("Right Mirror Size")
    public void setRight_Mirror_Size(int right_Mirror_Size) {
        this.right_Mirror_Size = right_Mirror_Size;
    }

    @JsonProperty("Right Mirror Vert")
    public int getRight_Mirror_Vert() {
        return right_Mirror_Vert;
    }

    @JsonProperty("Right Mirror Vert")
    public void setRight_Mirror_Vert(int right_Mirror_Vert) {
        this.right_Mirror_Vert = right_Mirror_Vert;
    }

    @JsonProperty("Road Reflections")
    public int getRoad_Reflections() {
        return road_Reflections;
    }

    @JsonProperty("Road Reflections")
    public void setRoad_Reflections(int road_Reflections) {
        this.road_Reflections = road_Reflections;
    }

    @JsonProperty("Road Reflections#")
    public String getRoad_Reflections_() {
        return road_Reflections_;
    }

    @JsonProperty("Road Reflections#")
    public void setRoad_Reflections_(String road_Reflections_) {
        this.road_Reflections_ = road_Reflections_;
    }

    @JsonProperty("Screenshot Depth Alpha")
    public boolean isScreenshot_Depth_Alpha() {
        return screenshot_Depth_Alpha;
    }

    @JsonProperty("Screenshot Depth Alpha")
    public void setScreenshot_Depth_Alpha(boolean screenshot_Depth_Alpha) {
        this.screenshot_Depth_Alpha = screenshot_Depth_Alpha;
    }

    @JsonProperty("Screenshot Depth Alpha#")
    public String getScreenshot_Depth_Alpha_() {
        return screenshot_Depth_Alpha_;
    }

    @JsonProperty("Screenshot Depth Alpha#")
    public void setScreenshot_Depth_Alpha_(String screenshot_Depth_Alpha_) {
        this.screenshot_Depth_Alpha_ = screenshot_Depth_Alpha_;
    }

    @JsonProperty("Screenshot Format")
    public int getScreenshot_Format() {
        return screenshot_Format;
    }

    @JsonProperty("Screenshot Format")
    public void setScreenshot_Format(int screenshot_Format) {
        this.screenshot_Format = screenshot_Format;
    }

    @JsonProperty("Screenshot Format#")
    public String getScreenshot_Format_() {
        return screenshot_Format_;
    }

    @JsonProperty("Screenshot Format#")
    public void setScreenshot_Format_(String screenshot_Format_) {
        this.screenshot_Format_ = screenshot_Format_;
    }

    @JsonProperty("Seat Adjustment Aft")
    public int getSeat_Adjustment_Aft() {
        return seat_Adjustment_Aft;
    }

    @JsonProperty("Seat Adjustment Aft")
    public void setSeat_Adjustment_Aft(int seat_Adjustment_Aft) {
        this.seat_Adjustment_Aft = seat_Adjustment_Aft;
    }

    @JsonProperty("Seat Adjustment Aft#")
    public String getSeat_Adjustment_Aft_() {
        return seat_Adjustment_Aft_;
    }

    @JsonProperty("Seat Adjustment Aft#")
    public void setSeat_Adjustment_Aft_(String seat_Adjustment_Aft_) {
        this.seat_Adjustment_Aft_ = seat_Adjustment_Aft_;
    }

    @JsonProperty("Seat Adjustment Up")
    public float getSeat_Adjustment_Up() {
        return seat_Adjustment_Up;
    }

    @JsonProperty("Seat Adjustment Up")
    public void setSeat_Adjustment_Up(float seat_Adjustment_Up) {
        this.seat_Adjustment_Up = seat_Adjustment_Up;
    }

    @JsonProperty("Seat Pitch")
    public int getSeat_Pitch() {
        return seat_Pitch;
    }

    @JsonProperty("Seat Pitch")
    public void setSeat_Pitch(int seat_Pitch) {
        this.seat_Pitch = seat_Pitch;
    }

    @JsonProperty("Seat Pitch#")
    public String getSeat_Pitch_() {
        return seat_Pitch_;
    }

    @JsonProperty("Seat Pitch#")
    public void setSeat_Pitch_(String seat_Pitch_) {
        this.seat_Pitch_ = seat_Pitch_;
    }

    @JsonProperty("Seat Roll")
    public int getSeat_Roll() {
        return seat_Roll;
    }

    @JsonProperty("Seat Roll")
    public void setSeat_Roll(int seat_Roll) {
        this.seat_Roll = seat_Roll;
    }

    @JsonProperty("Seat Roll#")
    public String getSeat_Roll_() {
        return seat_Roll_;
    }

    @JsonProperty("Seat Roll#")
    public void setSeat_Roll_(String seat_Roll_) {
        this.seat_Roll_ = seat_Roll_;
    }

    @JsonProperty("Seat Yaw")
    public int getSeat_Yaw() {
        return seat_Yaw;
    }

    @JsonProperty("Seat Yaw")
    public void setSeat_Yaw(int seat_Yaw) {
        this.seat_Yaw = seat_Yaw;
    }

    @JsonProperty("Seat Yaw#")
    public String getSeat_Yaw_() {
        return seat_Yaw_;
    }

    @JsonProperty("Seat Yaw#")
    public void setSeat_Yaw_(String seat_Yaw_) {
        this.seat_Yaw_ = seat_Yaw_;
    }

    @JsonProperty("Self In Rearview")
    public String getSelf_In_Rearview() {
        return self_In_Rearview;
    }

    @JsonProperty("Self In Rearview")
    public void setSelf_In_Rearview(String self_In_Rearview) {
        this.self_In_Rearview = self_In_Rearview;
    }

    @JsonProperty("Self In Rearview#")
    public String getSelf_In_Rearview_() {
        return self_In_Rearview_;
    }

    @JsonProperty("Self In Rearview#")
    public void setSelf_In_Rearview_(String self_In_Rearview_) {
        this.self_In_Rearview_ = self_In_Rearview_;
    }

    @JsonProperty("Shadow Blur")
    public int getShadow_Blur() {
        return shadow_Blur;
    }

    @JsonProperty("Shadow Blur")
    public void setShadow_Blur(int shadow_Blur) {
        this.shadow_Blur = shadow_Blur;
    }

    @JsonProperty("Shadow Blur#")
    public String getShadow_Blur_() {
        return shadow_Blur_;
    }

    @JsonProperty("Shadow Blur#")
    public void setShadow_Blur_(String shadow_Blur_) {
        this.shadow_Blur_ = shadow_Blur_;
    }

    @JsonProperty("Shadows")
    public int getShadows() {
        return shadows;
    }

    @JsonProperty("Shadows")
    public void setShadows(int shadows) {
        this.shadows = shadows;
    }

    @JsonProperty("Shadows#")
    public String getShadows_() {
        return shadows_;
    }

    @JsonProperty("Shadows#")
    public void setShadows_(String shadows_) {
        this.shadows_ = shadows_;
    }

    @JsonProperty("Smoke Flow")
    public boolean isSmoke_Flow() {
        return smoke_Flow;
    }

    @JsonProperty("Smoke Flow")
    public void setSmoke_Flow(boolean smoke_Flow) {
        this.smoke_Flow = smoke_Flow;
    }

    @JsonProperty("Smoke Flow#")
    public String getSmoke_Flow_() {
        return smoke_Flow_;
    }

    @JsonProperty("Smoke Flow#")
    public void setSmoke_Flow_(String smoke_Flow_) {
        this.smoke_Flow_ = smoke_Flow_;
    }

    @JsonProperty("Soft Particles")
    public int getSoft_Particles() {
        return soft_Particles;
    }

    @JsonProperty("Soft Particles")
    public void setSoft_Particles(int soft_Particles) {
        this.soft_Particles = soft_Particles;
    }

    @JsonProperty("Soft Particles#")
    public String getSoft_Particles_() {
        return soft_Particles_;
    }

    @JsonProperty("Soft Particles#")
    public void setSoft_Particles_(String soft_Particles_) {
        this.soft_Particles_ = soft_Particles_;
    }

    @JsonProperty("Spark Flow")
    public int getSpark_Flow() {
        return spark_Flow;
    }

    @JsonProperty("Spark Flow")
    public void setSpark_Flow(int spark_Flow) {
        this.spark_Flow = spark_Flow;
    }

    @JsonProperty("Spark Flow#")
    public String getSpark_Flow_() {
        return spark_Flow_;
    }

    @JsonProperty("Spark Flow#")
    public void setSpark_Flow_(String spark_Flow_) {
        this.spark_Flow_ = spark_Flow_;
    }

    @JsonProperty("Special FX")
    public int getSpecial_FX() {
        return special_FX;
    }

    @JsonProperty("Special FX")
    public void setSpecial_FX(int special_FX) {
        this.special_FX = special_FX;
    }

    @JsonProperty("Special FX#")
    public String getSpecial_FX_() {
        return special_FX_;
    }

    @JsonProperty("Special FX#")
    public void setSpecial_FX_(String special_FX_) {
        this.special_FX_ = special_FX_;
    }

    @JsonProperty("Stabilize Horizon")
    public int getStabilize_Horizon() {
        return stabilize_Horizon;
    }

    @JsonProperty("Stabilize Horizon")
    public void setStabilize_Horizon(int stabilize_Horizon) {
        this.stabilize_Horizon = stabilize_Horizon;
    }

    @JsonProperty("Stabilize Horizon#")
    public String getStabilize_Horizon_() {
        return stabilize_Horizon_;
    }

    @JsonProperty("Stabilize Horizon#")
    public void setStabilize_Horizon_(String stabilize_Horizon_) {
        this.stabilize_Horizon_ = stabilize_Horizon_;
    }

    @JsonProperty("Starting View")
    public int getStarting_View() {
        return starting_View;
    }

    @JsonProperty("Starting View")
    public void setStarting_View(int starting_View) {
        this.starting_View = starting_View;
    }

    @JsonProperty("Starting View#")
    public String getStarting_View_() {
        return starting_View_;
    }

    @JsonProperty("Starting View#")
    public void setStarting_View_(String starting_View_) {
        this.starting_View_ = starting_View_;
    }

    @JsonProperty("Steady Framerate Thresh")
    public int getSteady_Framerate_Thresh() {
        return steady_Framerate_Thresh;
    }

    @JsonProperty("Steady Framerate Thresh")
    public void setSteady_Framerate_Thresh(int steady_Framerate_Thresh) {
        this.steady_Framerate_Thresh = steady_Framerate_Thresh;
    }

    @JsonProperty("Steady Framerate Thresh#")
    public String getSteady_Framerate_Thresh_() {
        return steady_Framerate_Thresh_;
    }

    @JsonProperty("Steady Framerate Thresh#")
    public void setSteady_Framerate_Thresh_(String steady_Framerate_Thresh_) {
        this.steady_Framerate_Thresh_ = steady_Framerate_Thresh_;
    }

    @JsonProperty("Steering Wheel")
    public int getSteering_Wheel() {
        return steering_Wheel;
    }

    @JsonProperty("Steering Wheel")
    public void setSteering_Wheel(int steering_Wheel) {
        this.steering_Wheel = steering_Wheel;
    }

    @JsonProperty("Steering Wheel#")
    public String getSteering_Wheel_() {
        return steering_Wheel_;
    }

    @JsonProperty("Steering Wheel#")
    public void setSteering_Wheel_(String steering_Wheel_) {
        this.steering_Wheel_ = steering_Wheel_;
    }

    @JsonProperty("Sun Occlusion")
    public boolean isSun_Occlusion() {
        return sun_Occlusion;
    }

    @JsonProperty("Sun Occlusion")
    public void setSun_Occlusion(boolean sun_Occlusion) {
        this.sun_Occlusion = sun_Occlusion;
    }

    @JsonProperty("Sun Occlusion#")
    public String getSun_Occlusion_() {
        return sun_Occlusion_;
    }

    @JsonProperty("Sun Occlusion#")
    public void setSun_Occlusion_(String sun_Occlusion_) {
        this.sun_Occlusion_ = sun_Occlusion_;
    }

    @JsonProperty("Synchronize Frame")
    public int getSynchronize_Frame() {
        return synchronize_Frame;
    }

    @JsonProperty("Synchronize Frame")
    public void setSynchronize_Frame(int synchronize_Frame) {
        this.synchronize_Frame = synchronize_Frame;
    }

    @JsonProperty("Synchronize Frame#")
    public String getSynchronize_Frame_() {
        return synchronize_Frame_;
    }

    @JsonProperty("Synchronize Frame#")
    public void setSynchronize_Frame_(String synchronize_Frame_) {
        this.synchronize_Frame_ = synchronize_Frame_;
    }

    @JsonProperty("Texture Detail")
    public int getTexture_Detail() {
        return texture_Detail;
    }

    @JsonProperty("Texture Detail")
    public void setTexture_Detail(int texture_Detail) {
        this.texture_Detail = texture_Detail;
    }

    @JsonProperty("Texture Detail#")
    public String getTexture_Detail_() {
        return texture_Detail_;
    }

    @JsonProperty("Texture Detail#")
    public void setTexture_Detail_(String texture_Detail_) {
        this.texture_Detail_ = texture_Detail_;
    }

    @JsonProperty("Texture Filter")
    public int getTexture_Filter() {
        return texture_Filter;
    }

    @JsonProperty("Texture Filter")
    public void setTexture_Filter(int texture_Filter) {
        this.texture_Filter = texture_Filter;
    }

    @JsonProperty("Texture Filter#")
    public String getTexture_Filter_() {
        return texture_Filter_;
    }

    @JsonProperty("Texture Filter#")
    public void setTexture_Filter_(String texture_Filter_) {
        this.texture_Filter_ = texture_Filter_;
    }

    @JsonProperty("Texture Sharpening")
    public int getTexture_Sharpening() {
        return texture_Sharpening;
    }

    @JsonProperty("Texture Sharpening")
    public void setTexture_Sharpening(int texture_Sharpening) {
        this.texture_Sharpening = texture_Sharpening;
    }

    @JsonProperty("Texture Sharpening#")
    public String getTexture_Sharpening_() {
        return texture_Sharpening_;
    }

    @JsonProperty("Texture Sharpening#")
    public void setTexture_Sharpening_(String texture_Sharpening_) {
        this.texture_Sharpening_ = texture_Sharpening_;
    }

    @JsonProperty("Thunder Probability")
    public float getThunder_Probability() {
        return thunder_Probability;
    }

    @JsonProperty("Thunder Probability")
    public void setThunder_Probability(float thunder_Probability) {
        this.thunder_Probability = thunder_Probability;
    }

    @JsonProperty("Thunder Probability#")
    public String getThunder_Probability_() {
        return thunder_Probability_;
    }

    @JsonProperty("Thunder Probability#")
    public void setThunder_Probability_(String thunder_Probability_) {
        this.thunder_Probability_ = thunder_Probability_;
    }

    @JsonProperty("Tire Emitter Flow")
    public boolean isTire_Emitter_Flow() {
        return tire_Emitter_Flow;
    }

    @JsonProperty("Tire Emitter Flow")
    public void setTire_Emitter_Flow(boolean tire_Emitter_Flow) {
        this.tire_Emitter_Flow = tire_Emitter_Flow;
    }

    @JsonProperty("Tire Emitter Flow#")
    public String getTire_Emitter_Flow_() {
        return tire_Emitter_Flow_;
    }

    @JsonProperty("Tire Emitter Flow#")
    public void setTire_Emitter_Flow_(String tire_Emitter_Flow_) {
        this.tire_Emitter_Flow_ = tire_Emitter_Flow_;
    }

    @JsonProperty("Tire Ground Offset")
    public int getTire_Ground_Offset() {
        return tire_Ground_Offset;
    }

    @JsonProperty("Tire Ground Offset")
    public void setTire_Ground_Offset(int tire_Ground_Offset) {
        this.tire_Ground_Offset = tire_Ground_Offset;
    }

    @JsonProperty("Tire Ground Offset#")
    public String getTire_Ground_Offset_() {
        return tire_Ground_Offset_;
    }

    @JsonProperty("Tire Ground Offset#")
    public void setTire_Ground_Offset_(String tire_Ground_Offset_) {
        this.tire_Ground_Offset_ = tire_Ground_Offset_;
    }

    @JsonProperty("Track Detail")
    public int getTrack_Detail() {
        return track_Detail;
    }

    @JsonProperty("Track Detail")
    public void setTrack_Detail(int track_Detail) {
        this.track_Detail = track_Detail;
    }

    @JsonProperty("Transparency AA")
    public boolean isTransparency_AA() {
        return transparency_AA;
    }

    @JsonProperty("Transparency AA")
    public void setTransparency_AA(boolean transparency_AA) {
        this.transparency_AA = transparency_AA;
    }

    @JsonProperty("Transparency AA#")
    public String getTransparency_AA_() {
        return transparency_AA_;
    }

    @JsonProperty("Transparency AA#")
    public void setTransparency_AA_(String transparency_AA_) {
        this.transparency_AA_ = transparency_AA_;
    }

    @JsonProperty("UI Background Animation")
    public int getUI_Background_Animation() {
        return uI_Background_Animation;
    }

    @JsonProperty("UI Background Animation")
    public void setUI_Background_Animation(int uI_Background_Animation) {
        this.uI_Background_Animation = uI_Background_Animation;
    }

    @JsonProperty("UI autonomous render thread")
    public boolean isUI_autonomous_render_thread() {
        return uI_autonomous_render_thread;
    }

    @JsonProperty("UI autonomous render thread")
    public void setUI_autonomous_render_thread(boolean uI_autonomous_render_thread) {
        this.uI_autonomous_render_thread = uI_autonomous_render_thread;
    }

    @JsonProperty("UI autonomous render thread#")
    public String getUI_autonomous_render_thread_() {
        return uI_autonomous_render_thread_;
    }

    @JsonProperty("UI autonomous render thread#")
    public void setUI_autonomous_render_thread_(String uI_autonomous_render_thread_) {
        this.uI_autonomous_render_thread_ = uI_autonomous_render_thread_;
    }

    @JsonProperty("VR Enable Hidden Area Mask")
    public boolean isVR_Enable_Hidden_Area_Mask() {
        return vR_Enable_Hidden_Area_Mask;
    }

    @JsonProperty("VR Enable Hidden Area Mask")
    public void setVR_Enable_Hidden_Area_Mask(boolean vR_Enable_Hidden_Area_Mask) {
        this.vR_Enable_Hidden_Area_Mask = vR_Enable_Hidden_Area_Mask;
    }

    @JsonProperty("VR Enable Hidden Area Mask#")
    public String getVR_Enable_Hidden_Area_Mask_() {
        return vR_Enable_Hidden_Area_Mask_;
    }

    @JsonProperty("VR Enable Hidden Area Mask#")
    public void setVR_Enable_Hidden_Area_Mask_(String vR_Enable_Hidden_Area_Mask_) {
        this.vR_Enable_Hidden_Area_Mask_ = vR_Enable_Hidden_Area_Mask_;
    }

    @JsonProperty("VR IPD Scale")
    public float getVR_IPD_Scale() {
        return vR_IPD_Scale;
    }

    @JsonProperty("VR IPD Scale")
    public void setVR_IPD_Scale(float vR_IPD_Scale) {
        this.vR_IPD_Scale = vR_IPD_Scale;
    }

    @JsonProperty("VR IPD Scale#")
    public String getVR_IPD_Scale_() {
        return vR_IPD_Scale_;
    }

    @JsonProperty("VR IPD Scale#")
    public void setVR_IPD_Scale_(String vR_IPD_Scale_) {
        this.vR_IPD_Scale_ = vR_IPD_Scale_;
    }

    @JsonProperty("VR Projection Mode")
    public int getVR_Projection_Mode() {
        return vR_Projection_Mode;
    }

    @JsonProperty("VR Projection Mode")
    public void setVR_Projection_Mode(int vR_Projection_Mode) {
        this.vR_Projection_Mode = vR_Projection_Mode;
    }

    @JsonProperty("VR Projection Mode#")
    public String getVR_Projection_Mode_() {
        return vR_Projection_Mode_;
    }

    @JsonProperty("VR Projection Mode#")
    public void setVR_Projection_Mode_(String vR_Projection_Mode_) {
        this.vR_Projection_Mode_ = vR_Projection_Mode_;
    }

    @JsonProperty("Vehicle Flow Offset")
    public float getVehicle_Flow_Offset() {
        return vehicle_Flow_Offset;
    }

    @JsonProperty("Vehicle Flow Offset")
    public void setVehicle_Flow_Offset(float vehicle_Flow_Offset) {
        this.vehicle_Flow_Offset = vehicle_Flow_Offset;
    }

    @JsonProperty("Vehicle Flow Offset#")
    public String getVehicle_Flow_Offset_() {
        return vehicle_Flow_Offset_;
    }

    @JsonProperty("Vehicle Flow Offset#")
    public void setVehicle_Flow_Offset_(String vehicle_Flow_Offset_) {
        this.vehicle_Flow_Offset_ = vehicle_Flow_Offset_;
    }

    @JsonProperty("Vehicle Flow Radius")
    public int getVehicle_Flow_Radius() {
        return vehicle_Flow_Radius;
    }

    @JsonProperty("Vehicle Flow Radius")
    public void setVehicle_Flow_Radius(int vehicle_Flow_Radius) {
        this.vehicle_Flow_Radius = vehicle_Flow_Radius;
    }

    @JsonProperty("Vehicle Flow Radius#")
    public String getVehicle_Flow_Radius_() {
        return vehicle_Flow_Radius_;
    }

    @JsonProperty("Vehicle Flow Radius#")
    public void setVehicle_Flow_Radius_(String vehicle_Flow_Radius_) {
        this.vehicle_Flow_Radius_ = vehicle_Flow_Radius_;
    }

    @JsonProperty("Verify Refs")
    public boolean isVerify_Refs() {
        return verify_Refs;
    }

    @JsonProperty("Verify Refs")
    public void setVerify_Refs(boolean verify_Refs) {
        this.verify_Refs = verify_Refs;
    }

    @JsonProperty("Verify Refs#")
    public String getVerify_Refs_() {
        return verify_Refs_;
    }

    @JsonProperty("Verify Refs#")
    public void setVerify_Refs_(String verify_Refs_) {
        this.verify_Refs_ = verify_Refs_;
    }

    @JsonProperty("Vertical FOV Degrees")
    public int getVertical_FOV_Degrees() {
        return vertical_FOV_Degrees;
    }

    @JsonProperty("Vertical FOV Degrees")
    public void setVertical_FOV_Degrees(int vertical_FOV_Degrees) {
        this.vertical_FOV_Degrees = vertical_FOV_Degrees;
    }

    @JsonProperty("Vertical FOV Degrees#")
    public String getVertical_FOV_Degrees_() {
        return vertical_FOV_Degrees_;
    }

    @JsonProperty("Vertical FOV Degrees#")
    public void setVertical_FOV_Degrees_(String vertical_FOV_Degrees_) {
        this.vertical_FOV_Degrees_ = vertical_FOV_Degrees_;
    }

    @JsonProperty("Virtual Rearview In Cockpit")
    public boolean isVirtual_Rearview_In_Cockpit() {
        return virtual_Rearview_In_Cockpit;
    }

    @JsonProperty("Virtual Rearview In Cockpit")
    public void setVirtual_Rearview_In_Cockpit(boolean virtual_Rearview_In_Cockpit) {
        this.virtual_Rearview_In_Cockpit = virtual_Rearview_In_Cockpit;
    }

    @JsonProperty("Virtual Rearview In Cockpit#")
    public String getVirtual_Rearview_In_Cockpit_() {
        return virtual_Rearview_In_Cockpit_;
    }

    @JsonProperty("Virtual Rearview In Cockpit#")
    public void setVirtual_Rearview_In_Cockpit_(String virtual_Rearview_In_Cockpit_) {
        this.virtual_Rearview_In_Cockpit_ = virtual_Rearview_In_Cockpit_;
    }

    @JsonProperty("Warning Light Anim Speed")
    public int getWarning_Light_Anim_Speed() {
        return warning_Light_Anim_Speed;
    }

    @JsonProperty("Warning Light Anim Speed")
    public void setWarning_Light_Anim_Speed(int warning_Light_Anim_Speed) {
        this.warning_Light_Anim_Speed = warning_Light_Anim_Speed;
    }

    @JsonProperty("Warning Light Anim Speed#")
    public String getWarning_Light_Anim_Speed_() {
        return warning_Light_Anim_Speed_;
    }

    @JsonProperty("Warning Light Anim Speed#")
    public void setWarning_Light_Anim_Speed_(String warning_Light_Anim_Speed_) {
        this.warning_Light_Anim_Speed_ = warning_Light_Anim_Speed_;
    }

    @JsonProperty("Widescreen Overlays")
    public boolean isWidescreen_Overlays() {
        return widescreen_Overlays;
    }

    @JsonProperty("Widescreen Overlays")
    public void setWidescreen_Overlays(boolean widescreen_Overlays) {
        this.widescreen_Overlays = widescreen_Overlays;
    }

    @JsonProperty("Wind and Crowd Motion")
    public boolean isWind_and_Crowd_Motion() {
        return wind_and_Crowd_Motion;
    }

    @JsonProperty("Wind and Crowd Motion")
    public void setWind_and_Crowd_Motion(boolean wind_and_Crowd_Motion) {
        this.wind_and_Crowd_Motion = wind_and_Crowd_Motion;
    }

    @JsonProperty("Wind and Crowd Motion#")
    public String getWind_and_Crowd_Motion_() {
        return wind_and_Crowd_Motion_;
    }

    @JsonProperty("Wind and Crowd Motion#")
    public void setWind_and_Crowd_Motion_(String wind_and_Crowd_Motion_) {
        this.wind_and_Crowd_Motion_ = wind_and_Crowd_Motion_;
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
        sb.append(GraphicOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allow_HUD_in_cockpit");
        sb.append('=');
        sb.append(this.allow_HUD_in_cockpit);
        sb.append(',');
        sb.append("allow_Letterboxing");
        sb.append('=');
        sb.append(this.allow_Letterboxing);
        sb.append(',');
        sb.append("allow_Letterboxing_");
        sb.append('=');
        sb.append(((this.allow_Letterboxing_ == null) ? "<null>" : this.allow_Letterboxing_));
        sb.append(',');
        sb.append("always_Rebuild_Collision");
        sb.append('=');
        sb.append(this.always_Rebuild_Collision);
        sb.append(',');
        sb.append("always_Rebuild_Collision_");
        sb.append('=');
        sb.append(((this.always_Rebuild_Collision_ == null) ? "<null>" : this.always_Rebuild_Collision_));
        sb.append(',');
        sb.append("any_Camera_HUD");
        sb.append('=');
        sb.append(this.any_Camera_HUD);
        sb.append(',');
        sb.append("any_Camera_HUD_");
        sb.append('=');
        sb.append(((this.any_Camera_HUD_ == null) ? "<null>" : this.any_Camera_HUD_));
        sb.append(',');
        sb.append("auto_Detail_Framerate");
        sb.append('=');
        sb.append(this.auto_Detail_Framerate);
        sb.append(',');
        sb.append("auto_Detail_Framerate_");
        sb.append('=');
        sb.append(((this.auto_Detail_Framerate_ == null) ? "<null>" : this.auto_Detail_Framerate_));
        sb.append(',');
        sb.append("automap");
        sb.append('=');
        sb.append(this.automap);
        sb.append(',');
        sb.append("automap_");
        sb.append('=');
        sb.append(((this.automap_ == null) ? "<null>" : this.automap_));
        sb.append(',');
        sb.append("backfire_Anim_Speed");
        sb.append('=');
        sb.append(this.backfire_Anim_Speed);
        sb.append(',');
        sb.append("box_Outline");
        sb.append('=');
        sb.append(this.box_Outline);
        sb.append(',');
        sb.append("box_Outline_");
        sb.append('=');
        sb.append(((this.box_Outline_ == null) ? "<null>" : this.box_Outline_));
        sb.append(',');
        sb.append("broadcast_Overlay");
        sb.append('=');
        sb.append(this.broadcast_Overlay);
        sb.append(',');
        sb.append("car_Vibration_Mult1");
        sb.append('=');
        sb.append(this.car_Vibration_Mult1);
        sb.append(',');
        sb.append("car_Vibration_Mult1_");
        sb.append('=');
        sb.append(((this.car_Vibration_Mult1_ == null) ? "<null>" : this.car_Vibration_Mult1_));
        sb.append(',');
        sb.append("car_Vibration_Mult2");
        sb.append('=');
        sb.append(this.car_Vibration_Mult2);
        sb.append(',');
        sb.append("car_Vibration_Mult2_");
        sb.append('=');
        sb.append(((this.car_Vibration_Mult2_ == null) ? "<null>" : this.car_Vibration_Mult2_));
        sb.append(',');
        sb.append("center_Mirror_Horiz");
        sb.append('=');
        sb.append(this.center_Mirror_Horiz);
        sb.append(',');
        sb.append("center_Mirror_Horiz_");
        sb.append('=');
        sb.append(((this.center_Mirror_Horiz_ == null) ? "<null>" : this.center_Mirror_Horiz_));
        sb.append(',');
        sb.append("center_Mirror_Size");
        sb.append('=');
        sb.append(this.center_Mirror_Size);
        sb.append(',');
        sb.append("center_Mirror_Vert");
        sb.append('=');
        sb.append(this.center_Mirror_Vert);
        sb.append(',');
        sb.append("cockpit_Vibration_Freq1");
        sb.append('=');
        sb.append(this.cockpit_Vibration_Freq1);
        sb.append(',');
        sb.append("cockpit_Vibration_Freq1_");
        sb.append('=');
        sb.append(((this.cockpit_Vibration_Freq1_ == null) ? "<null>" : this.cockpit_Vibration_Freq1_));
        sb.append(',');
        sb.append("cockpit_Vibration_Freq2");
        sb.append('=');
        sb.append(this.cockpit_Vibration_Freq2);
        sb.append(',');
        sb.append("cockpit_Vibration_Freq2_");
        sb.append('=');
        sb.append(((this.cockpit_Vibration_Freq2_ == null) ? "<null>" : this.cockpit_Vibration_Freq2_));
        sb.append(',');
        sb.append("cockpit_Vibration_Mult1");
        sb.append('=');
        sb.append(this.cockpit_Vibration_Mult1);
        sb.append(',');
        sb.append("cockpit_Vibration_Mult1_");
        sb.append('=');
        sb.append(((this.cockpit_Vibration_Mult1_ == null) ? "<null>" : this.cockpit_Vibration_Mult1_));
        sb.append(',');
        sb.append("cockpit_Vibration_Mult2");
        sb.append('=');
        sb.append(this.cockpit_Vibration_Mult2);
        sb.append(',');
        sb.append("cockpit_Vibration_Mult2_");
        sb.append('=');
        sb.append(((this.cockpit_Vibration_Mult2_ == null) ? "<null>" : this.cockpit_Vibration_Mult2_));
        sb.append(',');
        sb.append("compressed_Textures");
        sb.append('=');
        sb.append(this.compressed_Textures);
        sb.append(',');
        sb.append("delay_Video_Swap");
        sb.append('=');
        sb.append(this.delay_Video_Swap);
        sb.append(',');
        sb.append("delay_Video_Swap_");
        sb.append('=');
        sb.append(((this.delay_Video_Swap_ == null) ? "<null>" : this.delay_Video_Swap_));
        sb.append(',');
        sb.append("display_Icons");
        sb.append('=');
        sb.append(this.display_Icons);
        sb.append(',');
        sb.append("display_Icons_");
        sb.append('=');
        sb.append(((this.display_Icons_ == null) ? "<null>" : this.display_Icons_));
        sb.append(',');
        sb.append("display_Vehicle_Labels");
        sb.append('=');
        sb.append(this.display_Vehicle_Labels);
        sb.append(',');
        sb.append("display_Vehicle_Labels_");
        sb.append('=');
        sb.append(((this.display_Vehicle_Labels_ == null) ? "<null>" : this.display_Vehicle_Labels_));
        sb.append(',');
        sb.append("dynamic_Vertex_Buffers");
        sb.append('=');
        sb.append(this.dynamic_Vertex_Buffers);
        sb.append(',');
        sb.append("dynamic_Vertex_Buffers_");
        sb.append('=');
        sb.append(((this.dynamic_Vertex_Buffers_ == null) ? "<null>" : this.dynamic_Vertex_Buffers_));
        sb.append(',');
        sb.append("enable_Legacy_HDR_Profiles");
        sb.append('=');
        sb.append(this.enable_Legacy_HDR_Profiles);
        sb.append(',');
        sb.append("enable_Legacy_HDR_Profiles_");
        sb.append('=');
        sb.append(((this.enable_Legacy_HDR_Profiles_ == null) ? "<null>" : this.enable_Legacy_HDR_Profiles_));
        sb.append(',');
        sb.append("engine_Emitter_Flow");
        sb.append('=');
        sb.append(this.engine_Emitter_Flow);
        sb.append(',');
        sb.append("engine_Emitter_Flow_");
        sb.append('=');
        sb.append(((this.engine_Emitter_Flow_ == null) ? "<null>" : this.engine_Emitter_Flow_));
        sb.append(',');
        sb.append("environment_Reflections");
        sb.append('=');
        sb.append(this.environment_Reflections);
        sb.append(',');
        sb.append("environment_Reflections_");
        sb.append('=');
        sb.append(((this.environment_Reflections_ == null) ? "<null>" : this.environment_Reflections_));
        sb.append(',');
        sb.append("exaggerate_Yaw");
        sb.append('=');
        sb.append(this.exaggerate_Yaw);
        sb.append(',');
        sb.append("exaggerate_Yaw_");
        sb.append('=');
        sb.append(((this.exaggerate_Yaw_ == null) ? "<null>" : this.exaggerate_Yaw_));
        sb.append(',');
        sb.append("extra_Visible_Vehicles");
        sb.append('=');
        sb.append(this.extra_Visible_Vehicles);
        sb.append(',');
        sb.append("extra_Visible_Vehicles_");
        sb.append('=');
        sb.append(((this.extra_Visible_Vehicles_ == null) ? "<null>" : this.extra_Visible_Vehicles_));
        sb.append(',');
        sb.append("full_Tire_Shader");
        sb.append('=');
        sb.append(this.full_Tire_Shader);
        sb.append(',');
        sb.append("full_Tire_Shader_");
        sb.append('=');
        sb.append(((this.full_Tire_Shader_ == null) ? "<null>" : this.full_Tire_Shader_));
        sb.append(',');
        sb.append("gap_Check");
        sb.append('=');
        sb.append(this.gap_Check);
        sb.append(',');
        sb.append("gap_Check_");
        sb.append('=');
        sb.append(((this.gap_Check_ == null) ? "<null>" : this.gap_Check_));
        sb.append(',');
        sb.append("garage_Detail");
        sb.append('=');
        sb.append(this.garage_Detail);
        sb.append(',');
        sb.append("garage_Detail_");
        sb.append('=');
        sb.append(((this.garage_Detail_ == null) ? "<null>" : this.garage_Detail_));
        sb.append(',');
        sb.append("glance_Angle");
        sb.append('=');
        sb.append(this.glance_Angle);
        sb.append(',');
        sb.append("glance_Angle_");
        sb.append('=');
        sb.append(((this.glance_Angle_ == null) ? "<null>" : this.glance_Angle_));
        sb.append(',');
        sb.append("glance_Rate");
        sb.append('=');
        sb.append(this.glance_Rate);
        sb.append(',');
        sb.append("glance_Rate_");
        sb.append('=');
        sb.append(((this.glance_Rate_ == null) ? "<null>" : this.glance_Rate_));
        sb.append(',');
        sb.append("groove");
        sb.append('=');
        sb.append(this.groove);
        sb.append(',');
        sb.append("hUD");
        sb.append('=');
        sb.append(this.hUD);
        sb.append(',');
        sb.append("hUD_Component");
        sb.append('=');
        sb.append(((this.hUD_Component == null) ? "<null>" : this.hUD_Component));
        sb.append(',');
        sb.append("hUD_Component_Version");
        sb.append('=');
        sb.append(((this.hUD_Component_Version == null) ? "<null>" : this.hUD_Component_Version));
        sb.append(',');
        sb.append("hUD_MFD");
        sb.append('=');
        sb.append(this.hUD_MFD);
        sb.append(',');
        sb.append("hUD_Race_Stats");
        sb.append('=');
        sb.append(this.hUD_Race_Stats);
        sb.append(',');
        sb.append("hUD_Tachometer");
        sb.append('=');
        sb.append(this.hUD_Tachometer);
        sb.append(',');
        sb.append("hUD_file");
        sb.append('=');
        sb.append(((this.hUD_file == null) ? "<null>" : this.hUD_file));
        sb.append(',');
        sb.append("head_Physics");
        sb.append('=');
        sb.append(this.head_Physics);
        sb.append(',');
        sb.append("head_Physics_");
        sb.append('=');
        sb.append(((this.head_Physics_ == null) ? "<null>" : this.head_Physics_));
        sb.append(',');
        sb.append("head_Rotation");
        sb.append('=');
        sb.append(this.head_Rotation);
        sb.append(',');
        sb.append("head_Rotation_");
        sb.append('=');
        sb.append(((this.head_Rotation_ == null) ? "<null>" : this.head_Rotation_));
        sb.append(',');
        sb.append("headlights_On_Cars");
        sb.append('=');
        sb.append(this.headlights_On_Cars);
        sb.append(',');
        sb.append("headlights_On_Cars_");
        sb.append('=');
        sb.append(((this.headlights_On_Cars_ == null) ? "<null>" : this.headlights_On_Cars_));
        sb.append(',');
        sb.append("heat_FX_Fade_Speed");
        sb.append('=');
        sb.append(this.heat_FX_Fade_Speed);
        sb.append(',');
        sb.append("heat_FX_Fade_Speed_");
        sb.append('=');
        sb.append(((this.heat_FX_Fade_Speed_ == null) ? "<null>" : this.heat_FX_Fade_Speed_));
        sb.append(',');
        sb.append("lCD_Display_Modes");
        sb.append('=');
        sb.append(this.lCD_Display_Modes);
        sb.append(',');
        sb.append("lCD_Display_Modes_");
        sb.append('=');
        sb.append(((this.lCD_Display_Modes_ == null) ? "<null>" : this.lCD_Display_Modes_));
        sb.append(',');
        sb.append("lSI_Top");
        sb.append('=');
        sb.append(this.lSI_Top);
        sb.append(',');
        sb.append("lSI_Top_");
        sb.append('=');
        sb.append(((this.lSI_Top_ == null) ? "<null>" : this.lSI_Top_));
        sb.append(',');
        sb.append("leanahead_Angle");
        sb.append('=');
        sb.append(this.leanahead_Angle);
        sb.append(',');
        sb.append("leanahead_Angle_");
        sb.append('=');
        sb.append(((this.leanahead_Angle_ == null) ? "<null>" : this.leanahead_Angle_));
        sb.append(',');
        sb.append("left_Mirror_Horiz");
        sb.append('=');
        sb.append(this.left_Mirror_Horiz);
        sb.append(',');
        sb.append("left_Mirror_Horiz_");
        sb.append('=');
        sb.append(((this.left_Mirror_Horiz_ == null) ? "<null>" : this.left_Mirror_Horiz_));
        sb.append(',');
        sb.append("left_Mirror_Size");
        sb.append('=');
        sb.append(this.left_Mirror_Size);
        sb.append(',');
        sb.append("left_Mirror_Vert");
        sb.append('=');
        sb.append(this.left_Mirror_Vert);
        sb.append(',');
        sb.append("lightning_Probability");
        sb.append('=');
        sb.append(this.lightning_Probability);
        sb.append(',');
        sb.append("lightning_Probability_");
        sb.append('=');
        sb.append(((this.lightning_Probability_ == null) ? "<null>" : this.lightning_Probability_));
        sb.append(',');
        sb.append("load_Opponent_Cockpits");
        sb.append('=');
        sb.append(this.load_Opponent_Cockpits);
        sb.append(',');
        sb.append("load_Opponent_Cockpits_");
        sb.append('=');
        sb.append(((this.load_Opponent_Cockpits_ == null) ? "<null>" : this.load_Opponent_Cockpits_));
        sb.append(',');
        sb.append("logo_Seconds");
        sb.append('=');
        sb.append(this.logo_Seconds);
        sb.append(',');
        sb.append("logo_Seconds_");
        sb.append('=');
        sb.append(((this.logo_Seconds_ == null) ? "<null>" : this.logo_Seconds_));
        sb.append(',');
        sb.append("look_Roll_Angle");
        sb.append('=');
        sb.append(this.look_Roll_Angle);
        sb.append(',');
        sb.append("look_Roll_Angle_");
        sb.append('=');
        sb.append(((this.look_Roll_Angle_ == null) ? "<null>" : this.look_Roll_Angle_));
        sb.append(',');
        sb.append("look_Up_Down_Angle");
        sb.append('=');
        sb.append(this.look_Up_Down_Angle);
        sb.append(',');
        sb.append("look_Up_Down_Angle_");
        sb.append('=');
        sb.append(((this.look_Up_Down_Angle_ == null) ? "<null>" : this.look_Up_Down_Angle_));
        sb.append(',');
        sb.append("lookahead_Angle");
        sb.append('=');
        sb.append(this.lookahead_Angle);
        sb.append(',');
        sb.append("lookahead_Angle_");
        sb.append('=');
        sb.append(((this.lookahead_Angle_ == null) ? "<null>" : this.lookahead_Angle_));
        sb.append(',');
        sb.append("low_Detail_UI");
        sb.append('=');
        sb.append(this.low_Detail_UI);
        sb.append(',');
        sb.append("mIP_Mapping");
        sb.append('=');
        sb.append(this.mIP_Mapping);
        sb.append(',');
        sb.append("max_Framerate");
        sb.append('=');
        sb.append(this.max_Framerate);
        sb.append(',');
        sb.append("max_Framerate_");
        sb.append('=');
        sb.append(((this.max_Framerate_ == null) ? "<null>" : this.max_Framerate_));
        sb.append(',');
        sb.append("max_Headlights");
        sb.append('=');
        sb.append(this.max_Headlights);
        sb.append(',');
        sb.append("max_Headlights_");
        sb.append('=');
        sb.append(((this.max_Headlights_ == null) ? "<null>" : this.max_Headlights_));
        sb.append(',');
        sb.append("max_Visible_Vehicles");
        sb.append('=');
        sb.append(this.max_Visible_Vehicles);
        sb.append(',');
        sb.append("mirror_Adjustment_Horiz");
        sb.append('=');
        sb.append(this.mirror_Adjustment_Horiz);
        sb.append(',');
        sb.append("mirror_Adjustment_Horiz_");
        sb.append('=');
        sb.append(((this.mirror_Adjustment_Horiz_ == null) ? "<null>" : this.mirror_Adjustment_Horiz_));
        sb.append(',');
        sb.append("mirror_Adjustment_Vert");
        sb.append('=');
        sb.append(this.mirror_Adjustment_Vert);
        sb.append(',');
        sb.append("mirror_Physical_X");
        sb.append('=');
        sb.append(this.mirror_Physical_X);
        sb.append(',');
        sb.append("mirror_Physical_X_");
        sb.append('=');
        sb.append(((this.mirror_Physical_X_ == null) ? "<null>" : this.mirror_Physical_X_));
        sb.append(',');
        sb.append("mirror_Physical_Y");
        sb.append('=');
        sb.append(this.mirror_Physical_Y);
        sb.append(',');
        sb.append("mirror_Physical_Y_");
        sb.append('=');
        sb.append(((this.mirror_Physical_Y_ == null) ? "<null>" : this.mirror_Physical_Y_));
        sb.append(',');
        sb.append("mirror_Physical_Z");
        sb.append('=');
        sb.append(this.mirror_Physical_Z);
        sb.append(',');
        sb.append("moving_Rearview");
        sb.append('=');
        sb.append(this.moving_Rearview);
        sb.append(',');
        sb.append("moving_Rearview_");
        sb.append('=');
        sb.append(((this.moving_Rearview_ == null) ? "<null>" : this.moving_Rearview_));
        sb.append(',');
        sb.append("opponent_Detail");
        sb.append('=');
        sb.append(this.opponent_Detail);
        sb.append(',');
        sb.append("opponent_Texture_Override");
        sb.append('=');
        sb.append(this.opponent_Texture_Override);
        sb.append(',');
        sb.append("opponent_Texture_Override_");
        sb.append('=');
        sb.append(((this.opponent_Texture_Override_ == null) ? "<null>" : this.opponent_Texture_Override_));
        sb.append(',');
        sb.append("overlay_Height_Offset");
        sb.append('=');
        sb.append(this.overlay_Height_Offset);
        sb.append(',');
        sb.append("overlay_Height_Offset_");
        sb.append('=');
        sb.append(((this.overlay_Height_Offset_ == null) ? "<null>" : this.overlay_Height_Offset_));
        sb.append(',');
        sb.append("overlay_Z_Bias");
        sb.append('=');
        sb.append(this.overlay_Z_Bias);
        sb.append(',');
        sb.append("overlay_Z_Bias_");
        sb.append('=');
        sb.append(((this.overlay_Z_Bias_ == null) ? "<null>" : this.overlay_Z_Bias_));
        sb.append(',');
        sb.append("partial_Cockpit_View");
        sb.append('=');
        sb.append(this.partial_Cockpit_View);
        sb.append(',');
        sb.append("partial_Cockpit_View_");
        sb.append('=');
        sb.append(((this.partial_Cockpit_View_ == null) ? "<null>" : this.partial_Cockpit_View_));
        sb.append(',');
        sb.append("pitcrew_Detail_Level");
        sb.append('=');
        sb.append(this.pitcrew_Detail_Level);
        sb.append(',');
        sb.append("pitcrew_Detail_Level_");
        sb.append('=');
        sb.append(((this.pitcrew_Detail_Level_ == null) ? "<null>" : this.pitcrew_Detail_Level_));
        sb.append(',');
        sb.append("player_Detail");
        sb.append('=');
        sb.append(this.player_Detail);
        sb.append(',');
        sb.append("player_Detail_");
        sb.append('=');
        sb.append(((this.player_Detail_ == null) ? "<null>" : this.player_Detail_));
        sb.append(',');
        sb.append("player_Livery");
        sb.append('=');
        sb.append(((this.player_Livery == null) ? "<null>" : this.player_Livery));
        sb.append(',');
        sb.append("player_Livery_");
        sb.append('=');
        sb.append(((this.player_Livery_ == null) ? "<null>" : this.player_Livery_));
        sb.append(',');
        sb.append("player_Texture_Override");
        sb.append('=');
        sb.append(this.player_Texture_Override);
        sb.append(',');
        sb.append("player_Texture_Override_");
        sb.append('=');
        sb.append(((this.player_Texture_Override_ == null) ? "<null>" : this.player_Texture_Override_));
        sb.append(',');
        sb.append("rain_FX_Quality");
        sb.append('=');
        sb.append(this.rain_FX_Quality);
        sb.append(',');
        sb.append("rain_FX_Quality_");
        sb.append('=');
        sb.append(((this.rain_FX_Quality_ == null) ? "<null>" : this.rain_FX_Quality_));
        sb.append(',');
        sb.append("raindrop_Flow");
        sb.append('=');
        sb.append(this.raindrop_Flow);
        sb.append(',');
        sb.append("raindrop_Flow_");
        sb.append('=');
        sb.append(((this.raindrop_Flow_ == null) ? "<null>" : this.raindrop_Flow_));
        sb.append(',');
        sb.append("rainspray_Flow");
        sb.append('=');
        sb.append(this.rainspray_Flow);
        sb.append(',');
        sb.append("rainspray_Flow_");
        sb.append('=');
        sb.append(((this.rainspray_Flow_ == null) ? "<null>" : this.rainspray_Flow_));
        sb.append(',');
        sb.append("real_Road_System");
        sb.append('=');
        sb.append(this.real_Road_System);
        sb.append(',');
        sb.append("real_Road_System_");
        sb.append('=');
        sb.append(((this.real_Road_System_ == null) ? "<null>" : this.real_Road_System_));
        sb.append(',');
        sb.append("rearview_Cull");
        sb.append('=');
        sb.append(this.rearview_Cull);
        sb.append(',');
        sb.append("rearview_Cull_");
        sb.append('=');
        sb.append(((this.rearview_Cull_ == null) ? "<null>" : this.rearview_Cull_));
        sb.append(',');
        sb.append("rearview_Driving");
        sb.append('=');
        sb.append(this.rearview_Driving);
        sb.append(',');
        sb.append("rearview_Driving_");
        sb.append('=');
        sb.append(((this.rearview_Driving_ == null) ? "<null>" : this.rearview_Driving_));
        sb.append(',');
        sb.append("rearview_Height");
        sb.append('=');
        sb.append(this.rearview_Height);
        sb.append(',');
        sb.append("rearview_Independent");
        sb.append('=');
        sb.append(this.rearview_Independent);
        sb.append(',');
        sb.append("rearview_Independent_");
        sb.append('=');
        sb.append(((this.rearview_Independent_ == null) ? "<null>" : this.rearview_Independent_));
        sb.append(',');
        sb.append("rearview_Onboard");
        sb.append('=');
        sb.append(this.rearview_Onboard);
        sb.append(',');
        sb.append("rearview_Onboard_");
        sb.append('=');
        sb.append(((this.rearview_Onboard_ == null) ? "<null>" : this.rearview_Onboard_));
        sb.append(',');
        sb.append("rearview_Particles");
        sb.append('=');
        sb.append(this.rearview_Particles);
        sb.append(',');
        sb.append("rearview_Swingman");
        sb.append('=');
        sb.append(this.rearview_Swingman);
        sb.append(',');
        sb.append("rearview_Swingman_");
        sb.append('=');
        sb.append(((this.rearview_Swingman_ == null) ? "<null>" : this.rearview_Swingman_));
        sb.append(',');
        sb.append("rearview_Width");
        sb.append('=');
        sb.append(this.rearview_Width);
        sb.append(',');
        sb.append("rearview_Width_");
        sb.append('=');
        sb.append(((this.rearview_Width_ == null) ? "<null>" : this.rearview_Width_));
        sb.append(',');
        sb.append("rearview_Back_Clip");
        sb.append('=');
        sb.append(this.rearview_Back_Clip);
        sb.append(',');
        sb.append("rearview_Back_Clip_");
        sb.append('=');
        sb.append(((this.rearview_Back_Clip_ == null) ? "<null>" : this.rearview_Back_Clip_));
        sb.append(',');
        sb.append("rearview_Front_Clip");
        sb.append('=');
        sb.append(this.rearview_Front_Clip);
        sb.append(',');
        sb.append("rearview_Front_Clip_");
        sb.append('=');
        sb.append(((this.rearview_Front_Clip_ == null) ? "<null>" : this.rearview_Front_Clip_));
        sb.append(',');
        sb.append("render_Once_Per_VSync");
        sb.append('=');
        sb.append(this.render_Once_Per_VSync);
        sb.append(',');
        sb.append("render_Once_Per_VSync_");
        sb.append('=');
        sb.append(((this.render_Once_Per_VSync_ == null) ? "<null>" : this.render_Once_Per_VSync_));
        sb.append(',');
        sb.append("right_Mirror_Horiz");
        sb.append('=');
        sb.append(this.right_Mirror_Horiz);
        sb.append(',');
        sb.append("right_Mirror_Horiz_");
        sb.append('=');
        sb.append(((this.right_Mirror_Horiz_ == null) ? "<null>" : this.right_Mirror_Horiz_));
        sb.append(',');
        sb.append("right_Mirror_Size");
        sb.append('=');
        sb.append(this.right_Mirror_Size);
        sb.append(',');
        sb.append("right_Mirror_Vert");
        sb.append('=');
        sb.append(this.right_Mirror_Vert);
        sb.append(',');
        sb.append("road_Reflections");
        sb.append('=');
        sb.append(this.road_Reflections);
        sb.append(',');
        sb.append("road_Reflections_");
        sb.append('=');
        sb.append(((this.road_Reflections_ == null) ? "<null>" : this.road_Reflections_));
        sb.append(',');
        sb.append("screenshot_Depth_Alpha");
        sb.append('=');
        sb.append(this.screenshot_Depth_Alpha);
        sb.append(',');
        sb.append("screenshot_Depth_Alpha_");
        sb.append('=');
        sb.append(((this.screenshot_Depth_Alpha_ == null) ? "<null>" : this.screenshot_Depth_Alpha_));
        sb.append(',');
        sb.append("screenshot_Format");
        sb.append('=');
        sb.append(this.screenshot_Format);
        sb.append(',');
        sb.append("screenshot_Format_");
        sb.append('=');
        sb.append(((this.screenshot_Format_ == null) ? "<null>" : this.screenshot_Format_));
        sb.append(',');
        sb.append("seat_Adjustment_Aft");
        sb.append('=');
        sb.append(this.seat_Adjustment_Aft);
        sb.append(',');
        sb.append("seat_Adjustment_Aft_");
        sb.append('=');
        sb.append(((this.seat_Adjustment_Aft_ == null) ? "<null>" : this.seat_Adjustment_Aft_));
        sb.append(',');
        sb.append("seat_Adjustment_Up");
        sb.append('=');
        sb.append(this.seat_Adjustment_Up);
        sb.append(',');
        sb.append("seat_Pitch");
        sb.append('=');
        sb.append(this.seat_Pitch);
        sb.append(',');
        sb.append("seat_Pitch_");
        sb.append('=');
        sb.append(((this.seat_Pitch_ == null) ? "<null>" : this.seat_Pitch_));
        sb.append(',');
        sb.append("seat_Roll");
        sb.append('=');
        sb.append(this.seat_Roll);
        sb.append(',');
        sb.append("seat_Roll_");
        sb.append('=');
        sb.append(((this.seat_Roll_ == null) ? "<null>" : this.seat_Roll_));
        sb.append(',');
        sb.append("seat_Yaw");
        sb.append('=');
        sb.append(this.seat_Yaw);
        sb.append(',');
        sb.append("seat_Yaw_");
        sb.append('=');
        sb.append(((this.seat_Yaw_ == null) ? "<null>" : this.seat_Yaw_));
        sb.append(',');
        sb.append("self_In_Rearview");
        sb.append('=');
        sb.append(((this.self_In_Rearview == null) ? "<null>" : this.self_In_Rearview));
        sb.append(',');
        sb.append("self_In_Rearview_");
        sb.append('=');
        sb.append(((this.self_In_Rearview_ == null) ? "<null>" : this.self_In_Rearview_));
        sb.append(',');
        sb.append("shadow_Blur");
        sb.append('=');
        sb.append(this.shadow_Blur);
        sb.append(',');
        sb.append("shadow_Blur_");
        sb.append('=');
        sb.append(((this.shadow_Blur_ == null) ? "<null>" : this.shadow_Blur_));
        sb.append(',');
        sb.append("shadows");
        sb.append('=');
        sb.append(this.shadows);
        sb.append(',');
        sb.append("shadows_");
        sb.append('=');
        sb.append(((this.shadows_ == null) ? "<null>" : this.shadows_));
        sb.append(',');
        sb.append("smoke_Flow");
        sb.append('=');
        sb.append(this.smoke_Flow);
        sb.append(',');
        sb.append("smoke_Flow_");
        sb.append('=');
        sb.append(((this.smoke_Flow_ == null) ? "<null>" : this.smoke_Flow_));
        sb.append(',');
        sb.append("soft_Particles");
        sb.append('=');
        sb.append(this.soft_Particles);
        sb.append(',');
        sb.append("soft_Particles_");
        sb.append('=');
        sb.append(((this.soft_Particles_ == null) ? "<null>" : this.soft_Particles_));
        sb.append(',');
        sb.append("spark_Flow");
        sb.append('=');
        sb.append(this.spark_Flow);
        sb.append(',');
        sb.append("spark_Flow_");
        sb.append('=');
        sb.append(((this.spark_Flow_ == null) ? "<null>" : this.spark_Flow_));
        sb.append(',');
        sb.append("special_FX");
        sb.append('=');
        sb.append(this.special_FX);
        sb.append(',');
        sb.append("special_FX_");
        sb.append('=');
        sb.append(((this.special_FX_ == null) ? "<null>" : this.special_FX_));
        sb.append(',');
        sb.append("stabilize_Horizon");
        sb.append('=');
        sb.append(this.stabilize_Horizon);
        sb.append(',');
        sb.append("stabilize_Horizon_");
        sb.append('=');
        sb.append(((this.stabilize_Horizon_ == null) ? "<null>" : this.stabilize_Horizon_));
        sb.append(',');
        sb.append("starting_View");
        sb.append('=');
        sb.append(this.starting_View);
        sb.append(',');
        sb.append("starting_View_");
        sb.append('=');
        sb.append(((this.starting_View_ == null) ? "<null>" : this.starting_View_));
        sb.append(',');
        sb.append("steady_Framerate_Thresh");
        sb.append('=');
        sb.append(this.steady_Framerate_Thresh);
        sb.append(',');
        sb.append("steady_Framerate_Thresh_");
        sb.append('=');
        sb.append(((this.steady_Framerate_Thresh_ == null) ? "<null>" : this.steady_Framerate_Thresh_));
        sb.append(',');
        sb.append("steering_Wheel");
        sb.append('=');
        sb.append(this.steering_Wheel);
        sb.append(',');
        sb.append("steering_Wheel_");
        sb.append('=');
        sb.append(((this.steering_Wheel_ == null) ? "<null>" : this.steering_Wheel_));
        sb.append(',');
        sb.append("sun_Occlusion");
        sb.append('=');
        sb.append(this.sun_Occlusion);
        sb.append(',');
        sb.append("sun_Occlusion_");
        sb.append('=');
        sb.append(((this.sun_Occlusion_ == null) ? "<null>" : this.sun_Occlusion_));
        sb.append(',');
        sb.append("synchronize_Frame");
        sb.append('=');
        sb.append(this.synchronize_Frame);
        sb.append(',');
        sb.append("synchronize_Frame_");
        sb.append('=');
        sb.append(((this.synchronize_Frame_ == null) ? "<null>" : this.synchronize_Frame_));
        sb.append(',');
        sb.append("texture_Detail");
        sb.append('=');
        sb.append(this.texture_Detail);
        sb.append(',');
        sb.append("texture_Detail_");
        sb.append('=');
        sb.append(((this.texture_Detail_ == null) ? "<null>" : this.texture_Detail_));
        sb.append(',');
        sb.append("texture_Filter");
        sb.append('=');
        sb.append(this.texture_Filter);
        sb.append(',');
        sb.append("texture_Filter_");
        sb.append('=');
        sb.append(((this.texture_Filter_ == null) ? "<null>" : this.texture_Filter_));
        sb.append(',');
        sb.append("texture_Sharpening");
        sb.append('=');
        sb.append(this.texture_Sharpening);
        sb.append(',');
        sb.append("texture_Sharpening_");
        sb.append('=');
        sb.append(((this.texture_Sharpening_ == null) ? "<null>" : this.texture_Sharpening_));
        sb.append(',');
        sb.append("thunder_Probability");
        sb.append('=');
        sb.append(this.thunder_Probability);
        sb.append(',');
        sb.append("thunder_Probability_");
        sb.append('=');
        sb.append(((this.thunder_Probability_ == null) ? "<null>" : this.thunder_Probability_));
        sb.append(',');
        sb.append("tire_Emitter_Flow");
        sb.append('=');
        sb.append(this.tire_Emitter_Flow);
        sb.append(',');
        sb.append("tire_Emitter_Flow_");
        sb.append('=');
        sb.append(((this.tire_Emitter_Flow_ == null) ? "<null>" : this.tire_Emitter_Flow_));
        sb.append(',');
        sb.append("tire_Ground_Offset");
        sb.append('=');
        sb.append(this.tire_Ground_Offset);
        sb.append(',');
        sb.append("tire_Ground_Offset_");
        sb.append('=');
        sb.append(((this.tire_Ground_Offset_ == null) ? "<null>" : this.tire_Ground_Offset_));
        sb.append(',');
        sb.append("track_Detail");
        sb.append('=');
        sb.append(this.track_Detail);
        sb.append(',');
        sb.append("transparency_AA");
        sb.append('=');
        sb.append(this.transparency_AA);
        sb.append(',');
        sb.append("transparency_AA_");
        sb.append('=');
        sb.append(((this.transparency_AA_ == null) ? "<null>" : this.transparency_AA_));
        sb.append(',');
        sb.append("uI_Background_Animation");
        sb.append('=');
        sb.append(this.uI_Background_Animation);
        sb.append(',');
        sb.append("uI_autonomous_render_thread");
        sb.append('=');
        sb.append(this.uI_autonomous_render_thread);
        sb.append(',');
        sb.append("uI_autonomous_render_thread_");
        sb.append('=');
        sb.append(((this.uI_autonomous_render_thread_ == null) ? "<null>" : this.uI_autonomous_render_thread_));
        sb.append(',');
        sb.append("vR_Enable_Hidden_Area_Mask");
        sb.append('=');
        sb.append(this.vR_Enable_Hidden_Area_Mask);
        sb.append(',');
        sb.append("vR_Enable_Hidden_Area_Mask_");
        sb.append('=');
        sb.append(((this.vR_Enable_Hidden_Area_Mask_ == null) ? "<null>" : this.vR_Enable_Hidden_Area_Mask_));
        sb.append(',');
        sb.append("vR_IPD_Scale");
        sb.append('=');
        sb.append(this.vR_IPD_Scale);
        sb.append(',');
        sb.append("vR_IPD_Scale_");
        sb.append('=');
        sb.append(((this.vR_IPD_Scale_ == null) ? "<null>" : this.vR_IPD_Scale_));
        sb.append(',');
        sb.append("vR_Projection_Mode");
        sb.append('=');
        sb.append(this.vR_Projection_Mode);
        sb.append(',');
        sb.append("vR_Projection_Mode_");
        sb.append('=');
        sb.append(((this.vR_Projection_Mode_ == null) ? "<null>" : this.vR_Projection_Mode_));
        sb.append(',');
        sb.append("vehicle_Flow_Offset");
        sb.append('=');
        sb.append(this.vehicle_Flow_Offset);
        sb.append(',');
        sb.append("vehicle_Flow_Offset_");
        sb.append('=');
        sb.append(((this.vehicle_Flow_Offset_ == null) ? "<null>" : this.vehicle_Flow_Offset_));
        sb.append(',');
        sb.append("vehicle_Flow_Radius");
        sb.append('=');
        sb.append(this.vehicle_Flow_Radius);
        sb.append(',');
        sb.append("vehicle_Flow_Radius_");
        sb.append('=');
        sb.append(((this.vehicle_Flow_Radius_ == null) ? "<null>" : this.vehicle_Flow_Radius_));
        sb.append(',');
        sb.append("verify_Refs");
        sb.append('=');
        sb.append(this.verify_Refs);
        sb.append(',');
        sb.append("verify_Refs_");
        sb.append('=');
        sb.append(((this.verify_Refs_ == null) ? "<null>" : this.verify_Refs_));
        sb.append(',');
        sb.append("vertical_FOV_Degrees");
        sb.append('=');
        sb.append(this.vertical_FOV_Degrees);
        sb.append(',');
        sb.append("vertical_FOV_Degrees_");
        sb.append('=');
        sb.append(((this.vertical_FOV_Degrees_ == null) ? "<null>" : this.vertical_FOV_Degrees_));
        sb.append(',');
        sb.append("virtual_Rearview_In_Cockpit");
        sb.append('=');
        sb.append(this.virtual_Rearview_In_Cockpit);
        sb.append(',');
        sb.append("virtual_Rearview_In_Cockpit_");
        sb.append('=');
        sb.append(((this.virtual_Rearview_In_Cockpit_ == null) ? "<null>" : this.virtual_Rearview_In_Cockpit_));
        sb.append(',');
        sb.append("warning_Light_Anim_Speed");
        sb.append('=');
        sb.append(this.warning_Light_Anim_Speed);
        sb.append(',');
        sb.append("warning_Light_Anim_Speed_");
        sb.append('=');
        sb.append(((this.warning_Light_Anim_Speed_ == null) ? "<null>" : this.warning_Light_Anim_Speed_));
        sb.append(',');
        sb.append("widescreen_Overlays");
        sb.append('=');
        sb.append(this.widescreen_Overlays);
        sb.append(',');
        sb.append("wind_and_Crowd_Motion");
        sb.append('=');
        sb.append(this.wind_and_Crowd_Motion);
        sb.append(',');
        sb.append("wind_and_Crowd_Motion_");
        sb.append('=');
        sb.append(((this.wind_and_Crowd_Motion_ == null) ? "<null>" : this.wind_and_Crowd_Motion_));
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
        result = ((result * 31) + ((this.auto_Detail_Framerate_ == null) ? 0 : this.auto_Detail_Framerate_.hashCode()));
        result = ((result * 31) + this.seat_Yaw);
        result = ((result * 31) + (this.dynamic_Vertex_Buffers ? 1 : 0));
        result = ((result * 31) + (this.rearview_Independent ? 1 : 0));
        result = ((result * 31) + ((this.transparency_AA_ == null) ? 0 : this.transparency_AA_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.seat_Adjustment_Up));
        result = ((result * 31) + this.right_Mirror_Horiz);
        result = ((result * 31) + this.seat_Adjustment_Aft);
        result = ((result * 31) + this.hUD_Tachometer);
        result = ((result * 31) + ((this.lCD_Display_Modes_ == null) ? 0 : this.lCD_Display_Modes_.hashCode()));
        result = ((result * 31) + this.max_Framerate);
        result = ((result * 31) + this.rain_FX_Quality);
        result = ((result * 31) + ((this.lookahead_Angle_ == null) ? 0 : this.lookahead_Angle_.hashCode()));
        result = ((result * 31) + ((this.rearview_Onboard_ == null) ? 0 : this.rearview_Onboard_.hashCode()));
        result = ((result * 31) + this.texture_Detail);
        result = ((result * 31) + ((this.tire_Emitter_Flow_ == null) ? 0 : this.tire_Emitter_Flow_.hashCode()));
        result = ((result * 31) + ((this.garage_Detail_ == null) ? 0 : this.garage_Detail_.hashCode()));
        result = ((result * 31) + this.player_Texture_Override);
        result = ((result * 31) + ((this.glance_Angle_ == null) ? 0 : this.glance_Angle_.hashCode()));
        result = ((result * 31) + ((this.headlights_On_Cars_ == null) ? 0 : this.headlights_On_Cars_.hashCode()));
        result = ((result * 31) + this.automap);
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.pitcrew_Detail_Level_ == null) ? 0 : this.pitcrew_Detail_Level_.hashCode()));
        result = ((result * 31) + ((this.soft_Particles_ == null) ? 0 : this.soft_Particles_.hashCode()));
        result = ((result * 31) + ((this.warning_Light_Anim_Speed_ == null) ? 0 : this.warning_Light_Anim_Speed_.hashCode()));
        result = ((result * 31) + ((this.rearview_Back_Clip_ == null) ? 0 : this.rearview_Back_Clip_.hashCode()));
        result = ((result * 31) + ((this.texture_Filter_ == null) ? 0 : this.texture_Filter_.hashCode()));
        result = ((result * 31) + this.rearview_Width);
        result = ((result * 31) + this.starting_View);
        result = ((result * 31) + ((this.center_Mirror_Horiz_ == null) ? 0 : this.center_Mirror_Horiz_.hashCode()));
        result = ((result * 31) + this.left_Mirror_Vert);
        result = ((result * 31) + this.backfire_Anim_Speed);
        result = ((result * 31) + ((this.enable_Legacy_HDR_Profiles_ == null) ? 0 : this.enable_Legacy_HDR_Profiles_.hashCode()));
        result = ((result * 31) + ((this.look_Roll_Angle_ == null) ? 0 : this.look_Roll_Angle_.hashCode()));
        result = ((result * 31) + ((this.texture_Detail_ == null) ? 0 : this.texture_Detail_.hashCode()));
        result = ((result * 31) + ((this.self_In_Rearview == null) ? 0 : this.self_In_Rearview.hashCode()));
        result = ((result * 31) + ((this.allow_Letterboxing_ == null) ? 0 : this.allow_Letterboxing_.hashCode()));
        result = ((result * 31) + ((this.sun_Occlusion_ == null) ? 0 : this.sun_Occlusion_.hashCode()));
        result = ((result * 31) + this.texture_Sharpening);
        result = ((result * 31) + Float.floatToIntBits(this.look_Up_Down_Angle));
        result = ((result * 31) + this.car_Vibration_Mult2);
        result = ((result * 31) + this.car_Vibration_Mult1);
        result = ((result * 31) + ((this.vR_Projection_Mode_ == null) ? 0 : this.vR_Projection_Mode_.hashCode()));
        result = ((result * 31) + this.center_Mirror_Vert);
        result = ((result * 31) + ((this.player_Detail_ == null) ? 0 : this.player_Detail_.hashCode()));
        result = ((result * 31) + ((this.display_Vehicle_Labels_ == null) ? 0 : this.display_Vehicle_Labels_.hashCode()));
        result = ((result * 31) + this.screenshot_Format);
        result = ((result * 31) + ((this.verify_Refs_ == null) ? 0 : this.verify_Refs_.hashCode()));
        result = ((result * 31) + this.tire_Ground_Offset);
        result = ((result * 31) + (this.sun_Occlusion ? 1 : 0));
        result = ((result * 31) + ((this.lightning_Probability_ == null) ? 0 : this.lightning_Probability_.hashCode()));
        result = ((result * 31) + ((this.rain_FX_Quality_ == null) ? 0 : this.rain_FX_Quality_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.glance_Angle));
        result = ((result * 31) + ((this.starting_View_ == null) ? 0 : this.starting_View_.hashCode()));
        result = ((result * 31) + ((this.exaggerate_Yaw_ == null) ? 0 : this.exaggerate_Yaw_.hashCode()));
        result = ((result * 31) + (this.headlights_On_Cars ? 1 : 0));
        result = ((result * 31) + (this.enable_Legacy_HDR_Profiles ? 1 : 0));
        result = ((result * 31) + this.special_FX);
        result = ((result * 31) + ((this.left_Mirror_Horiz_ == null) ? 0 : this.left_Mirror_Horiz_.hashCode()));
        result = ((result * 31) + ((this.max_Headlights_ == null) ? 0 : this.max_Headlights_.hashCode()));
        result = ((result * 31) + this.display_Vehicle_Labels);
        result = ((result * 31) + ((this.hUD_file == null) ? 0 : this.hUD_file.hashCode()));
        result = ((result * 31) + this.mIP_Mapping);
        result = ((result * 31) + this.stabilize_Horizon);
        result = ((result * 31) + ((this.texture_Sharpening_ == null) ? 0 : this.texture_Sharpening_.hashCode()));
        result = ((result * 31) + ((this.right_Mirror_Horiz_ == null) ? 0 : this.right_Mirror_Horiz_.hashCode()));
        result = ((result * 31) + ((this.hUD_Component == null) ? 0 : this.hUD_Component.hashCode()));
        result = ((result * 31) + (this.smoke_Flow ? 1 : 0));
        result = ((result * 31) + this.gap_Check);
        result = ((result * 31) + (this.rearview_Particles ? 1 : 0));
        result = ((result * 31) + this.center_Mirror_Horiz);
        result = ((result * 31) + this.rearview_Back_Clip);
        result = ((result * 31) + ((this.box_Outline_ == null) ? 0 : this.box_Outline_.hashCode()));
        result = ((result * 31) + ((this.extra_Visible_Vehicles_ == null) ? 0 : this.extra_Visible_Vehicles_.hashCode()));
        result = ((result * 31) + this.max_Headlights);
        result = ((result * 31) + (this.delay_Video_Swap ? 1 : 0));
        result = ((result * 31) + ((this.cockpit_Vibration_Freq2_ == null) ? 0 : this.cockpit_Vibration_Freq2_.hashCode()));
        result = ((result * 31) + this.render_Once_Per_VSync);
        result = ((result * 31) + ((this.heat_FX_Fade_Speed_ == null) ? 0 : this.heat_FX_Fade_Speed_.hashCode()));
        result = ((result * 31) + (this.always_Rebuild_Collision ? 1 : 0));
        result = ((result * 31) + this.lCD_Display_Modes);
        result = ((result * 31) + Float.floatToIntBits(this.rearview_Height));
        result = ((result * 31) + ((this.environment_Reflections_ == null) ? 0 : this.environment_Reflections_.hashCode()));
        result = ((result * 31) + this.spark_Flow);
        result = ((result * 31) + ((this.seat_Yaw_ == null) ? 0 : this.seat_Yaw_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.vR_IPD_Scale));
        result = ((result * 31) + ((this.overlay_Z_Bias_ == null) ? 0 : this.overlay_Z_Bias_.hashCode()));
        result = ((result * 31) + (this.widescreen_Overlays ? 1 : 0));
        result = ((result * 31) + ((this.wind_and_Crowd_Motion_ == null) ? 0 : this.wind_and_Crowd_Motion_.hashCode()));
        result = ((result * 31) + this.glance_Rate);
        result = ((result * 31) + ((this.stabilize_Horizon_ == null) ? 0 : this.stabilize_Horizon_.hashCode()));
        result = ((result * 31) + this.raindrop_Flow);
        result = ((result * 31) + ((this.cockpit_Vibration_Freq1_ == null) ? 0 : this.cockpit_Vibration_Freq1_.hashCode()));
        result = ((result * 31) + ((this.max_Framerate_ == null) ? 0 : this.max_Framerate_.hashCode()));
        result = ((result * 31) + (this.vR_Enable_Hidden_Area_Mask ? 1 : 0));
        result = ((result * 31) + this.vertical_FOV_Degrees);
        result = ((result * 31) + ((this.seat_Adjustment_Aft_ == null) ? 0 : this.seat_Adjustment_Aft_.hashCode()));
        result = ((result * 31) + this.rainspray_Flow);
        result = ((result * 31) + this.texture_Filter);
        result = ((result * 31) + ((this.full_Tire_Shader_ == null) ? 0 : this.full_Tire_Shader_.hashCode()));
        result = ((result * 31) + this.lightning_Probability);
        result = ((result * 31) + Float.floatToIntBits(this.mirror_Adjustment_Vert));
        result = ((result * 31) + Float.floatToIntBits(this.vehicle_Flow_Offset));
        result = ((result * 31) + this.left_Mirror_Horiz);
        result = ((result * 31) + ((this.rearview_Cull_ == null) ? 0 : this.rearview_Cull_.hashCode()));
        result = ((result * 31) + this.shadow_Blur);
        result = ((result * 31) + ((this.glance_Rate_ == null) ? 0 : this.glance_Rate_.hashCode()));
        result = ((result * 31) + (this.allow_HUD_in_cockpit ? 1 : 0));
        result = ((result * 31) + Float.floatToIntBits(this.rearview_Front_Clip));
        result = ((result * 31) + ((this.delay_Video_Swap_ == null) ? 0 : this.delay_Video_Swap_.hashCode()));
        result = ((result * 31) + this.hUD);
        result = ((result * 31) + this.heat_FX_Fade_Speed);
        result = ((result * 31) + this.hUD_MFD);
        result = ((result * 31) + this.box_Outline);
        result = ((result * 31) + (this.any_Camera_HUD ? 1 : 0));
        result = ((result * 31) + (this.screenshot_Depth_Alpha ? 1 : 0));
        result = ((result * 31) + this.display_Icons);
        result = ((result * 31) + this.head_Physics);
        result = ((result * 31) + ((this.shadow_Blur_ == null) ? 0 : this.shadow_Blur_.hashCode()));
        result = ((result * 31) + ((this.screenshot_Depth_Alpha_ == null) ? 0 : this.screenshot_Depth_Alpha_.hashCode()));
        result = ((result * 31) + this.hUD_Race_Stats);
        result = ((result * 31) + ((this.any_Camera_HUD_ == null) ? 0 : this.any_Camera_HUD_.hashCode()));
        result = ((result * 31) + ((this.hUD_Component_Version == null) ? 0 : this.hUD_Component_Version.hashCode()));
        result = ((result * 31) + (this.transparency_AA ? 1 : 0));
        result = ((result * 31) + this.rearview_Onboard);
        result = ((result * 31) + this.track_Detail);
        result = ((result * 31) + (this.virtual_Rearview_In_Cockpit ? 1 : 0));
        result = ((result * 31) + this.synchronize_Frame);
        result = ((result * 31) + this.leanahead_Angle);
        result = ((result * 31) + this.center_Mirror_Size);
        result = ((result * 31) + this.uI_Background_Animation);
        result = ((result * 31) + ((this.seat_Pitch_ == null) ? 0 : this.seat_Pitch_.hashCode()));
        result = ((result * 31) + ((this.overlay_Height_Offset_ == null) ? 0 : this.overlay_Height_Offset_.hashCode()));
        result = ((result * 31) + ((this.rearview_Width_ == null) ? 0 : this.rearview_Width_.hashCode()));
        result = ((result * 31) + (this.wind_and_Crowd_Motion ? 1 : 0));
        result = ((result * 31) + this.rearview_Driving);
        result = ((result * 31) + ((this.raindrop_Flow_ == null) ? 0 : this.raindrop_Flow_.hashCode()));
        result = ((result * 31) + this.seat_Pitch);
        result = ((result * 31) + this.moving_Rearview);
        result = ((result * 31) + ((this.thunder_Probability_ == null) ? 0 : this.thunder_Probability_.hashCode()));
        result = ((result * 31) + ((this.vehicle_Flow_Radius_ == null) ? 0 : this.vehicle_Flow_Radius_.hashCode()));
        result = ((result * 31) + this.shadows);
        result = ((result * 31) + (this.rearview_Cull ? 1 : 0));
        result = ((result * 31) + ((this.rearview_Independent_ == null) ? 0 : this.rearview_Independent_.hashCode()));
        result = ((result * 31) + ((this.load_Opponent_Cockpits_ == null) ? 0 : this.load_Opponent_Cockpits_.hashCode()));
        result = ((result * 31) + ((this.vehicle_Flow_Offset_ == null) ? 0 : this.vehicle_Flow_Offset_.hashCode()));
        result = ((result * 31) + this.mirror_Physical_Z);
        result = ((result * 31) + this.logo_Seconds);
        result = ((result * 31) + this.mirror_Physical_Y);
        result = ((result * 31) + this.low_Detail_UI);
        result = ((result * 31) + this.mirror_Physical_X);
        result = ((result * 31) + ((this.special_FX_ == null) ? 0 : this.special_FX_.hashCode()));
        result = ((result * 31) + ((this.mirror_Adjustment_Horiz_ == null) ? 0 : this.mirror_Adjustment_Horiz_.hashCode()));
        result = ((result * 31) + ((this.car_Vibration_Mult1_ == null) ? 0 : this.car_Vibration_Mult1_.hashCode()));
        result = ((result * 31) + ((this.head_Rotation_ == null) ? 0 : this.head_Rotation_.hashCode()));
        result = ((result * 31) + ((this.logo_Seconds_ == null) ? 0 : this.logo_Seconds_.hashCode()));
        result = ((result * 31) + this.right_Mirror_Size);
        result = ((result * 31) + this.warning_Light_Anim_Speed);
        result = ((result * 31) + ((this.mirror_Physical_X_ == null) ? 0 : this.mirror_Physical_X_.hashCode()));
        result = ((result * 31) + this.compressed_Textures);
        result = ((result * 31) + ((this.opponent_Texture_Override_ == null) ? 0 : this.opponent_Texture_Override_.hashCode()));
        result = ((result * 31) + this.cockpit_Vibration_Mult1);
        result = ((result * 31) + this.overlay_Z_Bias);
        result = ((result * 31) + this.cockpit_Vibration_Mult2);
        result = ((result * 31) + ((this.self_In_Rearview_ == null) ? 0 : this.self_In_Rearview_.hashCode()));
        result = ((result * 31) + ((this.vertical_FOV_Degrees_ == null) ? 0 : this.vertical_FOV_Degrees_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.mirror_Adjustment_Horiz));
        result = ((result * 31) + this.rearview_Swingman);
        result = ((result * 31) + ((this.head_Physics_ == null) ? 0 : this.head_Physics_.hashCode()));
        result = ((result * 31) + this.left_Mirror_Size);
        result = ((result * 31) + this.steady_Framerate_Thresh);
        result = ((result * 31) + ((this.moving_Rearview_ == null) ? 0 : this.moving_Rearview_.hashCode()));
        result = ((result * 31) + ((this.car_Vibration_Mult2_ == null) ? 0 : this.car_Vibration_Mult2_.hashCode()));
        result = ((result * 31) + (this.full_Tire_Shader ? 1 : 0));
        result = ((result * 31) + ((this.mirror_Physical_Y_ == null) ? 0 : this.mirror_Physical_Y_.hashCode()));
        result = ((result * 31) + ((this.player_Livery == null) ? 0 : this.player_Livery.hashCode()));
        result = ((result * 31) + ((this.vR_IPD_Scale_ == null) ? 0 : this.vR_IPD_Scale_.hashCode()));
        result = ((result * 31) + this.steering_Wheel);
        result = ((result * 31) + (this.uI_autonomous_render_thread ? 1 : 0));
        result = ((result * 31) + ((this.always_Rebuild_Collision_ == null) ? 0 : this.always_Rebuild_Collision_.hashCode()));
        result = ((result * 31) + ((this.automap_ == null) ? 0 : this.automap_.hashCode()));
        result = ((result * 31) + this.environment_Reflections);
        result = ((result * 31) + ((this.rearview_Front_Clip_ == null) ? 0 : this.rearview_Front_Clip_.hashCode()));
        result = ((result * 31) + ((this.steady_Framerate_Thresh_ == null) ? 0 : this.steady_Framerate_Thresh_.hashCode()));
        result = ((result * 31) + this.right_Mirror_Vert);
        result = ((result * 31) + ((this.synchronize_Frame_ == null) ? 0 : this.synchronize_Frame_.hashCode()));
        result = ((result * 31) + this.opponent_Texture_Override);
        result = ((result * 31) + ((this.shadows_ == null) ? 0 : this.shadows_.hashCode()));
        result = ((result * 31) + this.soft_Particles);
        result = ((result * 31) + this.vehicle_Flow_Radius);
        result = ((result * 31) + this.cockpit_Vibration_Freq1);
        result = ((result * 31) + this.cockpit_Vibration_Freq2);
        result = ((result * 31) + ((this.render_Once_Per_VSync_ == null) ? 0 : this.render_Once_Per_VSync_.hashCode()));
        result = ((result * 31) + ((this.steering_Wheel_ == null) ? 0 : this.steering_Wheel_.hashCode()));
        result = ((result * 31) + this.vR_Projection_Mode);
        result = ((result * 31) + ((this.look_Up_Down_Angle_ == null) ? 0 : this.look_Up_Down_Angle_.hashCode()));
        result = ((result * 31) + ((this.player_Texture_Override_ == null) ? 0 : this.player_Texture_Override_.hashCode()));
        result = ((result * 31) + this.auto_Detail_Framerate);
        result = ((result * 31) + ((this.spark_Flow_ == null) ? 0 : this.spark_Flow_.hashCode()));
        result = ((result * 31) + this.head_Rotation);
        result = ((result * 31) + this.extra_Visible_Vehicles);
        result = ((result * 31) + ((this.rearview_Driving_ == null) ? 0 : this.rearview_Driving_.hashCode()));
        result = ((result * 31) + this.player_Detail);
        result = ((result * 31) + this.pitcrew_Detail_Level);
        result = ((result * 31) + this.max_Visible_Vehicles);
        result = ((result * 31) + ((this.gap_Check_ == null) ? 0 : this.gap_Check_.hashCode()));
        result = ((result * 31) + ((this.real_Road_System_ == null) ? 0 : this.real_Road_System_.hashCode()));
        result = ((result * 31) + ((this.leanahead_Angle_ == null) ? 0 : this.leanahead_Angle_.hashCode()));
        result = ((result * 31) + (this.allow_Letterboxing ? 1 : 0));
        result = ((result * 31) + this.seat_Roll);
        result = ((result * 31) + (this.verify_Refs ? 1 : 0));
        result = ((result * 31) + (this.real_Road_System ? 1 : 0));
        result = ((result * 31) + ((this.lSI_Top_ == null) ? 0 : this.lSI_Top_.hashCode()));
        result = ((result * 31) + this.partial_Cockpit_View);
        result = ((result * 31) + ((this.partial_Cockpit_View_ == null) ? 0 : this.partial_Cockpit_View_.hashCode()));
        result = ((result * 31) + ((this.virtual_Rearview_In_Cockpit_ == null) ? 0 : this.virtual_Rearview_In_Cockpit_.hashCode()));
        result = ((result * 31) + this.groove);
        result = ((result * 31) + ((this.cockpit_Vibration_Mult1_ == null) ? 0 : this.cockpit_Vibration_Mult1_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.overlay_Height_Offset));
        result = ((result * 31) + ((this.screenshot_Format_ == null) ? 0 : this.screenshot_Format_.hashCode()));
        result = ((result * 31) + ((this.smoke_Flow_ == null) ? 0 : this.smoke_Flow_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.lSI_Top));
        result = ((result * 31) + ((this.road_Reflections_ == null) ? 0 : this.road_Reflections_.hashCode()));
        result = ((result * 31) + (this.load_Opponent_Cockpits ? 1 : 0));
        result = ((result * 31) + (this.tire_Emitter_Flow ? 1 : 0));
        result = ((result * 31) + ((this.dynamic_Vertex_Buffers_ == null) ? 0 : this.dynamic_Vertex_Buffers_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.garage_Detail));
        result = ((result * 31) + this.lookahead_Angle);
        result = ((result * 31) + this.broadcast_Overlay);
        result = ((result * 31) + this.exaggerate_Yaw);
        result = ((result * 31) + (this.engine_Emitter_Flow ? 1 : 0));
        result = ((result * 31) + ((this.rainspray_Flow_ == null) ? 0 : this.rainspray_Flow_.hashCode()));
        result = ((result * 31) + ((this.seat_Roll_ == null) ? 0 : this.seat_Roll_.hashCode()));
        result = ((result * 31) + ((this.rearview_Swingman_ == null) ? 0 : this.rearview_Swingman_.hashCode()));
        result = ((result * 31) + ((this.player_Livery_ == null) ? 0 : this.player_Livery_.hashCode()));
        result = ((result * 31) + ((this.uI_autonomous_render_thread_ == null) ? 0 : this.uI_autonomous_render_thread_.hashCode()));
        result = ((result * 31) + this.opponent_Detail);
        result = ((result * 31) + ((this.cockpit_Vibration_Mult2_ == null) ? 0 : this.cockpit_Vibration_Mult2_.hashCode()));
        result = ((result * 31) + ((this.engine_Emitter_Flow_ == null) ? 0 : this.engine_Emitter_Flow_.hashCode()));
        result = ((result * 31) + Float.floatToIntBits(this.look_Roll_Angle));
        result = ((result * 31) + ((this.vR_Enable_Hidden_Area_Mask_ == null) ? 0 : this.vR_Enable_Hidden_Area_Mask_.hashCode()));
        result = ((result * 31) + this.road_Reflections);
        result = ((result * 31) + Float.floatToIntBits(this.thunder_Probability));
        result = ((result * 31) + ((this.tire_Ground_Offset_ == null) ? 0 : this.tire_Ground_Offset_.hashCode()));
        result = ((result * 31) + ((this.display_Icons_ == null) ? 0 : this.display_Icons_.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GraphicOptions) == false) {
            return false;
        }
        GraphicOptions rhs = ((GraphicOptions) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.auto_Detail_Framerate_ == rhs.auto_Detail_Framerate_) || ((this.auto_Detail_Framerate_ != null) && this.auto_Detail_Framerate_.equals(rhs.auto_Detail_Framerate_))) && (this.seat_Yaw == rhs.seat_Yaw)) && (this.dynamic_Vertex_Buffers == rhs.dynamic_Vertex_Buffers)) && (this.rearview_Independent == rhs.rearview_Independent)) && ((this.transparency_AA_ == rhs.transparency_AA_) || ((this.transparency_AA_ != null) && this.transparency_AA_.equals(rhs.transparency_AA_)))) && (Float.floatToIntBits(this.seat_Adjustment_Up) == Float.floatToIntBits(rhs.seat_Adjustment_Up))) && (this.right_Mirror_Horiz == rhs.right_Mirror_Horiz)) && (this.seat_Adjustment_Aft == rhs.seat_Adjustment_Aft)) && (this.hUD_Tachometer == rhs.hUD_Tachometer)) && ((this.lCD_Display_Modes_ == rhs.lCD_Display_Modes_) || ((this.lCD_Display_Modes_ != null) && this.lCD_Display_Modes_.equals(rhs.lCD_Display_Modes_)))) && (this.max_Framerate == rhs.max_Framerate)) && (this.rain_FX_Quality == rhs.rain_FX_Quality)) && ((this.lookahead_Angle_ == rhs.lookahead_Angle_) || ((this.lookahead_Angle_ != null) && this.lookahead_Angle_.equals(rhs.lookahead_Angle_)))) && ((this.rearview_Onboard_ == rhs.rearview_Onboard_) || ((this.rearview_Onboard_ != null) && this.rearview_Onboard_.equals(rhs.rearview_Onboard_)))) && (this.texture_Detail == rhs.texture_Detail)) && ((this.tire_Emitter_Flow_ == rhs.tire_Emitter_Flow_) || ((this.tire_Emitter_Flow_ != null) && this.tire_Emitter_Flow_.equals(rhs.tire_Emitter_Flow_)))) && ((this.garage_Detail_ == rhs.garage_Detail_) || ((this.garage_Detail_ != null) && this.garage_Detail_.equals(rhs.garage_Detail_)))) && (this.player_Texture_Override == rhs.player_Texture_Override)) && ((this.glance_Angle_ == rhs.glance_Angle_) || ((this.glance_Angle_ != null) && this.glance_Angle_.equals(rhs.glance_Angle_)))) && ((this.headlights_On_Cars_ == rhs.headlights_On_Cars_) || ((this.headlights_On_Cars_ != null) && this.headlights_On_Cars_.equals(rhs.headlights_On_Cars_)))) && (this.automap == rhs.automap)) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.pitcrew_Detail_Level_ == rhs.pitcrew_Detail_Level_) || ((this.pitcrew_Detail_Level_ != null) && this.pitcrew_Detail_Level_.equals(rhs.pitcrew_Detail_Level_)))) && ((this.soft_Particles_ == rhs.soft_Particles_) || ((this.soft_Particles_ != null) && this.soft_Particles_.equals(rhs.soft_Particles_)))) && ((this.warning_Light_Anim_Speed_ == rhs.warning_Light_Anim_Speed_) || ((this.warning_Light_Anim_Speed_ != null) && this.warning_Light_Anim_Speed_.equals(rhs.warning_Light_Anim_Speed_)))) && ((this.rearview_Back_Clip_ == rhs.rearview_Back_Clip_) || ((this.rearview_Back_Clip_ != null) && this.rearview_Back_Clip_.equals(rhs.rearview_Back_Clip_)))) && ((this.texture_Filter_ == rhs.texture_Filter_) || ((this.texture_Filter_ != null) && this.texture_Filter_.equals(rhs.texture_Filter_)))) && (this.rearview_Width == rhs.rearview_Width)) && (this.starting_View == rhs.starting_View)) && ((this.center_Mirror_Horiz_ == rhs.center_Mirror_Horiz_) || ((this.center_Mirror_Horiz_ != null) && this.center_Mirror_Horiz_.equals(rhs.center_Mirror_Horiz_)))) && (this.left_Mirror_Vert == rhs.left_Mirror_Vert)) && (this.backfire_Anim_Speed == rhs.backfire_Anim_Speed)) && ((this.enable_Legacy_HDR_Profiles_ == rhs.enable_Legacy_HDR_Profiles_) || ((this.enable_Legacy_HDR_Profiles_ != null) && this.enable_Legacy_HDR_Profiles_.equals(rhs.enable_Legacy_HDR_Profiles_)))) && ((this.look_Roll_Angle_ == rhs.look_Roll_Angle_) || ((this.look_Roll_Angle_ != null) && this.look_Roll_Angle_.equals(rhs.look_Roll_Angle_)))) && ((this.texture_Detail_ == rhs.texture_Detail_) || ((this.texture_Detail_ != null) && this.texture_Detail_.equals(rhs.texture_Detail_)))) && ((this.self_In_Rearview == rhs.self_In_Rearview) || ((this.self_In_Rearview != null) && this.self_In_Rearview.equals(rhs.self_In_Rearview)))) && ((this.allow_Letterboxing_ == rhs.allow_Letterboxing_) || ((this.allow_Letterboxing_ != null) && this.allow_Letterboxing_.equals(rhs.allow_Letterboxing_)))) && ((this.sun_Occlusion_ == rhs.sun_Occlusion_) || ((this.sun_Occlusion_ != null) && this.sun_Occlusion_.equals(rhs.sun_Occlusion_)))) && (this.texture_Sharpening == rhs.texture_Sharpening)) && (Float.floatToIntBits(this.look_Up_Down_Angle) == Float.floatToIntBits(rhs.look_Up_Down_Angle))) && (this.car_Vibration_Mult2 == rhs.car_Vibration_Mult2)) && (this.car_Vibration_Mult1 == rhs.car_Vibration_Mult1)) && ((this.vR_Projection_Mode_ == rhs.vR_Projection_Mode_) || ((this.vR_Projection_Mode_ != null) && this.vR_Projection_Mode_.equals(rhs.vR_Projection_Mode_)))) && (this.center_Mirror_Vert == rhs.center_Mirror_Vert)) && ((this.player_Detail_ == rhs.player_Detail_) || ((this.player_Detail_ != null) && this.player_Detail_.equals(rhs.player_Detail_)))) && ((this.display_Vehicle_Labels_ == rhs.display_Vehicle_Labels_) || ((this.display_Vehicle_Labels_ != null) && this.display_Vehicle_Labels_.equals(rhs.display_Vehicle_Labels_)))) && (this.screenshot_Format == rhs.screenshot_Format)) && ((this.verify_Refs_ == rhs.verify_Refs_) || ((this.verify_Refs_ != null) && this.verify_Refs_.equals(rhs.verify_Refs_)))) && (this.tire_Ground_Offset == rhs.tire_Ground_Offset)) && (this.sun_Occlusion == rhs.sun_Occlusion)) && ((this.lightning_Probability_ == rhs.lightning_Probability_) || ((this.lightning_Probability_ != null) && this.lightning_Probability_.equals(rhs.lightning_Probability_)))) && ((this.rain_FX_Quality_ == rhs.rain_FX_Quality_) || ((this.rain_FX_Quality_ != null) && this.rain_FX_Quality_.equals(rhs.rain_FX_Quality_)))) && (Float.floatToIntBits(this.glance_Angle) == Float.floatToIntBits(rhs.glance_Angle))) && ((this.starting_View_ == rhs.starting_View_) || ((this.starting_View_ != null) && this.starting_View_.equals(rhs.starting_View_)))) && ((this.exaggerate_Yaw_ == rhs.exaggerate_Yaw_) || ((this.exaggerate_Yaw_ != null) && this.exaggerate_Yaw_.equals(rhs.exaggerate_Yaw_)))) && (this.headlights_On_Cars == rhs.headlights_On_Cars)) && (this.enable_Legacy_HDR_Profiles == rhs.enable_Legacy_HDR_Profiles)) && (this.special_FX == rhs.special_FX)) && ((this.left_Mirror_Horiz_ == rhs.left_Mirror_Horiz_) || ((this.left_Mirror_Horiz_ != null) && this.left_Mirror_Horiz_.equals(rhs.left_Mirror_Horiz_)))) && ((this.max_Headlights_ == rhs.max_Headlights_) || ((this.max_Headlights_ != null) && this.max_Headlights_.equals(rhs.max_Headlights_)))) && (this.display_Vehicle_Labels == rhs.display_Vehicle_Labels)) && ((this.hUD_file == rhs.hUD_file) || ((this.hUD_file != null) && this.hUD_file.equals(rhs.hUD_file)))) && (this.mIP_Mapping == rhs.mIP_Mapping)) && (this.stabilize_Horizon == rhs.stabilize_Horizon)) && ((this.texture_Sharpening_ == rhs.texture_Sharpening_) || ((this.texture_Sharpening_ != null) && this.texture_Sharpening_.equals(rhs.texture_Sharpening_)))) && ((this.right_Mirror_Horiz_ == rhs.right_Mirror_Horiz_) || ((this.right_Mirror_Horiz_ != null) && this.right_Mirror_Horiz_.equals(rhs.right_Mirror_Horiz_)))) && ((this.hUD_Component == rhs.hUD_Component) || ((this.hUD_Component != null) && this.hUD_Component.equals(rhs.hUD_Component)))) && (this.smoke_Flow == rhs.smoke_Flow)) && (this.gap_Check == rhs.gap_Check)) && (this.rearview_Particles == rhs.rearview_Particles)) && (this.center_Mirror_Horiz == rhs.center_Mirror_Horiz)) && (this.rearview_Back_Clip == rhs.rearview_Back_Clip)) && ((this.box_Outline_ == rhs.box_Outline_) || ((this.box_Outline_ != null) && this.box_Outline_.equals(rhs.box_Outline_)))) && ((this.extra_Visible_Vehicles_ == rhs.extra_Visible_Vehicles_) || ((this.extra_Visible_Vehicles_ != null) && this.extra_Visible_Vehicles_.equals(rhs.extra_Visible_Vehicles_)))) && (this.max_Headlights == rhs.max_Headlights)) && (this.delay_Video_Swap == rhs.delay_Video_Swap)) && ((this.cockpit_Vibration_Freq2_ == rhs.cockpit_Vibration_Freq2_) || ((this.cockpit_Vibration_Freq2_ != null) && this.cockpit_Vibration_Freq2_.equals(rhs.cockpit_Vibration_Freq2_)))) && (this.render_Once_Per_VSync == rhs.render_Once_Per_VSync)) && ((this.heat_FX_Fade_Speed_ == rhs.heat_FX_Fade_Speed_) || ((this.heat_FX_Fade_Speed_ != null) && this.heat_FX_Fade_Speed_.equals(rhs.heat_FX_Fade_Speed_)))) && (this.always_Rebuild_Collision == rhs.always_Rebuild_Collision)) && (this.lCD_Display_Modes == rhs.lCD_Display_Modes)) && (Float.floatToIntBits(this.rearview_Height) == Float.floatToIntBits(rhs.rearview_Height))) && ((this.environment_Reflections_ == rhs.environment_Reflections_) || ((this.environment_Reflections_ != null) && this.environment_Reflections_.equals(rhs.environment_Reflections_)))) && (this.spark_Flow == rhs.spark_Flow)) && ((this.seat_Yaw_ == rhs.seat_Yaw_) || ((this.seat_Yaw_ != null) && this.seat_Yaw_.equals(rhs.seat_Yaw_)))) && (Float.floatToIntBits(this.vR_IPD_Scale) == Float.floatToIntBits(rhs.vR_IPD_Scale))) && ((this.overlay_Z_Bias_ == rhs.overlay_Z_Bias_) || ((this.overlay_Z_Bias_ != null) && this.overlay_Z_Bias_.equals(rhs.overlay_Z_Bias_)))) && (this.widescreen_Overlays == rhs.widescreen_Overlays)) && ((this.wind_and_Crowd_Motion_ == rhs.wind_and_Crowd_Motion_) || ((this.wind_and_Crowd_Motion_ != null) && this.wind_and_Crowd_Motion_.equals(rhs.wind_and_Crowd_Motion_)))) && (this.glance_Rate == rhs.glance_Rate)) && ((this.stabilize_Horizon_ == rhs.stabilize_Horizon_) || ((this.stabilize_Horizon_ != null) && this.stabilize_Horizon_.equals(rhs.stabilize_Horizon_)))) && (this.raindrop_Flow == rhs.raindrop_Flow)) && ((this.cockpit_Vibration_Freq1_ == rhs.cockpit_Vibration_Freq1_) || ((this.cockpit_Vibration_Freq1_ != null) && this.cockpit_Vibration_Freq1_.equals(rhs.cockpit_Vibration_Freq1_)))) && ((this.max_Framerate_ == rhs.max_Framerate_) || ((this.max_Framerate_ != null) && this.max_Framerate_.equals(rhs.max_Framerate_)))) && (this.vR_Enable_Hidden_Area_Mask == rhs.vR_Enable_Hidden_Area_Mask)) && (this.vertical_FOV_Degrees == rhs.vertical_FOV_Degrees)) && ((this.seat_Adjustment_Aft_ == rhs.seat_Adjustment_Aft_) || ((this.seat_Adjustment_Aft_ != null) && this.seat_Adjustment_Aft_.equals(rhs.seat_Adjustment_Aft_)))) && (this.rainspray_Flow == rhs.rainspray_Flow)) && (this.texture_Filter == rhs.texture_Filter)) && ((this.full_Tire_Shader_ == rhs.full_Tire_Shader_) || ((this.full_Tire_Shader_ != null) && this.full_Tire_Shader_.equals(rhs.full_Tire_Shader_)))) && (this.lightning_Probability == rhs.lightning_Probability)) && (Float.floatToIntBits(this.mirror_Adjustment_Vert) == Float.floatToIntBits(rhs.mirror_Adjustment_Vert))) && (Float.floatToIntBits(this.vehicle_Flow_Offset) == Float.floatToIntBits(rhs.vehicle_Flow_Offset))) && (this.left_Mirror_Horiz == rhs.left_Mirror_Horiz)) && ((this.rearview_Cull_ == rhs.rearview_Cull_) || ((this.rearview_Cull_ != null) && this.rearview_Cull_.equals(rhs.rearview_Cull_)))) && (this.shadow_Blur == rhs.shadow_Blur)) && ((this.glance_Rate_ == rhs.glance_Rate_) || ((this.glance_Rate_ != null) && this.glance_Rate_.equals(rhs.glance_Rate_)))) && (this.allow_HUD_in_cockpit == rhs.allow_HUD_in_cockpit)) && (Float.floatToIntBits(this.rearview_Front_Clip) == Float.floatToIntBits(rhs.rearview_Front_Clip))) && ((this.delay_Video_Swap_ == rhs.delay_Video_Swap_) || ((this.delay_Video_Swap_ != null) && this.delay_Video_Swap_.equals(rhs.delay_Video_Swap_)))) && (this.hUD == rhs.hUD)) && (this.heat_FX_Fade_Speed == rhs.heat_FX_Fade_Speed)) && (this.hUD_MFD == rhs.hUD_MFD)) && (this.box_Outline == rhs.box_Outline)) && (this.any_Camera_HUD == rhs.any_Camera_HUD)) && (this.screenshot_Depth_Alpha == rhs.screenshot_Depth_Alpha)) && (this.display_Icons == rhs.display_Icons)) && (this.head_Physics == rhs.head_Physics)) && ((this.shadow_Blur_ == rhs.shadow_Blur_) || ((this.shadow_Blur_ != null) && this.shadow_Blur_.equals(rhs.shadow_Blur_)))) && ((this.screenshot_Depth_Alpha_ == rhs.screenshot_Depth_Alpha_) || ((this.screenshot_Depth_Alpha_ != null) && this.screenshot_Depth_Alpha_.equals(rhs.screenshot_Depth_Alpha_)))) && (this.hUD_Race_Stats == rhs.hUD_Race_Stats)) && ((this.any_Camera_HUD_ == rhs.any_Camera_HUD_) || ((this.any_Camera_HUD_ != null) && this.any_Camera_HUD_.equals(rhs.any_Camera_HUD_)))) && ((this.hUD_Component_Version == rhs.hUD_Component_Version) || ((this.hUD_Component_Version != null) && this.hUD_Component_Version.equals(rhs.hUD_Component_Version)))) && (this.transparency_AA == rhs.transparency_AA)) && (this.rearview_Onboard == rhs.rearview_Onboard)) && (this.track_Detail == rhs.track_Detail)) && (this.virtual_Rearview_In_Cockpit == rhs.virtual_Rearview_In_Cockpit)) && (this.synchronize_Frame == rhs.synchronize_Frame)) && (this.leanahead_Angle == rhs.leanahead_Angle)) && (this.center_Mirror_Size == rhs.center_Mirror_Size)) && (this.uI_Background_Animation == rhs.uI_Background_Animation)) && ((this.seat_Pitch_ == rhs.seat_Pitch_) || ((this.seat_Pitch_ != null) && this.seat_Pitch_.equals(rhs.seat_Pitch_)))) && ((this.overlay_Height_Offset_ == rhs.overlay_Height_Offset_) || ((this.overlay_Height_Offset_ != null) && this.overlay_Height_Offset_.equals(rhs.overlay_Height_Offset_)))) && ((this.rearview_Width_ == rhs.rearview_Width_) || ((this.rearview_Width_ != null) && this.rearview_Width_.equals(rhs.rearview_Width_)))) && (this.wind_and_Crowd_Motion == rhs.wind_and_Crowd_Motion)) && (this.rearview_Driving == rhs.rearview_Driving)) && ((this.raindrop_Flow_ == rhs.raindrop_Flow_) || ((this.raindrop_Flow_ != null) && this.raindrop_Flow_.equals(rhs.raindrop_Flow_)))) && (this.seat_Pitch == rhs.seat_Pitch)) && (this.moving_Rearview == rhs.moving_Rearview)) && ((this.thunder_Probability_ == rhs.thunder_Probability_) || ((this.thunder_Probability_ != null) && this.thunder_Probability_.equals(rhs.thunder_Probability_)))) && ((this.vehicle_Flow_Radius_ == rhs.vehicle_Flow_Radius_) || ((this.vehicle_Flow_Radius_ != null) && this.vehicle_Flow_Radius_.equals(rhs.vehicle_Flow_Radius_)))) && (this.shadows == rhs.shadows)) && (this.rearview_Cull == rhs.rearview_Cull)) && ((this.rearview_Independent_ == rhs.rearview_Independent_) || ((this.rearview_Independent_ != null) && this.rearview_Independent_.equals(rhs.rearview_Independent_)))) && ((this.load_Opponent_Cockpits_ == rhs.load_Opponent_Cockpits_) || ((this.load_Opponent_Cockpits_ != null) && this.load_Opponent_Cockpits_.equals(rhs.load_Opponent_Cockpits_)))) && ((this.vehicle_Flow_Offset_ == rhs.vehicle_Flow_Offset_) || ((this.vehicle_Flow_Offset_ != null) && this.vehicle_Flow_Offset_.equals(rhs.vehicle_Flow_Offset_)))) && (this.mirror_Physical_Z == rhs.mirror_Physical_Z)) && (this.logo_Seconds == rhs.logo_Seconds)) && (this.mirror_Physical_Y == rhs.mirror_Physical_Y)) && (this.low_Detail_UI == rhs.low_Detail_UI)) && (this.mirror_Physical_X == rhs.mirror_Physical_X)) && ((this.special_FX_ == rhs.special_FX_) || ((this.special_FX_ != null) && this.special_FX_.equals(rhs.special_FX_)))) && ((this.mirror_Adjustment_Horiz_ == rhs.mirror_Adjustment_Horiz_) || ((this.mirror_Adjustment_Horiz_ != null) && this.mirror_Adjustment_Horiz_.equals(rhs.mirror_Adjustment_Horiz_)))) && ((this.car_Vibration_Mult1_ == rhs.car_Vibration_Mult1_) || ((this.car_Vibration_Mult1_ != null) && this.car_Vibration_Mult1_.equals(rhs.car_Vibration_Mult1_)))) && ((this.head_Rotation_ == rhs.head_Rotation_) || ((this.head_Rotation_ != null) && this.head_Rotation_.equals(rhs.head_Rotation_)))) && ((this.logo_Seconds_ == rhs.logo_Seconds_) || ((this.logo_Seconds_ != null) && this.logo_Seconds_.equals(rhs.logo_Seconds_)))) && (this.right_Mirror_Size == rhs.right_Mirror_Size)) && (this.warning_Light_Anim_Speed == rhs.warning_Light_Anim_Speed)) && ((this.mirror_Physical_X_ == rhs.mirror_Physical_X_) || ((this.mirror_Physical_X_ != null) && this.mirror_Physical_X_.equals(rhs.mirror_Physical_X_)))) && (this.compressed_Textures == rhs.compressed_Textures)) && ((this.opponent_Texture_Override_ == rhs.opponent_Texture_Override_) || ((this.opponent_Texture_Override_ != null) && this.opponent_Texture_Override_.equals(rhs.opponent_Texture_Override_)))) && (this.cockpit_Vibration_Mult1 == rhs.cockpit_Vibration_Mult1)) && (this.overlay_Z_Bias == rhs.overlay_Z_Bias)) && (this.cockpit_Vibration_Mult2 == rhs.cockpit_Vibration_Mult2)) && ((this.self_In_Rearview_ == rhs.self_In_Rearview_) || ((this.self_In_Rearview_ != null) && this.self_In_Rearview_.equals(rhs.self_In_Rearview_)))) && ((this.vertical_FOV_Degrees_ == rhs.vertical_FOV_Degrees_) || ((this.vertical_FOV_Degrees_ != null) && this.vertical_FOV_Degrees_.equals(rhs.vertical_FOV_Degrees_)))) && (Float.floatToIntBits(this.mirror_Adjustment_Horiz) == Float.floatToIntBits(rhs.mirror_Adjustment_Horiz))) && (this.rearview_Swingman == rhs.rearview_Swingman)) && ((this.head_Physics_ == rhs.head_Physics_) || ((this.head_Physics_ != null) && this.head_Physics_.equals(rhs.head_Physics_)))) && (this.left_Mirror_Size == rhs.left_Mirror_Size)) && (this.steady_Framerate_Thresh == rhs.steady_Framerate_Thresh)) && ((this.moving_Rearview_ == rhs.moving_Rearview_) || ((this.moving_Rearview_ != null) && this.moving_Rearview_.equals(rhs.moving_Rearview_)))) && ((this.car_Vibration_Mult2_ == rhs.car_Vibration_Mult2_) || ((this.car_Vibration_Mult2_ != null) && this.car_Vibration_Mult2_.equals(rhs.car_Vibration_Mult2_)))) && (this.full_Tire_Shader == rhs.full_Tire_Shader)) && ((this.mirror_Physical_Y_ == rhs.mirror_Physical_Y_) || ((this.mirror_Physical_Y_ != null) && this.mirror_Physical_Y_.equals(rhs.mirror_Physical_Y_)))) && ((this.player_Livery == rhs.player_Livery) || ((this.player_Livery != null) && this.player_Livery.equals(rhs.player_Livery)))) && ((this.vR_IPD_Scale_ == rhs.vR_IPD_Scale_) || ((this.vR_IPD_Scale_ != null) && this.vR_IPD_Scale_.equals(rhs.vR_IPD_Scale_)))) && (this.steering_Wheel == rhs.steering_Wheel)) && (this.uI_autonomous_render_thread == rhs.uI_autonomous_render_thread)) && ((this.always_Rebuild_Collision_ == rhs.always_Rebuild_Collision_) || ((this.always_Rebuild_Collision_ != null) && this.always_Rebuild_Collision_.equals(rhs.always_Rebuild_Collision_)))) && ((this.automap_ == rhs.automap_) || ((this.automap_ != null) && this.automap_.equals(rhs.automap_)))) && (this.environment_Reflections == rhs.environment_Reflections)) && ((this.rearview_Front_Clip_ == rhs.rearview_Front_Clip_) || ((this.rearview_Front_Clip_ != null) && this.rearview_Front_Clip_.equals(rhs.rearview_Front_Clip_)))) && ((this.steady_Framerate_Thresh_ == rhs.steady_Framerate_Thresh_) || ((this.steady_Framerate_Thresh_ != null) && this.steady_Framerate_Thresh_.equals(rhs.steady_Framerate_Thresh_)))) && (this.right_Mirror_Vert == rhs.right_Mirror_Vert)) && ((this.synchronize_Frame_ == rhs.synchronize_Frame_) || ((this.synchronize_Frame_ != null) && this.synchronize_Frame_.equals(rhs.synchronize_Frame_)))) && (this.opponent_Texture_Override == rhs.opponent_Texture_Override)) && ((this.shadows_ == rhs.shadows_) || ((this.shadows_ != null) && this.shadows_.equals(rhs.shadows_)))) && (this.soft_Particles == rhs.soft_Particles)) && (this.vehicle_Flow_Radius == rhs.vehicle_Flow_Radius)) && (this.cockpit_Vibration_Freq1 == rhs.cockpit_Vibration_Freq1)) && (this.cockpit_Vibration_Freq2 == rhs.cockpit_Vibration_Freq2)) && ((this.render_Once_Per_VSync_ == rhs.render_Once_Per_VSync_) || ((this.render_Once_Per_VSync_ != null) && this.render_Once_Per_VSync_.equals(rhs.render_Once_Per_VSync_)))) && ((this.steering_Wheel_ == rhs.steering_Wheel_) || ((this.steering_Wheel_ != null) && this.steering_Wheel_.equals(rhs.steering_Wheel_)))) && (this.vR_Projection_Mode == rhs.vR_Projection_Mode)) && ((this.look_Up_Down_Angle_ == rhs.look_Up_Down_Angle_) || ((this.look_Up_Down_Angle_ != null) && this.look_Up_Down_Angle_.equals(rhs.look_Up_Down_Angle_)))) && ((this.player_Texture_Override_ == rhs.player_Texture_Override_) || ((this.player_Texture_Override_ != null) && this.player_Texture_Override_.equals(rhs.player_Texture_Override_)))) && (this.auto_Detail_Framerate == rhs.auto_Detail_Framerate)) && ((this.spark_Flow_ == rhs.spark_Flow_) || ((this.spark_Flow_ != null) && this.spark_Flow_.equals(rhs.spark_Flow_)))) && (this.head_Rotation == rhs.head_Rotation)) && (this.extra_Visible_Vehicles == rhs.extra_Visible_Vehicles)) && ((this.rearview_Driving_ == rhs.rearview_Driving_) || ((this.rearview_Driving_ != null) && this.rearview_Driving_.equals(rhs.rearview_Driving_)))) && (this.player_Detail == rhs.player_Detail)) && (this.pitcrew_Detail_Level == rhs.pitcrew_Detail_Level)) && (this.max_Visible_Vehicles == rhs.max_Visible_Vehicles)) && ((this.gap_Check_ == rhs.gap_Check_) || ((this.gap_Check_ != null) && this.gap_Check_.equals(rhs.gap_Check_)))) && ((this.real_Road_System_ == rhs.real_Road_System_) || ((this.real_Road_System_ != null) && this.real_Road_System_.equals(rhs.real_Road_System_)))) && ((this.leanahead_Angle_ == rhs.leanahead_Angle_) || ((this.leanahead_Angle_ != null) && this.leanahead_Angle_.equals(rhs.leanahead_Angle_)))) && (this.allow_Letterboxing == rhs.allow_Letterboxing)) && (this.seat_Roll == rhs.seat_Roll)) && (this.verify_Refs == rhs.verify_Refs)) && (this.real_Road_System == rhs.real_Road_System)) && ((this.lSI_Top_ == rhs.lSI_Top_) || ((this.lSI_Top_ != null) && this.lSI_Top_.equals(rhs.lSI_Top_)))) && (this.partial_Cockpit_View == rhs.partial_Cockpit_View)) && ((this.partial_Cockpit_View_ == rhs.partial_Cockpit_View_) || ((this.partial_Cockpit_View_ != null) && this.partial_Cockpit_View_.equals(rhs.partial_Cockpit_View_)))) && ((this.virtual_Rearview_In_Cockpit_ == rhs.virtual_Rearview_In_Cockpit_) || ((this.virtual_Rearview_In_Cockpit_ != null) && this.virtual_Rearview_In_Cockpit_.equals(rhs.virtual_Rearview_In_Cockpit_)))) && (this.groove == rhs.groove)) && ((this.cockpit_Vibration_Mult1_ == rhs.cockpit_Vibration_Mult1_) || ((this.cockpit_Vibration_Mult1_ != null) && this.cockpit_Vibration_Mult1_.equals(rhs.cockpit_Vibration_Mult1_)))) && (Float.floatToIntBits(this.overlay_Height_Offset) == Float.floatToIntBits(rhs.overlay_Height_Offset))) && ((this.screenshot_Format_ == rhs.screenshot_Format_) || ((this.screenshot_Format_ != null) && this.screenshot_Format_.equals(rhs.screenshot_Format_)))) && ((this.smoke_Flow_ == rhs.smoke_Flow_) || ((this.smoke_Flow_ != null) && this.smoke_Flow_.equals(rhs.smoke_Flow_)))) && (Float.floatToIntBits(this.lSI_Top) == Float.floatToIntBits(rhs.lSI_Top))) && ((this.road_Reflections_ == rhs.road_Reflections_) || ((this.road_Reflections_ != null) && this.road_Reflections_.equals(rhs.road_Reflections_)))) && (this.load_Opponent_Cockpits == rhs.load_Opponent_Cockpits)) && (this.tire_Emitter_Flow == rhs.tire_Emitter_Flow)) && ((this.dynamic_Vertex_Buffers_ == rhs.dynamic_Vertex_Buffers_) || ((this.dynamic_Vertex_Buffers_ != null) && this.dynamic_Vertex_Buffers_.equals(rhs.dynamic_Vertex_Buffers_)))) && (Float.floatToIntBits(this.garage_Detail) == Float.floatToIntBits(rhs.garage_Detail))) && (this.lookahead_Angle == rhs.lookahead_Angle)) && (this.broadcast_Overlay == rhs.broadcast_Overlay)) && (this.exaggerate_Yaw == rhs.exaggerate_Yaw)) && (this.engine_Emitter_Flow == rhs.engine_Emitter_Flow)) && ((this.rainspray_Flow_ == rhs.rainspray_Flow_) || ((this.rainspray_Flow_ != null) && this.rainspray_Flow_.equals(rhs.rainspray_Flow_)))) && ((this.seat_Roll_ == rhs.seat_Roll_) || ((this.seat_Roll_ != null) && this.seat_Roll_.equals(rhs.seat_Roll_)))) && ((this.rearview_Swingman_ == rhs.rearview_Swingman_) || ((this.rearview_Swingman_ != null) && this.rearview_Swingman_.equals(rhs.rearview_Swingman_)))) && ((this.player_Livery_ == rhs.player_Livery_) || ((this.player_Livery_ != null) && this.player_Livery_.equals(rhs.player_Livery_)))) && ((this.uI_autonomous_render_thread_ == rhs.uI_autonomous_render_thread_) || ((this.uI_autonomous_render_thread_ != null) && this.uI_autonomous_render_thread_.equals(rhs.uI_autonomous_render_thread_)))) && (this.opponent_Detail == rhs.opponent_Detail)) && ((this.cockpit_Vibration_Mult2_ == rhs.cockpit_Vibration_Mult2_) || ((this.cockpit_Vibration_Mult2_ != null) && this.cockpit_Vibration_Mult2_.equals(rhs.cockpit_Vibration_Mult2_)))) && ((this.engine_Emitter_Flow_ == rhs.engine_Emitter_Flow_) || ((this.engine_Emitter_Flow_ != null) && this.engine_Emitter_Flow_.equals(rhs.engine_Emitter_Flow_)))) && (Float.floatToIntBits(this.look_Roll_Angle) == Float.floatToIntBits(rhs.look_Roll_Angle))) && ((this.vR_Enable_Hidden_Area_Mask_ == rhs.vR_Enable_Hidden_Area_Mask_) || ((this.vR_Enable_Hidden_Area_Mask_ != null) && this.vR_Enable_Hidden_Area_Mask_.equals(rhs.vR_Enable_Hidden_Area_Mask_)))) && (this.road_Reflections == rhs.road_Reflections)) && (Float.floatToIntBits(this.thunder_Probability) == Float.floatToIntBits(rhs.thunder_Probability))) && ((this.tire_Ground_Offset_ == rhs.tire_Ground_Offset_) || ((this.tire_Ground_Offset_ != null) && this.tire_Ground_Offset_.equals(rhs.tire_Ground_Offset_)))) && ((this.display_Icons_ == rhs.display_Icons_) || ((this.display_Icons_ != null) && this.display_Icons_.equals(rhs.display_Icons_))));
    }

}
