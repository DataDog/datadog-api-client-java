/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** State of the SLO. */
@JsonSerialize(using = SLOState.SLOStateSerializer.class)
public class SLOState {

  public static final SLOState BREACHED = new SLOState("breached");
  public static final SLOState WARNING = new SLOState("warning");
  public static final SLOState OK = new SLOState("ok");
  public static final SLOState NO_DATA = new SLOState("no_data");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("breached", "warning", "ok", "no_data"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SLOState(String value) {
    this.value = value;
  }

  public static class SLOStateSerializer extends StdSerializer<SLOState> {
    public SLOStateSerializer(Class<SLOState> t) {
      super(t);
    }

    public SLOStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(SLOState value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this SLOState object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SLOState) o).value);
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
  public static SLOState fromValue(String value) {
    return new SLOState(value);
  }
}