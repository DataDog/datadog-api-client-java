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

/** Teams response metadata. */
@JsonPropertyOrder({
  TeamsResponseMetaPagination.JSON_PROPERTY_FIRST_NUMBER,
  TeamsResponseMetaPagination.JSON_PROPERTY_FIRST_OFFSET,
  TeamsResponseMetaPagination.JSON_PROPERTY_LAST_NUMBER,
  TeamsResponseMetaPagination.JSON_PROPERTY_LAST_OFFSET,
  TeamsResponseMetaPagination.JSON_PROPERTY_LIMIT,
  TeamsResponseMetaPagination.JSON_PROPERTY_NEXT_NUMBER,
  TeamsResponseMetaPagination.JSON_PROPERTY_NEXT_OFFSET,
  TeamsResponseMetaPagination.JSON_PROPERTY_NUMBER,
  TeamsResponseMetaPagination.JSON_PROPERTY_OFFSET,
  TeamsResponseMetaPagination.JSON_PROPERTY_PREV_NUMBER,
  TeamsResponseMetaPagination.JSON_PROPERTY_PREV_OFFSET,
  TeamsResponseMetaPagination.JSON_PROPERTY_SIZE,
  TeamsResponseMetaPagination.JSON_PROPERTY_TOTAL,
  TeamsResponseMetaPagination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamsResponseMetaPagination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST_NUMBER = "first_number";
  private Long firstNumber;

  public static final String JSON_PROPERTY_FIRST_OFFSET = "first_offset";
  private Long firstOffset;

  public static final String JSON_PROPERTY_LAST_NUMBER = "last_number";
  private JsonNullable<Long> lastNumber = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_LAST_OFFSET = "last_offset";
  private Long lastOffset;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_NEXT_NUMBER = "next_number";
  private JsonNullable<Long> nextNumber = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_NEXT_OFFSET = "next_offset";
  private Long nextOffset;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private Long number;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Long offset;

  public static final String JSON_PROPERTY_PREV_NUMBER = "prev_number";
  private JsonNullable<Long> prevNumber = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_PREV_OFFSET = "prev_offset";
  private Long prevOffset;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public TeamsResponseMetaPagination firstNumber(Long firstNumber) {
    this.firstNumber = firstNumber;
    return this;
  }

  /**
   * The first page number.
   *
   * @return firstNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFirstNumber() {
    return firstNumber;
  }

  public void setFirstNumber(Long firstNumber) {
    this.firstNumber = firstNumber;
  }

  public TeamsResponseMetaPagination firstOffset(Long firstOffset) {
    this.firstOffset = firstOffset;
    return this;
  }

  /**
   * The first offset.
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

  public TeamsResponseMetaPagination lastNumber(Long lastNumber) {
    this.lastNumber = JsonNullable.<Long>of(lastNumber);
    return this;
  }

  /**
   * The last page number.
   *
   * @return lastNumber
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getLastNumber() {
    return lastNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLastNumber_JsonNullable() {
    return lastNumber;
  }

  @JsonProperty(JSON_PROPERTY_LAST_NUMBER)
  public void setLastNumber_JsonNullable(JsonNullable<Long> lastNumber) {
    this.lastNumber = lastNumber;
  }

  public void setLastNumber(Long lastNumber) {
    this.lastNumber = JsonNullable.<Long>of(lastNumber);
  }

  public TeamsResponseMetaPagination lastOffset(Long lastOffset) {
    this.lastOffset = lastOffset;
    return this;
  }

  /**
   * The last offset.
   *
   * @return lastOffset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastOffset() {
    return lastOffset;
  }

  public void setLastOffset(Long lastOffset) {
    this.lastOffset = lastOffset;
  }

  public TeamsResponseMetaPagination limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Pagination limit.
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

  public TeamsResponseMetaPagination nextNumber(Long nextNumber) {
    this.nextNumber = JsonNullable.<Long>of(nextNumber);
    return this;
  }

  /**
   * The next page number.
   *
   * @return nextNumber
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getNextNumber() {
    return nextNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getNextNumber_JsonNullable() {
    return nextNumber;
  }

  @JsonProperty(JSON_PROPERTY_NEXT_NUMBER)
  public void setNextNumber_JsonNullable(JsonNullable<Long> nextNumber) {
    this.nextNumber = nextNumber;
  }

  public void setNextNumber(Long nextNumber) {
    this.nextNumber = JsonNullable.<Long>of(nextNumber);
  }

  public TeamsResponseMetaPagination nextOffset(Long nextOffset) {
    this.nextOffset = nextOffset;
    return this;
  }

  /**
   * The next offset.
   *
   * @return nextOffset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNextOffset() {
    return nextOffset;
  }

  public void setNextOffset(Long nextOffset) {
    this.nextOffset = nextOffset;
  }

  public TeamsResponseMetaPagination number(Long number) {
    this.number = number;
    return this;
  }

  /**
   * The current page number, when page-number pagination is used.
   *
   * @return number
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public TeamsResponseMetaPagination offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The offset.
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

  public TeamsResponseMetaPagination prevNumber(Long prevNumber) {
    this.prevNumber = JsonNullable.<Long>of(prevNumber);
    return this;
  }

  /**
   * The previous page number.
   *
   * @return prevNumber
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getPrevNumber() {
    return prevNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREV_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getPrevNumber_JsonNullable() {
    return prevNumber;
  }

  @JsonProperty(JSON_PROPERTY_PREV_NUMBER)
  public void setPrevNumber_JsonNullable(JsonNullable<Long> prevNumber) {
    this.prevNumber = prevNumber;
  }

  public void setPrevNumber(Long prevNumber) {
    this.prevNumber = JsonNullable.<Long>of(prevNumber);
  }

  public TeamsResponseMetaPagination prevOffset(Long prevOffset) {
    this.prevOffset = prevOffset;
    return this;
  }

  /**
   * The previous offset.
   *
   * @return prevOffset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREV_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPrevOffset() {
    return prevOffset;
  }

  public void setPrevOffset(Long prevOffset) {
    this.prevOffset = prevOffset;
  }

  public TeamsResponseMetaPagination size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * The page size, when page-number pagination is used.
   *
   * @return size
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public TeamsResponseMetaPagination total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Total results.
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

  public TeamsResponseMetaPagination type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Pagination type. One of <code>offset_limit</code> or <code>number_size</code>.
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
   * @return TeamsResponseMetaPagination
   */
  @JsonAnySetter
  public TeamsResponseMetaPagination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamsResponseMetaPagination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsResponseMetaPagination teamsResponseMetaPagination = (TeamsResponseMetaPagination) o;
    return Objects.equals(this.firstNumber, teamsResponseMetaPagination.firstNumber)
        && Objects.equals(this.firstOffset, teamsResponseMetaPagination.firstOffset)
        && Objects.equals(this.lastNumber, teamsResponseMetaPagination.lastNumber)
        && Objects.equals(this.lastOffset, teamsResponseMetaPagination.lastOffset)
        && Objects.equals(this.limit, teamsResponseMetaPagination.limit)
        && Objects.equals(this.nextNumber, teamsResponseMetaPagination.nextNumber)
        && Objects.equals(this.nextOffset, teamsResponseMetaPagination.nextOffset)
        && Objects.equals(this.number, teamsResponseMetaPagination.number)
        && Objects.equals(this.offset, teamsResponseMetaPagination.offset)
        && Objects.equals(this.prevNumber, teamsResponseMetaPagination.prevNumber)
        && Objects.equals(this.prevOffset, teamsResponseMetaPagination.prevOffset)
        && Objects.equals(this.size, teamsResponseMetaPagination.size)
        && Objects.equals(this.total, teamsResponseMetaPagination.total)
        && Objects.equals(this.type, teamsResponseMetaPagination.type)
        && Objects.equals(
            this.additionalProperties, teamsResponseMetaPagination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        firstNumber,
        firstOffset,
        lastNumber,
        lastOffset,
        limit,
        nextNumber,
        nextOffset,
        number,
        offset,
        prevNumber,
        prevOffset,
        size,
        total,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsResponseMetaPagination {\n");
    sb.append("    firstNumber: ").append(toIndentedString(firstNumber)).append("\n");
    sb.append("    firstOffset: ").append(toIndentedString(firstOffset)).append("\n");
    sb.append("    lastNumber: ").append(toIndentedString(lastNumber)).append("\n");
    sb.append("    lastOffset: ").append(toIndentedString(lastOffset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextNumber: ").append(toIndentedString(nextNumber)).append("\n");
    sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    prevNumber: ").append(toIndentedString(prevNumber)).append("\n");
    sb.append("    prevOffset: ").append(toIndentedString(prevOffset)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
