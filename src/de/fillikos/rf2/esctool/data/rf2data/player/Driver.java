package de.fillikos.rf2.esctool.data.rf2data.player;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Birth Date",
        "Driver Hotswap Delay",
        "Driver Hotswap Delay#",
        "Game Description",
        "Game Description#",
        "Game Exit When Missing",
        "Game Exit When Missing#",
        "Game Version",
        "Game Version#",
        "Helmet",
        "Location",
        "Nationality",
        "Original Driver",
        "Package Dir",
        "Player Name",
        "Player Nick",
        "Season",
        "Season#",
        "Showroom",
        "Showroom Component",
        "Showroom Component Version",
        "Starting Driver",
        "Starting Driver#",
        "Subscribe to all Studio397 Content",
        "Team",
        "Unique ID",
        "Unique ID#",
        "Vehicle File"
})
@Generated("jsonschema2pojo")
public class Driver {

    @JsonProperty("Birth Date")
    private String birth_Date;
    @JsonProperty("Driver Hotswap Delay")
    private int driver_Hotswap_Delay;
    @JsonProperty("Driver Hotswap Delay#")
    private String driver_Hotswap_Delay_;
    @JsonProperty("Game Description")
    private String game_Description;
    @JsonProperty("Game Description#")
    private String game_Description_;
    @JsonProperty("Game Exit When Missing")
    private boolean game_Exit_When_Missing;
    @JsonProperty("Game Exit When Missing#")
    private String game_Exit_When_Missing_;
    @JsonProperty("Game Version")
    private String game_Version;
    @JsonProperty("Game Version#")
    private String game_Version_;
    @JsonProperty("Helmet")
    private String helmet;
    @JsonProperty("Location")
    private String location;
    @JsonProperty("Nationality")
    private String nationality;
    @JsonProperty("Original Driver")
    private String original_Driver;
    @JsonProperty("Package Dir")
    private String package_Dir;
    @JsonProperty("Player Name")
    private String player_Name;
    @JsonProperty("Player Nick")
    private String player_Nick;
    @JsonProperty("Season")
    private String season;
    @JsonProperty("Season#")
    private String season_;
    @JsonProperty("Showroom")
    private String showroom;
    @JsonProperty("Showroom Component")
    private String showroom_Component;
    @JsonProperty("Showroom Component Version")
    private String showroom_Component_Version;
    @JsonProperty("Starting Driver")
    private int starting_Driver;
    @JsonProperty("Starting Driver#")
    private String starting_Driver_;
    @JsonProperty("Subscribe to all Studio397 Content")
    private boolean subscribe_to_all_Studio397_Content;
    @JsonProperty("Team")
    private String team;
    @JsonProperty("Unique ID")
    private int unique_ID;
    @JsonProperty("Unique ID#")
    private String unique_ID_;
    @JsonProperty("Vehicle File")
    private String vehicle_File;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Driver() {
    }

    /**
     * @param player_Nick
     * @param showroom
     * @param package_Dir
     * @param game_Version
     * @param game_Exit_When_Missing
     * @param season_
     * @param birth_Date
     * @param subscribe_to_all_Studio397_Content
     * @param helmet
     * @param season
     * @param game_Version_
     * @param game_Description_
     * @param unique_ID_
     * @param vehicle_File
     * @param driver_Hotswap_Delay_
     * @param driver_Hotswap_Delay
     * @param unique_ID
     * @param showroom_Component_Version
     * @param starting_Driver
     * @param player_Name
     * @param game_Exit_When_Missing_
     * @param team
     * @param original_Driver
     * @param starting_Driver_
     * @param game_Description
     * @param showroom_Component
     * @param nationality
     * @param location
     */
    public Driver(String birth_Date, int driver_Hotswap_Delay, String driver_Hotswap_Delay_, String game_Description, String game_Description_, boolean game_Exit_When_Missing, String game_Exit_When_Missing_, String game_Version, String game_Version_, String helmet, String location, String nationality, String original_Driver, String package_Dir, String player_Name, String player_Nick, String season, String season_, String showroom, String showroom_Component, String showroom_Component_Version, int starting_Driver, String starting_Driver_, boolean subscribe_to_all_Studio397_Content, String team, int unique_ID, String unique_ID_, String vehicle_File) {
        super();
        this.birth_Date = birth_Date;
        this.driver_Hotswap_Delay = driver_Hotswap_Delay;
        this.driver_Hotswap_Delay_ = driver_Hotswap_Delay_;
        this.game_Description = game_Description;
        this.game_Description_ = game_Description_;
        this.game_Exit_When_Missing = game_Exit_When_Missing;
        this.game_Exit_When_Missing_ = game_Exit_When_Missing_;
        this.game_Version = game_Version;
        this.game_Version_ = game_Version_;
        this.helmet = helmet;
        this.location = location;
        this.nationality = nationality;
        this.original_Driver = original_Driver;
        this.package_Dir = package_Dir;
        this.player_Name = player_Name;
        this.player_Nick = player_Nick;
        this.season = season;
        this.season_ = season_;
        this.showroom = showroom;
        this.showroom_Component = showroom_Component;
        this.showroom_Component_Version = showroom_Component_Version;
        this.starting_Driver = starting_Driver;
        this.starting_Driver_ = starting_Driver_;
        this.subscribe_to_all_Studio397_Content = subscribe_to_all_Studio397_Content;
        this.team = team;
        this.unique_ID = unique_ID;
        this.unique_ID_ = unique_ID_;
        this.vehicle_File = vehicle_File;
    }

    @JsonProperty("Birth Date")
    public String getBirth_Date() {
        return birth_Date;
    }

    @JsonProperty("Birth Date")
    public void setBirth_Date(String birth_Date) {
        this.birth_Date = birth_Date;
    }

    @JsonProperty("Driver Hotswap Delay")
    public int getDriver_Hotswap_Delay() {
        return driver_Hotswap_Delay;
    }

    @JsonProperty("Driver Hotswap Delay")
    public void setDriver_Hotswap_Delay(int driver_Hotswap_Delay) {
        this.driver_Hotswap_Delay = driver_Hotswap_Delay;
    }

    @JsonProperty("Driver Hotswap Delay#")
    public String getDriver_Hotswap_Delay_() {
        return driver_Hotswap_Delay_;
    }

    @JsonProperty("Driver Hotswap Delay#")
    public void setDriver_Hotswap_Delay_(String driver_Hotswap_Delay_) {
        this.driver_Hotswap_Delay_ = driver_Hotswap_Delay_;
    }

    @JsonProperty("Game Description")
    public String getGame_Description() {
        return game_Description;
    }

    @JsonProperty("Game Description")
    public void setGame_Description(String game_Description) {
        this.game_Description = game_Description;
    }

    @JsonProperty("Game Description#")
    public String getGame_Description_() {
        return game_Description_;
    }

    @JsonProperty("Game Description#")
    public void setGame_Description_(String game_Description_) {
        this.game_Description_ = game_Description_;
    }

    @JsonProperty("Game Exit When Missing")
    public boolean isGame_Exit_When_Missing() {
        return game_Exit_When_Missing;
    }

    @JsonProperty("Game Exit When Missing")
    public void setGame_Exit_When_Missing(boolean game_Exit_When_Missing) {
        this.game_Exit_When_Missing = game_Exit_When_Missing;
    }

    @JsonProperty("Game Exit When Missing#")
    public String getGame_Exit_When_Missing_() {
        return game_Exit_When_Missing_;
    }

    @JsonProperty("Game Exit When Missing#")
    public void setGame_Exit_When_Missing_(String game_Exit_When_Missing_) {
        this.game_Exit_When_Missing_ = game_Exit_When_Missing_;
    }

    @JsonProperty("Game Version")
    public String getGame_Version() {
        return game_Version;
    }

    @JsonProperty("Game Version")
    public void setGame_Version(String game_Version) {
        this.game_Version = game_Version;
    }

    @JsonProperty("Game Version#")
    public String getGame_Version_() {
        return game_Version_;
    }

    @JsonProperty("Game Version#")
    public void setGame_Version_(String game_Version_) {
        this.game_Version_ = game_Version_;
    }

    @JsonProperty("Helmet")
    public String getHelmet() {
        return helmet;
    }

    @JsonProperty("Helmet")
    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    @JsonProperty("Location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("Nationality")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("Nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("Original Driver")
    public String getOriginal_Driver() {
        return original_Driver;
    }

    @JsonProperty("Original Driver")
    public void setOriginal_Driver(String original_Driver) {
        this.original_Driver = original_Driver;
    }

    @JsonProperty("Package Dir")
    public String getPackage_Dir() {
        return package_Dir;
    }

    @JsonProperty("Package Dir")
    public void setPackage_Dir(String package_Dir) {
        this.package_Dir = package_Dir;
    }

    @JsonProperty("Player Name")
    public String getPlayer_Name() {
        return player_Name;
    }

    @JsonProperty("Player Name")
    public void setPlayer_Name(String player_Name) {
        this.player_Name = player_Name;
    }

    @JsonProperty("Player Nick")
    public String getPlayer_Nick() {
        return player_Nick;
    }

    @JsonProperty("Player Nick")
    public void setPlayer_Nick(String player_Nick) {
        this.player_Nick = player_Nick;
    }

    @JsonProperty("Season")
    public String getSeason() {
        return season;
    }

    @JsonProperty("Season")
    public void setSeason(String season) {
        this.season = season;
    }

    @JsonProperty("Season#")
    public String getSeason_() {
        return season_;
    }

    @JsonProperty("Season#")
    public void setSeason_(String season_) {
        this.season_ = season_;
    }

    @JsonProperty("Showroom")
    public String getShowroom() {
        return showroom;
    }

    @JsonProperty("Showroom")
    public void setShowroom(String showroom) {
        this.showroom = showroom;
    }

    @JsonProperty("Showroom Component")
    public String getShowroom_Component() {
        return showroom_Component;
    }

    @JsonProperty("Showroom Component")
    public void setShowroom_Component(String showroom_Component) {
        this.showroom_Component = showroom_Component;
    }

    @JsonProperty("Showroom Component Version")
    public String getShowroom_Component_Version() {
        return showroom_Component_Version;
    }

    @JsonProperty("Showroom Component Version")
    public void setShowroom_Component_Version(String showroom_Component_Version) {
        this.showroom_Component_Version = showroom_Component_Version;
    }

    @JsonProperty("Starting Driver")
    public int getStarting_Driver() {
        return starting_Driver;
    }

    @JsonProperty("Starting Driver")
    public void setStarting_Driver(int starting_Driver) {
        this.starting_Driver = starting_Driver;
    }

    @JsonProperty("Starting Driver#")
    public String getStarting_Driver_() {
        return starting_Driver_;
    }

    @JsonProperty("Starting Driver#")
    public void setStarting_Driver_(String starting_Driver_) {
        this.starting_Driver_ = starting_Driver_;
    }

    @JsonProperty("Subscribe to all Studio397 Content")
    public boolean isSubscribe_to_all_Studio397_Content() {
        return subscribe_to_all_Studio397_Content;
    }

    @JsonProperty("Subscribe to all Studio397 Content")
    public void setSubscribe_to_all_Studio397_Content(boolean subscribe_to_all_Studio397_Content) {
        this.subscribe_to_all_Studio397_Content = subscribe_to_all_Studio397_Content;
    }

    @JsonProperty("Team")
    public String getTeam() {
        return team;
    }

    @JsonProperty("Team")
    public void setTeam(String team) {
        this.team = team;
    }

    @JsonProperty("Unique ID")
    public int getUnique_ID() {
        return unique_ID;
    }

    @JsonProperty("Unique ID")
    public void setUnique_ID(int unique_ID) {
        this.unique_ID = unique_ID;
    }

    @JsonProperty("Unique ID#")
    public String getUnique_ID_() {
        return unique_ID_;
    }

    @JsonProperty("Unique ID#")
    public void setUnique_ID_(String unique_ID_) {
        this.unique_ID_ = unique_ID_;
    }

    @JsonProperty("Vehicle File")
    public String getVehicle_File() {
        return vehicle_File;
    }

    @JsonProperty("Vehicle File")
    public void setVehicle_File(String vehicle_File) {
        this.vehicle_File = vehicle_File;
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
        sb.append(Driver.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("birth_Date");
        sb.append('=');
        sb.append(((this.birth_Date == null) ? "<null>" : this.birth_Date));
        sb.append(',');
        sb.append("driver_Hotswap_Delay");
        sb.append('=');
        sb.append(this.driver_Hotswap_Delay);
        sb.append(',');
        sb.append("driver_Hotswap_Delay_");
        sb.append('=');
        sb.append(((this.driver_Hotswap_Delay_ == null) ? "<null>" : this.driver_Hotswap_Delay_));
        sb.append(',');
        sb.append("game_Description");
        sb.append('=');
        sb.append(((this.game_Description == null) ? "<null>" : this.game_Description));
        sb.append(',');
        sb.append("game_Description_");
        sb.append('=');
        sb.append(((this.game_Description_ == null) ? "<null>" : this.game_Description_));
        sb.append(',');
        sb.append("game_Exit_When_Missing");
        sb.append('=');
        sb.append(this.game_Exit_When_Missing);
        sb.append(',');
        sb.append("game_Exit_When_Missing_");
        sb.append('=');
        sb.append(((this.game_Exit_When_Missing_ == null) ? "<null>" : this.game_Exit_When_Missing_));
        sb.append(',');
        sb.append("game_Version");
        sb.append('=');
        sb.append(((this.game_Version == null) ? "<null>" : this.game_Version));
        sb.append(',');
        sb.append("game_Version_");
        sb.append('=');
        sb.append(((this.game_Version_ == null) ? "<null>" : this.game_Version_));
        sb.append(',');
        sb.append("helmet");
        sb.append('=');
        sb.append(((this.helmet == null) ? "<null>" : this.helmet));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null) ? "<null>" : this.location));
        sb.append(',');
        sb.append("nationality");
        sb.append('=');
        sb.append(((this.nationality == null) ? "<null>" : this.nationality));
        sb.append(',');
        sb.append("original_Driver");
        sb.append('=');
        sb.append(((this.original_Driver == null) ? "<null>" : this.original_Driver));
        sb.append(',');
        sb.append("package_Dir");
        sb.append('=');
        sb.append(((this.package_Dir == null) ? "<null>" : this.package_Dir));
        sb.append(',');
        sb.append("player_Name");
        sb.append('=');
        sb.append(((this.player_Name == null) ? "<null>" : this.player_Name));
        sb.append(',');
        sb.append("player_Nick");
        sb.append('=');
        sb.append(((this.player_Nick == null) ? "<null>" : this.player_Nick));
        sb.append(',');
        sb.append("season");
        sb.append('=');
        sb.append(((this.season == null) ? "<null>" : this.season));
        sb.append(',');
        sb.append("season_");
        sb.append('=');
        sb.append(((this.season_ == null) ? "<null>" : this.season_));
        sb.append(',');
        sb.append("showroom");
        sb.append('=');
        sb.append(((this.showroom == null) ? "<null>" : this.showroom));
        sb.append(',');
        sb.append("showroom_Component");
        sb.append('=');
        sb.append(((this.showroom_Component == null) ? "<null>" : this.showroom_Component));
        sb.append(',');
        sb.append("showroom_Component_Version");
        sb.append('=');
        sb.append(((this.showroom_Component_Version == null) ? "<null>" : this.showroom_Component_Version));
        sb.append(',');
        sb.append("starting_Driver");
        sb.append('=');
        sb.append(this.starting_Driver);
        sb.append(',');
        sb.append("starting_Driver_");
        sb.append('=');
        sb.append(((this.starting_Driver_ == null) ? "<null>" : this.starting_Driver_));
        sb.append(',');
        sb.append("subscribe_to_all_Studio397_Content");
        sb.append('=');
        sb.append(this.subscribe_to_all_Studio397_Content);
        sb.append(',');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null) ? "<null>" : this.team));
        sb.append(',');
        sb.append("unique_ID");
        sb.append('=');
        sb.append(this.unique_ID);
        sb.append(',');
        sb.append("unique_ID_");
        sb.append('=');
        sb.append(((this.unique_ID_ == null) ? "<null>" : this.unique_ID_));
        sb.append(',');
        sb.append("vehicle_File");
        sb.append('=');
        sb.append(((this.vehicle_File == null) ? "<null>" : this.vehicle_File));
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
        result = ((result * 31) + ((this.player_Nick == null) ? 0 : this.player_Nick.hashCode()));
        result = ((result * 31) + ((this.showroom == null) ? 0 : this.showroom.hashCode()));
        result = ((result * 31) + ((this.package_Dir == null) ? 0 : this.package_Dir.hashCode()));
        result = ((result * 31) + ((this.game_Version == null) ? 0 : this.game_Version.hashCode()));
        result = ((result * 31) + (this.game_Exit_When_Missing ? 1 : 0));
        result = ((result * 31) + ((this.season_ == null) ? 0 : this.season_.hashCode()));
        result = ((result * 31) + ((this.birth_Date == null) ? 0 : this.birth_Date.hashCode()));
        result = ((result * 31) + (this.subscribe_to_all_Studio397_Content ? 1 : 0));
        result = ((result * 31) + ((this.helmet == null) ? 0 : this.helmet.hashCode()));
        result = ((result * 31) + ((this.season == null) ? 0 : this.season.hashCode()));
        result = ((result * 31) + ((this.game_Version_ == null) ? 0 : this.game_Version_.hashCode()));
        result = ((result * 31) + ((this.game_Description_ == null) ? 0 : this.game_Description_.hashCode()));
        result = ((result * 31) + ((this.unique_ID_ == null) ? 0 : this.unique_ID_.hashCode()));
        result = ((result * 31) + ((this.vehicle_File == null) ? 0 : this.vehicle_File.hashCode()));
        result = ((result * 31) + ((this.driver_Hotswap_Delay_ == null) ? 0 : this.driver_Hotswap_Delay_.hashCode()));
        result = ((result * 31) + this.driver_Hotswap_Delay);
        result = ((result * 31) + this.unique_ID);
        result = ((result * 31) + ((this.showroom_Component_Version == null) ? 0 : this.showroom_Component_Version.hashCode()));
        result = ((result * 31) + this.starting_Driver);
        result = ((result * 31) + ((this.player_Name == null) ? 0 : this.player_Name.hashCode()));
        result = ((result * 31) + ((this.game_Exit_When_Missing_ == null) ? 0 : this.game_Exit_When_Missing_.hashCode()));
        result = ((result * 31) + ((this.team == null) ? 0 : this.team.hashCode()));
        result = ((result * 31) + ((this.original_Driver == null) ? 0 : this.original_Driver.hashCode()));
        result = ((result * 31) + ((this.starting_Driver_ == null) ? 0 : this.starting_Driver_.hashCode()));
        result = ((result * 31) + ((this.game_Description == null) ? 0 : this.game_Description.hashCode()));
        result = ((result * 31) + ((this.showroom_Component == null) ? 0 : this.showroom_Component.hashCode()));
        result = ((result * 31) + ((this.nationality == null) ? 0 : this.nationality.hashCode()));
        result = ((result * 31) + ((this.location == null) ? 0 : this.location.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Driver) == false) {
            return false;
        }
        Driver rhs = ((Driver) other);
        return ((((((((((((((((((((((((((((((this.player_Nick == rhs.player_Nick) || ((this.player_Nick != null) && this.player_Nick.equals(rhs.player_Nick))) && ((this.showroom == rhs.showroom) || ((this.showroom != null) && this.showroom.equals(rhs.showroom)))) && ((this.package_Dir == rhs.package_Dir) || ((this.package_Dir != null) && this.package_Dir.equals(rhs.package_Dir)))) && ((this.game_Version == rhs.game_Version) || ((this.game_Version != null) && this.game_Version.equals(rhs.game_Version)))) && (this.game_Exit_When_Missing == rhs.game_Exit_When_Missing)) && ((this.season_ == rhs.season_) || ((this.season_ != null) && this.season_.equals(rhs.season_)))) && ((this.birth_Date == rhs.birth_Date) || ((this.birth_Date != null) && this.birth_Date.equals(rhs.birth_Date)))) && (this.subscribe_to_all_Studio397_Content == rhs.subscribe_to_all_Studio397_Content)) && ((this.helmet == rhs.helmet) || ((this.helmet != null) && this.helmet.equals(rhs.helmet)))) && ((this.season == rhs.season) || ((this.season != null) && this.season.equals(rhs.season)))) && ((this.game_Version_ == rhs.game_Version_) || ((this.game_Version_ != null) && this.game_Version_.equals(rhs.game_Version_)))) && ((this.game_Description_ == rhs.game_Description_) || ((this.game_Description_ != null) && this.game_Description_.equals(rhs.game_Description_)))) && ((this.unique_ID_ == rhs.unique_ID_) || ((this.unique_ID_ != null) && this.unique_ID_.equals(rhs.unique_ID_)))) && ((this.vehicle_File == rhs.vehicle_File) || ((this.vehicle_File != null) && this.vehicle_File.equals(rhs.vehicle_File)))) && ((this.driver_Hotswap_Delay_ == rhs.driver_Hotswap_Delay_) || ((this.driver_Hotswap_Delay_ != null) && this.driver_Hotswap_Delay_.equals(rhs.driver_Hotswap_Delay_)))) && (this.driver_Hotswap_Delay == rhs.driver_Hotswap_Delay)) && (this.unique_ID == rhs.unique_ID)) && ((this.showroom_Component_Version == rhs.showroom_Component_Version) || ((this.showroom_Component_Version != null) && this.showroom_Component_Version.equals(rhs.showroom_Component_Version)))) && (this.starting_Driver == rhs.starting_Driver)) && ((this.player_Name == rhs.player_Name) || ((this.player_Name != null) && this.player_Name.equals(rhs.player_Name)))) && ((this.game_Exit_When_Missing_ == rhs.game_Exit_When_Missing_) || ((this.game_Exit_When_Missing_ != null) && this.game_Exit_When_Missing_.equals(rhs.game_Exit_When_Missing_)))) && ((this.team == rhs.team) || ((this.team != null) && this.team.equals(rhs.team)))) && ((this.original_Driver == rhs.original_Driver) || ((this.original_Driver != null) && this.original_Driver.equals(rhs.original_Driver)))) && ((this.starting_Driver_ == rhs.starting_Driver_) || ((this.starting_Driver_ != null) && this.starting_Driver_.equals(rhs.starting_Driver_)))) && ((this.game_Description == rhs.game_Description) || ((this.game_Description != null) && this.game_Description.equals(rhs.game_Description)))) && ((this.showroom_Component == rhs.showroom_Component) || ((this.showroom_Component != null) && this.showroom_Component.equals(rhs.showroom_Component)))) && ((this.nationality == rhs.nationality) || ((this.nationality != null) && this.nationality.equals(rhs.nationality)))) && ((this.location == rhs.location) || ((this.location != null) && this.location.equals(rhs.location)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
