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
 * Reference to a string value in AWS Secrets Manager. The connection must also specify <code>
 * external_secrets_manager</code> settings. AWS Secrets Manager references are supported for
 * token-based credentials and HTTP authentication tokens on <code>DATACENTER</code> connections.
 */
@JsonPropertyOrder({
  ActionConnectionAWSSecretsManagerReference.JSON_PROPERTY_KEY,
  ActionConnectionAWSSecretsManagerReference.JSON_PROPERTY_SECRET_ID,
  ActionConnectionAWSSecretsManagerReference.JSON_PROPERTY_TYPE,
  ActionConnectionAWSSecretsManagerReference.JSON_PROPERTY_VERSION_ID,
  ActionConnectionAWSSecretsManagerReference.JSON_PROPERTY_VERSION_STAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ActionConnectionAWSSecretsManagerReference {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_SECRET_ID = "secret_id";
  private String secretId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ActionConnectionAWSSecretsManagerType type;

  public static final String JSON_PROPERTY_VERSION_ID = "version_id";
  private String versionId;

  public static final String JSON_PROPERTY_VERSION_STAGE = "version_stage";
  private String versionStage;

  public ActionConnectionAWSSecretsManagerReference() {}

  @JsonCreator
  public ActionConnectionAWSSecretsManagerReference(
      @JsonProperty(required = true, value = JSON_PROPERTY_SECRET_ID) String secretId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ActionConnectionAWSSecretsManagerType type) {
    this.secretId = secretId;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ActionConnectionAWSSecretsManagerReference key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Top-level JSON key to extract from the secret string. Omit this field to use the entire secret
   * string.
   *
   * @return key
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ActionConnectionAWSSecretsManagerReference secretId(String secretId) {
    this.secretId = secretId;
    return this;
  }

  /**
   * Name or ARN of the AWS Secrets Manager secret.
   *
   * @return secretId
   */
  @JsonProperty(JSON_PROPERTY_SECRET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSecretId() {
    return secretId;
  }

  public void setSecretId(String secretId) {
    this.secretId = secretId;
  }

  public ActionConnectionAWSSecretsManagerReference type(
      ActionConnectionAWSSecretsManagerType type) {
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

  public ActionConnectionAWSSecretsManagerReference versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * ID of the secret version to retrieve. Cannot be used together with <code>version_stage</code>.
   * If both are omitted, the current version is used.
   *
   * @return versionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public ActionConnectionAWSSecretsManagerReference versionStage(String versionStage) {
    this.versionStage = versionStage;
    return this;
  }

  /**
   * Staging label of the secret version to retrieve. Cannot be used together with <code>version_id
   * </code>. If both are omitted, the current version is used.
   *
   * @return versionStage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersionStage() {
    return versionStage;
  }

  public void setVersionStage(String versionStage) {
    this.versionStage = versionStage;
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
   * @return ActionConnectionAWSSecretsManagerReference
   */
  @JsonAnySetter
  public ActionConnectionAWSSecretsManagerReference putAdditionalProperty(
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

  /** Return true if this ActionConnectionAWSSecretsManagerReference object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionConnectionAWSSecretsManagerReference actionConnectionAwsSecretsManagerReference =
        (ActionConnectionAWSSecretsManagerReference) o;
    return Objects.equals(this.key, actionConnectionAwsSecretsManagerReference.key)
        && Objects.equals(this.secretId, actionConnectionAwsSecretsManagerReference.secretId)
        && Objects.equals(this.type, actionConnectionAwsSecretsManagerReference.type)
        && Objects.equals(this.versionId, actionConnectionAwsSecretsManagerReference.versionId)
        && Objects.equals(
            this.versionStage, actionConnectionAwsSecretsManagerReference.versionStage)
        && Objects.equals(
            this.additionalProperties,
            actionConnectionAwsSecretsManagerReference.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, secretId, type, versionId, versionStage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionConnectionAWSSecretsManagerReference {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    versionStage: ").append(toIndentedString(versionStage)).append("\n");
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
