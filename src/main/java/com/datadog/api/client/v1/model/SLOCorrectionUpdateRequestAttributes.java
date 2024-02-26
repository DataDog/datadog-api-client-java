/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The attribute object associated with the SLO correction to be updated. */
@JsonPropertyOrder({
  SLOCorrectionUpdateRequestAttributes.JSON_PROPERTY_CATEGORY,
  SLOCorrectionUpdateRequestAttributes.JSON_PROPERTY_DESCRIPTION,
  SLOCorrectionUpdateRequestAttributes.JSON_PROPERTY_DURATION,
  SLOCorrectionUpdateRequestAttributes.JSON_PROPERTY_END,
  SLOCorrectionUpdateRequestAttributes.JSON_PROPERTY_RRULE,
  SLOCorrectionUpdateRequestAttributes.JSON_PROPERTY_START,
  SLOCorrectionUpdateRequestAttributes.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOCorrectionUpdateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private SLOCorrectionCategory category;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_END = "end";
  private Long end;

  public static final String JSON_PROPERTY_RRULE = "rrule";
  private String rrule;

  public static final String JSON_PROPERTY_START = "start";
  private Long start;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public SLOCorrectionUpdateRequestAttributes category(SLOCorrectionCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * Category the SLO correction belongs to.
   *
   * @return category
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOCorrectionCategory getCategory() {
    return category;
  }

  public void setCategory(SLOCorrectionCategory category) {
    if (!category.isValid()) {
      this.unparsed = true;
    }
    this.category = category;
  }

  public SLOCorrectionUpdateRequestAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the correction being made.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SLOCorrectionUpdateRequestAttributes duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Length of time (in seconds) for a specified <code>rrule</code> recurring SLO correction.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public SLOCorrectionUpdateRequestAttributes end(Long end) {
    this.end = end;
    return this;
  }

  /**
   * Ending time of the correction in epoch seconds.
   *
   * @return end
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

  public SLOCorrectionUpdateRequestAttributes rrule(String rrule) {
    this.rrule = rrule;
    return this;
  }

  /**
   * The recurrence rules as defined in the iCalendar RFC 5545. The supported rules for SLO
   * corrections are <code>FREQ</code>, <code>INTERVAL</code>, <code>COUNT</code>, <code>UNTIL
   * </code> and <code>BYDAY</code>.
   *
   * @return rrule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RRULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRrule() {
    return rrule;
  }

  public void setRrule(String rrule) {
    this.rrule = rrule;
  }

  public SLOCorrectionUpdateRequestAttributes start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * Starting time of the correction in epoch seconds.
   *
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public SLOCorrectionUpdateRequestAttributes timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezone to display in the UI for the correction times (defaults to "UTC").
   *
   * @return timezone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
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
   * @return SLOCorrectionUpdateRequestAttributes
   */
  @JsonAnySetter
  public SLOCorrectionUpdateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SLOCorrectionUpdateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCorrectionUpdateRequestAttributes sloCorrectionUpdateRequestAttributes =
        (SLOCorrectionUpdateRequestAttributes) o;
    return Objects.equals(this.category, sloCorrectionUpdateRequestAttributes.category)
        && Objects.equals(this.description, sloCorrectionUpdateRequestAttributes.description)
        && Objects.equals(this.duration, sloCorrectionUpdateRequestAttributes.duration)
        && Objects.equals(this.end, sloCorrectionUpdateRequestAttributes.end)
        && Objects.equals(this.rrule, sloCorrectionUpdateRequestAttributes.rrule)
        && Objects.equals(this.start, sloCorrectionUpdateRequestAttributes.start)
        && Objects.equals(this.timezone, sloCorrectionUpdateRequestAttributes.timezone)
        && Objects.equals(
            this.additionalProperties, sloCorrectionUpdateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category, description, duration, end, rrule, start, timezone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCorrectionUpdateRequestAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
