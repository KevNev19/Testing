package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OciConstant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OCI
 */
@Validated

public class OCI   {
  @JsonProperty("measurements")
  @Valid
  private List<OciConstant> measurements = null;

  public OCI measurements(List<OciConstant> measurements) {
    this.measurements = measurements;
    return this;
  }

  public OCI addMeasurementsItem(OciConstant measurementsItem) {
    if (this.measurements == null) {
      this.measurements = new ArrayList<OciConstant>();
    }
    this.measurements.add(measurementsItem);
    return this;
  }

  /**
   * Get measurements
   * @return measurements
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OciConstant> getMeasurements() {
    return measurements;
  }

  public void setMeasurements(List<OciConstant> measurements) {
    this.measurements = measurements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCI OCI = (OCI) o;
    return Objects.equals(this.measurements, OCI.measurements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCI {\n");
    
    sb.append("    measurements: ").append(toIndentedString(measurements)).append("\n");
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

