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
 * DimensionConstant
 */
@Validated

public class DimensionConstant   {
  @JsonProperty("pieces")
  private Integer pieces = null;

  @JsonProperty("length")
  private Integer length = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("height")
  private Integer height = null;

  public DimensionConstant pieces(Integer pieces) {
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

  public DimensionConstant length(Integer length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")


  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public DimensionConstant width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")


  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public DimensionConstant height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")


  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DimensionConstant dimensionConstant = (DimensionConstant) o;
    return Objects.equals(this.pieces, dimensionConstant.pieces) &&
        Objects.equals(this.length, dimensionConstant.length) &&
        Objects.equals(this.width, dimensionConstant.width) &&
        Objects.equals(this.height, dimensionConstant.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pieces, length, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DimensionConstant {\n");
    
    sb.append("    pieces: ").append(toIndentedString(pieces)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

