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

/** Attributes of an analytics response. */
@JsonPropertyOrder({
  LLMObsExperimentationAnalyticsDataAttributesResponse.JSON_PROPERTY_HIT_COUNT,
  LLMObsExperimentationAnalyticsDataAttributesResponse.JSON_PROPERTY_RESULT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentationAnalyticsDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIT_COUNT = "hit_count";
  private Long hitCount;

  public static final String JSON_PROPERTY_RESULT = "result";
  private LLMObsExperimentationAnalyticsResult result;

  public LLMObsExperimentationAnalyticsDataAttributesResponse() {}

  @JsonCreator
  public LLMObsExperimentationAnalyticsDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_HIT_COUNT) Long hitCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESULT)
          LLMObsExperimentationAnalyticsResult result) {
    this.hitCount = hitCount;
    this.result = result;
    this.unparsed |= result.unparsed;
  }

  public LLMObsExperimentationAnalyticsDataAttributesResponse hitCount(Long hitCount) {
    this.hitCount = hitCount;
    return this;
  }

  /**
   * Total number of events matched by the query before grouping.
   *
   * @return hitCount
   */
  @JsonProperty(JSON_PROPERTY_HIT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getHitCount() {
    return hitCount;
  }

  public void setHitCount(Long hitCount) {
    this.hitCount = hitCount;
  }

  public LLMObsExperimentationAnalyticsDataAttributesResponse result(
      LLMObsExperimentationAnalyticsResult result) {
    this.result = result;
    this.unparsed |= result.unparsed;
    return this;
  }

  /**
   * Analytics query result containing all buckets.
   *
   * @return result
   */
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsExperimentationAnalyticsResult getResult() {
    return result;
  }

  public void setResult(LLMObsExperimentationAnalyticsResult result) {
    this.result = result;
    if (result != null) {
      this.unparsed |= result.unparsed;
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
   * @return LLMObsExperimentationAnalyticsDataAttributesResponse
   */
  @JsonAnySetter
  public LLMObsExperimentationAnalyticsDataAttributesResponse putAdditionalProperty(
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
   * Return true if this LLMObsExperimentationAnalyticsDataAttributesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentationAnalyticsDataAttributesResponse
        llmObsExperimentationAnalyticsDataAttributesResponse =
            (LLMObsExperimentationAnalyticsDataAttributesResponse) o;
    return Objects.equals(
            this.hitCount, llmObsExperimentationAnalyticsDataAttributesResponse.hitCount)
        && Objects.equals(this.result, llmObsExperimentationAnalyticsDataAttributesResponse.result)
        && Objects.equals(
            this.additionalProperties,
            llmObsExperimentationAnalyticsDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hitCount, result, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentationAnalyticsDataAttributesResponse {\n");
    sb.append("    hitCount: ").append(toIndentedString(hitCount)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
