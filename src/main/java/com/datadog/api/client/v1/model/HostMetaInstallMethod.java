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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Agent install method. */
@JsonPropertyOrder({
  HostMetaInstallMethod.JSON_PROPERTY_INSTALLER_VERSION,
  HostMetaInstallMethod.JSON_PROPERTY_TOOL,
  HostMetaInstallMethod.JSON_PROPERTY_TOOL_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMetaInstallMethod {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INSTALLER_VERSION = "installer_version";
  private String installerVersion;

  public static final String JSON_PROPERTY_TOOL = "tool";
  private String tool;

  public static final String JSON_PROPERTY_TOOL_VERSION = "tool_version";
  private String toolVersion;

  public HostMetaInstallMethod installerVersion(String installerVersion) {
    this.installerVersion = installerVersion;
    return this;
  }

  /**
   * The installer version.
   *
   * @return installerVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALLER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInstallerVersion() {
    return installerVersion;
  }

  public void setInstallerVersion(String installerVersion) {
    this.installerVersion = installerVersion;
  }

  public HostMetaInstallMethod tool(String tool) {
    this.tool = tool;
    return this;
  }

  /**
   * Tool used to install the agent.
   *
   * @return tool
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTool() {
    return tool;
  }

  public void setTool(String tool) {
    this.tool = tool;
  }

  public HostMetaInstallMethod toolVersion(String toolVersion) {
    this.toolVersion = toolVersion;
    return this;
  }

  /**
   * The tool version.
   *
   * @return toolVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToolVersion() {
    return toolVersion;
  }

  public void setToolVersion(String toolVersion) {
    this.toolVersion = toolVersion;
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
   * @return HostMetaInstallMethod
   */
  @JsonAnySetter
  public HostMetaInstallMethod putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HostMetaInstallMethod object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMetaInstallMethod hostMetaInstallMethod = (HostMetaInstallMethod) o;
    return Objects.equals(this.installerVersion, hostMetaInstallMethod.installerVersion)
        && Objects.equals(this.tool, hostMetaInstallMethod.tool)
        && Objects.equals(this.toolVersion, hostMetaInstallMethod.toolVersion)
        && Objects.equals(this.additionalProperties, hostMetaInstallMethod.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installerVersion, tool, toolVersion, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMetaInstallMethod {\n");
    sb.append("    installerVersion: ").append(toIndentedString(installerVersion)).append("\n");
    sb.append("    tool: ").append(toIndentedString(tool)).append("\n");
    sb.append("    toolVersion: ").append(toIndentedString(toolVersion)).append("\n");
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
