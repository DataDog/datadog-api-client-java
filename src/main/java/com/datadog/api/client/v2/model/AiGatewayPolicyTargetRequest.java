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

/** Provider and model target in a routing policy request. */
@JsonPropertyOrder({
  AiGatewayPolicyTargetRequest.JSON_PROPERTY_ID,
  AiGatewayPolicyTargetRequest.JSON_PROPERTY_MODEL,
  AiGatewayPolicyTargetRequest.JSON_PROPERTY_PROVIDER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayPolicyTargetRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_MODEL = "model";
  private String model;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public AiGatewayPolicyTargetRequest id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Saved target row ID. On replacement, retain this ID only within its original route and at most
   * once. A stale or foreign ID is rejected. minimum: 1
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AiGatewayPolicyTargetRequest model(String model) {
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

  public AiGatewayPolicyTargetRequest provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Provider slug. Omitted for dynamic resolution or when its provider is hidden.
   *
   * @return provider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
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
   * @return AiGatewayPolicyTargetRequest
   */
  @JsonAnySetter
  public AiGatewayPolicyTargetRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayPolicyTargetRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayPolicyTargetRequest aiGatewayPolicyTargetRequest = (AiGatewayPolicyTargetRequest) o;
    return Objects.equals(this.id, aiGatewayPolicyTargetRequest.id)
        && Objects.equals(this.model, aiGatewayPolicyTargetRequest.model)
        && Objects.equals(this.provider, aiGatewayPolicyTargetRequest.provider)
        && Objects.equals(
            this.additionalProperties, aiGatewayPolicyTargetRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, model, provider, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayPolicyTargetRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
