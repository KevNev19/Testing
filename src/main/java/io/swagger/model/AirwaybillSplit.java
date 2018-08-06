package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AirwaybillSub;
import io.swagger.model.AmountUnit;
import io.swagger.model.Dimension;
import io.swagger.model.HouseairwaybillSplitSub;
import io.swagger.model.Link;
import io.swagger.model.SHC;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AirwaybillSplit
 */
@Validated

public class AirwaybillSplit   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("airwaybill")
  @Valid
  private List<AirwaybillSub> airwaybill = null;

  @JsonProperty("houseAirwaybill")
  @Valid
  private List<HouseairwaybillSplitSub> houseAirwaybill = null;

  @JsonProperty("pieces")
  private Integer pieces = null;

  @JsonProperty("weight")
  private AmountUnit weight = null;

  @JsonProperty("volume")
  private AmountUnit volume = null;

  @JsonProperty("dimension")
  private Dimension dimension = null;

  @JsonProperty("specialHandling")
  private SHC specialHandling = null;

  @JsonProperty("link")
  private Link link = null;

  public AirwaybillSplit id(String id) {
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

  public AirwaybillSplit airwaybill(List<AirwaybillSub> airwaybill) {
    this.airwaybill = airwaybill;
    return this;
  }

  public AirwaybillSplit addAirwaybillItem(AirwaybillSub airwaybillItem) {
    if (this.airwaybill == null) {
      this.airwaybill = new ArrayList<AirwaybillSub>();
    }
    this.airwaybill.add(airwaybillItem);
    return this;
  }

  /**
   * Get airwaybill
   * @return airwaybill
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AirwaybillSub> getAirwaybill() {
    return airwaybill;
  }

  public void setAirwaybill(List<AirwaybillSub> airwaybill) {
    this.airwaybill = airwaybill;
  }

  public AirwaybillSplit houseAirwaybill(List<HouseairwaybillSplitSub> houseAirwaybill) {
    this.houseAirwaybill = houseAirwaybill;
    return this;
  }

  public AirwaybillSplit addHouseAirwaybillItem(HouseairwaybillSplitSub houseAirwaybillItem) {
    if (this.houseAirwaybill == null) {
      this.houseAirwaybill = new ArrayList<HouseairwaybillSplitSub>();
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

  public List<HouseairwaybillSplitSub> getHouseAirwaybill() {
    return houseAirwaybill;
  }

  public void setHouseAirwaybill(List<HouseairwaybillSplitSub> houseAirwaybill) {
    this.houseAirwaybill = houseAirwaybill;
  }

  public AirwaybillSplit pieces(Integer pieces) {
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

  public AirwaybillSplit weight(AmountUnit weight) {
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

  public AirwaybillSplit volume(AmountUnit volume) {
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

  public AirwaybillSplit dimension(Dimension dimension) {
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

  public AirwaybillSplit specialHandling(SHC specialHandling) {
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

  public AirwaybillSplit link(Link link) {
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
    AirwaybillSplit airwaybillSplit = (AirwaybillSplit) o;
    return Objects.equals(this.id, airwaybillSplit.id) &&
        Objects.equals(this.airwaybill, airwaybillSplit.airwaybill) &&
        Objects.equals(this.houseAirwaybill, airwaybillSplit.houseAirwaybill) &&
        Objects.equals(this.pieces, airwaybillSplit.pieces) &&
        Objects.equals(this.weight, airwaybillSplit.weight) &&
        Objects.equals(this.volume, airwaybillSplit.volume) &&
        Objects.equals(this.dimension, airwaybillSplit.dimension) &&
        Objects.equals(this.specialHandling, airwaybillSplit.specialHandling) &&
        Objects.equals(this.link, airwaybillSplit.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, airwaybill, houseAirwaybill, pieces, weight, volume, dimension, specialHandling, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirwaybillSplit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    airwaybill: ").append(toIndentedString(airwaybill)).append("\n");
    sb.append("    houseAirwaybill: ").append(toIndentedString(houseAirwaybill)).append("\n");
    sb.append("    pieces: ").append(toIndentedString(pieces)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    specialHandling: ").append(toIndentedString(specialHandling)).append("\n");
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

