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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  LegacyEventManagementQuery.JSON_PROPERTY_SEARCH,
  LegacyEventManagementQuery.JSON_PROPERTY_TAGS_EXECUTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LegacyEventManagementQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SEARCH = "search";
  private String search;

  public static final String JSON_PROPERTY_TAGS_EXECUTION = "tags_execution";
  private TagsExecution tagsExecution;

  public LegacyEventManagementQuery() {}

  @JsonCreator
  public LegacyEventManagementQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH) String search,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS_EXECUTION)
          TagsExecution tagsExecution) {
    this.search = search;
    this.tagsExecution = tagsExecution;
    this.unparsed |= !tagsExecution.isValid();
  }

  public LegacyEventManagementQuery search(String search) {
    this.search = search;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }

  public LegacyEventManagementQuery tagsExecution(TagsExecution tagsExecution) {
    this.tagsExecution = tagsExecution;
    this.unparsed |= !tagsExecution.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return tagsExecution
   */
  @JsonProperty(JSON_PROPERTY_TAGS_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TagsExecution getTagsExecution() {
    return tagsExecution;
  }

  public void setTagsExecution(TagsExecution tagsExecution) {
    if (!tagsExecution.isValid()) {
      this.unparsed = true;
    }
    this.tagsExecution = tagsExecution;
  }

  /** Return true if this LegacyEventManagementQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyEventManagementQuery legacyEventManagementQuery = (LegacyEventManagementQuery) o;
    return Objects.equals(this.search, legacyEventManagementQuery.search)
        && Objects.equals(this.tagsExecution, legacyEventManagementQuery.tagsExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(search, tagsExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyEventManagementQuery {\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    tagsExecution: ").append(toIndentedString(tagsExecution)).append("\n");
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
