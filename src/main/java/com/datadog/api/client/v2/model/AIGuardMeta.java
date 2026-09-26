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

/** Optional metadata providing context about the originating service and request. */
@JsonPropertyOrder({
  AIGuardMeta.JSON_PROPERTY_CODING_AGENT,
  AIGuardMeta.JSON_PROPERTY_CONFIDENCE_THRESHOLD,
  AIGuardMeta.JSON_PROPERTY_ENV,
  AIGuardMeta.JSON_PROPERTY_IS_SDS_ENABLED_OVERRIDE,
  AIGuardMeta.JSON_PROPERTY_SERVICE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODING_AGENT = "coding_agent";
  private String codingAgent;

  public static final String JSON_PROPERTY_CONFIDENCE_THRESHOLD = "confidence_threshold";
  private Double confidenceThreshold;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_IS_SDS_ENABLED_OVERRIDE = "is_sds_enabled_override";
  private Boolean isSdsEnabledOverride;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public AIGuardMeta codingAgent(String codingAgent) {
    this.codingAgent = codingAgent;
    return this;
  }

  /**
   * Identifier of the coding agent sending the request, if applicable.
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

  public AIGuardMeta confidenceThreshold(Double confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

  /**
   * Override for the default threat detection confidence threshold, between 0.0 and 1.0.
   *
   * @return confidenceThreshold
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getConfidenceThreshold() {
    return confidenceThreshold;
  }

  public void setConfidenceThreshold(Double confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
  }

  public AIGuardMeta env(String env) {
    this.env = env;
    return this;
  }

  /**
   * The deployment environment of the originating service.
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
   * Override whether sensitive data scanning is applied to this request.
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
   * The name of the service sending the evaluation request.
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
        && Objects.equals(this.additionalProperties, aiGuardMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        codingAgent, confidenceThreshold, env, isSdsEnabledOverride, service, additionalProperties);
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
