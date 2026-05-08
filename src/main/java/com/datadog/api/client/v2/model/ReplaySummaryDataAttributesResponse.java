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

/** Attributes of a RUM replay summary response. */
@JsonPropertyOrder({
  ReplaySummaryDataAttributesResponse.JSON_PROPERTY_CHAPTERS,
  ReplaySummaryDataAttributesResponse.JSON_PROPERTY_HAS_ENOUGH_ACTIVITY,
  ReplaySummaryDataAttributesResponse.JSON_PROPERTY_HAS_TOO_MANY_EVENTS,
  ReplaySummaryDataAttributesResponse.JSON_PROPERTY_SUMMARY,
  ReplaySummaryDataAttributesResponse.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReplaySummaryDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHAPTERS = "chapters";
  private List<ReplaySummaryChapter> chapters = new ArrayList<>();

  public static final String JSON_PROPERTY_HAS_ENOUGH_ACTIVITY = "has_enough_activity";
  private Boolean hasEnoughActivity;

  public static final String JSON_PROPERTY_HAS_TOO_MANY_EVENTS = "has_too_many_events";
  private Boolean hasTooManyEvents;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public ReplaySummaryDataAttributesResponse() {}

  @JsonCreator
  public ReplaySummaryDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHAPTERS)
          List<ReplaySummaryChapter> chapters,
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_ENOUGH_ACTIVITY)
          Boolean hasEnoughActivity,
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_TOO_MANY_EVENTS)
          Boolean hasTooManyEvents,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUMMARY) String summary,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) String version) {
    this.chapters = chapters;
    this.hasEnoughActivity = hasEnoughActivity;
    this.hasTooManyEvents = hasTooManyEvents;
    this.summary = summary;
    this.version = version;
  }

  public ReplaySummaryDataAttributesResponse chapters(List<ReplaySummaryChapter> chapters) {
    this.chapters = chapters;
    for (ReplaySummaryChapter item : chapters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ReplaySummaryDataAttributesResponse addChaptersItem(ReplaySummaryChapter chaptersItem) {
    this.chapters.add(chaptersItem);
    this.unparsed |= chaptersItem.unparsed;
    return this;
  }

  /**
   * List of chapters breaking down the session into distinct activity segments.
   *
   * @return chapters
   */
  @JsonProperty(JSON_PROPERTY_CHAPTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ReplaySummaryChapter> getChapters() {
    return chapters;
  }

  public void setChapters(List<ReplaySummaryChapter> chapters) {
    this.chapters = chapters;
  }

  public ReplaySummaryDataAttributesResponse hasEnoughActivity(Boolean hasEnoughActivity) {
    this.hasEnoughActivity = hasEnoughActivity;
    return this;
  }

  /**
   * Whether the session contained sufficient user activity to generate a summary.
   *
   * @return hasEnoughActivity
   */
  @JsonProperty(JSON_PROPERTY_HAS_ENOUGH_ACTIVITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasEnoughActivity() {
    return hasEnoughActivity;
  }

  public void setHasEnoughActivity(Boolean hasEnoughActivity) {
    this.hasEnoughActivity = hasEnoughActivity;
  }

  public ReplaySummaryDataAttributesResponse hasTooManyEvents(Boolean hasTooManyEvents) {
    this.hasTooManyEvents = hasTooManyEvents;
    return this;
  }

  /**
   * Whether the session exceeded the event count limit for summary generation.
   *
   * @return hasTooManyEvents
   */
  @JsonProperty(JSON_PROPERTY_HAS_TOO_MANY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasTooManyEvents() {
    return hasTooManyEvents;
  }

  public void setHasTooManyEvents(Boolean hasTooManyEvents) {
    this.hasTooManyEvents = hasTooManyEvents;
  }

  public ReplaySummaryDataAttributesResponse summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * AI-generated summary of the replay session.
   *
   * @return summary
   */
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public ReplaySummaryDataAttributesResponse version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the prompt used to generate the summary.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
   * @return ReplaySummaryDataAttributesResponse
   */
  @JsonAnySetter
  public ReplaySummaryDataAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReplaySummaryDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaySummaryDataAttributesResponse replaySummaryDataAttributesResponse =
        (ReplaySummaryDataAttributesResponse) o;
    return Objects.equals(this.chapters, replaySummaryDataAttributesResponse.chapters)
        && Objects.equals(
            this.hasEnoughActivity, replaySummaryDataAttributesResponse.hasEnoughActivity)
        && Objects.equals(
            this.hasTooManyEvents, replaySummaryDataAttributesResponse.hasTooManyEvents)
        && Objects.equals(this.summary, replaySummaryDataAttributesResponse.summary)
        && Objects.equals(this.version, replaySummaryDataAttributesResponse.version)
        && Objects.equals(
            this.additionalProperties, replaySummaryDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        chapters, hasEnoughActivity, hasTooManyEvents, summary, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaySummaryDataAttributesResponse {\n");
    sb.append("    chapters: ").append(toIndentedString(chapters)).append("\n");
    sb.append("    hasEnoughActivity: ").append(toIndentedString(hasEnoughActivity)).append("\n");
    sb.append("    hasTooManyEvents: ").append(toIndentedString(hasTooManyEvents)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
