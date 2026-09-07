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

/** Analytics query result containing all buckets. */
@JsonPropertyOrder({LLMObsExperimentationAnalyticsResult.JSON_PROPERTY_VALUES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentationAnalyticsResult {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_VALUES = "values";
  private List<LLMObsExperimentationAnalyticsValue> values = new ArrayList<>();

  public LLMObsExperimentationAnalyticsResult() {}

  @JsonCreator
  public LLMObsExperimentationAnalyticsResult(
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES)
          List<LLMObsExperimentationAnalyticsValue> values) {
    this.values = values;
    for (LLMObsExperimentationAnalyticsValue item : values) {
      this.unparsed |= item.unparsed;
    }
  }

  public LLMObsExperimentationAnalyticsResult values(
      List<LLMObsExperimentationAnalyticsValue> values) {
    this.values = values;
    for (LLMObsExperimentationAnalyticsValue item : values) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsExperimentationAnalyticsResult addValuesItem(
      LLMObsExperimentationAnalyticsValue valuesItem) {
    this.values.add(valuesItem);
    this.unparsed |= valuesItem.unparsed;
    return this;
  }

  /**
   * List of result buckets.
   *
   * @return values
   */
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsExperimentationAnalyticsValue> getValues() {
    return values;
  }

  public void setValues(List<LLMObsExperimentationAnalyticsValue> values) {
    this.values = values;
    if (values != null) {
      for (LLMObsExperimentationAnalyticsValue item : values) {
        this.unparsed |= item.unparsed;
      }
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
   * @return LLMObsExperimentationAnalyticsResult
   */
  @JsonAnySetter
  public LLMObsExperimentationAnalyticsResult putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsExperimentationAnalyticsResult object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentationAnalyticsResult llmObsExperimentationAnalyticsResult =
        (LLMObsExperimentationAnalyticsResult) o;
    return Objects.equals(this.values, llmObsExperimentationAnalyticsResult.values)
        && Objects.equals(
            this.additionalProperties, llmObsExperimentationAnalyticsResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentationAnalyticsResult {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
