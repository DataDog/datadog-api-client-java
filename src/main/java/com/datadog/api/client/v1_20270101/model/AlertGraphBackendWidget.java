/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  AlertGraphBackendWidget.JSON_PROPERTY_DEFINITION,
  AlertGraphBackendWidget.JSON_PROPERTY_ID,
  AlertGraphBackendWidget.JSON_PROPERTY_LAYOUT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AlertGraphBackendWidget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private AlertGraphBackendDefinition definition;

  public static final String JSON_PROPERTY_ID = "id";
  private Double id;

  public static final String JSON_PROPERTY_LAYOUT = "layout";
  private WidgetLayout layout;

  public AlertGraphBackendWidget() {}

  @JsonCreator
  public AlertGraphBackendWidget(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION)
          AlertGraphBackendDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
  }

  public AlertGraphBackendWidget definition(AlertGraphBackendDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return definition
   */
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AlertGraphBackendDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(AlertGraphBackendDefinition definition) {
    this.definition = definition;
    if (definition != null) {
      this.unparsed |= definition.unparsed;
    }
  }

  public AlertGraphBackendWidget id(Double id) {
    this.id = id;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getId() {
    return id;
  }

  public void setId(Double id) {
    this.id = id;
  }

  public AlertGraphBackendWidget layout(WidgetLayout layout) {
    this.layout = layout;
    this.unparsed |= layout.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return layout
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetLayout getLayout() {
    return layout;
  }

  public void setLayout(WidgetLayout layout) {
    this.layout = layout;
    if (layout != null) {
      this.unparsed |= layout.unparsed;
    }
  }

  /** Return true if this AlertGraphBackendWidget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertGraphBackendWidget alertGraphBackendWidget = (AlertGraphBackendWidget) o;
    return Objects.equals(this.definition, alertGraphBackendWidget.definition)
        && Objects.equals(this.id, alertGraphBackendWidget.id)
        && Objects.equals(this.layout, alertGraphBackendWidget.layout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, id, layout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertGraphBackendWidget {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append('}');
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
