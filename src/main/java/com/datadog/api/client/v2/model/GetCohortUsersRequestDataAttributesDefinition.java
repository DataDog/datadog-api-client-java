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

/** */
@JsonPropertyOrder({
  GetCohortUsersRequestDataAttributesDefinition.JSON_PROPERTY_AUDIENCE_FILTERS,
  GetCohortUsersRequestDataAttributesDefinition.JSON_PROPERTY_COHORT,
  GetCohortUsersRequestDataAttributesDefinition.JSON_PROPERTY_INCLUSION_SEARCH,
  GetCohortUsersRequestDataAttributesDefinition.JSON_PROPERTY_RETURN_SEARCH,
  GetCohortUsersRequestDataAttributesDefinition.JSON_PROPERTY_SEGMENT_ID,
  GetCohortUsersRequestDataAttributesDefinition.JSON_PROPERTY_WINDOW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetCohortUsersRequestDataAttributesDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIENCE_FILTERS = "audience_filters";
  private GetCohortUsersRequestDataAttributesDefinitionAudienceFilters audienceFilters;

  public static final String JSON_PROPERTY_COHORT = "cohort";
  private String cohort;

  public static final String JSON_PROPERTY_INCLUSION_SEARCH = "inclusion_search";
  private String inclusionSearch;

  public static final String JSON_PROPERTY_RETURN_SEARCH = "return_search";
  private String returnSearch;

  public static final String JSON_PROPERTY_SEGMENT_ID = "segment_id";
  private String segmentId;

  public static final String JSON_PROPERTY_WINDOW = "window";
  private Long window;

  public GetCohortUsersRequestDataAttributesDefinition audienceFilters(
      GetCohortUsersRequestDataAttributesDefinitionAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    this.unparsed |= audienceFilters.unparsed;
    return this;
  }

  /**
   * GetaudienceFilters
   *
   * @return audienceFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetCohortUsersRequestDataAttributesDefinitionAudienceFilters getAudienceFilters() {
    return audienceFilters;
  }

  public void setAudienceFilters(
      GetCohortUsersRequestDataAttributesDefinitionAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
  }

  public GetCohortUsersRequestDataAttributesDefinition cohort(String cohort) {
    this.cohort = cohort;
    return this;
  }

  /**
   * Getcohort
   *
   * @return cohort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COHORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCohort() {
    return cohort;
  }

  public void setCohort(String cohort) {
    this.cohort = cohort;
  }

  public GetCohortUsersRequestDataAttributesDefinition inclusionSearch(String inclusionSearch) {
    this.inclusionSearch = inclusionSearch;
    return this;
  }

  /**
   * GetinclusionSearch
   *
   * @return inclusionSearch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUSION_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInclusionSearch() {
    return inclusionSearch;
  }

  public void setInclusionSearch(String inclusionSearch) {
    this.inclusionSearch = inclusionSearch;
  }

  public GetCohortUsersRequestDataAttributesDefinition returnSearch(String returnSearch) {
    this.returnSearch = returnSearch;
    return this;
  }

  /**
   * GetreturnSearch
   *
   * @return returnSearch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReturnSearch() {
    return returnSearch;
  }

  public void setReturnSearch(String returnSearch) {
    this.returnSearch = returnSearch;
  }

  public GetCohortUsersRequestDataAttributesDefinition segmentId(String segmentId) {
    this.segmentId = segmentId;
    return this;
  }

  /**
   * GetsegmentId
   *
   * @return segmentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSegmentId() {
    return segmentId;
  }

  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }

  public GetCohortUsersRequestDataAttributesDefinition window(Long window) {
    this.window = window;
    return this;
  }

  /**
   * Getwindow
   *
   * @return window
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getWindow() {
    return window;
  }

  public void setWindow(Long window) {
    this.window = window;
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
   * @return GetCohortUsersRequestDataAttributesDefinition
   */
  @JsonAnySetter
  public GetCohortUsersRequestDataAttributesDefinition putAdditionalProperty(
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

  /** Return true if this GetCohortUsersRequestDataAttributesDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCohortUsersRequestDataAttributesDefinition getCohortUsersRequestDataAttributesDefinition =
        (GetCohortUsersRequestDataAttributesDefinition) o;
    return Objects.equals(
            this.audienceFilters, getCohortUsersRequestDataAttributesDefinition.audienceFilters)
        && Objects.equals(this.cohort, getCohortUsersRequestDataAttributesDefinition.cohort)
        && Objects.equals(
            this.inclusionSearch, getCohortUsersRequestDataAttributesDefinition.inclusionSearch)
        && Objects.equals(
            this.returnSearch, getCohortUsersRequestDataAttributesDefinition.returnSearch)
        && Objects.equals(this.segmentId, getCohortUsersRequestDataAttributesDefinition.segmentId)
        && Objects.equals(this.window, getCohortUsersRequestDataAttributesDefinition.window)
        && Objects.equals(
            this.additionalProperties,
            getCohortUsersRequestDataAttributesDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        audienceFilters,
        cohort,
        inclusionSearch,
        returnSearch,
        segmentId,
        window,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCohortUsersRequestDataAttributesDefinition {\n");
    sb.append("    audienceFilters: ").append(toIndentedString(audienceFilters)).append("\n");
    sb.append("    cohort: ").append(toIndentedString(cohort)).append("\n");
    sb.append("    inclusionSearch: ").append(toIndentedString(inclusionSearch)).append("\n");
    sb.append("    returnSearch: ").append(toIndentedString(returnSearch)).append("\n");
    sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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
