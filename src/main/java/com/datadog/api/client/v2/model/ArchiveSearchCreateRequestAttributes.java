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

/** Attributes accepted when creating an Archive Search. */
@JsonPropertyOrder({
  ArchiveSearchCreateRequestAttributes.JSON_PROPERTY_ARCHIVE_ID,
  ArchiveSearchCreateRequestAttributes.JSON_PROPERTY_DESCRIPTION,
  ArchiveSearchCreateRequestAttributes.JSON_PROPERTY_FROM,
  ArchiveSearchCreateRequestAttributes.JSON_PROPERTY_NAME,
  ArchiveSearchCreateRequestAttributes.JSON_PROPERTY_QUERY,
  ArchiveSearchCreateRequestAttributes.JSON_PROPERTY_REHYDRATION,
  ArchiveSearchCreateRequestAttributes.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ArchiveSearchCreateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVE_ID = "archive_id";
  private String archiveId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FROM = "from";
  private OffsetDateTime from;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_REHYDRATION = "rehydration";
  private ArchiveSearchCreateRehydration rehydration;

  public static final String JSON_PROPERTY_TO = "to";
  private OffsetDateTime to;

  public ArchiveSearchCreateRequestAttributes() {}

  @JsonCreator
  public ArchiveSearchCreateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ARCHIVE_ID) String archiveId,
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) OffsetDateTime from,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) OffsetDateTime to) {
    this.archiveId = archiveId;
    this.from = from;
    this.name = name;
    this.query = query;
    this.to = to;
  }

  public ArchiveSearchCreateRequestAttributes archiveId(String archiveId) {
    this.archiveId = archiveId;
    return this;
  }

  /**
   * ID of the archive to search. Use the Logs Archives API to list the archives of the
   * organization.
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

  public ArchiveSearchCreateRequestAttributes description(String description) {
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

  public ArchiveSearchCreateRequestAttributes from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the time range to search, as an ISO 8601 timestamp.
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

  public ArchiveSearchCreateRequestAttributes name(String name) {
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

  public ArchiveSearchCreateRequestAttributes query(String query) {
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

  public ArchiveSearchCreateRequestAttributes rehydration(
      ArchiveSearchCreateRehydration rehydration) {
    this.rehydration = rehydration;
    this.unparsed |= rehydration.unparsed;
    return this;
  }

  /**
   * Rehydration settings. Include this object to index the matched logs into a retained historical
   * view. Omit it to run an Archive Search that only scans the archive.
   *
   * @return rehydration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REHYDRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ArchiveSearchCreateRehydration getRehydration() {
    return rehydration;
  }

  public void setRehydration(ArchiveSearchCreateRehydration rehydration) {
    this.rehydration = rehydration;
    if (rehydration != null) {
      this.unparsed |= rehydration.unparsed;
    }
  }

  public ArchiveSearchCreateRequestAttributes to(OffsetDateTime to) {
    this.to = to;
    return this;
  }

  /**
   * End of the time range to search, as an ISO 8601 timestamp. Must be after <code>from</code>.
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
   * @return ArchiveSearchCreateRequestAttributes
   */
  @JsonAnySetter
  public ArchiveSearchCreateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ArchiveSearchCreateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveSearchCreateRequestAttributes archiveSearchCreateRequestAttributes =
        (ArchiveSearchCreateRequestAttributes) o;
    return Objects.equals(this.archiveId, archiveSearchCreateRequestAttributes.archiveId)
        && Objects.equals(this.description, archiveSearchCreateRequestAttributes.description)
        && Objects.equals(this.from, archiveSearchCreateRequestAttributes.from)
        && Objects.equals(this.name, archiveSearchCreateRequestAttributes.name)
        && Objects.equals(this.query, archiveSearchCreateRequestAttributes.query)
        && Objects.equals(this.rehydration, archiveSearchCreateRequestAttributes.rehydration)
        && Objects.equals(this.to, archiveSearchCreateRequestAttributes.to)
        && Objects.equals(
            this.additionalProperties, archiveSearchCreateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        archiveId, description, from, name, query, rehydration, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveSearchCreateRequestAttributes {\n");
    sb.append("    archiveId: ").append(toIndentedString(archiveId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    rehydration: ").append(toIndentedString(rehydration)).append("\n");
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
