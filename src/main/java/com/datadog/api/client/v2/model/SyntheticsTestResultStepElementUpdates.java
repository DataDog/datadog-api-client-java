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

/** Element locator updates produced during a step. */
@JsonPropertyOrder({
  SyntheticsTestResultStepElementUpdates.JSON_PROPERTY_MULTI_LOCATOR,
  SyntheticsTestResultStepElementUpdates.JSON_PROPERTY_TARGET_OUTER_HTML,
  SyntheticsTestResultStepElementUpdates.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultStepElementUpdates {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MULTI_LOCATOR = "multi_locator";
  private Map<String, String> multiLocator = null;

  public static final String JSON_PROPERTY_TARGET_OUTER_HTML = "target_outer_html";
  private String targetOuterHtml;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SyntheticsTestResultStepElementUpdates multiLocator(Map<String, String> multiLocator) {
    this.multiLocator = multiLocator;
    return this;
  }

  public SyntheticsTestResultStepElementUpdates putMultiLocatorItem(
      String key, String multiLocatorItem) {
    if (this.multiLocator == null) {
      this.multiLocator = new HashMap<>();
    }
    this.multiLocator.put(key, multiLocatorItem);
    return this;
  }

  /**
   * Updated multi-locator definition.
   *
   * @return multiLocator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTI_LOCATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getMultiLocator() {
    return multiLocator;
  }

  public void setMultiLocator(Map<String, String> multiLocator) {
    this.multiLocator = multiLocator;
  }

  public SyntheticsTestResultStepElementUpdates targetOuterHtml(String targetOuterHtml) {
    this.targetOuterHtml = targetOuterHtml;
    return this;
  }

  /**
   * Updated outer HTML of the targeted element.
   *
   * @return targetOuterHtml
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_OUTER_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTargetOuterHtml() {
    return targetOuterHtml;
  }

  public void setTargetOuterHtml(String targetOuterHtml) {
    this.targetOuterHtml = targetOuterHtml;
  }

  public SyntheticsTestResultStepElementUpdates version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the element locator definition.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return SyntheticsTestResultStepElementUpdates
   */
  @JsonAnySetter
  public SyntheticsTestResultStepElementUpdates putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultStepElementUpdates object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultStepElementUpdates syntheticsTestResultStepElementUpdates =
        (SyntheticsTestResultStepElementUpdates) o;
    return Objects.equals(this.multiLocator, syntheticsTestResultStepElementUpdates.multiLocator)
        && Objects.equals(
            this.targetOuterHtml, syntheticsTestResultStepElementUpdates.targetOuterHtml)
        && Objects.equals(this.version, syntheticsTestResultStepElementUpdates.version)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultStepElementUpdates.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiLocator, targetOuterHtml, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultStepElementUpdates {\n");
    sb.append("    multiLocator: ").append(toIndentedString(multiLocator)).append("\n");
    sb.append("    targetOuterHtml: ").append(toIndentedString(targetOuterHtml)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
