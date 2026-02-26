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

/** Detailed information about a Datadog Agent. */
@JsonPropertyOrder({
  FleetAgentInfoDetails.JSON_PROPERTY_AGENT_VERSION,
  FleetAgentInfoDetails.JSON_PROPERTY_API_KEY_NAME,
  FleetAgentInfoDetails.JSON_PROPERTY_API_KEY_UUID,
  FleetAgentInfoDetails.JSON_PROPERTY_CLOUD_PROVIDER,
  FleetAgentInfoDetails.JSON_PROPERTY_CLUSTER_NAME,
  FleetAgentInfoDetails.JSON_PROPERTY_DATADOG_AGENT_KEY,
  FleetAgentInfoDetails.JSON_PROPERTY_ENABLED_PRODUCTS,
  FleetAgentInfoDetails.JSON_PROPERTY_ENV,
  FleetAgentInfoDetails.JSON_PROPERTY_FIRST_SEEN_AT,
  FleetAgentInfoDetails.JSON_PROPERTY_HOSTNAME,
  FleetAgentInfoDetails.JSON_PROPERTY_HOSTNAME_ALIASES,
  FleetAgentInfoDetails.JSON_PROPERTY_INSTALL_METHOD_INSTALLER_VERSION,
  FleetAgentInfoDetails.JSON_PROPERTY_INSTALL_METHOD_TOOL,
  FleetAgentInfoDetails.JSON_PROPERTY_IP_ADDRESSES,
  FleetAgentInfoDetails.JSON_PROPERTY_IS_SINGLE_STEP_INSTRUMENTATION_ENABLED,
  FleetAgentInfoDetails.JSON_PROPERTY_LAST_RESTART_AT,
  FleetAgentInfoDetails.JSON_PROPERTY_OS,
  FleetAgentInfoDetails.JSON_PROPERTY_OS_VERSION,
  FleetAgentInfoDetails.JSON_PROPERTY_OTEL_COLLECTOR_VERSION,
  FleetAgentInfoDetails.JSON_PROPERTY_OTEL_COLLECTOR_VERSIONS,
  FleetAgentInfoDetails.JSON_PROPERTY_OTEL_COLLECTORS,
  FleetAgentInfoDetails.JSON_PROPERTY_POD_NAME,
  FleetAgentInfoDetails.JSON_PROPERTY_PYTHON_VERSION,
  FleetAgentInfoDetails.JSON_PROPERTY_REGION,
  FleetAgentInfoDetails.JSON_PROPERTY_REMOTE_AGENT_MANAGEMENT,
  FleetAgentInfoDetails.JSON_PROPERTY_REMOTE_CONFIG_STATUS,
  FleetAgentInfoDetails.JSON_PROPERTY_SERVICES,
  FleetAgentInfoDetails.JSON_PROPERTY_TAGS,
  FleetAgentInfoDetails.JSON_PROPERTY_TEAM
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetAgentInfoDetails {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_VERSION = "agent_version";
  private String agentVersion;

  public static final String JSON_PROPERTY_API_KEY_NAME = "api_key_name";
  private String apiKeyName;

  public static final String JSON_PROPERTY_API_KEY_UUID = "api_key_uuid";
  private String apiKeyUuid;

  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private String cloudProvider;

  public static final String JSON_PROPERTY_CLUSTER_NAME = "cluster_name";
  private String clusterName;

  public static final String JSON_PROPERTY_DATADOG_AGENT_KEY = "datadog_agent_key";
  private String datadogAgentKey;

  public static final String JSON_PROPERTY_ENABLED_PRODUCTS = "enabled_products";
  private List<String> enabledProducts = null;

  public static final String JSON_PROPERTY_ENV = "env";
  private List<String> env = null;

  public static final String JSON_PROPERTY_FIRST_SEEN_AT = "first_seen_at";
  private Long firstSeenAt;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_HOSTNAME_ALIASES = "hostname_aliases";
  private List<String> hostnameAliases = null;

  public static final String JSON_PROPERTY_INSTALL_METHOD_INSTALLER_VERSION =
      "install_method_installer_version";
  private String installMethodInstallerVersion;

  public static final String JSON_PROPERTY_INSTALL_METHOD_TOOL = "install_method_tool";
  private String installMethodTool;

  public static final String JSON_PROPERTY_IP_ADDRESSES = "ip_addresses";
  private List<String> ipAddresses = null;

  public static final String JSON_PROPERTY_IS_SINGLE_STEP_INSTRUMENTATION_ENABLED =
      "is_single_step_instrumentation_enabled";
  private Boolean isSingleStepInstrumentationEnabled;

  public static final String JSON_PROPERTY_LAST_RESTART_AT = "last_restart_at";
  private Long lastRestartAt;

  public static final String JSON_PROPERTY_OS = "os";
  private String os;

  public static final String JSON_PROPERTY_OS_VERSION = "os_version";
  private String osVersion;

  public static final String JSON_PROPERTY_OTEL_COLLECTOR_VERSION = "otel_collector_version";
  private String otelCollectorVersion;

  public static final String JSON_PROPERTY_OTEL_COLLECTOR_VERSIONS = "otel_collector_versions";
  private List<String> otelCollectorVersions = null;

  public static final String JSON_PROPERTY_OTEL_COLLECTORS = "otel_collectors";
  private List<Map<String, Object>> otelCollectors = null;

  public static final String JSON_PROPERTY_POD_NAME = "pod_name";
  private String podName;

  public static final String JSON_PROPERTY_PYTHON_VERSION = "python_version";
  private String pythonVersion;

  public static final String JSON_PROPERTY_REGION = "region";
  private List<String> region = null;

  public static final String JSON_PROPERTY_REMOTE_AGENT_MANAGEMENT = "remote_agent_management";
  private String remoteAgentManagement;

  public static final String JSON_PROPERTY_REMOTE_CONFIG_STATUS = "remote_config_status";
  private String remoteConfigStatus;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<String> services = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEAM = "team";
  private String team;

  public FleetAgentInfoDetails agentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
    return this;
  }

  /**
   * The Datadog Agent version.
   *
   * @return agentVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAgentVersion() {
    return agentVersion;
  }

  public void setAgentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
  }

  public FleetAgentInfoDetails apiKeyName(String apiKeyName) {
    this.apiKeyName = apiKeyName;
    return this;
  }

  /**
   * The API key name (if available and not redacted).
   *
   * @return apiKeyName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApiKeyName() {
    return apiKeyName;
  }

  public void setApiKeyName(String apiKeyName) {
    this.apiKeyName = apiKeyName;
  }

  public FleetAgentInfoDetails apiKeyUuid(String apiKeyUuid) {
    this.apiKeyUuid = apiKeyUuid;
    return this;
  }

  /**
   * The API key UUID.
   *
   * @return apiKeyUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApiKeyUuid() {
    return apiKeyUuid;
  }

  public void setApiKeyUuid(String apiKeyUuid) {
    this.apiKeyUuid = apiKeyUuid;
  }

  public FleetAgentInfoDetails cloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

  /**
   * The cloud provider where the agent is running.
   *
   * @return cloudProvider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  public FleetAgentInfoDetails clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * Kubernetes cluster name (if applicable).
   *
   * @return clusterName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public FleetAgentInfoDetails datadogAgentKey(String datadogAgentKey) {
    this.datadogAgentKey = datadogAgentKey;
    return this;
  }

  /**
   * The unique agent key identifier.
   *
   * @return datadogAgentKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATADOG_AGENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDatadogAgentKey() {
    return datadogAgentKey;
  }

  public void setDatadogAgentKey(String datadogAgentKey) {
    this.datadogAgentKey = datadogAgentKey;
  }

  public FleetAgentInfoDetails enabledProducts(List<String> enabledProducts) {
    this.enabledProducts = enabledProducts;
    return this;
  }

  public FleetAgentInfoDetails addEnabledProductsItem(String enabledProductsItem) {
    if (this.enabledProducts == null) {
      this.enabledProducts = new ArrayList<>();
    }
    this.enabledProducts.add(enabledProductsItem);
    return this;
  }

  /**
   * Datadog products enabled on the agent.
   *
   * @return enabledProducts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnabledProducts() {
    return enabledProducts;
  }

  public void setEnabledProducts(List<String> enabledProducts) {
    this.enabledProducts = enabledProducts;
  }

  public FleetAgentInfoDetails env(List<String> env) {
    this.env = env;
    return this;
  }

  public FleetAgentInfoDetails addEnvItem(String envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * Environments the agent is reporting from.
   *
   * @return env
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }

  public FleetAgentInfoDetails firstSeenAt(Long firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
    return this;
  }

  /**
   * Timestamp when the agent was first seen.
   *
   * @return firstSeenAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_SEEN_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFirstSeenAt() {
    return firstSeenAt;
  }

  public void setFirstSeenAt(Long firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
  }

  public FleetAgentInfoDetails hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * The hostname of the agent.
   *
   * @return hostname
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public FleetAgentInfoDetails hostnameAliases(List<String> hostnameAliases) {
    this.hostnameAliases = hostnameAliases;
    return this;
  }

  public FleetAgentInfoDetails addHostnameAliasesItem(String hostnameAliasesItem) {
    if (this.hostnameAliases == null) {
      this.hostnameAliases = new ArrayList<>();
    }
    this.hostnameAliases.add(hostnameAliasesItem);
    return this;
  }

  /**
   * Alternative hostname list for the agent.
   *
   * @return hostnameAliases
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTNAME_ALIASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getHostnameAliases() {
    return hostnameAliases;
  }

  public void setHostnameAliases(List<String> hostnameAliases) {
    this.hostnameAliases = hostnameAliases;
  }

  public FleetAgentInfoDetails installMethodInstallerVersion(String installMethodInstallerVersion) {
    this.installMethodInstallerVersion = installMethodInstallerVersion;
    return this;
  }

  /**
   * The version of the installer used.
   *
   * @return installMethodInstallerVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALL_METHOD_INSTALLER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInstallMethodInstallerVersion() {
    return installMethodInstallerVersion;
  }

  public void setInstallMethodInstallerVersion(String installMethodInstallerVersion) {
    this.installMethodInstallerVersion = installMethodInstallerVersion;
  }

  public FleetAgentInfoDetails installMethodTool(String installMethodTool) {
    this.installMethodTool = installMethodTool;
    return this;
  }

  /**
   * The tool used to install the agent.
   *
   * @return installMethodTool
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALL_METHOD_TOOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInstallMethodTool() {
    return installMethodTool;
  }

  public void setInstallMethodTool(String installMethodTool) {
    this.installMethodTool = installMethodTool;
  }

  public FleetAgentInfoDetails ipAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public FleetAgentInfoDetails addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

  /**
   * IP addresses of the agent.
   *
   * @return ipAddresses
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  public FleetAgentInfoDetails isSingleStepInstrumentationEnabled(
      Boolean isSingleStepInstrumentationEnabled) {
    this.isSingleStepInstrumentationEnabled = isSingleStepInstrumentationEnabled;
    return this;
  }

  /**
   * Whether single-step instrumentation is enabled.
   *
   * @return isSingleStepInstrumentationEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SINGLE_STEP_INSTRUMENTATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsSingleStepInstrumentationEnabled() {
    return isSingleStepInstrumentationEnabled;
  }

  public void setIsSingleStepInstrumentationEnabled(Boolean isSingleStepInstrumentationEnabled) {
    this.isSingleStepInstrumentationEnabled = isSingleStepInstrumentationEnabled;
  }

  public FleetAgentInfoDetails lastRestartAt(Long lastRestartAt) {
    this.lastRestartAt = lastRestartAt;
    return this;
  }

  /**
   * Timestamp of the last agent restart.
   *
   * @return lastRestartAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_RESTART_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastRestartAt() {
    return lastRestartAt;
  }

  public void setLastRestartAt(Long lastRestartAt) {
    this.lastRestartAt = lastRestartAt;
  }

  public FleetAgentInfoDetails os(String os) {
    this.os = os;
    return this;
  }

  /**
   * The operating system.
   *
   * @return os
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public FleetAgentInfoDetails osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * The operating system version.
   *
   * @return osVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public FleetAgentInfoDetails otelCollectorVersion(String otelCollectorVersion) {
    this.otelCollectorVersion = otelCollectorVersion;
    return this;
  }

  /**
   * OpenTelemetry collector version (if applicable).
   *
   * @return otelCollectorVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTEL_COLLECTOR_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOtelCollectorVersion() {
    return otelCollectorVersion;
  }

  public void setOtelCollectorVersion(String otelCollectorVersion) {
    this.otelCollectorVersion = otelCollectorVersion;
  }

  public FleetAgentInfoDetails otelCollectorVersions(List<String> otelCollectorVersions) {
    this.otelCollectorVersions = otelCollectorVersions;
    return this;
  }

  public FleetAgentInfoDetails addOtelCollectorVersionsItem(String otelCollectorVersionsItem) {
    if (this.otelCollectorVersions == null) {
      this.otelCollectorVersions = new ArrayList<>();
    }
    this.otelCollectorVersions.add(otelCollectorVersionsItem);
    return this;
  }

  /**
   * List of OpenTelemetry collector versions (if applicable).
   *
   * @return otelCollectorVersions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTEL_COLLECTOR_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getOtelCollectorVersions() {
    return otelCollectorVersions;
  }

  public void setOtelCollectorVersions(List<String> otelCollectorVersions) {
    this.otelCollectorVersions = otelCollectorVersions;
  }

  public FleetAgentInfoDetails otelCollectors(List<Map<String, Object>> otelCollectors) {
    this.otelCollectors = otelCollectors;
    return this;
  }

  public FleetAgentInfoDetails addOtelCollectorsItem(Map<String, Object> otelCollectorsItem) {
    if (this.otelCollectors == null) {
      this.otelCollectors = new ArrayList<>();
    }
    this.otelCollectors.add(otelCollectorsItem);
    return this;
  }

  /**
   * OpenTelemetry collectors associated with the agent (if applicable).
   *
   * @return otelCollectors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTEL_COLLECTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Map<String, Object>> getOtelCollectors() {
    return otelCollectors;
  }

  public void setOtelCollectors(List<Map<String, Object>> otelCollectors) {
    this.otelCollectors = otelCollectors;
  }

  public FleetAgentInfoDetails podName(String podName) {
    this.podName = podName;
    return this;
  }

  /**
   * Kubernetes pod name (if applicable).
   *
   * @return podName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPodName() {
    return podName;
  }

  public void setPodName(String podName) {
    this.podName = podName;
  }

  public FleetAgentInfoDetails pythonVersion(String pythonVersion) {
    this.pythonVersion = pythonVersion;
    return this;
  }

  /**
   * The Python version used by the agent.
   *
   * @return pythonVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PYTHON_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPythonVersion() {
    return pythonVersion;
  }

  public void setPythonVersion(String pythonVersion) {
    this.pythonVersion = pythonVersion;
  }

  public FleetAgentInfoDetails region(List<String> region) {
    this.region = region;
    return this;
  }

  public FleetAgentInfoDetails addRegionItem(String regionItem) {
    if (this.region == null) {
      this.region = new ArrayList<>();
    }
    this.region.add(regionItem);
    return this;
  }

  /**
   * Regions where the agent is running.
   *
   * @return region
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRegion() {
    return region;
  }

  public void setRegion(List<String> region) {
    this.region = region;
  }

  public FleetAgentInfoDetails remoteAgentManagement(String remoteAgentManagement) {
    this.remoteAgentManagement = remoteAgentManagement;
    return this;
  }

  /**
   * Remote agent management status.
   *
   * @return remoteAgentManagement
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_AGENT_MANAGEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRemoteAgentManagement() {
    return remoteAgentManagement;
  }

  public void setRemoteAgentManagement(String remoteAgentManagement) {
    this.remoteAgentManagement = remoteAgentManagement;
  }

  public FleetAgentInfoDetails remoteConfigStatus(String remoteConfigStatus) {
    this.remoteConfigStatus = remoteConfigStatus;
    return this;
  }

  /**
   * Remote configuration status.
   *
   * @return remoteConfigStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_CONFIG_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRemoteConfigStatus() {
    return remoteConfigStatus;
  }

  public void setRemoteConfigStatus(String remoteConfigStatus) {
    this.remoteConfigStatus = remoteConfigStatus;
  }

  public FleetAgentInfoDetails services(List<String> services) {
    this.services = services;
    return this;
  }

  public FleetAgentInfoDetails addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Services running on the agent.
   *
   * @return services
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public FleetAgentInfoDetails tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public FleetAgentInfoDetails addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the agent.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public FleetAgentInfoDetails team(String team) {
    this.team = team;
    return this;
  }

  /**
   * Team associated with the agent.
   *
   * @return team
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
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
   * @return FleetAgentInfoDetails
   */
  @JsonAnySetter
  public FleetAgentInfoDetails putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetAgentInfoDetails object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetAgentInfoDetails fleetAgentInfoDetails = (FleetAgentInfoDetails) o;
    return Objects.equals(this.agentVersion, fleetAgentInfoDetails.agentVersion)
        && Objects.equals(this.apiKeyName, fleetAgentInfoDetails.apiKeyName)
        && Objects.equals(this.apiKeyUuid, fleetAgentInfoDetails.apiKeyUuid)
        && Objects.equals(this.cloudProvider, fleetAgentInfoDetails.cloudProvider)
        && Objects.equals(this.clusterName, fleetAgentInfoDetails.clusterName)
        && Objects.equals(this.datadogAgentKey, fleetAgentInfoDetails.datadogAgentKey)
        && Objects.equals(this.enabledProducts, fleetAgentInfoDetails.enabledProducts)
        && Objects.equals(this.env, fleetAgentInfoDetails.env)
        && Objects.equals(this.firstSeenAt, fleetAgentInfoDetails.firstSeenAt)
        && Objects.equals(this.hostname, fleetAgentInfoDetails.hostname)
        && Objects.equals(this.hostnameAliases, fleetAgentInfoDetails.hostnameAliases)
        && Objects.equals(
            this.installMethodInstallerVersion, fleetAgentInfoDetails.installMethodInstallerVersion)
        && Objects.equals(this.installMethodTool, fleetAgentInfoDetails.installMethodTool)
        && Objects.equals(this.ipAddresses, fleetAgentInfoDetails.ipAddresses)
        && Objects.equals(
            this.isSingleStepInstrumentationEnabled,
            fleetAgentInfoDetails.isSingleStepInstrumentationEnabled)
        && Objects.equals(this.lastRestartAt, fleetAgentInfoDetails.lastRestartAt)
        && Objects.equals(this.os, fleetAgentInfoDetails.os)
        && Objects.equals(this.osVersion, fleetAgentInfoDetails.osVersion)
        && Objects.equals(this.otelCollectorVersion, fleetAgentInfoDetails.otelCollectorVersion)
        && Objects.equals(this.otelCollectorVersions, fleetAgentInfoDetails.otelCollectorVersions)
        && Objects.equals(this.otelCollectors, fleetAgentInfoDetails.otelCollectors)
        && Objects.equals(this.podName, fleetAgentInfoDetails.podName)
        && Objects.equals(this.pythonVersion, fleetAgentInfoDetails.pythonVersion)
        && Objects.equals(this.region, fleetAgentInfoDetails.region)
        && Objects.equals(this.remoteAgentManagement, fleetAgentInfoDetails.remoteAgentManagement)
        && Objects.equals(this.remoteConfigStatus, fleetAgentInfoDetails.remoteConfigStatus)
        && Objects.equals(this.services, fleetAgentInfoDetails.services)
        && Objects.equals(this.tags, fleetAgentInfoDetails.tags)
        && Objects.equals(this.team, fleetAgentInfoDetails.team)
        && Objects.equals(this.additionalProperties, fleetAgentInfoDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentVersion,
        apiKeyName,
        apiKeyUuid,
        cloudProvider,
        clusterName,
        datadogAgentKey,
        enabledProducts,
        env,
        firstSeenAt,
        hostname,
        hostnameAliases,
        installMethodInstallerVersion,
        installMethodTool,
        ipAddresses,
        isSingleStepInstrumentationEnabled,
        lastRestartAt,
        os,
        osVersion,
        otelCollectorVersion,
        otelCollectorVersions,
        otelCollectors,
        podName,
        pythonVersion,
        region,
        remoteAgentManagement,
        remoteConfigStatus,
        services,
        tags,
        team,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetAgentInfoDetails {\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    apiKeyName: ").append(toIndentedString(apiKeyName)).append("\n");
    sb.append("    apiKeyUuid: ").append(toIndentedString(apiKeyUuid)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    datadogAgentKey: ").append(toIndentedString(datadogAgentKey)).append("\n");
    sb.append("    enabledProducts: ").append(toIndentedString(enabledProducts)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    firstSeenAt: ").append(toIndentedString(firstSeenAt)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    hostnameAliases: ").append(toIndentedString(hostnameAliases)).append("\n");
    sb.append("    installMethodInstallerVersion: ")
        .append(toIndentedString(installMethodInstallerVersion))
        .append("\n");
    sb.append("    installMethodTool: ").append(toIndentedString(installMethodTool)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    isSingleStepInstrumentationEnabled: ")
        .append(toIndentedString(isSingleStepInstrumentationEnabled))
        .append("\n");
    sb.append("    lastRestartAt: ").append(toIndentedString(lastRestartAt)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    otelCollectorVersion: ")
        .append(toIndentedString(otelCollectorVersion))
        .append("\n");
    sb.append("    otelCollectorVersions: ")
        .append(toIndentedString(otelCollectorVersions))
        .append("\n");
    sb.append("    otelCollectors: ").append(toIndentedString(otelCollectors)).append("\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
    sb.append("    pythonVersion: ").append(toIndentedString(pythonVersion)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    remoteAgentManagement: ")
        .append(toIndentedString(remoteAgentManagement))
        .append("\n");
    sb.append("    remoteConfigStatus: ").append(toIndentedString(remoteConfigStatus)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
