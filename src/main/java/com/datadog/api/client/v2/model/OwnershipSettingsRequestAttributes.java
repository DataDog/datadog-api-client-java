/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The attributes of an ownership settings request. */
@JsonPropertyOrder({
  OwnershipSettingsRequestAttributes.JSON_PROPERTY_AUTO_TAG,
  OwnershipSettingsRequestAttributes.JSON_PROPERTY_CONFIDENCE_LEVEL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OwnershipSettingsRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_TAG = "auto_tag";
  private Boolean autoTag;

  public static final String JSON_PROPERTY_CONFIDENCE_LEVEL = "confidence_level";
  private OwnershipConfidenceLevel confidenceLevel;

  public OwnershipSettingsRequestAttributes() {}

  @JsonCreator
  public OwnershipSettingsRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTO_TAG) Boolean autoTag,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIDENCE_LEVEL)
          OwnershipConfidenceLevel confidenceLevel) {
    this.autoTag = autoTag;
    this.confidenceLevel = confidenceLevel;
    this.unparsed |= !confidenceLevel.isValid();
  }

  public OwnershipSettingsRequestAttributes autoTag(Boolean autoTag) {
    this.autoTag = autoTag;
    return this;
  }

  /**
   * Whether automatic ownership tagging is enabled.
   *
   * @return autoTag
   */
  @JsonProperty(JSON_PROPERTY_AUTO_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getAutoTag() {
    return autoTag;
  }

  public void setAutoTag(Boolean autoTag) {
    this.autoTag = autoTag;
  }

  public OwnershipSettingsRequestAttributes confidenceLevel(
      OwnershipConfidenceLevel confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
    this.unparsed |= !confidenceLevel.isValid();
    return this;
  }

  /**
   * The ownership confidence level.
   *
   * @return confidenceLevel
   */
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OwnershipConfidenceLevel getConfidenceLevel() {
    return confidenceLevel;
  }

  public void setConfidenceLevel(OwnershipConfidenceLevel confidenceLevel) {
    if (!confidenceLevel.isValid()) {
      this.unparsed = true;
    }
    this.confidenceLevel = confidenceLevel;
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
   * @return OwnershipSettingsRequestAttributes
   */
  @JsonAnySetter
  public OwnershipSettingsRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OwnershipSettingsRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnershipSettingsRequestAttributes ownershipSettingsRequestAttributes =
        (OwnershipSettingsRequestAttributes) o;
    return Objects.equals(this.autoTag, ownershipSettingsRequestAttributes.autoTag)
        && Objects.equals(this.confidenceLevel, ownershipSettingsRequestAttributes.confidenceLevel)
        && Objects.equals(
            this.additionalProperties, ownershipSettingsRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTag, confidenceLevel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipSettingsRequestAttributes {\n");
    sb.append("    autoTag: ").append(toIndentedString(autoTag)).append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
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
