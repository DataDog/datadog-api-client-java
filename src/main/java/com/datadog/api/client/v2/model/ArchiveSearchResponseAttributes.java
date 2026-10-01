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

/** Attributes of an Archive Search. */
@JsonPropertyOrder({
  ArchiveSearchResponseAttributes.JSON_PROPERTY_ARCHIVE_ID,
  ArchiveSearchResponseAttributes.JSON_PROPERTY_BYTES_SCANNED,
  ArchiveSearchResponseAttributes.JSON_PROPERTY_COMPLETED_AT,
  ArchiveSearchResponseAttributes.JSON_PROPERTY_CREATED_AT,
  ArchiveSearchResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  ArchiveSearchResponseAttributes.JSON_PROPERTY_EVENTS_SCANNED,
  ArchiveSearchResponseAttributes.JSON_PROPERTY_EXPECTED_DURATION,
  ArchiveSearchResponseAttributes.JSON_PROPERTY_FROM,
  ArchiveSearchResponseAttributes.JSON_PROPERTY_NAME,
  ArchiveSearchResponseAttributes.JSON_PROPERTY_QUERY,
  ArchiveSearchResponseAttributes.JSON_PROPERTY_REHYDRATION,
  ArchiveSearchResponseAttributes.JSON_PROPERTY_STATUS,
  ArchiveSearchResponseAttributes.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ArchiveSearchResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVE_ID = "archive_id";
  private String archiveId;

  public static final String JSON_PROPERTY_BYTES_SCANNED = "bytes_scanned";
  private Long bytesScanned;

  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  private OffsetDateTime completedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EVENTS_SCANNED = "events_scanned";
  private Long eventsScanned;

  public static final String JSON_PROPERTY_EXPECTED_DURATION = "expected_duration";
  private Long expectedDuration;

  public static final String JSON_PROPERTY_FROM = "from";
  private OffsetDateTime from;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_REHYDRATION = "rehydration";
  private ArchiveSearchRehydration rehydration;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ArchiveSearchStatus status;

  public static final String JSON_PROPERTY_TO = "to";
  private OffsetDateTime to;

  public ArchiveSearchResponseAttributes() {}

  @JsonCreator
  public ArchiveSearchResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ARCHIVE_ID) String archiveId,
      @JsonProperty(required = true, value = JSON_PROPERTY_BYTES_SCANNED) Long bytesScanned,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENTS_SCANNED) Long eventsScanned,
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) OffsetDateTime from,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) ArchiveSearchStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) OffsetDateTime to) {
    this.archiveId = archiveId;
    this.bytesScanned = bytesScanned;
    this.createdAt = createdAt;
    this.eventsScanned = eventsScanned;
    this.from = from;
    this.name = name;
    this.query = query;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.to = to;
  }

  public ArchiveSearchResponseAttributes archiveId(String archiveId) {
    this.archiveId = archiveId;
    return this;
  }

  /**
   * ID of the archive being searched.
   *
   * @return archiveId
   */
  @JsonProperty(JSON_PROPERTY_ARCHIVE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getArchiveId() {
    return archiveId;
  }

  public void setArchiveId(String archiveId) {
    this.archiveId = archiveId;
  }

  public ArchiveSearchResponseAttributes bytesScanned(Long bytesScanned) {
    this.bytesScanned = bytesScanned;
    return this;
  }

  /**
   * Number of bytes read from the archive at the end of the search.
   *
   * @return bytesScanned
   */
  @JsonProperty(JSON_PROPERTY_BYTES_SCANNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getBytesScanned() {
    return bytesScanned;
  }

  public void setBytesScanned(Long bytesScanned) {
    this.bytesScanned = bytesScanned;
  }

  public ArchiveSearchResponseAttributes completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Time the Archive Search finished, as an ISO 8601 timestamp. Absent while the search is still
   * running.
   *
   * @return completedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public ArchiveSearchResponseAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time the Archive Search was created, as an ISO 8601 timestamp.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ArchiveSearchResponseAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Free-text description of the Archive Search.
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

  public ArchiveSearchResponseAttributes eventsScanned(Long eventsScanned) {
    this.eventsScanned = eventsScanned;
    return this;
  }

  /**
   * Number of events read from the archive at the end of the search.
   *
   * @return eventsScanned
   */
  @JsonProperty(JSON_PROPERTY_EVENTS_SCANNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getEventsScanned() {
    return eventsScanned;
  }

  public void setEventsScanned(Long eventsScanned) {
    this.eventsScanned = eventsScanned;
  }

  public ArchiveSearchResponseAttributes expectedDuration(Long expectedDuration) {
    this.expectedDuration = expectedDuration;
    return this;
  }

  /**
   * Estimated time left before the Archive Search completes, in seconds.
   *
   * @return expectedDuration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPECTED_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExpectedDuration() {
    return expectedDuration;
  }

  public void setExpectedDuration(Long expectedDuration) {
    this.expectedDuration = expectedDuration;
  }

  public ArchiveSearchResponseAttributes from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the searched time range, as an ISO 8601 timestamp.
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getFrom() {
    return from;
  }

  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }

  public ArchiveSearchResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Archive Search.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArchiveSearchResponseAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Log search query used to filter the archived logs.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ArchiveSearchResponseAttributes rehydration(ArchiveSearchRehydration rehydration) {
    this.rehydration = rehydration;
    this.unparsed |= rehydration.unparsed;
    return this;
  }

  /**
   * Rehydration settings of the Archive Search. Absent when the search only scans the archive
   * without indexing the results.
   *
   * @return rehydration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REHYDRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ArchiveSearchRehydration getRehydration() {
    return rehydration;
  }

  public void setRehydration(ArchiveSearchRehydration rehydration) {
    this.rehydration = rehydration;
    if (rehydration != null) {
      this.unparsed |= rehydration.unparsed;
    }
  }

  public ArchiveSearchResponseAttributes status(ArchiveSearchStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Current state of an Archive Search.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ArchiveSearchStatus getStatus() {
    return status;
  }

  public void setStatus(ArchiveSearchStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public ArchiveSearchResponseAttributes to(OffsetDateTime to) {
    this.to = to;
    return this;
  }

  /**
   * End of the searched time range, as an ISO 8601 timestamp.
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getTo() {
    return to;
  }

  public void setTo(OffsetDateTime to) {
    this.to = to;
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
   * @return ArchiveSearchResponseAttributes
   */
  @JsonAnySetter
  public ArchiveSearchResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ArchiveSearchResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveSearchResponseAttributes archiveSearchResponseAttributes =
        (ArchiveSearchResponseAttributes) o;
    return Objects.equals(this.archiveId, archiveSearchResponseAttributes.archiveId)
        && Objects.equals(this.bytesScanned, archiveSearchResponseAttributes.bytesScanned)
        && Objects.equals(this.completedAt, archiveSearchResponseAttributes.completedAt)
        && Objects.equals(this.createdAt, archiveSearchResponseAttributes.createdAt)
        && Objects.equals(this.description, archiveSearchResponseAttributes.description)
        && Objects.equals(this.eventsScanned, archiveSearchResponseAttributes.eventsScanned)
        && Objects.equals(this.expectedDuration, archiveSearchResponseAttributes.expectedDuration)
        && Objects.equals(this.from, archiveSearchResponseAttributes.from)
        && Objects.equals(this.name, archiveSearchResponseAttributes.name)
        && Objects.equals(this.query, archiveSearchResponseAttributes.query)
        && Objects.equals(this.rehydration, archiveSearchResponseAttributes.rehydration)
        && Objects.equals(this.status, archiveSearchResponseAttributes.status)
        && Objects.equals(this.to, archiveSearchResponseAttributes.to)
        && Objects.equals(
            this.additionalProperties, archiveSearchResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        archiveId,
        bytesScanned,
        completedAt,
        createdAt,
        description,
        eventsScanned,
        expectedDuration,
        from,
        name,
        query,
        rehydration,
        status,
        to,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveSearchResponseAttributes {\n");
    sb.append("    archiveId: ").append(toIndentedString(archiveId)).append("\n");
    sb.append("    bytesScanned: ").append(toIndentedString(bytesScanned)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventsScanned: ").append(toIndentedString(eventsScanned)).append("\n");
    sb.append("    expectedDuration: ").append(toIndentedString(expectedDuration)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    rehydration: ").append(toIndentedString(rehydration)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
