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

/** The definition of the <code>ServiceNowBasicAuth</code> object. */
@JsonPropertyOrder({
  ServiceNowBasicAuthUpdate.JSON_PROPERTY_INSTANCE,
  ServiceNowBasicAuthUpdate.JSON_PROPERTY_PASSWORD,
  ServiceNowBasicAuthUpdate.JSON_PROPERTY_TYPE,
  ServiceNowBasicAuthUpdate.JSON_PROPERTY_USERNAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceNowBasicAuthUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INSTANCE = "instance";
  private ServiceNowBasicAuthUpdateInstance instance;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private ServiceNowBasicAuthUpdatePassword password;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ServiceNowBasicAuthType type;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private ServiceNowBasicAuthUpdateUsername username;

  public ServiceNowBasicAuthUpdate() {}

  @JsonCreator
  public ServiceNowBasicAuthUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ServiceNowBasicAuthType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ServiceNowBasicAuthUpdate instance(ServiceNowBasicAuthUpdateInstance instance) {
    this.instance = instance;
    this.unparsed |= instance.unparsed;
    return this;
  }

  /**
   * The <code>ServiceNowBasicAuthUpdate</code> <code>instance</code>.
   *
   * @return instance
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceNowBasicAuthUpdateInstance getInstance() {
    return instance;
  }

  public void setInstance(ServiceNowBasicAuthUpdateInstance instance) {
    this.instance = instance;
    if (instance != null) {
      this.unparsed |= instance.unparsed;
    }
  }

  public ServiceNowBasicAuthUpdate password(ServiceNowBasicAuthUpdatePassword password) {
    this.password = password;
    this.unparsed |= password.unparsed;
    return this;
  }

  /**
   * The <code>ServiceNowBasicAuthUpdate</code> <code>password</code>.
   *
   * @return password
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceNowBasicAuthUpdatePassword getPassword() {
    return password;
  }

  public void setPassword(ServiceNowBasicAuthUpdatePassword password) {
    this.password = password;
    if (password != null) {
      this.unparsed |= password.unparsed;
    }
  }

  public ServiceNowBasicAuthUpdate type(ServiceNowBasicAuthType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of the <code>ServiceNowBasicAuth</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ServiceNowBasicAuthType getType() {
    return type;
  }

  public void setType(ServiceNowBasicAuthType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ServiceNowBasicAuthUpdate username(ServiceNowBasicAuthUpdateUsername username) {
    this.username = username;
    this.unparsed |= username.unparsed;
    return this;
  }

  /**
   * The <code>ServiceNowBasicAuthUpdate</code> <code>username</code>.
   *
   * @return username
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ServiceNowBasicAuthUpdateUsername getUsername() {
    return username;
  }

  public void setUsername(ServiceNowBasicAuthUpdateUsername username) {
    this.username = username;
    if (username != null) {
      this.unparsed |= username.unparsed;
    }
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
   * @return ServiceNowBasicAuthUpdate
   */
  @JsonAnySetter
  public ServiceNowBasicAuthUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceNowBasicAuthUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceNowBasicAuthUpdate serviceNowBasicAuthUpdate = (ServiceNowBasicAuthUpdate) o;
    return Objects.equals(this.instance, serviceNowBasicAuthUpdate.instance)
        && Objects.equals(this.password, serviceNowBasicAuthUpdate.password)
        && Objects.equals(this.type, serviceNowBasicAuthUpdate.type)
        && Objects.equals(this.username, serviceNowBasicAuthUpdate.username)
        && Objects.equals(
            this.additionalProperties, serviceNowBasicAuthUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instance, password, type, username, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceNowBasicAuthUpdate {\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
