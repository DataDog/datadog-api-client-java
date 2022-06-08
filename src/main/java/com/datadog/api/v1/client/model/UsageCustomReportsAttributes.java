/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The response containing attributes for custom reports. */
@JsonPropertyOrder({
  UsageCustomReportsAttributes.JSON_PROPERTY_COMPUTED_ON,
  UsageCustomReportsAttributes.JSON_PROPERTY_END_DATE,
  UsageCustomReportsAttributes.JSON_PROPERTY_SIZE,
  UsageCustomReportsAttributes.JSON_PROPERTY_START_DATE,
  UsageCustomReportsAttributes.JSON_PROPERTY_TAGS
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageCustomReportsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTED_ON = "computed_on";
  private String computedOn;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private String endDate;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private String startDate;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public UsageCustomReportsAttributes computedOn(String computedOn) {
    this.computedOn = computedOn;
    return this;
  }

  /**
   * The date the specified custom report was computed.
   *
   * @return computedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getComputedOn() {
    return computedOn;
  }

  public void setComputedOn(String computedOn) {
    this.computedOn = computedOn;
  }

  public UsageCustomReportsAttributes endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The ending date of custom report.
   *
   * @return endDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public UsageCustomReportsAttributes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * size
   *
   * @return size
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public UsageCustomReportsAttributes startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The starting date of custom report.
   *
   * @return startDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public UsageCustomReportsAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UsageCustomReportsAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags to apply to custom reports.
   *
   * @return tags
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /** Return true if this UsageCustomReportsAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageCustomReportsAttributes usageCustomReportsAttributes = (UsageCustomReportsAttributes) o;
    return Objects.equals(this.computedOn, usageCustomReportsAttributes.computedOn)
        && Objects.equals(this.endDate, usageCustomReportsAttributes.endDate)
        && Objects.equals(this.size, usageCustomReportsAttributes.size)
        && Objects.equals(this.startDate, usageCustomReportsAttributes.startDate)
        && Objects.equals(this.tags, usageCustomReportsAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computedOn, endDate, size, startDate, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCustomReportsAttributes {\n");
    sb.append("    computedOn: ").append(toIndentedString(computedOn)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
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
