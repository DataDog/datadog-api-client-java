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

/** Attributes for an experimentation search request. */
@JsonPropertyOrder({
  LLMObsExperimentationSearchDataAttributesRequest.JSON_PROPERTY_CONTENT_PREVIEW,
  LLMObsExperimentationSearchDataAttributesRequest.JSON_PROPERTY_FILTER,
  LLMObsExperimentationSearchDataAttributesRequest.JSON_PROPERTY_INCLUDE,
  LLMObsExperimentationSearchDataAttributesRequest.JSON_PROPERTY_PAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentationSearchDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT_PREVIEW = "content_preview";
  private LLMObsExperimentationContentPreview contentPreview;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private LLMObsExperimentationFilter filter;

  public static final String JSON_PROPERTY_INCLUDE = "include";
  private LLMObsExperimentationInclude include;

  public static final String JSON_PROPERTY_PAGE = "page";
  private LLMObsExperimentationCursorPage page;

  public LLMObsExperimentationSearchDataAttributesRequest() {}

  @JsonCreator
  public LLMObsExperimentationSearchDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTER)
          LLMObsExperimentationFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
  }

  public LLMObsExperimentationSearchDataAttributesRequest contentPreview(
      LLMObsExperimentationContentPreview contentPreview) {
    this.contentPreview = contentPreview;
    this.unparsed |= contentPreview.unparsed;
    return this;
  }

  /**
   * Options to control content preview truncation.
   *
   * @return contentPreview
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsExperimentationContentPreview getContentPreview() {
    return contentPreview;
  }

  public void setContentPreview(LLMObsExperimentationContentPreview contentPreview) {
    this.contentPreview = contentPreview;
  }

  public LLMObsExperimentationSearchDataAttributesRequest filter(
      LLMObsExperimentationFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * Filter criteria for an experimentation search request.
   *
   * @return filter
   */
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsExperimentationFilter getFilter() {
    return filter;
  }

  public void setFilter(LLMObsExperimentationFilter filter) {
    this.filter = filter;
  }

  public LLMObsExperimentationSearchDataAttributesRequest include(
      LLMObsExperimentationInclude include) {
    this.include = include;
    this.unparsed |= include.unparsed;
    return this;
  }

  /**
   * Additional data to include in the response.
   *
   * @return include
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsExperimentationInclude getInclude() {
    return include;
  }

  public void setInclude(LLMObsExperimentationInclude include) {
    this.include = include;
  }

  public LLMObsExperimentationSearchDataAttributesRequest page(
      LLMObsExperimentationCursorPage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Cursor-based pagination parameters.
   *
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsExperimentationCursorPage getPage() {
    return page;
  }

  public void setPage(LLMObsExperimentationCursorPage page) {
    this.page = page;
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
   * @return LLMObsExperimentationSearchDataAttributesRequest
   */
  @JsonAnySetter
  public LLMObsExperimentationSearchDataAttributesRequest putAdditionalProperty(
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

  /** Return true if this LLMObsExperimentationSearchDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentationSearchDataAttributesRequest
        llmObsExperimentationSearchDataAttributesRequest =
            (LLMObsExperimentationSearchDataAttributesRequest) o;
    return Objects.equals(
            this.contentPreview, llmObsExperimentationSearchDataAttributesRequest.contentPreview)
        && Objects.equals(this.filter, llmObsExperimentationSearchDataAttributesRequest.filter)
        && Objects.equals(this.include, llmObsExperimentationSearchDataAttributesRequest.include)
        && Objects.equals(this.page, llmObsExperimentationSearchDataAttributesRequest.page)
        && Objects.equals(
            this.additionalProperties,
            llmObsExperimentationSearchDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentPreview, filter, include, page, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentationSearchDataAttributesRequest {\n");
    sb.append("    contentPreview: ").append(toIndentedString(contentPreview)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
