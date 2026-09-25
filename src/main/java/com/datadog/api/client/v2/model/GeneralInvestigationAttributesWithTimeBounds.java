/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Attributes for a general investigation with an explicit time window. */
@JsonPropertyOrder({
  GeneralInvestigationAttributesWithTimeBounds.JSON_PROPERTY_DESCRIPTION,
  GeneralInvestigationAttributesWithTimeBounds.JSON_PROPERTY_END_TIME,
  GeneralInvestigationAttributesWithTimeBounds.JSON_PROPERTY_START_TIME,
  GeneralInvestigationAttributesWithTimeBounds.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeneralInvestigationAttributesWithTimeBounds {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private Long endTime;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private Long startTime;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public GeneralInvestigationAttributesWithTimeBounds() {}

  @JsonCreator
  public GeneralInvestigationAttributesWithTimeBounds(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_END_TIME) Long endTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_START_TIME) Long startTime) {
    this.description = description;
    this.endTime = endTime;
    this.startTime = startTime;
  }

  public GeneralInvestigationAttributesWithTimeBounds description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A free-form description of what to investigate, up to 4,096 characters.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GeneralInvestigationAttributesWithTimeBounds endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The end of the investigation window, in Unix milliseconds.
   *
   * @return endTime
   */
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public GeneralInvestigationAttributesWithTimeBounds startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The start of the investigation window, in Unix milliseconds.
   *
   * @return startTime
   */
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public GeneralInvestigationAttributesWithTimeBounds tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GeneralInvestigationAttributesWithTimeBounds addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags that scope the investigation.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /** Return true if this GeneralInvestigationAttributesWithTimeBounds object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralInvestigationAttributesWithTimeBounds generalInvestigationAttributesWithTimeBounds =
        (GeneralInvestigationAttributesWithTimeBounds) o;
    return Objects.equals(
            this.description, generalInvestigationAttributesWithTimeBounds.description)
        && Objects.equals(this.endTime, generalInvestigationAttributesWithTimeBounds.endTime)
        && Objects.equals(this.startTime, generalInvestigationAttributesWithTimeBounds.startTime)
        && Objects.equals(this.tags, generalInvestigationAttributesWithTimeBounds.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, endTime, startTime, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralInvestigationAttributesWithTimeBounds {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
