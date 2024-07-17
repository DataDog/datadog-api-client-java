/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Count of the device interfaces by status */
@JsonPropertyOrder({
  DeviceAttributesInterfaceStatuses.JSON_PROPERTY_DOWN,
  DeviceAttributesInterfaceStatuses.JSON_PROPERTY_OFF,
  DeviceAttributesInterfaceStatuses.JSON_PROPERTY_UP,
  DeviceAttributesInterfaceStatuses.JSON_PROPERTY_WARNING
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeviceAttributesInterfaceStatuses {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DOWN = "down";
  private Long down;

  public static final String JSON_PROPERTY_OFF = "off";
  private Long off;

  public static final String JSON_PROPERTY_UP = "up";
  private Long up;

  public static final String JSON_PROPERTY_WARNING = "warning";
  private Long warning;

  public DeviceAttributesInterfaceStatuses down(Long down) {
    this.down = down;
    return this;
  }

  /**
   * The number of interfaces that are down
   *
   * @return down
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDown() {
    return down;
  }

  public void setDown(Long down) {
    this.down = down;
  }

  public DeviceAttributesInterfaceStatuses off(Long off) {
    this.off = off;
    return this;
  }

  /**
   * The number of interfaces that are off
   *
   * @return off
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOff() {
    return off;
  }

  public void setOff(Long off) {
    this.off = off;
  }

  public DeviceAttributesInterfaceStatuses up(Long up) {
    this.up = up;
    return this;
  }

  /**
   * The number of interfaces that are up
   *
   * @return up
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUp() {
    return up;
  }

  public void setUp(Long up) {
    this.up = up;
  }

  public DeviceAttributesInterfaceStatuses warning(Long warning) {
    this.warning = warning;
    return this;
  }

  /**
   * The number of interfaces that are in a warning state
   *
   * @return warning
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getWarning() {
    return warning;
  }

  public void setWarning(Long warning) {
    this.warning = warning;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return DeviceAttributesInterfaceStatuses
   */
  @JsonAnySetter
  public DeviceAttributesInterfaceStatuses putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this DeviceAttributesInterfaceStatuses object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceAttributesInterfaceStatuses deviceAttributesInterfaceStatuses =
        (DeviceAttributesInterfaceStatuses) o;
    return Objects.equals(this.down, deviceAttributesInterfaceStatuses.down)
        && Objects.equals(this.off, deviceAttributesInterfaceStatuses.off)
        && Objects.equals(this.up, deviceAttributesInterfaceStatuses.up)
        && Objects.equals(this.warning, deviceAttributesInterfaceStatuses.warning)
        && Objects.equals(
            this.additionalProperties, deviceAttributesInterfaceStatuses.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(down, off, up, warning, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAttributesInterfaceStatuses {\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
    sb.append("    off: ").append(toIndentedString(off)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
