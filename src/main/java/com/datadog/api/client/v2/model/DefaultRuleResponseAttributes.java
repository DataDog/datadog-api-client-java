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

/** Default rule attributes. */
@JsonPropertyOrder({
  DefaultRuleResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  DefaultRuleResponseAttributes.JSON_PROPERTY_LEVEL,
  DefaultRuleResponseAttributes.JSON_PROPERTY_NAME,
  DefaultRuleResponseAttributes.JSON_PROPERTY_SCOPE_REQUIRED,
  DefaultRuleResponseAttributes.JSON_PROPERTY_SCORECARD_DESCRIPTION,
  DefaultRuleResponseAttributes.JSON_PROPERTY_SCORECARD_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DefaultRuleResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private Long level;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCOPE_REQUIRED = "scope_required";
  private String scopeRequired;

  public static final String JSON_PROPERTY_SCORECARD_DESCRIPTION = "scorecard_description";
  private String scorecardDescription;

  public static final String JSON_PROPERTY_SCORECARD_NAME = "scorecard_name";
  private String scorecardName;

  public DefaultRuleResponseAttributes() {}

  @JsonCreator
  public DefaultRuleResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCORECARD_NAME) String scorecardName) {
    this.name = name;
    this.scorecardName = scorecardName;
  }

  public DefaultRuleResponseAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the default rule.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DefaultRuleResponseAttributes level(Long level) {
    this.level = level;
    return this;
  }

  /**
   * The maturity level of the rule.
   *
   * @return level
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLevel() {
    return level;
  }

  public void setLevel(Long level) {
    this.level = level;
  }

  public DefaultRuleResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the default rule.
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

  public DefaultRuleResponseAttributes scopeRequired(String scopeRequired) {
    this.scopeRequired = scopeRequired;
    return this;
  }

  /**
   * Required scope for the rule.
   *
   * @return scopeRequired
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScopeRequired() {
    return scopeRequired;
  }

  public void setScopeRequired(String scopeRequired) {
    this.scopeRequired = scopeRequired;
  }

  public DefaultRuleResponseAttributes scorecardDescription(String scorecardDescription) {
    this.scorecardDescription = scorecardDescription;
    return this;
  }

  /**
   * The description of the scorecard.
   *
   * @return scorecardDescription
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORECARD_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScorecardDescription() {
    return scorecardDescription;
  }

  public void setScorecardDescription(String scorecardDescription) {
    this.scorecardDescription = scorecardDescription;
  }

  public DefaultRuleResponseAttributes scorecardName(String scorecardName) {
    this.scorecardName = scorecardName;
    return this;
  }

  /**
   * The scorecard this rule belongs to.
   *
   * @return scorecardName
   */
  @JsonProperty(JSON_PROPERTY_SCORECARD_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScorecardName() {
    return scorecardName;
  }

  public void setScorecardName(String scorecardName) {
    this.scorecardName = scorecardName;
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
   * @return DefaultRuleResponseAttributes
   */
  @JsonAnySetter
  public DefaultRuleResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DefaultRuleResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultRuleResponseAttributes defaultRuleResponseAttributes = (DefaultRuleResponseAttributes) o;
    return Objects.equals(this.description, defaultRuleResponseAttributes.description)
        && Objects.equals(this.level, defaultRuleResponseAttributes.level)
        && Objects.equals(this.name, defaultRuleResponseAttributes.name)
        && Objects.equals(this.scopeRequired, defaultRuleResponseAttributes.scopeRequired)
        && Objects.equals(
            this.scorecardDescription, defaultRuleResponseAttributes.scorecardDescription)
        && Objects.equals(this.scorecardName, defaultRuleResponseAttributes.scorecardName)
        && Objects.equals(
            this.additionalProperties, defaultRuleResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        level,
        name,
        scopeRequired,
        scorecardDescription,
        scorecardName,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultRuleResponseAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopeRequired: ").append(toIndentedString(scopeRequired)).append("\n");
    sb.append("    scorecardDescription: ")
        .append(toIndentedString(scorecardDescription))
        .append("\n");
    sb.append("    scorecardName: ").append(toIndentedString(scorecardName)).append("\n");
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
