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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes associated with your service account. */
@JsonPropertyOrder({
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_ACCOUNT_TAGS,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_AUTOMUTE,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_CLIENT_EMAIL,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_CLOUD_RUN_REVISION_FILTERS,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_HOST_FILTERS,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_IS_CSPM_ENABLED,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_IS_GLOBAL_LOCATION_ENABLED,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_IS_PER_PROJECT_QUOTA_ENABLED,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_IS_RESOURCE_CHANGE_COLLECTION_ENABLED,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_IS_SECURITY_COMMAND_CENTER_ENABLED,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_METRIC_NAMESPACE_CONFIGS,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_MONITORED_RESOURCE_CONFIGS,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_REGION_FILTER_CONFIGS,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPSTSServiceAccountAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_TAGS = "account_tags";
  private List<String> accountTags = null;

  public static final String JSON_PROPERTY_AUTOMUTE = "automute";
  private Boolean automute;

  public static final String JSON_PROPERTY_CLIENT_EMAIL = "client_email";
  private String clientEmail;

  public static final String JSON_PROPERTY_CLOUD_RUN_REVISION_FILTERS =
      "cloud_run_revision_filters";
  private List<String> cloudRunRevisionFilters = null;

  public static final String JSON_PROPERTY_HOST_FILTERS = "host_filters";
  private List<String> hostFilters = null;

  public static final String JSON_PROPERTY_IS_CSPM_ENABLED = "is_cspm_enabled";
  private Boolean isCspmEnabled;

  public static final String JSON_PROPERTY_IS_GLOBAL_LOCATION_ENABLED =
      "is_global_location_enabled";
  private Boolean isGlobalLocationEnabled = true;

  public static final String JSON_PROPERTY_IS_PER_PROJECT_QUOTA_ENABLED =
      "is_per_project_quota_enabled";
  private Boolean isPerProjectQuotaEnabled = false;

  public static final String JSON_PROPERTY_IS_RESOURCE_CHANGE_COLLECTION_ENABLED =
      "is_resource_change_collection_enabled";
  private Boolean isResourceChangeCollectionEnabled = false;

  public static final String JSON_PROPERTY_IS_SECURITY_COMMAND_CENTER_ENABLED =
      "is_security_command_center_enabled";
  private Boolean isSecurityCommandCenterEnabled = false;

  public static final String JSON_PROPERTY_METRIC_NAMESPACE_CONFIGS = "metric_namespace_configs";
  private List<GCPMetricNamespaceConfig> metricNamespaceConfigs = null;

  public static final String JSON_PROPERTY_MONITORED_RESOURCE_CONFIGS =
      "monitored_resource_configs";
  private List<GCPMonitoredResourceConfig> monitoredResourceConfigs = null;

  public static final String JSON_PROPERTY_REGION_FILTER_CONFIGS = "region_filter_configs";
  private List<String> regionFilterConfigs = null;

  public static final String JSON_PROPERTY_RESOURCE_COLLECTION_ENABLED =
      "resource_collection_enabled";
  private Boolean resourceCollectionEnabled;

  public GCPSTSServiceAccountAttributes accountTags(List<String> accountTags) {
    this.accountTags = accountTags;
    return this;
  }

  public GCPSTSServiceAccountAttributes addAccountTagsItem(String accountTagsItem) {
    if (this.accountTags == null) {
      this.accountTags = new ArrayList<>();
    }
    this.accountTags.add(accountTagsItem);
    return this;
  }

  /**
   * Tags to be associated with GCP metrics and service checks from your account.
   *
   * @return accountTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAccountTags() {
    return accountTags;
  }

  public void setAccountTags(List<String> accountTags) {
    this.accountTags = accountTags;
  }

  public GCPSTSServiceAccountAttributes automute(Boolean automute) {
    this.automute = automute;
    return this;
  }

  /**
   * Silence monitors for expected GCE instance shutdowns.
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

  public GCPSTSServiceAccountAttributes clientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
    return this;
  }

  /**
   * Your service account email address.
   *
   * @return clientEmail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientEmail() {
    return clientEmail;
  }

  public void setClientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
  }

  public GCPSTSServiceAccountAttributes cloudRunRevisionFilters(
      List<String> cloudRunRevisionFilters) {
    this.cloudRunRevisionFilters = cloudRunRevisionFilters;
    return this;
  }

  public GCPSTSServiceAccountAttributes addCloudRunRevisionFiltersItem(
      String cloudRunRevisionFiltersItem) {
    if (this.cloudRunRevisionFilters == null) {
      this.cloudRunRevisionFilters = new ArrayList<>();
    }
    this.cloudRunRevisionFilters.add(cloudRunRevisionFiltersItem);
    return this;
  }

  /**
   * List of filters to limit the Cloud Run revisions that are pulled into Datadog by using tags.
   * Only Cloud Run revision resources that apply to specified filters are imported into Datadog.
   * <strong>Note:</strong> This field is deprecated. Instead, use <code>monitored_resource_configs
   * </code> with <code>type=cloud_run_revision</code>
   *
   * @return cloudRunRevisionFilters
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_RUN_REVISION_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCloudRunRevisionFilters() {
    return cloudRunRevisionFilters;
  }

  @Deprecated
  public void setCloudRunRevisionFilters(List<String> cloudRunRevisionFilters) {
    this.cloudRunRevisionFilters = cloudRunRevisionFilters;
  }

  public GCPSTSServiceAccountAttributes hostFilters(List<String> hostFilters) {
    this.hostFilters = hostFilters;
    return this;
  }

  public GCPSTSServiceAccountAttributes addHostFiltersItem(String hostFiltersItem) {
    if (this.hostFilters == null) {
      this.hostFilters = new ArrayList<>();
    }
    this.hostFilters.add(hostFiltersItem);
    return this;
  }

  /**
   * List of filters to limit the VM instances that are pulled into Datadog by using tags. Only VM
   * instance resources that apply to specified filters are imported into Datadog.
   * <strong>Note:</strong> This field is deprecated. Instead, use <code>monitored_resource_configs
   * </code> with <code>type=gce_instance</code>
   *
   * @return hostFilters
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getHostFilters() {
    return hostFilters;
  }

  @Deprecated
  public void setHostFilters(List<String> hostFilters) {
    this.hostFilters = hostFilters;
  }

  public GCPSTSServiceAccountAttributes isCspmEnabled(Boolean isCspmEnabled) {
    this.isCspmEnabled = isCspmEnabled;
    return this;
  }

  /**
   * When enabled, Datadog will activate the Cloud Security Monitoring product for this service
   * account. Note: This requires resource_collection_enabled to be set to true.
   *
   * @return isCspmEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CSPM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsCspmEnabled() {
    return isCspmEnabled;
  }

  public void setIsCspmEnabled(Boolean isCspmEnabled) {
    this.isCspmEnabled = isCspmEnabled;
  }

  public GCPSTSServiceAccountAttributes isGlobalLocationEnabled(Boolean isGlobalLocationEnabled) {
    this.isGlobalLocationEnabled = isGlobalLocationEnabled;
    return this;
  }

  /**
   * When enabled, Datadog collects metrics where location is explicitly stated as "global" or where
   * location information cannot be deduced from GCP labels.
   *
   * @return isGlobalLocationEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_GLOBAL_LOCATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsGlobalLocationEnabled() {
    return isGlobalLocationEnabled;
  }

  public void setIsGlobalLocationEnabled(Boolean isGlobalLocationEnabled) {
    this.isGlobalLocationEnabled = isGlobalLocationEnabled;
  }

  public GCPSTSServiceAccountAttributes isPerProjectQuotaEnabled(Boolean isPerProjectQuotaEnabled) {
    this.isPerProjectQuotaEnabled = isPerProjectQuotaEnabled;
    return this;
  }

  /**
   * When enabled, Datadog applies the <code>X-Goog-User-Project</code> header, attributing Google
   * Cloud billing and quota usage to the project being monitored rather than the default service
   * account project.
   *
   * @return isPerProjectQuotaEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PER_PROJECT_QUOTA_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsPerProjectQuotaEnabled() {
    return isPerProjectQuotaEnabled;
  }

  public void setIsPerProjectQuotaEnabled(Boolean isPerProjectQuotaEnabled) {
    this.isPerProjectQuotaEnabled = isPerProjectQuotaEnabled;
  }

  public GCPSTSServiceAccountAttributes isResourceChangeCollectionEnabled(
      Boolean isResourceChangeCollectionEnabled) {
    this.isResourceChangeCollectionEnabled = isResourceChangeCollectionEnabled;
    return this;
  }

  /**
   * When enabled, Datadog scans for all resource change data in your Google Cloud environment.
   *
   * @return isResourceChangeCollectionEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_RESOURCE_CHANGE_COLLECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsResourceChangeCollectionEnabled() {
    return isResourceChangeCollectionEnabled;
  }

  public void setIsResourceChangeCollectionEnabled(Boolean isResourceChangeCollectionEnabled) {
    this.isResourceChangeCollectionEnabled = isResourceChangeCollectionEnabled;
  }

  public GCPSTSServiceAccountAttributes isSecurityCommandCenterEnabled(
      Boolean isSecurityCommandCenterEnabled) {
    this.isSecurityCommandCenterEnabled = isSecurityCommandCenterEnabled;
    return this;
  }

  /**
   * When enabled, Datadog will attempt to collect Security Command Center Findings. Note: This
   * requires additional permissions on the service account.
   *
   * @return isSecurityCommandCenterEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SECURITY_COMMAND_CENTER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsSecurityCommandCenterEnabled() {
    return isSecurityCommandCenterEnabled;
  }

  public void setIsSecurityCommandCenterEnabled(Boolean isSecurityCommandCenterEnabled) {
    this.isSecurityCommandCenterEnabled = isSecurityCommandCenterEnabled;
  }

  public GCPSTSServiceAccountAttributes metricNamespaceConfigs(
      List<GCPMetricNamespaceConfig> metricNamespaceConfigs) {
    this.metricNamespaceConfigs = metricNamespaceConfigs;
    for (GCPMetricNamespaceConfig item : metricNamespaceConfigs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GCPSTSServiceAccountAttributes addMetricNamespaceConfigsItem(
      GCPMetricNamespaceConfig metricNamespaceConfigsItem) {
    if (this.metricNamespaceConfigs == null) {
      this.metricNamespaceConfigs = new ArrayList<>();
    }
    this.metricNamespaceConfigs.add(metricNamespaceConfigsItem);
    this.unparsed |= metricNamespaceConfigsItem.unparsed;
    return this;
  }

  /**
   * Configurations for GCP metric namespaces.
   *
   * @return metricNamespaceConfigs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_NAMESPACE_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GCPMetricNamespaceConfig> getMetricNamespaceConfigs() {
    return metricNamespaceConfigs;
  }

  public void setMetricNamespaceConfigs(List<GCPMetricNamespaceConfig> metricNamespaceConfigs) {
    this.metricNamespaceConfigs = metricNamespaceConfigs;
  }

  public GCPSTSServiceAccountAttributes monitoredResourceConfigs(
      List<GCPMonitoredResourceConfig> monitoredResourceConfigs) {
    this.monitoredResourceConfigs = monitoredResourceConfigs;
    for (GCPMonitoredResourceConfig item : monitoredResourceConfigs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GCPSTSServiceAccountAttributes addMonitoredResourceConfigsItem(
      GCPMonitoredResourceConfig monitoredResourceConfigsItem) {
    if (this.monitoredResourceConfigs == null) {
      this.monitoredResourceConfigs = new ArrayList<>();
    }
    this.monitoredResourceConfigs.add(monitoredResourceConfigsItem);
    this.unparsed |= monitoredResourceConfigsItem.unparsed;
    return this;
  }

  /**
   * Configurations for GCP monitored resources.
   *
   * @return monitoredResourceConfigs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORED_RESOURCE_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GCPMonitoredResourceConfig> getMonitoredResourceConfigs() {
    return monitoredResourceConfigs;
  }

  public void setMonitoredResourceConfigs(
      List<GCPMonitoredResourceConfig> monitoredResourceConfigs) {
    this.monitoredResourceConfigs = monitoredResourceConfigs;
  }

  public GCPSTSServiceAccountAttributes regionFilterConfigs(List<String> regionFilterConfigs) {
    this.regionFilterConfigs = regionFilterConfigs;
    return this;
  }

  public GCPSTSServiceAccountAttributes addRegionFilterConfigsItem(String regionFilterConfigsItem) {
    if (this.regionFilterConfigs == null) {
      this.regionFilterConfigs = new ArrayList<>();
    }
    this.regionFilterConfigs.add(regionFilterConfigsItem);
    return this;
  }

  /**
   * Configurations for GCP location filtering, such as region, multi-region, or zone. Only
   * monitored resources that match the specified regions are imported into Datadog. By default,
   * Datadog collects from all locations.
   *
   * @return regionFilterConfigs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION_FILTER_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRegionFilterConfigs() {
    return regionFilterConfigs;
  }

  public void setRegionFilterConfigs(List<String> regionFilterConfigs) {
    this.regionFilterConfigs = regionFilterConfigs;
  }

  public GCPSTSServiceAccountAttributes resourceCollectionEnabled(
      Boolean resourceCollectionEnabled) {
    this.resourceCollectionEnabled = resourceCollectionEnabled;
    return this;
  }

  /**
   * When enabled, Datadog scans for all resources in your GCP environment.
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
   * @return GCPSTSServiceAccountAttributes
   */
  @JsonAnySetter
  public GCPSTSServiceAccountAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GCPSTSServiceAccountAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPSTSServiceAccountAttributes gcpstsServiceAccountAttributes =
        (GCPSTSServiceAccountAttributes) o;
    return Objects.equals(this.accountTags, gcpstsServiceAccountAttributes.accountTags)
        && Objects.equals(this.automute, gcpstsServiceAccountAttributes.automute)
        && Objects.equals(this.clientEmail, gcpstsServiceAccountAttributes.clientEmail)
        && Objects.equals(
            this.cloudRunRevisionFilters, gcpstsServiceAccountAttributes.cloudRunRevisionFilters)
        && Objects.equals(this.hostFilters, gcpstsServiceAccountAttributes.hostFilters)
        && Objects.equals(this.isCspmEnabled, gcpstsServiceAccountAttributes.isCspmEnabled)
        && Objects.equals(
            this.isGlobalLocationEnabled, gcpstsServiceAccountAttributes.isGlobalLocationEnabled)
        && Objects.equals(
            this.isPerProjectQuotaEnabled, gcpstsServiceAccountAttributes.isPerProjectQuotaEnabled)
        && Objects.equals(
            this.isResourceChangeCollectionEnabled,
            gcpstsServiceAccountAttributes.isResourceChangeCollectionEnabled)
        && Objects.equals(
            this.isSecurityCommandCenterEnabled,
            gcpstsServiceAccountAttributes.isSecurityCommandCenterEnabled)
        && Objects.equals(
            this.metricNamespaceConfigs, gcpstsServiceAccountAttributes.metricNamespaceConfigs)
        && Objects.equals(
            this.monitoredResourceConfigs, gcpstsServiceAccountAttributes.monitoredResourceConfigs)
        && Objects.equals(
            this.regionFilterConfigs, gcpstsServiceAccountAttributes.regionFilterConfigs)
        && Objects.equals(
            this.resourceCollectionEnabled,
            gcpstsServiceAccountAttributes.resourceCollectionEnabled)
        && Objects.equals(
            this.additionalProperties, gcpstsServiceAccountAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountTags,
        automute,
        clientEmail,
        cloudRunRevisionFilters,
        hostFilters,
        isCspmEnabled,
        isGlobalLocationEnabled,
        isPerProjectQuotaEnabled,
        isResourceChangeCollectionEnabled,
        isSecurityCommandCenterEnabled,
        metricNamespaceConfigs,
        monitoredResourceConfigs,
        regionFilterConfigs,
        resourceCollectionEnabled,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPSTSServiceAccountAttributes {\n");
    sb.append("    accountTags: ").append(toIndentedString(accountTags)).append("\n");
    sb.append("    automute: ").append(toIndentedString(automute)).append("\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
    sb.append("    cloudRunRevisionFilters: ")
        .append(toIndentedString(cloudRunRevisionFilters))
        .append("\n");
    sb.append("    hostFilters: ").append(toIndentedString(hostFilters)).append("\n");
    sb.append("    isCspmEnabled: ").append(toIndentedString(isCspmEnabled)).append("\n");
    sb.append("    isGlobalLocationEnabled: ")
        .append(toIndentedString(isGlobalLocationEnabled))
        .append("\n");
    sb.append("    isPerProjectQuotaEnabled: ")
        .append(toIndentedString(isPerProjectQuotaEnabled))
        .append("\n");
    sb.append("    isResourceChangeCollectionEnabled: ")
        .append(toIndentedString(isResourceChangeCollectionEnabled))
        .append("\n");
    sb.append("    isSecurityCommandCenterEnabled: ")
        .append(toIndentedString(isSecurityCommandCenterEnabled))
        .append("\n");
    sb.append("    metricNamespaceConfigs: ")
        .append(toIndentedString(metricNamespaceConfigs))
        .append("\n");
    sb.append("    monitoredResourceConfigs: ")
        .append(toIndentedString(monitoredResourceConfigs))
        .append("\n");
    sb.append("    regionFilterConfigs: ")
        .append(toIndentedString(regionFilterConfigs))
        .append("\n");
    sb.append("    resourceCollectionEnabled: ")
        .append(toIndentedString(resourceCollectionEnabled))
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
