/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Invitations data and metadata that exists for a shared dashboard returned by the API. */
@JsonPropertyOrder({
  SharedDashboardInvites.JSON_PROPERTY_DATA,
  SharedDashboardInvites.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SharedDashboardInvites {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private SharedDashboardInvitesData data;

  public static final String JSON_PROPERTY_META = "meta";
  private SharedDashboardInvitesMeta meta;

  public SharedDashboardInvites() {}

  @JsonCreator
  public SharedDashboardInvites(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) SharedDashboardInvitesData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
  }

  public SharedDashboardInvites data(SharedDashboardInvitesData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * An object or list of objects containing the information for an invitation to a shared
   * dashboard.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SharedDashboardInvitesData getData() {
    return data;
  }

  public void setData(SharedDashboardInvitesData data) {
    this.data = data;
  }

  /**
   * Pagination metadata returned by the API.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SharedDashboardInvitesMeta getMeta() {
    return meta;
  }

  /** Return true if this SharedDashboardInvites object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedDashboardInvites sharedDashboardInvites = (SharedDashboardInvites) o;
    return Objects.equals(this.data, sharedDashboardInvites.data)
        && Objects.equals(this.meta, sharedDashboardInvites.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedDashboardInvites {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
