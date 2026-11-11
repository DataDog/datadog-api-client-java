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

/** Decision model of a classified tier. */
@JsonPropertyOrder({
  AiGatewayRoutingRuleClassifier.JSON_PROPERTY_CONFIDENCE_THRESHOLD,
  AiGatewayRoutingRuleClassifier.JSON_PROPERTY_CONTEXT,
  AiGatewayRoutingRuleClassifier.JSON_PROPERTY_MODEL,
  AiGatewayRoutingRuleClassifier.JSON_PROPERTY_PROVIDER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayRoutingRuleClassifier {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIDENCE_THRESHOLD = "confidence_threshold";
  private Double confidenceThreshold;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private String context;

  public static final String JSON_PROPERTY_MODEL = "model";
  private String model;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public AiGatewayRoutingRuleClassifier() {}

  @JsonCreator
  public AiGatewayRoutingRuleClassifier(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIDENCE_THRESHOLD)
          Double confidenceThreshold,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODEL) String model,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER) String provider) {
    this.confidenceThreshold = confidenceThreshold;
    this.model = model;
    this.provider = provider;
  }

  public AiGatewayRoutingRuleClassifier confidenceThreshold(Double confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

  /**
   * Probability from 0 to 1 that the picked destination must reach. Below it, the request goes to
   * the default destination. minimum: 0 maximum: 1
   *
   * @return confidenceThreshold
   */
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getConfidenceThreshold() {
    return confidenceThreshold;
  }

  public void setConfidenceThreshold(Double confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
  }

  public AiGatewayRoutingRuleClassifier context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Prompt that tells the decision model about the rule's traffic. Omitted when empty.
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

  public AiGatewayRoutingRuleClassifier model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Canonical name of the decision model. Empty when the caller cannot view its provider.
   *
   * @return model
   */
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public AiGatewayRoutingRuleClassifier provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Slug of the provider that serves the decision model. Empty when the caller cannot view the
   * provider.
   *
   * @return provider
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return AiGatewayRoutingRuleClassifier
   */
  @JsonAnySetter
  public AiGatewayRoutingRuleClassifier putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayRoutingRuleClassifier object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayRoutingRuleClassifier aiGatewayRoutingRuleClassifier =
        (AiGatewayRoutingRuleClassifier) o;
    return Objects.equals(
            this.confidenceThreshold, aiGatewayRoutingRuleClassifier.confidenceThreshold)
        && Objects.equals(this.context, aiGatewayRoutingRuleClassifier.context)
        && Objects.equals(this.model, aiGatewayRoutingRuleClassifier.model)
        && Objects.equals(this.provider, aiGatewayRoutingRuleClassifier.provider)
        && Objects.equals(
            this.additionalProperties, aiGatewayRoutingRuleClassifier.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidenceThreshold, context, model, provider, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayRoutingRuleClassifier {\n");
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
