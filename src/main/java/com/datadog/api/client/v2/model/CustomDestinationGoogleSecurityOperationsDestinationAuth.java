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

/** Google Security Operations destination authentication. */
@JsonPropertyOrder({
  CustomDestinationGoogleSecurityOperationsDestinationAuth.JSON_PROPERTY_CLIENT_EMAIL,
  CustomDestinationGoogleSecurityOperationsDestinationAuth.JSON_PROPERTY_CLIENT_ID,
  CustomDestinationGoogleSecurityOperationsDestinationAuth.JSON_PROPERTY_PRIVATE_KEY,
  CustomDestinationGoogleSecurityOperationsDestinationAuth.JSON_PROPERTY_PRIVATE_KEY_ID,
  CustomDestinationGoogleSecurityOperationsDestinationAuth.JSON_PROPERTY_PROJECT_ID,
  CustomDestinationGoogleSecurityOperationsDestinationAuth.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomDestinationGoogleSecurityOperationsDestinationAuth {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLIENT_EMAIL = "client_email";
  private String clientEmail;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
  private String privateKey;

  public static final String JSON_PROPERTY_PRIVATE_KEY_ID = "private_key_id";
  private String privateKeyId;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomDestinationGoogleSecurityOperationsDestinationAuthType type =
      CustomDestinationGoogleSecurityOperationsDestinationAuthType.GCP_PRIVATE_KEY;

  public CustomDestinationGoogleSecurityOperationsDestinationAuth() {}

  @JsonCreator
  public CustomDestinationGoogleSecurityOperationsDestinationAuth(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_EMAIL) String clientEmail,
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ID) String clientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIVATE_KEY) String privateKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIVATE_KEY_ID) String privateKeyId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CustomDestinationGoogleSecurityOperationsDestinationAuthType type) {
    this.clientEmail = clientEmail;
    this.clientId = clientId;
    this.privateKey = privateKey;
    this.privateKeyId = privateKeyId;
    this.projectId = projectId;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CustomDestinationGoogleSecurityOperationsDestinationAuth clientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
    return this;
  }

  /**
   * The Google Security Operations client email.
   *
   * @return clientEmail
   */
  @JsonProperty(JSON_PROPERTY_CLIENT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientEmail() {
    return clientEmail;
  }

  public void setClientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
  }

  public CustomDestinationGoogleSecurityOperationsDestinationAuth clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The Google Security Operations client ID. This field is not returned by the API.
   *
   * @return clientId
   */
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public CustomDestinationGoogleSecurityOperationsDestinationAuth privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * The Google Security Operations private key. This field is not returned by the API.
   *
   * @return privateKey
   */
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public CustomDestinationGoogleSecurityOperationsDestinationAuth privateKeyId(
      String privateKeyId) {
    this.privateKeyId = privateKeyId;
    return this;
  }

  /**
   * The Google Security Operations private key ID. This field is not returned by the API.
   *
   * @return privateKeyId
   */
  @JsonProperty(JSON_PROPERTY_PRIVATE_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrivateKeyId() {
    return privateKeyId;
  }

  public void setPrivateKeyId(String privateKeyId) {
    this.privateKeyId = privateKeyId;
  }

  public CustomDestinationGoogleSecurityOperationsDestinationAuth projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Google Security Operations project ID.
   *
   * @return projectId
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public CustomDestinationGoogleSecurityOperationsDestinationAuth type(
      CustomDestinationGoogleSecurityOperationsDestinationAuthType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Google Security Operations destination authentication.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomDestinationGoogleSecurityOperationsDestinationAuthType getType() {
    return type;
  }

  public void setType(CustomDestinationGoogleSecurityOperationsDestinationAuthType type) {
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
   * @return CustomDestinationGoogleSecurityOperationsDestinationAuth
   */
  @JsonAnySetter
  public CustomDestinationGoogleSecurityOperationsDestinationAuth putAdditionalProperty(
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
   * Return true if this CustomDestinationGoogleSecurityOperationsDestinationAuth object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDestinationGoogleSecurityOperationsDestinationAuth
        customDestinationGoogleSecurityOperationsDestinationAuth =
            (CustomDestinationGoogleSecurityOperationsDestinationAuth) o;
    return Objects.equals(
            this.clientEmail, customDestinationGoogleSecurityOperationsDestinationAuth.clientEmail)
        && Objects.equals(
            this.clientId, customDestinationGoogleSecurityOperationsDestinationAuth.clientId)
        && Objects.equals(
            this.privateKey, customDestinationGoogleSecurityOperationsDestinationAuth.privateKey)
        && Objects.equals(
            this.privateKeyId,
            customDestinationGoogleSecurityOperationsDestinationAuth.privateKeyId)
        && Objects.equals(
            this.projectId, customDestinationGoogleSecurityOperationsDestinationAuth.projectId)
        && Objects.equals(this.type, customDestinationGoogleSecurityOperationsDestinationAuth.type)
        && Objects.equals(
            this.additionalProperties,
            customDestinationGoogleSecurityOperationsDestinationAuth.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clientEmail, clientId, privateKey, privateKeyId, projectId, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDestinationGoogleSecurityOperationsDestinationAuth {\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    privateKeyId: ").append(toIndentedString(privateKeyId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
