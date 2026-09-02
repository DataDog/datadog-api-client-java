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
   * <p>Attributes of a Datadog Agent in the v2 list response.</p>
 */
@JsonPropertyOrder({
  FleetAgentV2Attributes.JSON_PROPERTY_AGENT_VERSION,
  FleetAgentV2Attributes.JSON_PROPERTY_API_KEY_NAME,
  FleetAgentV2Attributes.JSON_PROPERTY_API_KEY_UUID,
  FleetAgentV2Attributes.JSON_PROPERTY_CLOUD_PROVIDER,
  FleetAgentV2Attributes.JSON_PROPERTY_CLUSTER_NAME,
  FleetAgentV2Attributes.JSON_PROPERTY_DATADOG_DATA_CENTER,
  FleetAgentV2Attributes.JSON_PROPERTY_ECS_FARGATE_CLUSTER_NAME,
  FleetAgentV2Attributes.JSON_PROPERTY_ECS_FARGATE_TASK_ARN,
  FleetAgentV2Attributes.JSON_PROPERTY_ENABLED_PRODUCTS,
  FleetAgentV2Attributes.JSON_PROPERTY_ENV,
  FleetAgentV2Attributes.JSON_PROPERTY_FIRST_SEEN_AT,
  FleetAgentV2Attributes.JSON_PROPERTY_FLEET_POLICIES,
  FleetAgentV2Attributes.JSON_PROPERTY_HOSTNAME,
  FleetAgentV2Attributes.JSON_PROPERTY_INSTRUMENTATION_ERROR_COUNTS,
  FleetAgentV2Attributes.JSON_PROPERTY_INSTRUMENTATION_STATUS,
  FleetAgentV2Attributes.JSON_PROPERTY_INTEGRATIONS,
  FleetAgentV2Attributes.JSON_PROPERTY_IP_ADDRESSES,
  FleetAgentV2Attributes.JSON_PROPERTY_IS_SINGLE_STEP_INSTRUMENTATION_ENABLED,
  FleetAgentV2Attributes.JSON_PROPERTY_LAST_RESTART_AT,
  FleetAgentV2Attributes.JSON_PROPERTY_OS,
  FleetAgentV2Attributes.JSON_PROPERTY_OTEL_COLLECTOR_DEPLOYMENT_TYPES,
  FleetAgentV2Attributes.JSON_PROPERTY_OTEL_COLLECTOR_DISTRIBUTIONS,
  FleetAgentV2Attributes.JSON_PROPERTY_OTEL_COLLECTOR_VERSIONS,
  FleetAgentV2Attributes.JSON_PROPERTY_OTEL_RESOURCE_ATTRIBUTES,
  FleetAgentV2Attributes.JSON_PROPERTY_POD_NAME,
  FleetAgentV2Attributes.JSON_PROPERTY_REMOTE_AGENT_MANAGEMENT,
  FleetAgentV2Attributes.JSON_PROPERTY_REMOTE_CONFIG_STATUS,
  FleetAgentV2Attributes.JSON_PROPERTY_SERVICES,
  FleetAgentV2Attributes.JSON_PROPERTY_TAGS,
  FleetAgentV2Attributes.JSON_PROPERTY_TEAM
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetAgentV2Attributes {
  @JsonIgnore
  public boolean unparsed = false;
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

  public static final String JSON_PROPERTY_FLEET_POLICIES = "fleet_policies";
  private List<String> fleetPolicies = null;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_INSTRUMENTATION_ERROR_COUNTS = "instrumentation_error_counts";
  private Long instrumentationErrorCounts;

  public static final String JSON_PROPERTY_INSTRUMENTATION_STATUS = "instrumentation_status";
  private FleetAgentV2AttributesInstrumentationStatus instrumentationStatus;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private List<String> integrations = null;

  public static final String JSON_PROPERTY_IP_ADDRESSES = "ip_addresses";
  private List<String> ipAddresses = null;

  public static final String JSON_PROPERTY_IS_SINGLE_STEP_INSTRUMENTATION_ENABLED = "is_single_step_instrumentation_enabled";
  private Boolean isSingleStepInstrumentationEnabled;

  public static final String JSON_PROPERTY_LAST_RESTART_AT = "last_restart_at";
  private Long lastRestartAt;

  public static final String JSON_PROPERTY_OS = "os";
  private String os;

  public static final String JSON_PROPERTY_OTEL_COLLECTOR_DEPLOYMENT_TYPES = "otel_collector_deployment_types";
  private List<String> otelCollectorDeploymentTypes = null;

  public static final String JSON_PROPERTY_OTEL_COLLECTOR_DISTRIBUTIONS = "otel_collector_distributions";
  private List<String> otelCollectorDistributions = null;

  public static final String JSON_PROPERTY_OTEL_COLLECTOR_VERSIONS = "otel_collector_versions";
  private List<String> otelCollectorVersions = null;

  public static final String JSON_PROPERTY_OTEL_RESOURCE_ATTRIBUTES = "otel_resource_attributes";
  private List<String> otelResourceAttributes = null;

  public static final String JSON_PROPERTY_POD_NAME = "pod_name";
  private String podName;

  public static final String JSON_PROPERTY_REMOTE_AGENT_MANAGEMENT = "remote_agent_management";
  private String remoteAgentManagement;

  public static final String JSON_PROPERTY_REMOTE_CONFIG_STATUS = "remote_config_status";
  private String remoteConfigStatus;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<String> services = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<FleetAgentAttributesTagsItems> tags = null;

  public static final String JSON_PROPERTY_TEAM = "team";
  private String team;

  public FleetAgentV2Attributes agentVersion(String agentVersion) {
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
  public FleetAgentV2Attributes apiKeyName(String apiKeyName) {
    this.apiKeyName = apiKeyName;
    return this;
  }

  /**
   * <p>The name of the API key used by the agent, if available and not redacted.</p>
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
  public FleetAgentV2Attributes apiKeyUuid(String apiKeyUuid) {
    this.apiKeyUuid = apiKeyUuid;
    return this;
  }

  /**
   * <p>The UUID of the API key used by the agent.</p>
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
  public FleetAgentV2Attributes cloudProvider(String cloudProvider) {
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
  public FleetAgentV2Attributes clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * <p>The Kubernetes cluster name, if the agent runs in a cluster.</p>
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
  public FleetAgentV2Attributes datadogDataCenter(String datadogDataCenter) {
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
  public FleetAgentV2Attributes ecsFargateClusterName(String ecsFargateClusterName) {
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
  public FleetAgentV2Attributes ecsFargateTaskArn(String ecsFargateTaskArn) {
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
  public FleetAgentV2Attributes enabledProducts(List<String> enabledProducts) {
    this.enabledProducts = enabledProducts;
    return this;
  }
  public FleetAgentV2Attributes addEnabledProductsItem(String enabledProductsItem) {
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
  public FleetAgentV2Attributes env(List<String> env) {
    this.env = env;
    return this;
  }
  public FleetAgentV2Attributes addEnvItem(String envItem) {
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
  public FleetAgentV2Attributes firstSeenAt(Long firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
    return this;
  }

  /**
   * <p>Unix timestamp when the agent was first seen.</p>
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
  public FleetAgentV2Attributes fleetPolicies(List<String> fleetPolicies) {
    this.fleetPolicies = fleetPolicies;
    return this;
  }
  public FleetAgentV2Attributes addFleetPoliciesItem(String fleetPoliciesItem) {
    if (this.fleetPolicies == null) {
      this.fleetPolicies = new ArrayList<>();
    }
    this.fleetPolicies.add(fleetPoliciesItem);
    return this;
  }

  /**
   * <p>Identifiers of fleet policies applied to the agent.</p>
   * @return fleetPolicies
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FLEET_POLICIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getFleetPolicies() {
        return fleetPolicies;
      }
  public void setFleetPolicies(List<String> fleetPolicies) {
    this.fleetPolicies = fleetPolicies;
  }
  public FleetAgentV2Attributes hostname(String hostname) {
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
  public FleetAgentV2Attributes instrumentationErrorCounts(Long instrumentationErrorCounts) {
    this.instrumentationErrorCounts = instrumentationErrorCounts;
    return this;
  }

  /**
   * <p>Number of instrumentation errors on the agent. Absent from the response when the count is zero.</p>
   * @return instrumentationErrorCounts
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INSTRUMENTATION_ERROR_COUNTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getInstrumentationErrorCounts() {
        return instrumentationErrorCounts;
      }
  public void setInstrumentationErrorCounts(Long instrumentationErrorCounts) {
    this.instrumentationErrorCounts = instrumentationErrorCounts;
  }
  public FleetAgentV2Attributes instrumentationStatus(FleetAgentV2AttributesInstrumentationStatus instrumentationStatus) {
    this.instrumentationStatus = instrumentationStatus;
    this.unparsed |= !instrumentationStatus.isValid();
    return this;
  }

  /**
   * <p>The single-step instrumentation status of the Agent.</p>
   * @return instrumentationStatus
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INSTRUMENTATION_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FleetAgentV2AttributesInstrumentationStatus getInstrumentationStatus() {
        return instrumentationStatus;
      }
  public void setInstrumentationStatus(FleetAgentV2AttributesInstrumentationStatus instrumentationStatus) {
    if (!instrumentationStatus.isValid()) {
        this.unparsed = true;
    }
    this.instrumentationStatus = instrumentationStatus;
  }
  public FleetAgentV2Attributes integrations(List<String> integrations) {
    this.integrations = integrations;
    return this;
  }
  public FleetAgentV2Attributes addIntegrationsItem(String integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<>();
    }
    this.integrations.add(integrationsItem);
    return this;
  }

  /**
   * <p>Names of integrations configured on the agent.</p>
   * @return integrations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getIntegrations() {
        return integrations;
      }
  public void setIntegrations(List<String> integrations) {
    this.integrations = integrations;
  }
  public FleetAgentV2Attributes ipAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }
  public FleetAgentV2Attributes addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

  /**
   * <p>IP addresses of the agent host.</p>
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
  public FleetAgentV2Attributes isSingleStepInstrumentationEnabled(Boolean isSingleStepInstrumentationEnabled) {
    this.isSingleStepInstrumentationEnabled = isSingleStepInstrumentationEnabled;
    return this;
  }

  /**
   * <p>Whether single-step instrumentation is enabled on the agent.</p>
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
  public FleetAgentV2Attributes lastRestartAt(Long lastRestartAt) {
    this.lastRestartAt = lastRestartAt;
    return this;
  }

  /**
   * <p>Unix timestamp of the last agent restart.</p>
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
  public FleetAgentV2Attributes os(String os) {
    this.os = os;
    return this;
  }

  /**
   * <p>The operating system of the host.</p>
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
  public FleetAgentV2Attributes otelCollectorDeploymentTypes(List<String> otelCollectorDeploymentTypes) {
    this.otelCollectorDeploymentTypes = otelCollectorDeploymentTypes;
    return this;
  }
  public FleetAgentV2Attributes addOtelCollectorDeploymentTypesItem(String otelCollectorDeploymentTypesItem) {
    if (this.otelCollectorDeploymentTypes == null) {
      this.otelCollectorDeploymentTypes = new ArrayList<>();
    }
    this.otelCollectorDeploymentTypes.add(otelCollectorDeploymentTypesItem);
    return this;
  }

  /**
   * <p>OpenTelemetry collector deployment types associated with the agent.</p>
   * @return otelCollectorDeploymentTypes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OTEL_COLLECTOR_DEPLOYMENT_TYPES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getOtelCollectorDeploymentTypes() {
        return otelCollectorDeploymentTypes;
      }
  public void setOtelCollectorDeploymentTypes(List<String> otelCollectorDeploymentTypes) {
    this.otelCollectorDeploymentTypes = otelCollectorDeploymentTypes;
  }
  public FleetAgentV2Attributes otelCollectorDistributions(List<String> otelCollectorDistributions) {
    this.otelCollectorDistributions = otelCollectorDistributions;
    return this;
  }
  public FleetAgentV2Attributes addOtelCollectorDistributionsItem(String otelCollectorDistributionsItem) {
    if (this.otelCollectorDistributions == null) {
      this.otelCollectorDistributions = new ArrayList<>();
    }
    this.otelCollectorDistributions.add(otelCollectorDistributionsItem);
    return this;
  }

  /**
   * <p>OpenTelemetry collector distributions associated with the agent.</p>
   * @return otelCollectorDistributions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OTEL_COLLECTOR_DISTRIBUTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getOtelCollectorDistributions() {
        return otelCollectorDistributions;
      }
  public void setOtelCollectorDistributions(List<String> otelCollectorDistributions) {
    this.otelCollectorDistributions = otelCollectorDistributions;
  }
  public FleetAgentV2Attributes otelCollectorVersions(List<String> otelCollectorVersions) {
    this.otelCollectorVersions = otelCollectorVersions;
    return this;
  }
  public FleetAgentV2Attributes addOtelCollectorVersionsItem(String otelCollectorVersionsItem) {
    if (this.otelCollectorVersions == null) {
      this.otelCollectorVersions = new ArrayList<>();
    }
    this.otelCollectorVersions.add(otelCollectorVersionsItem);
    return this;
  }

  /**
   * <p>All OpenTelemetry collector versions associated with the agent.</p>
   * @return otelCollectorVersions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OTEL_COLLECTOR_VERSIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getOtelCollectorVersions() {
        return otelCollectorVersions;
      }
  public void setOtelCollectorVersions(List<String> otelCollectorVersions) {
    this.otelCollectorVersions = otelCollectorVersions;
  }
  public FleetAgentV2Attributes otelResourceAttributes(List<String> otelResourceAttributes) {
    this.otelResourceAttributes = otelResourceAttributes;
    return this;
  }
  public FleetAgentV2Attributes addOtelResourceAttributesItem(String otelResourceAttributesItem) {
    if (this.otelResourceAttributes == null) {
      this.otelResourceAttributes = new ArrayList<>();
    }
    this.otelResourceAttributes.add(otelResourceAttributesItem);
    return this;
  }

  /**
   * <p>OpenTelemetry resource attributes reported by the agent.</p>
   * @return otelResourceAttributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OTEL_RESOURCE_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getOtelResourceAttributes() {
        return otelResourceAttributes;
      }
  public void setOtelResourceAttributes(List<String> otelResourceAttributes) {
    this.otelResourceAttributes = otelResourceAttributes;
  }
  public FleetAgentV2Attributes podName(String podName) {
    this.podName = podName;
    return this;
  }

  /**
   * <p>The Kubernetes pod name, if the agent runs as a pod.</p>
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
  public FleetAgentV2Attributes remoteAgentManagement(String remoteAgentManagement) {
    this.remoteAgentManagement = remoteAgentManagement;
    return this;
  }

  /**
   * <p>The remote agent management status.</p>
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
  public FleetAgentV2Attributes remoteConfigStatus(String remoteConfigStatus) {
    this.remoteConfigStatus = remoteConfigStatus;
    return this;
  }

  /**
   * <p>The remote configuration connection status of the agent.</p>
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
  public FleetAgentV2Attributes services(List<String> services) {
    this.services = services;
    return this;
  }
  public FleetAgentV2Attributes addServicesItem(String servicesItem) {
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
  public FleetAgentV2Attributes tags(List<FleetAgentAttributesTagsItems> tags) {
    this.tags = tags;
    if (tags != null) {
    for (FleetAgentAttributesTagsItems item : tags) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public FleetAgentV2Attributes addTagsItem(FleetAgentAttributesTagsItems tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    this.unparsed |= tagsItem.unparsed;
    return this;
  }

  /**
   * <p>Tags associated with the agent. Returned as an empty array when the agent has no tags.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<FleetAgentAttributesTagsItems> getTags() {
        return tags;
      }
  public void setTags(List<FleetAgentAttributesTagsItems> tags) {
    this.tags = tags;
    if (tags != null) {
      for (FleetAgentAttributesTagsItems item : tags) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public FleetAgentV2Attributes team(String team) {
    this.team = team;
    return this;
  }

  /**
   * <p>The team associated with the agent.</p>
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
   * @return FleetAgentV2Attributes
   */
  @JsonAnySetter
  public FleetAgentV2Attributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this FleetAgentV2Attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetAgentV2Attributes fleetAgentV2Attributes = (FleetAgentV2Attributes) o;
    return Objects.equals(this.agentVersion, fleetAgentV2Attributes.agentVersion) && Objects.equals(this.apiKeyName, fleetAgentV2Attributes.apiKeyName) && Objects.equals(this.apiKeyUuid, fleetAgentV2Attributes.apiKeyUuid) && Objects.equals(this.cloudProvider, fleetAgentV2Attributes.cloudProvider) && Objects.equals(this.clusterName, fleetAgentV2Attributes.clusterName) && Objects.equals(this.datadogDataCenter, fleetAgentV2Attributes.datadogDataCenter) && Objects.equals(this.ecsFargateClusterName, fleetAgentV2Attributes.ecsFargateClusterName) && Objects.equals(this.ecsFargateTaskArn, fleetAgentV2Attributes.ecsFargateTaskArn) && Objects.equals(this.enabledProducts, fleetAgentV2Attributes.enabledProducts) && Objects.equals(this.env, fleetAgentV2Attributes.env) && Objects.equals(this.firstSeenAt, fleetAgentV2Attributes.firstSeenAt) && Objects.equals(this.fleetPolicies, fleetAgentV2Attributes.fleetPolicies) && Objects.equals(this.hostname, fleetAgentV2Attributes.hostname) && Objects.equals(this.instrumentationErrorCounts, fleetAgentV2Attributes.instrumentationErrorCounts) && Objects.equals(this.instrumentationStatus, fleetAgentV2Attributes.instrumentationStatus) && Objects.equals(this.integrations, fleetAgentV2Attributes.integrations) && Objects.equals(this.ipAddresses, fleetAgentV2Attributes.ipAddresses) && Objects.equals(this.isSingleStepInstrumentationEnabled, fleetAgentV2Attributes.isSingleStepInstrumentationEnabled) && Objects.equals(this.lastRestartAt, fleetAgentV2Attributes.lastRestartAt) && Objects.equals(this.os, fleetAgentV2Attributes.os) && Objects.equals(this.otelCollectorDeploymentTypes, fleetAgentV2Attributes.otelCollectorDeploymentTypes) && Objects.equals(this.otelCollectorDistributions, fleetAgentV2Attributes.otelCollectorDistributions) && Objects.equals(this.otelCollectorVersions, fleetAgentV2Attributes.otelCollectorVersions) && Objects.equals(this.otelResourceAttributes, fleetAgentV2Attributes.otelResourceAttributes) && Objects.equals(this.podName, fleetAgentV2Attributes.podName) && Objects.equals(this.remoteAgentManagement, fleetAgentV2Attributes.remoteAgentManagement) && Objects.equals(this.remoteConfigStatus, fleetAgentV2Attributes.remoteConfigStatus) && Objects.equals(this.services, fleetAgentV2Attributes.services) && Objects.equals(this.tags, fleetAgentV2Attributes.tags) && Objects.equals(this.team, fleetAgentV2Attributes.team) && Objects.equals(this.additionalProperties, fleetAgentV2Attributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(agentVersion,apiKeyName,apiKeyUuid,cloudProvider,clusterName,datadogDataCenter,ecsFargateClusterName,ecsFargateTaskArn,enabledProducts,env,firstSeenAt,fleetPolicies,hostname,instrumentationErrorCounts,instrumentationStatus,integrations,ipAddresses,isSingleStepInstrumentationEnabled,lastRestartAt,os,otelCollectorDeploymentTypes,otelCollectorDistributions,otelCollectorVersions,otelResourceAttributes,podName,remoteAgentManagement,remoteConfigStatus,services,tags,team, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetAgentV2Attributes {\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    apiKeyName: ").append(toIndentedString(apiKeyName)).append("\n");
    sb.append("    apiKeyUuid: ").append(toIndentedString(apiKeyUuid)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    datadogDataCenter: ").append(toIndentedString(datadogDataCenter)).append("\n");
    sb.append("    ecsFargateClusterName: ").append(toIndentedString(ecsFargateClusterName)).append("\n");
    sb.append("    ecsFargateTaskArn: ").append(toIndentedString(ecsFargateTaskArn)).append("\n");
    sb.append("    enabledProducts: ").append(toIndentedString(enabledProducts)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    firstSeenAt: ").append(toIndentedString(firstSeenAt)).append("\n");
    sb.append("    fleetPolicies: ").append(toIndentedString(fleetPolicies)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    instrumentationErrorCounts: ").append(toIndentedString(instrumentationErrorCounts)).append("\n");
    sb.append("    instrumentationStatus: ").append(toIndentedString(instrumentationStatus)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    isSingleStepInstrumentationEnabled: ").append(toIndentedString(isSingleStepInstrumentationEnabled)).append("\n");
    sb.append("    lastRestartAt: ").append(toIndentedString(lastRestartAt)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    otelCollectorDeploymentTypes: ").append(toIndentedString(otelCollectorDeploymentTypes)).append("\n");
    sb.append("    otelCollectorDistributions: ").append(toIndentedString(otelCollectorDistributions)).append("\n");
    sb.append("    otelCollectorVersions: ").append(toIndentedString(otelCollectorVersions)).append("\n");
    sb.append("    otelResourceAttributes: ").append(toIndentedString(otelResourceAttributes)).append("\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
    sb.append("    remoteAgentManagement: ").append(toIndentedString(remoteAgentManagement)).append("\n");
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
