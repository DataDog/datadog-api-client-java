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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for setting up rules. */
@JsonPropertyOrder({SetupRulesRequestAttributes.JSON_PROPERTY_DISABLED_DEFAULT_RULES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SetupRulesRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISABLED_DEFAULT_RULES = "disabled_default_rules";
  private List<String> disabledDefaultRules = null;

  public SetupRulesRequestAttributes disabledDefaultRules(List<String> disabledDefaultRules) {
    this.disabledDefaultRules = disabledDefaultRules;
    return this;
  }

  public SetupRulesRequestAttributes addDisabledDefaultRulesItem(String disabledDefaultRulesItem) {
    if (this.disabledDefaultRules == null) {
      this.disabledDefaultRules = new ArrayList<>();
    }
    this.disabledDefaultRules.add(disabledDefaultRulesItem);
    return this;
  }

  /**
   * Array of default rule IDs to disable.
   *
   * @return disabledDefaultRules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED_DEFAULT_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDisabledDefaultRules() {
    return disabledDefaultRules;
  }

  public void setDisabledDefaultRules(List<String> disabledDefaultRules) {
    this.disabledDefaultRules = disabledDefaultRules;
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
   * @return SetupRulesRequestAttributes
   */
  @JsonAnySetter
  public SetupRulesRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SetupRulesRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetupRulesRequestAttributes setupRulesRequestAttributes = (SetupRulesRequestAttributes) o;
    return Objects.equals(
            this.disabledDefaultRules, setupRulesRequestAttributes.disabledDefaultRules)
        && Objects.equals(
            this.additionalProperties, setupRulesRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabledDefaultRules, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetupRulesRequestAttributes {\n");
    sb.append("    disabledDefaultRules: ")
        .append(toIndentedString(disabledDefaultRules))
        .append("\n");
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
