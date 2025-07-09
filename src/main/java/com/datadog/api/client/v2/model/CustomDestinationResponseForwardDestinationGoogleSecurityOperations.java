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

/** The Google Security Operations destination. */
@JsonPropertyOrder({
  CustomDestinationResponseForwardDestinationGoogleSecurityOperations.JSON_PROPERTY_AUTH,
  CustomDestinationResponseForwardDestinationGoogleSecurityOperations.JSON_PROPERTY_CUSTOMER_ID,
  CustomDestinationResponseForwardDestinationGoogleSecurityOperations.JSON_PROPERTY_NAMESPACE,
  CustomDestinationResponseForwardDestinationGoogleSecurityOperations
      .JSON_PROPERTY_REGIONAL_ENDPOINT,
  CustomDestinationResponseForwardDestinationGoogleSecurityOperations.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomDestinationResponseForwardDestinationGoogleSecurityOperations {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private CustomDestinationResponseGoogleSecurityOperationsDestinationAuth auth;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private String customerId;

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private String namespace;

  public static final String JSON_PROPERTY_REGIONAL_ENDPOINT = "regional_endpoint";
  private String regionalEndpoint;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomDestinationResponseForwardDestinationGoogleSecurityOperationsType type =
      CustomDestinationResponseForwardDestinationGoogleSecurityOperationsType
          .GOOGLE_SECURITY_OPERATIONS;

  public CustomDestinationResponseForwardDestinationGoogleSecurityOperations() {}

  @JsonCreator
  public CustomDestinationResponseForwardDestinationGoogleSecurityOperations(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH)
          CustomDestinationResponseGoogleSecurityOperationsDestinationAuth auth,
      @JsonProperty(required = true, value = JSON_PROPERTY_CUSTOMER_ID) String customerId,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAMESPACE) String namespace,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGIONAL_ENDPOINT)
          String regionalEndpoint,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CustomDestinationResponseForwardDestinationGoogleSecurityOperationsType type) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    this.customerId = customerId;
    this.namespace = namespace;
    this.regionalEndpoint = regionalEndpoint;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CustomDestinationResponseForwardDestinationGoogleSecurityOperations auth(
      CustomDestinationResponseGoogleSecurityOperationsDestinationAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * Google Security Operations destination authentication.
   *
   * @return auth
   */
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomDestinationResponseGoogleSecurityOperationsDestinationAuth getAuth() {
    return auth;
  }

  public void setAuth(CustomDestinationResponseGoogleSecurityOperationsDestinationAuth auth) {
    this.auth = auth;
  }

  public CustomDestinationResponseForwardDestinationGoogleSecurityOperations customerId(
      String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * The customer ID of the Google Security Operations account.
   *
   * @return customerId
   */
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public CustomDestinationResponseForwardDestinationGoogleSecurityOperations namespace(
      String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * The namespace of the Google Security Operations account.
   *
   * @return namespace
   */
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public CustomDestinationResponseForwardDestinationGoogleSecurityOperations regionalEndpoint(
      String regionalEndpoint) {
    this.regionalEndpoint = regionalEndpoint;
    return this;
  }

  /**
   * The <code>CustomDestinationResponseForwardDestinationGoogleSecurityOperations</code> <code>
   * regional_endpoint</code>.
   *
   * @return regionalEndpoint
   */
  @JsonProperty(JSON_PROPERTY_REGIONAL_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRegionalEndpoint() {
    return regionalEndpoint;
  }

  public void setRegionalEndpoint(String regionalEndpoint) {
    this.regionalEndpoint = regionalEndpoint;
  }

  public CustomDestinationResponseForwardDestinationGoogleSecurityOperations type(
      CustomDestinationResponseForwardDestinationGoogleSecurityOperationsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Google Security Operations destination.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomDestinationResponseForwardDestinationGoogleSecurityOperationsType getType() {
    return type;
  }

  public void setType(
      CustomDestinationResponseForwardDestinationGoogleSecurityOperationsType type) {
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
   * @return CustomDestinationResponseForwardDestinationGoogleSecurityOperations
   */
  @JsonAnySetter
  public CustomDestinationResponseForwardDestinationGoogleSecurityOperations putAdditionalProperty(
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
   * Return true if this CustomDestinationResponseForwardDestinationGoogleSecurityOperations object
   * is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDestinationResponseForwardDestinationGoogleSecurityOperations
        customDestinationResponseForwardDestinationGoogleSecurityOperations =
            (CustomDestinationResponseForwardDestinationGoogleSecurityOperations) o;
    return Objects.equals(
            this.auth, customDestinationResponseForwardDestinationGoogleSecurityOperations.auth)
        && Objects.equals(
            this.customerId,
            customDestinationResponseForwardDestinationGoogleSecurityOperations.customerId)
        && Objects.equals(
            this.namespace,
            customDestinationResponseForwardDestinationGoogleSecurityOperations.namespace)
        && Objects.equals(
            this.regionalEndpoint,
            customDestinationResponseForwardDestinationGoogleSecurityOperations.regionalEndpoint)
        && Objects.equals(
            this.type, customDestinationResponseForwardDestinationGoogleSecurityOperations.type)
        && Objects.equals(
            this.additionalProperties,
            customDestinationResponseForwardDestinationGoogleSecurityOperations
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, customerId, namespace, regionalEndpoint, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDestinationResponseForwardDestinationGoogleSecurityOperations {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    regionalEndpoint: ").append(toIndentedString(regionalEndpoint)).append("\n");
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
