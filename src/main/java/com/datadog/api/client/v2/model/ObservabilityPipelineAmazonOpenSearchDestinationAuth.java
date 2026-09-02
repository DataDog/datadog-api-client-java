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

/**
 * Authentication settings for the Amazon OpenSearch destination. The <code>strategy</code> field
 * determines whether basic or AWS-based authentication is used.
 */
@JsonPropertyOrder({
  ObservabilityPipelineAmazonOpenSearchDestinationAuth.JSON_PROPERTY_ASSUME_ROLE,
  ObservabilityPipelineAmazonOpenSearchDestinationAuth.JSON_PROPERTY_AWS_REGION,
  ObservabilityPipelineAmazonOpenSearchDestinationAuth.JSON_PROPERTY_EXTERNAL_ID,
  ObservabilityPipelineAmazonOpenSearchDestinationAuth.JSON_PROPERTY_SESSION_NAME,
  ObservabilityPipelineAmazonOpenSearchDestinationAuth.JSON_PROPERTY_STRATEGY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAmazonOpenSearchDestinationAuth {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSUME_ROLE = "assume_role";
  private String assumeRole;

  public static final String JSON_PROPERTY_AWS_REGION = "aws_region";
  private String awsRegion;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private String externalId;

  public static final String JSON_PROPERTY_SESSION_NAME = "session_name";
  private String sessionName;

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private ObservabilityPipelineAmazonOpenSearchDestinationAuthStrategy strategy;

  public ObservabilityPipelineAmazonOpenSearchDestinationAuth() {}

  @JsonCreator
  public ObservabilityPipelineAmazonOpenSearchDestinationAuth(
      @JsonProperty(required = true, value = JSON_PROPERTY_STRATEGY)
          ObservabilityPipelineAmazonOpenSearchDestinationAuthStrategy strategy) {
    this.strategy = strategy;
    this.unparsed |= !strategy.isValid();
  }

  public ObservabilityPipelineAmazonOpenSearchDestinationAuth assumeRole(String assumeRole) {
    this.assumeRole = assumeRole;
    return this;
  }

  /**
   * The ARN of the role to assume (used with <code>aws</code> strategy).
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

  public ObservabilityPipelineAmazonOpenSearchDestinationAuth awsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
    return this;
  }

  /**
   * AWS region
   *
   * @return awsRegion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AWS_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAwsRegion() {
    return awsRegion;
  }

  public void setAwsRegion(String awsRegion) {
    this.awsRegion = awsRegion;
  }

  public ObservabilityPipelineAmazonOpenSearchDestinationAuth externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * External ID for the assumed role (used with <code>aws</code> strategy).
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

  public ObservabilityPipelineAmazonOpenSearchDestinationAuth sessionName(String sessionName) {
    this.sessionName = sessionName;
    return this;
  }

  /**
   * Session name for the assumed role (used with <code>aws</code> strategy).
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

  public ObservabilityPipelineAmazonOpenSearchDestinationAuth strategy(
      ObservabilityPipelineAmazonOpenSearchDestinationAuthStrategy strategy) {
    this.strategy = strategy;
    this.unparsed |= !strategy.isValid();
    return this;
  }

  /**
   * The authentication strategy to use.
   *
   * @return strategy
   */
  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAmazonOpenSearchDestinationAuthStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(ObservabilityPipelineAmazonOpenSearchDestinationAuthStrategy strategy) {
    if (!strategy.isValid()) {
      this.unparsed = true;
    }
    this.strategy = strategy;
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
   * @return ObservabilityPipelineAmazonOpenSearchDestinationAuth
   */
  @JsonAnySetter
  public ObservabilityPipelineAmazonOpenSearchDestinationAuth putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineAmazonOpenSearchDestinationAuth object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAmazonOpenSearchDestinationAuth
        observabilityPipelineAmazonOpenSearchDestinationAuth =
            (ObservabilityPipelineAmazonOpenSearchDestinationAuth) o;
    return Objects.equals(
            this.assumeRole, observabilityPipelineAmazonOpenSearchDestinationAuth.assumeRole)
        && Objects.equals(
            this.awsRegion, observabilityPipelineAmazonOpenSearchDestinationAuth.awsRegion)
        && Objects.equals(
            this.externalId, observabilityPipelineAmazonOpenSearchDestinationAuth.externalId)
        && Objects.equals(
            this.sessionName, observabilityPipelineAmazonOpenSearchDestinationAuth.sessionName)
        && Objects.equals(
            this.strategy, observabilityPipelineAmazonOpenSearchDestinationAuth.strategy)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAmazonOpenSearchDestinationAuth.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assumeRole, awsRegion, externalId, sessionName, strategy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAmazonOpenSearchDestinationAuth {\n");
    sb.append("    assumeRole: ").append(toIndentedString(assumeRole)).append("\n");
    sb.append("    awsRegion: ").append(toIndentedString(awsRegion)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    sessionName: ").append(toIndentedString(sessionName)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
