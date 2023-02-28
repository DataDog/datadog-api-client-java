/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
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
   * <p>The metadata object containing pagination metadata.</p>
 */
@JsonPropertyOrder({
  IncidentResponseMeta.JSON_PROPERTY_PAGINATION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentResponseMeta {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private IncidentResponseMetaPagination pagination;

  public IncidentResponseMeta pagination(IncidentResponseMetaPagination pagination) {
    this.pagination = pagination;
    this.unparsed |= pagination.unparsed;
    return this;
  }

  /**
   * <p>Pagination properties.</p>
   * @return pagination
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGINATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IncidentResponseMetaPagination getPagination() {
        return pagination;
      }
  public void setPagination(IncidentResponseMetaPagination pagination) {
    this.pagination = pagination;
  }

  /**
   * Return true if this IncidentResponseMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentResponseMeta incidentResponseMeta = (IncidentResponseMeta) o;
    return Objects.equals(this.pagination, incidentResponseMeta.pagination);
  }


  @Override
  public int hashCode() {
    return Objects.hash(pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentResponseMeta {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("}");
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
