/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object to create a downtime. */
@JsonPropertyOrder({
  DowntimeCreateData.JSON_PROPERTY_ATTRIBUTES,
  DowntimeCreateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeCreateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private DowntimeAttributeCreateRequest attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DowntimeResourceType type = DowntimeResourceType.DOWNTIME;

  public DowntimeCreateData() {}

  @JsonCreator
  public DowntimeCreateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          DowntimeAttributeCreateRequest attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) DowntimeResourceType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public DowntimeCreateData attributes(DowntimeAttributeCreateRequest attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Downtime details.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DowntimeAttributeCreateRequest getAttributes() {
    return attributes;
  }

  public void setAttributes(DowntimeAttributeCreateRequest attributes) {
    this.attributes = attributes;
  }

  public DowntimeCreateData type(DowntimeResourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Downtime resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DowntimeResourceType getType() {
    return type;
  }

  public void setType(DowntimeResourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this DowntimeCreateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeCreateData downtimeCreateData = (DowntimeCreateData) o;
    return Objects.equals(this.attributes, downtimeCreateData.attributes)
        && Objects.equals(this.type, downtimeCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeCreateData {\n");
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
