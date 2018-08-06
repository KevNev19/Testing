package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ErrorResponseGlobalErrors;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponse
 */
@Validated

public class ErrorResponse   {
  @JsonProperty("fieldErrors")
  @Valid
  private List<String> fieldErrors = null;

  @JsonProperty("globalErrors")
  private ErrorResponseGlobalErrors globalErrors = null;

  public ErrorResponse fieldErrors(List<String> fieldErrors) {
    this.fieldErrors = fieldErrors;
    return this;
  }

  public ErrorResponse addFieldErrorsItem(String fieldErrorsItem) {
    if (this.fieldErrors == null) {
      this.fieldErrors = new ArrayList<String>();
    }
    this.fieldErrors.add(fieldErrorsItem);
    return this;
  }

  /**
   * Get fieldErrors
   * @return fieldErrors
  **/
  @ApiModelProperty(value = "")


  public List<String> getFieldErrors() {
    return fieldErrors;
  }

  public void setFieldErrors(List<String> fieldErrors) {
    this.fieldErrors = fieldErrors;
  }

  public ErrorResponse globalErrors(ErrorResponseGlobalErrors globalErrors) {
    this.globalErrors = globalErrors;
    return this;
  }

  /**
   * Get globalErrors
   * @return globalErrors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ErrorResponseGlobalErrors getGlobalErrors() {
    return globalErrors;
  }

  public void setGlobalErrors(ErrorResponseGlobalErrors globalErrors) {
    this.globalErrors = globalErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.fieldErrors, errorResponse.fieldErrors) &&
        Objects.equals(this.globalErrors, errorResponse.globalErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldErrors, globalErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    fieldErrors: ").append(toIndentedString(fieldErrors)).append("\n");
    sb.append("    globalErrors: ").append(toIndentedString(globalErrors)).append("\n");
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

