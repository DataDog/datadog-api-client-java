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

/** A downtime match. */
@JsonPropertyOrder({
  MonitorDowntimeMatchResponseData.JSON_PROPERTY_ATTRIBUTES,
  MonitorDowntimeMatchResponseData.JSON_PROPERTY_ID,
  MonitorDowntimeMatchResponseData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorDowntimeMatchResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private MonitorDowntimeMatchAttributeResponse attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MonitorDowntimeMatchResourceType type = MonitorDowntimeMatchResourceType.DOWNTIME_MATCH;

  public MonitorDowntimeMatchResponseData attributes(
      MonitorDowntimeMatchAttributeResponse attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Downtime match details.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorDowntimeMatchAttributeResponse getAttributes() {
    return attributes;
  }

  public void setAttributes(MonitorDowntimeMatchAttributeResponse attributes) {
    this.attributes = attributes;
  }

  public MonitorDowntimeMatchResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The downtime ID.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MonitorDowntimeMatchResponseData type(MonitorDowntimeMatchResourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Monitor Downtime Match resource type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorDowntimeMatchResourceType getType() {
    return type;
  }

  public void setType(MonitorDowntimeMatchResourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this MonitorDowntimeMatchResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorDowntimeMatchResponseData monitorDowntimeMatchResponseData =
        (MonitorDowntimeMatchResponseData) o;
    return Objects.equals(this.attributes, monitorDowntimeMatchResponseData.attributes)
        && Objects.equals(this.id, monitorDowntimeMatchResponseData.id)
        && Objects.equals(this.type, monitorDowntimeMatchResponseData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorDowntimeMatchResponseData {\n");
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
