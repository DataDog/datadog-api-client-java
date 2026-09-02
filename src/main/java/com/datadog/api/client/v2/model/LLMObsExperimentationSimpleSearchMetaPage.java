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

/** Page metadata. */
@JsonPropertyOrder({
  LLMObsExperimentationSimpleSearchMetaPage.JSON_PROPERTY_CURRENT,
  LLMObsExperimentationSimpleSearchMetaPage.JSON_PROPERTY_LIMIT,
  LLMObsExperimentationSimpleSearchMetaPage.JSON_PROPERTY_TOTAL_COUNT,
  LLMObsExperimentationSimpleSearchMetaPage.JSON_PROPERTY_TOTAL_PAGES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentationSimpleSearchMetaPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURRENT = "current";
  private Integer current;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Integer totalCount;

  public static final String JSON_PROPERTY_TOTAL_PAGES = "total_pages";
  private Integer totalPages;

  public LLMObsExperimentationSimpleSearchMetaPage current(Integer current) {
    this.current = current;
    return this;
  }

  /**
   * Current page number. maximum: 2147483647
   *
   * @return current
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getCurrent() {
    return current;
  }

  public void setCurrent(Integer current) {
    this.current = current;
  }

  public LLMObsExperimentationSimpleSearchMetaPage limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Page size used for this response. maximum: 2147483647
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public LLMObsExperimentationSimpleSearchMetaPage totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total number of matching results (capped at the maximum search limit). maximum: 2147483647
   *
   * @return totalCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public LLMObsExperimentationSimpleSearchMetaPage totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Total number of pages available. maximum: 2147483647
   *
   * @return totalPages
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
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
   * @return LLMObsExperimentationSimpleSearchMetaPage
   */
  @JsonAnySetter
  public LLMObsExperimentationSimpleSearchMetaPage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsExperimentationSimpleSearchMetaPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentationSimpleSearchMetaPage llmObsExperimentationSimpleSearchMetaPage =
        (LLMObsExperimentationSimpleSearchMetaPage) o;
    return Objects.equals(this.current, llmObsExperimentationSimpleSearchMetaPage.current)
        && Objects.equals(this.limit, llmObsExperimentationSimpleSearchMetaPage.limit)
        && Objects.equals(this.totalCount, llmObsExperimentationSimpleSearchMetaPage.totalCount)
        && Objects.equals(this.totalPages, llmObsExperimentationSimpleSearchMetaPage.totalPages)
        && Objects.equals(
            this.additionalProperties,
            llmObsExperimentationSimpleSearchMetaPage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, limit, totalCount, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentationSimpleSearchMetaPage {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
