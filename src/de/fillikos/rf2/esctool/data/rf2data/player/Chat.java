package de.fillikos.rf2.esctool.data.rf2data.player;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Quick Chat #1",
        "Quick Chat #10",
        "Quick Chat #11",
        "Quick Chat #12",
        "Quick Chat #2",
        "Quick Chat #3",
        "Quick Chat #4",
        "Quick Chat #5",
        "Quick Chat #6",
        "Quick Chat #7",
        "Quick Chat #8",
        "Quick Chat #9"
})
@Generated("jsonschema2pojo")
public class Chat {

    @JsonProperty("Quick Chat #1")
    private String quick_Chat__1;
    @JsonProperty("Quick Chat #10")
    private String quick_Chat__10;
    @JsonProperty("Quick Chat #11")
    private String quick_Chat__11;
    @JsonProperty("Quick Chat #12")
    private String quick_Chat__12;
    @JsonProperty("Quick Chat #2")
    private String quick_Chat__2;
    @JsonProperty("Quick Chat #3")
    private String quick_Chat__3;
    @JsonProperty("Quick Chat #4")
    private String quick_Chat__4;
    @JsonProperty("Quick Chat #5")
    private String quick_Chat__5;
    @JsonProperty("Quick Chat #6")
    private String quick_Chat__6;
    @JsonProperty("Quick Chat #7")
    private String quick_Chat__7;
    @JsonProperty("Quick Chat #8")
    private String quick_Chat__8;
    @JsonProperty("Quick Chat #9")
    private String quick_Chat__9;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Chat() {
    }

    /**
     * @param quick_Chat__10
     * @param quick_Chat__5
     * @param quick_Chat__4
     * @param quick_Chat__12
     * @param quick_Chat__3
     * @param quick_Chat__11
     * @param quick_Chat__2
     * @param quick_Chat__9
     * @param quick_Chat__8
     * @param quick_Chat__7
     * @param quick_Chat__6
     * @param quick_Chat__1
     */
    public Chat(String quick_Chat__1, String quick_Chat__10, String quick_Chat__11, String quick_Chat__12, String quick_Chat__2, String quick_Chat__3, String quick_Chat__4, String quick_Chat__5, String quick_Chat__6, String quick_Chat__7, String quick_Chat__8, String quick_Chat__9) {
        super();
        this.quick_Chat__1 = quick_Chat__1;
        this.quick_Chat__10 = quick_Chat__10;
        this.quick_Chat__11 = quick_Chat__11;
        this.quick_Chat__12 = quick_Chat__12;
        this.quick_Chat__2 = quick_Chat__2;
        this.quick_Chat__3 = quick_Chat__3;
        this.quick_Chat__4 = quick_Chat__4;
        this.quick_Chat__5 = quick_Chat__5;
        this.quick_Chat__6 = quick_Chat__6;
        this.quick_Chat__7 = quick_Chat__7;
        this.quick_Chat__8 = quick_Chat__8;
        this.quick_Chat__9 = quick_Chat__9;
    }

    @JsonProperty("Quick Chat #1")
    public String getQuick_Chat__1() {
        return quick_Chat__1;
    }

    @JsonProperty("Quick Chat #1")
    public void setQuick_Chat__1(String quick_Chat__1) {
        this.quick_Chat__1 = quick_Chat__1;
    }

    @JsonProperty("Quick Chat #10")
    public String getQuick_Chat__10() {
        return quick_Chat__10;
    }

    @JsonProperty("Quick Chat #10")
    public void setQuick_Chat__10(String quick_Chat__10) {
        this.quick_Chat__10 = quick_Chat__10;
    }

    @JsonProperty("Quick Chat #11")
    public String getQuick_Chat__11() {
        return quick_Chat__11;
    }

    @JsonProperty("Quick Chat #11")
    public void setQuick_Chat__11(String quick_Chat__11) {
        this.quick_Chat__11 = quick_Chat__11;
    }

    @JsonProperty("Quick Chat #12")
    public String getQuick_Chat__12() {
        return quick_Chat__12;
    }

    @JsonProperty("Quick Chat #12")
    public void setQuick_Chat__12(String quick_Chat__12) {
        this.quick_Chat__12 = quick_Chat__12;
    }

    @JsonProperty("Quick Chat #2")
    public String getQuick_Chat__2() {
        return quick_Chat__2;
    }

    @JsonProperty("Quick Chat #2")
    public void setQuick_Chat__2(String quick_Chat__2) {
        this.quick_Chat__2 = quick_Chat__2;
    }

    @JsonProperty("Quick Chat #3")
    public String getQuick_Chat__3() {
        return quick_Chat__3;
    }

    @JsonProperty("Quick Chat #3")
    public void setQuick_Chat__3(String quick_Chat__3) {
        this.quick_Chat__3 = quick_Chat__3;
    }

    @JsonProperty("Quick Chat #4")
    public String getQuick_Chat__4() {
        return quick_Chat__4;
    }

    @JsonProperty("Quick Chat #4")
    public void setQuick_Chat__4(String quick_Chat__4) {
        this.quick_Chat__4 = quick_Chat__4;
    }

    @JsonProperty("Quick Chat #5")
    public String getQuick_Chat__5() {
        return quick_Chat__5;
    }

    @JsonProperty("Quick Chat #5")
    public void setQuick_Chat__5(String quick_Chat__5) {
        this.quick_Chat__5 = quick_Chat__5;
    }

    @JsonProperty("Quick Chat #6")
    public String getQuick_Chat__6() {
        return quick_Chat__6;
    }

    @JsonProperty("Quick Chat #6")
    public void setQuick_Chat__6(String quick_Chat__6) {
        this.quick_Chat__6 = quick_Chat__6;
    }

    @JsonProperty("Quick Chat #7")
    public String getQuick_Chat__7() {
        return quick_Chat__7;
    }

    @JsonProperty("Quick Chat #7")
    public void setQuick_Chat__7(String quick_Chat__7) {
        this.quick_Chat__7 = quick_Chat__7;
    }

    @JsonProperty("Quick Chat #8")
    public String getQuick_Chat__8() {
        return quick_Chat__8;
    }

    @JsonProperty("Quick Chat #8")
    public void setQuick_Chat__8(String quick_Chat__8) {
        this.quick_Chat__8 = quick_Chat__8;
    }

    @JsonProperty("Quick Chat #9")
    public String getQuick_Chat__9() {
        return quick_Chat__9;
    }

    @JsonProperty("Quick Chat #9")
    public void setQuick_Chat__9(String quick_Chat__9) {
        this.quick_Chat__9 = quick_Chat__9;
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
        sb.append(Chat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("quick_Chat__1");
        sb.append('=');
        sb.append(((this.quick_Chat__1 == null) ? "<null>" : this.quick_Chat__1));
        sb.append(',');
        sb.append("quick_Chat__10");
        sb.append('=');
        sb.append(((this.quick_Chat__10 == null) ? "<null>" : this.quick_Chat__10));
        sb.append(',');
        sb.append("quick_Chat__11");
        sb.append('=');
        sb.append(((this.quick_Chat__11 == null) ? "<null>" : this.quick_Chat__11));
        sb.append(',');
        sb.append("quick_Chat__12");
        sb.append('=');
        sb.append(((this.quick_Chat__12 == null) ? "<null>" : this.quick_Chat__12));
        sb.append(',');
        sb.append("quick_Chat__2");
        sb.append('=');
        sb.append(((this.quick_Chat__2 == null) ? "<null>" : this.quick_Chat__2));
        sb.append(',');
        sb.append("quick_Chat__3");
        sb.append('=');
        sb.append(((this.quick_Chat__3 == null) ? "<null>" : this.quick_Chat__3));
        sb.append(',');
        sb.append("quick_Chat__4");
        sb.append('=');
        sb.append(((this.quick_Chat__4 == null) ? "<null>" : this.quick_Chat__4));
        sb.append(',');
        sb.append("quick_Chat__5");
        sb.append('=');
        sb.append(((this.quick_Chat__5 == null) ? "<null>" : this.quick_Chat__5));
        sb.append(',');
        sb.append("quick_Chat__6");
        sb.append('=');
        sb.append(((this.quick_Chat__6 == null) ? "<null>" : this.quick_Chat__6));
        sb.append(',');
        sb.append("quick_Chat__7");
        sb.append('=');
        sb.append(((this.quick_Chat__7 == null) ? "<null>" : this.quick_Chat__7));
        sb.append(',');
        sb.append("quick_Chat__8");
        sb.append('=');
        sb.append(((this.quick_Chat__8 == null) ? "<null>" : this.quick_Chat__8));
        sb.append(',');
        sb.append("quick_Chat__9");
        sb.append('=');
        sb.append(((this.quick_Chat__9 == null) ? "<null>" : this.quick_Chat__9));
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
        result = ((result * 31) + ((this.quick_Chat__5 == null) ? 0 : this.quick_Chat__5.hashCode()));
        result = ((result * 31) + ((this.quick_Chat__4 == null) ? 0 : this.quick_Chat__4.hashCode()));
        result = ((result * 31) + ((this.quick_Chat__3 == null) ? 0 : this.quick_Chat__3.hashCode()));
        result = ((result * 31) + ((this.quick_Chat__2 == null) ? 0 : this.quick_Chat__2.hashCode()));
        result = ((result * 31) + ((this.quick_Chat__9 == null) ? 0 : this.quick_Chat__9.hashCode()));
        result = ((result * 31) + ((this.quick_Chat__8 == null) ? 0 : this.quick_Chat__8.hashCode()));
        result = ((result * 31) + ((this.quick_Chat__7 == null) ? 0 : this.quick_Chat__7.hashCode()));
        result = ((result * 31) + ((this.quick_Chat__6 == null) ? 0 : this.quick_Chat__6.hashCode()));
        result = ((result * 31) + ((this.quick_Chat__1 == null) ? 0 : this.quick_Chat__1.hashCode()));
        result = ((result * 31) + ((this.quick_Chat__10 == null) ? 0 : this.quick_Chat__10.hashCode()));
        result = ((result * 31) + ((this.quick_Chat__12 == null) ? 0 : this.quick_Chat__12.hashCode()));
        result = ((result * 31) + ((this.quick_Chat__11 == null) ? 0 : this.quick_Chat__11.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Chat) == false) {
            return false;
        }
        Chat rhs = ((Chat) other);
        return ((((((((((((((this.quick_Chat__5 == rhs.quick_Chat__5) || ((this.quick_Chat__5 != null) && this.quick_Chat__5.equals(rhs.quick_Chat__5))) && ((this.quick_Chat__4 == rhs.quick_Chat__4) || ((this.quick_Chat__4 != null) && this.quick_Chat__4.equals(rhs.quick_Chat__4)))) && ((this.quick_Chat__3 == rhs.quick_Chat__3) || ((this.quick_Chat__3 != null) && this.quick_Chat__3.equals(rhs.quick_Chat__3)))) && ((this.quick_Chat__2 == rhs.quick_Chat__2) || ((this.quick_Chat__2 != null) && this.quick_Chat__2.equals(rhs.quick_Chat__2)))) && ((this.quick_Chat__9 == rhs.quick_Chat__9) || ((this.quick_Chat__9 != null) && this.quick_Chat__9.equals(rhs.quick_Chat__9)))) && ((this.quick_Chat__8 == rhs.quick_Chat__8) || ((this.quick_Chat__8 != null) && this.quick_Chat__8.equals(rhs.quick_Chat__8)))) && ((this.quick_Chat__7 == rhs.quick_Chat__7) || ((this.quick_Chat__7 != null) && this.quick_Chat__7.equals(rhs.quick_Chat__7)))) && ((this.quick_Chat__6 == rhs.quick_Chat__6) || ((this.quick_Chat__6 != null) && this.quick_Chat__6.equals(rhs.quick_Chat__6)))) && ((this.quick_Chat__1 == rhs.quick_Chat__1) || ((this.quick_Chat__1 != null) && this.quick_Chat__1.equals(rhs.quick_Chat__1)))) && ((this.quick_Chat__10 == rhs.quick_Chat__10) || ((this.quick_Chat__10 != null) && this.quick_Chat__10.equals(rhs.quick_Chat__10)))) && ((this.quick_Chat__12 == rhs.quick_Chat__12) || ((this.quick_Chat__12 != null) && this.quick_Chat__12.equals(rhs.quick_Chat__12)))) && ((this.quick_Chat__11 == rhs.quick_Chat__11) || ((this.quick_Chat__11 != null) && this.quick_Chat__11.equals(rhs.quick_Chat__11)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
