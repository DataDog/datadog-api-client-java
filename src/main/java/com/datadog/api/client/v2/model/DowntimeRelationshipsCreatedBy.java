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
import org.openapitools.jackson.nullable.JsonNullable;

/** The user who created the downtime. */
@JsonPropertyOrder({DowntimeRelationshipsCreatedBy.JSON_PROPERTY_DATA})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeRelationshipsCreatedBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private JsonNullable<DowntimeRelationshipsCreatedByData> data =
      JsonNullable.<DowntimeRelationshipsCreatedByData>undefined();

  public DowntimeRelationshipsCreatedBy data(DowntimeRelationshipsCreatedByData data) {
    this.data = JsonNullable.<DowntimeRelationshipsCreatedByData>of(data);
    return this;
  }

  /**
   * Data for the user who created the downtime.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public DowntimeRelationshipsCreatedByData getData() {
    return data.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<DowntimeRelationshipsCreatedByData> getData_JsonNullable() {
    return data;
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  public void setData_JsonNullable(JsonNullable<DowntimeRelationshipsCreatedByData> data) {
    this.data = data;
  }

  public void setData(DowntimeRelationshipsCreatedByData data) {
    this.data = JsonNullable.<DowntimeRelationshipsCreatedByData>of(data);
  }

  /** Return true if this DowntimeRelationshipsCreatedBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeRelationshipsCreatedBy downtimeRelationshipsCreatedBy =
        (DowntimeRelationshipsCreatedBy) o;
    return Objects.equals(this.data, downtimeRelationshipsCreatedBy.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeRelationshipsCreatedBy {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
