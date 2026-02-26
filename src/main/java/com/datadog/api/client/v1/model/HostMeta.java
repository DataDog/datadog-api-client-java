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

/** Metadata associated with your host. */
@JsonPropertyOrder({
  HostMeta.JSON_PROPERTY_AGENT_CHECKS,
  HostMeta.JSON_PROPERTY_AGENT_VERSION,
  HostMeta.JSON_PROPERTY_CPU_CORES,
  HostMeta.JSON_PROPERTY_FBSD_V,
  HostMeta.JSON_PROPERTY_GOHAI,
  HostMeta.JSON_PROPERTY_INSTALL_METHOD,
  HostMeta.JSON_PROPERTY_MAC_V,
  HostMeta.JSON_PROPERTY_MACHINE,
  HostMeta.JSON_PROPERTY_NIX_V,
  HostMeta.JSON_PROPERTY_PLATFORM,
  HostMeta.JSON_PROPERTY_PROCESSOR,
  HostMeta.JSON_PROPERTY_PYTHON_V,
  HostMeta.JSON_PROPERTY_SOCKET_FQDN,
  HostMeta.JSON_PROPERTY_SOCKET_HOSTNAME,
  HostMeta.JSON_PROPERTY_WIN_V
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_CHECKS = "agent_checks";
  private List<List<Object>> agentChecks = null;

  public static final String JSON_PROPERTY_AGENT_VERSION = "agent_version";
  private String agentVersion;

  public static final String JSON_PROPERTY_CPU_CORES = "cpuCores";
  private Long cpuCores;

  public static final String JSON_PROPERTY_FBSD_V = "fbsdV";
  private List<Object> fbsdV = null;

  public static final String JSON_PROPERTY_GOHAI = "gohai";
  private String gohai;

  public static final String JSON_PROPERTY_INSTALL_METHOD = "install_method";
  private HostMetaInstallMethod installMethod;

  public static final String JSON_PROPERTY_MAC_V = "macV";
  private List<Object> macV = null;

  public static final String JSON_PROPERTY_MACHINE = "machine";
  private String machine;

  public static final String JSON_PROPERTY_NIX_V = "nixV";
  private List<Object> nixV = null;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_PROCESSOR = "processor";
  private String processor;

  public static final String JSON_PROPERTY_PYTHON_V = "pythonV";
  private String pythonV;

  public static final String JSON_PROPERTY_SOCKET_FQDN = "socket-fqdn";
  private String socketFqdn;

  public static final String JSON_PROPERTY_SOCKET_HOSTNAME = "socket-hostname";
  private String socketHostname;

  public static final String JSON_PROPERTY_WIN_V = "winV";
  private List<Object> winV = null;

  public HostMeta agentChecks(List<List<Object>> agentChecks) {
    this.agentChecks = agentChecks;
    return this;
  }

  public HostMeta addAgentChecksItem(List<Object> agentChecksItem) {
    if (this.agentChecks == null) {
      this.agentChecks = new ArrayList<>();
    }
    this.agentChecks.add(agentChecksItem);
    return this;
  }

  /**
   * A list of Agent checks running on the host.
   *
   * @return agentChecks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_CHECKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<List<Object>> getAgentChecks() {
    return agentChecks;
  }

  public void setAgentChecks(List<List<Object>> agentChecks) {
    this.agentChecks = agentChecks;
  }

  public HostMeta agentVersion(String agentVersion) {
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

  public HostMeta cpuCores(Long cpuCores) {
    this.cpuCores = cpuCores;
    return this;
  }

  /**
   * The number of cores.
   *
   * @return cpuCores
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPU_CORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCpuCores() {
    return cpuCores;
  }

  public void setCpuCores(Long cpuCores) {
    this.cpuCores = cpuCores;
  }

  public HostMeta fbsdV(List<Object> fbsdV) {
    this.fbsdV = fbsdV;
    return this;
  }

  public HostMeta addFbsdVItem(Object fbsdVItem) {
    if (this.fbsdV == null) {
      this.fbsdV = new ArrayList<>();
    }
    this.fbsdV.add(fbsdVItem);
    return this;
  }

  /**
   * An array of Mac versions.
   *
   * @return fbsdV
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FBSD_V)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getFbsdV() {
    return fbsdV;
  }

  public void setFbsdV(List<Object> fbsdV) {
    this.fbsdV = fbsdV;
  }

  public HostMeta gohai(String gohai) {
    this.gohai = gohai;
    return this;
  }

  /**
   * JSON string containing system information.
   *
   * @return gohai
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GOHAI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGohai() {
    return gohai;
  }

  public void setGohai(String gohai) {
    this.gohai = gohai;
  }

  public HostMeta installMethod(HostMetaInstallMethod installMethod) {
    this.installMethod = installMethod;
    this.unparsed |= installMethod.unparsed;
    return this;
  }

  /**
   * Agent install method.
   *
   * @return installMethod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALL_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostMetaInstallMethod getInstallMethod() {
    return installMethod;
  }

  public void setInstallMethod(HostMetaInstallMethod installMethod) {
    this.installMethod = installMethod;
  }

  public HostMeta macV(List<Object> macV) {
    this.macV = macV;
    return this;
  }

  public HostMeta addMacVItem(Object macVItem) {
    if (this.macV == null) {
      this.macV = new ArrayList<>();
    }
    this.macV.add(macVItem);
    return this;
  }

  /**
   * An array of Mac versions.
   *
   * @return macV
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAC_V)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getMacV() {
    return macV;
  }

  public void setMacV(List<Object> macV) {
    this.macV = macV;
  }

  public HostMeta machine(String machine) {
    this.machine = machine;
    return this;
  }

  /**
   * The machine architecture.
   *
   * @return machine
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MACHINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMachine() {
    return machine;
  }

  public void setMachine(String machine) {
    this.machine = machine;
  }

  public HostMeta nixV(List<Object> nixV) {
    this.nixV = nixV;
    return this;
  }

  public HostMeta addNixVItem(Object nixVItem) {
    if (this.nixV == null) {
      this.nixV = new ArrayList<>();
    }
    this.nixV.add(nixVItem);
    return this;
  }

  /**
   * Array of Unix versions.
   *
   * @return nixV
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NIX_V)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getNixV() {
    return nixV;
  }

  public void setNixV(List<Object> nixV) {
    this.nixV = nixV;
  }

  public HostMeta platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * The OS platform.
   *
   * @return platform
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public HostMeta processor(String processor) {
    this.processor = processor;
    return this;
  }

  /**
   * The processor.
   *
   * @return processor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProcessor() {
    return processor;
  }

  public void setProcessor(String processor) {
    this.processor = processor;
  }

  public HostMeta pythonV(String pythonV) {
    this.pythonV = pythonV;
    return this;
  }

  /**
   * The Python version.
   *
   * @return pythonV
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PYTHON_V)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPythonV() {
    return pythonV;
  }

  public void setPythonV(String pythonV) {
    this.pythonV = pythonV;
  }

  public HostMeta socketFqdn(String socketFqdn) {
    this.socketFqdn = socketFqdn;
    return this;
  }

  /**
   * The socket fqdn.
   *
   * @return socketFqdn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOCKET_FQDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSocketFqdn() {
    return socketFqdn;
  }

  public void setSocketFqdn(String socketFqdn) {
    this.socketFqdn = socketFqdn;
  }

  public HostMeta socketHostname(String socketHostname) {
    this.socketHostname = socketHostname;
    return this;
  }

  /**
   * The socket hostname.
   *
   * @return socketHostname
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOCKET_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSocketHostname() {
    return socketHostname;
  }

  public void setSocketHostname(String socketHostname) {
    this.socketHostname = socketHostname;
  }

  public HostMeta winV(List<Object> winV) {
    this.winV = winV;
    return this;
  }

  public HostMeta addWinVItem(Object winVItem) {
    if (this.winV == null) {
      this.winV = new ArrayList<>();
    }
    this.winV.add(winVItem);
    return this;
  }

  /**
   * An array of Windows versions.
   *
   * @return winV
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIN_V)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getWinV() {
    return winV;
  }

  public void setWinV(List<Object> winV) {
    this.winV = winV;
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
   * @return HostMeta
   */
  @JsonAnySetter
  public HostMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HostMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMeta hostMeta = (HostMeta) o;
    return Objects.equals(this.agentChecks, hostMeta.agentChecks)
        && Objects.equals(this.agentVersion, hostMeta.agentVersion)
        && Objects.equals(this.cpuCores, hostMeta.cpuCores)
        && Objects.equals(this.fbsdV, hostMeta.fbsdV)
        && Objects.equals(this.gohai, hostMeta.gohai)
        && Objects.equals(this.installMethod, hostMeta.installMethod)
        && Objects.equals(this.macV, hostMeta.macV)
        && Objects.equals(this.machine, hostMeta.machine)
        && Objects.equals(this.nixV, hostMeta.nixV)
        && Objects.equals(this.platform, hostMeta.platform)
        && Objects.equals(this.processor, hostMeta.processor)
        && Objects.equals(this.pythonV, hostMeta.pythonV)
        && Objects.equals(this.socketFqdn, hostMeta.socketFqdn)
        && Objects.equals(this.socketHostname, hostMeta.socketHostname)
        && Objects.equals(this.winV, hostMeta.winV)
        && Objects.equals(this.additionalProperties, hostMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentChecks,
        agentVersion,
        cpuCores,
        fbsdV,
        gohai,
        installMethod,
        macV,
        machine,
        nixV,
        platform,
        processor,
        pythonV,
        socketFqdn,
        socketHostname,
        winV,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMeta {\n");
    sb.append("    agentChecks: ").append(toIndentedString(agentChecks)).append("\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    fbsdV: ").append(toIndentedString(fbsdV)).append("\n");
    sb.append("    gohai: ").append(toIndentedString(gohai)).append("\n");
    sb.append("    installMethod: ").append(toIndentedString(installMethod)).append("\n");
    sb.append("    macV: ").append(toIndentedString(macV)).append("\n");
    sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
    sb.append("    nixV: ").append(toIndentedString(nixV)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    pythonV: ").append(toIndentedString(pythonV)).append("\n");
    sb.append("    socketFqdn: ").append(toIndentedString(socketFqdn)).append("\n");
    sb.append("    socketHostname: ").append(toIndentedString(socketHostname)).append("\n");
    sb.append("    winV: ").append(toIndentedString(winV)).append("\n");
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
