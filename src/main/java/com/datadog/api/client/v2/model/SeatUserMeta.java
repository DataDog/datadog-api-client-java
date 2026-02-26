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

/** */
@JsonPropertyOrder({
  SeatUserMeta.JSON_PROPERTY_CURSOR,
  SeatUserMeta.JSON_PROPERTY_LIMIT,
  SeatUserMeta.JSON_PROPERTY_NEXT_CURSOR
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SeatUserMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURSOR = "cursor";
  private String cursor;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_NEXT_CURSOR = "next_cursor";
  private String nextCursor;

  public SeatUserMeta cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * The cursor for the seat users.
   *
   * @return cursor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public SeatUserMeta limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The limit for the seat users.
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

  public SeatUserMeta nextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
  }

  /**
   * The next cursor for the seat users.
   *
   * @return nextCursor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNextCursor() {
    return nextCursor;
  }

  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
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
   * @return SeatUserMeta
   */
  @JsonAnySetter
  public SeatUserMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SeatUserMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatUserMeta seatUserMeta = (SeatUserMeta) o;
    return Objects.equals(this.cursor, seatUserMeta.cursor)
        && Objects.equals(this.limit, seatUserMeta.limit)
        && Objects.equals(this.nextCursor, seatUserMeta.nextCursor)
        && Objects.equals(this.additionalProperties, seatUserMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, limit, nextCursor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatUserMeta {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
