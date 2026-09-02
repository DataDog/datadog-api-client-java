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

/** A notification target that receives change alerts for a feature flag. */
@JsonPropertyOrder({
  NotificationRuleTarget.JSON_PROPERTY_CONFIGURATION,
  NotificationRuleTarget.JSON_PROPERTY_TYPE,
  NotificationRuleTarget.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotificationRuleTarget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private NotificationRuleTargetConfiguration configuration;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NotificationRuleTargetType type;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public NotificationRuleTarget() {}

  @JsonCreator
  public NotificationRuleTarget(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIGURATION)
          NotificationRuleTargetConfiguration configuration,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) NotificationRuleTargetType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.configuration = configuration;
    this.unparsed |= configuration.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.version = version;
  }

  public NotificationRuleTarget configuration(NotificationRuleTargetConfiguration configuration) {
    this.configuration = configuration;
    this.unparsed |= configuration.unparsed;
    return this;
  }

  /**
   * Configuration for a notification target. Which fields apply depends on the target's <code>type
   * </code>.
   *
   * @return configuration
   */
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotificationRuleTargetConfiguration getConfiguration() {
    return configuration;
  }

  public void setConfiguration(NotificationRuleTargetConfiguration configuration) {
    this.configuration = configuration;
    if (configuration != null) {
      this.unparsed |= configuration.unparsed;
    }
  }

  public NotificationRuleTarget type(NotificationRuleTargetType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of notification target.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotificationRuleTargetType getType() {
    return type;
  }

  public void setType(NotificationRuleTargetType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public NotificationRuleTarget version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Schema version of <code>configuration</code>.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return NotificationRuleTarget
   */
  @JsonAnySetter
  public NotificationRuleTarget putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NotificationRuleTarget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRuleTarget notificationRuleTarget = (NotificationRuleTarget) o;
    return Objects.equals(this.configuration, notificationRuleTarget.configuration)
        && Objects.equals(this.type, notificationRuleTarget.type)
        && Objects.equals(this.version, notificationRuleTarget.version)
        && Objects.equals(this.additionalProperties, notificationRuleTarget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuration, type, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRuleTarget {\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
