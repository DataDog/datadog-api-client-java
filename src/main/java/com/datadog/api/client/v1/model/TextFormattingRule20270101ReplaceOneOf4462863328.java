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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  TextFormattingRule20270101ReplaceOneOf4462863328.JSON_PROPERTY_TYPE,
  TextFormattingRule20270101ReplaceOneOf4462863328.JSON_PROPERTY_WITH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TextFormattingRule20270101ReplaceOneOf4462863328 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016_20270101 type;

  public static final String JSON_PROPERTY_WITH = "with";
  private String with;

  public TextFormattingRule20270101ReplaceOneOf4462863328() {}

  @JsonCreator
  public TextFormattingRule20270101ReplaceOneOf4462863328(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016_20270101 type,
      @JsonProperty(required = true, value = JSON_PROPERTY_WITH) String with) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.with = with;
  }

  public TextFormattingRule20270101ReplaceOneOf4462863328 type(
      TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016_20270101 type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016_20270101 getType() {
    return type;
  }

  public void setType(TextFormattingRuleReplaceAnyOfAnyOfItemType4452730016_20270101 type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public TextFormattingRule20270101ReplaceOneOf4462863328 with(String with) {
    this.with = with;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return with
   */
  @JsonProperty(JSON_PROPERTY_WITH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWith() {
    return with;
  }

  public void setWith(String with) {
    this.with = with;
  }

  /** Return true if this TextFormattingRule20270101ReplaceOneOf4462863328 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextFormattingRule20270101ReplaceOneOf4462863328
        textFormattingRule20270101ReplaceOneOf4462863328 =
            (TextFormattingRule20270101ReplaceOneOf4462863328) o;
    return Objects.equals(this.type, textFormattingRule20270101ReplaceOneOf4462863328.type)
        && Objects.equals(this.with, textFormattingRule20270101ReplaceOneOf4462863328.with);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, with);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextFormattingRule20270101ReplaceOneOf4462863328 {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    with: ").append(toIndentedString(with)).append("\n");
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
