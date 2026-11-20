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
  GeomapBackendPointsRequest20270101OneOf4457230272.JSON_PROPERTY_CONDITIONAL_FORMATS,
  GeomapBackendPointsRequest20270101OneOf4457230272.JSON_PROPERTY_LIMIT,
  GeomapBackendPointsRequest20270101OneOf4457230272.JSON_PROPERTY_PROJECTION,
  GeomapBackendPointsRequest20270101OneOf4457230272.JSON_PROPERTY_QUERY,
  GeomapBackendPointsRequest20270101OneOf4457230272.JSON_PROPERTY_REQUEST_TYPE,
  GeomapBackendPointsRequest20270101OneOf4457230272.JSON_PROPERTY_STYLE,
  GeomapBackendPointsRequest20270101OneOf4457230272.JSON_PROPERTY_TEXT_FORMATS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapBackendPointsRequest20270101OneOf4457230272 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private GeomapPointsProjection projection;

  public static final String JSON_PROPERTY_QUERY = "query";
  private DataProjectionQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616 requestType;

  public static final String JSON_PROPERTY_STYLE = "style";
  private GeomapBackendPointsRequestAnyOfAnyOfItemStyle style;

  public static final String JSON_PROPERTY_TEXT_FORMATS = "text_formats";
  private List<TextFormattingRule> textFormats = null;

  public GeomapBackendPointsRequest20270101OneOf4457230272() {}

  @JsonCreator
  public GeomapBackendPointsRequest20270101OneOf4457230272(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECTION)
          GeomapPointsProjection projection,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) DataProjectionQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616 requestType) {
    this.projection = projection;
    this.unparsed |= projection.unparsed;
    this.query = query;
    this.unparsed |= query.unparsed;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public GeomapBackendPointsRequest20270101OneOf4457230272 conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendPointsRequest20270101OneOf4457230272 addConditionalFormatsItem(
      ThresholdFormattingRule conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    this.unparsed |= conditionalFormatsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return conditionalFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ThresholdFormattingRule> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GeomapBackendPointsRequest20270101OneOf4457230272 limit(Double limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLimit() {
    return limit;
  }

  public void setLimit(Double limit) {
    this.limit = limit;
  }

  public GeomapBackendPointsRequest20270101OneOf4457230272 projection(
      GeomapPointsProjection projection) {
    this.projection = projection;
    this.unparsed |= projection.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return projection
   */
  @JsonProperty(JSON_PROPERTY_PROJECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GeomapPointsProjection getProjection() {
    return projection;
  }

  public void setProjection(GeomapPointsProjection projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public GeomapBackendPointsRequest20270101OneOf4457230272 query(DataProjectionQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DataProjectionQuery getQuery() {
    return query;
  }

  public void setQuery(DataProjectionQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public GeomapBackendPointsRequest20270101OneOf4457230272 requestType(
      GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616 requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616 getRequestType() {
    return requestType;
  }

  public void setRequestType(
      GeomapBackendPointsRequestAnyOfAnyOfItemRequestType4447003616 requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public GeomapBackendPointsRequest20270101OneOf4457230272 style(
      GeomapBackendPointsRequestAnyOfAnyOfItemStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GeomapBackendPointsRequestAnyOfAnyOfItemStyle getStyle() {
    return style;
  }

  public void setStyle(GeomapBackendPointsRequestAnyOfAnyOfItemStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  public GeomapBackendPointsRequest20270101OneOf4457230272 textFormats(
      List<TextFormattingRule> textFormats) {
    this.textFormats = textFormats;
    if (textFormats != null) {
      for (TextFormattingRule item : textFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendPointsRequest20270101OneOf4457230272 addTextFormatsItem(
      TextFormattingRule textFormatsItem) {
    if (this.textFormats == null) {
      this.textFormats = new ArrayList<>();
    }
    this.textFormats.add(textFormatsItem);
    this.unparsed |= textFormatsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return textFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TextFormattingRule> getTextFormats() {
    return textFormats;
  }

  public void setTextFormats(List<TextFormattingRule> textFormats) {
    this.textFormats = textFormats;
    if (textFormats != null) {
      for (TextFormattingRule item : textFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this GeomapBackendPointsRequest20270101OneOf4457230272 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapBackendPointsRequest20270101OneOf4457230272
        geomapBackendPointsRequest20270101OneOf4457230272 =
            (GeomapBackendPointsRequest20270101OneOf4457230272) o;
    return Objects.equals(
            this.conditionalFormats,
            geomapBackendPointsRequest20270101OneOf4457230272.conditionalFormats)
        && Objects.equals(this.limit, geomapBackendPointsRequest20270101OneOf4457230272.limit)
        && Objects.equals(
            this.projection, geomapBackendPointsRequest20270101OneOf4457230272.projection)
        && Objects.equals(this.query, geomapBackendPointsRequest20270101OneOf4457230272.query)
        && Objects.equals(
            this.requestType, geomapBackendPointsRequest20270101OneOf4457230272.requestType)
        && Objects.equals(this.style, geomapBackendPointsRequest20270101OneOf4457230272.style)
        && Objects.equals(
            this.textFormats, geomapBackendPointsRequest20270101OneOf4457230272.textFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conditionalFormats, limit, projection, query, requestType, style, textFormats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapBackendPointsRequest20270101OneOf4457230272 {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    textFormats: ").append(toIndentedString(textFormats)).append("\n");
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
