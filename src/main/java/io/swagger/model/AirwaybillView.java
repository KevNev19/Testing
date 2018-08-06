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
import io.swagger.model.HouseAirwaybillView;
import io.swagger.model.OCI;
import io.swagger.model.SHC;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AirwaybillView
 */
@Validated

public class AirwaybillView   {
  @JsonProperty("airwaybillId")
  private String airwaybillId = null;

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

  @JsonProperty("oci")
  private OCI oci = null;

  @JsonProperty("handlingInformation")
  private HandlingInformation handlingInformation = null;

  @JsonProperty("remarks")
  private String remarks = null;

  @JsonProperty("euPallets")
  private Integer euPallets = null;

  @JsonProperty("waitForTotalStatus")
  private String waitForTotalStatus = null;

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
  private List<HouseAirwaybillView> houseAirwaybill = null;

  @JsonProperty("numberOfParts")
  private Integer numberOfParts = null;

  @JsonProperty("part")
  @Valid
  private List<AirwaybillPart> part = null;

  public AirwaybillView airwaybillId(String airwaybillId) {
    this.airwaybillId = airwaybillId;
    return this;
  }

  /**
   * Get airwaybillId
   * @return airwaybillId
  **/
  @ApiModelProperty(value = "")


  public String getAirwaybillId() {
    return airwaybillId;
  }

  public void setAirwaybillId(String airwaybillId) {
    this.airwaybillId = airwaybillId;
  }

  public AirwaybillView airwaybillPrefix(String airwaybillPrefix) {
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

  public AirwaybillView airwaybillSerial(String airwaybillSerial) {
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

  public AirwaybillView pieces(Integer pieces) {
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

  public AirwaybillView weight(AmountUnit weight) {
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

  public AirwaybillView voulume(AmountUnit voulume) {
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

  public AirwaybillView rcvdPieces(Integer rcvdPieces) {
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

  public AirwaybillView rcvdWeight(AmountUnit rcvdWeight) {
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

  public AirwaybillView rcvdVolume(AmountUnit rcvdVolume) {
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

  public AirwaybillView previouslyRcvdPieces(Integer previouslyRcvdPieces) {
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

  public AirwaybillView previouslyRcvdWeight(BigDecimal previouslyRcvdWeight) {
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

  public AirwaybillView origin(String origin) {
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

  public AirwaybillView destination(String destination) {
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

  public AirwaybillView location(String location) {
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

  public AirwaybillView preferredLocation(String preferredLocation) {
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

  public AirwaybillView defaultLocation(String defaultLocation) {
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

  public AirwaybillView acceptanceStatus(String acceptanceStatus) {
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

  public AirwaybillView dimension(Dimension dimension) {
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

  public AirwaybillView specialHandling(SHC specialHandling) {
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

  public AirwaybillView oci(OCI oci) {
    this.oci = oci;
    return this;
  }

  /**
   * Get oci
   * @return oci
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OCI getOci() {
    return oci;
  }

  public void setOci(OCI oci) {
    this.oci = oci;
  }

  public AirwaybillView handlingInformation(HandlingInformation handlingInformation) {
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

  public AirwaybillView remarks(String remarks) {
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

  public AirwaybillView euPallets(Integer euPallets) {
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

  public AirwaybillView waitForTotalStatus(String waitForTotalStatus) {
    this.waitForTotalStatus = waitForTotalStatus;
    return this;
  }

  /**
   * Get waitForTotalStatus
   * @return waitForTotalStatus
  **/
  @ApiModelProperty(value = "")


  public String getWaitForTotalStatus() {
    return waitForTotalStatus;
  }

  public void setWaitForTotalStatus(String waitForTotalStatus) {
    this.waitForTotalStatus = waitForTotalStatus;
  }

  public AirwaybillView isMaster(Boolean isMaster) {
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

  public AirwaybillView doneXray(Boolean doneXray) {
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

  public AirwaybillView sendFsu(Boolean sendFsu) {
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

  public AirwaybillView isBUP(Boolean isBUP) {
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

  public AirwaybillView readyForCarriageChecked(Boolean readyForCarriageChecked) {
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

  public AirwaybillView blockedForManifesting(Boolean blockedForManifesting) {
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

  public AirwaybillView houseAirwaybill(List<HouseAirwaybillView> houseAirwaybill) {
    this.houseAirwaybill = houseAirwaybill;
    return this;
  }

  public AirwaybillView addHouseAirwaybillItem(HouseAirwaybillView houseAirwaybillItem) {
    if (this.houseAirwaybill == null) {
      this.houseAirwaybill = new ArrayList<HouseAirwaybillView>();
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

  public List<HouseAirwaybillView> getHouseAirwaybill() {
    return houseAirwaybill;
  }

  public void setHouseAirwaybill(List<HouseAirwaybillView> houseAirwaybill) {
    this.houseAirwaybill = houseAirwaybill;
  }

  public AirwaybillView numberOfParts(Integer numberOfParts) {
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

  public AirwaybillView part(List<AirwaybillPart> part) {
    this.part = part;
    return this;
  }

  public AirwaybillView addPartItem(AirwaybillPart partItem) {
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
    AirwaybillView airwaybillView = (AirwaybillView) o;
    return Objects.equals(this.airwaybillId, airwaybillView.airwaybillId) &&
        Objects.equals(this.airwaybillPrefix, airwaybillView.airwaybillPrefix) &&
        Objects.equals(this.airwaybillSerial, airwaybillView.airwaybillSerial) &&
        Objects.equals(this.pieces, airwaybillView.pieces) &&
        Objects.equals(this.weight, airwaybillView.weight) &&
        Objects.equals(this.voulume, airwaybillView.voulume) &&
        Objects.equals(this.rcvdPieces, airwaybillView.rcvdPieces) &&
        Objects.equals(this.rcvdWeight, airwaybillView.rcvdWeight) &&
        Objects.equals(this.rcvdVolume, airwaybillView.rcvdVolume) &&
        Objects.equals(this.previouslyRcvdPieces, airwaybillView.previouslyRcvdPieces) &&
        Objects.equals(this.previouslyRcvdWeight, airwaybillView.previouslyRcvdWeight) &&
        Objects.equals(this.origin, airwaybillView.origin) &&
        Objects.equals(this.destination, airwaybillView.destination) &&
        Objects.equals(this.location, airwaybillView.location) &&
        Objects.equals(this.preferredLocation, airwaybillView.preferredLocation) &&
        Objects.equals(this.defaultLocation, airwaybillView.defaultLocation) &&
        Objects.equals(this.acceptanceStatus, airwaybillView.acceptanceStatus) &&
        Objects.equals(this.dimension, airwaybillView.dimension) &&
        Objects.equals(this.specialHandling, airwaybillView.specialHandling) &&
        Objects.equals(this.oci, airwaybillView.oci) &&
        Objects.equals(this.handlingInformation, airwaybillView.handlingInformation) &&
        Objects.equals(this.remarks, airwaybillView.remarks) &&
        Objects.equals(this.euPallets, airwaybillView.euPallets) &&
        Objects.equals(this.waitForTotalStatus, airwaybillView.waitForTotalStatus) &&
        Objects.equals(this.isMaster, airwaybillView.isMaster) &&
        Objects.equals(this.doneXray, airwaybillView.doneXray) &&
        Objects.equals(this.sendFsu, airwaybillView.sendFsu) &&
        Objects.equals(this.isBUP, airwaybillView.isBUP) &&
        Objects.equals(this.readyForCarriageChecked, airwaybillView.readyForCarriageChecked) &&
        Objects.equals(this.blockedForManifesting, airwaybillView.blockedForManifesting) &&
        Objects.equals(this.houseAirwaybill, airwaybillView.houseAirwaybill) &&
        Objects.equals(this.numberOfParts, airwaybillView.numberOfParts) &&
        Objects.equals(this.part, airwaybillView.part);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airwaybillId, airwaybillPrefix, airwaybillSerial, pieces, weight, voulume, rcvdPieces, rcvdWeight, rcvdVolume, previouslyRcvdPieces, previouslyRcvdWeight, origin, destination, location, preferredLocation, defaultLocation, acceptanceStatus, dimension, specialHandling, oci, handlingInformation, remarks, euPallets, waitForTotalStatus, isMaster, doneXray, sendFsu, isBUP, readyForCarriageChecked, blockedForManifesting, houseAirwaybill, numberOfParts, part);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirwaybillView {\n");
    
    sb.append("    airwaybillId: ").append(toIndentedString(airwaybillId)).append("\n");
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
    sb.append("    oci: ").append(toIndentedString(oci)).append("\n");
    sb.append("    handlingInformation: ").append(toIndentedString(handlingInformation)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    euPallets: ").append(toIndentedString(euPallets)).append("\n");
    sb.append("    waitForTotalStatus: ").append(toIndentedString(waitForTotalStatus)).append("\n");
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

