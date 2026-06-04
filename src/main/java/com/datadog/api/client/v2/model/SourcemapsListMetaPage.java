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

/** Page information for the source maps list response. */
@JsonPropertyOrder({
  SourcemapsListMetaPage.JSON_PROPERTY_HAS_MORE_RESULTS,
  SourcemapsListMetaPage.JSON_PROPERTY_TOTAL_FILTERED_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SourcemapsListMetaPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HAS_MORE_RESULTS = "has_more_results";
  private Boolean hasMoreResults;

  public static final String JSON_PROPERTY_TOTAL_FILTERED_COUNT = "total_filtered_count";
  private Long totalFilteredCount;

  public SourcemapsListMetaPage() {}

  @JsonCreator
  public SourcemapsListMetaPage(
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_MORE_RESULTS) Boolean hasMoreResults,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_FILTERED_COUNT)
          Long totalFilteredCount) {
    this.hasMoreResults = hasMoreResults;
    this.totalFilteredCount = totalFilteredCount;
  }

  public SourcemapsListMetaPage hasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
    return this;
  }

  /**
   * Whether there are more results available beyond the current page.
   *
   * @return hasMoreResults
   */
  @JsonProperty(JSON_PROPERTY_HAS_MORE_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasMoreResults() {
    return hasMoreResults;
  }

  public void setHasMoreResults(Boolean hasMoreResults) {
    this.hasMoreResults = hasMoreResults;
  }

  public SourcemapsListMetaPage totalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
    return this;
  }

  /**
   * Total number of source maps matching the filter criteria.
   *
   * @return totalFilteredCount
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_FILTERED_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalFilteredCount() {
    return totalFilteredCount;
  }

  public void setTotalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
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
   * @return SourcemapsListMetaPage
   */
  @JsonAnySetter
  public SourcemapsListMetaPage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SourcemapsListMetaPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourcemapsListMetaPage sourcemapsListMetaPage = (SourcemapsListMetaPage) o;
    return Objects.equals(this.hasMoreResults, sourcemapsListMetaPage.hasMoreResults)
        && Objects.equals(this.totalFilteredCount, sourcemapsListMetaPage.totalFilteredCount)
        && Objects.equals(this.additionalProperties, sourcemapsListMetaPage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMoreResults, totalFilteredCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourcemapsListMetaPage {\n");
    sb.append("    hasMoreResults: ").append(toIndentedString(hasMoreResults)).append("\n");
    sb.append("    totalFilteredCount: ").append(toIndentedString(totalFilteredCount)).append("\n");
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
