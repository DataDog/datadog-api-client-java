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
   * <p>Attributes of a Datadog Agent in the list view.</p>
 */
@JsonPropertyOrder({
  FleetAgentAttributes.JSON_PROPERTY_AGENT_VERSION,
  FleetAgentAttributes.JSON_PROPERTY_API_KEY_NAME,
  FleetAgentAttributes.JSON_PROPERTY_API_KEY_UUID,
  FleetAgentAttributes.JSON_PROPERTY_CLOUD_PROVIDER,
  FleetAgentAttributes.JSON_PROPERTY_CLUSTER_NAME,
  FleetAgentAttributes.JSON_PROPERTY_DATADOG_AGENT_KEY,
  FleetAgentAttributes.JSON_PROPERTY_ENABLED_PRODUCTS,
  FleetAgentAttributes.JSON_PROPERTY_ENVS,
  FleetAgentAttributes.JSON_PROPERTY_FIRST_SEEN_AT,
  FleetAgentAttributes.JSON_PROPERTY_HOSTNAME,
  FleetAgentAttributes.JSON_PROPERTY_IP_ADDRESSES,
  FleetAgentAttributes.JSON_PROPERTY_IS_SINGLE_STEP_INSTRUMENTATION_ENABLED,
  FleetAgentAttributes.JSON_PROPERTY_LAST_RESTART_AT,
  FleetAgentAttributes.JSON_PROPERTY_OS,
  FleetAgentAttributes.JSON_PROPERTY_OTEL_COLLECTOR_VERSION,
  FleetAgentAttributes.JSON_PROPERTY_OTEL_COLLECTOR_VERSIONS,
  FleetAgentAttributes.JSON_PROPERTY_POD_NAME,
  FleetAgentAttributes.JSON_PROPERTY_REMOTE_AGENT_MANAGEMENT,
  FleetAgentAttributes.JSON_PROPERTY_REMOTE_CONFIG_STATUS,
  FleetAgentAttributes.JSON_PROPERTY_SERVICES,
  FleetAgentAttributes.JSON_PROPERTY_TAGS,
  FleetAgentAttributes.JSON_PROPERTY_TEAM
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetAgentAttributes {
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

  public static final String JSON_PROPERTY_DATADOG_AGENT_KEY = "datadog_agent_key";
  private String datadogAgentKey;

  public static final String JSON_PROPERTY_ENABLED_PRODUCTS = "enabled_products";
  private List<String> enabledProducts = null;

  public static final String JSON_PROPERTY_ENVS = "envs";
  private List<String> envs = null;

  public static final String JSON_PROPERTY_FIRST_SEEN_AT = "first_seen_at";
  private Long firstSeenAt;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_IP_ADDRESSES = "ip_addresses";
  private List<String> ipAddresses = null;

  public static final String JSON_PROPERTY_IS_SINGLE_STEP_INSTRUMENTATION_ENABLED = "is_single_step_instrumentation_enabled";
  private Boolean isSingleStepInstrumentationEnabled;

  public static final String JSON_PROPERTY_LAST_RESTART_AT = "last_restart_at";
  private Long lastRestartAt;

  public static final String JSON_PROPERTY_OS = "os";
  private String os;

  public static final String JSON_PROPERTY_OTEL_COLLECTOR_VERSION = "otel_collector_version";
  private String otelCollectorVersion;

  public static final String JSON_PROPERTY_OTEL_COLLECTOR_VERSIONS = "otel_collector_versions";
  private List<String> otelCollectorVersions = null;

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

  public FleetAgentAttributes agentVersion(String agentVersion) {
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
  public FleetAgentAttributes apiKeyName(String apiKeyName) {
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
  public FleetAgentAttributes apiKeyUuid(String apiKeyUuid) {
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
  public FleetAgentAttributes cloudProvider(String cloudProvider) {
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
  public FleetAgentAttributes clusterName(String clusterName) {
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
  public FleetAgentAttributes datadogAgentKey(String datadogAgentKey) {
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
  public FleetAgentAttributes enabledProducts(List<String> enabledProducts) {
    this.enabledProducts = enabledProducts;
    return this;
  }
  public FleetAgentAttributes addEnabledProductsItem(String enabledProductsItem) {
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
  public FleetAgentAttributes envs(List<String> envs) {
    this.envs = envs;
    return this;
  }
  public FleetAgentAttributes addEnvsItem(String envsItem) {
    if (this.envs == null) {
      this.envs = new ArrayList<>();
    }
    this.envs.add(envsItem);
    return this;
  }

  /**
   * <p>Environments the agent is reporting from.</p>
   * @return envs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENVS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getEnvs() {
        return envs;
      }
  public void setEnvs(List<String> envs) {
    this.envs = envs;
  }
  public FleetAgentAttributes firstSeenAt(Long firstSeenAt) {
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
  public FleetAgentAttributes hostname(String hostname) {
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
  public FleetAgentAttributes ipAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }
  public FleetAgentAttributes addIpAddressesItem(String ipAddressesItem) {
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
  public FleetAgentAttributes isSingleStepInstrumentationEnabled(Boolean isSingleStepInstrumentationEnabled) {
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
  public FleetAgentAttributes lastRestartAt(Long lastRestartAt) {
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
  public FleetAgentAttributes os(String os) {
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
  public FleetAgentAttributes otelCollectorVersion(String otelCollectorVersion) {
    this.otelCollectorVersion = otelCollectorVersion;
    return this;
  }

  /**
   * <p>OpenTelemetry collector version (if applicable).</p>
   * @return otelCollectorVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OTEL_COLLECTOR_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOtelCollectorVersion() {
        return otelCollectorVersion;
      }
  public void setOtelCollectorVersion(String otelCollectorVersion) {
    this.otelCollectorVersion = otelCollectorVersion;
  }
  public FleetAgentAttributes otelCollectorVersions(List<String> otelCollectorVersions) {
    this.otelCollectorVersions = otelCollectorVersions;
    return this;
  }
  public FleetAgentAttributes addOtelCollectorVersionsItem(String otelCollectorVersionsItem) {
    if (this.otelCollectorVersions == null) {
      this.otelCollectorVersions = new ArrayList<>();
    }
    this.otelCollectorVersions.add(otelCollectorVersionsItem);
    return this;
  }

  /**
   * <p>List of OpenTelemetry collector versions (if applicable).</p>
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
  public FleetAgentAttributes podName(String podName) {
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
  public FleetAgentAttributes remoteAgentManagement(String remoteAgentManagement) {
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
  public FleetAgentAttributes remoteConfigStatus(String remoteConfigStatus) {
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
  public FleetAgentAttributes services(List<String> services) {
    this.services = services;
    return this;
  }
  public FleetAgentAttributes addServicesItem(String servicesItem) {
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
  public FleetAgentAttributes tags(List<FleetAgentAttributesTagsItems> tags) {
    this.tags = tags;
    for (FleetAgentAttributesTagsItems item : tags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public FleetAgentAttributes addTagsItem(FleetAgentAttributesTagsItems tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    this.unparsed |= tagsItem.unparsed;
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
      public List<FleetAgentAttributesTagsItems> getTags() {
        return tags;
      }
  public void setTags(List<FleetAgentAttributesTagsItems> tags) {
    this.tags = tags;
  }
  public FleetAgentAttributes team(String team) {
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
   * @return FleetAgentAttributes
   */
  @JsonAnySetter
  public FleetAgentAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this FleetAgentAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetAgentAttributes fleetAgentAttributes = (FleetAgentAttributes) o;
    return Objects.equals(this.agentVersion, fleetAgentAttributes.agentVersion) && Objects.equals(this.apiKeyName, fleetAgentAttributes.apiKeyName) && Objects.equals(this.apiKeyUuid, fleetAgentAttributes.apiKeyUuid) && Objects.equals(this.cloudProvider, fleetAgentAttributes.cloudProvider) && Objects.equals(this.clusterName, fleetAgentAttributes.clusterName) && Objects.equals(this.datadogAgentKey, fleetAgentAttributes.datadogAgentKey) && Objects.equals(this.enabledProducts, fleetAgentAttributes.enabledProducts) && Objects.equals(this.envs, fleetAgentAttributes.envs) && Objects.equals(this.firstSeenAt, fleetAgentAttributes.firstSeenAt) && Objects.equals(this.hostname, fleetAgentAttributes.hostname) && Objects.equals(this.ipAddresses, fleetAgentAttributes.ipAddresses) && Objects.equals(this.isSingleStepInstrumentationEnabled, fleetAgentAttributes.isSingleStepInstrumentationEnabled) && Objects.equals(this.lastRestartAt, fleetAgentAttributes.lastRestartAt) && Objects.equals(this.os, fleetAgentAttributes.os) && Objects.equals(this.otelCollectorVersion, fleetAgentAttributes.otelCollectorVersion) && Objects.equals(this.otelCollectorVersions, fleetAgentAttributes.otelCollectorVersions) && Objects.equals(this.podName, fleetAgentAttributes.podName) && Objects.equals(this.remoteAgentManagement, fleetAgentAttributes.remoteAgentManagement) && Objects.equals(this.remoteConfigStatus, fleetAgentAttributes.remoteConfigStatus) && Objects.equals(this.services, fleetAgentAttributes.services) && Objects.equals(this.tags, fleetAgentAttributes.tags) && Objects.equals(this.team, fleetAgentAttributes.team) && Objects.equals(this.additionalProperties, fleetAgentAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(agentVersion,apiKeyName,apiKeyUuid,cloudProvider,clusterName,datadogAgentKey,enabledProducts,envs,firstSeenAt,hostname,ipAddresses,isSingleStepInstrumentationEnabled,lastRestartAt,os,otelCollectorVersion,otelCollectorVersions,podName,remoteAgentManagement,remoteConfigStatus,services,tags,team, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetAgentAttributes {\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    apiKeyName: ").append(toIndentedString(apiKeyName)).append("\n");
    sb.append("    apiKeyUuid: ").append(toIndentedString(apiKeyUuid)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    datadogAgentKey: ").append(toIndentedString(datadogAgentKey)).append("\n");
    sb.append("    enabledProducts: ").append(toIndentedString(enabledProducts)).append("\n");
    sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
    sb.append("    firstSeenAt: ").append(toIndentedString(firstSeenAt)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    isSingleStepInstrumentationEnabled: ").append(toIndentedString(isSingleStepInstrumentationEnabled)).append("\n");
    sb.append("    lastRestartAt: ").append(toIndentedString(lastRestartAt)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    otelCollectorVersion: ").append(toIndentedString(otelCollectorVersion)).append("\n");
    sb.append("    otelCollectorVersions: ").append(toIndentedString(otelCollectorVersions)).append("\n");
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
