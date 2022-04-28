package de.fillikos.rf2.esctool.data.rf2data.multiplayer;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Allow Chat In Car",
        "Allow Chat In Car#",
        "Auto Join Chat Server",
        "Auto Join Chat Server#",
        "Autoscroll Chat",
        "Autoscroll Chat#",
        "Bind IP",
        "Bind IP#",
        "Buddy List Announce",
        "Buddy List Announce#",
        "Colorcode Chat",
        "Colorcode Chat#",
        "Damping Multiplier",
        "Damping Multiplier#",
        "Delay Vehicle Graphics",
        "Delay Vehicle Graphics#",
        "Display Laggy Labels",
        "Display Laggy Labels#",
        "Download Custom Skins",
        "Download Custom Skins#",
        "Downstream Rated KBPS",
        "Downstream Rated KBPS#",
        "Extrapolation Time",
        "Extrapolation Time#",
        "HTTP Server Port",
        "HTTP Server Port#",
        "Leave/Join Messages",
        "Leave/Join Messages#",
        "Live Updates",
        "Live Updates#",
        "Lobby Chat Nickname",
        "Lobby Chat Nickname#",
        "Multiplayer Sort Type",
        "Multiplayer Sort Type#",
        "Multiplayer auto retrieve servers",
        "Multiplayer auto retrieve servers#",
        "Multiplayer filter first operand",
        "Multiplayer filter first operand#",
        "Multiplayer filter operator",
        "Multiplayer filter operator#",
        "Multiplayer filter password servers",
        "Multiplayer filter password servers#",
        "Multiplayer filter second operand",
        "Multiplayer filter second operand#",
        "Multiplayer sort field",
        "Multiplayer sort field#",
        "Multiplayer sort value",
        "Multiplayer sort value#",
        "Net Connection Type",
        "Net Connection Type#",
        "Net Flush Threshold",
        "Net Flush Threshold#",
        "Orientation Spring",
        "Orientation Spring#",
        "Path Prediction",
        "Path Prediction#",
        "Position Spring",
        "Position Spring#",
        "Show Seating",
        "Show Seating#",
        "Simulation Port",
        "Simulation Port#",
        "Spectate Vehicle",
        "Spectate Vehicle#",
        "Spectator Mode",
        "Spectator Mode#",
        "Spectator Starting View",
        "Spectator Starting View#",
        "Temporary Vehicle Graphics",
        "Temporary Vehicle Graphics#",
        "Upstream Rated KBPS",
        "Upstream Rated KBPS#"
})
@Generated("jsonschema2pojo")
public class MultiplayerGeneralOptions {

    @JsonProperty("Allow Chat In Car")
    private boolean allow_Chat_In_Car;
    @JsonProperty("Allow Chat In Car#")
    private String allow_Chat_In_Car_;
    @JsonProperty("Auto Join Chat Server")
    private boolean auto_Join_Chat_Server;
    @JsonProperty("Auto Join Chat Server#")
    private String auto_Join_Chat_Server_;
    @JsonProperty("Autoscroll Chat")
    private int autoscroll_Chat;
    @JsonProperty("Autoscroll Chat#")
    private String autoscroll_Chat_;
    @JsonProperty("Bind IP")
    private String bind_IP;
    @JsonProperty("Bind IP#")
    private String bind_IP_;
    @JsonProperty("Buddy List Announce")
    private boolean buddy_List_Announce;
    @JsonProperty("Buddy List Announce#")
    private String buddy_List_Announce_;
    @JsonProperty("Colorcode Chat")
    private boolean colorcode_Chat;
    @JsonProperty("Colorcode Chat#")
    private String colorcode_Chat_;
    @JsonProperty("Damping Multiplier")
    private int damping_Multiplier;
    @JsonProperty("Damping Multiplier#")
    private String damping_Multiplier_;
    @JsonProperty("Delay Vehicle Graphics")
    private boolean delay_Vehicle_Graphics;
    @JsonProperty("Delay Vehicle Graphics#")
    private String delay_Vehicle_Graphics_;
    @JsonProperty("Display Laggy Labels")
    private boolean display_Laggy_Labels;
    @JsonProperty("Display Laggy Labels#")
    private String display_Laggy_Labels_;
    @JsonProperty("Download Custom Skins")
    private boolean download_Custom_Skins;
    @JsonProperty("Download Custom Skins#")
    private String download_Custom_Skins_;
    @JsonProperty("Downstream Rated KBPS")
    private int downstream_Rated_KBPS;
    @JsonProperty("Downstream Rated KBPS#")
    private String downstream_Rated_KBPS_;
    @JsonProperty("Extrapolation Time")
    private int extrapolation_Time;
    @JsonProperty("Extrapolation Time#")
    private String extrapolation_Time_;
    @JsonProperty("HTTP Server Port")
    private int hTTP_Server_Port;
    @JsonProperty("HTTP Server Port#")
    private String hTTP_Server_Port_;
    @JsonProperty("Leave/Join Messages")
    private int leave_Join_Messages;
    @JsonProperty("Leave/Join Messages#")
    private String leave_Join_Messages_;
    @JsonProperty("Live Updates")
    private boolean live_Updates;
    @JsonProperty("Live Updates#")
    private String live_Updates_;
    @JsonProperty("Lobby Chat Nickname")
    private String lobby_Chat_Nickname;
    @JsonProperty("Lobby Chat Nickname#")
    private String lobby_Chat_Nickname_;
    @JsonProperty("Multiplayer Sort Type")
    private int multiplayer_Sort_Type;
    @JsonProperty("Multiplayer Sort Type#")
    private String multiplayer_Sort_Type_;
    @JsonProperty("Multiplayer auto retrieve servers")
    private boolean multiplayer_auto_retrieve_servers;
    @JsonProperty("Multiplayer auto retrieve servers#")
    private String multiplayer_auto_retrieve_servers_;
    @JsonProperty("Multiplayer filter first operand")
    private String multiplayer_filter_first_operand;
    @JsonProperty("Multiplayer filter first operand#")
    private String multiplayer_filter_first_operand_;
    @JsonProperty("Multiplayer filter operator")
    private String multiplayer_filter_operator;
    @JsonProperty("Multiplayer filter operator#")
    private String multiplayer_filter_operator_;
    @JsonProperty("Multiplayer filter password servers")
    private boolean multiplayer_filter_password_servers;
    @JsonProperty("Multiplayer filter password servers#")
    private String multiplayer_filter_password_servers_;
    @JsonProperty("Multiplayer filter second operand")
    private String multiplayer_filter_second_operand;
    @JsonProperty("Multiplayer filter second operand#")
    private String multiplayer_filter_second_operand_;
    @JsonProperty("Multiplayer sort field")
    private int multiplayer_sort_field;
    @JsonProperty("Multiplayer sort field#")
    private String multiplayer_sort_field_;
    @JsonProperty("Multiplayer sort value")
    private String multiplayer_sort_value;
    @JsonProperty("Multiplayer sort value#")
    private String multiplayer_sort_value_;
    @JsonProperty("Net Connection Type")
    private int net_Connection_Type;
    @JsonProperty("Net Connection Type#")
    private String net_Connection_Type_;
    @JsonProperty("Net Flush Threshold")
    private int net_Flush_Threshold;
    @JsonProperty("Net Flush Threshold#")
    private String net_Flush_Threshold_;
    @JsonProperty("Orientation Spring")
    private int orientation_Spring;
    @JsonProperty("Orientation Spring#")
    private String orientation_Spring_;
    @JsonProperty("Path Prediction")
    private int path_Prediction;
    @JsonProperty("Path Prediction#")
    private String path_Prediction_;
    @JsonProperty("Position Spring")
    private int position_Spring;
    @JsonProperty("Position Spring#")
    private String position_Spring_;
    @JsonProperty("Show Seating")
    private boolean show_Seating;
    @JsonProperty("Show Seating#")
    private String show_Seating_;
    @JsonProperty("Simulation Port")
    private int simulation_Port;
    @JsonProperty("Simulation Port#")
    private String simulation_Port_;
    @JsonProperty("Spectate Vehicle")
    private String spectate_Vehicle;
    @JsonProperty("Spectate Vehicle#")
    private String spectate_Vehicle_;
    @JsonProperty("Spectator Mode")
    private boolean spectator_Mode;
    @JsonProperty("Spectator Mode#")
    private String spectator_Mode_;
    @JsonProperty("Spectator Starting View")
    private int spectator_Starting_View;
    @JsonProperty("Spectator Starting View#")
    private String spectator_Starting_View_;
    @JsonProperty("Temporary Vehicle Graphics")
    private int temporary_Vehicle_Graphics;
    @JsonProperty("Temporary Vehicle Graphics#")
    private String temporary_Vehicle_Graphics_;
    @JsonProperty("Upstream Rated KBPS")
    private int upstream_Rated_KBPS;
    @JsonProperty("Upstream Rated KBPS#")
    private String upstream_Rated_KBPS_;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public MultiplayerGeneralOptions() {
    }

    /**
     * @param multiplayer_filter_operator
     * @param position_Spring
     * @param delay_Vehicle_Graphics
     * @param extrapolation_Time
     * @param spectator_Mode_
     * @param upstream_Rated_KBPS_
     * @param hTTP_Server_Port_
     * @param multiplayer_filter_password_servers
     * @param allow_Chat_In_Car_
     * @param download_Custom_Skins_
     * @param multiplayer_filter_first_operand
     * @param bind_IP_
     * @param lobby_Chat_Nickname
     * @param net_Connection_Type_
     * @param net_Flush_Threshold
     * @param display_Laggy_Labels
     * @param position_Spring_
     * @param display_Laggy_Labels_
     * @param extrapolation_Time_
     * @param orientation_Spring
     * @param delay_Vehicle_Graphics_
     * @param multiplayer_filter_operator_
     * @param hTTP_Server_Port
     * @param show_Seating
     * @param auto_Join_Chat_Server_
     * @param multiplayer_filter_first_operand_
     * @param colorcode_Chat
     * @param buddy_List_Announce_
     * @param multiplayer_sort_value
     * @param multiplayer_auto_retrieve_servers
     * @param leave_Join_Messages_
     * @param orientation_Spring_
     * @param allow_Chat_In_Car
     * @param autoscroll_Chat_
     * @param upstream_Rated_KBPS
     * @param download_Custom_Skins
     * @param downstream_Rated_KBPS
     * @param simulation_Port_
     * @param multiplayer_Sort_Type_
     * @param buddy_List_Announce
     * @param multiplayer_filter_second_operand
     * @param damping_Multiplier_
     * @param colorcode_Chat_
     * @param live_Updates
     * @param simulation_Port
     * @param multiplayer_filter_second_operand_
     * @param auto_Join_Chat_Server
     * @param multiplayer_sort_field_
     * @param spectator_Starting_View
     * @param multiplayer_auto_retrieve_servers_
     * @param multiplayer_sort_value_
     * @param multiplayer_sort_field
     * @param downstream_Rated_KBPS_
     * @param show_Seating_
     * @param temporary_Vehicle_Graphics
     * @param net_Connection_Type
     * @param net_Flush_Threshold_
     * @param path_Prediction_
     * @param spectator_Starting_View_
     * @param multiplayer_Sort_Type
     * @param temporary_Vehicle_Graphics_
     * @param bind_IP
     * @param leave_Join_Messages
     * @param spectator_Mode
     * @param spectate_Vehicle
     * @param path_Prediction
     * @param multiplayer_filter_password_servers_
     * @param live_Updates_
     * @param spectate_Vehicle_
     * @param autoscroll_Chat
     * @param damping_Multiplier
     * @param lobby_Chat_Nickname_
     */
    public MultiplayerGeneralOptions(boolean allow_Chat_In_Car, String allow_Chat_In_Car_, boolean auto_Join_Chat_Server, String auto_Join_Chat_Server_, int autoscroll_Chat, String autoscroll_Chat_, String bind_IP, String bind_IP_, boolean buddy_List_Announce, String buddy_List_Announce_, boolean colorcode_Chat, String colorcode_Chat_, int damping_Multiplier, String damping_Multiplier_, boolean delay_Vehicle_Graphics, String delay_Vehicle_Graphics_, boolean display_Laggy_Labels, String display_Laggy_Labels_, boolean download_Custom_Skins, String download_Custom_Skins_, int downstream_Rated_KBPS, String downstream_Rated_KBPS_, int extrapolation_Time, String extrapolation_Time_, int hTTP_Server_Port, String hTTP_Server_Port_, int leave_Join_Messages, String leave_Join_Messages_, boolean live_Updates, String live_Updates_, String lobby_Chat_Nickname, String lobby_Chat_Nickname_, int multiplayer_Sort_Type, String multiplayer_Sort_Type_, boolean multiplayer_auto_retrieve_servers, String multiplayer_auto_retrieve_servers_, String multiplayer_filter_first_operand, String multiplayer_filter_first_operand_, String multiplayer_filter_operator, String multiplayer_filter_operator_, boolean multiplayer_filter_password_servers, String multiplayer_filter_password_servers_, String multiplayer_filter_second_operand, String multiplayer_filter_second_operand_, int multiplayer_sort_field, String multiplayer_sort_field_, String multiplayer_sort_value, String multiplayer_sort_value_, int net_Connection_Type, String net_Connection_Type_, int net_Flush_Threshold, String net_Flush_Threshold_, int orientation_Spring, String orientation_Spring_, int path_Prediction, String path_Prediction_, int position_Spring, String position_Spring_, boolean show_Seating, String show_Seating_, int simulation_Port, String simulation_Port_, String spectate_Vehicle, String spectate_Vehicle_, boolean spectator_Mode, String spectator_Mode_, int spectator_Starting_View, String spectator_Starting_View_, int temporary_Vehicle_Graphics, String temporary_Vehicle_Graphics_, int upstream_Rated_KBPS, String upstream_Rated_KBPS_) {
        super();
        this.allow_Chat_In_Car = allow_Chat_In_Car;
        this.allow_Chat_In_Car_ = allow_Chat_In_Car_;
        this.auto_Join_Chat_Server = auto_Join_Chat_Server;
        this.auto_Join_Chat_Server_ = auto_Join_Chat_Server_;
        this.autoscroll_Chat = autoscroll_Chat;
        this.autoscroll_Chat_ = autoscroll_Chat_;
        this.bind_IP = bind_IP;
        this.bind_IP_ = bind_IP_;
        this.buddy_List_Announce = buddy_List_Announce;
        this.buddy_List_Announce_ = buddy_List_Announce_;
        this.colorcode_Chat = colorcode_Chat;
        this.colorcode_Chat_ = colorcode_Chat_;
        this.damping_Multiplier = damping_Multiplier;
        this.damping_Multiplier_ = damping_Multiplier_;
        this.delay_Vehicle_Graphics = delay_Vehicle_Graphics;
        this.delay_Vehicle_Graphics_ = delay_Vehicle_Graphics_;
        this.display_Laggy_Labels = display_Laggy_Labels;
        this.display_Laggy_Labels_ = display_Laggy_Labels_;
        this.download_Custom_Skins = download_Custom_Skins;
        this.download_Custom_Skins_ = download_Custom_Skins_;
        this.downstream_Rated_KBPS = downstream_Rated_KBPS;
        this.downstream_Rated_KBPS_ = downstream_Rated_KBPS_;
        this.extrapolation_Time = extrapolation_Time;
        this.extrapolation_Time_ = extrapolation_Time_;
        this.hTTP_Server_Port = hTTP_Server_Port;
        this.hTTP_Server_Port_ = hTTP_Server_Port_;
        this.leave_Join_Messages = leave_Join_Messages;
        this.leave_Join_Messages_ = leave_Join_Messages_;
        this.live_Updates = live_Updates;
        this.live_Updates_ = live_Updates_;
        this.lobby_Chat_Nickname = lobby_Chat_Nickname;
        this.lobby_Chat_Nickname_ = lobby_Chat_Nickname_;
        this.multiplayer_Sort_Type = multiplayer_Sort_Type;
        this.multiplayer_Sort_Type_ = multiplayer_Sort_Type_;
        this.multiplayer_auto_retrieve_servers = multiplayer_auto_retrieve_servers;
        this.multiplayer_auto_retrieve_servers_ = multiplayer_auto_retrieve_servers_;
        this.multiplayer_filter_first_operand = multiplayer_filter_first_operand;
        this.multiplayer_filter_first_operand_ = multiplayer_filter_first_operand_;
        this.multiplayer_filter_operator = multiplayer_filter_operator;
        this.multiplayer_filter_operator_ = multiplayer_filter_operator_;
        this.multiplayer_filter_password_servers = multiplayer_filter_password_servers;
        this.multiplayer_filter_password_servers_ = multiplayer_filter_password_servers_;
        this.multiplayer_filter_second_operand = multiplayer_filter_second_operand;
        this.multiplayer_filter_second_operand_ = multiplayer_filter_second_operand_;
        this.multiplayer_sort_field = multiplayer_sort_field;
        this.multiplayer_sort_field_ = multiplayer_sort_field_;
        this.multiplayer_sort_value = multiplayer_sort_value;
        this.multiplayer_sort_value_ = multiplayer_sort_value_;
        this.net_Connection_Type = net_Connection_Type;
        this.net_Connection_Type_ = net_Connection_Type_;
        this.net_Flush_Threshold = net_Flush_Threshold;
        this.net_Flush_Threshold_ = net_Flush_Threshold_;
        this.orientation_Spring = orientation_Spring;
        this.orientation_Spring_ = orientation_Spring_;
        this.path_Prediction = path_Prediction;
        this.path_Prediction_ = path_Prediction_;
        this.position_Spring = position_Spring;
        this.position_Spring_ = position_Spring_;
        this.show_Seating = show_Seating;
        this.show_Seating_ = show_Seating_;
        this.simulation_Port = simulation_Port;
        this.simulation_Port_ = simulation_Port_;
        this.spectate_Vehicle = spectate_Vehicle;
        this.spectate_Vehicle_ = spectate_Vehicle_;
        this.spectator_Mode = spectator_Mode;
        this.spectator_Mode_ = spectator_Mode_;
        this.spectator_Starting_View = spectator_Starting_View;
        this.spectator_Starting_View_ = spectator_Starting_View_;
        this.temporary_Vehicle_Graphics = temporary_Vehicle_Graphics;
        this.temporary_Vehicle_Graphics_ = temporary_Vehicle_Graphics_;
        this.upstream_Rated_KBPS = upstream_Rated_KBPS;
        this.upstream_Rated_KBPS_ = upstream_Rated_KBPS_;
    }

    @JsonProperty("Allow Chat In Car")
    public boolean isAllow_Chat_In_Car() {
        return allow_Chat_In_Car;
    }

    @JsonProperty("Allow Chat In Car")
    public void setAllow_Chat_In_Car(boolean allow_Chat_In_Car) {
        this.allow_Chat_In_Car = allow_Chat_In_Car;
    }

    @JsonProperty("Allow Chat In Car#")
    public String getAllow_Chat_In_Car_() {
        return allow_Chat_In_Car_;
    }

    @JsonProperty("Allow Chat In Car#")
    public void setAllow_Chat_In_Car_(String allow_Chat_In_Car_) {
        this.allow_Chat_In_Car_ = allow_Chat_In_Car_;
    }

    @JsonProperty("Auto Join Chat Server")
    public boolean isAuto_Join_Chat_Server() {
        return auto_Join_Chat_Server;
    }

    @JsonProperty("Auto Join Chat Server")
    public void setAuto_Join_Chat_Server(boolean auto_Join_Chat_Server) {
        this.auto_Join_Chat_Server = auto_Join_Chat_Server;
    }

    @JsonProperty("Auto Join Chat Server#")
    public String getAuto_Join_Chat_Server_() {
        return auto_Join_Chat_Server_;
    }

    @JsonProperty("Auto Join Chat Server#")
    public void setAuto_Join_Chat_Server_(String auto_Join_Chat_Server_) {
        this.auto_Join_Chat_Server_ = auto_Join_Chat_Server_;
    }

    @JsonProperty("Autoscroll Chat")
    public int getAutoscroll_Chat() {
        return autoscroll_Chat;
    }

    @JsonProperty("Autoscroll Chat")
    public void setAutoscroll_Chat(int autoscroll_Chat) {
        this.autoscroll_Chat = autoscroll_Chat;
    }

    @JsonProperty("Autoscroll Chat#")
    public String getAutoscroll_Chat_() {
        return autoscroll_Chat_;
    }

    @JsonProperty("Autoscroll Chat#")
    public void setAutoscroll_Chat_(String autoscroll_Chat_) {
        this.autoscroll_Chat_ = autoscroll_Chat_;
    }

    @JsonProperty("Bind IP")
    public String getBind_IP() {
        return bind_IP;
    }

    @JsonProperty("Bind IP")
    public void setBind_IP(String bind_IP) {
        this.bind_IP = bind_IP;
    }

    @JsonProperty("Bind IP#")
    public String getBind_IP_() {
        return bind_IP_;
    }

    @JsonProperty("Bind IP#")
    public void setBind_IP_(String bind_IP_) {
        this.bind_IP_ = bind_IP_;
    }

    @JsonProperty("Buddy List Announce")
    public boolean isBuddy_List_Announce() {
        return buddy_List_Announce;
    }

    @JsonProperty("Buddy List Announce")
    public void setBuddy_List_Announce(boolean buddy_List_Announce) {
        this.buddy_List_Announce = buddy_List_Announce;
    }

    @JsonProperty("Buddy List Announce#")
    public String getBuddy_List_Announce_() {
        return buddy_List_Announce_;
    }

    @JsonProperty("Buddy List Announce#")
    public void setBuddy_List_Announce_(String buddy_List_Announce_) {
        this.buddy_List_Announce_ = buddy_List_Announce_;
    }

    @JsonProperty("Colorcode Chat")
    public boolean isColorcode_Chat() {
        return colorcode_Chat;
    }

    @JsonProperty("Colorcode Chat")
    public void setColorcode_Chat(boolean colorcode_Chat) {
        this.colorcode_Chat = colorcode_Chat;
    }

    @JsonProperty("Colorcode Chat#")
    public String getColorcode_Chat_() {
        return colorcode_Chat_;
    }

    @JsonProperty("Colorcode Chat#")
    public void setColorcode_Chat_(String colorcode_Chat_) {
        this.colorcode_Chat_ = colorcode_Chat_;
    }

    @JsonProperty("Damping Multiplier")
    public int getDamping_Multiplier() {
        return damping_Multiplier;
    }

    @JsonProperty("Damping Multiplier")
    public void setDamping_Multiplier(int damping_Multiplier) {
        this.damping_Multiplier = damping_Multiplier;
    }

    @JsonProperty("Damping Multiplier#")
    public String getDamping_Multiplier_() {
        return damping_Multiplier_;
    }

    @JsonProperty("Damping Multiplier#")
    public void setDamping_Multiplier_(String damping_Multiplier_) {
        this.damping_Multiplier_ = damping_Multiplier_;
    }

    @JsonProperty("Delay Vehicle Graphics")
    public boolean isDelay_Vehicle_Graphics() {
        return delay_Vehicle_Graphics;
    }

    @JsonProperty("Delay Vehicle Graphics")
    public void setDelay_Vehicle_Graphics(boolean delay_Vehicle_Graphics) {
        this.delay_Vehicle_Graphics = delay_Vehicle_Graphics;
    }

    @JsonProperty("Delay Vehicle Graphics#")
    public String getDelay_Vehicle_Graphics_() {
        return delay_Vehicle_Graphics_;
    }

    @JsonProperty("Delay Vehicle Graphics#")
    public void setDelay_Vehicle_Graphics_(String delay_Vehicle_Graphics_) {
        this.delay_Vehicle_Graphics_ = delay_Vehicle_Graphics_;
    }

    @JsonProperty("Display Laggy Labels")
    public boolean isDisplay_Laggy_Labels() {
        return display_Laggy_Labels;
    }

    @JsonProperty("Display Laggy Labels")
    public void setDisplay_Laggy_Labels(boolean display_Laggy_Labels) {
        this.display_Laggy_Labels = display_Laggy_Labels;
    }

    @JsonProperty("Display Laggy Labels#")
    public String getDisplay_Laggy_Labels_() {
        return display_Laggy_Labels_;
    }

    @JsonProperty("Display Laggy Labels#")
    public void setDisplay_Laggy_Labels_(String display_Laggy_Labels_) {
        this.display_Laggy_Labels_ = display_Laggy_Labels_;
    }

    @JsonProperty("Download Custom Skins")
    public boolean isDownload_Custom_Skins() {
        return download_Custom_Skins;
    }

    @JsonProperty("Download Custom Skins")
    public void setDownload_Custom_Skins(boolean download_Custom_Skins) {
        this.download_Custom_Skins = download_Custom_Skins;
    }

    @JsonProperty("Download Custom Skins#")
    public String getDownload_Custom_Skins_() {
        return download_Custom_Skins_;
    }

    @JsonProperty("Download Custom Skins#")
    public void setDownload_Custom_Skins_(String download_Custom_Skins_) {
        this.download_Custom_Skins_ = download_Custom_Skins_;
    }

    @JsonProperty("Downstream Rated KBPS")
    public int getDownstream_Rated_KBPS() {
        return downstream_Rated_KBPS;
    }

    @JsonProperty("Downstream Rated KBPS")
    public void setDownstream_Rated_KBPS(int downstream_Rated_KBPS) {
        this.downstream_Rated_KBPS = downstream_Rated_KBPS;
    }

    @JsonProperty("Downstream Rated KBPS#")
    public String getDownstream_Rated_KBPS_() {
        return downstream_Rated_KBPS_;
    }

    @JsonProperty("Downstream Rated KBPS#")
    public void setDownstream_Rated_KBPS_(String downstream_Rated_KBPS_) {
        this.downstream_Rated_KBPS_ = downstream_Rated_KBPS_;
    }

    @JsonProperty("Extrapolation Time")
    public int getExtrapolation_Time() {
        return extrapolation_Time;
    }

    @JsonProperty("Extrapolation Time")
    public void setExtrapolation_Time(int extrapolation_Time) {
        this.extrapolation_Time = extrapolation_Time;
    }

    @JsonProperty("Extrapolation Time#")
    public String getExtrapolation_Time_() {
        return extrapolation_Time_;
    }

    @JsonProperty("Extrapolation Time#")
    public void setExtrapolation_Time_(String extrapolation_Time_) {
        this.extrapolation_Time_ = extrapolation_Time_;
    }

    @JsonProperty("HTTP Server Port")
    public int getHTTP_Server_Port() {
        return hTTP_Server_Port;
    }

    @JsonProperty("HTTP Server Port")
    public void setHTTP_Server_Port(int hTTP_Server_Port) {
        this.hTTP_Server_Port = hTTP_Server_Port;
    }

    @JsonProperty("HTTP Server Port#")
    public String getHTTP_Server_Port_() {
        return hTTP_Server_Port_;
    }

    @JsonProperty("HTTP Server Port#")
    public void setHTTP_Server_Port_(String hTTP_Server_Port_) {
        this.hTTP_Server_Port_ = hTTP_Server_Port_;
    }

    @JsonProperty("Leave/Join Messages")
    public int getLeave_Join_Messages() {
        return leave_Join_Messages;
    }

    @JsonProperty("Leave/Join Messages")
    public void setLeave_Join_Messages(int leave_Join_Messages) {
        this.leave_Join_Messages = leave_Join_Messages;
    }

    @JsonProperty("Leave/Join Messages#")
    public String getLeave_Join_Messages_() {
        return leave_Join_Messages_;
    }

    @JsonProperty("Leave/Join Messages#")
    public void setLeave_Join_Messages_(String leave_Join_Messages_) {
        this.leave_Join_Messages_ = leave_Join_Messages_;
    }

    @JsonProperty("Live Updates")
    public boolean isLive_Updates() {
        return live_Updates;
    }

    @JsonProperty("Live Updates")
    public void setLive_Updates(boolean live_Updates) {
        this.live_Updates = live_Updates;
    }

    @JsonProperty("Live Updates#")
    public String getLive_Updates_() {
        return live_Updates_;
    }

    @JsonProperty("Live Updates#")
    public void setLive_Updates_(String live_Updates_) {
        this.live_Updates_ = live_Updates_;
    }

    @JsonProperty("Lobby Chat Nickname")
    public String getLobby_Chat_Nickname() {
        return lobby_Chat_Nickname;
    }

    @JsonProperty("Lobby Chat Nickname")
    public void setLobby_Chat_Nickname(String lobby_Chat_Nickname) {
        this.lobby_Chat_Nickname = lobby_Chat_Nickname;
    }

    @JsonProperty("Lobby Chat Nickname#")
    public String getLobby_Chat_Nickname_() {
        return lobby_Chat_Nickname_;
    }

    @JsonProperty("Lobby Chat Nickname#")
    public void setLobby_Chat_Nickname_(String lobby_Chat_Nickname_) {
        this.lobby_Chat_Nickname_ = lobby_Chat_Nickname_;
    }

    @JsonProperty("Multiplayer Sort Type")
    public int getMultiplayer_Sort_Type() {
        return multiplayer_Sort_Type;
    }

    @JsonProperty("Multiplayer Sort Type")
    public void setMultiplayer_Sort_Type(int multiplayer_Sort_Type) {
        this.multiplayer_Sort_Type = multiplayer_Sort_Type;
    }

    @JsonProperty("Multiplayer Sort Type#")
    public String getMultiplayer_Sort_Type_() {
        return multiplayer_Sort_Type_;
    }

    @JsonProperty("Multiplayer Sort Type#")
    public void setMultiplayer_Sort_Type_(String multiplayer_Sort_Type_) {
        this.multiplayer_Sort_Type_ = multiplayer_Sort_Type_;
    }

    @JsonProperty("Multiplayer auto retrieve servers")
    public boolean isMultiplayer_auto_retrieve_servers() {
        return multiplayer_auto_retrieve_servers;
    }

    @JsonProperty("Multiplayer auto retrieve servers")
    public void setMultiplayer_auto_retrieve_servers(boolean multiplayer_auto_retrieve_servers) {
        this.multiplayer_auto_retrieve_servers = multiplayer_auto_retrieve_servers;
    }

    @JsonProperty("Multiplayer auto retrieve servers#")
    public String getMultiplayer_auto_retrieve_servers_() {
        return multiplayer_auto_retrieve_servers_;
    }

    @JsonProperty("Multiplayer auto retrieve servers#")
    public void setMultiplayer_auto_retrieve_servers_(String multiplayer_auto_retrieve_servers_) {
        this.multiplayer_auto_retrieve_servers_ = multiplayer_auto_retrieve_servers_;
    }

    @JsonProperty("Multiplayer filter first operand")
    public String getMultiplayer_filter_first_operand() {
        return multiplayer_filter_first_operand;
    }

    @JsonProperty("Multiplayer filter first operand")
    public void setMultiplayer_filter_first_operand(String multiplayer_filter_first_operand) {
        this.multiplayer_filter_first_operand = multiplayer_filter_first_operand;
    }

    @JsonProperty("Multiplayer filter first operand#")
    public String getMultiplayer_filter_first_operand_() {
        return multiplayer_filter_first_operand_;
    }

    @JsonProperty("Multiplayer filter first operand#")
    public void setMultiplayer_filter_first_operand_(String multiplayer_filter_first_operand_) {
        this.multiplayer_filter_first_operand_ = multiplayer_filter_first_operand_;
    }

    @JsonProperty("Multiplayer filter operator")
    public String getMultiplayer_filter_operator() {
        return multiplayer_filter_operator;
    }

    @JsonProperty("Multiplayer filter operator")
    public void setMultiplayer_filter_operator(String multiplayer_filter_operator) {
        this.multiplayer_filter_operator = multiplayer_filter_operator;
    }

    @JsonProperty("Multiplayer filter operator#")
    public String getMultiplayer_filter_operator_() {
        return multiplayer_filter_operator_;
    }

    @JsonProperty("Multiplayer filter operator#")
    public void setMultiplayer_filter_operator_(String multiplayer_filter_operator_) {
        this.multiplayer_filter_operator_ = multiplayer_filter_operator_;
    }

    @JsonProperty("Multiplayer filter password servers")
    public boolean isMultiplayer_filter_password_servers() {
        return multiplayer_filter_password_servers;
    }

    @JsonProperty("Multiplayer filter password servers")
    public void setMultiplayer_filter_password_servers(boolean multiplayer_filter_password_servers) {
        this.multiplayer_filter_password_servers = multiplayer_filter_password_servers;
    }

    @JsonProperty("Multiplayer filter password servers#")
    public String getMultiplayer_filter_password_servers_() {
        return multiplayer_filter_password_servers_;
    }

    @JsonProperty("Multiplayer filter password servers#")
    public void setMultiplayer_filter_password_servers_(String multiplayer_filter_password_servers_) {
        this.multiplayer_filter_password_servers_ = multiplayer_filter_password_servers_;
    }

    @JsonProperty("Multiplayer filter second operand")
    public String getMultiplayer_filter_second_operand() {
        return multiplayer_filter_second_operand;
    }

    @JsonProperty("Multiplayer filter second operand")
    public void setMultiplayer_filter_second_operand(String multiplayer_filter_second_operand) {
        this.multiplayer_filter_second_operand = multiplayer_filter_second_operand;
    }

    @JsonProperty("Multiplayer filter second operand#")
    public String getMultiplayer_filter_second_operand_() {
        return multiplayer_filter_second_operand_;
    }

    @JsonProperty("Multiplayer filter second operand#")
    public void setMultiplayer_filter_second_operand_(String multiplayer_filter_second_operand_) {
        this.multiplayer_filter_second_operand_ = multiplayer_filter_second_operand_;
    }

    @JsonProperty("Multiplayer sort field")
    public int getMultiplayer_sort_field() {
        return multiplayer_sort_field;
    }

    @JsonProperty("Multiplayer sort field")
    public void setMultiplayer_sort_field(int multiplayer_sort_field) {
        this.multiplayer_sort_field = multiplayer_sort_field;
    }

    @JsonProperty("Multiplayer sort field#")
    public String getMultiplayer_sort_field_() {
        return multiplayer_sort_field_;
    }

    @JsonProperty("Multiplayer sort field#")
    public void setMultiplayer_sort_field_(String multiplayer_sort_field_) {
        this.multiplayer_sort_field_ = multiplayer_sort_field_;
    }

    @JsonProperty("Multiplayer sort value")
    public String getMultiplayer_sort_value() {
        return multiplayer_sort_value;
    }

    @JsonProperty("Multiplayer sort value")
    public void setMultiplayer_sort_value(String multiplayer_sort_value) {
        this.multiplayer_sort_value = multiplayer_sort_value;
    }

    @JsonProperty("Multiplayer sort value#")
    public String getMultiplayer_sort_value_() {
        return multiplayer_sort_value_;
    }

    @JsonProperty("Multiplayer sort value#")
    public void setMultiplayer_sort_value_(String multiplayer_sort_value_) {
        this.multiplayer_sort_value_ = multiplayer_sort_value_;
    }

    @JsonProperty("Net Connection Type")
    public int getNet_Connection_Type() {
        return net_Connection_Type;
    }

    @JsonProperty("Net Connection Type")
    public void setNet_Connection_Type(int net_Connection_Type) {
        this.net_Connection_Type = net_Connection_Type;
    }

    @JsonProperty("Net Connection Type#")
    public String getNet_Connection_Type_() {
        return net_Connection_Type_;
    }

    @JsonProperty("Net Connection Type#")
    public void setNet_Connection_Type_(String net_Connection_Type_) {
        this.net_Connection_Type_ = net_Connection_Type_;
    }

    @JsonProperty("Net Flush Threshold")
    public int getNet_Flush_Threshold() {
        return net_Flush_Threshold;
    }

    @JsonProperty("Net Flush Threshold")
    public void setNet_Flush_Threshold(int net_Flush_Threshold) {
        this.net_Flush_Threshold = net_Flush_Threshold;
    }

    @JsonProperty("Net Flush Threshold#")
    public String getNet_Flush_Threshold_() {
        return net_Flush_Threshold_;
    }

    @JsonProperty("Net Flush Threshold#")
    public void setNet_Flush_Threshold_(String net_Flush_Threshold_) {
        this.net_Flush_Threshold_ = net_Flush_Threshold_;
    }

    @JsonProperty("Orientation Spring")
    public int getOrientation_Spring() {
        return orientation_Spring;
    }

    @JsonProperty("Orientation Spring")
    public void setOrientation_Spring(int orientation_Spring) {
        this.orientation_Spring = orientation_Spring;
    }

    @JsonProperty("Orientation Spring#")
    public String getOrientation_Spring_() {
        return orientation_Spring_;
    }

    @JsonProperty("Orientation Spring#")
    public void setOrientation_Spring_(String orientation_Spring_) {
        this.orientation_Spring_ = orientation_Spring_;
    }

    @JsonProperty("Path Prediction")
    public int getPath_Prediction() {
        return path_Prediction;
    }

    @JsonProperty("Path Prediction")
    public void setPath_Prediction(int path_Prediction) {
        this.path_Prediction = path_Prediction;
    }

    @JsonProperty("Path Prediction#")
    public String getPath_Prediction_() {
        return path_Prediction_;
    }

    @JsonProperty("Path Prediction#")
    public void setPath_Prediction_(String path_Prediction_) {
        this.path_Prediction_ = path_Prediction_;
    }

    @JsonProperty("Position Spring")
    public int getPosition_Spring() {
        return position_Spring;
    }

    @JsonProperty("Position Spring")
    public void setPosition_Spring(int position_Spring) {
        this.position_Spring = position_Spring;
    }

    @JsonProperty("Position Spring#")
    public String getPosition_Spring_() {
        return position_Spring_;
    }

    @JsonProperty("Position Spring#")
    public void setPosition_Spring_(String position_Spring_) {
        this.position_Spring_ = position_Spring_;
    }

    @JsonProperty("Show Seating")
    public boolean isShow_Seating() {
        return show_Seating;
    }

    @JsonProperty("Show Seating")
    public void setShow_Seating(boolean show_Seating) {
        this.show_Seating = show_Seating;
    }

    @JsonProperty("Show Seating#")
    public String getShow_Seating_() {
        return show_Seating_;
    }

    @JsonProperty("Show Seating#")
    public void setShow_Seating_(String show_Seating_) {
        this.show_Seating_ = show_Seating_;
    }

    @JsonProperty("Simulation Port")
    public int getSimulation_Port() {
        return simulation_Port;
    }

    @JsonProperty("Simulation Port")
    public void setSimulation_Port(int simulation_Port) {
        this.simulation_Port = simulation_Port;
    }

    @JsonProperty("Simulation Port#")
    public String getSimulation_Port_() {
        return simulation_Port_;
    }

    @JsonProperty("Simulation Port#")
    public void setSimulation_Port_(String simulation_Port_) {
        this.simulation_Port_ = simulation_Port_;
    }

    @JsonProperty("Spectate Vehicle")
    public String getSpectate_Vehicle() {
        return spectate_Vehicle;
    }

    @JsonProperty("Spectate Vehicle")
    public void setSpectate_Vehicle(String spectate_Vehicle) {
        this.spectate_Vehicle = spectate_Vehicle;
    }

    @JsonProperty("Spectate Vehicle#")
    public String getSpectate_Vehicle_() {
        return spectate_Vehicle_;
    }

    @JsonProperty("Spectate Vehicle#")
    public void setSpectate_Vehicle_(String spectate_Vehicle_) {
        this.spectate_Vehicle_ = spectate_Vehicle_;
    }

    @JsonProperty("Spectator Mode")
    public boolean isSpectator_Mode() {
        return spectator_Mode;
    }

    @JsonProperty("Spectator Mode")
    public void setSpectator_Mode(boolean spectator_Mode) {
        this.spectator_Mode = spectator_Mode;
    }

    @JsonProperty("Spectator Mode#")
    public String getSpectator_Mode_() {
        return spectator_Mode_;
    }

    @JsonProperty("Spectator Mode#")
    public void setSpectator_Mode_(String spectator_Mode_) {
        this.spectator_Mode_ = spectator_Mode_;
    }

    @JsonProperty("Spectator Starting View")
    public int getSpectator_Starting_View() {
        return spectator_Starting_View;
    }

    @JsonProperty("Spectator Starting View")
    public void setSpectator_Starting_View(int spectator_Starting_View) {
        this.spectator_Starting_View = spectator_Starting_View;
    }

    @JsonProperty("Spectator Starting View#")
    public String getSpectator_Starting_View_() {
        return spectator_Starting_View_;
    }

    @JsonProperty("Spectator Starting View#")
    public void setSpectator_Starting_View_(String spectator_Starting_View_) {
        this.spectator_Starting_View_ = spectator_Starting_View_;
    }

    @JsonProperty("Temporary Vehicle Graphics")
    public int getTemporary_Vehicle_Graphics() {
        return temporary_Vehicle_Graphics;
    }

    @JsonProperty("Temporary Vehicle Graphics")
    public void setTemporary_Vehicle_Graphics(int temporary_Vehicle_Graphics) {
        this.temporary_Vehicle_Graphics = temporary_Vehicle_Graphics;
    }

    @JsonProperty("Temporary Vehicle Graphics#")
    public String getTemporary_Vehicle_Graphics_() {
        return temporary_Vehicle_Graphics_;
    }

    @JsonProperty("Temporary Vehicle Graphics#")
    public void setTemporary_Vehicle_Graphics_(String temporary_Vehicle_Graphics_) {
        this.temporary_Vehicle_Graphics_ = temporary_Vehicle_Graphics_;
    }

    @JsonProperty("Upstream Rated KBPS")
    public int getUpstream_Rated_KBPS() {
        return upstream_Rated_KBPS;
    }

    @JsonProperty("Upstream Rated KBPS")
    public void setUpstream_Rated_KBPS(int upstream_Rated_KBPS) {
        this.upstream_Rated_KBPS = upstream_Rated_KBPS;
    }

    @JsonProperty("Upstream Rated KBPS#")
    public String getUpstream_Rated_KBPS_() {
        return upstream_Rated_KBPS_;
    }

    @JsonProperty("Upstream Rated KBPS#")
    public void setUpstream_Rated_KBPS_(String upstream_Rated_KBPS_) {
        this.upstream_Rated_KBPS_ = upstream_Rated_KBPS_;
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
        sb.append(MultiplayerGeneralOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allow_Chat_In_Car");
        sb.append('=');
        sb.append(this.allow_Chat_In_Car);
        sb.append(',');
        sb.append("allow_Chat_In_Car_");
        sb.append('=');
        sb.append(((this.allow_Chat_In_Car_ == null) ? "<null>" : this.allow_Chat_In_Car_));
        sb.append(',');
        sb.append("auto_Join_Chat_Server");
        sb.append('=');
        sb.append(this.auto_Join_Chat_Server);
        sb.append(',');
        sb.append("auto_Join_Chat_Server_");
        sb.append('=');
        sb.append(((this.auto_Join_Chat_Server_ == null) ? "<null>" : this.auto_Join_Chat_Server_));
        sb.append(',');
        sb.append("autoscroll_Chat");
        sb.append('=');
        sb.append(this.autoscroll_Chat);
        sb.append(',');
        sb.append("autoscroll_Chat_");
        sb.append('=');
        sb.append(((this.autoscroll_Chat_ == null) ? "<null>" : this.autoscroll_Chat_));
        sb.append(',');
        sb.append("bind_IP");
        sb.append('=');
        sb.append(((this.bind_IP == null) ? "<null>" : this.bind_IP));
        sb.append(',');
        sb.append("bind_IP_");
        sb.append('=');
        sb.append(((this.bind_IP_ == null) ? "<null>" : this.bind_IP_));
        sb.append(',');
        sb.append("buddy_List_Announce");
        sb.append('=');
        sb.append(this.buddy_List_Announce);
        sb.append(',');
        sb.append("buddy_List_Announce_");
        sb.append('=');
        sb.append(((this.buddy_List_Announce_ == null) ? "<null>" : this.buddy_List_Announce_));
        sb.append(',');
        sb.append("colorcode_Chat");
        sb.append('=');
        sb.append(this.colorcode_Chat);
        sb.append(',');
        sb.append("colorcode_Chat_");
        sb.append('=');
        sb.append(((this.colorcode_Chat_ == null) ? "<null>" : this.colorcode_Chat_));
        sb.append(',');
        sb.append("damping_Multiplier");
        sb.append('=');
        sb.append(this.damping_Multiplier);
        sb.append(',');
        sb.append("damping_Multiplier_");
        sb.append('=');
        sb.append(((this.damping_Multiplier_ == null) ? "<null>" : this.damping_Multiplier_));
        sb.append(',');
        sb.append("delay_Vehicle_Graphics");
        sb.append('=');
        sb.append(this.delay_Vehicle_Graphics);
        sb.append(',');
        sb.append("delay_Vehicle_Graphics_");
        sb.append('=');
        sb.append(((this.delay_Vehicle_Graphics_ == null) ? "<null>" : this.delay_Vehicle_Graphics_));
        sb.append(',');
        sb.append("display_Laggy_Labels");
        sb.append('=');
        sb.append(this.display_Laggy_Labels);
        sb.append(',');
        sb.append("display_Laggy_Labels_");
        sb.append('=');
        sb.append(((this.display_Laggy_Labels_ == null) ? "<null>" : this.display_Laggy_Labels_));
        sb.append(',');
        sb.append("download_Custom_Skins");
        sb.append('=');
        sb.append(this.download_Custom_Skins);
        sb.append(',');
        sb.append("download_Custom_Skins_");
        sb.append('=');
        sb.append(((this.download_Custom_Skins_ == null) ? "<null>" : this.download_Custom_Skins_));
        sb.append(',');
        sb.append("downstream_Rated_KBPS");
        sb.append('=');
        sb.append(this.downstream_Rated_KBPS);
        sb.append(',');
        sb.append("downstream_Rated_KBPS_");
        sb.append('=');
        sb.append(((this.downstream_Rated_KBPS_ == null) ? "<null>" : this.downstream_Rated_KBPS_));
        sb.append(',');
        sb.append("extrapolation_Time");
        sb.append('=');
        sb.append(this.extrapolation_Time);
        sb.append(',');
        sb.append("extrapolation_Time_");
        sb.append('=');
        sb.append(((this.extrapolation_Time_ == null) ? "<null>" : this.extrapolation_Time_));
        sb.append(',');
        sb.append("hTTP_Server_Port");
        sb.append('=');
        sb.append(this.hTTP_Server_Port);
        sb.append(',');
        sb.append("hTTP_Server_Port_");
        sb.append('=');
        sb.append(((this.hTTP_Server_Port_ == null) ? "<null>" : this.hTTP_Server_Port_));
        sb.append(',');
        sb.append("leave_Join_Messages");
        sb.append('=');
        sb.append(this.leave_Join_Messages);
        sb.append(',');
        sb.append("leave_Join_Messages_");
        sb.append('=');
        sb.append(((this.leave_Join_Messages_ == null) ? "<null>" : this.leave_Join_Messages_));
        sb.append(',');
        sb.append("live_Updates");
        sb.append('=');
        sb.append(this.live_Updates);
        sb.append(',');
        sb.append("live_Updates_");
        sb.append('=');
        sb.append(((this.live_Updates_ == null) ? "<null>" : this.live_Updates_));
        sb.append(',');
        sb.append("lobby_Chat_Nickname");
        sb.append('=');
        sb.append(((this.lobby_Chat_Nickname == null) ? "<null>" : this.lobby_Chat_Nickname));
        sb.append(',');
        sb.append("lobby_Chat_Nickname_");
        sb.append('=');
        sb.append(((this.lobby_Chat_Nickname_ == null) ? "<null>" : this.lobby_Chat_Nickname_));
        sb.append(',');
        sb.append("multiplayer_Sort_Type");
        sb.append('=');
        sb.append(this.multiplayer_Sort_Type);
        sb.append(',');
        sb.append("multiplayer_Sort_Type_");
        sb.append('=');
        sb.append(((this.multiplayer_Sort_Type_ == null) ? "<null>" : this.multiplayer_Sort_Type_));
        sb.append(',');
        sb.append("multiplayer_auto_retrieve_servers");
        sb.append('=');
        sb.append(this.multiplayer_auto_retrieve_servers);
        sb.append(',');
        sb.append("multiplayer_auto_retrieve_servers_");
        sb.append('=');
        sb.append(((this.multiplayer_auto_retrieve_servers_ == null) ? "<null>" : this.multiplayer_auto_retrieve_servers_));
        sb.append(',');
        sb.append("multiplayer_filter_first_operand");
        sb.append('=');
        sb.append(((this.multiplayer_filter_first_operand == null) ? "<null>" : this.multiplayer_filter_first_operand));
        sb.append(',');
        sb.append("multiplayer_filter_first_operand_");
        sb.append('=');
        sb.append(((this.multiplayer_filter_first_operand_ == null) ? "<null>" : this.multiplayer_filter_first_operand_));
        sb.append(',');
        sb.append("multiplayer_filter_operator");
        sb.append('=');
        sb.append(((this.multiplayer_filter_operator == null) ? "<null>" : this.multiplayer_filter_operator));
        sb.append(',');
        sb.append("multiplayer_filter_operator_");
        sb.append('=');
        sb.append(((this.multiplayer_filter_operator_ == null) ? "<null>" : this.multiplayer_filter_operator_));
        sb.append(',');
        sb.append("multiplayer_filter_password_servers");
        sb.append('=');
        sb.append(this.multiplayer_filter_password_servers);
        sb.append(',');
        sb.append("multiplayer_filter_password_servers_");
        sb.append('=');
        sb.append(((this.multiplayer_filter_password_servers_ == null) ? "<null>" : this.multiplayer_filter_password_servers_));
        sb.append(',');
        sb.append("multiplayer_filter_second_operand");
        sb.append('=');
        sb.append(((this.multiplayer_filter_second_operand == null) ? "<null>" : this.multiplayer_filter_second_operand));
        sb.append(',');
        sb.append("multiplayer_filter_second_operand_");
        sb.append('=');
        sb.append(((this.multiplayer_filter_second_operand_ == null) ? "<null>" : this.multiplayer_filter_second_operand_));
        sb.append(',');
        sb.append("multiplayer_sort_field");
        sb.append('=');
        sb.append(this.multiplayer_sort_field);
        sb.append(',');
        sb.append("multiplayer_sort_field_");
        sb.append('=');
        sb.append(((this.multiplayer_sort_field_ == null) ? "<null>" : this.multiplayer_sort_field_));
        sb.append(',');
        sb.append("multiplayer_sort_value");
        sb.append('=');
        sb.append(((this.multiplayer_sort_value == null) ? "<null>" : this.multiplayer_sort_value));
        sb.append(',');
        sb.append("multiplayer_sort_value_");
        sb.append('=');
        sb.append(((this.multiplayer_sort_value_ == null) ? "<null>" : this.multiplayer_sort_value_));
        sb.append(',');
        sb.append("net_Connection_Type");
        sb.append('=');
        sb.append(this.net_Connection_Type);
        sb.append(',');
        sb.append("net_Connection_Type_");
        sb.append('=');
        sb.append(((this.net_Connection_Type_ == null) ? "<null>" : this.net_Connection_Type_));
        sb.append(',');
        sb.append("net_Flush_Threshold");
        sb.append('=');
        sb.append(this.net_Flush_Threshold);
        sb.append(',');
        sb.append("net_Flush_Threshold_");
        sb.append('=');
        sb.append(((this.net_Flush_Threshold_ == null) ? "<null>" : this.net_Flush_Threshold_));
        sb.append(',');
        sb.append("orientation_Spring");
        sb.append('=');
        sb.append(this.orientation_Spring);
        sb.append(',');
        sb.append("orientation_Spring_");
        sb.append('=');
        sb.append(((this.orientation_Spring_ == null) ? "<null>" : this.orientation_Spring_));
        sb.append(',');
        sb.append("path_Prediction");
        sb.append('=');
        sb.append(this.path_Prediction);
        sb.append(',');
        sb.append("path_Prediction_");
        sb.append('=');
        sb.append(((this.path_Prediction_ == null) ? "<null>" : this.path_Prediction_));
        sb.append(',');
        sb.append("position_Spring");
        sb.append('=');
        sb.append(this.position_Spring);
        sb.append(',');
        sb.append("position_Spring_");
        sb.append('=');
        sb.append(((this.position_Spring_ == null) ? "<null>" : this.position_Spring_));
        sb.append(',');
        sb.append("show_Seating");
        sb.append('=');
        sb.append(this.show_Seating);
        sb.append(',');
        sb.append("show_Seating_");
        sb.append('=');
        sb.append(((this.show_Seating_ == null) ? "<null>" : this.show_Seating_));
        sb.append(',');
        sb.append("simulation_Port");
        sb.append('=');
        sb.append(this.simulation_Port);
        sb.append(',');
        sb.append("simulation_Port_");
        sb.append('=');
        sb.append(((this.simulation_Port_ == null) ? "<null>" : this.simulation_Port_));
        sb.append(',');
        sb.append("spectate_Vehicle");
        sb.append('=');
        sb.append(((this.spectate_Vehicle == null) ? "<null>" : this.spectate_Vehicle));
        sb.append(',');
        sb.append("spectate_Vehicle_");
        sb.append('=');
        sb.append(((this.spectate_Vehicle_ == null) ? "<null>" : this.spectate_Vehicle_));
        sb.append(',');
        sb.append("spectator_Mode");
        sb.append('=');
        sb.append(this.spectator_Mode);
        sb.append(',');
        sb.append("spectator_Mode_");
        sb.append('=');
        sb.append(((this.spectator_Mode_ == null) ? "<null>" : this.spectator_Mode_));
        sb.append(',');
        sb.append("spectator_Starting_View");
        sb.append('=');
        sb.append(this.spectator_Starting_View);
        sb.append(',');
        sb.append("spectator_Starting_View_");
        sb.append('=');
        sb.append(((this.spectator_Starting_View_ == null) ? "<null>" : this.spectator_Starting_View_));
        sb.append(',');
        sb.append("temporary_Vehicle_Graphics");
        sb.append('=');
        sb.append(this.temporary_Vehicle_Graphics);
        sb.append(',');
        sb.append("temporary_Vehicle_Graphics_");
        sb.append('=');
        sb.append(((this.temporary_Vehicle_Graphics_ == null) ? "<null>" : this.temporary_Vehicle_Graphics_));
        sb.append(',');
        sb.append("upstream_Rated_KBPS");
        sb.append('=');
        sb.append(this.upstream_Rated_KBPS);
        sb.append(',');
        sb.append("upstream_Rated_KBPS_");
        sb.append('=');
        sb.append(((this.upstream_Rated_KBPS_ == null) ? "<null>" : this.upstream_Rated_KBPS_));
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
        result = ((result * 31) + ((this.multiplayer_filter_operator == null) ? 0 : this.multiplayer_filter_operator.hashCode()));
        result = ((result * 31) + this.position_Spring);
        result = ((result * 31) + (this.delay_Vehicle_Graphics ? 1 : 0));
        result = ((result * 31) + this.extrapolation_Time);
        result = ((result * 31) + ((this.spectator_Mode_ == null) ? 0 : this.spectator_Mode_.hashCode()));
        result = ((result * 31) + ((this.upstream_Rated_KBPS_ == null) ? 0 : this.upstream_Rated_KBPS_.hashCode()));
        result = ((result * 31) + ((this.hTTP_Server_Port_ == null) ? 0 : this.hTTP_Server_Port_.hashCode()));
        result = ((result * 31) + (this.multiplayer_filter_password_servers ? 1 : 0));
        result = ((result * 31) + ((this.allow_Chat_In_Car_ == null) ? 0 : this.allow_Chat_In_Car_.hashCode()));
        result = ((result * 31) + ((this.download_Custom_Skins_ == null) ? 0 : this.download_Custom_Skins_.hashCode()));
        result = ((result * 31) + ((this.multiplayer_filter_first_operand == null) ? 0 : this.multiplayer_filter_first_operand.hashCode()));
        result = ((result * 31) + ((this.bind_IP_ == null) ? 0 : this.bind_IP_.hashCode()));
        result = ((result * 31) + ((this.lobby_Chat_Nickname == null) ? 0 : this.lobby_Chat_Nickname.hashCode()));
        result = ((result * 31) + ((this.net_Connection_Type_ == null) ? 0 : this.net_Connection_Type_.hashCode()));
        result = ((result * 31) + this.net_Flush_Threshold);
        result = ((result * 31) + (this.display_Laggy_Labels ? 1 : 0));
        result = ((result * 31) + ((this.position_Spring_ == null) ? 0 : this.position_Spring_.hashCode()));
        result = ((result * 31) + ((this.display_Laggy_Labels_ == null) ? 0 : this.display_Laggy_Labels_.hashCode()));
        result = ((result * 31) + ((this.extrapolation_Time_ == null) ? 0 : this.extrapolation_Time_.hashCode()));
        result = ((result * 31) + this.orientation_Spring);
        result = ((result * 31) + ((this.delay_Vehicle_Graphics_ == null) ? 0 : this.delay_Vehicle_Graphics_.hashCode()));
        result = ((result * 31) + ((this.multiplayer_filter_operator_ == null) ? 0 : this.multiplayer_filter_operator_.hashCode()));
        result = ((result * 31) + this.hTTP_Server_Port);
        result = ((result * 31) + (this.show_Seating ? 1 : 0));
        result = ((result * 31) + ((this.auto_Join_Chat_Server_ == null) ? 0 : this.auto_Join_Chat_Server_.hashCode()));
        result = ((result * 31) + ((this.multiplayer_filter_first_operand_ == null) ? 0 : this.multiplayer_filter_first_operand_.hashCode()));
        result = ((result * 31) + (this.colorcode_Chat ? 1 : 0));
        result = ((result * 31) + ((this.buddy_List_Announce_ == null) ? 0 : this.buddy_List_Announce_.hashCode()));
        result = ((result * 31) + ((this.multiplayer_sort_value == null) ? 0 : this.multiplayer_sort_value.hashCode()));
        result = ((result * 31) + (this.multiplayer_auto_retrieve_servers ? 1 : 0));
        result = ((result * 31) + ((this.leave_Join_Messages_ == null) ? 0 : this.leave_Join_Messages_.hashCode()));
        result = ((result * 31) + ((this.orientation_Spring_ == null) ? 0 : this.orientation_Spring_.hashCode()));
        result = ((result * 31) + (this.allow_Chat_In_Car ? 1 : 0));
        result = ((result * 31) + ((this.autoscroll_Chat_ == null) ? 0 : this.autoscroll_Chat_.hashCode()));
        result = ((result * 31) + this.upstream_Rated_KBPS);
        result = ((result * 31) + (this.download_Custom_Skins ? 1 : 0));
        result = ((result * 31) + this.downstream_Rated_KBPS);
        result = ((result * 31) + ((this.simulation_Port_ == null) ? 0 : this.simulation_Port_.hashCode()));
        result = ((result * 31) + ((this.multiplayer_Sort_Type_ == null) ? 0 : this.multiplayer_Sort_Type_.hashCode()));
        result = ((result * 31) + (this.buddy_List_Announce ? 1 : 0));
        result = ((result * 31) + ((this.multiplayer_filter_second_operand == null) ? 0 : this.multiplayer_filter_second_operand.hashCode()));
        result = ((result * 31) + ((this.damping_Multiplier_ == null) ? 0 : this.damping_Multiplier_.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.colorcode_Chat_ == null) ? 0 : this.colorcode_Chat_.hashCode()));
        result = ((result * 31) + (this.live_Updates ? 1 : 0));
        result = ((result * 31) + this.simulation_Port);
        result = ((result * 31) + ((this.multiplayer_filter_second_operand_ == null) ? 0 : this.multiplayer_filter_second_operand_.hashCode()));
        result = ((result * 31) + (this.auto_Join_Chat_Server ? 1 : 0));
        result = ((result * 31) + ((this.multiplayer_sort_field_ == null) ? 0 : this.multiplayer_sort_field_.hashCode()));
        result = ((result * 31) + this.spectator_Starting_View);
        result = ((result * 31) + ((this.multiplayer_auto_retrieve_servers_ == null) ? 0 : this.multiplayer_auto_retrieve_servers_.hashCode()));
        result = ((result * 31) + ((this.multiplayer_sort_value_ == null) ? 0 : this.multiplayer_sort_value_.hashCode()));
        result = ((result * 31) + this.multiplayer_sort_field);
        result = ((result * 31) + ((this.downstream_Rated_KBPS_ == null) ? 0 : this.downstream_Rated_KBPS_.hashCode()));
        result = ((result * 31) + ((this.show_Seating_ == null) ? 0 : this.show_Seating_.hashCode()));
        result = ((result * 31) + this.temporary_Vehicle_Graphics);
        result = ((result * 31) + this.net_Connection_Type);
        result = ((result * 31) + ((this.net_Flush_Threshold_ == null) ? 0 : this.net_Flush_Threshold_.hashCode()));
        result = ((result * 31) + ((this.path_Prediction_ == null) ? 0 : this.path_Prediction_.hashCode()));
        result = ((result * 31) + ((this.spectator_Starting_View_ == null) ? 0 : this.spectator_Starting_View_.hashCode()));
        result = ((result * 31) + this.multiplayer_Sort_Type);
        result = ((result * 31) + ((this.temporary_Vehicle_Graphics_ == null) ? 0 : this.temporary_Vehicle_Graphics_.hashCode()));
        result = ((result * 31) + ((this.bind_IP == null) ? 0 : this.bind_IP.hashCode()));
        result = ((result * 31) + this.leave_Join_Messages);
        result = ((result * 31) + (this.spectator_Mode ? 1 : 0));
        result = ((result * 31) + ((this.spectate_Vehicle == null) ? 0 : this.spectate_Vehicle.hashCode()));
        result = ((result * 31) + this.path_Prediction);
        result = ((result * 31) + ((this.multiplayer_filter_password_servers_ == null) ? 0 : this.multiplayer_filter_password_servers_.hashCode()));
        result = ((result * 31) + ((this.live_Updates_ == null) ? 0 : this.live_Updates_.hashCode()));
        result = ((result * 31) + ((this.spectate_Vehicle_ == null) ? 0 : this.spectate_Vehicle_.hashCode()));
        result = ((result * 31) + this.autoscroll_Chat);
        result = ((result * 31) + this.damping_Multiplier);
        result = ((result * 31) + ((this.lobby_Chat_Nickname_ == null) ? 0 : this.lobby_Chat_Nickname_.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MultiplayerGeneralOptions) == false) {
            return false;
        }
        MultiplayerGeneralOptions rhs = ((MultiplayerGeneralOptions) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.multiplayer_filter_operator == rhs.multiplayer_filter_operator) || ((this.multiplayer_filter_operator != null) && this.multiplayer_filter_operator.equals(rhs.multiplayer_filter_operator))) && (this.position_Spring == rhs.position_Spring)) && (this.delay_Vehicle_Graphics == rhs.delay_Vehicle_Graphics)) && (this.extrapolation_Time == rhs.extrapolation_Time)) && ((this.spectator_Mode_ == rhs.spectator_Mode_) || ((this.spectator_Mode_ != null) && this.spectator_Mode_.equals(rhs.spectator_Mode_)))) && ((this.upstream_Rated_KBPS_ == rhs.upstream_Rated_KBPS_) || ((this.upstream_Rated_KBPS_ != null) && this.upstream_Rated_KBPS_.equals(rhs.upstream_Rated_KBPS_)))) && ((this.hTTP_Server_Port_ == rhs.hTTP_Server_Port_) || ((this.hTTP_Server_Port_ != null) && this.hTTP_Server_Port_.equals(rhs.hTTP_Server_Port_)))) && (this.multiplayer_filter_password_servers == rhs.multiplayer_filter_password_servers)) && ((this.allow_Chat_In_Car_ == rhs.allow_Chat_In_Car_) || ((this.allow_Chat_In_Car_ != null) && this.allow_Chat_In_Car_.equals(rhs.allow_Chat_In_Car_)))) && ((this.download_Custom_Skins_ == rhs.download_Custom_Skins_) || ((this.download_Custom_Skins_ != null) && this.download_Custom_Skins_.equals(rhs.download_Custom_Skins_)))) && ((this.multiplayer_filter_first_operand == rhs.multiplayer_filter_first_operand) || ((this.multiplayer_filter_first_operand != null) && this.multiplayer_filter_first_operand.equals(rhs.multiplayer_filter_first_operand)))) && ((this.bind_IP_ == rhs.bind_IP_) || ((this.bind_IP_ != null) && this.bind_IP_.equals(rhs.bind_IP_)))) && ((this.lobby_Chat_Nickname == rhs.lobby_Chat_Nickname) || ((this.lobby_Chat_Nickname != null) && this.lobby_Chat_Nickname.equals(rhs.lobby_Chat_Nickname)))) && ((this.net_Connection_Type_ == rhs.net_Connection_Type_) || ((this.net_Connection_Type_ != null) && this.net_Connection_Type_.equals(rhs.net_Connection_Type_)))) && (this.net_Flush_Threshold == rhs.net_Flush_Threshold)) && (this.display_Laggy_Labels == rhs.display_Laggy_Labels)) && ((this.position_Spring_ == rhs.position_Spring_) || ((this.position_Spring_ != null) && this.position_Spring_.equals(rhs.position_Spring_)))) && ((this.display_Laggy_Labels_ == rhs.display_Laggy_Labels_) || ((this.display_Laggy_Labels_ != null) && this.display_Laggy_Labels_.equals(rhs.display_Laggy_Labels_)))) && ((this.extrapolation_Time_ == rhs.extrapolation_Time_) || ((this.extrapolation_Time_ != null) && this.extrapolation_Time_.equals(rhs.extrapolation_Time_)))) && (this.orientation_Spring == rhs.orientation_Spring)) && ((this.delay_Vehicle_Graphics_ == rhs.delay_Vehicle_Graphics_) || ((this.delay_Vehicle_Graphics_ != null) && this.delay_Vehicle_Graphics_.equals(rhs.delay_Vehicle_Graphics_)))) && ((this.multiplayer_filter_operator_ == rhs.multiplayer_filter_operator_) || ((this.multiplayer_filter_operator_ != null) && this.multiplayer_filter_operator_.equals(rhs.multiplayer_filter_operator_)))) && (this.hTTP_Server_Port == rhs.hTTP_Server_Port)) && (this.show_Seating == rhs.show_Seating)) && ((this.auto_Join_Chat_Server_ == rhs.auto_Join_Chat_Server_) || ((this.auto_Join_Chat_Server_ != null) && this.auto_Join_Chat_Server_.equals(rhs.auto_Join_Chat_Server_)))) && ((this.multiplayer_filter_first_operand_ == rhs.multiplayer_filter_first_operand_) || ((this.multiplayer_filter_first_operand_ != null) && this.multiplayer_filter_first_operand_.equals(rhs.multiplayer_filter_first_operand_)))) && (this.colorcode_Chat == rhs.colorcode_Chat)) && ((this.buddy_List_Announce_ == rhs.buddy_List_Announce_) || ((this.buddy_List_Announce_ != null) && this.buddy_List_Announce_.equals(rhs.buddy_List_Announce_)))) && ((this.multiplayer_sort_value == rhs.multiplayer_sort_value) || ((this.multiplayer_sort_value != null) && this.multiplayer_sort_value.equals(rhs.multiplayer_sort_value)))) && (this.multiplayer_auto_retrieve_servers == rhs.multiplayer_auto_retrieve_servers)) && ((this.leave_Join_Messages_ == rhs.leave_Join_Messages_) || ((this.leave_Join_Messages_ != null) && this.leave_Join_Messages_.equals(rhs.leave_Join_Messages_)))) && ((this.orientation_Spring_ == rhs.orientation_Spring_) || ((this.orientation_Spring_ != null) && this.orientation_Spring_.equals(rhs.orientation_Spring_)))) && (this.allow_Chat_In_Car == rhs.allow_Chat_In_Car)) && ((this.autoscroll_Chat_ == rhs.autoscroll_Chat_) || ((this.autoscroll_Chat_ != null) && this.autoscroll_Chat_.equals(rhs.autoscroll_Chat_)))) && (this.upstream_Rated_KBPS == rhs.upstream_Rated_KBPS)) && (this.download_Custom_Skins == rhs.download_Custom_Skins)) && (this.downstream_Rated_KBPS == rhs.downstream_Rated_KBPS)) && ((this.simulation_Port_ == rhs.simulation_Port_) || ((this.simulation_Port_ != null) && this.simulation_Port_.equals(rhs.simulation_Port_)))) && ((this.multiplayer_Sort_Type_ == rhs.multiplayer_Sort_Type_) || ((this.multiplayer_Sort_Type_ != null) && this.multiplayer_Sort_Type_.equals(rhs.multiplayer_Sort_Type_)))) && (this.buddy_List_Announce == rhs.buddy_List_Announce)) && ((this.multiplayer_filter_second_operand == rhs.multiplayer_filter_second_operand) || ((this.multiplayer_filter_second_operand != null) && this.multiplayer_filter_second_operand.equals(rhs.multiplayer_filter_second_operand)))) && ((this.damping_Multiplier_ == rhs.damping_Multiplier_) || ((this.damping_Multiplier_ != null) && this.damping_Multiplier_.equals(rhs.damping_Multiplier_)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.colorcode_Chat_ == rhs.colorcode_Chat_) || ((this.colorcode_Chat_ != null) && this.colorcode_Chat_.equals(rhs.colorcode_Chat_)))) && (this.live_Updates == rhs.live_Updates)) && (this.simulation_Port == rhs.simulation_Port)) && ((this.multiplayer_filter_second_operand_ == rhs.multiplayer_filter_second_operand_) || ((this.multiplayer_filter_second_operand_ != null) && this.multiplayer_filter_second_operand_.equals(rhs.multiplayer_filter_second_operand_)))) && (this.auto_Join_Chat_Server == rhs.auto_Join_Chat_Server)) && ((this.multiplayer_sort_field_ == rhs.multiplayer_sort_field_) || ((this.multiplayer_sort_field_ != null) && this.multiplayer_sort_field_.equals(rhs.multiplayer_sort_field_)))) && (this.spectator_Starting_View == rhs.spectator_Starting_View)) && ((this.multiplayer_auto_retrieve_servers_ == rhs.multiplayer_auto_retrieve_servers_) || ((this.multiplayer_auto_retrieve_servers_ != null) && this.multiplayer_auto_retrieve_servers_.equals(rhs.multiplayer_auto_retrieve_servers_)))) && ((this.multiplayer_sort_value_ == rhs.multiplayer_sort_value_) || ((this.multiplayer_sort_value_ != null) && this.multiplayer_sort_value_.equals(rhs.multiplayer_sort_value_)))) && (this.multiplayer_sort_field == rhs.multiplayer_sort_field)) && ((this.downstream_Rated_KBPS_ == rhs.downstream_Rated_KBPS_) || ((this.downstream_Rated_KBPS_ != null) && this.downstream_Rated_KBPS_.equals(rhs.downstream_Rated_KBPS_)))) && ((this.show_Seating_ == rhs.show_Seating_) || ((this.show_Seating_ != null) && this.show_Seating_.equals(rhs.show_Seating_)))) && (this.temporary_Vehicle_Graphics == rhs.temporary_Vehicle_Graphics)) && (this.net_Connection_Type == rhs.net_Connection_Type)) && ((this.net_Flush_Threshold_ == rhs.net_Flush_Threshold_) || ((this.net_Flush_Threshold_ != null) && this.net_Flush_Threshold_.equals(rhs.net_Flush_Threshold_)))) && ((this.path_Prediction_ == rhs.path_Prediction_) || ((this.path_Prediction_ != null) && this.path_Prediction_.equals(rhs.path_Prediction_)))) && ((this.spectator_Starting_View_ == rhs.spectator_Starting_View_) || ((this.spectator_Starting_View_ != null) && this.spectator_Starting_View_.equals(rhs.spectator_Starting_View_)))) && (this.multiplayer_Sort_Type == rhs.multiplayer_Sort_Type)) && ((this.temporary_Vehicle_Graphics_ == rhs.temporary_Vehicle_Graphics_) || ((this.temporary_Vehicle_Graphics_ != null) && this.temporary_Vehicle_Graphics_.equals(rhs.temporary_Vehicle_Graphics_)))) && ((this.bind_IP == rhs.bind_IP) || ((this.bind_IP != null) && this.bind_IP.equals(rhs.bind_IP)))) && (this.leave_Join_Messages == rhs.leave_Join_Messages)) && (this.spectator_Mode == rhs.spectator_Mode)) && ((this.spectate_Vehicle == rhs.spectate_Vehicle) || ((this.spectate_Vehicle != null) && this.spectate_Vehicle.equals(rhs.spectate_Vehicle)))) && (this.path_Prediction == rhs.path_Prediction)) && ((this.multiplayer_filter_password_servers_ == rhs.multiplayer_filter_password_servers_) || ((this.multiplayer_filter_password_servers_ != null) && this.multiplayer_filter_password_servers_.equals(rhs.multiplayer_filter_password_servers_)))) && ((this.live_Updates_ == rhs.live_Updates_) || ((this.live_Updates_ != null) && this.live_Updates_.equals(rhs.live_Updates_)))) && ((this.spectate_Vehicle_ == rhs.spectate_Vehicle_) || ((this.spectate_Vehicle_ != null) && this.spectate_Vehicle_.equals(rhs.spectate_Vehicle_)))) && (this.autoscroll_Chat == rhs.autoscroll_Chat)) && (this.damping_Multiplier == rhs.damping_Multiplier)) && ((this.lobby_Chat_Nickname_ == rhs.lobby_Chat_Nickname_) || ((this.lobby_Chat_Nickname_ != null) && this.lobby_Chat_Nickname_.equals(rhs.lobby_Chat_Nickname_))));
    }

}
