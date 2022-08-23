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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response with Host information from Datadog. */
@JsonPropertyOrder({
  HostListResponse.JSON_PROPERTY_HOST_LIST,
  HostListResponse.JSON_PROPERTY_TOTAL_MATCHING,
  HostListResponse.JSON_PROPERTY_TOTAL_RETURNED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOST_LIST = "host_list";
  private List<Host> hostList = null;

  public static final String JSON_PROPERTY_TOTAL_MATCHING = "total_matching";
  private Long totalMatching;

  public static final String JSON_PROPERTY_TOTAL_RETURNED = "total_returned";
  private Long totalReturned;

  public HostListResponse hostList(List<Host> hostList) {
    this.hostList = hostList;
    for (Host item : hostList) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HostListResponse addHostListItem(Host hostListItem) {
    if (this.hostList == null) {
      this.hostList = new ArrayList<>();
    }
    this.hostList.add(hostListItem);
    this.unparsed |= hostListItem.unparsed;
    return this;
  }

  /**
   * Array of hosts.
   *
   * @return hostList
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Host> getHostList() {
    return hostList;
  }

  public void setHostList(List<Host> hostList) {
    this.hostList = hostList;
  }

  public HostListResponse totalMatching(Long totalMatching) {
    this.totalMatching = totalMatching;
    return this;
  }

  /**
   * Number of host matching the query.
   *
   * @return totalMatching
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_MATCHING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalMatching() {
    return totalMatching;
  }

  public void setTotalMatching(Long totalMatching) {
    this.totalMatching = totalMatching;
  }

  public HostListResponse totalReturned(Long totalReturned) {
    this.totalReturned = totalReturned;
    return this;
  }

  /**
   * Number of host returned.
   *
   * @return totalReturned
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_RETURNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalReturned() {
    return totalReturned;
  }

  public void setTotalReturned(Long totalReturned) {
    this.totalReturned = totalReturned;
  }

  /** Return true if this HostListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostListResponse hostListResponse = (HostListResponse) o;
    return Objects.equals(this.hostList, hostListResponse.hostList)
        && Objects.equals(this.totalMatching, hostListResponse.totalMatching)
        && Objects.equals(this.totalReturned, hostListResponse.totalReturned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostList, totalMatching, totalReturned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostListResponse {\n");
    sb.append("    hostList: ").append(toIndentedString(hostList)).append("\n");
    sb.append("    totalMatching: ").append(toIndentedString(totalMatching)).append("\n");
    sb.append("    totalReturned: ").append(toIndentedString(totalReturned)).append("\n");
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
