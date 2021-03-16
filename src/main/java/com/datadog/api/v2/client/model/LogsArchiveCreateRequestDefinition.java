/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** The definition of an archive. */
@ApiModel(description = "The definition of an archive.")
@JsonPropertyOrder({
  LogsArchiveCreateRequestDefinition.JSON_PROPERTY_ATTRIBUTES,
  LogsArchiveCreateRequestDefinition.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsArchiveCreateRequestDefinition {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private LogsArchiveCreateRequestAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "archives";

  public LogsArchiveCreateRequestDefinition attributes(
      LogsArchiveCreateRequestAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   *
   * @return attributes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsArchiveCreateRequestAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(LogsArchiveCreateRequestAttributes attributes) {
    this.attributes = attributes;
  }

  public LogsArchiveCreateRequestDefinition type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the resource. The value should always be archives.
   *
   * @return type
   */
  @ApiModelProperty(
      example = "archives",
      required = true,
      value = "The type of the resource. The value should always be archives.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /** Return true if this LogsArchiveCreateRequestDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveCreateRequestDefinition logsArchiveCreateRequestDefinition =
        (LogsArchiveCreateRequestDefinition) o;
    return Objects.equals(this.attributes, logsArchiveCreateRequestDefinition.attributes)
        && Objects.equals(this.type, logsArchiveCreateRequestDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveCreateRequestDefinition {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
