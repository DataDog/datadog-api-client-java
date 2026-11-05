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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Resolved routing target in a policy response. */
@JsonPropertyOrder({
  AiGatewayPolicyTarget.JSON_PROPERTY_ID,
  AiGatewayPolicyTarget.JSON_PROPERTY_MODEL,
  AiGatewayPolicyTarget.JSON_PROPERTY_PRIORITY,
  AiGatewayPolicyTarget.JSON_PROPERTY_PROVIDER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayPolicyTarget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_MODEL = "model";
  private String model;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Long priority;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private JsonNullable<String> provider = JsonNullable.<String>undefined();

  public AiGatewayPolicyTarget() {}

  @JsonCreator
  public AiGatewayPolicyTarget(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) Long id,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIORITY) Long priority) {
    this.id = id;
    this.priority = priority;
  }

  public AiGatewayPolicyTarget id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Saved target row ID. On replacement, retain this ID only within its original route and at most
   * once. A stale or foreign ID is rejected. minimum: 1
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AiGatewayPolicyTarget model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Model name or pattern. Omitted when retaining a saved target by ID or when its provider is
   * hidden.
   *
   * @return model
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public AiGatewayPolicyTarget priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Routing priority.
   *
   * @return priority
   */
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public AiGatewayPolicyTarget provider(String provider) {
    this.provider = JsonNullable.<String>of(provider);
    return this;
  }

  /**
   * Provider slug. Omitted for dynamic resolution or when its provider is hidden.
   *
   * @return provider
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getProvider() {
    return provider.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getProvider_JsonNullable() {
    return provider;
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER)
  public void setProvider_JsonNullable(JsonNullable<String> provider) {
    this.provider = provider;
  }

  public void setProvider(String provider) {
    this.provider = JsonNullable.<String>of(provider);
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
   * @return AiGatewayPolicyTarget
   */
  @JsonAnySetter
  public AiGatewayPolicyTarget putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayPolicyTarget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayPolicyTarget aiGatewayPolicyTarget = (AiGatewayPolicyTarget) o;
    return Objects.equals(this.id, aiGatewayPolicyTarget.id)
        && Objects.equals(this.model, aiGatewayPolicyTarget.model)
        && Objects.equals(this.priority, aiGatewayPolicyTarget.priority)
        && Objects.equals(this.provider, aiGatewayPolicyTarget.provider)
        && Objects.equals(this.additionalProperties, aiGatewayPolicyTarget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, model, priority, provider, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayPolicyTarget {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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
