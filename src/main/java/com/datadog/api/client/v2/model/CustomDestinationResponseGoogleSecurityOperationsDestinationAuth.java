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
  CustomDestinationResponseGoogleSecurityOperationsDestinationAuth.JSON_PROPERTY_CLIENT_EMAIL,
  CustomDestinationResponseGoogleSecurityOperationsDestinationAuth.JSON_PROPERTY_PROJECT_ID,
  CustomDestinationResponseGoogleSecurityOperationsDestinationAuth.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomDestinationResponseGoogleSecurityOperationsDestinationAuth {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLIENT_EMAIL = "client_email";
  private String clientEmail;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomDestinationResponseGoogleSecurityOperationsDestinationAuthType type =
      CustomDestinationResponseGoogleSecurityOperationsDestinationAuthType.GCP_PRIVATE_KEY;

  public CustomDestinationResponseGoogleSecurityOperationsDestinationAuth() {}

  @JsonCreator
  public CustomDestinationResponseGoogleSecurityOperationsDestinationAuth(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_EMAIL) String clientEmail,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CustomDestinationResponseGoogleSecurityOperationsDestinationAuthType type) {
    this.clientEmail = clientEmail;
    this.projectId = projectId;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CustomDestinationResponseGoogleSecurityOperationsDestinationAuth clientEmail(
      String clientEmail) {
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

  public CustomDestinationResponseGoogleSecurityOperationsDestinationAuth projectId(
      String projectId) {
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

  public CustomDestinationResponseGoogleSecurityOperationsDestinationAuth type(
      CustomDestinationResponseGoogleSecurityOperationsDestinationAuthType type) {
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
  public CustomDestinationResponseGoogleSecurityOperationsDestinationAuthType getType() {
    return type;
  }

  public void setType(CustomDestinationResponseGoogleSecurityOperationsDestinationAuthType type) {
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
   * @return CustomDestinationResponseGoogleSecurityOperationsDestinationAuth
   */
  @JsonAnySetter
  public CustomDestinationResponseGoogleSecurityOperationsDestinationAuth putAdditionalProperty(
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
   * Return true if this CustomDestinationResponseGoogleSecurityOperationsDestinationAuth object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDestinationResponseGoogleSecurityOperationsDestinationAuth
        customDestinationResponseGoogleSecurityOperationsDestinationAuth =
            (CustomDestinationResponseGoogleSecurityOperationsDestinationAuth) o;
    return Objects.equals(
            this.clientEmail,
            customDestinationResponseGoogleSecurityOperationsDestinationAuth.clientEmail)
        && Objects.equals(
            this.projectId,
            customDestinationResponseGoogleSecurityOperationsDestinationAuth.projectId)
        && Objects.equals(
            this.type, customDestinationResponseGoogleSecurityOperationsDestinationAuth.type)
        && Objects.equals(
            this.additionalProperties,
            customDestinationResponseGoogleSecurityOperationsDestinationAuth.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientEmail, projectId, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDestinationResponseGoogleSecurityOperationsDestinationAuth {\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
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
