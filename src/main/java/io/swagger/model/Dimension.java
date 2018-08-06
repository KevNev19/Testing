package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DimensionConstant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dimension
 */
@Validated

public class Dimension   {
  @JsonProperty("measurements")
  @Valid
  private List<DimensionConstant> measurements = null;

  public Dimension measurements(List<DimensionConstant> measurements) {
    this.measurements = measurements;
    return this;
  }

  public Dimension addMeasurementsItem(DimensionConstant measurementsItem) {
    if (this.measurements == null) {
      this.measurements = new ArrayList<DimensionConstant>();
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

  public List<DimensionConstant> getMeasurements() {
    return measurements;
  }

  public void setMeasurements(List<DimensionConstant> measurements) {
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
    Dimension dimension = (Dimension) o;
    return Objects.equals(this.measurements, dimension.measurements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dimension {\n");
    
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

