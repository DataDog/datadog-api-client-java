/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * One or more feature flags that reference this saved filter require approval for the rule update.
 */
@JsonPropertyOrder({SavedFilterApprovalConflictResponse.JSON_PROPERTY_DATA})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SavedFilterApprovalConflictResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private SavedFilterApprovalConflictData data;

  public SavedFilterApprovalConflictResponse() {}

  @JsonCreator
  public SavedFilterApprovalConflictResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          SavedFilterApprovalConflictData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
  }

  public SavedFilterApprovalConflictResponse data(SavedFilterApprovalConflictData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * One or more feature flags that reference this saved filter require approval for the rule
   * update.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SavedFilterApprovalConflictData getData() {
    return data;
  }

  public void setData(SavedFilterApprovalConflictData data) {
    this.data = data;
    if (data != null) {
      this.unparsed |= data.unparsed;
    }
  }

  /** Return true if this SavedFilterApprovalConflictResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedFilterApprovalConflictResponse savedFilterApprovalConflictResponse =
        (SavedFilterApprovalConflictResponse) o;
    return Objects.equals(this.data, savedFilterApprovalConflictResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedFilterApprovalConflictResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
