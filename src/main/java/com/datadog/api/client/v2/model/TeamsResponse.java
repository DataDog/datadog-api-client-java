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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response with multiple teams */
@JsonPropertyOrder({TeamsResponse.JSON_PROPERTY_DATA, TeamsResponse.JSON_PROPERTY_INCLUDED})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<Team> data = null;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<TeamIncluded> included = null;

  public TeamsResponse data(List<Team> data) {
    this.data = data;
    for (Team item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TeamsResponse addDataItem(Team dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Teams response data
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Team> getData() {
    return data;
  }

  public void setData(List<Team> data) {
    this.data = data;
  }

  public TeamsResponse included(List<TeamIncluded> included) {
    this.included = included;
    for (TeamIncluded item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TeamsResponse addIncludedItem(TeamIncluded includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Resources related to the team
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TeamIncluded> getIncluded() {
    return included;
  }

  public void setIncluded(List<TeamIncluded> included) {
    this.included = included;
  }

  /** Return true if this TeamsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsResponse teamsResponse = (TeamsResponse) o;
    return Objects.equals(this.data, teamsResponse.data)
        && Objects.equals(this.included, teamsResponse.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
