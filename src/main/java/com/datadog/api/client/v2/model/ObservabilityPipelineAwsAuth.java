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

/**
 * AWS authentication credentials used for accessing AWS services such as S3. If omitted, the
 * system’s default credentials are used (for example, the IAM role and environment variables).
 */
@JsonPropertyOrder({
  ObservabilityPipelineAwsAuth.JSON_PROPERTY_ASSUME_ROLE,
  ObservabilityPipelineAwsAuth.JSON_PROPERTY_EXTERNAL_ID,
  ObservabilityPipelineAwsAuth.JSON_PROPERTY_SESSION_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAwsAuth {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSUME_ROLE = "assume_role";
  private String assumeRole;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private String externalId;

  public static final String JSON_PROPERTY_SESSION_NAME = "session_name";
  private String sessionName;

  public ObservabilityPipelineAwsAuth assumeRole(String assumeRole) {
    this.assumeRole = assumeRole;
    return this;
  }

  /**
   * The Amazon Resource Name (ARN) of the role to assume.
   *
   * @return assumeRole
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSUME_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssumeRole() {
    return assumeRole;
  }

  public void setAssumeRole(String assumeRole) {
    this.assumeRole = assumeRole;
  }

  public ObservabilityPipelineAwsAuth externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * A unique identifier for cross-account role assumption.
   *
   * @return externalId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ObservabilityPipelineAwsAuth sessionName(String sessionName) {
    this.sessionName = sessionName;
    return this;
  }

  /**
   * A session identifier used for logging and tracing the assumed role session.
   *
   * @return sessionName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSessionName() {
    return sessionName;
  }

  public void setSessionName(String sessionName) {
    this.sessionName = sessionName;
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
   * @return ObservabilityPipelineAwsAuth
   */
  @JsonAnySetter
  public ObservabilityPipelineAwsAuth putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineAwsAuth object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAwsAuth observabilityPipelineAwsAuth = (ObservabilityPipelineAwsAuth) o;
    return Objects.equals(this.assumeRole, observabilityPipelineAwsAuth.assumeRole)
        && Objects.equals(this.externalId, observabilityPipelineAwsAuth.externalId)
        && Objects.equals(this.sessionName, observabilityPipelineAwsAuth.sessionName)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineAwsAuth.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assumeRole, externalId, sessionName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAwsAuth {\n");
    sb.append("    assumeRole: ").append(toIndentedString(assumeRole)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    sessionName: ").append(toIndentedString(sessionName)).append("\n");
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
