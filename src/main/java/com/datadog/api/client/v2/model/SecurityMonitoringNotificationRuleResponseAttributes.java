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

/** Attributes of the notification rule. */
@JsonPropertyOrder({
  SecurityMonitoringNotificationRuleResponseAttributes.JSON_PROPERTY_CREATION_DATE,
  SecurityMonitoringNotificationRuleResponseAttributes.JSON_PROPERTY_CREATOR,
  SecurityMonitoringNotificationRuleResponseAttributes.JSON_PROPERTY_ENABLED,
  SecurityMonitoringNotificationRuleResponseAttributes.JSON_PROPERTY_NAME,
  SecurityMonitoringNotificationRuleResponseAttributes.JSON_PROPERTY_SELECTORS,
  SecurityMonitoringNotificationRuleResponseAttributes.JSON_PROPERTY_TARGETS,
  SecurityMonitoringNotificationRuleResponseAttributes.JSON_PROPERTY_UPDATE_DATE,
  SecurityMonitoringNotificationRuleResponseAttributes.JSON_PROPERTY_UPDATER,
  SecurityMonitoringNotificationRuleResponseAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringNotificationRuleResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATION_DATE = "creation_date";
  private Long creationDate;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private SecurityMonitoringCreator creator;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SELECTORS = "selectors";
  private SecurityMonitoringNotificationRuleSelectors selectors;

  public static final String JSON_PROPERTY_TARGETS = "targets";
  private List<String> targets = null;

  public static final String JSON_PROPERTY_UPDATE_DATE = "update_date";
  private Long updateDate;

  public static final String JSON_PROPERTY_UPDATER = "updater";
  private SecurityMonitoringUpdater updater;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public SecurityMonitoringNotificationRuleResponseAttributes creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Timestamp of creation of the notification rule in milliseconds.
   *
   * @return creationDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public SecurityMonitoringNotificationRuleResponseAttributes creator(
      SecurityMonitoringCreator creator) {
    this.creator = creator;
    this.unparsed |= creator.unparsed;
    return this;
  }

  /**
   * The author of the notification rule.
   *
   * @return creator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringCreator getCreator() {
    return creator;
  }

  public void setCreator(SecurityMonitoringCreator creator) {
    this.creator = creator;
  }

  public SecurityMonitoringNotificationRuleResponseAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the notification rule is enabled.
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

  public SecurityMonitoringNotificationRuleResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the notification rule.
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

  public SecurityMonitoringNotificationRuleResponseAttributes selectors(
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringNotificationRuleSelectors getSelectors() {
    return selectors;
  }

  public void setSelectors(SecurityMonitoringNotificationRuleSelectors selectors) {
    this.selectors = selectors;
  }

  public SecurityMonitoringNotificationRuleResponseAttributes targets(List<String> targets) {
    this.targets = targets;
    return this;
  }

  public SecurityMonitoringNotificationRuleResponseAttributes addTargetsItem(String targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Set of targets to notify.
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

  public SecurityMonitoringNotificationRuleResponseAttributes updateDate(Long updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Timestamp of last modification of the notification rule in milliseconds.
   *
   * @return updateDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Long updateDate) {
    this.updateDate = updateDate;
  }

  public SecurityMonitoringNotificationRuleResponseAttributes updater(
      SecurityMonitoringUpdater updater) {
    this.updater = updater;
    this.unparsed |= updater.unparsed;
    return this;
  }

  /**
   * The editor of the notification rule.
   *
   * @return updater
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringUpdater getUpdater() {
    return updater;
  }

  public void setUpdater(SecurityMonitoringUpdater updater) {
    this.updater = updater;
  }

  public SecurityMonitoringNotificationRuleResponseAttributes version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the rule being updated. maximum: 2147483647
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
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
   * @return SecurityMonitoringNotificationRuleResponseAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringNotificationRuleResponseAttributes putAdditionalProperty(
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
   * Return true if this SecurityMonitoringNotificationRuleResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringNotificationRuleResponseAttributes
        securityMonitoringNotificationRuleResponseAttributes =
            (SecurityMonitoringNotificationRuleResponseAttributes) o;
    return Objects.equals(
            this.creationDate, securityMonitoringNotificationRuleResponseAttributes.creationDate)
        && Objects.equals(
            this.creator, securityMonitoringNotificationRuleResponseAttributes.creator)
        && Objects.equals(
            this.enabled, securityMonitoringNotificationRuleResponseAttributes.enabled)
        && Objects.equals(this.name, securityMonitoringNotificationRuleResponseAttributes.name)
        && Objects.equals(
            this.selectors, securityMonitoringNotificationRuleResponseAttributes.selectors)
        && Objects.equals(
            this.targets, securityMonitoringNotificationRuleResponseAttributes.targets)
        && Objects.equals(
            this.updateDate, securityMonitoringNotificationRuleResponseAttributes.updateDate)
        && Objects.equals(
            this.updater, securityMonitoringNotificationRuleResponseAttributes.updater)
        && Objects.equals(
            this.version, securityMonitoringNotificationRuleResponseAttributes.version)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringNotificationRuleResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationDate,
        creator,
        enabled,
        name,
        selectors,
        targets,
        updateDate,
        updater,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringNotificationRuleResponseAttributes {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
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
