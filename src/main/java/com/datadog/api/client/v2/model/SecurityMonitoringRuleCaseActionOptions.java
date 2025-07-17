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

/** Options for the rule action */
@JsonPropertyOrder({
  SecurityMonitoringRuleCaseActionOptions.JSON_PROPERTY_DURATION,
  SecurityMonitoringRuleCaseActionOptions.JSON_PROPERTY_FLAGGED_IP_TYPE,
  SecurityMonitoringRuleCaseActionOptions.JSON_PROPERTY_USER_BEHAVIOR_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleCaseActionOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_FLAGGED_IP_TYPE = "flaggedIPType";
  private SecurityMonitoringRuleCaseActionOptionsFlaggedIPType flaggedIpType;

  public static final String JSON_PROPERTY_USER_BEHAVIOR_NAME = "userBehaviorName";
  private String userBehaviorName;

  public SecurityMonitoringRuleCaseActionOptions duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of the action in seconds. 0 indicates no expiration. minimum: 0
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public SecurityMonitoringRuleCaseActionOptions flaggedIpType(
      SecurityMonitoringRuleCaseActionOptionsFlaggedIPType flaggedIpType) {
    this.flaggedIpType = flaggedIpType;
    this.unparsed |= !flaggedIpType.isValid();
    return this;
  }

  /**
   * Used with the case action of type 'flag_ip'. The value specified in this field is applied as a
   * flag to the IP addresses.
   *
   * @return flaggedIpType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLAGGED_IP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleCaseActionOptionsFlaggedIPType getFlaggedIpType() {
    return flaggedIpType;
  }

  public void setFlaggedIpType(SecurityMonitoringRuleCaseActionOptionsFlaggedIPType flaggedIpType) {
    if (!flaggedIpType.isValid()) {
      this.unparsed = true;
    }
    this.flaggedIpType = flaggedIpType;
  }

  public SecurityMonitoringRuleCaseActionOptions userBehaviorName(String userBehaviorName) {
    this.userBehaviorName = userBehaviorName;
    return this;
  }

  /**
   * Used with the case action of type 'user_behavior'. The value specified in this field is applied
   * as a risk tag to all users affected by the rule.
   *
   * @return userBehaviorName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_BEHAVIOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserBehaviorName() {
    return userBehaviorName;
  }

  public void setUserBehaviorName(String userBehaviorName) {
    this.userBehaviorName = userBehaviorName;
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
   * @return SecurityMonitoringRuleCaseActionOptions
   */
  @JsonAnySetter
  public SecurityMonitoringRuleCaseActionOptions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringRuleCaseActionOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleCaseActionOptions securityMonitoringRuleCaseActionOptions =
        (SecurityMonitoringRuleCaseActionOptions) o;
    return Objects.equals(this.duration, securityMonitoringRuleCaseActionOptions.duration)
        && Objects.equals(this.flaggedIpType, securityMonitoringRuleCaseActionOptions.flaggedIpType)
        && Objects.equals(
            this.userBehaviorName, securityMonitoringRuleCaseActionOptions.userBehaviorName)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringRuleCaseActionOptions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, flaggedIpType, userBehaviorName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleCaseActionOptions {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    flaggedIpType: ").append(toIndentedString(flaggedIpType)).append("\n");
    sb.append("    userBehaviorName: ").append(toIndentedString(userBehaviorName)).append("\n");
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
