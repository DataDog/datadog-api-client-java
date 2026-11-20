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
@JsonPropertyOrder({TableRowGroupByFormat.JSON_PROPERTY_TEXT_FORMATS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableRowGroupByFormat {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TEXT_FORMATS = "text_formats";
  private List<TextFormattingRule> textFormats = new ArrayList<>();

  public TableRowGroupByFormat() {}

  @JsonCreator
  public TableRowGroupByFormat(
      @JsonProperty(required = true, value = JSON_PROPERTY_TEXT_FORMATS)
          List<TextFormattingRule> textFormats) {
    this.textFormats = textFormats;
    for (TextFormattingRule item : textFormats) {
      this.unparsed |= item.unparsed;
    }
  }

  public TableRowGroupByFormat textFormats(List<TextFormattingRule> textFormats) {
    this.textFormats = textFormats;
    for (TextFormattingRule item : textFormats) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TableRowGroupByFormat addTextFormatsItem(TextFormattingRule textFormatsItem) {
    this.textFormats.add(textFormatsItem);
    this.unparsed |= textFormatsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return textFormats
   */
  @JsonProperty(JSON_PROPERTY_TEXT_FORMATS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

  /** Return true if this TableRowGroupByFormat object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRowGroupByFormat tableRowGroupByFormat = (TableRowGroupByFormat) o;
    return Objects.equals(this.textFormats, tableRowGroupByFormat.textFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textFormats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRowGroupByFormat {\n");
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
