/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Data of the pipeline event to create. */
@JsonPropertyOrder({
  CIAppCreatePipelineEventRequestData.JSON_PROPERTY_ATTRIBUTES,
  CIAppCreatePipelineEventRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppCreatePipelineEventRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private CIAppCreatePipelineEventRequestAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CIAppCreatePipelineEventRequestDataType type =
      CIAppCreatePipelineEventRequestDataType.CIPIPELINE_RESOURCE_REQUEST;

  public CIAppCreatePipelineEventRequestData attributes(
      CIAppCreatePipelineEventRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of the pipeline event to create.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppCreatePipelineEventRequestAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CIAppCreatePipelineEventRequestAttributes attributes) {
    this.attributes = attributes;
  }

  public CIAppCreatePipelineEventRequestData type(CIAppCreatePipelineEventRequestDataType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the event.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppCreatePipelineEventRequestDataType getType() {
    return type;
  }

  public void setType(CIAppCreatePipelineEventRequestDataType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CIAppCreatePipelineEventRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppCreatePipelineEventRequestData ciAppCreatePipelineEventRequestData =
        (CIAppCreatePipelineEventRequestData) o;
    return Objects.equals(this.attributes, ciAppCreatePipelineEventRequestData.attributes)
        && Objects.equals(this.type, ciAppCreatePipelineEventRequestData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppCreatePipelineEventRequestData {\n");
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
