package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SHC
 */
@Validated

public class SHC   {
  @JsonProperty("shccodes")
  @Valid
  private List<String> shccodes = null;

  public SHC shccodes(List<String> shccodes) {
    this.shccodes = shccodes;
    return this;
  }

  public SHC addShccodesItem(String shccodesItem) {
    if (this.shccodes == null) {
      this.shccodes = new ArrayList<String>();
    }
    this.shccodes.add(shccodesItem);
    return this;
  }

  /**
   * Get shccodes
   * @return shccodes
  **/
  @ApiModelProperty(value = "")


  public List<String> getShccodes() {
    return shccodes;
  }

  public void setShccodes(List<String> shccodes) {
    this.shccodes = shccodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SHC SHC = (SHC) o;
    return Objects.equals(this.shccodes, SHC.shccodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shccodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SHC {\n");
    
    sb.append("    shccodes: ").append(toIndentedString(shccodes)).append("\n");
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

