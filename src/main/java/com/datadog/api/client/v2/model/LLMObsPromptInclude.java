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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An explicitly versioned prompt included as chat items. Omitting <code>items</code> includes every
 * child message in its original order. When <code>items</code> is present, its zero-based indexes
 * are inserted in the order provided; duplicate indexes are preserved.
 */
@JsonPropertyOrder({
  LLMObsPromptInclude.JSON_PROPERTY_ITEMS,
  LLMObsPromptInclude.JSON_PROPERTY_PROMPT_ID,
  LLMObsPromptInclude.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPromptInclude {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<Long> items = null;

  public static final String JSON_PROPERTY_PROMPT_ID = "prompt_id";
  private String promptId;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public LLMObsPromptInclude() {}

  @JsonCreator
  public LLMObsPromptInclude(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROMPT_ID) String promptId,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.promptId = promptId;
    this.version = version;
  }

  public LLMObsPromptInclude items(List<Long> items) {
    this.items = items;
    return this;
  }

  public LLMObsPromptInclude addItemsItem(Long itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Optional ordered zero-based child-message indexes. Order and duplicate indexes are preserved.
   *
   * @return items
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getItems() {
    return items;
  }

  public void setItems(List<Long> items) {
    this.items = items;
  }

  public LLMObsPromptInclude promptId(String promptId) {
    this.promptId = promptId;
    return this;
  }

  /**
   * Customer-provided identifier of the included prompt. It cannot contain spaces, tabs, line
   * breaks, braces, an equals sign, a comma, or quotes.
   *
   * @return promptId
   */
  @JsonProperty(JSON_PROPERTY_PROMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPromptId() {
    return promptId;
  }

  public void setPromptId(String promptId) {
    this.promptId = promptId;
  }

  public LLMObsPromptInclude version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Positive sequential version number of the included prompt. minimum: 1 maximum: 2147483647
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  /** Return true if this LLMObsPromptInclude object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPromptInclude llmObsPromptInclude = (LLMObsPromptInclude) o;
    return Objects.equals(this.items, llmObsPromptInclude.items)
        && Objects.equals(this.promptId, llmObsPromptInclude.promptId)
        && Objects.equals(this.version, llmObsPromptInclude.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, promptId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPromptInclude {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    promptId: ").append(toIndentedString(promptId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
