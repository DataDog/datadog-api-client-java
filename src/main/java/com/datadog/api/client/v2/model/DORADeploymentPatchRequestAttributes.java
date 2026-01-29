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

/** Attributes for patching a DORA deployment event. */
@JsonPropertyOrder({
  DORADeploymentPatchRequestAttributes.JSON_PROPERTY_CHANGE_FAILURE,
  DORADeploymentPatchRequestAttributes.JSON_PROPERTY_REMEDIATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DORADeploymentPatchRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGE_FAILURE = "change_failure";
  private Boolean changeFailure;

  public static final String JSON_PROPERTY_REMEDIATION = "remediation";
  private DORADeploymentPatchRemediation remediation;

  public DORADeploymentPatchRequestAttributes changeFailure(Boolean changeFailure) {
    this.changeFailure = changeFailure;
    return this;
  }

  /**
   * Indicates whether the deployment resulted in a change failure.
   *
   * @return changeFailure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getChangeFailure() {
    return changeFailure;
  }

  public void setChangeFailure(Boolean changeFailure) {
    this.changeFailure = changeFailure;
  }

  public DORADeploymentPatchRequestAttributes remediation(
      DORADeploymentPatchRemediation remediation) {
    this.remediation = remediation;
    this.unparsed |= remediation.unparsed;
    return this;
  }

  /**
   * Remediation details for the deployment.
   *
   * @return remediation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMEDIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DORADeploymentPatchRemediation getRemediation() {
    return remediation;
  }

  public void setRemediation(DORADeploymentPatchRemediation remediation) {
    this.remediation = remediation;
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
   * @return DORADeploymentPatchRequestAttributes
   */
  @JsonAnySetter
  public DORADeploymentPatchRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DORADeploymentPatchRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DORADeploymentPatchRequestAttributes doraDeploymentPatchRequestAttributes =
        (DORADeploymentPatchRequestAttributes) o;
    return Objects.equals(this.changeFailure, doraDeploymentPatchRequestAttributes.changeFailure)
        && Objects.equals(this.remediation, doraDeploymentPatchRequestAttributes.remediation)
        && Objects.equals(
            this.additionalProperties, doraDeploymentPatchRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeFailure, remediation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DORADeploymentPatchRequestAttributes {\n");
    sb.append("    changeFailure: ").append(toIndentedString(changeFailure)).append("\n");
    sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
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
