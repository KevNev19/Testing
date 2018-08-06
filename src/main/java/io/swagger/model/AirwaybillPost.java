package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AirwaybillPart;
import io.swagger.model.AmountUnit;
import io.swagger.model.Dimension;
import io.swagger.model.HandlingInformation;
import io.swagger.model.HouseAirwaybill;
import io.swagger.model.SHC;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AirwaybillPost
 */
@Validated

public class AirwaybillPost   {
  @JsonProperty("airwaybillPrefix")
  private String airwaybillPrefix = null;

  @JsonProperty("airwaybillSerial")
  private String airwaybillSerial = null;

  @JsonProperty("pieces")
  private Integer pieces = null;

  @JsonProperty("weight")
  private AmountUnit weight = null;

  @JsonProperty("voulume")
  private AmountUnit voulume = null;

  @JsonProperty("rcvdPieces")
  private Integer rcvdPieces = null;

  @JsonProperty("rcvdWeight")
  private AmountUnit rcvdWeight = null;

  @JsonProperty("rcvdVolume")
  private AmountUnit rcvdVolume = null;

  @JsonProperty("previouslyRcvdPieces")
  private Integer previouslyRcvdPieces = null;

  @JsonProperty("previouslyRcvdWeight")
  private BigDecimal previouslyRcvdWeight = null;

  @JsonProperty("origin")
  private String origin = null;

  @JsonProperty("destination")
  private String destination = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("preferredLocation")
  private String preferredLocation = null;

  @JsonProperty("defaultLocation")
  private String defaultLocation = null;

  @JsonProperty("acceptanceStatus")
  private String acceptanceStatus = null;

  @JsonProperty("dimension")
  private Dimension dimension = null;

  @JsonProperty("specialHandling")
  private SHC specialHandling = null;

  @JsonProperty("handlingInformation")
  private HandlingInformation handlingInformation = null;

  @JsonProperty("remarks")
  private String remarks = null;

  @JsonProperty("euPallets")
  private Integer euPallets = null;

  @JsonProperty("isMaster")
  private Boolean isMaster = null;

  @JsonProperty("doneXray")
  private Boolean doneXray = null;

  @JsonProperty("sendFsu")
  private Boolean sendFsu = null;

  @JsonProperty("isBUP")
  private Boolean isBUP = null;

  @JsonProperty("readyForCarriageChecked")
  private Boolean readyForCarriageChecked = null;

  @JsonProperty("blockedForManifesting")
  private Boolean blockedForManifesting = null;

  @JsonProperty("houseAirwaybill")
  @Valid
  private List<HouseAirwaybill> houseAirwaybill = null;

  @JsonProperty("numberOfParts")
  private Integer numberOfParts = null;

  @JsonProperty("part")
  @Valid
  private List<AirwaybillPart> part = null;

  public AirwaybillPost airwaybillPrefix(String airwaybillPrefix) {
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

  public AirwaybillPost airwaybillSerial(String airwaybillSerial) {
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

  public AirwaybillPost pieces(Integer pieces) {
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

  public AirwaybillPost weight(AmountUnit weight) {
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

  public AirwaybillPost voulume(AmountUnit voulume) {
    this.voulume = voulume;
    return this;
  }

  /**
   * Get voulume
   * @return voulume
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AmountUnit getVoulume() {
    return voulume;
  }

  public void setVoulume(AmountUnit voulume) {
    this.voulume = voulume;
  }

  public AirwaybillPost rcvdPieces(Integer rcvdPieces) {
    this.rcvdPieces = rcvdPieces;
    return this;
  }

  /**
   * Get rcvdPieces
   * @return rcvdPieces
  **/
  @ApiModelProperty(value = "")


  public Integer getRcvdPieces() {
    return rcvdPieces;
  }

  public void setRcvdPieces(Integer rcvdPieces) {
    this.rcvdPieces = rcvdPieces;
  }

  public AirwaybillPost rcvdWeight(AmountUnit rcvdWeight) {
    this.rcvdWeight = rcvdWeight;
    return this;
  }

  /**
   * Get rcvdWeight
   * @return rcvdWeight
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AmountUnit getRcvdWeight() {
    return rcvdWeight;
  }

  public void setRcvdWeight(AmountUnit rcvdWeight) {
    this.rcvdWeight = rcvdWeight;
  }

  public AirwaybillPost rcvdVolume(AmountUnit rcvdVolume) {
    this.rcvdVolume = rcvdVolume;
    return this;
  }

  /**
   * Get rcvdVolume
   * @return rcvdVolume
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AmountUnit getRcvdVolume() {
    return rcvdVolume;
  }

  public void setRcvdVolume(AmountUnit rcvdVolume) {
    this.rcvdVolume = rcvdVolume;
  }

  public AirwaybillPost previouslyRcvdPieces(Integer previouslyRcvdPieces) {
    this.previouslyRcvdPieces = previouslyRcvdPieces;
    return this;
  }

  /**
   * Get previouslyRcvdPieces
   * @return previouslyRcvdPieces
  **/
  @ApiModelProperty(value = "")


  public Integer getPreviouslyRcvdPieces() {
    return previouslyRcvdPieces;
  }

  public void setPreviouslyRcvdPieces(Integer previouslyRcvdPieces) {
    this.previouslyRcvdPieces = previouslyRcvdPieces;
  }

  public AirwaybillPost previouslyRcvdWeight(BigDecimal previouslyRcvdWeight) {
    this.previouslyRcvdWeight = previouslyRcvdWeight;
    return this;
  }

  /**
   * Get previouslyRcvdWeight
   * @return previouslyRcvdWeight
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPreviouslyRcvdWeight() {
    return previouslyRcvdWeight;
  }

  public void setPreviouslyRcvdWeight(BigDecimal previouslyRcvdWeight) {
    this.previouslyRcvdWeight = previouslyRcvdWeight;
  }

  public AirwaybillPost origin(String origin) {
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

  public AirwaybillPost destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")


  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public AirwaybillPost location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public AirwaybillPost preferredLocation(String preferredLocation) {
    this.preferredLocation = preferredLocation;
    return this;
  }

  /**
   * Get preferredLocation
   * @return preferredLocation
  **/
  @ApiModelProperty(value = "")


  public String getPreferredLocation() {
    return preferredLocation;
  }

  public void setPreferredLocation(String preferredLocation) {
    this.preferredLocation = preferredLocation;
  }

  public AirwaybillPost defaultLocation(String defaultLocation) {
    this.defaultLocation = defaultLocation;
    return this;
  }

  /**
   * Get defaultLocation
   * @return defaultLocation
  **/
  @ApiModelProperty(value = "")


  public String getDefaultLocation() {
    return defaultLocation;
  }

  public void setDefaultLocation(String defaultLocation) {
    this.defaultLocation = defaultLocation;
  }

  public AirwaybillPost acceptanceStatus(String acceptanceStatus) {
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

  public AirwaybillPost dimension(Dimension dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * Get dimension
   * @return dimension
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Dimension getDimension() {
    return dimension;
  }

  public void setDimension(Dimension dimension) {
    this.dimension = dimension;
  }

  public AirwaybillPost specialHandling(SHC specialHandling) {
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

  public AirwaybillPost handlingInformation(HandlingInformation handlingInformation) {
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

  public AirwaybillPost remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Get remarks
   * @return remarks
  **/
  @ApiModelProperty(value = "")


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public AirwaybillPost euPallets(Integer euPallets) {
    this.euPallets = euPallets;
    return this;
  }

  /**
   * Get euPallets
   * @return euPallets
  **/
  @ApiModelProperty(value = "")


  public Integer getEuPallets() {
    return euPallets;
  }

  public void setEuPallets(Integer euPallets) {
    this.euPallets = euPallets;
  }

  public AirwaybillPost isMaster(Boolean isMaster) {
    this.isMaster = isMaster;
    return this;
  }

  /**
   * Get isMaster
   * @return isMaster
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsMaster() {
    return isMaster;
  }

  public void setIsMaster(Boolean isMaster) {
    this.isMaster = isMaster;
  }

  public AirwaybillPost doneXray(Boolean doneXray) {
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

  public AirwaybillPost sendFsu(Boolean sendFsu) {
    this.sendFsu = sendFsu;
    return this;
  }

  /**
   * Get sendFsu
   * @return sendFsu
  **/
  @ApiModelProperty(value = "")


  public Boolean isSendFsu() {
    return sendFsu;
  }

  public void setSendFsu(Boolean sendFsu) {
    this.sendFsu = sendFsu;
  }

  public AirwaybillPost isBUP(Boolean isBUP) {
    this.isBUP = isBUP;
    return this;
  }

  /**
   * Get isBUP
   * @return isBUP
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsBUP() {
    return isBUP;
  }

  public void setIsBUP(Boolean isBUP) {
    this.isBUP = isBUP;
  }

  public AirwaybillPost readyForCarriageChecked(Boolean readyForCarriageChecked) {
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

  public AirwaybillPost blockedForManifesting(Boolean blockedForManifesting) {
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

  public AirwaybillPost houseAirwaybill(List<HouseAirwaybill> houseAirwaybill) {
    this.houseAirwaybill = houseAirwaybill;
    return this;
  }

  public AirwaybillPost addHouseAirwaybillItem(HouseAirwaybill houseAirwaybillItem) {
    if (this.houseAirwaybill == null) {
      this.houseAirwaybill = new ArrayList<HouseAirwaybill>();
    }
    this.houseAirwaybill.add(houseAirwaybillItem);
    return this;
  }

  /**
   * Get houseAirwaybill
   * @return houseAirwaybill
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<HouseAirwaybill> getHouseAirwaybill() {
    return houseAirwaybill;
  }

  public void setHouseAirwaybill(List<HouseAirwaybill> houseAirwaybill) {
    this.houseAirwaybill = houseAirwaybill;
  }

  public AirwaybillPost numberOfParts(Integer numberOfParts) {
    this.numberOfParts = numberOfParts;
    return this;
  }

  /**
   * Get numberOfParts
   * @return numberOfParts
  **/
  @ApiModelProperty(value = "")


  public Integer getNumberOfParts() {
    return numberOfParts;
  }

  public void setNumberOfParts(Integer numberOfParts) {
    this.numberOfParts = numberOfParts;
  }

  public AirwaybillPost part(List<AirwaybillPart> part) {
    this.part = part;
    return this;
  }

  public AirwaybillPost addPartItem(AirwaybillPart partItem) {
    if (this.part == null) {
      this.part = new ArrayList<AirwaybillPart>();
    }
    this.part.add(partItem);
    return this;
  }

  /**
   * Get part
   * @return part
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AirwaybillPart> getPart() {
    return part;
  }

  public void setPart(List<AirwaybillPart> part) {
    this.part = part;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirwaybillPost airwaybillPost = (AirwaybillPost) o;
    return Objects.equals(this.airwaybillPrefix, airwaybillPost.airwaybillPrefix) &&
        Objects.equals(this.airwaybillSerial, airwaybillPost.airwaybillSerial) &&
        Objects.equals(this.pieces, airwaybillPost.pieces) &&
        Objects.equals(this.weight, airwaybillPost.weight) &&
        Objects.equals(this.voulume, airwaybillPost.voulume) &&
        Objects.equals(this.rcvdPieces, airwaybillPost.rcvdPieces) &&
        Objects.equals(this.rcvdWeight, airwaybillPost.rcvdWeight) &&
        Objects.equals(this.rcvdVolume, airwaybillPost.rcvdVolume) &&
        Objects.equals(this.previouslyRcvdPieces, airwaybillPost.previouslyRcvdPieces) &&
        Objects.equals(this.previouslyRcvdWeight, airwaybillPost.previouslyRcvdWeight) &&
        Objects.equals(this.origin, airwaybillPost.origin) &&
        Objects.equals(this.destination, airwaybillPost.destination) &&
        Objects.equals(this.location, airwaybillPost.location) &&
        Objects.equals(this.preferredLocation, airwaybillPost.preferredLocation) &&
        Objects.equals(this.defaultLocation, airwaybillPost.defaultLocation) &&
        Objects.equals(this.acceptanceStatus, airwaybillPost.acceptanceStatus) &&
        Objects.equals(this.dimension, airwaybillPost.dimension) &&
        Objects.equals(this.specialHandling, airwaybillPost.specialHandling) &&
        Objects.equals(this.handlingInformation, airwaybillPost.handlingInformation) &&
        Objects.equals(this.remarks, airwaybillPost.remarks) &&
        Objects.equals(this.euPallets, airwaybillPost.euPallets) &&
        Objects.equals(this.isMaster, airwaybillPost.isMaster) &&
        Objects.equals(this.doneXray, airwaybillPost.doneXray) &&
        Objects.equals(this.sendFsu, airwaybillPost.sendFsu) &&
        Objects.equals(this.isBUP, airwaybillPost.isBUP) &&
        Objects.equals(this.readyForCarriageChecked, airwaybillPost.readyForCarriageChecked) &&
        Objects.equals(this.blockedForManifesting, airwaybillPost.blockedForManifesting) &&
        Objects.equals(this.houseAirwaybill, airwaybillPost.houseAirwaybill) &&
        Objects.equals(this.numberOfParts, airwaybillPost.numberOfParts) &&
        Objects.equals(this.part, airwaybillPost.part);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airwaybillPrefix, airwaybillSerial, pieces, weight, voulume, rcvdPieces, rcvdWeight, rcvdVolume, previouslyRcvdPieces, previouslyRcvdWeight, origin, destination, location, preferredLocation, defaultLocation, acceptanceStatus, dimension, specialHandling, handlingInformation, remarks, euPallets, isMaster, doneXray, sendFsu, isBUP, readyForCarriageChecked, blockedForManifesting, houseAirwaybill, numberOfParts, part);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirwaybillPost {\n");
    
    sb.append("    airwaybillPrefix: ").append(toIndentedString(airwaybillPrefix)).append("\n");
    sb.append("    airwaybillSerial: ").append(toIndentedString(airwaybillSerial)).append("\n");
    sb.append("    pieces: ").append(toIndentedString(pieces)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    voulume: ").append(toIndentedString(voulume)).append("\n");
    sb.append("    rcvdPieces: ").append(toIndentedString(rcvdPieces)).append("\n");
    sb.append("    rcvdWeight: ").append(toIndentedString(rcvdWeight)).append("\n");
    sb.append("    rcvdVolume: ").append(toIndentedString(rcvdVolume)).append("\n");
    sb.append("    previouslyRcvdPieces: ").append(toIndentedString(previouslyRcvdPieces)).append("\n");
    sb.append("    previouslyRcvdWeight: ").append(toIndentedString(previouslyRcvdWeight)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredLocation: ").append(toIndentedString(preferredLocation)).append("\n");
    sb.append("    defaultLocation: ").append(toIndentedString(defaultLocation)).append("\n");
    sb.append("    acceptanceStatus: ").append(toIndentedString(acceptanceStatus)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    specialHandling: ").append(toIndentedString(specialHandling)).append("\n");
    sb.append("    handlingInformation: ").append(toIndentedString(handlingInformation)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    euPallets: ").append(toIndentedString(euPallets)).append("\n");
    sb.append("    isMaster: ").append(toIndentedString(isMaster)).append("\n");
    sb.append("    doneXray: ").append(toIndentedString(doneXray)).append("\n");
    sb.append("    sendFsu: ").append(toIndentedString(sendFsu)).append("\n");
    sb.append("    isBUP: ").append(toIndentedString(isBUP)).append("\n");
    sb.append("    readyForCarriageChecked: ").append(toIndentedString(readyForCarriageChecked)).append("\n");
    sb.append("    blockedForManifesting: ").append(toIndentedString(blockedForManifesting)).append("\n");
    sb.append("    houseAirwaybill: ").append(toIndentedString(houseAirwaybill)).append("\n");
    sb.append("    numberOfParts: ").append(toIndentedString(numberOfParts)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
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

