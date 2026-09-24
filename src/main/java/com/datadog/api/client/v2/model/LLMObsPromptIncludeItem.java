/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Includes all or selected messages from a specific version of another prompt. */
@JsonPropertyOrder({LLMObsPromptIncludeItem.JSON_PROPERTY_INCLUDE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPromptIncludeItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE = "include";
  private LLMObsPromptInclude include;

  public LLMObsPromptIncludeItem() {}

  @JsonCreator
  public LLMObsPromptIncludeItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDE) LLMObsPromptInclude include) {
    this.include = include;
    this.unparsed |= include.unparsed;
  }

  public LLMObsPromptIncludeItem include(LLMObsPromptInclude include) {
    this.include = include;
    this.unparsed |= include.unparsed;
    return this;
  }

  /**
   * Includes messages from a specific version of another prompt. Omitting <code>items</code>
   * includes every message from that version in its original order. When <code>items</code> is
   * present, messages are included in the specified order, including repetitions.
   *
   * @return include
   */
  @JsonProperty(JSON_PROPERTY_INCLUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsPromptInclude getInclude() {
    return include;
  }

  public void setInclude(LLMObsPromptInclude include) {
    this.include = include;
    if (include != null) {
      this.unparsed |= include.unparsed;
    }
  }

  /** Return true if this LLMObsPromptIncludeItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPromptIncludeItem llmObsPromptIncludeItem = (LLMObsPromptIncludeItem) o;
    return Objects.equals(this.include, llmObsPromptIncludeItem.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPromptIncludeItem {\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
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
