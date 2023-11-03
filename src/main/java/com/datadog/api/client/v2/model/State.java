/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** The state of the rule evaluation. */
@JsonSerialize(using = State.StateSerializer.class)
public class State extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pass", "fail", "skip"));

  public static final State PASS = new State("pass");
  public static final State FAIL = new State("fail");
  public static final State SKIP = new State("skip");

  State(String value) {
    super(value, allowedValues);
  }

  public static class StateSerializer extends StdSerializer<State> {
    public StateSerializer(Class<State> t) {
      super(t);
    }

    public StateSerializer() {
      this(null);
    }

    @Override
    public void serialize(State value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static State fromValue(String value) {
    return new State(value);
  }
}
