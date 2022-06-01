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

/** Navigate between different tabs for your browser test. */
@JsonSerialize(using = SyntheticsPlayingTab.SyntheticsPlayingTabSerializer.class)
public class SyntheticsPlayingTab {

  public static final SyntheticsPlayingTab MAIN_TAB = new SyntheticsPlayingTab(-1l);
  public static final SyntheticsPlayingTab NEW_TAB = new SyntheticsPlayingTab(0l);
  public static final SyntheticsPlayingTab TAB_1 = new SyntheticsPlayingTab(1l);
  public static final SyntheticsPlayingTab TAB_2 = new SyntheticsPlayingTab(2l);
  public static final SyntheticsPlayingTab TAB_3 = new SyntheticsPlayingTab(3l);

  private static final Set<Long> allowedValues =
      new HashSet<Long>(Arrays.asList(-1l, 0l, 1l, 2l, 3l));

  private Long value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsPlayingTab(Long value) {
    this.value = value;
  }

  public static class SyntheticsPlayingTabSerializer extends StdSerializer<SyntheticsPlayingTab> {
    public SyntheticsPlayingTabSerializer(Class<SyntheticsPlayingTab> t) {
      super(t);
    }

    public SyntheticsPlayingTabSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsPlayingTab value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public Long getValue() {
    return this.value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  /** Return true if this SyntheticsPlayingTab object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsPlayingTab) o).value);
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
  public static SyntheticsPlayingTab fromValue(Long value) {
    return new SyntheticsPlayingTab(value);
  }
}
