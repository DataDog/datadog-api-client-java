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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a timeline entry. */
@JsonPropertyOrder({
  IncidentTimelineEntryDataAttributesResponse.JSON_PROPERTY_CELL_TYPE,
  IncidentTimelineEntryDataAttributesResponse.JSON_PROPERTY_CONTENT,
  IncidentTimelineEntryDataAttributesResponse.JSON_PROPERTY_CREATED,
  IncidentTimelineEntryDataAttributesResponse.JSON_PROPERTY_DISPLAY_TIME,
  IncidentTimelineEntryDataAttributesResponse.JSON_PROPERTY_IMPORTANT,
  IncidentTimelineEntryDataAttributesResponse.JSON_PROPERTY_INCIDENT_ID,
  IncidentTimelineEntryDataAttributesResponse.JSON_PROPERTY_MODIFIED,
  IncidentTimelineEntryDataAttributesResponse.JSON_PROPERTY_PARENT_UUID,
  IncidentTimelineEntryDataAttributesResponse.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTimelineEntryDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CELL_TYPE = "cell_type";
  private IncidentTimelineCellType cellType;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private IncidentTimelineEntryContent content;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_DISPLAY_TIME = "display_time";
  private OffsetDateTime displayTime;

  public static final String JSON_PROPERTY_IMPORTANT = "important";
  private Boolean important;

  public static final String JSON_PROPERTY_INCIDENT_ID = "incident_id";
  private String incidentId;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_PARENT_UUID = "parent_uuid";
  private JsonNullable<String> parentUuid = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE = "source";
  private IncidentTimelineCellSource source;

  public IncidentTimelineEntryDataAttributesResponse() {}

  @JsonCreator
  public IncidentTimelineEntryDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CELL_TYPE)
          IncidentTimelineCellType cellType,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT)
          IncidentTimelineEntryContent content,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_TIME) OffsetDateTime displayTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_IMPORTANT) Boolean important,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCIDENT_ID) String incidentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED) OffsetDateTime modified,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          IncidentTimelineCellSource source) {
    this.cellType = cellType;
    this.unparsed |= !cellType.isValid();
    this.content = content;
    this.unparsed |= content.unparsed;
    this.created = created;
    this.displayTime = displayTime;
    this.important = important;
    this.incidentId = incidentId;
    this.modified = modified;
    this.source = source;
    this.unparsed |= !source.isValid();
  }

  public IncidentTimelineEntryDataAttributesResponse cellType(IncidentTimelineCellType cellType) {
    this.cellType = cellType;
    this.unparsed |= !cellType.isValid();
    return this;
  }

  /**
   * The type of a timeline cell.
   *
   * @return cellType
   */
  @JsonProperty(JSON_PROPERTY_CELL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTimelineCellType getCellType() {
    return cellType;
  }

  public void setCellType(IncidentTimelineCellType cellType) {
    if (!cellType.isValid()) {
      this.unparsed = true;
    }
    this.cellType = cellType;
  }

  public IncidentTimelineEntryDataAttributesResponse content(IncidentTimelineEntryContent content) {
    this.content = content;
    this.unparsed |= content.unparsed;
    return this;
  }

  /**
   * The content of a timeline entry.
   *
   * @return content
   */
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTimelineEntryContent getContent() {
    return content;
  }

  public void setContent(IncidentTimelineEntryContent content) {
    this.content = content;
  }

  public IncidentTimelineEntryDataAttributesResponse created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Timestamp when the entry was created.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public IncidentTimelineEntryDataAttributesResponse displayTime(OffsetDateTime displayTime) {
    this.displayTime = displayTime;
    return this;
  }

  /**
   * The display time for this timeline entry.
   *
   * @return displayTime
   */
  @JsonProperty(JSON_PROPERTY_DISPLAY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getDisplayTime() {
    return displayTime;
  }

  public void setDisplayTime(OffsetDateTime displayTime) {
    this.displayTime = displayTime;
  }

  public IncidentTimelineEntryDataAttributesResponse important(Boolean important) {
    this.important = important;
    return this;
  }

  /**
   * Whether this timeline entry is marked as important.
   *
   * @return important
   */
  @JsonProperty(JSON_PROPERTY_IMPORTANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getImportant() {
    return important;
  }

  public void setImportant(Boolean important) {
    this.important = important;
  }

  public IncidentTimelineEntryDataAttributesResponse incidentId(String incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * The incident identifier.
   *
   * @return incidentId
   */
  @JsonProperty(JSON_PROPERTY_INCIDENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(String incidentId) {
    this.incidentId = incidentId;
  }

  public IncidentTimelineEntryDataAttributesResponse modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Timestamp when the entry was last modified.
   *
   * @return modified
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public IncidentTimelineEntryDataAttributesResponse parentUuid(String parentUuid) {
    this.parentUuid = JsonNullable.<String>of(parentUuid);
    return this;
  }

  /**
   * UUID of the parent timeline entry.
   *
   * @return parentUuid
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getParentUuid() {
    return parentUuid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getParentUuid_JsonNullable() {
    return parentUuid;
  }

  @JsonProperty(JSON_PROPERTY_PARENT_UUID)
  public void setParentUuid_JsonNullable(JsonNullable<String> parentUuid) {
    this.parentUuid = parentUuid;
  }

  public void setParentUuid(String parentUuid) {
    this.parentUuid = JsonNullable.<String>of(parentUuid);
  }

  public IncidentTimelineEntryDataAttributesResponse source(IncidentTimelineCellSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * The source of a timeline cell.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTimelineCellSource getSource() {
    return source;
  }

  public void setSource(IncidentTimelineCellSource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
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
   * @return IncidentTimelineEntryDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentTimelineEntryDataAttributesResponse putAdditionalProperty(
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

  /** Return true if this IncidentTimelineEntryDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTimelineEntryDataAttributesResponse incidentTimelineEntryDataAttributesResponse =
        (IncidentTimelineEntryDataAttributesResponse) o;
    return Objects.equals(this.cellType, incidentTimelineEntryDataAttributesResponse.cellType)
        && Objects.equals(this.content, incidentTimelineEntryDataAttributesResponse.content)
        && Objects.equals(this.created, incidentTimelineEntryDataAttributesResponse.created)
        && Objects.equals(this.displayTime, incidentTimelineEntryDataAttributesResponse.displayTime)
        && Objects.equals(this.important, incidentTimelineEntryDataAttributesResponse.important)
        && Objects.equals(this.incidentId, incidentTimelineEntryDataAttributesResponse.incidentId)
        && Objects.equals(this.modified, incidentTimelineEntryDataAttributesResponse.modified)
        && Objects.equals(this.parentUuid, incidentTimelineEntryDataAttributesResponse.parentUuid)
        && Objects.equals(this.source, incidentTimelineEntryDataAttributesResponse.source)
        && Objects.equals(
            this.additionalProperties,
            incidentTimelineEntryDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cellType,
        content,
        created,
        displayTime,
        important,
        incidentId,
        modified,
        parentUuid,
        source,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTimelineEntryDataAttributesResponse {\n");
    sb.append("    cellType: ").append(toIndentedString(cellType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    displayTime: ").append(toIndentedString(displayTime)).append("\n");
    sb.append("    important: ").append(toIndentedString(important)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    parentUuid: ").append(toIndentedString(parentUuid)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
