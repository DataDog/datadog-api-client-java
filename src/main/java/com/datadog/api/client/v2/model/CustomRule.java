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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A custom static analysis rule within a ruleset, as supplied in a create or update request. Nested
 * rules are sent flat, without a <code>data</code>/<code>type</code>/<code>attributes</code>
 * envelope. <code>id</code> and <code>name</code> are client-supplied and must match each other.
 * The remaining members are server-assigned and read-only; they are declared so that a ruleset
 * previously read back can be supplied unchanged.
 */
@JsonPropertyOrder({
  CustomRule.JSON_PROPERTY_CREATED_AT,
  CustomRule.JSON_PROPERTY_CREATED_BY,
  CustomRule.JSON_PROPERTY_ID,
  CustomRule.JSON_PROPERTY_LAST_REVISION,
  CustomRule.JSON_PROPERTY_NAME,
  CustomRule.JSON_PROPERTY_REVISIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LAST_REVISION = "last_revision";
  private CustomRuleRevisionInput lastRevision;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REVISIONS = "revisions";
  private JsonNullable<List<CustomRuleRevisionInput>> revisions =
      JsonNullable.<List<CustomRuleRevisionInput>>undefined();

  public CustomRule() {}

  @JsonCreator
  public CustomRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.id = id;
    this.name = name;
  }

  /**
   * Creation timestamp
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Creator identifier
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedBy() {
    return createdBy;
  }

  public CustomRule id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Rule identifier, which is the same as the rule name.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomRule lastRevision(CustomRuleRevisionInput lastRevision) {
    this.lastRevision = lastRevision;
    this.unparsed |= lastRevision.unparsed;
    return this;
  }

  /**
   * A revision of a custom static analysis rule as embedded in a rule supplied by a create or
   * update request. Nested revisions are sent flat, without a <code>data</code>/<code>type</code>/
   * <code>attributes</code> envelope. <code>id</code>, <code>version_id</code>, <code>checksum
   * </code>, <code>created_at</code> and <code>created_by</code> are server-assigned and read-only;
   * they are declared so that a ruleset previously read back can be supplied unchanged.
   *
   * @return lastRevision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomRuleRevisionInput getLastRevision() {
    return lastRevision;
  }

  public void setLastRevision(CustomRuleRevisionInput lastRevision) {
    this.lastRevision = lastRevision;
    if (lastRevision != null) {
      this.unparsed |= lastRevision.unparsed;
    }
  }

  public CustomRule name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Rule name
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomRule revisions(List<CustomRuleRevisionInput> revisions) {
    this.revisions = JsonNullable.<List<CustomRuleRevisionInput>>of(revisions);
    return this;
  }

  public CustomRule addRevisionsItem(CustomRuleRevisionInput revisionsItem) {
    if (this.revisions == null || !this.revisions.isPresent()) {
      this.revisions = JsonNullable.<List<CustomRuleRevisionInput>>of(new ArrayList<>());
    }
    try {
      this.revisions.get().add(revisionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Revision history of the rule.
   *
   * @return revisions
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<CustomRuleRevisionInput> getRevisions() {
    return revisions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REVISIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<CustomRuleRevisionInput>> getRevisions_JsonNullable() {
    return revisions;
  }

  @JsonProperty(JSON_PROPERTY_REVISIONS)
  public void setRevisions_JsonNullable(JsonNullable<List<CustomRuleRevisionInput>> revisions) {
    this.revisions = revisions;
  }

  public void setRevisions(List<CustomRuleRevisionInput> revisions) {
    this.revisions = JsonNullable.<List<CustomRuleRevisionInput>>of(revisions);
  }

  /** Return true if this CustomRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomRule customRule = (CustomRule) o;
    return Objects.equals(this.createdAt, customRule.createdAt)
        && Objects.equals(this.createdBy, customRule.createdBy)
        && Objects.equals(this.id, customRule.id)
        && Objects.equals(this.lastRevision, customRule.lastRevision)
        && Objects.equals(this.name, customRule.name)
        && Objects.equals(this.revisions, customRule.revisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, id, lastRevision, name, revisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRule {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastRevision: ").append(toIndentedString(lastRevision)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revisions: ").append(toIndentedString(revisions)).append("\n");
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
