package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AirwaybillSplit;
import io.swagger.model.AmountUnit;
import io.swagger.model.Itinerary;
import io.swagger.model.Link;
import io.swagger.model.SHC;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AirwaybillPart
 */
@Validated

public class AirwaybillPart   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("pieces")
  private Integer pieces = null;

  @JsonProperty("weight")
  private AmountUnit weight = null;

  @JsonProperty("volume")
  private AmountUnit volume = null;

  @JsonProperty("receivedPieces")
  private Integer receivedPieces = null;

  @JsonProperty("receivedWeight")
  private AmountUnit receivedWeight = null;

  @JsonProperty("receivedVolume")
  private AmountUnit receivedVolume = null;

  @JsonProperty("acceptanceStatus")
  private String acceptanceStatus = null;

  @JsonProperty("specialHandling")
  private SHC specialHandling = null;

  @JsonProperty("doneXray")
  private Boolean doneXray = null;

  @JsonProperty("readyForCarriageChecked")
  private Boolean readyForCarriageChecked = null;

  @JsonProperty("blockedForManifesting")
  private Boolean blockedForManifesting = null;

  @JsonProperty("security")
  private Boolean security = null;

  @JsonProperty("itinerary")
  @Valid
  private List<Itinerary> itinerary = null;

  @JsonProperty("numberOfSplits")
  private Integer numberOfSplits = null;

  @JsonProperty("split")
  @Valid
  private List<AirwaybillSplit> split = null;

  @JsonProperty("link")
  private Link link = null;

  public AirwaybillPart id(String id) {
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

  public AirwaybillPart pieces(Integer pieces) {
    this.pieces = pieces;
    return this;
  }

  /**
   * Get pieces
   * @return pieces
  **/
  @ApiModelProperty(value = "")


  public Integer getPieces() {
    return pieces;
  }

  public void setPieces(Integer pieces) {
    this.pieces = pieces;
  }

  public AirwaybillPart weight(AmountUnit weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AmountUnit getWeight() {
    return weight;
  }

  public void setWeight(AmountUnit weight) {
    this.weight = weight;
  }

  public AirwaybillPart volume(AmountUnit volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Get volume
   * @return volume
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AmountUnit getVolume() {
    return volume;
  }

  public void setVolume(AmountUnit volume) {
    this.volume = volume;
  }

  public AirwaybillPart receivedPieces(Integer receivedPieces) {
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

  public AirwaybillPart receivedWeight(AmountUnit receivedWeight) {
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

  public AirwaybillPart receivedVolume(AmountUnit receivedVolume) {
    this.receivedVolume = receivedVolume;
    return this;
  }

  /**
   * Get receivedVolume
   * @return receivedVolume
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AmountUnit getReceivedVolume() {
    return receivedVolume;
  }

  public void setReceivedVolume(AmountUnit receivedVolume) {
    this.receivedVolume = receivedVolume;
  }

  public AirwaybillPart acceptanceStatus(String acceptanceStatus) {
    this.acceptanceStatus = acceptanceStatus;
    return this;
  }

  /**
   * Get acceptanceStatus
   * @return acceptanceStatus
  **/
  @ApiModelProperty(value = "")


  public String getAcceptanceStatus() {
    return acceptanceStatus;
  }

  public void setAcceptanceStatus(String acceptanceStatus) {
    this.acceptanceStatus = acceptanceStatus;
  }

  public AirwaybillPart specialHandling(SHC specialHandling) {
    this.specialHandling = specialHandling;
    return this;
  }

  /**
   * Get specialHandling
   * @return specialHandling
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SHC getSpecialHandling() {
    return specialHandling;
  }

  public void setSpecialHandling(SHC specialHandling) {
    this.specialHandling = specialHandling;
  }

  public AirwaybillPart doneXray(Boolean doneXray) {
    this.doneXray = doneXray;
    return this;
  }

  /**
   * Get doneXray
   * @return doneXray
  **/
  @ApiModelProperty(value = "")


  public Boolean isDoneXray() {
    return doneXray;
  }

  public void setDoneXray(Boolean doneXray) {
    this.doneXray = doneXray;
  }

  public AirwaybillPart readyForCarriageChecked(Boolean readyForCarriageChecked) {
    this.readyForCarriageChecked = readyForCarriageChecked;
    return this;
  }

  /**
   * Get readyForCarriageChecked
   * @return readyForCarriageChecked
  **/
  @ApiModelProperty(value = "")


  public Boolean isReadyForCarriageChecked() {
    return readyForCarriageChecked;
  }

  public void setReadyForCarriageChecked(Boolean readyForCarriageChecked) {
    this.readyForCarriageChecked = readyForCarriageChecked;
  }

  public AirwaybillPart blockedForManifesting(Boolean blockedForManifesting) {
    this.blockedForManifesting = blockedForManifesting;
    return this;
  }

  /**
   * Get blockedForManifesting
   * @return blockedForManifesting
  **/
  @ApiModelProperty(value = "")


  public Boolean isBlockedForManifesting() {
    return blockedForManifesting;
  }

  public void setBlockedForManifesting(Boolean blockedForManifesting) {
    this.blockedForManifesting = blockedForManifesting;
  }

  public AirwaybillPart security(Boolean security) {
    this.security = security;
    return this;
  }

  /**
   * Get security
   * @return security
  **/
  @ApiModelProperty(value = "")


  public Boolean isSecurity() {
    return security;
  }

  public void setSecurity(Boolean security) {
    this.security = security;
  }

  public AirwaybillPart itinerary(List<Itinerary> itinerary) {
    this.itinerary = itinerary;
    return this;
  }

  public AirwaybillPart addItineraryItem(Itinerary itineraryItem) {
    if (this.itinerary == null) {
      this.itinerary = new ArrayList<Itinerary>();
    }
    this.itinerary.add(itineraryItem);
    return this;
  }

  /**
   * Get itinerary
   * @return itinerary
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Itinerary> getItinerary() {
    return itinerary;
  }

  public void setItinerary(List<Itinerary> itinerary) {
    this.itinerary = itinerary;
  }

  public AirwaybillPart numberOfSplits(Integer numberOfSplits) {
    this.numberOfSplits = numberOfSplits;
    return this;
  }

  /**
   * Get numberOfSplits
   * @return numberOfSplits
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberOfSplits() {
    return numberOfSplits;
  }

  public void setNumberOfSplits(Integer numberOfSplits) {
    this.numberOfSplits = numberOfSplits;
  }

  public AirwaybillPart split(List<AirwaybillSplit> split) {
    this.split = split;
    return this;
  }

  public AirwaybillPart addSplitItem(AirwaybillSplit splitItem) {
    if (this.split == null) {
      this.split = new ArrayList<AirwaybillSplit>();
    }
    this.split.add(splitItem);
    return this;
  }

  /**
   * Get split
   * @return split
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AirwaybillSplit> getSplit() {
    return split;
  }

  public void setSplit(List<AirwaybillSplit> split) {
    this.split = split;
  }

  public AirwaybillPart link(Link link) {
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
    AirwaybillPart airwaybillPart = (AirwaybillPart) o;
    return Objects.equals(this.id, airwaybillPart.id) &&
        Objects.equals(this.pieces, airwaybillPart.pieces) &&
        Objects.equals(this.weight, airwaybillPart.weight) &&
        Objects.equals(this.volume, airwaybillPart.volume) &&
        Objects.equals(this.receivedPieces, airwaybillPart.receivedPieces) &&
        Objects.equals(this.receivedWeight, airwaybillPart.receivedWeight) &&
        Objects.equals(this.receivedVolume, airwaybillPart.receivedVolume) &&
        Objects.equals(this.acceptanceStatus, airwaybillPart.acceptanceStatus) &&
        Objects.equals(this.specialHandling, airwaybillPart.specialHandling) &&
        Objects.equals(this.doneXray, airwaybillPart.doneXray) &&
        Objects.equals(this.readyForCarriageChecked, airwaybillPart.readyForCarriageChecked) &&
        Objects.equals(this.blockedForManifesting, airwaybillPart.blockedForManifesting) &&
        Objects.equals(this.security, airwaybillPart.security) &&
        Objects.equals(this.itinerary, airwaybillPart.itinerary) &&
        Objects.equals(this.numberOfSplits, airwaybillPart.numberOfSplits) &&
        Objects.equals(this.split, airwaybillPart.split) &&
        Objects.equals(this.link, airwaybillPart.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pieces, weight, volume, receivedPieces, receivedWeight, receivedVolume, acceptanceStatus, specialHandling, doneXray, readyForCarriageChecked, blockedForManifesting, security, itinerary, numberOfSplits, split, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirwaybillPart {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pieces: ").append(toIndentedString(pieces)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    receivedPieces: ").append(toIndentedString(receivedPieces)).append("\n");
    sb.append("    receivedWeight: ").append(toIndentedString(receivedWeight)).append("\n");
    sb.append("    receivedVolume: ").append(toIndentedString(receivedVolume)).append("\n");
    sb.append("    acceptanceStatus: ").append(toIndentedString(acceptanceStatus)).append("\n");
    sb.append("    specialHandling: ").append(toIndentedString(specialHandling)).append("\n");
    sb.append("    doneXray: ").append(toIndentedString(doneXray)).append("\n");
    sb.append("    readyForCarriageChecked: ").append(toIndentedString(readyForCarriageChecked)).append("\n");
    sb.append("    blockedForManifesting: ").append(toIndentedString(blockedForManifesting)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    itinerary: ").append(toIndentedString(itinerary)).append("\n");
    sb.append("    numberOfSplits: ").append(toIndentedString(numberOfSplits)).append("\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
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

