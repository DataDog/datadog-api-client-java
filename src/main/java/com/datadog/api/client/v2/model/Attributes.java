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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Restriction policy attributes. */
@JsonPropertyOrder({Attributes.JSON_PROPERTY_BINDINGS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Attributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BINDINGS = "bindings";
  private List<Binding> bindings = new ArrayList<>();

  public Attributes() {}

  @JsonCreator
  public Attributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_BINDINGS) List<Binding> bindings) {
    this.bindings = bindings;
  }

  public Attributes bindings(List<Binding> bindings) {
    this.bindings = bindings;
    for (Binding item : bindings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public Attributes addBindingsItem(Binding bindingsItem) {
    this.bindings.add(bindingsItem);
    this.unparsed |= bindingsItem.unparsed;
    return this;
  }

  /**
   * An array of bindings.
   *
   * @return bindings
   */
  @JsonProperty(JSON_PROPERTY_BINDINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Binding> getBindings() {
    return bindings;
  }

  public void setBindings(List<Binding> bindings) {
    this.bindings = bindings;
  }

  /** Return true if this Attributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attributes attributes = (Attributes) o;
    return Objects.equals(this.bindings, attributes.bindings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attributes {\n");
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
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
