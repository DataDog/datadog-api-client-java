/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A JSON:API "links" member See: https://jsonapi.org/format/#document-links */
@JsonPropertyOrder({
  WidgetLinks.JSON_PROPERTY_DESCRIBED_BY,
  WidgetLinks.JSON_PROPERTY_FIRST,
  WidgetLinks.JSON_PROPERTY_LAST,
  WidgetLinks.JSON_PROPERTY_NEXT,
  WidgetLinks.JSON_PROPERTY_PREV,
  WidgetLinks.JSON_PROPERTY_RELATED,
  WidgetLinks.JSON_PROPERTY_SELF
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetLinks {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIBED_BY = "describedBy";
  private JsonNullable<LinksDescribedBy> describedBy = JsonNullable.<LinksDescribedBy>undefined();

  public static final String JSON_PROPERTY_FIRST = "first";
  private JsonNullable<LinksFirst> first = JsonNullable.<LinksFirst>undefined();

  public static final String JSON_PROPERTY_LAST = "last";
  private JsonNullable<LinksLast> last = JsonNullable.<LinksLast>undefined();

  public static final String JSON_PROPERTY_NEXT = "next";
  private JsonNullable<LinksNext> next = JsonNullable.<LinksNext>undefined();

  public static final String JSON_PROPERTY_PREV = "prev";
  private JsonNullable<LinksPrev> prev = JsonNullable.<LinksPrev>undefined();

  public static final String JSON_PROPERTY_RELATED = "related";
  private JsonNullable<LinksRelated> related = JsonNullable.<LinksRelated>undefined();

  public static final String JSON_PROPERTY_SELF = "self";
  private JsonNullable<LinksSelf> self = JsonNullable.<LinksSelf>undefined();

  public WidgetLinks describedBy(LinksDescribedBy describedBy) {
    this.describedBy = JsonNullable.<LinksDescribedBy>of(describedBy);
    return this;
  }

  /**
   * GetdescribedBy
   *
   * @return describedBy
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public LinksDescribedBy getDescribedBy() {
    return describedBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIBED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<LinksDescribedBy> getDescribedBy_JsonNullable() {
    return describedBy;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIBED_BY)
  public void setDescribedBy_JsonNullable(JsonNullable<LinksDescribedBy> describedBy) {
    this.describedBy = describedBy;
  }

  public void setDescribedBy(LinksDescribedBy describedBy) {
    this.describedBy = JsonNullable.<LinksDescribedBy>of(describedBy);
  }

  public WidgetLinks first(LinksFirst first) {
    this.first = JsonNullable.<LinksFirst>of(first);
    return this;
  }

  /**
   * Getfirst
   *
   * @return first
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public LinksFirst getFirst() {
    return first.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<LinksFirst> getFirst_JsonNullable() {
    return first;
  }

  @JsonProperty(JSON_PROPERTY_FIRST)
  public void setFirst_JsonNullable(JsonNullable<LinksFirst> first) {
    this.first = first;
  }

  public void setFirst(LinksFirst first) {
    this.first = JsonNullable.<LinksFirst>of(first);
  }

  public WidgetLinks last(LinksLast last) {
    this.last = JsonNullable.<LinksLast>of(last);
    return this;
  }

  /**
   * Getlast
   *
   * @return last
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public LinksLast getLast() {
    return last.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<LinksLast> getLast_JsonNullable() {
    return last;
  }

  @JsonProperty(JSON_PROPERTY_LAST)
  public void setLast_JsonNullable(JsonNullable<LinksLast> last) {
    this.last = last;
  }

  public void setLast(LinksLast last) {
    this.last = JsonNullable.<LinksLast>of(last);
  }

  public WidgetLinks next(LinksNext next) {
    this.next = JsonNullable.<LinksNext>of(next);
    return this;
  }

  /**
   * Getnext
   *
   * @return next
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public LinksNext getNext() {
    return next.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<LinksNext> getNext_JsonNullable() {
    return next;
  }

  @JsonProperty(JSON_PROPERTY_NEXT)
  public void setNext_JsonNullable(JsonNullable<LinksNext> next) {
    this.next = next;
  }

  public void setNext(LinksNext next) {
    this.next = JsonNullable.<LinksNext>of(next);
  }

  public WidgetLinks prev(LinksPrev prev) {
    this.prev = JsonNullable.<LinksPrev>of(prev);
    return this;
  }

  /**
   * Getprev
   *
   * @return prev
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public LinksPrev getPrev() {
    return prev.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<LinksPrev> getPrev_JsonNullable() {
    return prev;
  }

  @JsonProperty(JSON_PROPERTY_PREV)
  public void setPrev_JsonNullable(JsonNullable<LinksPrev> prev) {
    this.prev = prev;
  }

  public void setPrev(LinksPrev prev) {
    this.prev = JsonNullable.<LinksPrev>of(prev);
  }

  public WidgetLinks related(LinksRelated related) {
    this.related = JsonNullable.<LinksRelated>of(related);
    return this;
  }

  /**
   * Getrelated
   *
   * @return related
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public LinksRelated getRelated() {
    return related.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<LinksRelated> getRelated_JsonNullable() {
    return related;
  }

  @JsonProperty(JSON_PROPERTY_RELATED)
  public void setRelated_JsonNullable(JsonNullable<LinksRelated> related) {
    this.related = related;
  }

  public void setRelated(LinksRelated related) {
    this.related = JsonNullable.<LinksRelated>of(related);
  }

  public WidgetLinks self(LinksSelf self) {
    this.self = JsonNullable.<LinksSelf>of(self);
    return this;
  }

  /**
   * Getself
   *
   * @return self
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public LinksSelf getSelf() {
    return self.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<LinksSelf> getSelf_JsonNullable() {
    return self;
  }

  @JsonProperty(JSON_PROPERTY_SELF)
  public void setSelf_JsonNullable(JsonNullable<LinksSelf> self) {
    this.self = self;
  }

  public void setSelf(LinksSelf self) {
    this.self = JsonNullable.<LinksSelf>of(self);
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
   * @return WidgetLinks
   */
  @JsonAnySetter
  public WidgetLinks putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WidgetLinks object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetLinks widgetLinks = (WidgetLinks) o;
    return Objects.equals(this.describedBy, widgetLinks.describedBy)
        && Objects.equals(this.first, widgetLinks.first)
        && Objects.equals(this.last, widgetLinks.last)
        && Objects.equals(this.next, widgetLinks.next)
        && Objects.equals(this.prev, widgetLinks.prev)
        && Objects.equals(this.related, widgetLinks.related)
        && Objects.equals(this.self, widgetLinks.self)
        && Objects.equals(this.additionalProperties, widgetLinks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(describedBy, first, last, next, prev, related, self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetLinks {\n");
    sb.append("    describedBy: ").append(toIndentedString(describedBy)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
