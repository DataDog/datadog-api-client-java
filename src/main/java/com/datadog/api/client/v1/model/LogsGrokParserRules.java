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
   * <p>Set of rules for the grok parser.</p>
 */
@JsonPropertyOrder({
  LogsGrokParserRules.JSON_PROPERTY_MATCH_RULES,
  LogsGrokParserRules.JSON_PROPERTY_SUPPORT_RULES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsGrokParserRules {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_MATCH_RULES = "match_rules";
  private String matchRules;

  public static final String JSON_PROPERTY_SUPPORT_RULES = "support_rules";
  private String supportRules = "";

  public LogsGrokParserRules() {}

  @JsonCreator
  public LogsGrokParserRules(
            @JsonProperty(required=true, value=JSON_PROPERTY_MATCH_RULES)String matchRules) {
        this.matchRules = matchRules;
  }
  public LogsGrokParserRules matchRules(String matchRules) {
    this.matchRules = matchRules;
    return this;
  }

  /**
   * <p>List of match rules for the grok parser, separated by a new line.</p>
   * @return matchRules
  **/
      @JsonProperty(JSON_PROPERTY_MATCH_RULES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getMatchRules() {
        return matchRules;
      }
  public void setMatchRules(String matchRules) {
    this.matchRules = matchRules;
  }
  public LogsGrokParserRules supportRules(String supportRules) {
    this.supportRules = supportRules;
    return this;
  }

  /**
   * <p>List of support rules for the grok parser, separated by a new line.</p>
   * @return supportRules
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SUPPORT_RULES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSupportRules() {
        return supportRules;
      }
  public void setSupportRules(String supportRules) {
    this.supportRules = supportRules;
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
   * @return LogsGrokParserRules
   */
  @JsonAnySetter
  public LogsGrokParserRules putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsGrokParserRules object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsGrokParserRules logsGrokParserRules = (LogsGrokParserRules) o;
    return Objects.equals(this.matchRules, logsGrokParserRules.matchRules) && Objects.equals(this.supportRules, logsGrokParserRules.supportRules) && Objects.equals(this.additionalProperties, logsGrokParserRules.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(matchRules,supportRules, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsGrokParserRules {\n");
    sb.append("    matchRules: ").append(toIndentedString(matchRules)).append("\n");
    sb.append("    supportRules: ").append(toIndentedString(supportRules)).append("\n");
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
