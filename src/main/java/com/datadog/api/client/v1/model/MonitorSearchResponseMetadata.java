/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Metadata about the response. */
@JsonPropertyOrder({
  MonitorSearchResponseMetadata.JSON_PROPERTY_PAGE,
  MonitorSearchResponseMetadata.JSON_PROPERTY_PAGE_COUNT,
  MonitorSearchResponseMetadata.JSON_PROPERTY_PER_PAGE,
  MonitorSearchResponseMetadata.JSON_PROPERTY_TOTAL_COUNT
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorSearchResponseMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PAGE = "page";
  private Long page;

  public static final String JSON_PROPERTY_PAGE_COUNT = "page_count";
  private Long pageCount;

  public static final String JSON_PROPERTY_PER_PAGE = "per_page";
  private Long perPage;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;

  /**
   * The page to start paginating from.
   *
   * @return page
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPage() {
    return page;
  }

  /**
   * The number of pages.
   *
   * @return pageCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPageCount() {
    return pageCount;
  }

  /**
   * The number of monitors to return per page.
   *
   * @return perPage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PER_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPerPage() {
    return perPage;
  }

  /**
   * The total number of monitors.
   *
   * @return totalCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalCount() {
    return totalCount;
  }

  /** Return true if this MonitorSearchResponseMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorSearchResponseMetadata monitorSearchResponseMetadata = (MonitorSearchResponseMetadata) o;
    return Objects.equals(this.page, monitorSearchResponseMetadata.page)
        && Objects.equals(this.pageCount, monitorSearchResponseMetadata.pageCount)
        && Objects.equals(this.perPage, monitorSearchResponseMetadata.perPage)
        && Objects.equals(this.totalCount, monitorSearchResponseMetadata.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageCount, perPage, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorSearchResponseMetadata {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("}");
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