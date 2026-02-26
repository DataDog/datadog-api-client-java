/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Response with Host information from Datadog.</p>
 */
@JsonPropertyOrder({
  HostListResponse.JSON_PROPERTY_HOST_LIST,
  HostListResponse.JSON_PROPERTY_TOTAL_MATCHING,
  HostListResponse.JSON_PROPERTY_TOTAL_RETURNED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostListResponse {
  @JsonIgnore
  public boolean unparsed = false;
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
   * <p>Array of hosts.</p>
   * @return hostList
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOST_LIST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Number of host matching the query.</p>
   * @return totalMatching
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOTAL_MATCHING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Number of host returned.</p>
   * @return totalReturned
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOTAL_RETURNED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTotalReturned() {
        return totalReturned;
      }
  public void setTotalReturned(Long totalReturned) {
    this.totalReturned = totalReturned;
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
   * @return HostListResponse
   */
  @JsonAnySetter
  public HostListResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this HostListResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostListResponse hostListResponse = (HostListResponse) o;
    return Objects.equals(this.hostList, hostListResponse.hostList) && Objects.equals(this.totalMatching, hostListResponse.totalMatching) && Objects.equals(this.totalReturned, hostListResponse.totalReturned) && Objects.equals(this.additionalProperties, hostListResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(hostList,totalMatching,totalReturned, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostListResponse {\n");
    sb.append("    hostList: ").append(toIndentedString(hostList)).append("\n");
    sb.append("    totalMatching: ").append(toIndentedString(totalMatching)).append("\n");
    sb.append("    totalReturned: ").append(toIndentedString(totalReturned)).append("\n");
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
