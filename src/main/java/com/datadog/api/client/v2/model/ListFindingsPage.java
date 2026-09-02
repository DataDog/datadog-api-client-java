/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Pagination and findings count information. */
@JsonPropertyOrder({
  ListFindingsPage.JSON_PROPERTY_CURSOR,
  ListFindingsPage.JSON_PROPERTY_TOTAL_FILTERED_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListFindingsPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURSOR = "cursor";
  private String cursor;

  public static final String JSON_PROPERTY_TOTAL_FILTERED_COUNT = "total_filtered_count";
  private Long totalFilteredCount;

  public ListFindingsPage cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * The cursor used to paginate requests.
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

  public ListFindingsPage totalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
    return this;
  }

  /**
   * The total count of findings after the filter has been applied.
   *
   * @return totalFilteredCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_FILTERED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalFilteredCount() {
    return totalFilteredCount;
  }

  public void setTotalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
  }

  /** Return true if this ListFindingsPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFindingsPage listFindingsPage = (ListFindingsPage) o;
    return Objects.equals(this.cursor, listFindingsPage.cursor)
        && Objects.equals(this.totalFilteredCount, listFindingsPage.totalFilteredCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, totalFilteredCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFindingsPage {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    totalFilteredCount: ").append(toIndentedString(totalFilteredCount)).append("\n");
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
