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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of a scanning group of a target. */
@JsonPropertyOrder({
  SensitiveDataScannerTargetGroupAttributes.JSON_PROPERTY_DESCRIPTION,
  SensitiveDataScannerTargetGroupAttributes.JSON_PROPERTY_IS_ENABLED,
  SensitiveDataScannerTargetGroupAttributes.JSON_PROPERTY_NAME,
  SensitiveDataScannerTargetGroupAttributes.JSON_PROPERTY_TARGETS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerTargetGroupAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private List<SensitiveDataScannerGroupTarget> targets = new ArrayList<>();

  public SensitiveDataScannerTargetGroupAttributes() {}

  @JsonCreator
  public SensitiveDataScannerTargetGroupAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_ENABLED) Boolean isEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGETS)
          List<SensitiveDataScannerGroupTarget> targets) {
    this.description = description;
    this.isEnabled = isEnabled;
    this.name = name;
    this.targets = targets;
    for (SensitiveDataScannerGroupTarget item : targets) {
      this.unparsed |= item.unparsed;
    }
  }

  public SensitiveDataScannerTargetGroupAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the group.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SensitiveDataScannerTargetGroupAttributes isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the group is enabled.
   *
   * @return isEnabled
   */
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public SensitiveDataScannerTargetGroupAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the group.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SensitiveDataScannerTargetGroupAttributes targets(
      List<SensitiveDataScannerGroupTarget> targets) {
    this.targets = targets;
    for (SensitiveDataScannerGroupTarget item : targets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SensitiveDataScannerTargetGroupAttributes addTargetsItem(
      SensitiveDataScannerGroupTarget targetsItem) {
    this.targets.add(targetsItem);
    this.unparsed |= targetsItem.unparsed;
    return this;
  }

  /**
   * Targets the scanning group applies to. A scanning group has a single target for now.
   *
   * @return targets
   */
  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SensitiveDataScannerGroupTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<SensitiveDataScannerGroupTarget> targets) {
    this.targets = targets;
    if (targets != null) {
      for (SensitiveDataScannerGroupTarget item : targets) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return SensitiveDataScannerTargetGroupAttributes
   */
  @JsonAnySetter
  public SensitiveDataScannerTargetGroupAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SensitiveDataScannerTargetGroupAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerTargetGroupAttributes sensitiveDataScannerTargetGroupAttributes =
        (SensitiveDataScannerTargetGroupAttributes) o;
    return Objects.equals(this.description, sensitiveDataScannerTargetGroupAttributes.description)
        && Objects.equals(this.isEnabled, sensitiveDataScannerTargetGroupAttributes.isEnabled)
        && Objects.equals(this.name, sensitiveDataScannerTargetGroupAttributes.name)
        && Objects.equals(this.targets, sensitiveDataScannerTargetGroupAttributes.targets)
        && Objects.equals(
            this.additionalProperties,
            sensitiveDataScannerTargetGroupAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isEnabled, name, targets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerTargetGroupAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
