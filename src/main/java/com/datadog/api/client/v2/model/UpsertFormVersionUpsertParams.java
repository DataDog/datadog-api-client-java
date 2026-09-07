/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Concurrency control parameters for the form version upsert operation. */
@JsonPropertyOrder({
  UpsertFormVersionUpsertParams.JSON_PROPERTY_ETAG,
  UpsertFormVersionUpsertParams.JSON_PROPERTY_INSERT_ONLY,
  UpsertFormVersionUpsertParams.JSON_PROPERTY_MATCH_POLICY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpsertFormVersionUpsertParams {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ETAG = "etag";
  private JsonNullable<String> etag = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INSERT_ONLY = "insert_only";
  private Boolean insertOnly;

  public static final String JSON_PROPERTY_MATCH_POLICY = "match_policy";
  private LatestVersionMatchPolicy matchPolicy;

  public UpsertFormVersionUpsertParams() {}

  @JsonCreator
  public UpsertFormVersionUpsertParams(
      @JsonProperty(required = true, value = JSON_PROPERTY_MATCH_POLICY)
          LatestVersionMatchPolicy matchPolicy) {
    this.matchPolicy = matchPolicy;
    this.unparsed |= !matchPolicy.isValid();
  }

  public UpsertFormVersionUpsertParams etag(String etag) {
    this.etag = JsonNullable.<String>of(etag);
    return this;
  }

  /**
   * The ETag of the latest version. Required when <code>match_policy</code> is <code>if_etag_match
   * </code>.
   *
   * @return etag
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getEtag() {
    return etag.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ETAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEtag_JsonNullable() {
    return etag;
  }

  @JsonProperty(JSON_PROPERTY_ETAG)
  public void setEtag_JsonNullable(JsonNullable<String> etag) {
    this.etag = etag;
  }

  public void setEtag(String etag) {
    this.etag = JsonNullable.<String>of(etag);
  }

  public UpsertFormVersionUpsertParams insertOnly(Boolean insertOnly) {
    this.insertOnly = insertOnly;
    return this;
  }

  /**
   * If true, only a new version may be inserted; updating the current draft is not allowed.
   *
   * @return insertOnly
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSERT_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getInsertOnly() {
    return insertOnly;
  }

  public void setInsertOnly(Boolean insertOnly) {
    this.insertOnly = insertOnly;
  }

  public UpsertFormVersionUpsertParams matchPolicy(LatestVersionMatchPolicy matchPolicy) {
    this.matchPolicy = matchPolicy;
    this.unparsed |= !matchPolicy.isValid();
    return this;
  }

  /**
   * The policy for matching the latest form version during an upsert operation.
   *
   * @return matchPolicy
   */
  @JsonProperty(JSON_PROPERTY_MATCH_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LatestVersionMatchPolicy getMatchPolicy() {
    return matchPolicy;
  }

  public void setMatchPolicy(LatestVersionMatchPolicy matchPolicy) {
    if (!matchPolicy.isValid()) {
      this.unparsed = true;
    }
    this.matchPolicy = matchPolicy;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return UpsertFormVersionUpsertParams
   */
  @JsonAnySetter
  public UpsertFormVersionUpsertParams putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this UpsertFormVersionUpsertParams object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertFormVersionUpsertParams upsertFormVersionUpsertParams = (UpsertFormVersionUpsertParams) o;
    return Objects.equals(this.etag, upsertFormVersionUpsertParams.etag)
        && Objects.equals(this.insertOnly, upsertFormVersionUpsertParams.insertOnly)
        && Objects.equals(this.matchPolicy, upsertFormVersionUpsertParams.matchPolicy)
        && Objects.equals(
            this.additionalProperties, upsertFormVersionUpsertParams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, insertOnly, matchPolicy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertFormVersionUpsertParams {\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    insertOnly: ").append(toIndentedString(insertOnly)).append("\n");
    sb.append("    matchPolicy: ").append(toIndentedString(matchPolicy)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
