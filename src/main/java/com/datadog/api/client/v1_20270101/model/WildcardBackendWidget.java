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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  WildcardBackendWidget.JSON_PROPERTY_CUSTOM_LINKS,
  WildcardBackendWidget.JSON_PROPERTY_DEFINITION,
  WildcardBackendWidget.JSON_PROPERTY_ID,
  WildcardBackendWidget.JSON_PROPERTY_LAYOUT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WildcardBackendWidget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private WildcardBackendDefinition definition;

  public static final String JSON_PROPERTY_ID = "id";
  private Double id;

  public static final String JSON_PROPERTY_LAYOUT = "layout";
  private WidgetLayout layout;

  public WildcardBackendWidget() {}

  @JsonCreator
  public WildcardBackendWidget(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION)
          WildcardBackendDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
  }

  public WildcardBackendWidget customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public WildcardBackendWidget addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return customLinks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetCustomLink> getCustomLinks() {
    return customLinks;
  }

  public void setCustomLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public WildcardBackendWidget definition(WildcardBackendDefinition definition) {
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
  public WildcardBackendDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(WildcardBackendDefinition definition) {
    this.definition = definition;
    if (definition != null) {
      this.unparsed |= definition.unparsed;
    }
  }

  public WildcardBackendWidget id(Double id) {
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

  public WildcardBackendWidget layout(WidgetLayout layout) {
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

  /** Return true if this WildcardBackendWidget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WildcardBackendWidget wildcardBackendWidget = (WildcardBackendWidget) o;
    return Objects.equals(this.customLinks, wildcardBackendWidget.customLinks)
        && Objects.equals(this.definition, wildcardBackendWidget.definition)
        && Objects.equals(this.id, wildcardBackendWidget.id)
        && Objects.equals(this.layout, wildcardBackendWidget.layout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customLinks, definition, id, layout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WildcardBackendWidget {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
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
