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

/** Information about the monitor identified by the downtime. */
@JsonPropertyOrder({
  DowntimeMonitorIncludedItem.JSON_PROPERTY_ATTRIBUTES,
  DowntimeMonitorIncludedItem.JSON_PROPERTY_ID,
  DowntimeMonitorIncludedItem.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeMonitorIncludedItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private DowntimeMonitorIncludedAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DowntimeIncludedMonitorType type = DowntimeIncludedMonitorType.MONITORS;

  public DowntimeMonitorIncludedItem attributes(DowntimeMonitorIncludedAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of the monitor identified by the downtime.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeMonitorIncludedAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(DowntimeMonitorIncludedAttributes attributes) {
    this.attributes = attributes;
  }

  public DowntimeMonitorIncludedItem id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the monitor identified by the downtime.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DowntimeMonitorIncludedItem type(DowntimeIncludedMonitorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Monitor resource type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeIncludedMonitorType getType() {
    return type;
  }

  public void setType(DowntimeIncludedMonitorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this DowntimeMonitorIncludedItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeMonitorIncludedItem downtimeMonitorIncludedItem = (DowntimeMonitorIncludedItem) o;
    return Objects.equals(this.attributes, downtimeMonitorIncludedItem.attributes)
        && Objects.equals(this.id, downtimeMonitorIncludedItem.id)
        && Objects.equals(this.type, downtimeMonitorIncludedItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeMonitorIncludedItem {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
