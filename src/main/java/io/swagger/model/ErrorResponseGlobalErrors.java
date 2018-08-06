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
 * ErrorResponseGlobalErrors
 */
@Validated

public class ErrorResponseGlobalErrors   {
  @JsonProperty("userMessage")
  private String userMessage = null;

  @JsonProperty("fields")
  @Valid
  private List<String> fields = null;

  public ErrorResponseGlobalErrors userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }

  /**
   * Get userMessage
   * @return userMessage
  **/
  @ApiModelProperty(value = "")


  public String getUserMessage() {
    return userMessage;
  }

  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }

  public ErrorResponseGlobalErrors fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public ErrorResponseGlobalErrors addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<String>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(value = "")


  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseGlobalErrors errorResponseGlobalErrors = (ErrorResponseGlobalErrors) o;
    return Objects.equals(this.userMessage, errorResponseGlobalErrors.userMessage) &&
        Objects.equals(this.fields, errorResponseGlobalErrors.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userMessage, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseGlobalErrors {\n");
    
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

