/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Event overlay control options.
 *
 * <p>See the dedicated <a
 * href="https://docs.datadoghq.com/dashboards/graphing_json/widget_json/#events-schema">Events JSON
 * schema documentation</a> to learn how to build the <code>&lt;EVENTS_SCHEMA&gt;</code>.
 */
@JsonPropertyOrder({WidgetEvent.JSON_PROPERTY_Q, WidgetEvent.JSON_PROPERTY_TAGS_EXECUTION})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetEvent {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_TAGS_EXECUTION = "tags_execution";
  private String tagsExecution;

  public WidgetEvent() {}

  @JsonCreator
  public WidgetEvent(@JsonProperty(required = true, value = JSON_PROPERTY_Q) String q) {
    this.q = q;
  }

  public WidgetEvent q(String q) {
    this.q = q;
    return this;
  }

  /**
   * Query definition.
   *
   * @return q
   */
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * The execution method for multi-value filters.
   *
   * @return tagsExecution
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTagsExecution() {
    return tagsExecution;
  }

  public void setTagsExecution(String tagsExecution) {
    this.tagsExecution = tagsExecution;
  }

  /** Return true if this WidgetEvent object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetEvent widgetEvent = (WidgetEvent) o;
    return Objects.equals(this.q, widgetEvent.q)
        && Objects.equals(this.tagsExecution, widgetEvent.tagsExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(q, tagsExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetEvent {\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    tagsExecution: ").append(toIndentedString(tagsExecution)).append("\n");
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
