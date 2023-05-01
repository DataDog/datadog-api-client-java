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

/** A monitor configuration policy data. */
@JsonPropertyOrder({
  MonitorConfigPolicyEditData.JSON_PROPERTY_ATTRIBUTES,
  MonitorConfigPolicyEditData.JSON_PROPERTY_ID,
  MonitorConfigPolicyEditData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorConfigPolicyEditData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private MonitorConfigPolicyAttributeEditRequest attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MonitorConfigPolicyResourceType type =
      MonitorConfigPolicyResourceType.MONITOR_CONFIG_POLICY;

  public MonitorConfigPolicyEditData() {}

  @JsonCreator
  public MonitorConfigPolicyEditData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          MonitorConfigPolicyAttributeEditRequest attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          MonitorConfigPolicyResourceType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public MonitorConfigPolicyEditData attributes(
      MonitorConfigPolicyAttributeEditRequest attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Policy and policy type for a monitor configuration policy.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MonitorConfigPolicyAttributeEditRequest getAttributes() {
    return attributes;
  }

  public void setAttributes(MonitorConfigPolicyAttributeEditRequest attributes) {
    this.attributes = attributes;
  }

  public MonitorConfigPolicyEditData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of this monitor configuration policy.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MonitorConfigPolicyEditData type(MonitorConfigPolicyResourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Monitor configuration policy resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MonitorConfigPolicyResourceType getType() {
    return type;
  }

  public void setType(MonitorConfigPolicyResourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this MonitorConfigPolicyEditData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorConfigPolicyEditData monitorConfigPolicyEditData = (MonitorConfigPolicyEditData) o;
    return Objects.equals(this.attributes, monitorConfigPolicyEditData.attributes)
        && Objects.equals(this.id, monitorConfigPolicyEditData.id)
        && Objects.equals(this.type, monitorConfigPolicyEditData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorConfigPolicyEditData {\n");
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
