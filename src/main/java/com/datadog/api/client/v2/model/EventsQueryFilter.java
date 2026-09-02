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
   * <p>The search and filter query settings.</p>
 */
@JsonPropertyOrder({
  EventsQueryFilter.JSON_PROPERTY_FROM,
  EventsQueryFilter.JSON_PROPERTY_QUERY,
  EventsQueryFilter.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsQueryFilter {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private String from = "now-15m";

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query = "*";

  public static final String JSON_PROPERTY_TO = "to";
  private String to = "now";

  public EventsQueryFilter from(String from) {
    this.from = from;
    return this;
  }

  /**
   * <p>The minimum time for the requested events. Supports date math and regular timestamps in milliseconds.</p>
   * @return from
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FROM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFrom() {
        return from;
      }
  public void setFrom(String from) {
    this.from = from;
  }
  public EventsQueryFilter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>The search query following the event search syntax.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public EventsQueryFilter to(String to) {
    this.to = to;
    return this;
  }

  /**
   * <p>The maximum time for the requested events. Supports date math and regular timestamps in milliseconds.</p>
   * @return to
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TO)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTo() {
        return to;
      }
  public void setTo(String to) {
    this.to = to;
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
   * @return EventsQueryFilter
   */
  @JsonAnySetter
  public EventsQueryFilter putAdditionalProperty(String key, Object value) {
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
   * Return true if this EventsQueryFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsQueryFilter eventsQueryFilter = (EventsQueryFilter) o;
    return Objects.equals(this.from, eventsQueryFilter.from) && Objects.equals(this.query, eventsQueryFilter.query) && Objects.equals(this.to, eventsQueryFilter.to) && Objects.equals(this.additionalProperties, eventsQueryFilter.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(from,query,to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsQueryFilter {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
