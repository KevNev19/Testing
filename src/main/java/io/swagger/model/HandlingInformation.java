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
 * HandlingInformation
 */
@Validated

public class HandlingInformation   {
  @JsonProperty("osiRemarks")
  @Valid
  private List<String> osiRemarks = null;

  @JsonProperty("ssrRemarks")
  @Valid
  private List<String> ssrRemarks = null;

  public HandlingInformation osiRemarks(List<String> osiRemarks) {
    this.osiRemarks = osiRemarks;
    return this;
  }

  public HandlingInformation addOsiRemarksItem(String osiRemarksItem) {
    if (this.osiRemarks == null) {
      this.osiRemarks = new ArrayList<String>();
    }
    this.osiRemarks.add(osiRemarksItem);
    return this;
  }

  /**
   * Get osiRemarks
   * @return osiRemarks
  **/
  @ApiModelProperty(value = "")


  public List<String> getOsiRemarks() {
    return osiRemarks;
  }

  public void setOsiRemarks(List<String> osiRemarks) {
    this.osiRemarks = osiRemarks;
  }

  public HandlingInformation ssrRemarks(List<String> ssrRemarks) {
    this.ssrRemarks = ssrRemarks;
    return this;
  }

  public HandlingInformation addSsrRemarksItem(String ssrRemarksItem) {
    if (this.ssrRemarks == null) {
      this.ssrRemarks = new ArrayList<String>();
    }
    this.ssrRemarks.add(ssrRemarksItem);
    return this;
  }

  /**
   * Get ssrRemarks
   * @return ssrRemarks
  **/
  @ApiModelProperty(value = "")


  public List<String> getSsrRemarks() {
    return ssrRemarks;
  }

  public void setSsrRemarks(List<String> ssrRemarks) {
    this.ssrRemarks = ssrRemarks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HandlingInformation handlingInformation = (HandlingInformation) o;
    return Objects.equals(this.osiRemarks, handlingInformation.osiRemarks) &&
        Objects.equals(this.ssrRemarks, handlingInformation.ssrRemarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osiRemarks, ssrRemarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HandlingInformation {\n");
    
    sb.append("    osiRemarks: ").append(toIndentedString(osiRemarks)).append("\n");
    sb.append("    ssrRemarks: ").append(toIndentedString(ssrRemarks)).append("\n");
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

