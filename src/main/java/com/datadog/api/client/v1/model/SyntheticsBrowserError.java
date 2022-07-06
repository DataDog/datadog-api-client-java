/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Error response object for a browser test. */
@JsonPropertyOrder({
  SyntheticsBrowserError.JSON_PROPERTY_DESCRIPTION,
  SyntheticsBrowserError.JSON_PROPERTY_NAME,
  SyntheticsBrowserError.JSON_PROPERTY_STATUS,
  SyntheticsBrowserError.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBrowserError {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Long status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsBrowserErrorType type;

  public SyntheticsBrowserError() {}

  @JsonCreator
  public SyntheticsBrowserError(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SyntheticsBrowserErrorType type) {
    this.description = description;
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SyntheticsBrowserError description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the error.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SyntheticsBrowserError name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the error.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsBrowserError status(Long status) {
    this.status = status;
    return this;
  }

  /**
   * Status Code of the error.
   *
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public SyntheticsBrowserError type(SyntheticsBrowserErrorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Error type returned by a browser test.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsBrowserErrorType getType() {
    return type;
  }

  public void setType(SyntheticsBrowserErrorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SyntheticsBrowserError object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserError syntheticsBrowserError = (SyntheticsBrowserError) o;
    return Objects.equals(this.description, syntheticsBrowserError.description)
        && Objects.equals(this.name, syntheticsBrowserError.name)
        && Objects.equals(this.status, syntheticsBrowserError.status)
        && Objects.equals(this.type, syntheticsBrowserError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
