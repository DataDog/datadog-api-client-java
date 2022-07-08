/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Pagination links. */
@JsonPropertyOrder({
  SearchSLOResponseLinks.JSON_PROPERTY_FIRST,
  SearchSLOResponseLinks.JSON_PROPERTY_LAST,
  SearchSLOResponseLinks.JSON_PROPERTY_NEXT,
  SearchSLOResponseLinks.JSON_PROPERTY_PREV,
  SearchSLOResponseLinks.JSON_PROPERTY_SELF
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SearchSLOResponseLinks {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST = "first";
  private String first;

  public static final String JSON_PROPERTY_LAST = "last";
  private String last;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public static final String JSON_PROPERTY_PREV = "prev";
  private String prev;

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public SearchSLOResponseLinks first(String first) {
    this.first = first;
    return this;
  }

  /**
   * Link to last page.
   *
   * @return first
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public SearchSLOResponseLinks last(String last) {
    this.last = last;
    return this;
  }

  /**
   * Link to first page.
   *
   * @return last
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public SearchSLOResponseLinks next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Link to the next page.
   *
   * @return next
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public SearchSLOResponseLinks prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Link to previous page.
   *
   * @return prev
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public SearchSLOResponseLinks self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Link to current page.
   *
   * @return self
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  /** Return true if this SearchSLOResponseLinks object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSLOResponseLinks searchSloResponseLinks = (SearchSLOResponseLinks) o;
    return Objects.equals(this.first, searchSloResponseLinks.first)
        && Objects.equals(this.last, searchSloResponseLinks.last)
        && Objects.equals(this.next, searchSloResponseLinks.next)
        && Objects.equals(this.prev, searchSloResponseLinks.prev)
        && Objects.equals(this.self, searchSloResponseLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, next, prev, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSLOResponseLinks {\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("}");
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
