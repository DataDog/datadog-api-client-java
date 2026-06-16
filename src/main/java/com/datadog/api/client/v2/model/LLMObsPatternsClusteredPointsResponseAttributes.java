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

/** Attributes of an LLM Observability patterns clustered points response. */
@JsonPropertyOrder({
  LLMObsPatternsClusteredPointsResponseAttributes.JSON_PROPERTY_NEXT_PAGE_TOKEN,
  LLMObsPatternsClusteredPointsResponseAttributes.JSON_PROPERTY_POINTS,
  LLMObsPatternsClusteredPointsResponseAttributes.JSON_PROPERTY_TOPIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsClusteredPointsResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NEXT_PAGE_TOKEN = "next_page_token";
  private String nextPageToken;

  public static final String JSON_PROPERTY_POINTS = "points";
  private List<LLMObsPatternsClusteredPoint> points = new ArrayList<>();

  public static final String JSON_PROPERTY_TOPIC_ID = "topic_id";
  private String topicId;

  public LLMObsPatternsClusteredPointsResponseAttributes() {}

  @JsonCreator
  public LLMObsPatternsClusteredPointsResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NEXT_PAGE_TOKEN) String nextPageToken,
      @JsonProperty(required = true, value = JSON_PROPERTY_POINTS)
          List<LLMObsPatternsClusteredPoint> points,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOPIC_ID) String topicId) {
    this.nextPageToken = nextPageToken;
    if (nextPageToken != null) {}
    this.points = points;
    this.topicId = topicId;
  }

  public LLMObsPatternsClusteredPointsResponseAttributes nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    if (nextPageToken != null) {}
    return this;
  }

  /**
   * Pagination token for the next page of points. Null if there are no more pages.
   *
   * @return nextPageToken
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public LLMObsPatternsClusteredPointsResponseAttributes points(
      List<LLMObsPatternsClusteredPoint> points) {
    this.points = points;
    for (LLMObsPatternsClusteredPoint item : points) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsPatternsClusteredPointsResponseAttributes addPointsItem(
      LLMObsPatternsClusteredPoint pointsItem) {
    this.points.add(pointsItem);
    this.unparsed |= pointsItem.unparsed;
    return this;
  }

  /**
   * List of clustered points.
   *
   * @return points
   */
  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsPatternsClusteredPoint> getPoints() {
    return points;
  }

  public void setPoints(List<LLMObsPatternsClusteredPoint> points) {
    this.points = points;
  }

  public LLMObsPatternsClusteredPointsResponseAttributes topicId(String topicId) {
    this.topicId = topicId;
    return this;
  }

  /**
   * Identifier of the topic the points belong to.
   *
   * @return topicId
   */
  @JsonProperty(JSON_PROPERTY_TOPIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTopicId() {
    return topicId;
  }

  public void setTopicId(String topicId) {
    this.topicId = topicId;
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
   * @return LLMObsPatternsClusteredPointsResponseAttributes
   */
  @JsonAnySetter
  public LLMObsPatternsClusteredPointsResponseAttributes putAdditionalProperty(
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

  /** Return true if this LLMObsPatternsClusteredPointsResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsClusteredPointsResponseAttributes
        llmObsPatternsClusteredPointsResponseAttributes =
            (LLMObsPatternsClusteredPointsResponseAttributes) o;
    return Objects.equals(
            this.nextPageToken, llmObsPatternsClusteredPointsResponseAttributes.nextPageToken)
        && Objects.equals(this.points, llmObsPatternsClusteredPointsResponseAttributes.points)
        && Objects.equals(this.topicId, llmObsPatternsClusteredPointsResponseAttributes.topicId)
        && Objects.equals(
            this.additionalProperties,
            llmObsPatternsClusteredPointsResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, points, topicId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsClusteredPointsResponseAttributes {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
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
