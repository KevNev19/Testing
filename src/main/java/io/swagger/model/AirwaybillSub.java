package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AirwaybillSub
 */
@Validated

public class AirwaybillSub   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("airwaybillPrefix")
  private String airwaybillPrefix = null;

  @JsonProperty("airwaybillSerial")
  private String airwaybillSerial = null;

  @JsonProperty("origin")
  private String origin = null;

  @JsonProperty("dest")
  private String dest = null;

  public AirwaybillSub id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AirwaybillSub airwaybillPrefix(String airwaybillPrefix) {
    this.airwaybillPrefix = airwaybillPrefix;
    return this;
  }

  /**
   * Get airwaybillPrefix
   * @return airwaybillPrefix
  **/
  @ApiModelProperty(value = "")


  public String getAirwaybillPrefix() {
    return airwaybillPrefix;
  }

  public void setAirwaybillPrefix(String airwaybillPrefix) {
    this.airwaybillPrefix = airwaybillPrefix;
  }

  public AirwaybillSub airwaybillSerial(String airwaybillSerial) {
    this.airwaybillSerial = airwaybillSerial;
    return this;
  }

  /**
   * Get airwaybillSerial
   * @return airwaybillSerial
  **/
  @ApiModelProperty(value = "")


  public String getAirwaybillSerial() {
    return airwaybillSerial;
  }

  public void setAirwaybillSerial(String airwaybillSerial) {
    this.airwaybillSerial = airwaybillSerial;
  }

  public AirwaybillSub origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(value = "")


  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public AirwaybillSub dest(String dest) {
    this.dest = dest;
    return this;
  }

  /**
   * Get dest
   * @return dest
  **/
  @ApiModelProperty(value = "")


  public String getDest() {
    return dest;
  }

  public void setDest(String dest) {
    this.dest = dest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirwaybillSub airwaybillSub = (AirwaybillSub) o;
    return Objects.equals(this.id, airwaybillSub.id) &&
        Objects.equals(this.airwaybillPrefix, airwaybillSub.airwaybillPrefix) &&
        Objects.equals(this.airwaybillSerial, airwaybillSub.airwaybillSerial) &&
        Objects.equals(this.origin, airwaybillSub.origin) &&
        Objects.equals(this.dest, airwaybillSub.dest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, airwaybillPrefix, airwaybillSerial, origin, dest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirwaybillSub {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    airwaybillPrefix: ").append(toIndentedString(airwaybillPrefix)).append("\n");
    sb.append("    airwaybillSerial: ").append(toIndentedString(airwaybillSerial)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

