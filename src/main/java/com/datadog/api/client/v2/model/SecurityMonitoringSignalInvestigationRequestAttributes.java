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

/** Attributes for creating a signal investigation. */
@JsonPropertyOrder({
  SecurityMonitoringSignalInvestigationRequestAttributes.JSON_PROPERTY_DEPLOYMENT,
  SecurityMonitoringSignalInvestigationRequestAttributes.JSON_PROPERTY_SIGNAL_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalInvestigationRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEPLOYMENT = "deployment";
  private String deployment;

  public static final String JSON_PROPERTY_SIGNAL_ID = "signal_id";
  private String signalId;

  public SecurityMonitoringSignalInvestigationRequestAttributes() {}

  @JsonCreator
  public SecurityMonitoringSignalInvestigationRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNAL_ID) String signalId) {
    this.signalId = signalId;
  }

  public SecurityMonitoringSignalInvestigationRequestAttributes deployment(String deployment) {
    this.deployment = deployment;
    return this;
  }

  /**
   * Optional deployment override for the investigation.
   *
   * @return deployment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDeployment() {
    return deployment;
  }

  public void setDeployment(String deployment) {
    this.deployment = deployment;
  }

  public SecurityMonitoringSignalInvestigationRequestAttributes signalId(String signalId) {
    this.signalId = signalId;
    return this;
  }

  /**
   * The unique ID of the security signal.
   *
   * @return signalId
   */
  @JsonProperty(JSON_PROPERTY_SIGNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSignalId() {
    return signalId;
  }

  public void setSignalId(String signalId) {
    this.signalId = signalId;
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
   * @return SecurityMonitoringSignalInvestigationRequestAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringSignalInvestigationRequestAttributes putAdditionalProperty(
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
   * Return true if this SecurityMonitoringSignalInvestigationRequestAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalInvestigationRequestAttributes
        securityMonitoringSignalInvestigationRequestAttributes =
            (SecurityMonitoringSignalInvestigationRequestAttributes) o;
    return Objects.equals(
            this.deployment, securityMonitoringSignalInvestigationRequestAttributes.deployment)
        && Objects.equals(
            this.signalId, securityMonitoringSignalInvestigationRequestAttributes.signalId)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalInvestigationRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployment, signalId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalInvestigationRequestAttributes {\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
    sb.append("    signalId: ").append(toIndentedString(signalId)).append("\n");
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
