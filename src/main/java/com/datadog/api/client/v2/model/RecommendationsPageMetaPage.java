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

/** Pagination metadata for a page of cost recommendations. */
@JsonPropertyOrder({
  RecommendationsPageMetaPage.JSON_PROPERTY_FILTER,
  RecommendationsPageMetaPage.JSON_PROPERTY_NEXT_PAGE_TOKEN,
  RecommendationsPageMetaPage.JSON_PROPERTY_PAGE_SIZE,
  RecommendationsPageMetaPage.JSON_PROPERTY_PAGE_TOKEN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RecommendationsPageMetaPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_NEXT_PAGE_TOKEN = "next_page_token";
  private String nextPageToken;

  public static final String JSON_PROPERTY_PAGE_SIZE = "page_size";
  private Integer pageSize;

  public static final String JSON_PROPERTY_PAGE_TOKEN = "page_token";
  private String pageToken;

  public RecommendationsPageMetaPage filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * The filter expression that was applied to produce this page.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public RecommendationsPageMetaPage nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Opaque token used to fetch the next page; absent on the last page.
   *
   * @return nextPageToken
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public RecommendationsPageMetaPage pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Number of items returned in this page (1–10000). minimum: 1 maximum: 10000
   *
   * @return pageSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public RecommendationsPageMetaPage pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Pagination token echoed back from the request.
   *
   * @return pageToken
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
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
   * @return RecommendationsPageMetaPage
   */
  @JsonAnySetter
  public RecommendationsPageMetaPage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RecommendationsPageMetaPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationsPageMetaPage recommendationsPageMetaPage = (RecommendationsPageMetaPage) o;
    return Objects.equals(this.filter, recommendationsPageMetaPage.filter)
        && Objects.equals(this.nextPageToken, recommendationsPageMetaPage.nextPageToken)
        && Objects.equals(this.pageSize, recommendationsPageMetaPage.pageSize)
        && Objects.equals(this.pageToken, recommendationsPageMetaPage.pageToken)
        && Objects.equals(
            this.additionalProperties, recommendationsPageMetaPage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, nextPageToken, pageSize, pageToken, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationsPageMetaPage {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
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
