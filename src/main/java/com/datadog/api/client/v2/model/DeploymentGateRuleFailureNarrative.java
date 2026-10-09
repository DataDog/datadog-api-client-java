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

/** Faulty deployment detection narrative reference. */
@JsonPropertyOrder({
  DeploymentGateRuleFailureNarrative.JSON_PROPERTY_HOSTGROUP,
  DeploymentGateRuleFailureNarrative.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGateRuleFailureNarrative {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOSTGROUP = "hostgroup";
  private String hostgroup;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public DeploymentGateRuleFailureNarrative() {}

  @JsonCreator
  public DeploymentGateRuleFailureNarrative(
      @JsonProperty(required = true, value = JSON_PROPERTY_HOSTGROUP) String hostgroup,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id) {
    this.hostgroup = hostgroup;
    this.id = id;
  }

  public DeploymentGateRuleFailureNarrative hostgroup(String hostgroup) {
    this.hostgroup = hostgroup;
    return this;
  }

  /**
   * Host group associated with the narrative.
   *
   * @return hostgroup
   */
  @JsonProperty(JSON_PROPERTY_HOSTGROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHostgroup() {
    return hostgroup;
  }

  public void setHostgroup(String hostgroup) {
    this.hostgroup = hostgroup;
  }

  public DeploymentGateRuleFailureNarrative id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Narrative ID.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * @return DeploymentGateRuleFailureNarrative
   */
  @JsonAnySetter
  public DeploymentGateRuleFailureNarrative putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DeploymentGateRuleFailureNarrative object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGateRuleFailureNarrative deploymentGateRuleFailureNarrative =
        (DeploymentGateRuleFailureNarrative) o;
    return Objects.equals(this.hostgroup, deploymentGateRuleFailureNarrative.hostgroup)
        && Objects.equals(this.id, deploymentGateRuleFailureNarrative.id)
        && Objects.equals(
            this.additionalProperties, deploymentGateRuleFailureNarrative.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostgroup, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGateRuleFailureNarrative {\n");
    sb.append("    hostgroup: ").append(toIndentedString(hostgroup)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
