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

/** A sensitive data finding detected by the SDS scanner. */
@JsonPropertyOrder({
  AIGuardSdsFinding.JSON_PROPERTY_CATEGORY,
  AIGuardSdsFinding.JSON_PROPERTY_LOCATION,
  AIGuardSdsFinding.JSON_PROPERTY_RULE_DISPLAY_NAME,
  AIGuardSdsFinding.JSON_PROPERTY_RULE_TAG
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardSdsFinding {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private AIGuardSdsFindingLocation location;

  public static final String JSON_PROPERTY_RULE_DISPLAY_NAME = "rule_display_name";
  private String ruleDisplayName;

  public static final String JSON_PROPERTY_RULE_TAG = "rule_tag";
  private String ruleTag;

  public AIGuardSdsFinding() {}

  @JsonCreator
  public AIGuardSdsFinding(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) String category,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOCATION)
          AIGuardSdsFindingLocation location,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_DISPLAY_NAME)
          String ruleDisplayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_TAG) String ruleTag) {
    this.category = category;
    this.location = location;
    this.unparsed |= location.unparsed;
    this.ruleDisplayName = ruleDisplayName;
    this.ruleTag = ruleTag;
  }

  public AIGuardSdsFinding category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of sensitive data detected.
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public AIGuardSdsFinding location(AIGuardSdsFindingLocation location) {
    this.location = location;
    this.unparsed |= location.unparsed;
    return this;
  }

  /**
   * The location of a sensitive data match within the evaluated request.
   *
   * @return location
   */
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AIGuardSdsFindingLocation getLocation() {
    return location;
  }

  public void setLocation(AIGuardSdsFindingLocation location) {
    this.location = location;
  }

  public AIGuardSdsFinding ruleDisplayName(String ruleDisplayName) {
    this.ruleDisplayName = ruleDisplayName;
    return this;
  }

  /**
   * The human-readable name of the SDS rule that triggered.
   *
   * @return ruleDisplayName
   */
  @JsonProperty(JSON_PROPERTY_RULE_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleDisplayName() {
    return ruleDisplayName;
  }

  public void setRuleDisplayName(String ruleDisplayName) {
    this.ruleDisplayName = ruleDisplayName;
  }

  public AIGuardSdsFinding ruleTag(String ruleTag) {
    this.ruleTag = ruleTag;
    return this;
  }

  /**
   * The tag identifier of the SDS rule that triggered.
   *
   * @return ruleTag
   */
  @JsonProperty(JSON_PROPERTY_RULE_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleTag() {
    return ruleTag;
  }

  public void setRuleTag(String ruleTag) {
    this.ruleTag = ruleTag;
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
   * @return AIGuardSdsFinding
   */
  @JsonAnySetter
  public AIGuardSdsFinding putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AIGuardSdsFinding object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGuardSdsFinding aiGuardSdsFinding = (AIGuardSdsFinding) o;
    return Objects.equals(this.category, aiGuardSdsFinding.category)
        && Objects.equals(this.location, aiGuardSdsFinding.location)
        && Objects.equals(this.ruleDisplayName, aiGuardSdsFinding.ruleDisplayName)
        && Objects.equals(this.ruleTag, aiGuardSdsFinding.ruleTag)
        && Objects.equals(this.additionalProperties, aiGuardSdsFinding.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, location, ruleDisplayName, ruleTag, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIGuardSdsFinding {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    ruleDisplayName: ").append(toIndentedString(ruleDisplayName)).append("\n");
    sb.append("    ruleTag: ").append(toIndentedString(ruleTag)).append("\n");
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
