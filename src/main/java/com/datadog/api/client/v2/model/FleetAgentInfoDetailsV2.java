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
   * <p>Detailed information about a Datadog Agent.</p>
 */
@JsonPropertyOrder({
  FleetAgentInfoDetailsV2.JSON_PROPERTY_ACTIVE_HA_AGENT,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_AGENT_VERSION,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_API_KEY_NAME,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_API_KEY_UUID,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_CLOUD_PROVIDER,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_CLUSTER_NAME,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_CONFIG_ID,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_DATADOG_AGENT_KEY,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_DATADOG_DATA_CENTER,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_ECS_FARGATE_CLUSTER_NAME,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_ECS_FARGATE_TASK_ARN,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_ENABLED_PRODUCTS,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_ENV,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_FIRST_SEEN_AT,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_HA_AGENT_HOSTS,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_HA_AGENT_STATE,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_HOSTNAME,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_HOSTNAME_ALIASES,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_INSTALL_METHOD_INSTALLER_VERSION,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_INSTALL_METHOD_TOOL,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_IP_ADDRESSES,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_IS_SINGLE_STEP_INSTRUMENTATION_ENABLED,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_LAST_RESTART_AT,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_OS,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_OS_VERSION,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_OTEL_COLLECTORS,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_POD_NAME,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_PREFERRED_HA_ACTIVE_AGENT,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_PYTHON_VERSION,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_REGION,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_REMOTE_AGENT_MANAGEMENT,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_REMOTE_CONFIG_STATUS,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_SERVICES,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_SUPPORT_AGENT_UPGRADE,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_TAGS,
  FleetAgentInfoDetailsV2.JSON_PROPERTY_TEAM
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetAgentInfoDetailsV2 {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIVE_HA_AGENT = "active_ha_agent";
  private String activeHaAgent;

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

  public static final String JSON_PROPERTY_CONFIG_ID = "config_id";
  private String configId;

  public static final String JSON_PROPERTY_DATADOG_AGENT_KEY = "datadog_agent_key";
  private String datadogAgentKey;

  public static final String JSON_PROPERTY_DATADOG_DATA_CENTER = "datadog_data_center";
  private String datadogDataCenter;

  public static final String JSON_PROPERTY_ECS_FARGATE_CLUSTER_NAME = "ecs_fargate_cluster_name";
  private String ecsFargateClusterName;

  public static final String JSON_PROPERTY_ECS_FARGATE_TASK_ARN = "ecs_fargate_task_arn";
  private String ecsFargateTaskArn;

  public static final String JSON_PROPERTY_ENABLED_PRODUCTS = "enabled_products";
  private List<String> enabledProducts = null;

  public static final String JSON_PROPERTY_ENV = "env";
  private List<String> env = null;

  public static final String JSON_PROPERTY_FIRST_SEEN_AT = "first_seen_at";
  private Long firstSeenAt;

  public static final String JSON_PROPERTY_HA_AGENT_HOSTS = "ha_agent_hosts";
  private List<String> haAgentHosts = null;

  public static final String JSON_PROPERTY_HA_AGENT_STATE = "ha_agent_state";
  private String haAgentState;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_HOSTNAME_ALIASES = "hostname_aliases";
  private List<String> hostnameAliases = null;

  public static final String JSON_PROPERTY_INSTALL_METHOD_INSTALLER_VERSION = "install_method_installer_version";
  private String installMethodInstallerVersion;

  public static final String JSON_PROPERTY_INSTALL_METHOD_TOOL = "install_method_tool";
  private String installMethodTool;

  public static final String JSON_PROPERTY_IP_ADDRESSES = "ip_addresses";
  private List<String> ipAddresses = null;

  public static final String JSON_PROPERTY_IS_SINGLE_STEP_INSTRUMENTATION_ENABLED = "is_single_step_instrumentation_enabled";
  private Boolean isSingleStepInstrumentationEnabled;

  public static final String JSON_PROPERTY_LAST_RESTART_AT = "last_restart_at";
  private Long lastRestartAt;

  public static final String JSON_PROPERTY_OS = "os";
  private String os;

  public static final String JSON_PROPERTY_OS_VERSION = "os_version";
  private String osVersion;

  public static final String JSON_PROPERTY_OTEL_COLLECTORS = "otel_collectors";
  private List<Map<String, Object>> otelCollectors = null;

  public static final String JSON_PROPERTY_POD_NAME = "pod_name";
  private String podName;

  public static final String JSON_PROPERTY_PREFERRED_HA_ACTIVE_AGENT = "preferred_ha_active_agent";
  private String preferredHaActiveAgent;

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

  public static final String JSON_PROPERTY_SUPPORT_AGENT_UPGRADE = "support_agent_upgrade";
  private Boolean supportAgentUpgrade;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEAM = "team";
  private String team;

  public FleetAgentInfoDetailsV2 activeHaAgent(String activeHaAgent) {
    this.activeHaAgent = activeHaAgent;
    return this;
  }

  /**
   * <p>The currently active agent in the high-availability group.</p>
   * @return activeHaAgent
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACTIVE_HA_AGENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getActiveHaAgent() {
        return activeHaAgent;
      }
  public void setActiveHaAgent(String activeHaAgent) {
    this.activeHaAgent = activeHaAgent;
  }
  public FleetAgentInfoDetailsV2 agentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
    return this;
  }

  /**
   * <p>The Datadog Agent version.</p>
   * @return agentVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AGENT_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAgentVersion() {
        return agentVersion;
      }
  public void setAgentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
  }
  public FleetAgentInfoDetailsV2 apiKeyName(String apiKeyName) {
    this.apiKeyName = apiKeyName;
    return this;
  }

  /**
   * <p>The API key name (if available and not redacted).</p>
   * @return apiKeyName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_API_KEY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getApiKeyName() {
        return apiKeyName;
      }
  public void setApiKeyName(String apiKeyName) {
    this.apiKeyName = apiKeyName;
  }
  public FleetAgentInfoDetailsV2 apiKeyUuid(String apiKeyUuid) {
    this.apiKeyUuid = apiKeyUuid;
    return this;
  }

  /**
   * <p>The API key UUID.</p>
   * @return apiKeyUuid
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_API_KEY_UUID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getApiKeyUuid() {
        return apiKeyUuid;
      }
  public void setApiKeyUuid(String apiKeyUuid) {
    this.apiKeyUuid = apiKeyUuid;
  }
  public FleetAgentInfoDetailsV2 cloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

  /**
   * <p>The cloud provider where the agent is running.</p>
   * @return cloudProvider
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCloudProvider() {
        return cloudProvider;
      }
  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }
  public FleetAgentInfoDetailsV2 clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * <p>Kubernetes cluster name (if applicable).</p>
   * @return clusterName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CLUSTER_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getClusterName() {
        return clusterName;
      }
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }
  public FleetAgentInfoDetailsV2 configId(String configId) {
    this.configId = configId;
    return this;
  }

  /**
   * <p>The configuration identifier applied to the agent.</p>
   * @return configId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONFIG_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getConfigId() {
        return configId;
      }
  public void setConfigId(String configId) {
    this.configId = configId;
  }
  public FleetAgentInfoDetailsV2 datadogAgentKey(String datadogAgentKey) {
    this.datadogAgentKey = datadogAgentKey;
    return this;
  }

  /**
   * <p>The unique agent key identifier.</p>
   * @return datadogAgentKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATADOG_AGENT_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDatadogAgentKey() {
        return datadogAgentKey;
      }
  public void setDatadogAgentKey(String datadogAgentKey) {
    this.datadogAgentKey = datadogAgentKey;
  }
  public FleetAgentInfoDetailsV2 datadogDataCenter(String datadogDataCenter) {
    this.datadogDataCenter = datadogDataCenter;
    return this;
  }

  /**
   * <p>The Datadog data center the agent reports to.</p>
   * @return datadogDataCenter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATADOG_DATA_CENTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDatadogDataCenter() {
        return datadogDataCenter;
      }
  public void setDatadogDataCenter(String datadogDataCenter) {
    this.datadogDataCenter = datadogDataCenter;
  }
  public FleetAgentInfoDetailsV2 ecsFargateClusterName(String ecsFargateClusterName) {
    this.ecsFargateClusterName = ecsFargateClusterName;
    return this;
  }

  /**
   * <p>The ECS Fargate cluster name, if the agent runs in an ECS Fargate environment.</p>
   * @return ecsFargateClusterName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ECS_FARGATE_CLUSTER_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEcsFargateClusterName() {
        return ecsFargateClusterName;
      }
  public void setEcsFargateClusterName(String ecsFargateClusterName) {
    this.ecsFargateClusterName = ecsFargateClusterName;
  }
  public FleetAgentInfoDetailsV2 ecsFargateTaskArn(String ecsFargateTaskArn) {
    this.ecsFargateTaskArn = ecsFargateTaskArn;
    return this;
  }

  /**
   * <p>The ECS Fargate task ARN, if the agent runs in an ECS Fargate environment.</p>
   * @return ecsFargateTaskArn
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ECS_FARGATE_TASK_ARN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEcsFargateTaskArn() {
        return ecsFargateTaskArn;
      }
  public void setEcsFargateTaskArn(String ecsFargateTaskArn) {
    this.ecsFargateTaskArn = ecsFargateTaskArn;
  }
  public FleetAgentInfoDetailsV2 enabledProducts(List<String> enabledProducts) {
    this.enabledProducts = enabledProducts;
    return this;
  }
  public FleetAgentInfoDetailsV2 addEnabledProductsItem(String enabledProductsItem) {
    if (this.enabledProducts == null) {
      this.enabledProducts = new ArrayList<>();
    }
    this.enabledProducts.add(enabledProductsItem);
    return this;
  }

  /**
   * <p>Datadog products enabled on the agent.</p>
   * @return enabledProducts
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED_PRODUCTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getEnabledProducts() {
        return enabledProducts;
      }
  public void setEnabledProducts(List<String> enabledProducts) {
    this.enabledProducts = enabledProducts;
  }
  public FleetAgentInfoDetailsV2 env(List<String> env) {
    this.env = env;
    return this;
  }
  public FleetAgentInfoDetailsV2 addEnvItem(String envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * <p>Environments the agent is reporting from.</p>
   * @return env
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENV)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getEnv() {
        return env;
      }
  public void setEnv(List<String> env) {
    this.env = env;
  }
  public FleetAgentInfoDetailsV2 firstSeenAt(Long firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
    return this;
  }

  /**
   * <p>Timestamp when the agent was first seen.</p>
   * @return firstSeenAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIRST_SEEN_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getFirstSeenAt() {
        return firstSeenAt;
      }
  public void setFirstSeenAt(Long firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
  }
  public FleetAgentInfoDetailsV2 haAgentHosts(List<String> haAgentHosts) {
    this.haAgentHosts = haAgentHosts;
    return this;
  }
  public FleetAgentInfoDetailsV2 addHaAgentHostsItem(String haAgentHostsItem) {
    if (this.haAgentHosts == null) {
      this.haAgentHosts = new ArrayList<>();
    }
    this.haAgentHosts.add(haAgentHostsItem);
    return this;
  }

  /**
   * <p>Hosts participating in the agent's high-availability group.</p>
   * @return haAgentHosts
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HA_AGENT_HOSTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getHaAgentHosts() {
        return haAgentHosts;
      }
  public void setHaAgentHosts(List<String> haAgentHosts) {
    this.haAgentHosts = haAgentHosts;
  }
  public FleetAgentInfoDetailsV2 haAgentState(String haAgentState) {
    this.haAgentState = haAgentState;
    return this;
  }

  /**
   * <p>The high-availability state of the agent.</p>
   * @return haAgentState
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HA_AGENT_STATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHaAgentState() {
        return haAgentState;
      }
  public void setHaAgentState(String haAgentState) {
    this.haAgentState = haAgentState;
  }
  public FleetAgentInfoDetailsV2 hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * <p>The hostname of the agent.</p>
   * @return hostname
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOSTNAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHostname() {
        return hostname;
      }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }
  public FleetAgentInfoDetailsV2 hostnameAliases(List<String> hostnameAliases) {
    this.hostnameAliases = hostnameAliases;
    return this;
  }
  public FleetAgentInfoDetailsV2 addHostnameAliasesItem(String hostnameAliasesItem) {
    if (this.hostnameAliases == null) {
      this.hostnameAliases = new ArrayList<>();
    }
    this.hostnameAliases.add(hostnameAliasesItem);
    return this;
  }

  /**
   * <p>Alternative hostname list for the agent.</p>
   * @return hostnameAliases
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOSTNAME_ALIASES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getHostnameAliases() {
        return hostnameAliases;
      }
  public void setHostnameAliases(List<String> hostnameAliases) {
    this.hostnameAliases = hostnameAliases;
  }
  public FleetAgentInfoDetailsV2 installMethodInstallerVersion(String installMethodInstallerVersion) {
    this.installMethodInstallerVersion = installMethodInstallerVersion;
    return this;
  }

  /**
   * <p>The version of the installer used.</p>
   * @return installMethodInstallerVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INSTALL_METHOD_INSTALLER_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getInstallMethodInstallerVersion() {
        return installMethodInstallerVersion;
      }
  public void setInstallMethodInstallerVersion(String installMethodInstallerVersion) {
    this.installMethodInstallerVersion = installMethodInstallerVersion;
  }
  public FleetAgentInfoDetailsV2 installMethodTool(String installMethodTool) {
    this.installMethodTool = installMethodTool;
    return this;
  }

  /**
   * <p>The tool used to install the agent.</p>
   * @return installMethodTool
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INSTALL_METHOD_TOOL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getInstallMethodTool() {
        return installMethodTool;
      }
  public void setInstallMethodTool(String installMethodTool) {
    this.installMethodTool = installMethodTool;
  }
  public FleetAgentInfoDetailsV2 ipAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }
  public FleetAgentInfoDetailsV2 addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

  /**
   * <p>IP addresses of the agent.</p>
   * @return ipAddresses
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IP_ADDRESSES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getIpAddresses() {
        return ipAddresses;
      }
  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }
  public FleetAgentInfoDetailsV2 isSingleStepInstrumentationEnabled(Boolean isSingleStepInstrumentationEnabled) {
    this.isSingleStepInstrumentationEnabled = isSingleStepInstrumentationEnabled;
    return this;
  }

  /**
   * <p>Whether single-step instrumentation is enabled.</p>
   * @return isSingleStepInstrumentationEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_SINGLE_STEP_INSTRUMENTATION_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsSingleStepInstrumentationEnabled() {
        return isSingleStepInstrumentationEnabled;
      }
  public void setIsSingleStepInstrumentationEnabled(Boolean isSingleStepInstrumentationEnabled) {
    this.isSingleStepInstrumentationEnabled = isSingleStepInstrumentationEnabled;
  }
  public FleetAgentInfoDetailsV2 lastRestartAt(Long lastRestartAt) {
    this.lastRestartAt = lastRestartAt;
    return this;
  }

  /**
   * <p>Timestamp of the last agent restart.</p>
   * @return lastRestartAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_RESTART_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getLastRestartAt() {
        return lastRestartAt;
      }
  public void setLastRestartAt(Long lastRestartAt) {
    this.lastRestartAt = lastRestartAt;
  }
  public FleetAgentInfoDetailsV2 os(String os) {
    this.os = os;
    return this;
  }

  /**
   * <p>The operating system.</p>
   * @return os
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOs() {
        return os;
      }
  public void setOs(String os) {
    this.os = os;
  }
  public FleetAgentInfoDetailsV2 osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * <p>The operating system version.</p>
   * @return osVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OS_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOsVersion() {
        return osVersion;
      }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }
  public FleetAgentInfoDetailsV2 otelCollectors(List<Map<String, Object>> otelCollectors) {
    this.otelCollectors = otelCollectors;
    return this;
  }
  public FleetAgentInfoDetailsV2 addOtelCollectorsItem(Map<String, Object> otelCollectorsItem) {
    if (this.otelCollectors == null) {
      this.otelCollectors = new ArrayList<>();
    }
    this.otelCollectors.add(otelCollectorsItem);
    return this;
  }

  /**
   * <p>OpenTelemetry collectors associated with the agent (if applicable).</p>
   * @return otelCollectors
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OTEL_COLLECTORS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<Map<String, Object>> getOtelCollectors() {
        return otelCollectors;
      }
  public void setOtelCollectors(List<Map<String, Object>> otelCollectors) {
    this.otelCollectors = otelCollectors;
  }
  public FleetAgentInfoDetailsV2 podName(String podName) {
    this.podName = podName;
    return this;
  }

  /**
   * <p>Kubernetes pod name (if applicable).</p>
   * @return podName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_POD_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPodName() {
        return podName;
      }
  public void setPodName(String podName) {
    this.podName = podName;
  }
  public FleetAgentInfoDetailsV2 preferredHaActiveAgent(String preferredHaActiveAgent) {
    this.preferredHaActiveAgent = preferredHaActiveAgent;
    return this;
  }

  /**
   * <p>The preferred active agent in the high-availability group.</p>
   * @return preferredHaActiveAgent
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PREFERRED_HA_ACTIVE_AGENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPreferredHaActiveAgent() {
        return preferredHaActiveAgent;
      }
  public void setPreferredHaActiveAgent(String preferredHaActiveAgent) {
    this.preferredHaActiveAgent = preferredHaActiveAgent;
  }
  public FleetAgentInfoDetailsV2 pythonVersion(String pythonVersion) {
    this.pythonVersion = pythonVersion;
    return this;
  }

  /**
   * <p>The Python version used by the agent.</p>
   * @return pythonVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PYTHON_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPythonVersion() {
        return pythonVersion;
      }
  public void setPythonVersion(String pythonVersion) {
    this.pythonVersion = pythonVersion;
  }
  public FleetAgentInfoDetailsV2 region(List<String> region) {
    this.region = region;
    return this;
  }
  public FleetAgentInfoDetailsV2 addRegionItem(String regionItem) {
    if (this.region == null) {
      this.region = new ArrayList<>();
    }
    this.region.add(regionItem);
    return this;
  }

  /**
   * <p>Regions where the agent is running.</p>
   * @return region
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REGION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getRegion() {
        return region;
      }
  public void setRegion(List<String> region) {
    this.region = region;
  }
  public FleetAgentInfoDetailsV2 remoteAgentManagement(String remoteAgentManagement) {
    this.remoteAgentManagement = remoteAgentManagement;
    return this;
  }

  /**
   * <p>Remote agent management status.</p>
   * @return remoteAgentManagement
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REMOTE_AGENT_MANAGEMENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRemoteAgentManagement() {
        return remoteAgentManagement;
      }
  public void setRemoteAgentManagement(String remoteAgentManagement) {
    this.remoteAgentManagement = remoteAgentManagement;
  }
  public FleetAgentInfoDetailsV2 remoteConfigStatus(String remoteConfigStatus) {
    this.remoteConfigStatus = remoteConfigStatus;
    return this;
  }

  /**
   * <p>Remote configuration status.</p>
   * @return remoteConfigStatus
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REMOTE_CONFIG_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRemoteConfigStatus() {
        return remoteConfigStatus;
      }
  public void setRemoteConfigStatus(String remoteConfigStatus) {
    this.remoteConfigStatus = remoteConfigStatus;
  }
  public FleetAgentInfoDetailsV2 services(List<String> services) {
    this.services = services;
    return this;
  }
  public FleetAgentInfoDetailsV2 addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * <p>Services running on the agent.</p>
   * @return services
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getServices() {
        return services;
      }
  public void setServices(List<String> services) {
    this.services = services;
  }
  public FleetAgentInfoDetailsV2 supportAgentUpgrade(Boolean supportAgentUpgrade) {
    this.supportAgentUpgrade = supportAgentUpgrade;
    return this;
  }

  /**
   * <p>Whether the agent supports remote agent upgrade.</p>
   * @return supportAgentUpgrade
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SUPPORT_AGENT_UPGRADE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getSupportAgentUpgrade() {
        return supportAgentUpgrade;
      }
  public void setSupportAgentUpgrade(Boolean supportAgentUpgrade) {
    this.supportAgentUpgrade = supportAgentUpgrade;
  }
  public FleetAgentInfoDetailsV2 tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public FleetAgentInfoDetailsV2 addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>Tags associated with the agent.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public FleetAgentInfoDetailsV2 team(String team) {
    this.team = team;
    return this;
  }

  /**
   * <p>Team associated with the agent.</p>
   * @return team
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEAM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTeam() {
        return team;
      }
  public void setTeam(String team) {
    this.team = team;
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
   * @return FleetAgentInfoDetailsV2
   */
  @JsonAnySetter
  public FleetAgentInfoDetailsV2 putAdditionalProperty(String key, Object value) {
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
   * Return true if this FleetAgentInfoDetailsV2 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetAgentInfoDetailsV2 fleetAgentInfoDetailsV2 = (FleetAgentInfoDetailsV2) o;
    return Objects.equals(this.activeHaAgent, fleetAgentInfoDetailsV2.activeHaAgent) && Objects.equals(this.agentVersion, fleetAgentInfoDetailsV2.agentVersion) && Objects.equals(this.apiKeyName, fleetAgentInfoDetailsV2.apiKeyName) && Objects.equals(this.apiKeyUuid, fleetAgentInfoDetailsV2.apiKeyUuid) && Objects.equals(this.cloudProvider, fleetAgentInfoDetailsV2.cloudProvider) && Objects.equals(this.clusterName, fleetAgentInfoDetailsV2.clusterName) && Objects.equals(this.configId, fleetAgentInfoDetailsV2.configId) && Objects.equals(this.datadogAgentKey, fleetAgentInfoDetailsV2.datadogAgentKey) && Objects.equals(this.datadogDataCenter, fleetAgentInfoDetailsV2.datadogDataCenter) && Objects.equals(this.ecsFargateClusterName, fleetAgentInfoDetailsV2.ecsFargateClusterName) && Objects.equals(this.ecsFargateTaskArn, fleetAgentInfoDetailsV2.ecsFargateTaskArn) && Objects.equals(this.enabledProducts, fleetAgentInfoDetailsV2.enabledProducts) && Objects.equals(this.env, fleetAgentInfoDetailsV2.env) && Objects.equals(this.firstSeenAt, fleetAgentInfoDetailsV2.firstSeenAt) && Objects.equals(this.haAgentHosts, fleetAgentInfoDetailsV2.haAgentHosts) && Objects.equals(this.haAgentState, fleetAgentInfoDetailsV2.haAgentState) && Objects.equals(this.hostname, fleetAgentInfoDetailsV2.hostname) && Objects.equals(this.hostnameAliases, fleetAgentInfoDetailsV2.hostnameAliases) && Objects.equals(this.installMethodInstallerVersion, fleetAgentInfoDetailsV2.installMethodInstallerVersion) && Objects.equals(this.installMethodTool, fleetAgentInfoDetailsV2.installMethodTool) && Objects.equals(this.ipAddresses, fleetAgentInfoDetailsV2.ipAddresses) && Objects.equals(this.isSingleStepInstrumentationEnabled, fleetAgentInfoDetailsV2.isSingleStepInstrumentationEnabled) && Objects.equals(this.lastRestartAt, fleetAgentInfoDetailsV2.lastRestartAt) && Objects.equals(this.os, fleetAgentInfoDetailsV2.os) && Objects.equals(this.osVersion, fleetAgentInfoDetailsV2.osVersion) && Objects.equals(this.otelCollectors, fleetAgentInfoDetailsV2.otelCollectors) && Objects.equals(this.podName, fleetAgentInfoDetailsV2.podName) && Objects.equals(this.preferredHaActiveAgent, fleetAgentInfoDetailsV2.preferredHaActiveAgent) && Objects.equals(this.pythonVersion, fleetAgentInfoDetailsV2.pythonVersion) && Objects.equals(this.region, fleetAgentInfoDetailsV2.region) && Objects.equals(this.remoteAgentManagement, fleetAgentInfoDetailsV2.remoteAgentManagement) && Objects.equals(this.remoteConfigStatus, fleetAgentInfoDetailsV2.remoteConfigStatus) && Objects.equals(this.services, fleetAgentInfoDetailsV2.services) && Objects.equals(this.supportAgentUpgrade, fleetAgentInfoDetailsV2.supportAgentUpgrade) && Objects.equals(this.tags, fleetAgentInfoDetailsV2.tags) && Objects.equals(this.team, fleetAgentInfoDetailsV2.team) && Objects.equals(this.additionalProperties, fleetAgentInfoDetailsV2.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(activeHaAgent,agentVersion,apiKeyName,apiKeyUuid,cloudProvider,clusterName,configId,datadogAgentKey,datadogDataCenter,ecsFargateClusterName,ecsFargateTaskArn,enabledProducts,env,firstSeenAt,haAgentHosts,haAgentState,hostname,hostnameAliases,installMethodInstallerVersion,installMethodTool,ipAddresses,isSingleStepInstrumentationEnabled,lastRestartAt,os,osVersion,otelCollectors,podName,preferredHaActiveAgent,pythonVersion,region,remoteAgentManagement,remoteConfigStatus,services,supportAgentUpgrade,tags,team, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetAgentInfoDetailsV2 {\n");
    sb.append("    activeHaAgent: ").append(toIndentedString(activeHaAgent)).append("\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    apiKeyName: ").append(toIndentedString(apiKeyName)).append("\n");
    sb.append("    apiKeyUuid: ").append(toIndentedString(apiKeyUuid)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    datadogAgentKey: ").append(toIndentedString(datadogAgentKey)).append("\n");
    sb.append("    datadogDataCenter: ").append(toIndentedString(datadogDataCenter)).append("\n");
    sb.append("    ecsFargateClusterName: ").append(toIndentedString(ecsFargateClusterName)).append("\n");
    sb.append("    ecsFargateTaskArn: ").append(toIndentedString(ecsFargateTaskArn)).append("\n");
    sb.append("    enabledProducts: ").append(toIndentedString(enabledProducts)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    firstSeenAt: ").append(toIndentedString(firstSeenAt)).append("\n");
    sb.append("    haAgentHosts: ").append(toIndentedString(haAgentHosts)).append("\n");
    sb.append("    haAgentState: ").append(toIndentedString(haAgentState)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    hostnameAliases: ").append(toIndentedString(hostnameAliases)).append("\n");
    sb.append("    installMethodInstallerVersion: ").append(toIndentedString(installMethodInstallerVersion)).append("\n");
    sb.append("    installMethodTool: ").append(toIndentedString(installMethodTool)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    isSingleStepInstrumentationEnabled: ").append(toIndentedString(isSingleStepInstrumentationEnabled)).append("\n");
    sb.append("    lastRestartAt: ").append(toIndentedString(lastRestartAt)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    otelCollectors: ").append(toIndentedString(otelCollectors)).append("\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
    sb.append("    preferredHaActiveAgent: ").append(toIndentedString(preferredHaActiveAgent)).append("\n");
    sb.append("    pythonVersion: ").append(toIndentedString(pythonVersion)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    remoteAgentManagement: ").append(toIndentedString(remoteAgentManagement)).append("\n");
    sb.append("    remoteConfigStatus: ").append(toIndentedString(remoteConfigStatus)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    supportAgentUpgrade: ").append(toIndentedString(supportAgentUpgrade)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
