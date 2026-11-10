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

/** Action applied to the issue when the watch condition is met. */
@JsonPropertyOrder({
  IssueWatchAction.JSON_PROPERTY_FROM,
  IssueWatchAction.JSON_PROPERTY_KIND,
  IssueWatchAction.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueWatchAction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private IssueState from;

  public static final String JSON_PROPERTY_KIND = "kind";
  private IssueWatchActionKind kind;

  public static final String JSON_PROPERTY_TO = "to";
  private IssueState to;

  public IssueWatchAction() {}

  @JsonCreator
  public IssueWatchAction(
      @JsonProperty(required = true, value = JSON_PROPERTY_KIND) IssueWatchActionKind kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
  }

  public IssueWatchAction from(IssueState from) {
    this.from = from;
    this.unparsed |= !from.isValid();
    return this;
  }

  /**
   * State of the issue
   *
   * @return from
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssueState getFrom() {
    return from;
  }

  public void setFrom(IssueState from) {
    if (!from.isValid()) {
      this.unparsed = true;
    }
    this.from = from;
  }

  public IssueWatchAction kind(IssueWatchActionKind kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    return this;
  }

  /**
   * Kind of watch action.
   *
   * @return kind
   */
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueWatchActionKind getKind() {
    return kind;
  }

  public void setKind(IssueWatchActionKind kind) {
    if (!kind.isValid()) {
      this.unparsed = true;
    }
    this.kind = kind;
  }

  public IssueWatchAction to(IssueState to) {
    this.to = to;
    this.unparsed |= !to.isValid();
    return this;
  }

  /**
   * State of the issue
   *
   * @return to
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssueState getTo() {
    return to;
  }

  public void setTo(IssueState to) {
    if (!to.isValid()) {
      this.unparsed = true;
    }
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
   * @return IssueWatchAction
   */
  @JsonAnySetter
  public IssueWatchAction putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueWatchAction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueWatchAction issueWatchAction = (IssueWatchAction) o;
    return Objects.equals(this.from, issueWatchAction.from)
        && Objects.equals(this.kind, issueWatchAction.kind)
        && Objects.equals(this.to, issueWatchAction.to)
        && Objects.equals(this.additionalProperties, issueWatchAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, kind, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueWatchAction {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
