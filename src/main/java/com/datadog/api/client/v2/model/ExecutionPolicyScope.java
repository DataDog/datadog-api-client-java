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

/**
 * Restricts where the policy applies. At most one of <code>kubernetes</code>, <code>scripts</code>,
 * or <code>remote_action_rshell</code> can be set. An empty object means the policy has no scope
 * restriction.
 */
@JsonPropertyOrder({
  ExecutionPolicyScope.JSON_PROPERTY_KUBERNETES,
  ExecutionPolicyScope.JSON_PROPERTY_REMOTE_ACTION_RSHELL,
  ExecutionPolicyScope.JSON_PROPERTY_SCRIPTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExecutionPolicyScope {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_KUBERNETES = "kubernetes";
  private ExecutionPolicyKubernetesScope kubernetes;

  public static final String JSON_PROPERTY_REMOTE_ACTION_RSHELL = "remote_action_rshell";
  private ExecutionPolicyRemoteActionRshellScope remoteActionRshell;

  public static final String JSON_PROPERTY_SCRIPTS = "scripts";
  private ExecutionPolicyScriptScope scripts;

  public ExecutionPolicyScope kubernetes(ExecutionPolicyKubernetesScope kubernetes) {
    this.kubernetes = kubernetes;
    this.unparsed |= kubernetes.unparsed;
    return this;
  }

  /**
   * Restricts the policy to specific Kubernetes namespaces.
   *
   * @return kubernetes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KUBERNETES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExecutionPolicyKubernetesScope getKubernetes() {
    return kubernetes;
  }

  public void setKubernetes(ExecutionPolicyKubernetesScope kubernetes) {
    this.kubernetes = kubernetes;
    if (kubernetes != null) {
      this.unparsed |= kubernetes.unparsed;
    }
  }

  public ExecutionPolicyScope remoteActionRshell(
      ExecutionPolicyRemoteActionRshellScope remoteActionRshell) {
    this.remoteActionRshell = remoteActionRshell;
    this.unparsed |= remoteActionRshell.unparsed;
    return this;
  }

  /**
   * Restricts the policy to specific remote shell paths.
   *
   * @return remoteActionRshell
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_ACTION_RSHELL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExecutionPolicyRemoteActionRshellScope getRemoteActionRshell() {
    return remoteActionRshell;
  }

  public void setRemoteActionRshell(ExecutionPolicyRemoteActionRshellScope remoteActionRshell) {
    this.remoteActionRshell = remoteActionRshell;
    if (remoteActionRshell != null) {
      this.unparsed |= remoteActionRshell.unparsed;
    }
  }

  public ExecutionPolicyScope scripts(ExecutionPolicyScriptScope scripts) {
    this.scripts = scripts;
    this.unparsed |= scripts.unparsed;
    return this;
  }

  /**
   * Restricts the policy to specific scripts.
   *
   * @return scripts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCRIPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExecutionPolicyScriptScope getScripts() {
    return scripts;
  }

  public void setScripts(ExecutionPolicyScriptScope scripts) {
    this.scripts = scripts;
    if (scripts != null) {
      this.unparsed |= scripts.unparsed;
    }
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
   * @return ExecutionPolicyScope
   */
  @JsonAnySetter
  public ExecutionPolicyScope putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExecutionPolicyScope object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionPolicyScope executionPolicyScope = (ExecutionPolicyScope) o;
    return Objects.equals(this.kubernetes, executionPolicyScope.kubernetes)
        && Objects.equals(this.remoteActionRshell, executionPolicyScope.remoteActionRshell)
        && Objects.equals(this.scripts, executionPolicyScope.scripts)
        && Objects.equals(this.additionalProperties, executionPolicyScope.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kubernetes, remoteActionRshell, scripts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionPolicyScope {\n");
    sb.append("    kubernetes: ").append(toIndentedString(kubernetes)).append("\n");
    sb.append("    remoteActionRshell: ").append(toIndentedString(remoteActionRshell)).append("\n");
    sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
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
