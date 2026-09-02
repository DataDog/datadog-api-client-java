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
import org.openapitools.jackson.nullable.JsonNullable;

/** A CSM Agent returned by the API. */
@JsonPropertyOrder({
  CsmAgentsAttributes.JSON_PROPERTY_AGENT_VERSION,
  CsmAgentsAttributes.JSON_PROPERTY_AWS_FARGATE,
  CsmAgentsAttributes.JSON_PROPERTY_CLUSTER_NAME,
  CsmAgentsAttributes.JSON_PROPERTY_DATADOG_AGENT,
  CsmAgentsAttributes.JSON_PROPERTY_ECS_FARGATE_TASK_ARN,
  CsmAgentsAttributes.JSON_PROPERTY_ENVS,
  CsmAgentsAttributes.JSON_PROPERTY_HOST_ID,
  CsmAgentsAttributes.JSON_PROPERTY_HOSTNAME,
  CsmAgentsAttributes.JSON_PROPERTY_INSTALL_METHOD_INSTALLER_VERSION,
  CsmAgentsAttributes.JSON_PROPERTY_INSTALL_METHOD_TOOL,
  CsmAgentsAttributes.JSON_PROPERTY_IS_CSM_VM_CONTAINERS_ENABLED,
  CsmAgentsAttributes.JSON_PROPERTY_IS_CSM_VM_HOSTS_ENABLED,
  CsmAgentsAttributes.JSON_PROPERTY_IS_CSPM_ENABLED,
  CsmAgentsAttributes.JSON_PROPERTY_IS_CWS_ENABLED,
  CsmAgentsAttributes.JSON_PROPERTY_IS_CWS_REMOTE_CONFIGURATION_ENABLED,
  CsmAgentsAttributes.JSON_PROPERTY_IS_REMOTE_CONFIGURATION_ENABLED,
  CsmAgentsAttributes.JSON_PROPERTY_OS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmAgentsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_VERSION = "agent_version";
  private String agentVersion;

  public static final String JSON_PROPERTY_AWS_FARGATE = "aws_fargate";
  private String awsFargate;

  public static final String JSON_PROPERTY_CLUSTER_NAME = "cluster_name";
  private List<String> clusterName = null;

  public static final String JSON_PROPERTY_DATADOG_AGENT = "datadog_agent";
  private String datadogAgent;

  public static final String JSON_PROPERTY_ECS_FARGATE_TASK_ARN = "ecs_fargate_task_arn";
  private String ecsFargateTaskArn;

  public static final String JSON_PROPERTY_ENVS = "envs";
  private JsonNullable<List<String>> envs = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_HOST_ID = "host_id";
  private Long hostId;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_INSTALL_METHOD_INSTALLER_VERSION =
      "install_method_installer_version";
  private String installMethodInstallerVersion;

  public static final String JSON_PROPERTY_INSTALL_METHOD_TOOL = "install_method_tool";
  private String installMethodTool;

  public static final String JSON_PROPERTY_IS_CSM_VM_CONTAINERS_ENABLED =
      "is_csm_vm_containers_enabled";
  private JsonNullable<Boolean> isCsmVmContainersEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_CSM_VM_HOSTS_ENABLED = "is_csm_vm_hosts_enabled";
  private JsonNullable<Boolean> isCsmVmHostsEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_CSPM_ENABLED = "is_cspm_enabled";
  private JsonNullable<Boolean> isCspmEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_CWS_ENABLED = "is_cws_enabled";
  private JsonNullable<Boolean> isCwsEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_CWS_REMOTE_CONFIGURATION_ENABLED =
      "is_cws_remote_configuration_enabled";
  private JsonNullable<Boolean> isCwsRemoteConfigurationEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_REMOTE_CONFIGURATION_ENABLED =
      "is_remote_configuration_enabled";
  private JsonNullable<Boolean> isRemoteConfigurationEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_OS = "os";
  private String os;

  public CsmAgentsAttributes agentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
    return this;
  }

  /**
   * Version of the Datadog Agent.
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

  public CsmAgentsAttributes awsFargate(String awsFargate) {
    this.awsFargate = awsFargate;
    return this;
  }

  /**
   * AWS Fargate details.
   *
   * @return awsFargate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AWS_FARGATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAwsFargate() {
    return awsFargate;
  }

  public void setAwsFargate(String awsFargate) {
    this.awsFargate = awsFargate;
  }

  public CsmAgentsAttributes clusterName(List<String> clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  public CsmAgentsAttributes addClusterNameItem(String clusterNameItem) {
    if (this.clusterName == null) {
      this.clusterName = new ArrayList<>();
    }
    this.clusterName.add(clusterNameItem);
    return this;
  }

  /**
   * List of cluster names associated with the Agent.
   *
   * @return clusterName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getClusterName() {
    return clusterName;
  }

  public void setClusterName(List<String> clusterName) {
    this.clusterName = clusterName;
  }

  public CsmAgentsAttributes datadogAgent(String datadogAgent) {
    this.datadogAgent = datadogAgent;
    return this;
  }

  /**
   * Unique identifier for the Datadog Agent.
   *
   * @return datadogAgent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATADOG_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDatadogAgent() {
    return datadogAgent;
  }

  public void setDatadogAgent(String datadogAgent) {
    this.datadogAgent = datadogAgent;
  }

  public CsmAgentsAttributes ecsFargateTaskArn(String ecsFargateTaskArn) {
    this.ecsFargateTaskArn = ecsFargateTaskArn;
    return this;
  }

  /**
   * ARN of the ECS Fargate task.
   *
   * @return ecsFargateTaskArn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ECS_FARGATE_TASK_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEcsFargateTaskArn() {
    return ecsFargateTaskArn;
  }

  public void setEcsFargateTaskArn(String ecsFargateTaskArn) {
    this.ecsFargateTaskArn = ecsFargateTaskArn;
  }

  public CsmAgentsAttributes envs(List<String> envs) {
    this.envs = JsonNullable.<List<String>>of(envs);
    return this;
  }

  public CsmAgentsAttributes addEnvsItem(String envsItem) {
    if (this.envs == null || !this.envs.isPresent()) {
      this.envs = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.envs.get().add(envsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of environments associated with the Agent.
   *
   * @return envs
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getEnvs() {
    return envs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENVS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getEnvs_JsonNullable() {
    return envs;
  }

  @JsonProperty(JSON_PROPERTY_ENVS)
  public void setEnvs_JsonNullable(JsonNullable<List<String>> envs) {
    this.envs = envs;
  }

  public void setEnvs(List<String> envs) {
    this.envs = JsonNullable.<List<String>>of(envs);
  }

  public CsmAgentsAttributes hostId(Long hostId) {
    this.hostId = hostId;
    return this;
  }

  /**
   * ID of the host.
   *
   * @return hostId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getHostId() {
    return hostId;
  }

  public void setHostId(Long hostId) {
    this.hostId = hostId;
  }

  public CsmAgentsAttributes hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Name of the host.
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

  public CsmAgentsAttributes installMethodInstallerVersion(String installMethodInstallerVersion) {
    this.installMethodInstallerVersion = installMethodInstallerVersion;
    return this;
  }

  /**
   * Version of the installer used for installing the Datadog Agent.
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

  public CsmAgentsAttributes installMethodTool(String installMethodTool) {
    this.installMethodTool = installMethodTool;
    return this;
  }

  /**
   * Tool used for installing the Datadog Agent.
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

  public CsmAgentsAttributes isCsmVmContainersEnabled(Boolean isCsmVmContainersEnabled) {
    this.isCsmVmContainersEnabled = JsonNullable.<Boolean>of(isCsmVmContainersEnabled);
    return this;
  }

  /**
   * Indicates if CSM VM Containers is enabled.
   *
   * @return isCsmVmContainersEnabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIsCsmVmContainersEnabled() {
    return isCsmVmContainersEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_CSM_VM_CONTAINERS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsCsmVmContainersEnabled_JsonNullable() {
    return isCsmVmContainersEnabled;
  }

  @JsonProperty(JSON_PROPERTY_IS_CSM_VM_CONTAINERS_ENABLED)
  public void setIsCsmVmContainersEnabled_JsonNullable(
      JsonNullable<Boolean> isCsmVmContainersEnabled) {
    this.isCsmVmContainersEnabled = isCsmVmContainersEnabled;
  }

  public void setIsCsmVmContainersEnabled(Boolean isCsmVmContainersEnabled) {
    this.isCsmVmContainersEnabled = JsonNullable.<Boolean>of(isCsmVmContainersEnabled);
  }

  public CsmAgentsAttributes isCsmVmHostsEnabled(Boolean isCsmVmHostsEnabled) {
    this.isCsmVmHostsEnabled = JsonNullable.<Boolean>of(isCsmVmHostsEnabled);
    return this;
  }

  /**
   * Indicates if CSM VM Hosts is enabled.
   *
   * @return isCsmVmHostsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIsCsmVmHostsEnabled() {
    return isCsmVmHostsEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_CSM_VM_HOSTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsCsmVmHostsEnabled_JsonNullable() {
    return isCsmVmHostsEnabled;
  }

  @JsonProperty(JSON_PROPERTY_IS_CSM_VM_HOSTS_ENABLED)
  public void setIsCsmVmHostsEnabled_JsonNullable(JsonNullable<Boolean> isCsmVmHostsEnabled) {
    this.isCsmVmHostsEnabled = isCsmVmHostsEnabled;
  }

  public void setIsCsmVmHostsEnabled(Boolean isCsmVmHostsEnabled) {
    this.isCsmVmHostsEnabled = JsonNullable.<Boolean>of(isCsmVmHostsEnabled);
  }

  public CsmAgentsAttributes isCspmEnabled(Boolean isCspmEnabled) {
    this.isCspmEnabled = JsonNullable.<Boolean>of(isCspmEnabled);
    return this;
  }

  /**
   * Indicates if CSPM is enabled.
   *
   * @return isCspmEnabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIsCspmEnabled() {
    return isCspmEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_CSPM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsCspmEnabled_JsonNullable() {
    return isCspmEnabled;
  }

  @JsonProperty(JSON_PROPERTY_IS_CSPM_ENABLED)
  public void setIsCspmEnabled_JsonNullable(JsonNullable<Boolean> isCspmEnabled) {
    this.isCspmEnabled = isCspmEnabled;
  }

  public void setIsCspmEnabled(Boolean isCspmEnabled) {
    this.isCspmEnabled = JsonNullable.<Boolean>of(isCspmEnabled);
  }

  public CsmAgentsAttributes isCwsEnabled(Boolean isCwsEnabled) {
    this.isCwsEnabled = JsonNullable.<Boolean>of(isCwsEnabled);
    return this;
  }

  /**
   * Indicates if CWS is enabled.
   *
   * @return isCwsEnabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIsCwsEnabled() {
    return isCwsEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_CWS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsCwsEnabled_JsonNullable() {
    return isCwsEnabled;
  }

  @JsonProperty(JSON_PROPERTY_IS_CWS_ENABLED)
  public void setIsCwsEnabled_JsonNullable(JsonNullable<Boolean> isCwsEnabled) {
    this.isCwsEnabled = isCwsEnabled;
  }

  public void setIsCwsEnabled(Boolean isCwsEnabled) {
    this.isCwsEnabled = JsonNullable.<Boolean>of(isCwsEnabled);
  }

  public CsmAgentsAttributes isCwsRemoteConfigurationEnabled(
      Boolean isCwsRemoteConfigurationEnabled) {
    this.isCwsRemoteConfigurationEnabled =
        JsonNullable.<Boolean>of(isCwsRemoteConfigurationEnabled);
    return this;
  }

  /**
   * Indicates if CWS Remote Configuration is enabled.
   *
   * @return isCwsRemoteConfigurationEnabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIsCwsRemoteConfigurationEnabled() {
    return isCwsRemoteConfigurationEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_CWS_REMOTE_CONFIGURATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsCwsRemoteConfigurationEnabled_JsonNullable() {
    return isCwsRemoteConfigurationEnabled;
  }

  @JsonProperty(JSON_PROPERTY_IS_CWS_REMOTE_CONFIGURATION_ENABLED)
  public void setIsCwsRemoteConfigurationEnabled_JsonNullable(
      JsonNullable<Boolean> isCwsRemoteConfigurationEnabled) {
    this.isCwsRemoteConfigurationEnabled = isCwsRemoteConfigurationEnabled;
  }

  public void setIsCwsRemoteConfigurationEnabled(Boolean isCwsRemoteConfigurationEnabled) {
    this.isCwsRemoteConfigurationEnabled =
        JsonNullable.<Boolean>of(isCwsRemoteConfigurationEnabled);
  }

  public CsmAgentsAttributes isRemoteConfigurationEnabled(Boolean isRemoteConfigurationEnabled) {
    this.isRemoteConfigurationEnabled = JsonNullable.<Boolean>of(isRemoteConfigurationEnabled);
    return this;
  }

  /**
   * Indicates if Remote Configuration is enabled.
   *
   * @return isRemoteConfigurationEnabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIsRemoteConfigurationEnabled() {
    return isRemoteConfigurationEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_REMOTE_CONFIGURATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsRemoteConfigurationEnabled_JsonNullable() {
    return isRemoteConfigurationEnabled;
  }

  @JsonProperty(JSON_PROPERTY_IS_REMOTE_CONFIGURATION_ENABLED)
  public void setIsRemoteConfigurationEnabled_JsonNullable(
      JsonNullable<Boolean> isRemoteConfigurationEnabled) {
    this.isRemoteConfigurationEnabled = isRemoteConfigurationEnabled;
  }

  public void setIsRemoteConfigurationEnabled(Boolean isRemoteConfigurationEnabled) {
    this.isRemoteConfigurationEnabled = JsonNullable.<Boolean>of(isRemoteConfigurationEnabled);
  }

  public CsmAgentsAttributes os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Operating system of the host.
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
   * @return CsmAgentsAttributes
   */
  @JsonAnySetter
  public CsmAgentsAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CsmAgentsAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsmAgentsAttributes csmAgentsAttributes = (CsmAgentsAttributes) o;
    return Objects.equals(this.agentVersion, csmAgentsAttributes.agentVersion)
        && Objects.equals(this.awsFargate, csmAgentsAttributes.awsFargate)
        && Objects.equals(this.clusterName, csmAgentsAttributes.clusterName)
        && Objects.equals(this.datadogAgent, csmAgentsAttributes.datadogAgent)
        && Objects.equals(this.ecsFargateTaskArn, csmAgentsAttributes.ecsFargateTaskArn)
        && Objects.equals(this.envs, csmAgentsAttributes.envs)
        && Objects.equals(this.hostId, csmAgentsAttributes.hostId)
        && Objects.equals(this.hostname, csmAgentsAttributes.hostname)
        && Objects.equals(
            this.installMethodInstallerVersion, csmAgentsAttributes.installMethodInstallerVersion)
        && Objects.equals(this.installMethodTool, csmAgentsAttributes.installMethodTool)
        && Objects.equals(
            this.isCsmVmContainersEnabled, csmAgentsAttributes.isCsmVmContainersEnabled)
        && Objects.equals(this.isCsmVmHostsEnabled, csmAgentsAttributes.isCsmVmHostsEnabled)
        && Objects.equals(this.isCspmEnabled, csmAgentsAttributes.isCspmEnabled)
        && Objects.equals(this.isCwsEnabled, csmAgentsAttributes.isCwsEnabled)
        && Objects.equals(
            this.isCwsRemoteConfigurationEnabled,
            csmAgentsAttributes.isCwsRemoteConfigurationEnabled)
        && Objects.equals(
            this.isRemoteConfigurationEnabled, csmAgentsAttributes.isRemoteConfigurationEnabled)
        && Objects.equals(this.os, csmAgentsAttributes.os)
        && Objects.equals(this.additionalProperties, csmAgentsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentVersion,
        awsFargate,
        clusterName,
        datadogAgent,
        ecsFargateTaskArn,
        envs,
        hostId,
        hostname,
        installMethodInstallerVersion,
        installMethodTool,
        isCsmVmContainersEnabled,
        isCsmVmHostsEnabled,
        isCspmEnabled,
        isCwsEnabled,
        isCwsRemoteConfigurationEnabled,
        isRemoteConfigurationEnabled,
        os,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsmAgentsAttributes {\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    awsFargate: ").append(toIndentedString(awsFargate)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    datadogAgent: ").append(toIndentedString(datadogAgent)).append("\n");
    sb.append("    ecsFargateTaskArn: ").append(toIndentedString(ecsFargateTaskArn)).append("\n");
    sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    installMethodInstallerVersion: ")
        .append(toIndentedString(installMethodInstallerVersion))
        .append("\n");
    sb.append("    installMethodTool: ").append(toIndentedString(installMethodTool)).append("\n");
    sb.append("    isCsmVmContainersEnabled: ")
        .append(toIndentedString(isCsmVmContainersEnabled))
        .append("\n");
    sb.append("    isCsmVmHostsEnabled: ")
        .append(toIndentedString(isCsmVmHostsEnabled))
        .append("\n");
    sb.append("    isCspmEnabled: ").append(toIndentedString(isCspmEnabled)).append("\n");
    sb.append("    isCwsEnabled: ").append(toIndentedString(isCwsEnabled)).append("\n");
    sb.append("    isCwsRemoteConfigurationEnabled: ")
        .append(toIndentedString(isCwsRemoteConfigurationEnabled))
        .append("\n");
    sb.append("    isRemoteConfigurationEnabled: ")
        .append(toIndentedString(isRemoteConfigurationEnabled))
        .append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
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
