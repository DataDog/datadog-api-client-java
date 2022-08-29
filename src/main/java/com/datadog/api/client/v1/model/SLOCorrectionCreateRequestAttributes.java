/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The attribute object associated with the SLO correction to be created.</p>
 */
@JsonPropertyOrder({
  SLOCorrectionCreateRequestAttributes.JSON_PROPERTY_CATEGORY,
  SLOCorrectionCreateRequestAttributes.JSON_PROPERTY_DESCRIPTION,
  SLOCorrectionCreateRequestAttributes.JSON_PROPERTY_DURATION,
  SLOCorrectionCreateRequestAttributes.JSON_PROPERTY_END,
  SLOCorrectionCreateRequestAttributes.JSON_PROPERTY_RRULE,
  SLOCorrectionCreateRequestAttributes.JSON_PROPERTY_SLO_ID,
  SLOCorrectionCreateRequestAttributes.JSON_PROPERTY_START,
  SLOCorrectionCreateRequestAttributes.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOCorrectionCreateRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
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

  public static final String JSON_PROPERTY_SLO_ID = "slo_id";
  private String sloId;

  public static final String JSON_PROPERTY_START = "start";
  private Long start;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public SLOCorrectionCreateRequestAttributes() {}

  @JsonCreator
  public SLOCorrectionCreateRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CATEGORY)SLOCorrectionCategory category,
            @JsonProperty(required=true, value=JSON_PROPERTY_SLO_ID)String sloId,
            @JsonProperty(required=true, value=JSON_PROPERTY_START)Long start) {
        this.category = category;
        this.unparsed |= !category.isValid();
        this.sloId = sloId;
        this.start = start;
  }
  public SLOCorrectionCreateRequestAttributes category(SLOCorrectionCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * <p>Category the SLO correction belongs to.</p>
   * @return category
  **/
      @JsonProperty(JSON_PROPERTY_CATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SLOCorrectionCategory getCategory() {
        return category;
      }
  public void setCategory(SLOCorrectionCategory category) {
    if (!category.isValid()) {
        this.unparsed = true;
    }
    this.category = category;
  }
  public SLOCorrectionCreateRequestAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Description of the correction being made.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public SLOCorrectionCreateRequestAttributes duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * <p>Length of time (in seconds) for a specified <code>rrule</code> recurring SLO correction.</p>
   * @return duration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getDuration() {
        return duration;
      }
  public void setDuration(Long duration) {
    this.duration = duration;
  }
  public SLOCorrectionCreateRequestAttributes end(Long end) {
    this.end = end;
    return this;
  }

  /**
   * <p>Ending time of the correction in epoch seconds.</p>
   * @return end
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_END)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getEnd() {
        return end;
      }
  public void setEnd(Long end) {
    this.end = end;
  }
  public SLOCorrectionCreateRequestAttributes rrule(String rrule) {
    this.rrule = rrule;
    return this;
  }

  /**
   * <p>The recurrence rules as defined in the iCalendar RFC 5545. The supported rules for SLO corrections
   * are <code>FREQ</code>, <code>INTERVAL</code>, <code>COUNT</code> and <code>UNTIL</code>.</p>
   * @return rrule
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RRULE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRrule() {
        return rrule;
      }
  public void setRrule(String rrule) {
    this.rrule = rrule;
  }
  public SLOCorrectionCreateRequestAttributes sloId(String sloId) {
    this.sloId = sloId;
    return this;
  }

  /**
   * <p>ID of the SLO that this correction applies to.</p>
   * @return sloId
  **/
      @JsonProperty(JSON_PROPERTY_SLO_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getSloId() {
        return sloId;
      }
  public void setSloId(String sloId) {
    this.sloId = sloId;
  }
  public SLOCorrectionCreateRequestAttributes start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * <p>Starting time of the correction in epoch seconds.</p>
   * @return start
  **/
      @JsonProperty(JSON_PROPERTY_START)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getStart() {
        return start;
      }
  public void setStart(Long start) {
    this.start = start;
  }
  public SLOCorrectionCreateRequestAttributes timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * <p>The timezone to display in the UI for the correction times (defaults to "UTC").</p>
   * @return timezone
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMEZONE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTimezone() {
        return timezone;
      }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   * Return true if this SLOCorrectionCreateRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCorrectionCreateRequestAttributes sloCorrectionCreateRequestAttributes = (SLOCorrectionCreateRequestAttributes) o;
    return Objects.equals(this.category, sloCorrectionCreateRequestAttributes.category) && Objects.equals(this.description, sloCorrectionCreateRequestAttributes.description) && Objects.equals(this.duration, sloCorrectionCreateRequestAttributes.duration) && Objects.equals(this.end, sloCorrectionCreateRequestAttributes.end) && Objects.equals(this.rrule, sloCorrectionCreateRequestAttributes.rrule) && Objects.equals(this.sloId, sloCorrectionCreateRequestAttributes.sloId) && Objects.equals(this.start, sloCorrectionCreateRequestAttributes.start) && Objects.equals(this.timezone, sloCorrectionCreateRequestAttributes.timezone);
  }


  @Override
  public int hashCode() {
    return Objects.hash(category,description,duration,end,rrule,sloId,start,timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCorrectionCreateRequestAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    sloId: ").append(toIndentedString(sloId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
