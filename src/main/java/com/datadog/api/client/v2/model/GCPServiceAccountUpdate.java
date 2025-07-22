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

/** The definition of the <code>GCPServiceAccount</code> object. */
@JsonPropertyOrder({
  GCPServiceAccountUpdate.JSON_PROPERTY_PRIVATE_KEY,
  GCPServiceAccountUpdate.JSON_PROPERTY_SERVICE_ACCOUNT_EMAIL,
  GCPServiceAccountUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPServiceAccountUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private String privateKey;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT_EMAIL = "service_account_email";
  private String serviceAccountEmail;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GCPServiceAccountCredentialType type;

  public GCPServiceAccountUpdate() {}

  @JsonCreator
  public GCPServiceAccountUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          GCPServiceAccountCredentialType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public GCPServiceAccountUpdate privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * The <code>GCPServiceAccountUpdate</code> <code>private_key</code>.
   *
   * @return privateKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public GCPServiceAccountUpdate serviceAccountEmail(String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
    return this;
  }

  /**
   * The <code>GCPServiceAccountUpdate</code> <code>service_account_email</code>.
   *
   * @return serviceAccountEmail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  public void setServiceAccountEmail(String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
  }

  public GCPServiceAccountUpdate type(GCPServiceAccountCredentialType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of the <code>GCPServiceAccount</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GCPServiceAccountCredentialType getType() {
    return type;
  }

  public void setType(GCPServiceAccountCredentialType type) {
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
   * @return GCPServiceAccountUpdate
   */
  @JsonAnySetter
  public GCPServiceAccountUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GCPServiceAccountUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPServiceAccountUpdate gcpServiceAccountUpdate = (GCPServiceAccountUpdate) o;
    return Objects.equals(this.privateKey, gcpServiceAccountUpdate.privateKey)
        && Objects.equals(this.serviceAccountEmail, gcpServiceAccountUpdate.serviceAccountEmail)
        && Objects.equals(this.type, gcpServiceAccountUpdate.type)
        && Objects.equals(this.additionalProperties, gcpServiceAccountUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateKey, serviceAccountEmail, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPServiceAccountUpdate {\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    serviceAccountEmail: ")
        .append(toIndentedString(serviceAccountEmail))
        .append("\n");
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
