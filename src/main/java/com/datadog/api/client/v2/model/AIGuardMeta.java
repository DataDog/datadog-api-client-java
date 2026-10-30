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

/** Metadata about the evaluated conversation, used to select the policy and evaluator behavior. */
@JsonPropertyOrder({
  AIGuardMeta.JSON_PROPERTY_CODING_AGENT,
  AIGuardMeta.JSON_PROPERTY_CONFIDENCE_THRESHOLD,
  AIGuardMeta.JSON_PROPERTY_ENV,
  AIGuardMeta.JSON_PROPERTY_IS_SDS_ENABLED_OVERRIDE,
  AIGuardMeta.JSON_PROPERTY_SERVICE,
  AIGuardMeta.JSON_PROPERTY_TOOL_POLICIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODING_AGENT = "coding_agent";
  private String codingAgent;

  public static final String JSON_PROPERTY_CONFIDENCE_THRESHOLD = "confidence_threshold";
  private AIGuardConfidenceThresholdOverride confidenceThreshold;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_IS_SDS_ENABLED_OVERRIDE = "is_sds_enabled_override";
  private Boolean isSdsEnabledOverride;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_TOOL_POLICIES = "tool_policies";
  private Map<String, AIGuardToolPolicyAction> toolPolicies = null;

  public AIGuardMeta codingAgent(String codingAgent) {
    this.codingAgent = codingAgent;
    return this;
  }

  /**
   * The coding agent that produced the conversation. By default, a non-empty value selects the
   * coding-agent evaluator profile, while an omitted or empty value selects the default profile.
   * Known identifiers include <code>claude-code</code>, <code>codex</code>, <code>cursor</code>,
   * and <code>github-copilot</code>; other identifiers are accepted. The coding-agent profile
   * assumes the caller can ask the user to confirm Supply Chain Firewall warnings; the default
   * profile assumes it cannot.
   *
   * @return codingAgent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODING_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCodingAgent() {
    return codingAgent;
  }

  public void setCodingAgent(String codingAgent) {
    this.codingAgent = codingAgent;
  }

  public AIGuardMeta confidenceThreshold(AIGuardConfidenceThresholdOverride confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    this.unparsed |= confidenceThreshold.unparsed;
    return this;
  }

  /**
   * Request-only confidence threshold override. A number sets the threshold for every threat
   * category; an object supplies a global threshold and optional per-category overrides. Omit this
   * field to use the stored sensitivity policy. This field is not returned in evaluation responses.
   *
   * @return confidenceThreshold
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AIGuardConfidenceThresholdOverride getConfidenceThreshold() {
    return confidenceThreshold;
  }

  public void setConfidenceThreshold(AIGuardConfidenceThresholdOverride confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    if (confidenceThreshold != null) {
      this.unparsed |= confidenceThreshold.unparsed;
    }
  }

  public AIGuardMeta env(String env) {
    this.env = env;
    return this;
  }

  /**
   * The environment the conversation belongs to.
   *
   * @return env
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public AIGuardMeta isSdsEnabledOverride(Boolean isSdsEnabledOverride) {
    this.isSdsEnabledOverride = isSdsEnabledOverride;
    return this;
  }

  /**
   * Whether to run the Sensitive Data Scanner for this request, overriding the stored policy.
   *
   * @return isSdsEnabledOverride
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SDS_ENABLED_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsSdsEnabledOverride() {
    return isSdsEnabledOverride;
  }

  public void setIsSdsEnabledOverride(Boolean isSdsEnabledOverride) {
    this.isSdsEnabledOverride = isSdsEnabledOverride;
  }

  public AIGuardMeta service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The name of the service the conversation belongs to.
   *
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public AIGuardMeta toolPolicies(Map<String, AIGuardToolPolicyAction> toolPolicies) {
    this.toolPolicies = toolPolicies;
    return this;
  }

  public AIGuardMeta putToolPoliciesItem(String key, AIGuardToolPolicyAction toolPoliciesItem) {
    if (this.toolPolicies == null) {
      this.toolPolicies = new HashMap<>();
    }
    this.toolPolicies.put(key, toolPoliciesItem);
    return this;
  }

  /**
   * A non-empty map replaces stored tool policies for this request only, keyed by tool name. Any
   * called tool not present resolves to EVALUATE. Only takes effect when tool policies are enabled
   * for the organization.
   *
   * @return toolPolicies
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_POLICIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, AIGuardToolPolicyAction> getToolPolicies() {
    return toolPolicies;
  }

  public void setToolPolicies(Map<String, AIGuardToolPolicyAction> toolPolicies) {
    this.toolPolicies = toolPolicies;
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
   * @return AIGuardMeta
   */
  @JsonAnySetter
  public AIGuardMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AIGuardMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGuardMeta aiGuardMeta = (AIGuardMeta) o;
    return Objects.equals(this.codingAgent, aiGuardMeta.codingAgent)
        && Objects.equals(this.confidenceThreshold, aiGuardMeta.confidenceThreshold)
        && Objects.equals(this.env, aiGuardMeta.env)
        && Objects.equals(this.isSdsEnabledOverride, aiGuardMeta.isSdsEnabledOverride)
        && Objects.equals(this.service, aiGuardMeta.service)
        && Objects.equals(this.toolPolicies, aiGuardMeta.toolPolicies)
        && Objects.equals(this.additionalProperties, aiGuardMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        codingAgent,
        confidenceThreshold,
        env,
        isSdsEnabledOverride,
        service,
        toolPolicies,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIGuardMeta {\n");
    sb.append("    codingAgent: ").append(toIndentedString(codingAgent)).append("\n");
    sb.append("    confidenceThreshold: ")
        .append(toIndentedString(confidenceThreshold))
        .append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    isSdsEnabledOverride: ")
        .append(toIndentedString(isSdsEnabledOverride))
        .append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    toolPolicies: ").append(toIndentedString(toolPolicies)).append("\n");
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
