/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response for a list of application keys. */
@JsonPropertyOrder({
  ListApplicationKeysResponse.JSON_PROPERTY_DATA,
  ListApplicationKeysResponse.JSON_PROPERTY_INCLUDED
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListApplicationKeysResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<PartialApplicationKey> data = null;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<ApplicationKeyResponseIncludedItem> included = null;

  public ListApplicationKeysResponse data(List<PartialApplicationKey> data) {
    this.data = data;
    for (PartialApplicationKey item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListApplicationKeysResponse addDataItem(PartialApplicationKey dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Array of application keys.
   *
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PartialApplicationKey> getData() {
    return data;
  }

  public void setData(List<PartialApplicationKey> data) {
    this.data = data;
  }

  public ListApplicationKeysResponse included(List<ApplicationKeyResponseIncludedItem> included) {
    this.included = included;
    for (ApplicationKeyResponseIncludedItem item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListApplicationKeysResponse addIncludedItem(
      ApplicationKeyResponseIncludedItem includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Array of objects related to the application key.
   *
   * @return included
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ApplicationKeyResponseIncludedItem> getIncluded() {
    return included;
  }

  public void setIncluded(List<ApplicationKeyResponseIncludedItem> included) {
    this.included = included;
  }

  /** Return true if this ListApplicationKeysResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListApplicationKeysResponse listApplicationKeysResponse = (ListApplicationKeysResponse) o;
    return Objects.equals(this.data, listApplicationKeysResponse.data)
        && Objects.equals(this.included, listApplicationKeysResponse.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListApplicationKeysResponse {\n");
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
