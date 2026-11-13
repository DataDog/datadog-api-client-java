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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Decision model and settings for a classified tier. Omission preserves the saved classifier; null
 * clears it. Newly selected models require provider View.
 */
@JsonPropertyOrder({
  AiGatewayRoutingClassifierRequest.JSON_PROPERTY_CONFIDENCE_THRESHOLD,
  AiGatewayRoutingClassifierRequest.JSON_PROPERTY_CONTEXT,
  AiGatewayRoutingClassifierRequest.JSON_PROPERTY_MODEL,
  AiGatewayRoutingClassifierRequest.JSON_PROPERTY_PROVIDER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRoutingClassifierRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIDENCE_THRESHOLD = "confidence_threshold";
  private JsonNullable<Double> confidenceThreshold = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private String context;

  public static final String JSON_PROPERTY_MODEL = "model";
  private String model;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public AiGatewayRoutingClassifierRequest confidenceThreshold(Double confidenceThreshold) {
    this.confidenceThreshold = JsonNullable.<Double>of(confidenceThreshold);
    return this;
  }

  /**
   * Minimum decision confidence. Omission preserves a saved value; new classifiers and explicit
   * null default to 0.5. minimum: 0 maximum: 1
   *
   * @return confidenceThreshold
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getConfidenceThreshold() {
    return confidenceThreshold.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIDENCE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getConfidenceThreshold_JsonNullable() {
    return confidenceThreshold;
  }

  @JsonProperty(JSON_PROPERTY_CONFIDENCE_THRESHOLD)
  public void setConfidenceThreshold_JsonNullable(JsonNullable<Double> confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
  }

  public void setConfidenceThreshold(Double confidenceThreshold) {
    this.confidenceThreshold = JsonNullable.<Double>of(confidenceThreshold);
  }

  public AiGatewayRoutingClassifierRequest context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Traffic context for the classifier. Omission preserves saved context.
   *
   * @return context
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public AiGatewayRoutingClassifierRequest model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Decision model on the provider. Omit together with provider to preserve the saved selection.
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

  public AiGatewayRoutingClassifierRequest provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Decision-model provider slug. It must name a provider of type <code>openai</code>, <code>
   * baseten</code>, or <code>typesafe</code>, the provider types that serve a decision model. Omit
   * together with model to preserve the saved selection.
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
   * @return AiGatewayRoutingClassifierRequest
   */
  @JsonAnySetter
  public AiGatewayRoutingClassifierRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRoutingClassifierRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRoutingClassifierRequest aiGatewayRoutingClassifierRequest =
        (AiGatewayRoutingClassifierRequest) o;
    return Objects.equals(
            this.confidenceThreshold, aiGatewayRoutingClassifierRequest.confidenceThreshold)
        && Objects.equals(this.context, aiGatewayRoutingClassifierRequest.context)
        && Objects.equals(this.model, aiGatewayRoutingClassifierRequest.model)
        && Objects.equals(this.provider, aiGatewayRoutingClassifierRequest.provider)
        && Objects.equals(
            this.additionalProperties, aiGatewayRoutingClassifierRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidenceThreshold, context, model, provider, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRoutingClassifierRequest {\n");
    sb.append("    confidenceThreshold: ")
        .append(toIndentedString(confidenceThreshold))
        .append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
