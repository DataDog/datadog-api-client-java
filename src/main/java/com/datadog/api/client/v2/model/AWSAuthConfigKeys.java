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

/** AWS Authentication config to integrate your account using an access key pair. */
@JsonPropertyOrder({
  AWSAuthConfigKeys.JSON_PROPERTY_ACCESS_KEY_ID,
  AWSAuthConfigKeys.JSON_PROPERTY_SECRET_ACCESS_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSAuthConfigKeys {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_KEY_ID = "access_key_id";
  private String accessKeyId;

  public static final String JSON_PROPERTY_SECRET_ACCESS_KEY = "secret_access_key";
  private String secretAccessKey;

  public AWSAuthConfigKeys() {}

  @JsonCreator
  public AWSAuthConfigKeys(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCESS_KEY_ID) String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  public AWSAuthConfigKeys accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * AWS Access Key ID.
   *
   * @return accessKeyId
   */
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  public AWSAuthConfigKeys secretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  /**
   * AWS Secret Access Key.
   *
   * @return secretAccessKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECRET_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
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
   * @return AWSAuthConfigKeys
   */
  @JsonAnySetter
  public AWSAuthConfigKeys putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSAuthConfigKeys object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAuthConfigKeys awsAuthConfigKeys = (AWSAuthConfigKeys) o;
    return Objects.equals(this.accessKeyId, awsAuthConfigKeys.accessKeyId)
        && Objects.equals(this.secretAccessKey, awsAuthConfigKeys.secretAccessKey)
        && Objects.equals(this.additionalProperties, awsAuthConfigKeys.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, secretAccessKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAuthConfigKeys {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
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
