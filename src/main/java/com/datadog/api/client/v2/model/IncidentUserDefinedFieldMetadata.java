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

/**
 * Metadata for autocomplete-type user-defined fields, describing how to populate autocomplete
 * options.
 */
@JsonPropertyOrder({
  IncidentUserDefinedFieldMetadata.JSON_PROPERTY_CATEGORY,
  IncidentUserDefinedFieldMetadata.JSON_PROPERTY_SEARCH_LIMIT_PARAM,
  IncidentUserDefinedFieldMetadata.JSON_PROPERTY_SEARCH_PARAMS,
  IncidentUserDefinedFieldMetadata.JSON_PROPERTY_SEARCH_QUERY_PARAM,
  IncidentUserDefinedFieldMetadata.JSON_PROPERTY_SEARCH_RESULT_PATH,
  IncidentUserDefinedFieldMetadata.JSON_PROPERTY_SEARCH_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentUserDefinedFieldMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_SEARCH_LIMIT_PARAM = "search_limit_param";
  private String searchLimitParam;

  public static final String JSON_PROPERTY_SEARCH_PARAMS = "search_params";
  private Map<String, Object> searchParams = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_SEARCH_QUERY_PARAM = "search_query_param";
  private String searchQueryParam;

  public static final String JSON_PROPERTY_SEARCH_RESULT_PATH = "search_result_path";
  private String searchResultPath;

  public static final String JSON_PROPERTY_SEARCH_URL = "search_url";
  private String searchUrl;

  public IncidentUserDefinedFieldMetadata() {}

  @JsonCreator
  public IncidentUserDefinedFieldMetadata(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) String category,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH_LIMIT_PARAM)
          String searchLimitParam,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH_PARAMS)
          Map<String, Object> searchParams,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH_QUERY_PARAM)
          String searchQueryParam,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH_RESULT_PATH)
          String searchResultPath,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH_URL) String searchUrl) {
    this.category = category;
    this.searchLimitParam = searchLimitParam;
    this.searchParams = searchParams;
    this.searchQueryParam = searchQueryParam;
    this.searchResultPath = searchResultPath;
    this.searchUrl = searchUrl;
  }

  public IncidentUserDefinedFieldMetadata category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the autocomplete source.
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public IncidentUserDefinedFieldMetadata searchLimitParam(String searchLimitParam) {
    this.searchLimitParam = searchLimitParam;
    return this;
  }

  /**
   * The query parameter used to limit the number of autocomplete results.
   *
   * @return searchLimitParam
   */
  @JsonProperty(JSON_PROPERTY_SEARCH_LIMIT_PARAM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSearchLimitParam() {
    return searchLimitParam;
  }

  public void setSearchLimitParam(String searchLimitParam) {
    this.searchLimitParam = searchLimitParam;
  }

  public IncidentUserDefinedFieldMetadata searchParams(Map<String, Object> searchParams) {
    this.searchParams = searchParams;
    return this;
  }

  public IncidentUserDefinedFieldMetadata putSearchParamsItem(String key, Object searchParamsItem) {
    this.searchParams.put(key, searchParamsItem);
    return this;
  }

  /**
   * Additional query parameters to include in the search URL.
   *
   * @return searchParams
   */
  @JsonProperty(JSON_PROPERTY_SEARCH_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getSearchParams() {
    return searchParams;
  }

  public void setSearchParams(Map<String, Object> searchParams) {
    this.searchParams = searchParams;
  }

  public IncidentUserDefinedFieldMetadata searchQueryParam(String searchQueryParam) {
    this.searchQueryParam = searchQueryParam;
    return this;
  }

  /**
   * The query parameter used to pass typed input to the search URL.
   *
   * @return searchQueryParam
   */
  @JsonProperty(JSON_PROPERTY_SEARCH_QUERY_PARAM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSearchQueryParam() {
    return searchQueryParam;
  }

  public void setSearchQueryParam(String searchQueryParam) {
    this.searchQueryParam = searchQueryParam;
  }

  public IncidentUserDefinedFieldMetadata searchResultPath(String searchResultPath) {
    this.searchResultPath = searchResultPath;
    return this;
  }

  /**
   * The JSON path to the results in the response body.
   *
   * @return searchResultPath
   */
  @JsonProperty(JSON_PROPERTY_SEARCH_RESULT_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSearchResultPath() {
    return searchResultPath;
  }

  public void setSearchResultPath(String searchResultPath) {
    this.searchResultPath = searchResultPath;
  }

  public IncidentUserDefinedFieldMetadata searchUrl(String searchUrl) {
    this.searchUrl = searchUrl;
    return this;
  }

  /**
   * The URL used to populate autocomplete options.
   *
   * @return searchUrl
   */
  @JsonProperty(JSON_PROPERTY_SEARCH_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSearchUrl() {
    return searchUrl;
  }

  public void setSearchUrl(String searchUrl) {
    this.searchUrl = searchUrl;
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
   * @return IncidentUserDefinedFieldMetadata
   */
  @JsonAnySetter
  public IncidentUserDefinedFieldMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentUserDefinedFieldMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentUserDefinedFieldMetadata incidentUserDefinedFieldMetadata =
        (IncidentUserDefinedFieldMetadata) o;
    return Objects.equals(this.category, incidentUserDefinedFieldMetadata.category)
        && Objects.equals(this.searchLimitParam, incidentUserDefinedFieldMetadata.searchLimitParam)
        && Objects.equals(this.searchParams, incidentUserDefinedFieldMetadata.searchParams)
        && Objects.equals(this.searchQueryParam, incidentUserDefinedFieldMetadata.searchQueryParam)
        && Objects.equals(this.searchResultPath, incidentUserDefinedFieldMetadata.searchResultPath)
        && Objects.equals(this.searchUrl, incidentUserDefinedFieldMetadata.searchUrl)
        && Objects.equals(
            this.additionalProperties, incidentUserDefinedFieldMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        searchLimitParam,
        searchParams,
        searchQueryParam,
        searchResultPath,
        searchUrl,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentUserDefinedFieldMetadata {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    searchLimitParam: ").append(toIndentedString(searchLimitParam)).append("\n");
    sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
    sb.append("    searchQueryParam: ").append(toIndentedString(searchQueryParam)).append("\n");
    sb.append("    searchResultPath: ").append(toIndentedString(searchResultPath)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
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
