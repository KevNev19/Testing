package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AmountUnit;
import io.swagger.model.HandlingInformation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HouseAirwaybill
 */
@Validated

public class HouseAirwaybill   {
  @JsonProperty("houseAirwaybillNumber")
  private String houseAirwaybillNumber = null;

  @JsonProperty("masterAirwaybillId")
  private String masterAirwaybillId = null;

  @JsonProperty("bookedPieces")
  private Integer bookedPieces = null;

  @JsonProperty("bookedWeight")
  private AmountUnit bookedWeight = null;

  @JsonProperty("receivedPieces")
  private Integer receivedPieces = null;

  @JsonProperty("receivedWeight")
  private AmountUnit receivedWeight = null;

  @JsonProperty("handlingInformation")
  private HandlingInformation handlingInformation = null;

  public HouseAirwaybill houseAirwaybillNumber(String houseAirwaybillNumber) {
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

  public HouseAirwaybill masterAirwaybillId(String masterAirwaybillId) {
    this.masterAirwaybillId = masterAirwaybillId;
    return this;
  }

  /**
   * Get masterAirwaybillId
   * @return masterAirwaybillId
  **/
  @ApiModelProperty(value = "")


  public String getMasterAirwaybillId() {
    return masterAirwaybillId;
  }

  public void setMasterAirwaybillId(String masterAirwaybillId) {
    this.masterAirwaybillId = masterAirwaybillId;
  }

  public HouseAirwaybill bookedPieces(Integer bookedPieces) {
    this.bookedPieces = bookedPieces;
    return this;
  }

  /**
   * Get bookedPieces
   * @return bookedPieces
  **/
  @ApiModelProperty(value = "")


  public Integer getBookedPieces() {
    return bookedPieces;
  }

  public void setBookedPieces(Integer bookedPieces) {
    this.bookedPieces = bookedPieces;
  }

  public HouseAirwaybill bookedWeight(AmountUnit bookedWeight) {
    this.bookedWeight = bookedWeight;
    return this;
  }

  /**
   * Get bookedWeight
   * @return bookedWeight
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AmountUnit getBookedWeight() {
    return bookedWeight;
  }

  public void setBookedWeight(AmountUnit bookedWeight) {
    this.bookedWeight = bookedWeight;
  }

  public HouseAirwaybill receivedPieces(Integer receivedPieces) {
    this.receivedPieces = receivedPieces;
    return this;
  }

  /**
   * Get receivedPieces
   * @return receivedPieces
  **/
  @ApiModelProperty(value = "")


  public Integer getReceivedPieces() {
    return receivedPieces;
  }

  public void setReceivedPieces(Integer receivedPieces) {
    this.receivedPieces = receivedPieces;
  }

  public HouseAirwaybill receivedWeight(AmountUnit receivedWeight) {
    this.receivedWeight = receivedWeight;
    return this;
  }

  /**
   * Get receivedWeight
   * @return receivedWeight
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AmountUnit getReceivedWeight() {
    return receivedWeight;
  }

  public void setReceivedWeight(AmountUnit receivedWeight) {
    this.receivedWeight = receivedWeight;
  }

  public HouseAirwaybill handlingInformation(HandlingInformation handlingInformation) {
    this.handlingInformation = handlingInformation;
    return this;
  }

  /**
   * Get handlingInformation
   * @return handlingInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HandlingInformation getHandlingInformation() {
    return handlingInformation;
  }

  public void setHandlingInformation(HandlingInformation handlingInformation) {
    this.handlingInformation = handlingInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HouseAirwaybill houseAirwaybill = (HouseAirwaybill) o;
    return Objects.equals(this.houseAirwaybillNumber, houseAirwaybill.houseAirwaybillNumber) &&
        Objects.equals(this.masterAirwaybillId, houseAirwaybill.masterAirwaybillId) &&
        Objects.equals(this.bookedPieces, houseAirwaybill.bookedPieces) &&
        Objects.equals(this.bookedWeight, houseAirwaybill.bookedWeight) &&
        Objects.equals(this.receivedPieces, houseAirwaybill.receivedPieces) &&
        Objects.equals(this.receivedWeight, houseAirwaybill.receivedWeight) &&
        Objects.equals(this.handlingInformation, houseAirwaybill.handlingInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(houseAirwaybillNumber, masterAirwaybillId, bookedPieces, bookedWeight, receivedPieces, receivedWeight, handlingInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HouseAirwaybill {\n");
    
    sb.append("    houseAirwaybillNumber: ").append(toIndentedString(houseAirwaybillNumber)).append("\n");
    sb.append("    masterAirwaybillId: ").append(toIndentedString(masterAirwaybillId)).append("\n");
    sb.append("    bookedPieces: ").append(toIndentedString(bookedPieces)).append("\n");
    sb.append("    bookedWeight: ").append(toIndentedString(bookedWeight)).append("\n");
    sb.append("    receivedPieces: ").append(toIndentedString(receivedPieces)).append("\n");
    sb.append("    receivedWeight: ").append(toIndentedString(receivedWeight)).append("\n");
    sb.append("    handlingInformation: ").append(toIndentedString(handlingInformation)).append("\n");
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

