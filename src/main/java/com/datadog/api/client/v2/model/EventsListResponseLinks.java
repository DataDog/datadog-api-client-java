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
   * <p>Links attributes.</p>
 */
@JsonPropertyOrder({
  EventsListResponseLinks.JSON_PROPERTY_NEXT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsListResponseLinks {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public EventsListResponseLinks next(String next) {
    this.next = next;
    return this;
  }

  /**
   * <p>Link for the next set of results. Note that the request can also be made using the
   * POST endpoint.</p>
   * @return next
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NEXT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getNext() {
        return next;
      }
  public void setNext(String next) {
    this.next = next;
  }

  /**
   * Return true if this EventsListResponseLinks object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsListResponseLinks eventsListResponseLinks = (EventsListResponseLinks) o;
    return Objects.equals(this.next, eventsListResponseLinks.next);
  }


  @Override
  public int hashCode() {
    return Objects.hash(next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsListResponseLinks {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
