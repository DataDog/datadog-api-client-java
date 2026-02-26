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
   * <p>Event overlay control options.</p>
   * <p>See the dedicated <a href="https://docs.datadoghq.com/dashboards/graphing_json/widget_json/#events-schema">Events JSON schema documentation</a>
   * to learn how to build the <code>&lt;EVENTS_SCHEMA&gt;</code>.</p>
 */
@JsonPropertyOrder({
  WidgetEvent.JSON_PROPERTY_Q,
  WidgetEvent.JSON_PROPERTY_TAGS_EXECUTION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetEvent {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_TAGS_EXECUTION = "tags_execution";
  private String tagsExecution;

  public WidgetEvent() {}

  @JsonCreator
  public WidgetEvent(
            @JsonProperty(required=true, value=JSON_PROPERTY_Q)String q) {
        this.q = q;
  }
  public WidgetEvent q(String q) {
    this.q = q;
    return this;
  }

  /**
   * <p>Query definition.</p>
   * @return q
  **/
      @JsonProperty(JSON_PROPERTY_Q)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getQ() {
        return q;
      }
  public void setQ(String q) {
    this.q = q;
  }
  public WidgetEvent tagsExecution(String tagsExecution) {
    this.tagsExecution = tagsExecution;
    return this;
  }

  /**
   * <p>The execution method for multi-value filters.</p>
   * @return tagsExecution
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS_EXECUTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTagsExecution() {
        return tagsExecution;
      }
  public void setTagsExecution(String tagsExecution) {
    this.tagsExecution = tagsExecution;
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
   * @return WidgetEvent
   */
  @JsonAnySetter
  public WidgetEvent putAdditionalProperty(String key, Object value) {
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
   * Return true if this WidgetEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetEvent widgetEvent = (WidgetEvent) o;
    return Objects.equals(this.q, widgetEvent.q) && Objects.equals(this.tagsExecution, widgetEvent.tagsExecution) && Objects.equals(this.additionalProperties, widgetEvent.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(q,tagsExecution, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetEvent {\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    tagsExecution: ").append(toIndentedString(tagsExecution)).append("\n");
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
