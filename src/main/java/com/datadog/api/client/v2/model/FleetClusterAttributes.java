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

/** Attributes of a Kubernetes cluster in the fleet. */
@JsonPropertyOrder({
  FleetClusterAttributes.JSON_PROPERTY_AGENT_VERSIONS,
  FleetClusterAttributes.JSON_PROPERTY_API_KEY_NAMES,
  FleetClusterAttributes.JSON_PROPERTY_API_KEY_UUIDS,
  FleetClusterAttributes.JSON_PROPERTY_CLOUD_PROVIDERS,
  FleetClusterAttributes.JSON_PROPERTY_CLUSTER_NAME,
  FleetClusterAttributes.JSON_PROPERTY_ENABLED_PRODUCTS,
  FleetClusterAttributes.JSON_PROPERTY_ENVS,
  FleetClusterAttributes.JSON_PROPERTY_FIRST_SEEN_AT,
  FleetClusterAttributes.JSON_PROPERTY_INSTALL_METHOD_TOOL,
  FleetClusterAttributes.JSON_PROPERTY_NODE_COUNT,
  FleetClusterAttributes.JSON_PROPERTY_NODE_COUNT_BY_STATUS,
  FleetClusterAttributes.JSON_PROPERTY_OPERATING_SYSTEMS,
  FleetClusterAttributes.JSON_PROPERTY_OTEL_COLLECTOR_DISTRIBUTIONS,
  FleetClusterAttributes.JSON_PROPERTY_OTEL_COLLECTOR_VERSIONS,
  FleetClusterAttributes.JSON_PROPERTY_POD_COUNT_BY_STATE,
  FleetClusterAttributes.JSON_PROPERTY_SERVICES,
  FleetClusterAttributes.JSON_PROPERTY_TEAMS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetClusterAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_VERSIONS = "agent_versions";
  private List<String> agentVersions = null;

  public static final String JSON_PROPERTY_API_KEY_NAMES = "api_key_names";
  private List<String> apiKeyNames = null;

  public static final String JSON_PROPERTY_API_KEY_UUIDS = "api_key_uuids";
  private List<String> apiKeyUuids = null;

  public static final String JSON_PROPERTY_CLOUD_PROVIDERS = "cloud_providers";
  private List<String> cloudProviders = null;

  public static final String JSON_PROPERTY_CLUSTER_NAME = "cluster_name";
  private String clusterName;

  public static final String JSON_PROPERTY_ENABLED_PRODUCTS = "enabled_products";
  private List<String> enabledProducts = null;

  public static final String JSON_PROPERTY_ENVS = "envs";
  private List<String> envs = null;

  public static final String JSON_PROPERTY_FIRST_SEEN_AT = "first_seen_at";
  private Long firstSeenAt;

  public static final String JSON_PROPERTY_INSTALL_METHOD_TOOL = "install_method_tool";
  private String installMethodTool;

  public static final String JSON_PROPERTY_NODE_COUNT = "node_count";
  private Long nodeCount;

  public static final String JSON_PROPERTY_NODE_COUNT_BY_STATUS = "node_count_by_status";
  private Map<String, Long> nodeCountByStatus = null;

  public static final String JSON_PROPERTY_OPERATING_SYSTEMS = "operating_systems";
  private List<String> operatingSystems = null;

  public static final String JSON_PROPERTY_OTEL_COLLECTOR_DISTRIBUTIONS =
      "otel_collector_distributions";
  private List<String> otelCollectorDistributions = null;

  public static final String JSON_PROPERTY_OTEL_COLLECTOR_VERSIONS = "otel_collector_versions";
  private List<String> otelCollectorVersions = null;

  public static final String JSON_PROPERTY_POD_COUNT_BY_STATE = "pod_count_by_state";
  private Map<String, Long> podCountByState = null;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<String> services = null;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<String> teams = null;

  public FleetClusterAttributes agentVersions(List<String> agentVersions) {
    this.agentVersions = agentVersions;
    return this;
  }

  public FleetClusterAttributes addAgentVersionsItem(String agentVersionsItem) {
    if (this.agentVersions == null) {
      this.agentVersions = new ArrayList<>();
    }
    this.agentVersions.add(agentVersionsItem);
    return this;
  }

  /**
   * Datadog Agent versions running in the cluster.
   *
   * @return agentVersions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAgentVersions() {
    return agentVersions;
  }

  public void setAgentVersions(List<String> agentVersions) {
    this.agentVersions = agentVersions;
  }

  public FleetClusterAttributes apiKeyNames(List<String> apiKeyNames) {
    this.apiKeyNames = apiKeyNames;
    return this;
  }

  public FleetClusterAttributes addApiKeyNamesItem(String apiKeyNamesItem) {
    if (this.apiKeyNames == null) {
      this.apiKeyNames = new ArrayList<>();
    }
    this.apiKeyNames.add(apiKeyNamesItem);
    return this;
  }

  /**
   * API key names used by agents in the cluster.
   *
   * @return apiKeyNames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEY_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getApiKeyNames() {
    return apiKeyNames;
  }

  public void setApiKeyNames(List<String> apiKeyNames) {
    this.apiKeyNames = apiKeyNames;
  }

  public FleetClusterAttributes apiKeyUuids(List<String> apiKeyUuids) {
    this.apiKeyUuids = apiKeyUuids;
    return this;
  }

  public FleetClusterAttributes addApiKeyUuidsItem(String apiKeyUuidsItem) {
    if (this.apiKeyUuids == null) {
      this.apiKeyUuids = new ArrayList<>();
    }
    this.apiKeyUuids.add(apiKeyUuidsItem);
    return this;
  }

  /**
   * API key UUIDs used by agents in the cluster.
   *
   * @return apiKeyUuids
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEY_UUIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getApiKeyUuids() {
    return apiKeyUuids;
  }

  public void setApiKeyUuids(List<String> apiKeyUuids) {
    this.apiKeyUuids = apiKeyUuids;
  }

  public FleetClusterAttributes cloudProviders(List<String> cloudProviders) {
    this.cloudProviders = cloudProviders;
    return this;
  }

  public FleetClusterAttributes addCloudProvidersItem(String cloudProvidersItem) {
    if (this.cloudProviders == null) {
      this.cloudProviders = new ArrayList<>();
    }
    this.cloudProviders.add(cloudProvidersItem);
    return this;
  }

  /**
   * Cloud providers hosting the cluster.
   *
   * @return cloudProviders
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCloudProviders() {
    return cloudProviders;
  }

  public void setCloudProviders(List<String> cloudProviders) {
    this.cloudProviders = cloudProviders;
  }

  public FleetClusterAttributes clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * The name of the Kubernetes cluster.
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

  public FleetClusterAttributes enabledProducts(List<String> enabledProducts) {
    this.enabledProducts = enabledProducts;
    return this;
  }

  public FleetClusterAttributes addEnabledProductsItem(String enabledProductsItem) {
    if (this.enabledProducts == null) {
      this.enabledProducts = new ArrayList<>();
    }
    this.enabledProducts.add(enabledProductsItem);
    return this;
  }

  /**
   * Datadog products enabled in the cluster.
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

  public FleetClusterAttributes envs(List<String> envs) {
    this.envs = envs;
    return this;
  }

  public FleetClusterAttributes addEnvsItem(String envsItem) {
    if (this.envs == null) {
      this.envs = new ArrayList<>();
    }
    this.envs.add(envsItem);
    return this;
  }

  /**
   * Environments associated with the cluster.
   *
   * @return envs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnvs() {
    return envs;
  }

  public void setEnvs(List<String> envs) {
    this.envs = envs;
  }

  public FleetClusterAttributes firstSeenAt(Long firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
    return this;
  }

  /**
   * Timestamp when the cluster was first seen.
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

  public FleetClusterAttributes installMethodTool(String installMethodTool) {
    this.installMethodTool = installMethodTool;
    return this;
  }

  /**
   * The tool used to install agents in the cluster.
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

  public FleetClusterAttributes nodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

  /**
   * Total number of nodes in the cluster.
   *
   * @return nodeCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNodeCount() {
    return nodeCount;
  }

  public void setNodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
  }

  public FleetClusterAttributes nodeCountByStatus(Map<String, Long> nodeCountByStatus) {
    this.nodeCountByStatus = nodeCountByStatus;
    return this;
  }

  public FleetClusterAttributes putNodeCountByStatusItem(String key, Long nodeCountByStatusItem) {
    if (this.nodeCountByStatus == null) {
      this.nodeCountByStatus = new HashMap<>();
    }
    this.nodeCountByStatus.put(key, nodeCountByStatusItem);
    return this;
  }

  /**
   * Node counts grouped by status.
   *
   * @return nodeCountByStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_COUNT_BY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Long> getNodeCountByStatus() {
    return nodeCountByStatus;
  }

  public void setNodeCountByStatus(Map<String, Long> nodeCountByStatus) {
    this.nodeCountByStatus = nodeCountByStatus;
  }

  public FleetClusterAttributes operatingSystems(List<String> operatingSystems) {
    this.operatingSystems = operatingSystems;
    return this;
  }

  public FleetClusterAttributes addOperatingSystemsItem(String operatingSystemsItem) {
    if (this.operatingSystems == null) {
      this.operatingSystems = new ArrayList<>();
    }
    this.operatingSystems.add(operatingSystemsItem);
    return this;
  }

  /**
   * Operating systems of nodes in the cluster.
   *
   * @return operatingSystems
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getOperatingSystems() {
    return operatingSystems;
  }

  public void setOperatingSystems(List<String> operatingSystems) {
    this.operatingSystems = operatingSystems;
  }

  public FleetClusterAttributes otelCollectorDistributions(
      List<String> otelCollectorDistributions) {
    this.otelCollectorDistributions = otelCollectorDistributions;
    return this;
  }

  public FleetClusterAttributes addOtelCollectorDistributionsItem(
      String otelCollectorDistributionsItem) {
    if (this.otelCollectorDistributions == null) {
      this.otelCollectorDistributions = new ArrayList<>();
    }
    this.otelCollectorDistributions.add(otelCollectorDistributionsItem);
    return this;
  }

  /**
   * OpenTelemetry collector distributions in the cluster.
   *
   * @return otelCollectorDistributions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTEL_COLLECTOR_DISTRIBUTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getOtelCollectorDistributions() {
    return otelCollectorDistributions;
  }

  public void setOtelCollectorDistributions(List<String> otelCollectorDistributions) {
    this.otelCollectorDistributions = otelCollectorDistributions;
  }

  public FleetClusterAttributes otelCollectorVersions(List<String> otelCollectorVersions) {
    this.otelCollectorVersions = otelCollectorVersions;
    return this;
  }

  public FleetClusterAttributes addOtelCollectorVersionsItem(String otelCollectorVersionsItem) {
    if (this.otelCollectorVersions == null) {
      this.otelCollectorVersions = new ArrayList<>();
    }
    this.otelCollectorVersions.add(otelCollectorVersionsItem);
    return this;
  }

  /**
   * OpenTelemetry collector versions in the cluster.
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

  public FleetClusterAttributes podCountByState(Map<String, Long> podCountByState) {
    this.podCountByState = podCountByState;
    return this;
  }

  public FleetClusterAttributes putPodCountByStateItem(String key, Long podCountByStateItem) {
    if (this.podCountByState == null) {
      this.podCountByState = new HashMap<>();
    }
    this.podCountByState.put(key, podCountByStateItem);
    return this;
  }

  /**
   * Pod counts grouped by state.
   *
   * @return podCountByState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POD_COUNT_BY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Long> getPodCountByState() {
    return podCountByState;
  }

  public void setPodCountByState(Map<String, Long> podCountByState) {
    this.podCountByState = podCountByState;
  }

  public FleetClusterAttributes services(List<String> services) {
    this.services = services;
    return this;
  }

  public FleetClusterAttributes addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Services running in the cluster.
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

  public FleetClusterAttributes teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public FleetClusterAttributes addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Teams associated with the cluster.
   *
   * @return teams
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTeams() {
    return teams;
  }

  public void setTeams(List<String> teams) {
    this.teams = teams;
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
   * @return FleetClusterAttributes
   */
  @JsonAnySetter
  public FleetClusterAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetClusterAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetClusterAttributes fleetClusterAttributes = (FleetClusterAttributes) o;
    return Objects.equals(this.agentVersions, fleetClusterAttributes.agentVersions)
        && Objects.equals(this.apiKeyNames, fleetClusterAttributes.apiKeyNames)
        && Objects.equals(this.apiKeyUuids, fleetClusterAttributes.apiKeyUuids)
        && Objects.equals(this.cloudProviders, fleetClusterAttributes.cloudProviders)
        && Objects.equals(this.clusterName, fleetClusterAttributes.clusterName)
        && Objects.equals(this.enabledProducts, fleetClusterAttributes.enabledProducts)
        && Objects.equals(this.envs, fleetClusterAttributes.envs)
        && Objects.equals(this.firstSeenAt, fleetClusterAttributes.firstSeenAt)
        && Objects.equals(this.installMethodTool, fleetClusterAttributes.installMethodTool)
        && Objects.equals(this.nodeCount, fleetClusterAttributes.nodeCount)
        && Objects.equals(this.nodeCountByStatus, fleetClusterAttributes.nodeCountByStatus)
        && Objects.equals(this.operatingSystems, fleetClusterAttributes.operatingSystems)
        && Objects.equals(
            this.otelCollectorDistributions, fleetClusterAttributes.otelCollectorDistributions)
        && Objects.equals(this.otelCollectorVersions, fleetClusterAttributes.otelCollectorVersions)
        && Objects.equals(this.podCountByState, fleetClusterAttributes.podCountByState)
        && Objects.equals(this.services, fleetClusterAttributes.services)
        && Objects.equals(this.teams, fleetClusterAttributes.teams)
        && Objects.equals(this.additionalProperties, fleetClusterAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentVersions,
        apiKeyNames,
        apiKeyUuids,
        cloudProviders,
        clusterName,
        enabledProducts,
        envs,
        firstSeenAt,
        installMethodTool,
        nodeCount,
        nodeCountByStatus,
        operatingSystems,
        otelCollectorDistributions,
        otelCollectorVersions,
        podCountByState,
        services,
        teams,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetClusterAttributes {\n");
    sb.append("    agentVersions: ").append(toIndentedString(agentVersions)).append("\n");
    sb.append("    apiKeyNames: ").append(toIndentedString(apiKeyNames)).append("\n");
    sb.append("    apiKeyUuids: ").append(toIndentedString(apiKeyUuids)).append("\n");
    sb.append("    cloudProviders: ").append(toIndentedString(cloudProviders)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    enabledProducts: ").append(toIndentedString(enabledProducts)).append("\n");
    sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
    sb.append("    firstSeenAt: ").append(toIndentedString(firstSeenAt)).append("\n");
    sb.append("    installMethodTool: ").append(toIndentedString(installMethodTool)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    nodeCountByStatus: ").append(toIndentedString(nodeCountByStatus)).append("\n");
    sb.append("    operatingSystems: ").append(toIndentedString(operatingSystems)).append("\n");
    sb.append("    otelCollectorDistributions: ")
        .append(toIndentedString(otelCollectorDistributions))
        .append("\n");
    sb.append("    otelCollectorVersions: ")
        .append(toIndentedString(otelCollectorVersions))
        .append("\n");
    sb.append("    podCountByState: ").append(toIndentedString(podCountByState)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
