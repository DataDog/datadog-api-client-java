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

/** Attributes of a notification rule to be created. */
@JsonPropertyOrder({
  SecurityMonitoringNotificationRuleCreateAttributes.JSON_PROPERTY_ENABLED,
  SecurityMonitoringNotificationRuleCreateAttributes.JSON_PROPERTY_NAME,
  SecurityMonitoringNotificationRuleCreateAttributes.JSON_PROPERTY_SELECTORS,
  SecurityMonitoringNotificationRuleCreateAttributes.JSON_PROPERTY_TARGETS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringNotificationRuleCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SELECTORS = "selectors";
  private SecurityMonitoringNotificationRuleSelectors selectors;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private List<String> targets = new ArrayList<>();

  public SecurityMonitoringNotificationRuleCreateAttributes() {}

  @JsonCreator
  public SecurityMonitoringNotificationRuleCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SELECTORS)
          SecurityMonitoringNotificationRuleSelectors selectors,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGETS) List<String> targets) {
    this.enabled = enabled;
    this.name = name;
    this.selectors = selectors;
    this.unparsed |= selectors.unparsed;
    this.targets = targets;
  }

  public SecurityMonitoringNotificationRuleCreateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the notification rule is enabled.
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

  public SecurityMonitoringNotificationRuleCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the notification rule.
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

  public SecurityMonitoringNotificationRuleCreateAttributes selectors(
      SecurityMonitoringNotificationRuleSelectors selectors) {
    this.selectors = selectors;
    this.unparsed |= selectors.unparsed;
    return this;
  }

  /**
   * Selectors describing the notification rule.
   *
   * @return selectors
   */
  @JsonProperty(JSON_PROPERTY_SELECTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringNotificationRuleSelectors getSelectors() {
    return selectors;
  }

  public void setSelectors(SecurityMonitoringNotificationRuleSelectors selectors) {
    this.selectors = selectors;
  }

  public SecurityMonitoringNotificationRuleCreateAttributes targets(List<String> targets) {
    this.targets = targets;
    return this;
  }

  public SecurityMonitoringNotificationRuleCreateAttributes addTargetsItem(String targetsItem) {
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Set of targets to notify.
   *
   * @return targets
   */
  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTargets() {
    return targets;
  }

  public void setTargets(List<String> targets) {
    this.targets = targets;
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
   * @return SecurityMonitoringNotificationRuleCreateAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringNotificationRuleCreateAttributes putAdditionalProperty(
      String key, Object value) {
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

  /**
   * Return true if this SecurityMonitoringNotificationRuleCreateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringNotificationRuleCreateAttributes
        securityMonitoringNotificationRuleCreateAttributes =
            (SecurityMonitoringNotificationRuleCreateAttributes) o;
    return Objects.equals(this.enabled, securityMonitoringNotificationRuleCreateAttributes.enabled)
        && Objects.equals(this.name, securityMonitoringNotificationRuleCreateAttributes.name)
        && Objects.equals(
            this.selectors, securityMonitoringNotificationRuleCreateAttributes.selectors)
        && Objects.equals(this.targets, securityMonitoringNotificationRuleCreateAttributes.targets)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringNotificationRuleCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, name, selectors, targets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringNotificationRuleCreateAttributes {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
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
