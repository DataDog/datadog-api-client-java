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

/** Object containing the total count of invitations across all pages */
@JsonPropertyOrder({SharedDashboardInvitesMetaPage.JSON_PROPERTY_TOTAL_COUNT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardInvitesMetaPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;

  public SharedDashboardInvitesMetaPage totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * The total number of invitations on this shared board, across all pages.
   *
   * @return totalCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  /** Return true if this SharedDashboardInvitesMetaPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardInvitesMetaPage sharedDashboardInvitesMetaPage =
        (SharedDashboardInvitesMetaPage) o;
    return Objects.equals(this.totalCount, sharedDashboardInvitesMetaPage.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardInvitesMetaPage {\n");
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
