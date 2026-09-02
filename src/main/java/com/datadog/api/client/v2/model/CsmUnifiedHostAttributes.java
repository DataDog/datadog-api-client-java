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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a unified host, combining data from agent and agentless sources. */
@JsonPropertyOrder({
  CsmUnifiedHostAttributes.JSON_PROPERTY_ACCOUNT_ID,
  CsmUnifiedHostAttributes.JSON_PROPERTY_AGENT_CSM_VM_CONTAINERS_ENABLED,
  CsmUnifiedHostAttributes.JSON_PROPERTY_AGENT_CSM_VM_HOSTS_ENABLED,
  CsmUnifiedHostAttributes.JSON_PROPERTY_AGENT_CWS_ENABLED,
  CsmUnifiedHostAttributes.JSON_PROPERTY_AGENT_POSTURE_MANAGEMENT,
  CsmUnifiedHostAttributes.JSON_PROPERTY_AGENT_VERSION,
  CsmUnifiedHostAttributes.JSON_PROPERTY_AGENTLESS_POSTURE_MANAGEMENT,
  CsmUnifiedHostAttributes.JSON_PROPERTY_AGENTLESS_VULNERABILITY_SCANNING,
  CsmUnifiedHostAttributes.JSON_PROPERTY_CLOUD_PROVIDER,
  CsmUnifiedHostAttributes.JSON_PROPERTY_CLUSTER_NAME,
  CsmUnifiedHostAttributes.JSON_PROPERTY_DATADOG_AGENT_KEY,
  CsmUnifiedHostAttributes.JSON_PROPERTY_ENV,
  CsmUnifiedHostAttributes.JSON_PROPERTY_HOST_ID,
  CsmUnifiedHostAttributes.JSON_PROPERTY_INSTALL_METHOD_TOOL,
  CsmUnifiedHostAttributes.JSON_PROPERTY_OS,
  CsmUnifiedHostAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  CsmUnifiedHostAttributes.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmUnifiedHostAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private JsonNullable<String> accountId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AGENT_CSM_VM_CONTAINERS_ENABLED =
      "agent_csm_vm_containers_enabled";
  private JsonNullable<Boolean> agentCsmVmContainersEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_AGENT_CSM_VM_HOSTS_ENABLED =
      "agent_csm_vm_hosts_enabled";
  private JsonNullable<Boolean> agentCsmVmHostsEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_AGENT_CWS_ENABLED = "agent_cws_enabled";
  private JsonNullable<Boolean> agentCwsEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_AGENT_POSTURE_MANAGEMENT = "agent_posture_management";
  private JsonNullable<Boolean> agentPostureManagement = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_AGENT_VERSION = "agent_version";
  private JsonNullable<String> agentVersion = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AGENTLESS_POSTURE_MANAGEMENT =
      "agentless_posture_management";
  private JsonNullable<Boolean> agentlessPostureManagement = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_AGENTLESS_VULNERABILITY_SCANNING =
      "agentless_vulnerability_scanning";
  private JsonNullable<Boolean> agentlessVulnerabilityScanning = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private CsmCloudProvider cloudProvider;

  public static final String JSON_PROPERTY_CLUSTER_NAME = "cluster_name";
  private JsonNullable<String> clusterName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATADOG_AGENT_KEY = "datadog_agent_key";
  private JsonNullable<String> datadogAgentKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENV = "env";
  private JsonNullable<List<String>> env = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_HOST_ID = "host_id";
  private JsonNullable<Long> hostId = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_INSTALL_METHOD_TOOL = "install_method_tool";
  private JsonNullable<String> installMethodTool = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OS = "os";
  private JsonNullable<String> os = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private CsmAgentlessHostResourceType resourceType;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private CsmUnifiedHostSource source;

  public CsmUnifiedHostAttributes() {}

  @JsonCreator
  public CsmUnifiedHostAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) CsmUnifiedHostSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
  }

  public CsmUnifiedHostAttributes accountId(String accountId) {
    this.accountId = JsonNullable.<String>of(accountId);
    return this;
  }

  /**
   * The ID of the cloud account that the host belongs to. Present only when the host was discovered
   * through agentless scanning.
   *
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getAccountId() {
    return accountId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAccountId_JsonNullable() {
    return accountId;
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  public void setAccountId_JsonNullable(JsonNullable<String> accountId) {
    this.accountId = accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = JsonNullable.<String>of(accountId);
  }

  public CsmUnifiedHostAttributes agentCsmVmContainersEnabled(Boolean agentCsmVmContainersEnabled) {
    this.agentCsmVmContainersEnabled = JsonNullable.<Boolean>of(agentCsmVmContainersEnabled);
    return this;
  }

  /**
   * Whether CSM Vulnerabilities is enabled for containers through the Datadog Agent. <code>true
   * </code> if enabled; <code>false</code> if disabled.
   *
   * @return agentCsmVmContainersEnabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getAgentCsmVmContainersEnabled() {
    return agentCsmVmContainersEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGENT_CSM_VM_CONTAINERS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getAgentCsmVmContainersEnabled_JsonNullable() {
    return agentCsmVmContainersEnabled;
  }

  @JsonProperty(JSON_PROPERTY_AGENT_CSM_VM_CONTAINERS_ENABLED)
  public void setAgentCsmVmContainersEnabled_JsonNullable(
      JsonNullable<Boolean> agentCsmVmContainersEnabled) {
    this.agentCsmVmContainersEnabled = agentCsmVmContainersEnabled;
  }

  public void setAgentCsmVmContainersEnabled(Boolean agentCsmVmContainersEnabled) {
    this.agentCsmVmContainersEnabled = JsonNullable.<Boolean>of(agentCsmVmContainersEnabled);
  }

  public CsmUnifiedHostAttributes agentCsmVmHostsEnabled(Boolean agentCsmVmHostsEnabled) {
    this.agentCsmVmHostsEnabled = JsonNullable.<Boolean>of(agentCsmVmHostsEnabled);
    return this;
  }

  /**
   * Whether CSM Vulnerabilities is enabled for hosts through the Datadog Agent. <code>true</code>
   * if enabled; <code>false</code> if disabled.
   *
   * @return agentCsmVmHostsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getAgentCsmVmHostsEnabled() {
    return agentCsmVmHostsEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGENT_CSM_VM_HOSTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getAgentCsmVmHostsEnabled_JsonNullable() {
    return agentCsmVmHostsEnabled;
  }

  @JsonProperty(JSON_PROPERTY_AGENT_CSM_VM_HOSTS_ENABLED)
  public void setAgentCsmVmHostsEnabled_JsonNullable(JsonNullable<Boolean> agentCsmVmHostsEnabled) {
    this.agentCsmVmHostsEnabled = agentCsmVmHostsEnabled;
  }

  public void setAgentCsmVmHostsEnabled(Boolean agentCsmVmHostsEnabled) {
    this.agentCsmVmHostsEnabled = JsonNullable.<Boolean>of(agentCsmVmHostsEnabled);
  }

  public CsmUnifiedHostAttributes agentCwsEnabled(Boolean agentCwsEnabled) {
    this.agentCwsEnabled = JsonNullable.<Boolean>of(agentCwsEnabled);
    return this;
  }

  /**
   * Whether CSM Threats is enabled for this host through the Datadog Agent. <code>true</code> if
   * enabled; <code>false</code> if disabled.
   *
   * @return agentCwsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getAgentCwsEnabled() {
    return agentCwsEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGENT_CWS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getAgentCwsEnabled_JsonNullable() {
    return agentCwsEnabled;
  }

  @JsonProperty(JSON_PROPERTY_AGENT_CWS_ENABLED)
  public void setAgentCwsEnabled_JsonNullable(JsonNullable<Boolean> agentCwsEnabled) {
    this.agentCwsEnabled = agentCwsEnabled;
  }

  public void setAgentCwsEnabled(Boolean agentCwsEnabled) {
    this.agentCwsEnabled = JsonNullable.<Boolean>of(agentCwsEnabled);
  }

  public CsmUnifiedHostAttributes agentPostureManagement(Boolean agentPostureManagement) {
    this.agentPostureManagement = JsonNullable.<Boolean>of(agentPostureManagement);
    return this;
  }

  /**
   * Whether CSM Misconfigurations is enabled for this host through the Datadog Agent. <code>true
   * </code> if enabled; <code>false</code> if disabled.
   *
   * @return agentPostureManagement
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getAgentPostureManagement() {
    return agentPostureManagement.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGENT_POSTURE_MANAGEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getAgentPostureManagement_JsonNullable() {
    return agentPostureManagement;
  }

  @JsonProperty(JSON_PROPERTY_AGENT_POSTURE_MANAGEMENT)
  public void setAgentPostureManagement_JsonNullable(JsonNullable<Boolean> agentPostureManagement) {
    this.agentPostureManagement = agentPostureManagement;
  }

  public void setAgentPostureManagement(Boolean agentPostureManagement) {
    this.agentPostureManagement = JsonNullable.<Boolean>of(agentPostureManagement);
  }

  public CsmUnifiedHostAttributes agentVersion(String agentVersion) {
    this.agentVersion = JsonNullable.<String>of(agentVersion);
    return this;
  }

  /**
   * The version of the Datadog Agent running on this host.
   *
   * @return agentVersion
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getAgentVersion() {
    return agentVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGENT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAgentVersion_JsonNullable() {
    return agentVersion;
  }

  @JsonProperty(JSON_PROPERTY_AGENT_VERSION)
  public void setAgentVersion_JsonNullable(JsonNullable<String> agentVersion) {
    this.agentVersion = agentVersion;
  }

  public void setAgentVersion(String agentVersion) {
    this.agentVersion = JsonNullable.<String>of(agentVersion);
  }

  public CsmUnifiedHostAttributes agentlessPostureManagement(Boolean agentlessPostureManagement) {
    this.agentlessPostureManagement = JsonNullable.<Boolean>of(agentlessPostureManagement);
    return this;
  }

  /**
   * Whether CSM Misconfigurations is enabled for this host via agentless scanning. <code>true
   * </code> if enabled; <code>false</code> if disabled.
   *
   * @return agentlessPostureManagement
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getAgentlessPostureManagement() {
    return agentlessPostureManagement.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGENTLESS_POSTURE_MANAGEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getAgentlessPostureManagement_JsonNullable() {
    return agentlessPostureManagement;
  }

  @JsonProperty(JSON_PROPERTY_AGENTLESS_POSTURE_MANAGEMENT)
  public void setAgentlessPostureManagement_JsonNullable(
      JsonNullable<Boolean> agentlessPostureManagement) {
    this.agentlessPostureManagement = agentlessPostureManagement;
  }

  public void setAgentlessPostureManagement(Boolean agentlessPostureManagement) {
    this.agentlessPostureManagement = JsonNullable.<Boolean>of(agentlessPostureManagement);
  }

  public CsmUnifiedHostAttributes agentlessVulnerabilityScanning(
      Boolean agentlessVulnerabilityScanning) {
    this.agentlessVulnerabilityScanning = JsonNullable.<Boolean>of(agentlessVulnerabilityScanning);
    return this;
  }

  /**
   * Whether CSM Vulnerabilities is enabled for this host via agentless scanning. <code>true</code>
   * if enabled; <code>false</code> if disabled.
   *
   * @return agentlessVulnerabilityScanning
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getAgentlessVulnerabilityScanning() {
    return agentlessVulnerabilityScanning.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGENTLESS_VULNERABILITY_SCANNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getAgentlessVulnerabilityScanning_JsonNullable() {
    return agentlessVulnerabilityScanning;
  }

  @JsonProperty(JSON_PROPERTY_AGENTLESS_VULNERABILITY_SCANNING)
  public void setAgentlessVulnerabilityScanning_JsonNullable(
      JsonNullable<Boolean> agentlessVulnerabilityScanning) {
    this.agentlessVulnerabilityScanning = agentlessVulnerabilityScanning;
  }

  public void setAgentlessVulnerabilityScanning(Boolean agentlessVulnerabilityScanning) {
    this.agentlessVulnerabilityScanning = JsonNullable.<Boolean>of(agentlessVulnerabilityScanning);
  }

  public CsmUnifiedHostAttributes cloudProvider(CsmCloudProvider cloudProvider) {
    this.cloudProvider = cloudProvider;
    this.unparsed |= !cloudProvider.isValid();
    return this;
  }

  /**
   * The cloud provider of a host resource.
   *
   * @return cloudProvider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CsmCloudProvider getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(CsmCloudProvider cloudProvider) {
    if (!cloudProvider.isValid()) {
      this.unparsed = true;
    }
    this.cloudProvider = cloudProvider;
  }

  public CsmUnifiedHostAttributes clusterName(String clusterName) {
    this.clusterName = JsonNullable.<String>of(clusterName);
    return this;
  }

  /**
   * The name of the Kubernetes cluster the host belongs to, if applicable.
   *
   * @return clusterName
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getClusterName() {
    return clusterName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLUSTER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getClusterName_JsonNullable() {
    return clusterName;
  }

  @JsonProperty(JSON_PROPERTY_CLUSTER_NAME)
  public void setClusterName_JsonNullable(JsonNullable<String> clusterName) {
    this.clusterName = clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = JsonNullable.<String>of(clusterName);
  }

  public CsmUnifiedHostAttributes datadogAgentKey(String datadogAgentKey) {
    this.datadogAgentKey = JsonNullable.<String>of(datadogAgentKey);
    return this;
  }

  /**
   * The Datadog Agent key associated with this host. Present only for agent-sourced hosts.
   *
   * @return datadogAgentKey
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDatadogAgentKey() {
    return datadogAgentKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATADOG_AGENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDatadogAgentKey_JsonNullable() {
    return datadogAgentKey;
  }

  @JsonProperty(JSON_PROPERTY_DATADOG_AGENT_KEY)
  public void setDatadogAgentKey_JsonNullable(JsonNullable<String> datadogAgentKey) {
    this.datadogAgentKey = datadogAgentKey;
  }

  public void setDatadogAgentKey(String datadogAgentKey) {
    this.datadogAgentKey = JsonNullable.<String>of(datadogAgentKey);
  }

  public CsmUnifiedHostAttributes env(List<String> env) {
    this.env = JsonNullable.<List<String>>of(env);
    return this;
  }

  public CsmUnifiedHostAttributes addEnvItem(String envItem) {
    if (this.env == null || !this.env.isPresent()) {
      this.env = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.env.get().add(envItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of environment tags associated with this host.
   *
   * @return env
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getEnv() {
    return env.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getEnv_JsonNullable() {
    return env;
  }

  @JsonProperty(JSON_PROPERTY_ENV)
  public void setEnv_JsonNullable(JsonNullable<List<String>> env) {
    this.env = env;
  }

  public void setEnv(List<String> env) {
    this.env = JsonNullable.<List<String>>of(env);
  }

  public CsmUnifiedHostAttributes hostId(Long hostId) {
    this.hostId = JsonNullable.<Long>of(hostId);
    return this;
  }

  /**
   * The internal Datadog host identifier. Present only for agent-sourced hosts.
   *
   * @return hostId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getHostId() {
    return hostId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getHostId_JsonNullable() {
    return hostId;
  }

  @JsonProperty(JSON_PROPERTY_HOST_ID)
  public void setHostId_JsonNullable(JsonNullable<Long> hostId) {
    this.hostId = hostId;
  }

  public void setHostId(Long hostId) {
    this.hostId = JsonNullable.<Long>of(hostId);
  }

  public CsmUnifiedHostAttributes installMethodTool(String installMethodTool) {
    this.installMethodTool = JsonNullable.<String>of(installMethodTool);
    return this;
  }

  /**
   * The tool used to install the Datadog Agent on this host.
   *
   * @return installMethodTool
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getInstallMethodTool() {
    return installMethodTool.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INSTALL_METHOD_TOOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getInstallMethodTool_JsonNullable() {
    return installMethodTool;
  }

  @JsonProperty(JSON_PROPERTY_INSTALL_METHOD_TOOL)
  public void setInstallMethodTool_JsonNullable(JsonNullable<String> installMethodTool) {
    this.installMethodTool = installMethodTool;
  }

  public void setInstallMethodTool(String installMethodTool) {
    this.installMethodTool = JsonNullable.<String>of(installMethodTool);
  }

  public CsmUnifiedHostAttributes os(String os) {
    this.os = JsonNullable.<String>of(os);
    return this;
  }

  /**
   * The operating system of the host. Present only for agent-sourced hosts.
   *
   * @return os
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getOs() {
    return os.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOs_JsonNullable() {
    return os;
  }

  @JsonProperty(JSON_PROPERTY_OS)
  public void setOs_JsonNullable(JsonNullable<String> os) {
    this.os = os;
  }

  public void setOs(String os) {
    this.os = JsonNullable.<String>of(os);
  }

  public CsmUnifiedHostAttributes resourceType(CsmAgentlessHostResourceType resourceType) {
    this.resourceType = resourceType;
    this.unparsed |= !resourceType.isValid();
    return this;
  }

  /**
   * The type of cloud resource for an agentless host.
   *
   * @return resourceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CsmAgentlessHostResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(CsmAgentlessHostResourceType resourceType) {
    if (!resourceType.isValid()) {
      this.unparsed = true;
    }
    this.resourceType = resourceType;
  }

  public CsmUnifiedHostAttributes source(CsmUnifiedHostSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * The source of a unified host entry, indicating whether it was discovered via agent, agentless
   * scanning, or both.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CsmUnifiedHostSource getSource() {
    return source;
  }

  public void setSource(CsmUnifiedHostSource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
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
   * @return CsmUnifiedHostAttributes
   */
  @JsonAnySetter
  public CsmUnifiedHostAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CsmUnifiedHostAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsmUnifiedHostAttributes csmUnifiedHostAttributes = (CsmUnifiedHostAttributes) o;
    return Objects.equals(this.accountId, csmUnifiedHostAttributes.accountId)
        && Objects.equals(
            this.agentCsmVmContainersEnabled, csmUnifiedHostAttributes.agentCsmVmContainersEnabled)
        && Objects.equals(
            this.agentCsmVmHostsEnabled, csmUnifiedHostAttributes.agentCsmVmHostsEnabled)
        && Objects.equals(this.agentCwsEnabled, csmUnifiedHostAttributes.agentCwsEnabled)
        && Objects.equals(
            this.agentPostureManagement, csmUnifiedHostAttributes.agentPostureManagement)
        && Objects.equals(this.agentVersion, csmUnifiedHostAttributes.agentVersion)
        && Objects.equals(
            this.agentlessPostureManagement, csmUnifiedHostAttributes.agentlessPostureManagement)
        && Objects.equals(
            this.agentlessVulnerabilityScanning,
            csmUnifiedHostAttributes.agentlessVulnerabilityScanning)
        && Objects.equals(this.cloudProvider, csmUnifiedHostAttributes.cloudProvider)
        && Objects.equals(this.clusterName, csmUnifiedHostAttributes.clusterName)
        && Objects.equals(this.datadogAgentKey, csmUnifiedHostAttributes.datadogAgentKey)
        && Objects.equals(this.env, csmUnifiedHostAttributes.env)
        && Objects.equals(this.hostId, csmUnifiedHostAttributes.hostId)
        && Objects.equals(this.installMethodTool, csmUnifiedHostAttributes.installMethodTool)
        && Objects.equals(this.os, csmUnifiedHostAttributes.os)
        && Objects.equals(this.resourceType, csmUnifiedHostAttributes.resourceType)
        && Objects.equals(this.source, csmUnifiedHostAttributes.source)
        && Objects.equals(this.additionalProperties, csmUnifiedHostAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        agentCsmVmContainersEnabled,
        agentCsmVmHostsEnabled,
        agentCwsEnabled,
        agentPostureManagement,
        agentVersion,
        agentlessPostureManagement,
        agentlessVulnerabilityScanning,
        cloudProvider,
        clusterName,
        datadogAgentKey,
        env,
        hostId,
        installMethodTool,
        os,
        resourceType,
        source,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsmUnifiedHostAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agentCsmVmContainersEnabled: ")
        .append(toIndentedString(agentCsmVmContainersEnabled))
        .append("\n");
    sb.append("    agentCsmVmHostsEnabled: ")
        .append(toIndentedString(agentCsmVmHostsEnabled))
        .append("\n");
    sb.append("    agentCwsEnabled: ").append(toIndentedString(agentCwsEnabled)).append("\n");
    sb.append("    agentPostureManagement: ")
        .append(toIndentedString(agentPostureManagement))
        .append("\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    agentlessPostureManagement: ")
        .append(toIndentedString(agentlessPostureManagement))
        .append("\n");
    sb.append("    agentlessVulnerabilityScanning: ")
        .append(toIndentedString(agentlessVulnerabilityScanning))
        .append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    datadogAgentKey: ").append(toIndentedString(datadogAgentKey)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    installMethodTool: ").append(toIndentedString(installMethodTool)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
