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

/** Metadata for pagination. */
@JsonPropertyOrder({
  ListFindingsMeta.JSON_PROPERTY_PAGE,
  ListFindingsMeta.JSON_PROPERTY_SNAPSHOT_TIMESTAMP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListFindingsMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PAGE = "page";
  private ListFindingsPage page;

  public static final String JSON_PROPERTY_SNAPSHOT_TIMESTAMP = "snapshot_timestamp";
  private Long snapshotTimestamp;

  public ListFindingsMeta page(ListFindingsPage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Pagination and findings count information.
   *
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ListFindingsPage getPage() {
    return page;
  }

  public void setPage(ListFindingsPage page) {
    this.page = page;
  }

  public ListFindingsMeta snapshotTimestamp(Long snapshotTimestamp) {
    this.snapshotTimestamp = snapshotTimestamp;
    return this;
  }

  /**
   * The point in time corresponding to the listed findings. minimum: 1
   *
   * @return snapshotTimestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSnapshotTimestamp() {
    return snapshotTimestamp;
  }

  public void setSnapshotTimestamp(Long snapshotTimestamp) {
    this.snapshotTimestamp = snapshotTimestamp;
  }

  /** Return true if this ListFindingsMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFindingsMeta listFindingsMeta = (ListFindingsMeta) o;
    return Objects.equals(this.page, listFindingsMeta.page)
        && Objects.equals(this.snapshotTimestamp, listFindingsMeta.snapshotTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, snapshotTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFindingsMeta {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    snapshotTimestamp: ").append(toIndentedString(snapshotTimestamp)).append("\n");
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
