/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** The attribute used to determine size in the widget. */
@JsonSerialize(using = TreeMapSizeBy.TreeMapSizeBySerializer.class)
public class TreeMapSizeBy {

  public static final TreeMapSizeBy PCT_CPU = new TreeMapSizeBy("pct_cpu");
  public static final TreeMapSizeBy PCT_MEM = new TreeMapSizeBy("pct_mem");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pct_cpu", "pct_mem"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  TreeMapSizeBy(String value) {
    this.value = value;
  }

  public static class TreeMapSizeBySerializer extends StdSerializer<TreeMapSizeBy> {
    public TreeMapSizeBySerializer(Class<TreeMapSizeBy> t) {
      super(t);
    }

    public TreeMapSizeBySerializer() {
      this(null);
    }

    @Override
    public void serialize(TreeMapSizeBy value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this TreeMapSizeBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((TreeMapSizeBy) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TreeMapSizeBy fromValue(String value) {
    return new TreeMapSizeBy(value);
  }
}
