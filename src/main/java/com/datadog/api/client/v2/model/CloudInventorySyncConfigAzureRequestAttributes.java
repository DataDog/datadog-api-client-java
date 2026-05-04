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

/** Azure settings for the storage account and container with inventory data. */
@JsonPropertyOrder({
  CloudInventorySyncConfigAzureRequestAttributes.JSON_PROPERTY_CLIENT_ID,
  CloudInventorySyncConfigAzureRequestAttributes.JSON_PROPERTY_CONTAINER,
  CloudInventorySyncConfigAzureRequestAttributes.JSON_PROPERTY_RESOURCE_GROUP,
  CloudInventorySyncConfigAzureRequestAttributes.JSON_PROPERTY_STORAGE_ACCOUNT,
  CloudInventorySyncConfigAzureRequestAttributes.JSON_PROPERTY_SUBSCRIPTION_ID,
  CloudInventorySyncConfigAzureRequestAttributes.JSON_PROPERTY_TENANT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudInventorySyncConfigAzureRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CONTAINER = "container";
  private String container;

  public static final String JSON_PROPERTY_RESOURCE_GROUP = "resource_group";
  private String resourceGroup;

  public static final String JSON_PROPERTY_STORAGE_ACCOUNT = "storage_account";
  private String storageAccount;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscription_id";
  private String subscriptionId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public CloudInventorySyncConfigAzureRequestAttributes() {}

  @JsonCreator
  public CloudInventorySyncConfigAzureRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ID) String clientId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTAINER) String container,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_GROUP) String resourceGroup,
      @JsonProperty(required = true, value = JSON_PROPERTY_STORAGE_ACCOUNT) String storageAccount,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBSCRIPTION_ID) String subscriptionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TENANT_ID) String tenantId) {
    this.clientId = clientId;
    this.container = container;
    this.resourceGroup = resourceGroup;
    this.storageAccount = storageAccount;
    this.subscriptionId = subscriptionId;
    this.tenantId = tenantId;
  }

  public CloudInventorySyncConfigAzureRequestAttributes clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Azure AD application (client) ID used for access.
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

  public CloudInventorySyncConfigAzureRequestAttributes container(String container) {
    this.container = container;
    return this;
  }

  /**
   * Blob container name.
   *
   * @return container
   */
  @JsonProperty(JSON_PROPERTY_CONTAINER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public CloudInventorySyncConfigAzureRequestAttributes resourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

  /**
   * Resource group containing the storage account.
   *
   * @return resourceGroup
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceGroup() {
    return resourceGroup;
  }

  public void setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  public CloudInventorySyncConfigAzureRequestAttributes storageAccount(String storageAccount) {
    this.storageAccount = storageAccount;
    return this;
  }

  /**
   * Storage account name.
   *
   * @return storageAccount
   */
  @JsonProperty(JSON_PROPERTY_STORAGE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStorageAccount() {
    return storageAccount;
  }

  public void setStorageAccount(String storageAccount) {
    this.storageAccount = storageAccount;
  }

  public CloudInventorySyncConfigAzureRequestAttributes subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Azure subscription ID.
   *
   * @return subscriptionId
   */
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public CloudInventorySyncConfigAzureRequestAttributes tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Azure AD tenant ID.
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
   * @return CloudInventorySyncConfigAzureRequestAttributes
   */
  @JsonAnySetter
  public CloudInventorySyncConfigAzureRequestAttributes putAdditionalProperty(
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

  /** Return true if this CloudInventorySyncConfigAzureRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudInventorySyncConfigAzureRequestAttributes cloudInventorySyncConfigAzureRequestAttributes =
        (CloudInventorySyncConfigAzureRequestAttributes) o;
    return Objects.equals(this.clientId, cloudInventorySyncConfigAzureRequestAttributes.clientId)
        && Objects.equals(this.container, cloudInventorySyncConfigAzureRequestAttributes.container)
        && Objects.equals(
            this.resourceGroup, cloudInventorySyncConfigAzureRequestAttributes.resourceGroup)
        && Objects.equals(
            this.storageAccount, cloudInventorySyncConfigAzureRequestAttributes.storageAccount)
        && Objects.equals(
            this.subscriptionId, cloudInventorySyncConfigAzureRequestAttributes.subscriptionId)
        && Objects.equals(this.tenantId, cloudInventorySyncConfigAzureRequestAttributes.tenantId)
        && Objects.equals(
            this.additionalProperties,
            cloudInventorySyncConfigAzureRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clientId,
        container,
        resourceGroup,
        storageAccount,
        subscriptionId,
        tenantId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudInventorySyncConfigAzureRequestAttributes {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
    sb.append("    storageAccount: ").append(toIndentedString(storageAccount)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
