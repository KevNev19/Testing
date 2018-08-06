package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AirwaybillSub;
import io.swagger.model.Link;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HouseairwaybillSub
 */
@Validated

public class HouseairwaybillSub   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("houseAirwaybillNumber")
  private String houseAirwaybillNumber = null;

  @JsonProperty("masterAirwaybill")
  private AirwaybillSub masterAirwaybill = null;

  @JsonProperty("link")
  private Link link = null;

  public HouseairwaybillSub id(String id) {
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

  public HouseairwaybillSub houseAirwaybillNumber(String houseAirwaybillNumber) {
    this.houseAirwaybillNumber = houseAirwaybillNumber;
    return this;
  }

  /**
   * Get houseAirwaybillNumber
   * @return houseAirwaybillNumber
  **/
  @ApiModelProperty(value = "")


  public String getHouseAirwaybillNumber() {
    return houseAirwaybillNumber;
  }

  public void setHouseAirwaybillNumber(String houseAirwaybillNumber) {
    this.houseAirwaybillNumber = houseAirwaybillNumber;
  }

  public HouseairwaybillSub masterAirwaybill(AirwaybillSub masterAirwaybill) {
    this.masterAirwaybill = masterAirwaybill;
    return this;
  }

  /**
   * Get masterAirwaybill
   * @return masterAirwaybill
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AirwaybillSub getMasterAirwaybill() {
    return masterAirwaybill;
  }

  public void setMasterAirwaybill(AirwaybillSub masterAirwaybill) {
    this.masterAirwaybill = masterAirwaybill;
  }

  public HouseairwaybillSub link(Link link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HouseairwaybillSub houseairwaybillSub = (HouseairwaybillSub) o;
    return Objects.equals(this.id, houseairwaybillSub.id) &&
        Objects.equals(this.houseAirwaybillNumber, houseairwaybillSub.houseAirwaybillNumber) &&
        Objects.equals(this.masterAirwaybill, houseairwaybillSub.masterAirwaybill) &&
        Objects.equals(this.link, houseairwaybillSub.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, houseAirwaybillNumber, masterAirwaybill, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HouseairwaybillSub {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    houseAirwaybillNumber: ").append(toIndentedString(houseAirwaybillNumber)).append("\n");
    sb.append("    masterAirwaybill: ").append(toIndentedString(masterAirwaybill)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

