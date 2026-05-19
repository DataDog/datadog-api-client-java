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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Available facet key names for filtering resources. */
@JsonPropertyOrder({
  ModelLabFacetKeysAttributes.JSON_PROPERTY_METRICS,
  ModelLabFacetKeysAttributes.JSON_PROPERTY_PARAMETERS,
  ModelLabFacetKeysAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ModelLabFacetKeysAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<String> metrics = new ArrayList<>();

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<String> parameters = new ArrayList<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public ModelLabFacetKeysAttributes() {}

  @JsonCreator
  public ModelLabFacetKeysAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_METRICS) List<String> metrics,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARAMETERS) List<String> parameters,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.metrics = metrics;
    if (metrics != null) {}
    this.parameters = parameters;
    this.tags = tags;
  }

  public ModelLabFacetKeysAttributes metrics(List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public ModelLabFacetKeysAttributes addMetricsItem(String metricsItem) {
    this.metrics.add(metricsItem);
    return this;
  }

  /**
   * The list of available metric facet keys.
   *
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }

  public ModelLabFacetKeysAttributes parameters(List<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public ModelLabFacetKeysAttributes addParametersItem(String parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * The list of available parameter facet keys.
   *
   * @return parameters
   */
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getParameters() {
    return parameters;
  }

  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }

  public ModelLabFacetKeysAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ModelLabFacetKeysAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * The list of available tag facet keys.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return ModelLabFacetKeysAttributes
   */
  @JsonAnySetter
  public ModelLabFacetKeysAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ModelLabFacetKeysAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelLabFacetKeysAttributes modelLabFacetKeysAttributes = (ModelLabFacetKeysAttributes) o;
    return Objects.equals(this.metrics, modelLabFacetKeysAttributes.metrics)
        && Objects.equals(this.parameters, modelLabFacetKeysAttributes.parameters)
        && Objects.equals(this.tags, modelLabFacetKeysAttributes.tags)
        && Objects.equals(
            this.additionalProperties, modelLabFacetKeysAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, parameters, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelLabFacetKeysAttributes {\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
