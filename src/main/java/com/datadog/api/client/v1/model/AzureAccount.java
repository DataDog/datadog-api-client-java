/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Datadog-Azure integrations configured for your organization. */
@JsonPropertyOrder({
  AzureAccount.JSON_PROPERTY_APP_SERVICE_PLAN_FILTERS,
  AzureAccount.JSON_PROPERTY_AUTOMUTE,
  AzureAccount.JSON_PROPERTY_CLIENT_ID,
  AzureAccount.JSON_PROPERTY_CLIENT_SECRET,
  AzureAccount.JSON_PROPERTY_CONTAINER_APP_FILTERS,
  AzureAccount.JSON_PROPERTY_CSPM_ENABLED,
  AzureAccount.JSON_PROPERTY_CUSTOM_METRICS_ENABLED,
  AzureAccount.JSON_PROPERTY_ERRORS,
  AzureAccount.JSON_PROPERTY_HOST_FILTERS,
  AzureAccount.JSON_PROPERTY_METRICS_ENABLED,
  AzureAccount.JSON_PROPERTY_METRICS_ENABLED_DEFAULT,
  AzureAccount.JSON_PROPERTY_NEW_CLIENT_ID,
  AzureAccount.JSON_PROPERTY_NEW_TENANT_NAME,
  AzureAccount.JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED,
  AzureAccount.JSON_PROPERTY_RESOURCE_PROVIDER_CONFIGS,
  AzureAccount.JSON_PROPERTY_TENANT_NAME,
  AzureAccount.JSON_PROPERTY_USAGE_METRICS_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AzureAccount {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APP_SERVICE_PLAN_FILTERS = "app_service_plan_filters";
  private String appServicePlanFilters;

  public static final String JSON_PROPERTY_AUTOMUTE = "automute";
  private Boolean automute;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_CONTAINER_APP_FILTERS = "container_app_filters";
  private String containerAppFilters;

  public static final String JSON_PROPERTY_CSPM_ENABLED = "cspm_enabled";
  private Boolean cspmEnabled;

  public static final String JSON_PROPERTY_CUSTOM_METRICS_ENABLED = "custom_metrics_enabled";
  private Boolean customMetricsEnabled;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors = null;

  public static final String JSON_PROPERTY_HOST_FILTERS = "host_filters";
  private String hostFilters;

  public static final String JSON_PROPERTY_METRICS_ENABLED = "metrics_enabled";
  private Boolean metricsEnabled;

  public static final String JSON_PROPERTY_METRICS_ENABLED_DEFAULT = "metrics_enabled_default";
  private Boolean metricsEnabledDefault;

  public static final String JSON_PROPERTY_NEW_CLIENT_ID = "new_client_id";
  private String newClientId;

  public static final String JSON_PROPERTY_NEW_TENANT_NAME = "new_tenant_name";
  private String newTenantName;

  public static final String JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED =
      "resource_collection_enabled";
  private Boolean resourceCollectionEnabled;

  public static final String JSON_PROPERTY_RESOURCE_PROVIDER_CONFIGS = "resource_provider_configs";
  private List<ResourceProviderConfig> resourceProviderConfigs = null;

  public static final String JSON_PROPERTY_TENANT_NAME = "tenant_name";
  private String tenantName;

  public static final String JSON_PROPERTY_USAGE_METRICS_ENABLED = "usage_metrics_enabled";
  private Boolean usageMetricsEnabled;

  public AzureAccount appServicePlanFilters(String appServicePlanFilters) {
    this.appServicePlanFilters = appServicePlanFilters;
    return this;
  }

  /**
   * Limit the Azure app service plans that are pulled into Datadog using tags. Only app service
   * plans that match one of the defined tags are imported into Datadog.
   *
   * @return appServicePlanFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_SERVICE_PLAN_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAppServicePlanFilters() {
    return appServicePlanFilters;
  }

  public void setAppServicePlanFilters(String appServicePlanFilters) {
    this.appServicePlanFilters = appServicePlanFilters;
  }

  public AzureAccount automute(Boolean automute) {
    this.automute = automute;
    return this;
  }

  /**
   * Silence monitors for expected Azure VM shutdowns.
   *
   * @return automute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOMUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutomute() {
    return automute;
  }

  public void setAutomute(Boolean automute) {
    this.automute = automute;
  }

  public AzureAccount clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Your Azure web application ID.
   *
   * @return clientId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public AzureAccount clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Your Azure web application secret key.
   *
   * @return clientSecret
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public AzureAccount containerAppFilters(String containerAppFilters) {
    this.containerAppFilters = containerAppFilters;
    return this;
  }

  /**
   * Limit the Azure container apps that are pulled into Datadog using tags. Only container apps
   * that match one of the defined tags are imported into Datadog.
   *
   * @return containerAppFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_APP_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContainerAppFilters() {
    return containerAppFilters;
  }

  public void setContainerAppFilters(String containerAppFilters) {
    this.containerAppFilters = containerAppFilters;
  }

  public AzureAccount cspmEnabled(Boolean cspmEnabled) {
    this.cspmEnabled = cspmEnabled;
    return this;
  }

  /**
   * When enabled, Datadog’s Cloud Security Management product scans resource configurations
   * monitored by this app registration. Note: This requires resource_collection_enabled to be set
   * to true.
   *
   * @return cspmEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CSPM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCspmEnabled() {
    return cspmEnabled;
  }

  public void setCspmEnabled(Boolean cspmEnabled) {
    this.cspmEnabled = cspmEnabled;
  }

  public AzureAccount customMetricsEnabled(Boolean customMetricsEnabled) {
    this.customMetricsEnabled = customMetricsEnabled;
    return this;
  }

  /**
   * Enable custom metrics for your organization.
   *
   * @return customMetricsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_METRICS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCustomMetricsEnabled() {
    return customMetricsEnabled;
  }

  public void setCustomMetricsEnabled(Boolean customMetricsEnabled) {
    this.customMetricsEnabled = customMetricsEnabled;
  }

  public AzureAccount errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public AzureAccount addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Errors in your configuration.
   *
   * @return errors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  public AzureAccount hostFilters(String hostFilters) {
    this.hostFilters = hostFilters;
    return this;
  }

  /**
   * Limit the Azure instances that are pulled into Datadog by using tags. Only hosts that match one
   * of the defined tags are imported into Datadog.
   *
   * @return hostFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHostFilters() {
    return hostFilters;
  }

  public void setHostFilters(String hostFilters) {
    this.hostFilters = hostFilters;
  }

  public AzureAccount metricsEnabled(Boolean metricsEnabled) {
    this.metricsEnabled = metricsEnabled;
    return this;
  }

  /**
   * Enable Azure metrics for your organization.
   *
   * @return metricsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMetricsEnabled() {
    return metricsEnabled;
  }

  public void setMetricsEnabled(Boolean metricsEnabled) {
    this.metricsEnabled = metricsEnabled;
  }

  public AzureAccount metricsEnabledDefault(Boolean metricsEnabledDefault) {
    this.metricsEnabledDefault = metricsEnabledDefault;
    return this;
  }

  /**
   * Enable Azure metrics for your organization for resource providers where no resource provider
   * config is specified.
   *
   * @return metricsEnabledDefault
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS_ENABLED_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMetricsEnabledDefault() {
    return metricsEnabledDefault;
  }

  public void setMetricsEnabledDefault(Boolean metricsEnabledDefault) {
    this.metricsEnabledDefault = metricsEnabledDefault;
  }

  public AzureAccount newClientId(String newClientId) {
    this.newClientId = newClientId;
    return this;
  }

  /**
   * Your New Azure web application ID.
   *
   * @return newClientId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNewClientId() {
    return newClientId;
  }

  public void setNewClientId(String newClientId) {
    this.newClientId = newClientId;
  }

  public AzureAccount newTenantName(String newTenantName) {
    this.newTenantName = newTenantName;
    return this;
  }

  /**
   * Your New Azure Active Directory ID.
   *
   * @return newTenantName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNewTenantName() {
    return newTenantName;
  }

  public void setNewTenantName(String newTenantName) {
    this.newTenantName = newTenantName;
  }

  public AzureAccount resourceCollectionEnabled(Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
    return this;
  }

  /**
   * When enabled, Datadog collects metadata and configuration info from cloud resources (compute
   * instances, databases, load balancers, etc.) monitored by this app registration.
   *
   * @return resourceCollectionEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getResourceCollectionEnabled() {
    return resourceCollectionEnabled;
  }

  public void setResourceCollectionEnabled(Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
  }

  public AzureAccount resourceProviderConfigs(
      List<ResourceProviderConfig> resourceProviderConfigs) {
    this.resourceProviderConfigs = resourceProviderConfigs;
    for (ResourceProviderConfig item : resourceProviderConfigs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AzureAccount addResourceProviderConfigsItem(
      ResourceProviderConfig resourceProviderConfigsItem) {
    if (this.resourceProviderConfigs == null) {
      this.resourceProviderConfigs = new ArrayList<>();
    }
    this.resourceProviderConfigs.add(resourceProviderConfigsItem);
    this.unparsed |= resourceProviderConfigsItem.unparsed;
    return this;
  }

  /**
   * Configuration settings applied to resources from the specified Azure resource providers.
   *
   * @return resourceProviderConfigs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_PROVIDER_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ResourceProviderConfig> getResourceProviderConfigs() {
    return resourceProviderConfigs;
  }

  public void setResourceProviderConfigs(List<ResourceProviderConfig> resourceProviderConfigs) {
    this.resourceProviderConfigs = resourceProviderConfigs;
  }

  public AzureAccount tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * Your Azure Active Directory ID.
   *
   * @return tenantName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public AzureAccount usageMetricsEnabled(Boolean usageMetricsEnabled) {
    this.usageMetricsEnabled = usageMetricsEnabled;
    return this;
  }

  /**
   * Enable azure.usage metrics for your organization.
   *
   * @return usageMetricsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_METRICS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUsageMetricsEnabled() {
    return usageMetricsEnabled;
  }

  public void setUsageMetricsEnabled(Boolean usageMetricsEnabled) {
    this.usageMetricsEnabled = usageMetricsEnabled;
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
   * @return AzureAccount
   */
  @JsonAnySetter
  public AzureAccount putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AzureAccount object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureAccount azureAccount = (AzureAccount) o;
    return Objects.equals(this.appServicePlanFilters, azureAccount.appServicePlanFilters)
        && Objects.equals(this.automute, azureAccount.automute)
        && Objects.equals(this.clientId, azureAccount.clientId)
        && Objects.equals(this.clientSecret, azureAccount.clientSecret)
        && Objects.equals(this.containerAppFilters, azureAccount.containerAppFilters)
        && Objects.equals(this.cspmEnabled, azureAccount.cspmEnabled)
        && Objects.equals(this.customMetricsEnabled, azureAccount.customMetricsEnabled)
        && Objects.equals(this.errors, azureAccount.errors)
        && Objects.equals(this.hostFilters, azureAccount.hostFilters)
        && Objects.equals(this.metricsEnabled, azureAccount.metricsEnabled)
        && Objects.equals(this.metricsEnabledDefault, azureAccount.metricsEnabledDefault)
        && Objects.equals(this.newClientId, azureAccount.newClientId)
        && Objects.equals(this.newTenantName, azureAccount.newTenantName)
        && Objects.equals(this.resourceCollectionEnabled, azureAccount.resourceCollectionEnabled)
        && Objects.equals(this.resourceProviderConfigs, azureAccount.resourceProviderConfigs)
        && Objects.equals(this.tenantName, azureAccount.tenantName)
        && Objects.equals(this.usageMetricsEnabled, azureAccount.usageMetricsEnabled)
        && Objects.equals(this.additionalProperties, azureAccount.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        appServicePlanFilters,
        automute,
        clientId,
        clientSecret,
        containerAppFilters,
        cspmEnabled,
        customMetricsEnabled,
        errors,
        hostFilters,
        metricsEnabled,
        metricsEnabledDefault,
        newClientId,
        newTenantName,
        resourceCollectionEnabled,
        resourceProviderConfigs,
        tenantName,
        usageMetricsEnabled,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureAccount {\n");
    sb.append("    appServicePlanFilters: ")
        .append(toIndentedString(appServicePlanFilters))
        .append("\n");
    sb.append("    automute: ").append(toIndentedString(automute)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    containerAppFilters: ")
        .append(toIndentedString(containerAppFilters))
        .append("\n");
    sb.append("    cspmEnabled: ").append(toIndentedString(cspmEnabled)).append("\n");
    sb.append("    customMetricsEnabled: ")
        .append(toIndentedString(customMetricsEnabled))
        .append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    hostFilters: ").append(toIndentedString(hostFilters)).append("\n");
    sb.append("    metricsEnabled: ").append(toIndentedString(metricsEnabled)).append("\n");
    sb.append("    metricsEnabledDefault: ")
        .append(toIndentedString(metricsEnabledDefault))
        .append("\n");
    sb.append("    newClientId: ").append(toIndentedString(newClientId)).append("\n");
    sb.append("    newTenantName: ").append(toIndentedString(newTenantName)).append("\n");
    sb.append("    resourceCollectionEnabled: ")
        .append(toIndentedString(resourceCollectionEnabled))
        .append("\n");
    sb.append("    resourceProviderConfigs: ")
        .append(toIndentedString(resourceProviderConfigs))
        .append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    usageMetricsEnabled: ")
        .append(toIndentedString(usageMetricsEnabled))
        .append("\n");
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
