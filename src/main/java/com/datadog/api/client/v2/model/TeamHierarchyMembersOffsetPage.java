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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Pagination metadata using offset and limit. */
@JsonPropertyOrder({
  TeamHierarchyMembersOffsetPage.JSON_PROPERTY_FIRST_OFFSET,
  TeamHierarchyMembersOffsetPage.JSON_PROPERTY_LAST_OFFSET,
  TeamHierarchyMembersOffsetPage.JSON_PROPERTY_LIMIT,
  TeamHierarchyMembersOffsetPage.JSON_PROPERTY_NEXT_OFFSET,
  TeamHierarchyMembersOffsetPage.JSON_PROPERTY_OFFSET,
  TeamHierarchyMembersOffsetPage.JSON_PROPERTY_PREV_OFFSET,
  TeamHierarchyMembersOffsetPage.JSON_PROPERTY_TOTAL,
  TeamHierarchyMembersOffsetPage.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamHierarchyMembersOffsetPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST_OFFSET = "first_offset";
  private Long firstOffset;

  public static final String JSON_PROPERTY_LAST_OFFSET = "last_offset";
  private Long lastOffset;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_NEXT_OFFSET = "next_offset";
  private Long nextOffset;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Long offset;

  public static final String JSON_PROPERTY_PREV_OFFSET = "prev_offset";
  private Long prevOffset;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TeamHierarchyMembersOffsetPageType type = TeamHierarchyMembersOffsetPageType.OFFSET_LIMIT;

  public TeamHierarchyMembersOffsetPage() {}

  @JsonCreator
  public TeamHierarchyMembersOffsetPage(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIRST_OFFSET) Long firstOffset,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_OFFSET) Long lastOffset,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT) Long limit,
      @JsonProperty(required = true, value = JSON_PROPERTY_NEXT_OFFSET) Long nextOffset,
      @JsonProperty(required = true, value = JSON_PROPERTY_OFFSET) Long offset,
      @JsonProperty(required = true, value = JSON_PROPERTY_PREV_OFFSET) Long prevOffset,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL) Long total,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TeamHierarchyMembersOffsetPageType type) {
    this.firstOffset = firstOffset;
    this.lastOffset = lastOffset;
    if (lastOffset != null) {}
    this.limit = limit;
    this.nextOffset = nextOffset;
    if (nextOffset != null) {}
    this.offset = offset;
    this.prevOffset = prevOffset;
    if (prevOffset != null) {}
    this.total = total;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TeamHierarchyMembersOffsetPage firstOffset(Long firstOffset) {
    this.firstOffset = firstOffset;
    return this;
  }

  /**
   * First offset.
   *
   * @return firstOffset
   */
  @JsonProperty(JSON_PROPERTY_FIRST_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFirstOffset() {
    return firstOffset;
  }

  public void setFirstOffset(Long firstOffset) {
    this.firstOffset = firstOffset;
  }

  public TeamHierarchyMembersOffsetPage lastOffset(Long lastOffset) {
    this.lastOffset = lastOffset;
    if (lastOffset != null) {}
    return this;
  }

  /**
   * Last offset. Null when unavailable.
   *
   * @return lastOffset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLastOffset() {
    return lastOffset;
  }

  public void setLastOffset(Long lastOffset) {
    this.lastOffset = lastOffset;
  }

  public TeamHierarchyMembersOffsetPage limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of members per page.
   *
   * @return limit
   */
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public TeamHierarchyMembersOffsetPage nextOffset(Long nextOffset) {
    this.nextOffset = nextOffset;
    if (nextOffset != null) {}
    return this;
  }

  /**
   * Next offset. Null when unavailable.
   *
   * @return nextOffset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getNextOffset() {
    return nextOffset;
  }

  public void setNextOffset(Long nextOffset) {
    this.nextOffset = nextOffset;
  }

  public TeamHierarchyMembersOffsetPage offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Current offset.
   *
   * @return offset
   */
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public TeamHierarchyMembersOffsetPage prevOffset(Long prevOffset) {
    this.prevOffset = prevOffset;
    if (prevOffset != null) {}
    return this;
  }

  /**
   * Previous offset. Null when unavailable.
   *
   * @return prevOffset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREV_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPrevOffset() {
    return prevOffset;
  }

  public void setPrevOffset(Long prevOffset) {
    this.prevOffset = prevOffset;
  }

  public TeamHierarchyMembersOffsetPage total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of members matching the filters.
   *
   * @return total
   */
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public TeamHierarchyMembersOffsetPage type(TeamHierarchyMembersOffsetPageType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Pagination mode.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamHierarchyMembersOffsetPageType getType() {
    return type;
  }

  public void setType(TeamHierarchyMembersOffsetPageType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return TeamHierarchyMembersOffsetPage
   */
  @JsonAnySetter
  public TeamHierarchyMembersOffsetPage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamHierarchyMembersOffsetPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamHierarchyMembersOffsetPage teamHierarchyMembersOffsetPage =
        (TeamHierarchyMembersOffsetPage) o;
    return Objects.equals(this.firstOffset, teamHierarchyMembersOffsetPage.firstOffset)
        && Objects.equals(this.lastOffset, teamHierarchyMembersOffsetPage.lastOffset)
        && Objects.equals(this.limit, teamHierarchyMembersOffsetPage.limit)
        && Objects.equals(this.nextOffset, teamHierarchyMembersOffsetPage.nextOffset)
        && Objects.equals(this.offset, teamHierarchyMembersOffsetPage.offset)
        && Objects.equals(this.prevOffset, teamHierarchyMembersOffsetPage.prevOffset)
        && Objects.equals(this.total, teamHierarchyMembersOffsetPage.total)
        && Objects.equals(this.type, teamHierarchyMembersOffsetPage.type)
        && Objects.equals(
            this.additionalProperties, teamHierarchyMembersOffsetPage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        firstOffset,
        lastOffset,
        limit,
        nextOffset,
        offset,
        prevOffset,
        total,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamHierarchyMembersOffsetPage {\n");
    sb.append("    firstOffset: ").append(toIndentedString(firstOffset)).append("\n");
    sb.append("    lastOffset: ").append(toIndentedString(lastOffset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    prevOffset: ").append(toIndentedString(prevOffset)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
