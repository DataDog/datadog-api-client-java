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
   * <p>Monitor options for deployment rules.</p>
 */
@JsonPropertyOrder({
  DeploymentRuleOptionsMonitor.JSON_PROPERTY_DURATION,
  DeploymentRuleOptionsMonitor.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentRuleOptionsMonitor {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public DeploymentRuleOptionsMonitor() {}

  @JsonCreator
  public DeploymentRuleOptionsMonitor(
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)String query) {
        this.query = query;
  }
  public DeploymentRuleOptionsMonitor duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * <p>Seconds the monitor needs to stay in OK status for the rule to pass.</p>
   * @return duration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getDuration() {
        return duration;
      }
  public void setDuration(Long duration) {
    this.duration = duration;
  }
  public DeploymentRuleOptionsMonitor query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Monitors that match this query are evaluated.</p>
   * @return query
  **/
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }

  /**
   * Return true if this DeploymentRuleOptionsMonitor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentRuleOptionsMonitor deploymentRuleOptionsMonitor = (DeploymentRuleOptionsMonitor) o;
    return Objects.equals(this.duration, deploymentRuleOptionsMonitor.duration) && Objects.equals(this.query, deploymentRuleOptionsMonitor.query);
  }


  @Override
  public int hashCode() {
    return Objects.hash(duration,query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentRuleOptionsMonitor {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
