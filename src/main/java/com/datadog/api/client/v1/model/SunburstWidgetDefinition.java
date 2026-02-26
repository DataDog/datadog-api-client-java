/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Sunbursts are spot on to highlight how groups contribute to the total of a query. */
@JsonPropertyOrder({
  SunburstWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  SunburstWidgetDefinition.JSON_PROPERTY_HIDE_TOTAL,
  SunburstWidgetDefinition.JSON_PROPERTY_LEGEND,
  SunburstWidgetDefinition.JSON_PROPERTY_REQUESTS,
  SunburstWidgetDefinition.JSON_PROPERTY_TIME,
  SunburstWidgetDefinition.JSON_PROPERTY_TITLE,
  SunburstWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  SunburstWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  SunburstWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SunburstWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_HIDE_TOTAL = "hide_total";
  private Boolean hideTotal;

  public static final String JSON_PROPERTY_LEGEND = "legend";
  private SunburstWidgetLegend legend;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<SunburstWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SunburstWidgetDefinitionType type = SunburstWidgetDefinitionType.SUNBURST;

  public SunburstWidgetDefinition() {}

  @JsonCreator
  public SunburstWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<SunburstWidgetRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SunburstWidgetDefinitionType type) {
    this.requests = requests;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SunburstWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SunburstWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * List of custom links.
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
  }

  public SunburstWidgetDefinition hideTotal(Boolean hideTotal) {
    this.hideTotal = hideTotal;
    return this;
  }

  /**
   * Show the total value in this widget.
   *
   * @return hideTotal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideTotal() {
    return hideTotal;
  }

  public void setHideTotal(Boolean hideTotal) {
    this.hideTotal = hideTotal;
  }

  public SunburstWidgetDefinition legend(SunburstWidgetLegend legend) {
    this.legend = legend;
    this.unparsed |= legend.unparsed;
    return this;
  }

  /**
   * Configuration of the legend.
   *
   * @return legend
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SunburstWidgetLegend getLegend() {
    return legend;
  }

  public void setLegend(SunburstWidgetLegend legend) {
    this.legend = legend;
  }

  public SunburstWidgetDefinition requests(List<SunburstWidgetRequest> requests) {
    this.requests = requests;
    for (SunburstWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SunburstWidgetDefinition addRequestsItem(SunburstWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * List of sunburst widget requests.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SunburstWidgetRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<SunburstWidgetRequest> requests) {
    this.requests = requests;
  }

  public SunburstWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Time setting for the widget.
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTime getTime() {
    return time;
  }

  public void setTime(WidgetTime time) {
    this.time = time;
  }

  public SunburstWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of your widget.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SunburstWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * How to align the text on the widget.
   *
   * @return titleAlign
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }

  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
      this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }

  public SunburstWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Size of the title.
   *
   * @return titleSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public SunburstWidgetDefinition type(SunburstWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Sunburst widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SunburstWidgetDefinitionType getType() {
    return type;
  }

  public void setType(SunburstWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SunburstWidgetDefinition
   */
  @JsonAnySetter
  public SunburstWidgetDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SunburstWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SunburstWidgetDefinition sunburstWidgetDefinition = (SunburstWidgetDefinition) o;
    return Objects.equals(this.customLinks, sunburstWidgetDefinition.customLinks)
        && Objects.equals(this.hideTotal, sunburstWidgetDefinition.hideTotal)
        && Objects.equals(this.legend, sunburstWidgetDefinition.legend)
        && Objects.equals(this.requests, sunburstWidgetDefinition.requests)
        && Objects.equals(this.time, sunburstWidgetDefinition.time)
        && Objects.equals(this.title, sunburstWidgetDefinition.title)
        && Objects.equals(this.titleAlign, sunburstWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, sunburstWidgetDefinition.titleSize)
        && Objects.equals(this.type, sunburstWidgetDefinition.type)
        && Objects.equals(this.additionalProperties, sunburstWidgetDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks,
        hideTotal,
        legend,
        requests,
        time,
        title,
        titleAlign,
        titleSize,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SunburstWidgetDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    hideTotal: ").append(toIndentedString(hideTotal)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
