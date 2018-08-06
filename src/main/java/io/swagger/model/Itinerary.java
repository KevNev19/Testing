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
 * Itinerary
 */
@Validated

public class Itinerary   {
  @JsonProperty("segment")
  private Integer segment = null;

  @JsonProperty("origin")
  private String origin = null;

  @JsonProperty("destination")
  private String destination = null;

  @JsonProperty("transportMeans")
  private String transportMeans = null;

  public Itinerary segment(Integer segment) {
    this.segment = segment;
    return this;
  }

  /**
   * Get segment
   * @return segment
  **/
  @ApiModelProperty(value = "")


  public Integer getSegment() {
    return segment;
  }

  public void setSegment(Integer segment) {
    this.segment = segment;
  }

  public Itinerary origin(String origin) {
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

  public Itinerary destination(String destination) {
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

  public Itinerary transportMeans(String transportMeans) {
    this.transportMeans = transportMeans;
    return this;
  }

  /**
   * Get transportMeans
   * @return transportMeans
  **/
  @ApiModelProperty(value = "")


  public String getTransportMeans() {
    return transportMeans;
  }

  public void setTransportMeans(String transportMeans) {
    this.transportMeans = transportMeans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Itinerary itinerary = (Itinerary) o;
    return Objects.equals(this.segment, itinerary.segment) &&
        Objects.equals(this.origin, itinerary.origin) &&
        Objects.equals(this.destination, itinerary.destination) &&
        Objects.equals(this.transportMeans, itinerary.transportMeans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment, origin, destination, transportMeans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Itinerary {\n");
    
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    transportMeans: ").append(toIndentedString(transportMeans)).append("\n");
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

