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
   * <p>Query values display the current value of a given metric, APM, or log query.</p>
 */
@JsonPropertyOrder({
  QueryValueWidgetDefinition.JSON_PROPERTY_AUTOSCALE,
  QueryValueWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  QueryValueWidgetDefinition.JSON_PROPERTY_CUSTOM_UNIT,
  QueryValueWidgetDefinition.JSON_PROPERTY_PRECISION,
  QueryValueWidgetDefinition.JSON_PROPERTY_REQUESTS,
  QueryValueWidgetDefinition.JSON_PROPERTY_TEXT_ALIGN,
  QueryValueWidgetDefinition.JSON_PROPERTY_TIME,
  QueryValueWidgetDefinition.JSON_PROPERTY_TIMESERIES_BACKGROUND,
  QueryValueWidgetDefinition.JSON_PROPERTY_TITLE,
  QueryValueWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  QueryValueWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  QueryValueWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryValueWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTOSCALE = "autoscale";
  private Boolean autoscale;

  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_CUSTOM_UNIT = "custom_unit";
  private String customUnit;

  public static final String JSON_PROPERTY_PRECISION = "precision";
  private Long precision;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<QueryValueWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TEXT_ALIGN = "text_align";
  private WidgetTextAlign textAlign;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TIMESERIES_BACKGROUND = "timeseries_background";
  private TimeseriesBackground timeseriesBackground;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private QueryValueWidgetDefinitionType type = QueryValueWidgetDefinitionType.QUERY_VALUE;

  public QueryValueWidgetDefinition() {}

  @JsonCreator
  public QueryValueWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUESTS)List<QueryValueWidgetRequest> requests,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)QueryValueWidgetDefinitionType type) {
        this.requests = requests;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public QueryValueWidgetDefinition autoscale(Boolean autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  /**
   * <p>Whether to use auto-scaling or not.</p>
   * @return autoscale
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTOSCALE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getAutoscale() {
        return autoscale;
      }
  public void setAutoscale(Boolean autoscale) {
    this.autoscale = autoscale;
  }
  public QueryValueWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public QueryValueWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * <p>List of custom links.</p>
   * @return customLinks
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<WidgetCustomLink> getCustomLinks() {
        return customLinks;
      }
  public void setCustomLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
  }
  public QueryValueWidgetDefinition customUnit(String customUnit) {
    this.customUnit = customUnit;
    return this;
  }

  /**
   * <p>Display a unit of your choice on the widget.</p>
   * @return customUnit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_UNIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCustomUnit() {
        return customUnit;
      }
  public void setCustomUnit(String customUnit) {
    this.customUnit = customUnit;
  }
  public QueryValueWidgetDefinition precision(Long precision) {
    this.precision = precision;
    return this;
  }

  /**
   * <p>Number of decimals to show. If not defined, the widget uses the raw value.</p>
   * @return precision
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRECISION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getPrecision() {
        return precision;
      }
  public void setPrecision(Long precision) {
    this.precision = precision;
  }
  public QueryValueWidgetDefinition requests(List<QueryValueWidgetRequest> requests) {
    this.requests = requests;
    for (QueryValueWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public QueryValueWidgetDefinition addRequestsItem(QueryValueWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * <p>Widget definition.</p>
   * @return requests
  **/
      @JsonProperty(JSON_PROPERTY_REQUESTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<QueryValueWidgetRequest> getRequests() {
        return requests;
      }
  public void setRequests(List<QueryValueWidgetRequest> requests) {
    this.requests = requests;
  }
  public QueryValueWidgetDefinition textAlign(WidgetTextAlign textAlign) {
    this.textAlign = textAlign;
    this.unparsed |= !textAlign.isValid();
    return this;
  }

  /**
   * <p>How to align the text on the widget.</p>
   * @return textAlign
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEXT_ALIGN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTextAlign getTextAlign() {
        return textAlign;
      }
  public void setTextAlign(WidgetTextAlign textAlign) {
    if (!textAlign.isValid()) {
        this.unparsed = true;
    }
    this.textAlign = textAlign;
  }
  public QueryValueWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * <p>Time setting for the widget.</p>
   * @return time
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTime getTime() {
        return time;
      }
  public void setTime(WidgetTime time) {
    this.time = time;
  }
  public QueryValueWidgetDefinition timeseriesBackground(TimeseriesBackground timeseriesBackground) {
    this.timeseriesBackground = timeseriesBackground;
    this.unparsed |= timeseriesBackground.unparsed;
    return this;
  }

  /**
   * <p>Set a timeseries on the widget background.</p>
   * @return timeseriesBackground
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMESERIES_BACKGROUND)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TimeseriesBackground getTimeseriesBackground() {
        return timeseriesBackground;
      }
  public void setTimeseriesBackground(TimeseriesBackground timeseriesBackground) {
    this.timeseriesBackground = timeseriesBackground;
  }
  public QueryValueWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Title of your widget.</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
  }
  public QueryValueWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * <p>How to align the text on the widget.</p>
   * @return titleAlign
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTextAlign getTitleAlign() {
        return titleAlign;
      }
  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
        this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }
  public QueryValueWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * <p>Size of the title.</p>
   * @return titleSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitleSize() {
        return titleSize;
      }
  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }
  public QueryValueWidgetDefinition type(QueryValueWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the query value widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public QueryValueWidgetDefinitionType getType() {
        return type;
      }
  public void setType(QueryValueWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return QueryValueWidgetDefinition
   */
  @JsonAnySetter
  public QueryValueWidgetDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this QueryValueWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryValueWidgetDefinition queryValueWidgetDefinition = (QueryValueWidgetDefinition) o;
    return Objects.equals(this.autoscale, queryValueWidgetDefinition.autoscale) && Objects.equals(this.customLinks, queryValueWidgetDefinition.customLinks) && Objects.equals(this.customUnit, queryValueWidgetDefinition.customUnit) && Objects.equals(this.precision, queryValueWidgetDefinition.precision) && Objects.equals(this.requests, queryValueWidgetDefinition.requests) && Objects.equals(this.textAlign, queryValueWidgetDefinition.textAlign) && Objects.equals(this.time, queryValueWidgetDefinition.time) && Objects.equals(this.timeseriesBackground, queryValueWidgetDefinition.timeseriesBackground) && Objects.equals(this.title, queryValueWidgetDefinition.title) && Objects.equals(this.titleAlign, queryValueWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, queryValueWidgetDefinition.titleSize) && Objects.equals(this.type, queryValueWidgetDefinition.type) && Objects.equals(this.additionalProperties, queryValueWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(autoscale,customLinks,customUnit,precision,requests,textAlign,time,timeseriesBackground,title,titleAlign,titleSize,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryValueWidgetDefinition {\n");
    sb.append("    autoscale: ").append(toIndentedString(autoscale)).append("\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    customUnit: ").append(toIndentedString(customUnit)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    textAlign: ").append(toIndentedString(textAlign)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeseriesBackground: ").append(toIndentedString(timeseriesBackground)).append("\n");
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
