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

/** Attributes for creating an enrollment. */
@JsonPropertyOrder({
  OnPremManagementServiceEnrollmentAttributes.JSON_PROPERTY_ACTIONS_ALLOWLIST,
  OnPremManagementServiceEnrollmentAttributes.JSON_PROPERTY_RUNNER_HOST,
  OnPremManagementServiceEnrollmentAttributes.JSON_PROPERTY_RUNNER_MODES,
  OnPremManagementServiceEnrollmentAttributes.JSON_PROPERTY_RUNNER_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnPremManagementServiceEnrollmentAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIONS_ALLOWLIST = "actions_allowlist";
  private List<String> actionsAllowlist = new ArrayList<>();

  public static final String JSON_PROPERTY_RUNNER_HOST = "runner_host";
  private String runnerHost;

  public static final String JSON_PROPERTY_RUNNER_MODES = "runner_modes";
  private List<OnPremManagementServiceEnrollmentAttributesRunnerModesItems> runnerModes =
      new ArrayList<>();

  public static final String JSON_PROPERTY_RUNNER_NAME = "runner_name";
  private String runnerName;

  public OnPremManagementServiceEnrollmentAttributes() {}

  @JsonCreator
  public OnPremManagementServiceEnrollmentAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTIONS_ALLOWLIST)
          List<String> actionsAllowlist,
      @JsonProperty(required = true, value = JSON_PROPERTY_RUNNER_MODES)
          List<OnPremManagementServiceEnrollmentAttributesRunnerModesItems> runnerModes,
      @JsonProperty(required = true, value = JSON_PROPERTY_RUNNER_NAME) String runnerName) {
    this.actionsAllowlist = actionsAllowlist;
    this.runnerModes = runnerModes;
    this.runnerName = runnerName;
  }

  public OnPremManagementServiceEnrollmentAttributes actionsAllowlist(
      List<String> actionsAllowlist) {
    this.actionsAllowlist = actionsAllowlist;
    return this;
  }

  public OnPremManagementServiceEnrollmentAttributes addActionsAllowlistItem(
      String actionsAllowlistItem) {
    this.actionsAllowlist.add(actionsAllowlistItem);
    return this;
  }

  /**
   * List of allowed actions for the runner.
   *
   * @return actionsAllowlist
   */
  @JsonProperty(JSON_PROPERTY_ACTIONS_ALLOWLIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getActionsAllowlist() {
    return actionsAllowlist;
  }

  public void setActionsAllowlist(List<String> actionsAllowlist) {
    this.actionsAllowlist = actionsAllowlist;
  }

  public OnPremManagementServiceEnrollmentAttributes runnerHost(String runnerHost) {
    this.runnerHost = runnerHost;
    return this;
  }

  /**
   * The hostname for the runner. Required when push mode is enabled.
   *
   * @return runnerHost
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUNNER_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRunnerHost() {
    return runnerHost;
  }

  public void setRunnerHost(String runnerHost) {
    this.runnerHost = runnerHost;
  }

  public OnPremManagementServiceEnrollmentAttributes runnerModes(
      List<OnPremManagementServiceEnrollmentAttributesRunnerModesItems> runnerModes) {
    this.runnerModes = runnerModes;
    return this;
  }

  public OnPremManagementServiceEnrollmentAttributes addRunnerModesItem(
      OnPremManagementServiceEnrollmentAttributesRunnerModesItems runnerModesItem) {
    this.runnerModes.add(runnerModesItem);
    this.unparsed |= !runnerModesItem.isValid();
    return this;
  }

  /**
   * The modes the runner should operate in.
   *
   * @return runnerModes
   */
  @JsonProperty(JSON_PROPERTY_RUNNER_MODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<OnPremManagementServiceEnrollmentAttributesRunnerModesItems> getRunnerModes() {
    return runnerModes;
  }

  public void setRunnerModes(
      List<OnPremManagementServiceEnrollmentAttributesRunnerModesItems> runnerModes) {
    this.runnerModes = runnerModes;
  }

  public OnPremManagementServiceEnrollmentAttributes runnerName(String runnerName) {
    this.runnerName = runnerName;
    return this;
  }

  /**
   * The name of the on-prem runner.
   *
   * @return runnerName
   */
  @JsonProperty(JSON_PROPERTY_RUNNER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRunnerName() {
    return runnerName;
  }

  public void setRunnerName(String runnerName) {
    this.runnerName = runnerName;
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
   * @return OnPremManagementServiceEnrollmentAttributes
   */
  @JsonAnySetter
  public OnPremManagementServiceEnrollmentAttributes putAdditionalProperty(
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

  /** Return true if this OnPremManagementServiceEnrollmentAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnPremManagementServiceEnrollmentAttributes onPremManagementServiceEnrollmentAttributes =
        (OnPremManagementServiceEnrollmentAttributes) o;
    return Objects.equals(
            this.actionsAllowlist, onPremManagementServiceEnrollmentAttributes.actionsAllowlist)
        && Objects.equals(this.runnerHost, onPremManagementServiceEnrollmentAttributes.runnerHost)
        && Objects.equals(this.runnerModes, onPremManagementServiceEnrollmentAttributes.runnerModes)
        && Objects.equals(this.runnerName, onPremManagementServiceEnrollmentAttributes.runnerName)
        && Objects.equals(
            this.additionalProperties,
            onPremManagementServiceEnrollmentAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionsAllowlist, runnerHost, runnerModes, runnerName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnPremManagementServiceEnrollmentAttributes {\n");
    sb.append("    actionsAllowlist: ").append(toIndentedString(actionsAllowlist)).append("\n");
    sb.append("    runnerHost: ").append(toIndentedString(runnerHost)).append("\n");
    sb.append("    runnerModes: ").append(toIndentedString(runnerModes)).append("\n");
    sb.append("    runnerName: ").append(toIndentedString(runnerName)).append("\n");
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
