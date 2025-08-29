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

/** Object describing a search issue request. */
@JsonPropertyOrder({
  IssuesSearchRequestDataAttributes.JSON_PROPERTY_FROM,
  IssuesSearchRequestDataAttributes.JSON_PROPERTY_ORDER_BY,
  IssuesSearchRequestDataAttributes.JSON_PROPERTY_PERSONA,
  IssuesSearchRequestDataAttributes.JSON_PROPERTY_QUERY,
  IssuesSearchRequestDataAttributes.JSON_PROPERTY_TO,
  IssuesSearchRequestDataAttributes.JSON_PROPERTY_TRACK
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssuesSearchRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_ORDER_BY = "order_by";
  private IssuesSearchRequestDataAttributesOrderBy orderBy;

  public static final String JSON_PROPERTY_PERSONA = "persona";
  private IssuesSearchRequestDataAttributesPersona persona;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public static final String JSON_PROPERTY_TRACK = "track";
  private IssuesSearchRequestDataAttributesTrack track;

  public IssuesSearchRequestDataAttributes() {}

  @JsonCreator
  public IssuesSearchRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to) {
    this.from = from;
    this.query = query;
    this.to = to;
  }

  public IssuesSearchRequestDataAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start date (inclusive) of the query in milliseconds since the Unix epoch.
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public IssuesSearchRequestDataAttributes orderBy(
      IssuesSearchRequestDataAttributesOrderBy orderBy) {
    this.orderBy = orderBy;
    this.unparsed |= !orderBy.isValid();
    return this;
  }

  /**
   * The attribute to sort the search results by.
   *
   * @return orderBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssuesSearchRequestDataAttributesOrderBy getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(IssuesSearchRequestDataAttributesOrderBy orderBy) {
    if (!orderBy.isValid()) {
      this.unparsed = true;
    }
    this.orderBy = orderBy;
  }

  public IssuesSearchRequestDataAttributes persona(
      IssuesSearchRequestDataAttributesPersona persona) {
    this.persona = persona;
    this.unparsed |= !persona.isValid();
    return this;
  }

  /**
   * Persona for the search. Either track(s) or persona(s) must be specified.
   *
   * @return persona
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERSONA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssuesSearchRequestDataAttributesPersona getPersona() {
    return persona;
  }

  public void setPersona(IssuesSearchRequestDataAttributesPersona persona) {
    if (!persona.isValid()) {
      this.unparsed = true;
    }
    this.persona = persona;
  }

  public IssuesSearchRequestDataAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Search query following the event search syntax.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public IssuesSearchRequestDataAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End date (exclusive) of the query in milliseconds since the Unix epoch.
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
  }

  public IssuesSearchRequestDataAttributes track(IssuesSearchRequestDataAttributesTrack track) {
    this.track = track;
    this.unparsed |= !track.isValid();
    return this;
  }

  /**
   * Track of the events to query. Either track(s) or persona(s) must be specified.
   *
   * @return track
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssuesSearchRequestDataAttributesTrack getTrack() {
    return track;
  }

  public void setTrack(IssuesSearchRequestDataAttributesTrack track) {
    if (!track.isValid()) {
      this.unparsed = true;
    }
    this.track = track;
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
   * @return IssuesSearchRequestDataAttributes
   */
  @JsonAnySetter
  public IssuesSearchRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssuesSearchRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesSearchRequestDataAttributes issuesSearchRequestDataAttributes =
        (IssuesSearchRequestDataAttributes) o;
    return Objects.equals(this.from, issuesSearchRequestDataAttributes.from)
        && Objects.equals(this.orderBy, issuesSearchRequestDataAttributes.orderBy)
        && Objects.equals(this.persona, issuesSearchRequestDataAttributes.persona)
        && Objects.equals(this.query, issuesSearchRequestDataAttributes.query)
        && Objects.equals(this.to, issuesSearchRequestDataAttributes.to)
        && Objects.equals(this.track, issuesSearchRequestDataAttributes.track)
        && Objects.equals(
            this.additionalProperties, issuesSearchRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, orderBy, persona, query, to, track, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesSearchRequestDataAttributes {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    track: ").append(toIndentedString(track)).append("\n");
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
