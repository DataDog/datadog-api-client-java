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
   * <p>Search filters for listing security signals.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringSignalListRequestFilter.JSON_PROPERTY_FROM,
  SecurityMonitoringSignalListRequestFilter.JSON_PROPERTY_QUERY,
  SecurityMonitoringSignalListRequestFilter.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalListRequestFilter {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private OffsetDateTime from;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TO = "to";
  private OffsetDateTime to;

  public SecurityMonitoringSignalListRequestFilter from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

  /**
   * <p>The minimum timestamp for requested security signals.</p>
   * @return from
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FROM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getFrom() {
        return from;
      }
  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }
  public SecurityMonitoringSignalListRequestFilter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Search query for listing security signals.</p>
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
  public SecurityMonitoringSignalListRequestFilter to(OffsetDateTime to) {
    this.to = to;
    return this;
  }

  /**
   * <p>The maximum timestamp for requested security signals.</p>
   * @return to
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TO)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getTo() {
        return to;
      }
  public void setTo(OffsetDateTime to) {
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
   * @return SecurityMonitoringSignalListRequestFilter
   */
  @JsonAnySetter
  public SecurityMonitoringSignalListRequestFilter putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecurityMonitoringSignalListRequestFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalListRequestFilter securityMonitoringSignalListRequestFilter = (SecurityMonitoringSignalListRequestFilter) o;
    return Objects.equals(this.from, securityMonitoringSignalListRequestFilter.from) && Objects.equals(this.query, securityMonitoringSignalListRequestFilter.query) && Objects.equals(this.to, securityMonitoringSignalListRequestFilter.to) && Objects.equals(this.additionalProperties, securityMonitoringSignalListRequestFilter.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(from,query,to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalListRequestFilter {\n");
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
