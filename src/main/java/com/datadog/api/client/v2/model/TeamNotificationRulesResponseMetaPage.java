/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Metadata related to paging information that is included in the response when querying the team notification rules</p>
 */
@JsonPropertyOrder({
  TeamNotificationRulesResponseMetaPage.JSON_PROPERTY_FIRST_OFFSET,
  TeamNotificationRulesResponseMetaPage.JSON_PROPERTY_LAST_OFFSET,
  TeamNotificationRulesResponseMetaPage.JSON_PROPERTY_LIMIT,
  TeamNotificationRulesResponseMetaPage.JSON_PROPERTY_NEXT_OFFSET,
  TeamNotificationRulesResponseMetaPage.JSON_PROPERTY_OFFSET,
  TeamNotificationRulesResponseMetaPage.JSON_PROPERTY_PREV_OFFSET,
  TeamNotificationRulesResponseMetaPage.JSON_PROPERTY_TOTAL,
  TeamNotificationRulesResponseMetaPage.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamNotificationRulesResponseMetaPage {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST_OFFSET = "first_offset";
  private Long firstOffset;

  public static final String JSON_PROPERTY_LAST_OFFSET = "last_offset";
  private Long lastOffset;

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

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public TeamNotificationRulesResponseMetaPage firstOffset(Long firstOffset) {
    this.firstOffset = firstOffset;
    return this;
  }

  /**
   * <p>The first offset.</p>
   * @return firstOffset
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIRST_OFFSET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getFirstOffset() {
        return firstOffset;
      }
  public void setFirstOffset(Long firstOffset) {
    this.firstOffset = firstOffset;
  }
  public TeamNotificationRulesResponseMetaPage lastOffset(Long lastOffset) {
    this.lastOffset = lastOffset;
    return this;
  }

  /**
   * <p>The last offset.</p>
   * @return lastOffset
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_OFFSET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getLastOffset() {
        return lastOffset;
      }
  public void setLastOffset(Long lastOffset) {
    this.lastOffset = lastOffset;
  }
  public TeamNotificationRulesResponseMetaPage limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>Pagination limit.</p>
   * @return limit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getLimit() {
        return limit;
      }
  public void setLimit(Long limit) {
    this.limit = limit;
  }
  public TeamNotificationRulesResponseMetaPage nextOffset(Long nextOffset) {
    this.nextOffset = JsonNullable.<Long>of(nextOffset);
    return this;
  }

  /**
   * <p>The next offset.</p>
   * @return nextOffset
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getNextOffset() {
        return nextOffset.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_NEXT_OFFSET)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getNextOffset_JsonNullable() {
    return nextOffset;
  }
  @JsonProperty(JSON_PROPERTY_NEXT_OFFSET)public void setNextOffset_JsonNullable(JsonNullable<Long> nextOffset) {
    this.nextOffset = nextOffset;
  }
  public void setNextOffset(Long nextOffset) {
    this.nextOffset = JsonNullable.<Long>of(nextOffset);
  }
  public TeamNotificationRulesResponseMetaPage offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <p>The offset.</p>
   * @return offset
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OFFSET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getOffset() {
        return offset;
      }
  public void setOffset(Long offset) {
    this.offset = offset;
  }
  public TeamNotificationRulesResponseMetaPage prevOffset(Long prevOffset) {
    this.prevOffset = JsonNullable.<Long>of(prevOffset);
    return this;
  }

  /**
   * <p>The previous offset.</p>
   * @return prevOffset
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getPrevOffset() {
        return prevOffset.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_PREV_OFFSET)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getPrevOffset_JsonNullable() {
    return prevOffset;
  }
  @JsonProperty(JSON_PROPERTY_PREV_OFFSET)public void setPrevOffset_JsonNullable(JsonNullable<Long> prevOffset) {
    this.prevOffset = prevOffset;
  }
  public void setPrevOffset(Long prevOffset) {
    this.prevOffset = JsonNullable.<Long>of(prevOffset);
  }
  public TeamNotificationRulesResponseMetaPage total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * <p>Total results.</p>
   * @return total
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOTAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTotal() {
        return total;
      }
  public void setTotal(Long total) {
    this.total = total;
  }
  public TeamNotificationRulesResponseMetaPage type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Offset type.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
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
   * @return TeamNotificationRulesResponseMetaPage
   */
  @JsonAnySetter
  public TeamNotificationRulesResponseMetaPage putAdditionalProperty(String key, Object value) {
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
   * Return true if this TeamNotificationRulesResponseMetaPage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamNotificationRulesResponseMetaPage teamNotificationRulesResponseMetaPage = (TeamNotificationRulesResponseMetaPage) o;
    return Objects.equals(this.firstOffset, teamNotificationRulesResponseMetaPage.firstOffset) && Objects.equals(this.lastOffset, teamNotificationRulesResponseMetaPage.lastOffset) && Objects.equals(this.limit, teamNotificationRulesResponseMetaPage.limit) && Objects.equals(this.nextOffset, teamNotificationRulesResponseMetaPage.nextOffset) && Objects.equals(this.offset, teamNotificationRulesResponseMetaPage.offset) && Objects.equals(this.prevOffset, teamNotificationRulesResponseMetaPage.prevOffset) && Objects.equals(this.total, teamNotificationRulesResponseMetaPage.total) && Objects.equals(this.type, teamNotificationRulesResponseMetaPage.type) && Objects.equals(this.additionalProperties, teamNotificationRulesResponseMetaPage.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(firstOffset,lastOffset,limit,nextOffset,offset,prevOffset,total,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamNotificationRulesResponseMetaPage {\n");
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
