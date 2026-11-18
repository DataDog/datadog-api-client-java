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
 * Experiment linked to the launch. The draft fields are cleared when <code>experiment_id</code> is
 * set.
 */
@JsonPropertyOrder({
  ProductAnalyticsLaunchExperimentStep.JSON_PROPERTY_EXPERIMENT_ID,
  ProductAnalyticsLaunchExperimentStep.JSON_PROPERTY_HYPOTHESIS,
  ProductAnalyticsLaunchExperimentStep.JSON_PROPERTY_NAME,
  ProductAnalyticsLaunchExperimentStep.JSON_PROPERTY_PROTOCOL_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsLaunchExperimentStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPERIMENT_ID = "experiment_id";
  private JsonNullable<String> experimentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HYPOTHESIS = "hypothesis";
  private JsonNullable<String> hypothesis = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROTOCOL_ID = "protocol_id";
  private JsonNullable<String> protocolId = JsonNullable.<String>undefined();

  public ProductAnalyticsLaunchExperimentStep experimentId(String experimentId) {
    this.experimentId = JsonNullable.<String>of(experimentId);
    return this;
  }

  /**
   * UUID of the linked experiment.
   *
   * @return experimentId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getExperimentId() {
    return experimentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPERIMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getExperimentId_JsonNullable() {
    return experimentId;
  }

  @JsonProperty(JSON_PROPERTY_EXPERIMENT_ID)
  public void setExperimentId_JsonNullable(JsonNullable<String> experimentId) {
    this.experimentId = experimentId;
  }

  public void setExperimentId(String experimentId) {
    this.experimentId = JsonNullable.<String>of(experimentId);
  }

  public ProductAnalyticsLaunchExperimentStep hypothesis(String hypothesis) {
    this.hypothesis = JsonNullable.<String>of(hypothesis);
    return this;
  }

  /**
   * Hypothesis of a draft experiment.
   *
   * @return hypothesis
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getHypothesis() {
    return hypothesis.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HYPOTHESIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getHypothesis_JsonNullable() {
    return hypothesis;
  }

  @JsonProperty(JSON_PROPERTY_HYPOTHESIS)
  public void setHypothesis_JsonNullable(JsonNullable<String> hypothesis) {
    this.hypothesis = hypothesis;
  }

  public void setHypothesis(String hypothesis) {
    this.hypothesis = JsonNullable.<String>of(hypothesis);
  }

  public ProductAnalyticsLaunchExperimentStep name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * Name of a draft experiment.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getName() {
    return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public ProductAnalyticsLaunchExperimentStep protocolId(String protocolId) {
    this.protocolId = JsonNullable.<String>of(protocolId);
    return this;
  }

  /**
   * Protocol ID of a draft experiment.
   *
   * @return protocolId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getProtocolId() {
    return protocolId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROTOCOL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getProtocolId_JsonNullable() {
    return protocolId;
  }

  @JsonProperty(JSON_PROPERTY_PROTOCOL_ID)
  public void setProtocolId_JsonNullable(JsonNullable<String> protocolId) {
    this.protocolId = protocolId;
  }

  public void setProtocolId(String protocolId) {
    this.protocolId = JsonNullable.<String>of(protocolId);
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
   * @return ProductAnalyticsLaunchExperimentStep
   */
  @JsonAnySetter
  public ProductAnalyticsLaunchExperimentStep putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsLaunchExperimentStep object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsLaunchExperimentStep productAnalyticsLaunchExperimentStep =
        (ProductAnalyticsLaunchExperimentStep) o;
    return Objects.equals(this.experimentId, productAnalyticsLaunchExperimentStep.experimentId)
        && Objects.equals(this.hypothesis, productAnalyticsLaunchExperimentStep.hypothesis)
        && Objects.equals(this.name, productAnalyticsLaunchExperimentStep.name)
        && Objects.equals(this.protocolId, productAnalyticsLaunchExperimentStep.protocolId)
        && Objects.equals(
            this.additionalProperties, productAnalyticsLaunchExperimentStep.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, hypothesis, name, protocolId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsLaunchExperimentStep {\n");
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    hypothesis: ").append(toIndentedString(hypothesis)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocolId: ").append(toIndentedString(protocolId)).append("\n");
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
