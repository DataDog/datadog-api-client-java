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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The core dump action applied on the process matching the rule. */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleActionCoreDump.JSON_PROPERTY_DENTRY,
  CloudWorkloadSecurityAgentRuleActionCoreDump.JSON_PROPERTY_MOUNT,
  CloudWorkloadSecurityAgentRuleActionCoreDump.JSON_PROPERTY_NO_COMPRESSION,
  CloudWorkloadSecurityAgentRuleActionCoreDump.JSON_PROPERTY_PROCESS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleActionCoreDump {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DENTRY = "dentry";
  private Boolean dentry;

  public static final String JSON_PROPERTY_MOUNT = "mount";
  private Boolean mount;

  public static final String JSON_PROPERTY_NO_COMPRESSION = "no_compression";
  private Boolean noCompression;

  public static final String JSON_PROPERTY_PROCESS = "process";
  private Boolean process;

  public CloudWorkloadSecurityAgentRuleActionCoreDump dentry(Boolean dentry) {
    this.dentry = dentry;
    return this;
  }

  /**
   * Whether the directory entry information is included in the core dump.
   *
   * @return dentry
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DENTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDentry() {
    return dentry;
  }

  public void setDentry(Boolean dentry) {
    this.dentry = dentry;
  }

  public CloudWorkloadSecurityAgentRuleActionCoreDump mount(Boolean mount) {
    this.mount = mount;
    return this;
  }

  /**
   * Whether the mount information is included in the core dump.
   *
   * @return mount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMount() {
    return mount;
  }

  public void setMount(Boolean mount) {
    this.mount = mount;
  }

  public CloudWorkloadSecurityAgentRuleActionCoreDump noCompression(Boolean noCompression) {
    this.noCompression = noCompression;
    return this;
  }

  /**
   * Whether the core dump is left uncompressed.
   *
   * @return noCompression
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_COMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNoCompression() {
    return noCompression;
  }

  public void setNoCompression(Boolean noCompression) {
    this.noCompression = noCompression;
  }

  public CloudWorkloadSecurityAgentRuleActionCoreDump process(Boolean process) {
    this.process = process;
    return this;
  }

  /**
   * Whether the process memory is included in the core dump.
   *
   * @return process
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getProcess() {
    return process;
  }

  public void setProcess(Boolean process) {
    this.process = process;
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
   * @return CloudWorkloadSecurityAgentRuleActionCoreDump
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentRuleActionCoreDump putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this CloudWorkloadSecurityAgentRuleActionCoreDump object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleActionCoreDump cloudWorkloadSecurityAgentRuleActionCoreDump =
        (CloudWorkloadSecurityAgentRuleActionCoreDump) o;
    return Objects.equals(this.dentry, cloudWorkloadSecurityAgentRuleActionCoreDump.dentry)
        && Objects.equals(this.mount, cloudWorkloadSecurityAgentRuleActionCoreDump.mount)
        && Objects.equals(
            this.noCompression, cloudWorkloadSecurityAgentRuleActionCoreDump.noCompression)
        && Objects.equals(this.process, cloudWorkloadSecurityAgentRuleActionCoreDump.process)
        && Objects.equals(
            this.additionalProperties,
            cloudWorkloadSecurityAgentRuleActionCoreDump.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dentry, mount, noCompression, process, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleActionCoreDump {\n");
    sb.append("    dentry: ").append(toIndentedString(dentry)).append("\n");
    sb.append("    mount: ").append(toIndentedString(mount)).append("\n");
    sb.append("    noCompression: ").append(toIndentedString(noCompression)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
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
