/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  HeatgridLabelColumnConfig.JSON_PROPERTY_TEXT_FORMATS,
  HeatgridLabelColumnConfig.JSON_PROPERTY_WIDTH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridLabelColumnConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TEXT_FORMATS = "text_formats";
  private List<TextReplacementRule> textFormats = null;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private HeatgridLabelColumnWidth width;

  public HeatgridLabelColumnConfig textFormats(List<TextReplacementRule> textFormats) {
    this.textFormats = textFormats;
    if (textFormats != null) {
      for (TextReplacementRule item : textFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HeatgridLabelColumnConfig addTextFormatsItem(TextReplacementRule textFormatsItem) {
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
  public List<TextReplacementRule> getTextFormats() {
    return textFormats;
  }

  public void setTextFormats(List<TextReplacementRule> textFormats) {
    this.textFormats = textFormats;
    if (textFormats != null) {
      for (TextReplacementRule item : textFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HeatgridLabelColumnConfig width(HeatgridLabelColumnWidth width) {
    this.width = width;
    this.unparsed |= !width.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  /** Return true if this HeatgridLabelColumnConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridLabelColumnConfig heatgridLabelColumnConfig = (HeatgridLabelColumnConfig) o;
    return Objects.equals(this.textFormats, heatgridLabelColumnConfig.textFormats)
        && Objects.equals(this.width, heatgridLabelColumnConfig.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textFormats, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridLabelColumnConfig {\n");
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
