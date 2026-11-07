/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Configuration of the group label column. Its width is sized automatically when omitted. */
@JsonPropertyOrder({
  HeatgridLabelColumn.JSON_PROPERTY_TEXT_FORMATS,
  HeatgridLabelColumn.JSON_PROPERTY_WIDTH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridLabelColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TEXT_FORMATS = "text_formats";
  private List<HeatgridTextFormatRule> textFormats = null;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private HeatgridLabelColumnWidth width;

  public HeatgridLabelColumn textFormats(List<HeatgridTextFormatRule> textFormats) {
    this.textFormats = textFormats;
    if (textFormats != null) {
      for (HeatgridTextFormatRule item : textFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HeatgridLabelColumn addTextFormatsItem(HeatgridTextFormatRule textFormatsItem) {
    if (this.textFormats == null) {
      this.textFormats = new ArrayList<>();
    }
    this.textFormats.add(textFormatsItem);
    this.unparsed |= textFormatsItem.unparsed;
    return this;
  }

  /**
   * Ordered string replacement rules for the group labels.
   *
   * @return textFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<HeatgridTextFormatRule> getTextFormats() {
    return textFormats;
  }

  public void setTextFormats(List<HeatgridTextFormatRule> textFormats) {
    this.textFormats = textFormats;
    if (textFormats != null) {
      for (HeatgridTextFormatRule item : textFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HeatgridLabelColumn width(HeatgridLabelColumnWidth width) {
    this.width = width;
    this.unparsed |= !width.isValid();
    return this;
  }

  /**
   * Width of the label column.
   *
   * @return width
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HeatgridLabelColumnWidth getWidth() {
    return width;
  }

  public void setWidth(HeatgridLabelColumnWidth width) {
    if (!width.isValid()) {
      this.unparsed = true;
    }
    this.width = width;
  }

  /** Return true if this HeatgridLabelColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridLabelColumn heatgridLabelColumn = (HeatgridLabelColumn) o;
    return Objects.equals(this.textFormats, heatgridLabelColumn.textFormats)
        && Objects.equals(this.width, heatgridLabelColumn.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textFormats, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridLabelColumn {\n");
    sb.append("    textFormats: ").append(toIndentedString(textFormats)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
