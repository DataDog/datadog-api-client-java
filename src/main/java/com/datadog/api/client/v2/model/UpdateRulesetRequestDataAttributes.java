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

/** The definition of <code>UpdateRulesetRequestDataAttributes</code> object. */
@JsonPropertyOrder({
  UpdateRulesetRequestDataAttributes.JSON_PROPERTY_ENABLED,
  UpdateRulesetRequestDataAttributes.JSON_PROPERTY_LAST_VERSION,
  UpdateRulesetRequestDataAttributes.JSON_PROPERTY_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateRulesetRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_LAST_VERSION = "last_version";
  private Long lastVersion;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<UpdateRulesetRequestDataAttributesRulesItems> rules = new ArrayList<>();

  public UpdateRulesetRequestDataAttributes() {}

  @JsonCreator
  public UpdateRulesetRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULES)
          List<UpdateRulesetRequestDataAttributesRulesItems> rules) {
    this.enabled = enabled;
    this.rules = rules;
  }

  public UpdateRulesetRequestDataAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * The <code>attributes</code> <code>enabled</code>.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public UpdateRulesetRequestDataAttributes lastVersion(Long lastVersion) {
    this.lastVersion = lastVersion;
    return this;
  }

  /**
   * The <code>attributes</code> <code>last_version</code>.
   *
   * @return lastVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastVersion() {
    return lastVersion;
  }

  public void setLastVersion(Long lastVersion) {
    this.lastVersion = lastVersion;
  }

  public UpdateRulesetRequestDataAttributes rules(
      List<UpdateRulesetRequestDataAttributesRulesItems> rules) {
    this.rules = rules;
    for (UpdateRulesetRequestDataAttributesRulesItems item : rules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UpdateRulesetRequestDataAttributes addRulesItem(
      UpdateRulesetRequestDataAttributesRulesItems rulesItem) {
    this.rules.add(rulesItem);
    this.unparsed |= rulesItem.unparsed;
    return this;
  }

  /**
   * The <code>attributes</code> <code>rules</code>.
   *
   * @return rules
   */
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<UpdateRulesetRequestDataAttributesRulesItems> getRules() {
    return rules;
  }

  public void setRules(List<UpdateRulesetRequestDataAttributesRulesItems> rules) {
    this.rules = rules;
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
   * @return UpdateRulesetRequestDataAttributes
   */
  @JsonAnySetter
  public UpdateRulesetRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpdateRulesetRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRulesetRequestDataAttributes updateRulesetRequestDataAttributes =
        (UpdateRulesetRequestDataAttributes) o;
    return Objects.equals(this.enabled, updateRulesetRequestDataAttributes.enabled)
        && Objects.equals(this.lastVersion, updateRulesetRequestDataAttributes.lastVersion)
        && Objects.equals(this.rules, updateRulesetRequestDataAttributes.rules)
        && Objects.equals(
            this.additionalProperties, updateRulesetRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, lastVersion, rules, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRulesetRequestDataAttributes {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    lastVersion: ").append(toIndentedString(lastVersion)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
