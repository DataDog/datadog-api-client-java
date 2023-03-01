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
   * <p>Pagination properties.</p>
 */
@JsonPropertyOrder({
  IncidentResponseMetaPagination.JSON_PROPERTY_NEXT_OFFSET,
  IncidentResponseMetaPagination.JSON_PROPERTY_OFFSET,
  IncidentResponseMetaPagination.JSON_PROPERTY_SIZE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentResponseMetaPagination {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NEXT_OFFSET = "next_offset";
  private Long nextOffset;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Long offset;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public IncidentResponseMetaPagination nextOffset(Long nextOffset) {
    this.nextOffset = nextOffset;
    return this;
  }

  /**
   * <p>The index of the first element in the next page of results. Equal to page size added to the current offset.</p>
   * @return nextOffset
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NEXT_OFFSET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getNextOffset() {
        return nextOffset;
      }
  public void setNextOffset(Long nextOffset) {
    this.nextOffset = nextOffset;
  }
  public IncidentResponseMetaPagination offset(Long offset) {
    this.offset = offset;
    return this;
  }

  /**
   * <p>The index of the first element in the results.</p>
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
  public IncidentResponseMetaPagination size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * <p>Maximum size of pages to return.</p>
   * @return size
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getSize() {
        return size;
      }
  public void setSize(Long size) {
    this.size = size;
  }

  /**
   * Return true if this IncidentResponseMetaPagination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentResponseMetaPagination incidentResponseMetaPagination = (IncidentResponseMetaPagination) o;
    return Objects.equals(this.nextOffset, incidentResponseMetaPagination.nextOffset) && Objects.equals(this.offset, incidentResponseMetaPagination.offset) && Objects.equals(this.size, incidentResponseMetaPagination.size);
  }


  @Override
  public int hashCode() {
    return Objects.hash(nextOffset,offset,size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentResponseMetaPagination {\n");
    sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("}");
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
