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

/**
 * Selects the users or accounts that sent matching RUM or Product Analytics events in a time range.
 * <code>from</code> and <code>to</code> are epoch milliseconds, or negative offsets in milliseconds
 * relative to now. <code>0</code> means now.
 */
@JsonPropertyOrder({
  SegmentEventPlatformBlock.JSON_PROPERTY_FACET,
  SegmentEventPlatformBlock.JSON_PROPERTY_FROM,
  SegmentEventPlatformBlock.JSON_PROPERTY_NAME,
  SegmentEventPlatformBlock.JSON_PROPERTY_QUERY,
  SegmentEventPlatformBlock.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SegmentEventPlatformBlock {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TO = "to";
  private String to;

  public SegmentEventPlatformBlock() {}

  @JsonCreator
  public SegmentEventPlatformBlock(
      @JsonProperty(required = true, value = JSON_PROPERTY_FACET) String facet) {
    this.facet = facet;
  }

  public SegmentEventPlatformBlock facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * Facet that identifies the entity, such as <code>@usr.id</code>.
   *
   * @return facet
   */
  @JsonProperty(JSON_PROPERTY_FACET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }

  public SegmentEventPlatformBlock from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the time range.
   *
   * @return from
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public SegmentEventPlatformBlock name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the block, used in <code>combination</code>.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SegmentEventPlatformBlock query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Event search query.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public SegmentEventPlatformBlock to(String to) {
    this.to = to;
    return this;
  }

  /**
   * End of the time range.
   *
   * @return to
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
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
   * @return SegmentEventPlatformBlock
   */
  @JsonAnySetter
  public SegmentEventPlatformBlock putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SegmentEventPlatformBlock object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentEventPlatformBlock segmentEventPlatformBlock = (SegmentEventPlatformBlock) o;
    return Objects.equals(this.facet, segmentEventPlatformBlock.facet)
        && Objects.equals(this.from, segmentEventPlatformBlock.from)
        && Objects.equals(this.name, segmentEventPlatformBlock.name)
        && Objects.equals(this.query, segmentEventPlatformBlock.query)
        && Objects.equals(this.to, segmentEventPlatformBlock.to)
        && Objects.equals(
            this.additionalProperties, segmentEventPlatformBlock.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facet, from, name, query, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentEventPlatformBlock {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
