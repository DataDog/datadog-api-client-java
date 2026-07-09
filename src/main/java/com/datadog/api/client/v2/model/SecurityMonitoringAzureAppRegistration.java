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

/** An Azure App Registration discovered for the organization. */
@JsonPropertyOrder({
  SecurityMonitoringAzureAppRegistration.JSON_PROPERTY_CLIENT_ID,
  SecurityMonitoringAzureAppRegistration.JSON_PROPERTY_ERROR_COUNT,
  SecurityMonitoringAzureAppRegistration.JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED,
  SecurityMonitoringAzureAppRegistration.JSON_PROPERTY_SUBSCRIPTION_COUNT,
  SecurityMonitoringAzureAppRegistration.JSON_PROPERTY_TENANT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringAzureAppRegistration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_ERROR_COUNT = "error_count";
  private Long errorCount;

  public static final String JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED =
      "resource_collection_enabled";
  private Boolean resourceCollectionEnabled;

  public static final String JSON_PROPERTY_SUBSCRIPTION_COUNT = "subscription_count";
  private Long subscriptionCount;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public SecurityMonitoringAzureAppRegistration() {}

  @JsonCreator
  public SecurityMonitoringAzureAppRegistration(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ID) String clientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ERROR_COUNT) Long errorCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED)
          Boolean resourceCollectionEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBSCRIPTION_COUNT)
          Long subscriptionCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_TENANT_ID) String tenantId) {
    this.clientId = clientId;
    this.errorCount = errorCount;
    this.resourceCollectionEnabled = resourceCollectionEnabled;
    this.subscriptionCount = subscriptionCount;
    this.tenantId = tenantId;
  }

  public SecurityMonitoringAzureAppRegistration clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The client ID of the App Registration.
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

  public SecurityMonitoringAzureAppRegistration errorCount(Long errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  /**
   * The number of errors encountered while crawling resources for this App Registration.
   *
   * @return errorCount
   */
  @JsonProperty(JSON_PROPERTY_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(Long errorCount) {
    this.errorCount = errorCount;
  }

  public SecurityMonitoringAzureAppRegistration resourceCollectionEnabled(
      Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
    return this;
  }

  /**
   * Whether resource collection is enabled for this App Registration.
   *
   * @return resourceCollectionEnabled
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getResourceCollectionEnabled() {
    return resourceCollectionEnabled;
  }

  public void setResourceCollectionEnabled(Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
  }

  public SecurityMonitoringAzureAppRegistration subscriptionCount(Long subscriptionCount) {
    this.subscriptionCount = subscriptionCount;
    return this;
  }

  /**
   * The number of Azure subscriptions associated with this App Registration.
   *
   * @return subscriptionCount
   */
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSubscriptionCount() {
    return subscriptionCount;
  }

  public void setSubscriptionCount(Long subscriptionCount) {
    this.subscriptionCount = subscriptionCount;
  }

  public SecurityMonitoringAzureAppRegistration tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The Azure tenant ID of the App Registration.
   *
   * @return tenantId
   */
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
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
   * @return SecurityMonitoringAzureAppRegistration
   */
  @JsonAnySetter
  public SecurityMonitoringAzureAppRegistration putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringAzureAppRegistration object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringAzureAppRegistration securityMonitoringAzureAppRegistration =
        (SecurityMonitoringAzureAppRegistration) o;
    return Objects.equals(this.clientId, securityMonitoringAzureAppRegistration.clientId)
        && Objects.equals(this.errorCount, securityMonitoringAzureAppRegistration.errorCount)
        && Objects.equals(
            this.resourceCollectionEnabled,
            securityMonitoringAzureAppRegistration.resourceCollectionEnabled)
        && Objects.equals(
            this.subscriptionCount, securityMonitoringAzureAppRegistration.subscriptionCount)
        && Objects.equals(this.tenantId, securityMonitoringAzureAppRegistration.tenantId)
        && Objects.equals(
            this.additionalProperties, securityMonitoringAzureAppRegistration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clientId,
        errorCount,
        resourceCollectionEnabled,
        subscriptionCount,
        tenantId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringAzureAppRegistration {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    resourceCollectionEnabled: ")
        .append(toIndentedString(resourceCollectionEnabled))
        .append("\n");
    sb.append("    subscriptionCount: ").append(toIndentedString(subscriptionCount)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
