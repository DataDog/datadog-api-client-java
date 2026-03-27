/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The definition of the <code>GCPServiceAccount</code> object.</p>
 */
@JsonPropertyOrder({
  GCPServiceAccount.JSON_PROPERTY_PRIVATE_KEY,
  GCPServiceAccount.JSON_PROPERTY_SERVICE_ACCOUNT_EMAIL,
  GCPServiceAccount.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPServiceAccount {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private String privateKey;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT_EMAIL = "service_account_email";
  private String serviceAccountEmail;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GCPServiceAccountCredentialType type;

  public GCPServiceAccount() {}

  @JsonCreator
  public GCPServiceAccount(
            @JsonProperty(required=true, value=JSON_PROPERTY_PRIVATE_KEY)String privateKey,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE_ACCOUNT_EMAIL)String serviceAccountEmail,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)GCPServiceAccountCredentialType type) {
        this.privateKey = privateKey;
        this.serviceAccountEmail = serviceAccountEmail;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public GCPServiceAccount privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * <p>The <code>GCPServiceAccount</code> <code>private_key</code>.</p>
   * @return privateKey
  **/
      @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getPrivateKey() {
        return privateKey;
      }
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }
  public GCPServiceAccount serviceAccountEmail(String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
    return this;
  }

  /**
   * <p>The <code>GCPServiceAccount</code> <code>service_account_email</code>.</p>
   * @return serviceAccountEmail
  **/
      @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getServiceAccountEmail() {
        return serviceAccountEmail;
      }
  public void setServiceAccountEmail(String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
  }
  public GCPServiceAccount type(GCPServiceAccountCredentialType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The definition of the <code>GCPServiceAccount</code> object.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return GCPServiceAccount
   */
  @JsonAnySetter
  public GCPServiceAccount putAdditionalProperty(String key, Object value) {
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
   * Return true if this GCPServiceAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPServiceAccount gcpServiceAccount = (GCPServiceAccount) o;
    return Objects.equals(this.privateKey, gcpServiceAccount.privateKey) && Objects.equals(this.serviceAccountEmail, gcpServiceAccount.serviceAccountEmail) && Objects.equals(this.type, gcpServiceAccount.type) && Objects.equals(this.additionalProperties, gcpServiceAccount.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(privateKey,serviceAccountEmail,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPServiceAccount {\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    serviceAccountEmail: ").append(toIndentedString(serviceAccountEmail)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
