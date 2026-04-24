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

/** Device information for the test result (browser and mobile tests). */
@JsonPropertyOrder({
  SyntheticsTestResultDevice.JSON_PROPERTY_BROWSER,
  SyntheticsTestResultDevice.JSON_PROPERTY_ID,
  SyntheticsTestResultDevice.JSON_PROPERTY_NAME,
  SyntheticsTestResultDevice.JSON_PROPERTY_PLATFORM,
  SyntheticsTestResultDevice.JSON_PROPERTY_RESOLUTION,
  SyntheticsTestResultDevice.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultDevice {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BROWSER = "browser";
  private SyntheticsTestResultDeviceBrowser browser;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private SyntheticsTestResultDevicePlatform platform;

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private SyntheticsTestResultDeviceResolution resolution;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SyntheticsTestResultDevice browser(SyntheticsTestResultDeviceBrowser browser) {
    this.browser = browser;
    this.unparsed |= browser.unparsed;
    return this;
  }

  /**
   * Browser information for the device used to run the test.
   *
   * @return browser
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BROWSER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultDeviceBrowser getBrowser() {
    return browser;
  }

  public void setBrowser(SyntheticsTestResultDeviceBrowser browser) {
    this.browser = browser;
  }

  public SyntheticsTestResultDevice id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Device identifier.
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

  public SyntheticsTestResultDevice name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Device name.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsTestResultDevice platform(SyntheticsTestResultDevicePlatform platform) {
    this.platform = platform;
    this.unparsed |= platform.unparsed;
    return this;
  }

  /**
   * Platform information for the device used to run the test.
   *
   * @return platform
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultDevicePlatform getPlatform() {
    return platform;
  }

  public void setPlatform(SyntheticsTestResultDevicePlatform platform) {
    this.platform = platform;
  }

  public SyntheticsTestResultDevice resolution(SyntheticsTestResultDeviceResolution resolution) {
    this.resolution = resolution;
    this.unparsed |= resolution.unparsed;
    return this;
  }

  /**
   * Screen resolution of the device used to run the test.
   *
   * @return resolution
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultDeviceResolution getResolution() {
    return resolution;
  }

  public void setResolution(SyntheticsTestResultDeviceResolution resolution) {
    this.resolution = resolution;
  }

  public SyntheticsTestResultDevice type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Device type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return SyntheticsTestResultDevice
   */
  @JsonAnySetter
  public SyntheticsTestResultDevice putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultDevice object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultDevice syntheticsTestResultDevice = (SyntheticsTestResultDevice) o;
    return Objects.equals(this.browser, syntheticsTestResultDevice.browser)
        && Objects.equals(this.id, syntheticsTestResultDevice.id)
        && Objects.equals(this.name, syntheticsTestResultDevice.name)
        && Objects.equals(this.platform, syntheticsTestResultDevice.platform)
        && Objects.equals(this.resolution, syntheticsTestResultDevice.resolution)
        && Objects.equals(this.type, syntheticsTestResultDevice.type)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultDevice.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browser, id, name, platform, resolution, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultDevice {\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
