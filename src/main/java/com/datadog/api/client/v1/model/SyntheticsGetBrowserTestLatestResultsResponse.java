/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Object with the latest Synthetic browser test run. */
@JsonPropertyOrder({
  SyntheticsGetBrowserTestLatestResultsResponse.JSON_PROPERTY_LAST_TIMESTAMP_FETCHED,
  SyntheticsGetBrowserTestLatestResultsResponse.JSON_PROPERTY_RESULTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsGetBrowserTestLatestResultsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAST_TIMESTAMP_FETCHED = "last_timestamp_fetched";
  private Long lastTimestampFetched;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<SyntheticsBrowserTestResultShort> results = null;

  public SyntheticsGetBrowserTestLatestResultsResponse lastTimestampFetched(
      Long lastTimestampFetched) {
    this.lastTimestampFetched = lastTimestampFetched;
    return this;
  }

  /**
   * Timestamp of the latest browser test run.
   *
   * @return lastTimestampFetched
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_TIMESTAMP_FETCHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastTimestampFetched() {
    return lastTimestampFetched;
  }

  public void setLastTimestampFetched(Long lastTimestampFetched) {
    this.lastTimestampFetched = lastTimestampFetched;
  }

  public SyntheticsGetBrowserTestLatestResultsResponse results(
      List<SyntheticsBrowserTestResultShort> results) {
    this.results = results;
    for (SyntheticsBrowserTestResultShort item : results) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsGetBrowserTestLatestResultsResponse addResultsItem(
      SyntheticsBrowserTestResultShort resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    this.unparsed |= resultsItem.unparsed;
    return this;
  }

  /**
   * Result of the latest browser test run.
   *
   * @return results
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsBrowserTestResultShort> getResults() {
    return results;
  }

  public void setResults(List<SyntheticsBrowserTestResultShort> results) {
    this.results = results;
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
   * @return SyntheticsGetBrowserTestLatestResultsResponse
   */
  @JsonAnySetter
  public SyntheticsGetBrowserTestLatestResultsResponse putAdditionalProperty(
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

  /** Return true if this SyntheticsGetBrowserTestLatestResultsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsGetBrowserTestLatestResultsResponse syntheticsGetBrowserTestLatestResultsResponse =
        (SyntheticsGetBrowserTestLatestResultsResponse) o;
    return Objects.equals(
            this.lastTimestampFetched,
            syntheticsGetBrowserTestLatestResultsResponse.lastTimestampFetched)
        && Objects.equals(this.results, syntheticsGetBrowserTestLatestResultsResponse.results)
        && Objects.equals(
            this.additionalProperties,
            syntheticsGetBrowserTestLatestResultsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTimestampFetched, results, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsGetBrowserTestLatestResultsResponse {\n");
    sb.append("    lastTimestampFetched: ")
        .append(toIndentedString(lastTimestampFetched))
        .append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
