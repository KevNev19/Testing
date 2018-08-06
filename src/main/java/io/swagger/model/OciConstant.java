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
 * OciConstant
 */
@Validated

public class OciConstant   {
  @JsonProperty("country")
  private String country = null;

  @JsonProperty("info")
  private String info = null;

  @JsonProperty("custom")
  private String custom = null;

  @JsonProperty("note")
  private String note = null;

  public OciConstant country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OciConstant info(String info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")


  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public OciConstant custom(String custom) {
    this.custom = custom;
    return this;
  }

  /**
   * Get custom
   * @return custom
  **/
  @ApiModelProperty(value = "")


  public String getCustom() {
    return custom;
  }

  public void setCustom(String custom) {
    this.custom = custom;
  }

  public OciConstant note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OciConstant ociConstant = (OciConstant) o;
    return Objects.equals(this.country, ociConstant.country) &&
        Objects.equals(this.info, ociConstant.info) &&
        Objects.equals(this.custom, ociConstant.custom) &&
        Objects.equals(this.note, ociConstant.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, info, custom, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OciConstant {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

