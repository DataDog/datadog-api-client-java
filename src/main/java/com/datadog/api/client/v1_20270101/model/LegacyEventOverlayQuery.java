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
  LegacyEventOverlayQuery.JSON_PROPERTY_Q,
  LegacyEventOverlayQuery.JSON_PROPERTY_TAGS_EXECUTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LegacyEventOverlayQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_TAGS_EXECUTION = "tags_execution";
  private TagsExecution tagsExecution;

  public LegacyEventOverlayQuery() {}

  @JsonCreator
  public LegacyEventOverlayQuery(@JsonProperty(required = true, value = JSON_PROPERTY_Q) String q) {
    this.q = q;
  }

  public LegacyEventOverlayQuery q(String q) {
    this.q = q;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return q
   */
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  public LegacyEventOverlayQuery tagsExecution(TagsExecution tagsExecution) {
    this.tagsExecution = tagsExecution;
    this.unparsed |= !tagsExecution.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return tagsExecution
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TagsExecution getTagsExecution() {
    return tagsExecution;
  }

  public void setTagsExecution(TagsExecution tagsExecution) {
    if (!tagsExecution.isValid()) {
      this.unparsed = true;
    }
    this.tagsExecution = tagsExecution;
  }

  /** Return true if this LegacyEventOverlayQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyEventOverlayQuery legacyEventOverlayQuery = (LegacyEventOverlayQuery) o;
    return Objects.equals(this.q, legacyEventOverlayQuery.q)
        && Objects.equals(this.tagsExecution, legacyEventOverlayQuery.tagsExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(q, tagsExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyEventOverlayQuery {\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
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
