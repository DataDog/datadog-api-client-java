/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Pagination metadata for feature flags list responses. */
@JsonPropertyOrder({
  FeatureFlagsPaginationMetaPage.JSON_PROPERTY_FIRST_OFFSET,
  FeatureFlagsPaginationMetaPage.JSON_PROPERTY_LAST_OFFSET,
  FeatureFlagsPaginationMetaPage.JSON_PROPERTY_LIMIT,
  FeatureFlagsPaginationMetaPage.JSON_PROPERTY_NEXT_OFFSET,
  FeatureFlagsPaginationMetaPage.JSON_PROPERTY_OFFSET,
  FeatureFlagsPaginationMetaPage.JSON_PROPERTY_PREV_OFFSET,
  FeatureFlagsPaginationMetaPage.JSON_PROPERTY_TOTAL,
  FeatureFlagsPaginationMetaPage.JSON_PROPERTY_TOTAL_COUNT,
  FeatureFlagsPaginationMetaPage.JSON_PROPERTY_TOTAL_FILTERED_COUNT,
  FeatureFlagsPaginationMetaPage.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagsPaginationMetaPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST_OFFSET = "first_offset";
  private Long firstOffset;

  public static final String JSON_PROPERTY_LAST_OFFSET = "last_offset";
  private JsonNullable<Long> lastOffset = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_NEXT_OFFSET = "next_offset";
  private JsonNullable<Long> nextOffset = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Long offset;

  public static final String JSON_PROPERTY_PREV_OFFSET = "prev_offset";
  private JsonNullable<Long> prevOffset = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;

  public static final String JSON_PROPERTY_TOTAL_FILTERED_COUNT = "total_filtered_count";
  private Long totalFilteredCount;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public FeatureFlagsPaginationMetaPage firstOffset(Long firstOffset) {
    this.firstOffset = firstOffset;
    return this;
  }

  /**
   * Offset of the first page.
   *
   * @return firstOffset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFirstOffset() {
    return firstOffset;
  }

  public void setFirstOffset(Long firstOffset) {
    this.firstOffset = firstOffset;
  }

  public FeatureFlagsPaginationMetaPage lastOffset(Long lastOffset) {
    this.lastOffset = JsonNullable.<Long>of(lastOffset);
    return this;
  }

  /**
   * Offset of the last page.
   *
   * @return lastOffset
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getLastOffset() {
    return lastOffset.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLastOffset_JsonNullable() {
    return lastOffset;
  }

  @JsonProperty(JSON_PROPERTY_LAST_OFFSET)
  public void setLastOffset_JsonNullable(JsonNullable<Long> lastOffset) {
    this.lastOffset = lastOffset;
  }

  public void setLastOffset(Long lastOffset) {
    this.lastOffset = JsonNullable.<Long>of(lastOffset);
  }

  public FeatureFlagsPaginationMetaPage limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of flags returned on this page.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public FeatureFlagsPaginationMetaPage nextOffset(Long nextOffset) {
    this.nextOffset = JsonNullable.<Long>of(nextOffset);
    return this;
  }

  /**
   * Offset of the next page, or null when there is no next page.
   *
   * @return nextOffset
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getNextOffset() {
    return nextOffset.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getNextOffset_JsonNullable() {
    return nextOffset;
  }

  @JsonProperty(JSON_PROPERTY_NEXT_OFFSET)
  public void setNextOffset_JsonNullable(JsonNullable<Long> nextOffset) {
    this.nextOffset = nextOffset;
  }

  public void setNextOffset(Long nextOffset) {
    this.nextOffset = JsonNullable.<Long>of(nextOffset);
  }

  public FeatureFlagsPaginationMetaPage offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Number of matching flags skipped before this page.
   *
   * @return offset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public FeatureFlagsPaginationMetaPage prevOffset(Long prevOffset) {
    this.prevOffset = JsonNullable.<Long>of(prevOffset);
    return this;
  }

  /**
   * Offset of the previous page, or null when there is no previous page.
   *
   * @return prevOffset
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getPrevOffset() {
    return prevOffset.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREV_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getPrevOffset_JsonNullable() {
    return prevOffset;
  }

  @JsonProperty(JSON_PROPERTY_PREV_OFFSET)
  public void setPrevOffset_JsonNullable(JsonNullable<Long> prevOffset) {
    this.prevOffset = prevOffset;
  }

  public void setPrevOffset(Long prevOffset) {
    this.prevOffset = JsonNullable.<Long>of(prevOffset);
  }

  public FeatureFlagsPaginationMetaPage total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of flags matching the filters, independent of the page size.
   *
   * @return total
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public FeatureFlagsPaginationMetaPage totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Legacy count field. Use <code>total</code> for the number of matching flags.
   *
   * @return totalCount
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalCount() {
    return totalCount;
  }

  @Deprecated
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public FeatureFlagsPaginationMetaPage totalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
    return this;
  }

  /**
   * Legacy filtered count field. Use <code>total</code> for the number of matching flags.
   *
   * @return totalFilteredCount
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_FILTERED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalFilteredCount() {
    return totalFilteredCount;
  }

  @Deprecated
  public void setTotalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
  }

  public FeatureFlagsPaginationMetaPage type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The pagination method. Always <code>offset_limit</code>.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
   * @return FeatureFlagsPaginationMetaPage
   */
  @JsonAnySetter
  public FeatureFlagsPaginationMetaPage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagsPaginationMetaPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagsPaginationMetaPage featureFlagsPaginationMetaPage =
        (FeatureFlagsPaginationMetaPage) o;
    return Objects.equals(this.firstOffset, featureFlagsPaginationMetaPage.firstOffset)
        && Objects.equals(this.lastOffset, featureFlagsPaginationMetaPage.lastOffset)
        && Objects.equals(this.limit, featureFlagsPaginationMetaPage.limit)
        && Objects.equals(this.nextOffset, featureFlagsPaginationMetaPage.nextOffset)
        && Objects.equals(this.offset, featureFlagsPaginationMetaPage.offset)
        && Objects.equals(this.prevOffset, featureFlagsPaginationMetaPage.prevOffset)
        && Objects.equals(this.total, featureFlagsPaginationMetaPage.total)
        && Objects.equals(this.totalCount, featureFlagsPaginationMetaPage.totalCount)
        && Objects.equals(
            this.totalFilteredCount, featureFlagsPaginationMetaPage.totalFilteredCount)
        && Objects.equals(this.type, featureFlagsPaginationMetaPage.type)
        && Objects.equals(
            this.additionalProperties, featureFlagsPaginationMetaPage.additionalProperties);
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
        totalCount,
        totalFilteredCount,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagsPaginationMetaPage {\n");
    sb.append("    firstOffset: ").append(toIndentedString(firstOffset)).append("\n");
    sb.append("    lastOffset: ").append(toIndentedString(lastOffset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    prevOffset: ").append(toIndentedString(prevOffset)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalFilteredCount: ").append(toIndentedString(totalFilteredCount)).append("\n");
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
