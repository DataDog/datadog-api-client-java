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

/** Defines the metric lookup value used as the reference-table row ID. */
@JsonPropertyOrder({ObservabilityPipelineMetricEnrichmentTableReferenceKey.JSON_PROPERTY_SOURCE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineMetricEnrichmentTableReferenceKey {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SOURCE = "source";
  private ObservabilityPipelineMetricEnrichmentTableLookupSource source;

  public ObservabilityPipelineMetricEnrichmentTableReferenceKey() {}

  @JsonCreator
  public ObservabilityPipelineMetricEnrichmentTableReferenceKey(
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          ObservabilityPipelineMetricEnrichmentTableLookupSource source) {
    this.source = source;
    this.unparsed |= source.unparsed;
  }

  public ObservabilityPipelineMetricEnrichmentTableReferenceKey source(
      ObservabilityPipelineMetricEnrichmentTableLookupSource source) {
    this.source = source;
    this.unparsed |= source.unparsed;
    return this;
  }

  /**
   * Specifies the source of the key value used for metric enrichment table lookups. The lookup key
   * can be either the metric name or a metric tag.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineMetricEnrichmentTableLookupSource getSource() {
    return source;
  }

  public void setSource(ObservabilityPipelineMetricEnrichmentTableLookupSource source) {
    this.source = source;
    if (source != null) {
      this.unparsed |= source.unparsed;
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
   * @return ObservabilityPipelineMetricEnrichmentTableReferenceKey
   */
  @JsonAnySetter
  public ObservabilityPipelineMetricEnrichmentTableReferenceKey putAdditionalProperty(
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

  /**
   * Return true if this ObservabilityPipelineMetricEnrichmentTableReferenceKey object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineMetricEnrichmentTableReferenceKey
        observabilityPipelineMetricEnrichmentTableReferenceKey =
            (ObservabilityPipelineMetricEnrichmentTableReferenceKey) o;
    return Objects.equals(
            this.source, observabilityPipelineMetricEnrichmentTableReferenceKey.source)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineMetricEnrichmentTableReferenceKey.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineMetricEnrichmentTableReferenceKey {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
