package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AmountUnit;
import io.swagger.model.Dimension;
import io.swagger.model.HouseairwaybillSub;
import io.swagger.model.Link;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HouseairwaybillSplitSub
 */
@Validated

public class HouseairwaybillSplitSub   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("houseAirwaybill")
  private HouseairwaybillSub houseAirwaybill = null;

  @JsonProperty("pieces")
  private Integer pieces = null;

  @JsonProperty("weight")
  private AmountUnit weight = null;

  @JsonProperty("volume")
  private AmountUnit volume = null;

  @JsonProperty("dimension")
  private Dimension dimension = null;

  @JsonProperty("link")
  private Link link = null;

  public HouseairwaybillSplitSub id(String id) {
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

  public HouseairwaybillSplitSub houseAirwaybill(HouseairwaybillSub houseAirwaybill) {
    this.houseAirwaybill = houseAirwaybill;
    return this;
  }

  /**
   * Get houseAirwaybill
   * @return houseAirwaybill
  **/
  @ApiModelProperty(value = "")

  @Valid

  public HouseairwaybillSub getHouseAirwaybill() {
    return houseAirwaybill;
  }

  public void setHouseAirwaybill(HouseairwaybillSub houseAirwaybill) {
    this.houseAirwaybill = houseAirwaybill;
  }

  public HouseairwaybillSplitSub pieces(Integer pieces) {
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

  public HouseairwaybillSplitSub weight(AmountUnit weight) {
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

  public HouseairwaybillSplitSub volume(AmountUnit volume) {
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

  public HouseairwaybillSplitSub dimension(Dimension dimension) {
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

  public HouseairwaybillSplitSub link(Link link) {
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
    HouseairwaybillSplitSub houseairwaybillSplitSub = (HouseairwaybillSplitSub) o;
    return Objects.equals(this.id, houseairwaybillSplitSub.id) &&
        Objects.equals(this.houseAirwaybill, houseairwaybillSplitSub.houseAirwaybill) &&
        Objects.equals(this.pieces, houseairwaybillSplitSub.pieces) &&
        Objects.equals(this.weight, houseairwaybillSplitSub.weight) &&
        Objects.equals(this.volume, houseairwaybillSplitSub.volume) &&
        Objects.equals(this.dimension, houseairwaybillSplitSub.dimension) &&
        Objects.equals(this.link, houseairwaybillSplitSub.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, houseAirwaybill, pieces, weight, volume, dimension, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HouseairwaybillSplitSub {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    houseAirwaybill: ").append(toIndentedString(houseAirwaybill)).append("\n");
    sb.append("    pieces: ").append(toIndentedString(pieces)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
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

