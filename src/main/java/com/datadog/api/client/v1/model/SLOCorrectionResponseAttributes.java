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
import java.util.UUID;
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
   * <p>The attribute object associated with the SLO correction.</p>
 */
@JsonPropertyOrder({
  SLOCorrectionResponseAttributes.JSON_PROPERTY_CATEGORY,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_CREATED_AT,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_CREATOR,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_DURATION,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_END,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_MODIFIED_AT,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_MODIFIER,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_RRULE,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_SLO_ID,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_START,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_TIMEZONE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOCorrectionResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private SLOCorrectionCategory category;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private JsonNullable<Long> createdAt = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private Creator creator;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private JsonNullable<Long> duration = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_END = "end";
  private JsonNullable<Long> end = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private JsonNullable<Long> modifiedAt = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MODIFIER = "modifier";
  private JsonNullable<SLOCorrectionResponseAttributesModifier> modifier = JsonNullable.<SLOCorrectionResponseAttributesModifier>undefined();

  public static final String JSON_PROPERTY_RRULE = "rrule";
  private JsonNullable<String> rrule = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SLO_ID = "slo_id";
  private String sloId;

  public static final String JSON_PROPERTY_START = "start";
  private Long start;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public SLOCorrectionResponseAttributes category(SLOCorrectionCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * <p>Category the SLO correction belongs to.</p>
   * @return category
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SLOCorrectionCategory getCategory() {
        return category;
      }
  public void setCategory(SLOCorrectionCategory category) {
    if (!category.isValid()) {
        this.unparsed = true;
    }
    this.category = category;
  }
  public SLOCorrectionResponseAttributes createdAt(Long createdAt) {
    this.createdAt = JsonNullable.<Long>of(createdAt);
    return this;
  }

  /**
   * <p>The epoch timestamp of when the correction was created at.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getCreatedAt() {
        return createdAt.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCreatedAt_JsonNullable() {
    return createdAt;
  }
  @JsonProperty(JSON_PROPERTY_CREATED_AT)public void setCreatedAt_JsonNullable(JsonNullable<Long> createdAt) {
    this.createdAt = createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = JsonNullable.<Long>of(createdAt);
  }

  /**
   * <p>Object describing the creator of the shared element.</p>
   * @return creator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Creator getCreator() {
        return creator;
      }
  public SLOCorrectionResponseAttributes description(String description) {
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
  public SLOCorrectionResponseAttributes duration(Long duration) {
    this.duration = JsonNullable.<Long>of(duration);
    return this;
  }

  /**
   * <p>Length of time (in seconds) for a specified <code>rrule</code> recurring SLO correction.</p>
   * @return duration
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getDuration() {
        return duration.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getDuration_JsonNullable() {
    return duration;
  }
  @JsonProperty(JSON_PROPERTY_DURATION)public void setDuration_JsonNullable(JsonNullable<Long> duration) {
    this.duration = duration;
  }
  public void setDuration(Long duration) {
    this.duration = JsonNullable.<Long>of(duration);
  }
  public SLOCorrectionResponseAttributes end(Long end) {
    this.end = JsonNullable.<Long>of(end);
    return this;
  }

  /**
   * <p>Ending time of the correction in epoch seconds.</p>
   * @return end
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getEnd() {
        return end.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getEnd_JsonNullable() {
    return end;
  }
  @JsonProperty(JSON_PROPERTY_END)public void setEnd_JsonNullable(JsonNullable<Long> end) {
    this.end = end;
  }
  public void setEnd(Long end) {
    this.end = JsonNullable.<Long>of(end);
  }
  public SLOCorrectionResponseAttributes modifiedAt(Long modifiedAt) {
    this.modifiedAt = JsonNullable.<Long>of(modifiedAt);
    return this;
  }

  /**
   * <p>The epoch timestamp of when the correction was modified at.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getModifiedAt() {
        return modifiedAt.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getModifiedAt_JsonNullable() {
    return modifiedAt;
  }
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)public void setModifiedAt_JsonNullable(JsonNullable<Long> modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  public void setModifiedAt(Long modifiedAt) {
    this.modifiedAt = JsonNullable.<Long>of(modifiedAt);
  }
  public SLOCorrectionResponseAttributes modifier(SLOCorrectionResponseAttributesModifier modifier) {
    this.modifier = JsonNullable.<SLOCorrectionResponseAttributesModifier>of(modifier);
    return this;
  }

  /**
   * <p>Modifier of the object.</p>
   * @return modifier
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public SLOCorrectionResponseAttributesModifier getModifier() {
        return modifier.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_MODIFIER)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<SLOCorrectionResponseAttributesModifier> getModifier_JsonNullable() {
    return modifier;
  }
  @JsonProperty(JSON_PROPERTY_MODIFIER)public void setModifier_JsonNullable(JsonNullable<SLOCorrectionResponseAttributesModifier> modifier) {
    this.modifier = modifier;
  }
  public void setModifier(SLOCorrectionResponseAttributesModifier modifier) {
    this.modifier = JsonNullable.<SLOCorrectionResponseAttributesModifier>of(modifier);
  }
  public SLOCorrectionResponseAttributes rrule(String rrule) {
    this.rrule = JsonNullable.<String>of(rrule);
    return this;
  }

  /**
   * <p>The recurrence rules as defined in the iCalendar RFC 5545. The supported rules for SLO corrections
   * are <code>FREQ</code>, <code>INTERVAL</code>, <code>COUNT</code>, <code>UNTIL</code> and <code>BYDAY</code>.</p>
   * @return rrule
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getRrule() {
        return rrule.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_RRULE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRrule_JsonNullable() {
    return rrule;
  }
  @JsonProperty(JSON_PROPERTY_RRULE)public void setRrule_JsonNullable(JsonNullable<String> rrule) {
    this.rrule = rrule;
  }
  public void setRrule(String rrule) {
    this.rrule = JsonNullable.<String>of(rrule);
  }
  public SLOCorrectionResponseAttributes sloId(String sloId) {
    this.sloId = sloId;
    return this;
  }

  /**
   * <p>ID of the SLO that this correction applies to.</p>
   * @return sloId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SLO_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSloId() {
        return sloId;
      }
  public void setSloId(String sloId) {
    this.sloId = sloId;
  }
  public SLOCorrectionResponseAttributes start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * <p>Starting time of the correction in epoch seconds.</p>
   * @return start
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getStart() {
        return start;
      }
  public void setStart(Long start) {
    this.start = start;
  }
  public SLOCorrectionResponseAttributes timezone(String timezone) {
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
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SLOCorrectionResponseAttributes
   */
  @JsonAnySetter
  public SLOCorrectionResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SLOCorrectionResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCorrectionResponseAttributes sloCorrectionResponseAttributes = (SLOCorrectionResponseAttributes) o;
    return Objects.equals(this.category, sloCorrectionResponseAttributes.category) && Objects.equals(this.createdAt, sloCorrectionResponseAttributes.createdAt) && Objects.equals(this.creator, sloCorrectionResponseAttributes.creator) && Objects.equals(this.description, sloCorrectionResponseAttributes.description) && Objects.equals(this.duration, sloCorrectionResponseAttributes.duration) && Objects.equals(this.end, sloCorrectionResponseAttributes.end) && Objects.equals(this.modifiedAt, sloCorrectionResponseAttributes.modifiedAt) && Objects.equals(this.modifier, sloCorrectionResponseAttributes.modifier) && Objects.equals(this.rrule, sloCorrectionResponseAttributes.rrule) && Objects.equals(this.sloId, sloCorrectionResponseAttributes.sloId) && Objects.equals(this.start, sloCorrectionResponseAttributes.start) && Objects.equals(this.timezone, sloCorrectionResponseAttributes.timezone) && Objects.equals(this.additionalProperties, sloCorrectionResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(category,createdAt,creator,description,duration,end,modifiedAt,modifier,rrule,sloId,start,timezone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCorrectionResponseAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    rrule: ").append(toIndentedString(rrule)).append("\n");
    sb.append("    sloId: ").append(toIndentedString(sloId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
