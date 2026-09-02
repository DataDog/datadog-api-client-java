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

/** Pagination links for the list investigations response. */
@JsonPropertyOrder({
  ListInvestigationsResponseLinks.JSON_PROPERTY_FIRST,
  ListInvestigationsResponseLinks.JSON_PROPERTY_LAST,
  ListInvestigationsResponseLinks.JSON_PROPERTY_NEXT,
  ListInvestigationsResponseLinks.JSON_PROPERTY_PREV,
  ListInvestigationsResponseLinks.JSON_PROPERTY_SELF
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListInvestigationsResponseLinks {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST = "first";
  private String first;

  public static final String JSON_PROPERTY_LAST = "last";
  private JsonNullable<String> last = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public static final String JSON_PROPERTY_PREV = "prev";
  private JsonNullable<String> prev = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public ListInvestigationsResponseLinks() {}

  @JsonCreator
  public ListInvestigationsResponseLinks(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIRST) String first,
      @JsonProperty(required = true, value = JSON_PROPERTY_NEXT) String next,
      @JsonProperty(required = true, value = JSON_PROPERTY_SELF) String self) {
    this.first = first;
    this.next = next;
    this.self = self;
  }

  public ListInvestigationsResponseLinks first(String first) {
    this.first = first;
    return this;
  }

  /**
   * Link to the first page.
   *
   * @return first
   */
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public ListInvestigationsResponseLinks last(String last) {
    this.last = JsonNullable.<String>of(last);
    return this;
  }

  /**
   * Link to the last page.
   *
   * @return last
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getLast() {
    return last.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getLast_JsonNullable() {
    return last;
  }

  @JsonProperty(JSON_PROPERTY_LAST)
  public void setLast_JsonNullable(JsonNullable<String> last) {
    this.last = last;
  }

  public void setLast(String last) {
    this.last = JsonNullable.<String>of(last);
  }

  public ListInvestigationsResponseLinks next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Link to the next page.
   *
   * @return next
   */
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public ListInvestigationsResponseLinks prev(String prev) {
    this.prev = JsonNullable.<String>of(prev);
    return this;
  }

  /**
   * Link to the previous page.
   *
   * @return prev
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPrev() {
    return prev.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPrev_JsonNullable() {
    return prev;
  }

  @JsonProperty(JSON_PROPERTY_PREV)
  public void setPrev_JsonNullable(JsonNullable<String> prev) {
    this.prev = prev;
  }

  public void setPrev(String prev) {
    this.prev = JsonNullable.<String>of(prev);
  }

  public ListInvestigationsResponseLinks self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Link to the current page.
   *
   * @return self
   */
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
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
   * @return ListInvestigationsResponseLinks
   */
  @JsonAnySetter
  public ListInvestigationsResponseLinks putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ListInvestigationsResponseLinks object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListInvestigationsResponseLinks listInvestigationsResponseLinks =
        (ListInvestigationsResponseLinks) o;
    return Objects.equals(this.first, listInvestigationsResponseLinks.first)
        && Objects.equals(this.last, listInvestigationsResponseLinks.last)
        && Objects.equals(this.next, listInvestigationsResponseLinks.next)
        && Objects.equals(this.prev, listInvestigationsResponseLinks.prev)
        && Objects.equals(this.self, listInvestigationsResponseLinks.self)
        && Objects.equals(
            this.additionalProperties, listInvestigationsResponseLinks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, next, prev, self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListInvestigationsResponseLinks {\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
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
