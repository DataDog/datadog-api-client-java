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

/** Specifies the SASL mechanism for authenticating with a Kafka cluster. */
@JsonPropertyOrder({
  ObservabilityPipelineKafkaSasl.JSON_PROPERTY_MECHANISM,
  ObservabilityPipelineKafkaSasl.JSON_PROPERTY_PASSWORD_KEY,
  ObservabilityPipelineKafkaSasl.JSON_PROPERTY_USERNAME_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineKafkaSasl {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MECHANISM = "mechanism";
  private ObservabilityPipelineKafkaSaslMechanism mechanism;

  public static final String JSON_PROPERTY_PASSWORD_KEY = "password_key";
  private String passwordKey;

  public static final String JSON_PROPERTY_USERNAME_KEY = "username_key";
  private String usernameKey;

  public ObservabilityPipelineKafkaSasl mechanism(
      ObservabilityPipelineKafkaSaslMechanism mechanism) {
    this.mechanism = mechanism;
    this.unparsed |= !mechanism.isValid();
    return this;
  }

  /**
   * SASL mechanism used for Kafka authentication.
   *
   * @return mechanism
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MECHANISM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineKafkaSaslMechanism getMechanism() {
    return mechanism;
  }

  public void setMechanism(ObservabilityPipelineKafkaSaslMechanism mechanism) {
    if (!mechanism.isValid()) {
      this.unparsed = true;
    }
    this.mechanism = mechanism;
  }

  public ObservabilityPipelineKafkaSasl passwordKey(String passwordKey) {
    this.passwordKey = passwordKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the SASL password.
   *
   * @return passwordKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPasswordKey() {
    return passwordKey;
  }

  public void setPasswordKey(String passwordKey) {
    this.passwordKey = passwordKey;
  }

  public ObservabilityPipelineKafkaSasl usernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the SASL username.
   *
   * @return usernameKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsernameKey() {
    return usernameKey;
  }

  public void setUsernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
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
   * @return ObservabilityPipelineKafkaSasl
   */
  @JsonAnySetter
  public ObservabilityPipelineKafkaSasl putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineKafkaSasl object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineKafkaSasl observabilityPipelineKafkaSasl =
        (ObservabilityPipelineKafkaSasl) o;
    return Objects.equals(this.mechanism, observabilityPipelineKafkaSasl.mechanism)
        && Objects.equals(this.passwordKey, observabilityPipelineKafkaSasl.passwordKey)
        && Objects.equals(this.usernameKey, observabilityPipelineKafkaSasl.usernameKey)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineKafkaSasl.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mechanism, passwordKey, usernameKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineKafkaSasl {\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
    sb.append("    passwordKey: ").append(toIndentedString(passwordKey)).append("\n");
    sb.append("    usernameKey: ").append(toIndentedString(usernameKey)).append("\n");
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
