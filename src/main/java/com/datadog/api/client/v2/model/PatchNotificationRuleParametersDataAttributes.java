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

/**
 * Attributes of the notification rule patch request. It is required to update the version of the
 * rule when patching it.
 */
@JsonPropertyOrder({
  PatchNotificationRuleParametersDataAttributes.JSON_PROPERTY_ENABLED,
  PatchNotificationRuleParametersDataAttributes.JSON_PROPERTY_NAME,
  PatchNotificationRuleParametersDataAttributes.JSON_PROPERTY_SELECTORS,
  PatchNotificationRuleParametersDataAttributes.JSON_PROPERTY_TARGETS,
  PatchNotificationRuleParametersDataAttributes.JSON_PROPERTY_TIME_AGGREGATION,
  PatchNotificationRuleParametersDataAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PatchNotificationRuleParametersDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SELECTORS = "selectors";
  private Selectors selectors;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private List<String> targets = null;

  public static final String JSON_PROPERTY_TIME_AGGREGATION = "time_aggregation";
  private Long timeAggregation;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public PatchNotificationRuleParametersDataAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Field used to enable or disable the rule.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public PatchNotificationRuleParametersDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the notification rule.
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

  public PatchNotificationRuleParametersDataAttributes selectors(Selectors selectors) {
    this.selectors = selectors;
    this.unparsed |= selectors.unparsed;
    return this;
  }

  /**
   * Selectors are used to filter security issues for which notifications should be generated. Users
   * can specify rule severities, rule types, a query to filter security issues on tags and
   * attributes, and the trigger source. Only the trigger_source field is required.
   *
   * @return selectors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Selectors getSelectors() {
    return selectors;
  }

  public void setSelectors(Selectors selectors) {
    this.selectors = selectors;
  }

  public PatchNotificationRuleParametersDataAttributes targets(List<String> targets) {
    this.targets = targets;
    return this;
  }

  public PatchNotificationRuleParametersDataAttributes addTargetsItem(String targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * List of recipients to notify when a notification rule is triggered. Many different target types
   * are supported, such as email addresses, Slack channels, and PagerDuty services. The appropriate
   * integrations need to be properly configured to send notifications to the specified targets.
   *
   * @return targets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTargets() {
    return targets;
  }

  public void setTargets(List<String> targets) {
    this.targets = targets;
  }

  public PatchNotificationRuleParametersDataAttributes timeAggregation(Long timeAggregation) {
    this.timeAggregation = timeAggregation;
    return this;
  }

  /**
   * Time aggregation period (in seconds) is used to aggregate the results of the notification rule
   * evaluation. Results are aggregated over a selected time frame using a rolling window, which
   * updates with each new evaluation. Notifications are only sent for new issues discovered during
   * the window. Time aggregation is only available for vulnerability-based notification rules. When
   * omitted or set to 0, no aggregation is done.
   *
   * @return timeAggregation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeAggregation() {
    return timeAggregation;
  }

  public void setTimeAggregation(Long timeAggregation) {
    this.timeAggregation = timeAggregation;
  }

  public PatchNotificationRuleParametersDataAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the notification rule. It is updated when the rule is modified.
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
   * @return PatchNotificationRuleParametersDataAttributes
   */
  @JsonAnySetter
  public PatchNotificationRuleParametersDataAttributes putAdditionalProperty(
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

  /** Return true if this PatchNotificationRuleParametersDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchNotificationRuleParametersDataAttributes patchNotificationRuleParametersDataAttributes =
        (PatchNotificationRuleParametersDataAttributes) o;
    return Objects.equals(this.enabled, patchNotificationRuleParametersDataAttributes.enabled)
        && Objects.equals(this.name, patchNotificationRuleParametersDataAttributes.name)
        && Objects.equals(this.selectors, patchNotificationRuleParametersDataAttributes.selectors)
        && Objects.equals(this.targets, patchNotificationRuleParametersDataAttributes.targets)
        && Objects.equals(
            this.timeAggregation, patchNotificationRuleParametersDataAttributes.timeAggregation)
        && Objects.equals(this.version, patchNotificationRuleParametersDataAttributes.version)
        && Objects.equals(
            this.additionalProperties,
            patchNotificationRuleParametersDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        enabled, name, selectors, targets, timeAggregation, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchNotificationRuleParametersDataAttributes {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    timeAggregation: ").append(toIndentedString(timeAggregation)).append("\n");
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
