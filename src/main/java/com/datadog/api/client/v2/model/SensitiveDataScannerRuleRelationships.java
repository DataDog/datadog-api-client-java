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

/** Relationships of a scanning rule. */
@JsonPropertyOrder({
  SensitiveDataScannerRuleRelationships.JSON_PROPERTY_GROUP,
  SensitiveDataScannerRuleRelationships.JSON_PROPERTY_STANDARD_PATTERN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerRuleRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP = "group";
  private SensitiveDataScannerGroupData group;

  public static final String JSON_PROPERTY_STANDARD_PATTERN = "standard_pattern";
  private SensitiveDataScannerStandardPatternData standardPattern;

  public SensitiveDataScannerRuleRelationships group(SensitiveDataScannerGroupData group) {
    this.group = group;
    this.unparsed |= group.unparsed;
    return this;
  }

  /**
   * A scanning group data.
   *
   * @return group
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerGroupData getGroup() {
    return group;
  }

  public void setGroup(SensitiveDataScannerGroupData group) {
    this.group = group;
  }

  public SensitiveDataScannerRuleRelationships standardPattern(
      SensitiveDataScannerStandardPatternData standardPattern) {
    this.standardPattern = standardPattern;
    this.unparsed |= standardPattern.unparsed;
    return this;
  }

  /**
   * A standard pattern.
   *
   * @return standardPattern
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STANDARD_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerStandardPatternData getStandardPattern() {
    return standardPattern;
  }

  public void setStandardPattern(SensitiveDataScannerStandardPatternData standardPattern) {
    this.standardPattern = standardPattern;
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
   * @return SensitiveDataScannerRuleRelationships
   */
  @JsonAnySetter
  public SensitiveDataScannerRuleRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SensitiveDataScannerRuleRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerRuleRelationships sensitiveDataScannerRuleRelationships =
        (SensitiveDataScannerRuleRelationships) o;
    return Objects.equals(this.group, sensitiveDataScannerRuleRelationships.group)
        && Objects.equals(
            this.standardPattern, sensitiveDataScannerRuleRelationships.standardPattern)
        && Objects.equals(
            this.additionalProperties, sensitiveDataScannerRuleRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, standardPattern, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerRuleRelationships {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    standardPattern: ").append(toIndentedString(standardPattern)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
