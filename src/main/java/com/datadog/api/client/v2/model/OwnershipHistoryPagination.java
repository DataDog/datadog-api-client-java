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
import org.openapitools.jackson.nullable.JsonNullable;

/** Cursor-based pagination metadata for the history response. */
@JsonPropertyOrder({
  OwnershipHistoryPagination.JSON_PROPERTY_HAS_MORE,
  OwnershipHistoryPagination.JSON_PROPERTY_NEXT_CURSOR
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OwnershipHistoryPagination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HAS_MORE = "has_more";
  private Boolean hasMore;

  public static final String JSON_PROPERTY_NEXT_CURSOR = "next_cursor";
  private JsonNullable<String> nextCursor = JsonNullable.<String>undefined();

  public OwnershipHistoryPagination() {}

  @JsonCreator
  public OwnershipHistoryPagination(
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_MORE) Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public OwnershipHistoryPagination hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Whether more history entries are available beyond this page.
   *
   * @return hasMore
   */
  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public OwnershipHistoryPagination nextCursor(String nextCursor) {
    this.nextCursor = JsonNullable.<String>of(nextCursor);
    return this;
  }

  /**
   * An opaque, base64-encoded cursor token. Pass it as the <code>cursor</code> query parameter to
   * retrieve the next page. Absent or <code>null</code> when there are no further pages.
   *
   * @return nextCursor
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getNextCursor() {
    return nextCursor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getNextCursor_JsonNullable() {
    return nextCursor;
  }

  @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
  public void setNextCursor_JsonNullable(JsonNullable<String> nextCursor) {
    this.nextCursor = nextCursor;
  }

  public void setNextCursor(String nextCursor) {
    this.nextCursor = JsonNullable.<String>of(nextCursor);
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
   * @return OwnershipHistoryPagination
   */
  @JsonAnySetter
  public OwnershipHistoryPagination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OwnershipHistoryPagination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnershipHistoryPagination ownershipHistoryPagination = (OwnershipHistoryPagination) o;
    return Objects.equals(this.hasMore, ownershipHistoryPagination.hasMore)
        && Objects.equals(this.nextCursor, ownershipHistoryPagination.nextCursor)
        && Objects.equals(
            this.additionalProperties, ownershipHistoryPagination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, nextCursor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipHistoryPagination {\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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
