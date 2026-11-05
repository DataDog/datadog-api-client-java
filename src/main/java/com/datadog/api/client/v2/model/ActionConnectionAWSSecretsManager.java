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
 * AWS Secrets Manager settings shared by the credential references on a <code>DATACENTER</code>
 * connection. These settings are required whenever a field uses an AWS Secrets Manager reference.
 */
@JsonPropertyOrder({
  ActionConnectionAWSSecretsManager.JSON_PROPERTY_CONNECTION_ID,
  ActionConnectionAWSSecretsManager.JSON_PROPERTY_REGION,
  ActionConnectionAWSSecretsManager.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ActionConnectionAWSSecretsManager {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ActionConnectionAWSSecretsManagerType type;

  public ActionConnectionAWSSecretsManager() {}

  @JsonCreator
  public ActionConnectionAWSSecretsManager(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONNECTION_ID) String connectionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION) String region,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ActionConnectionAWSSecretsManagerType type) {
    this.connectionId = connectionId;
    this.region = region;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ActionConnectionAWSSecretsManager connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  /**
   * ID of the AWS connection used to retrieve secrets. This connection must be in the same Datadog
   * organization.
   *
   * @return connectionId
   */
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public ActionConnectionAWSSecretsManager region(String region) {
    this.region = region;
    return this;
  }

  /**
   * AWS region containing the referenced secrets.
   *
   * @return region
   */
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ActionConnectionAWSSecretsManager type(ActionConnectionAWSSecretsManagerType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * AWS Secrets Manager secret backend.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ActionConnectionAWSSecretsManagerType getType() {
    return type;
  }

  public void setType(ActionConnectionAWSSecretsManagerType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ActionConnectionAWSSecretsManager
   */
  @JsonAnySetter
  public ActionConnectionAWSSecretsManager putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ActionConnectionAWSSecretsManager object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionConnectionAWSSecretsManager actionConnectionAwsSecretsManager =
        (ActionConnectionAWSSecretsManager) o;
    return Objects.equals(this.connectionId, actionConnectionAwsSecretsManager.connectionId)
        && Objects.equals(this.region, actionConnectionAwsSecretsManager.region)
        && Objects.equals(this.type, actionConnectionAwsSecretsManager.type)
        && Objects.equals(
            this.additionalProperties, actionConnectionAwsSecretsManager.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, region, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionConnectionAWSSecretsManager {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
