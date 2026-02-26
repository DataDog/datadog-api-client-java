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

/** Configures which RUM events are processed and stored for the application. */
@JsonSerialize(using = RUMEventProcessingState.RUMEventProcessingStateSerializer.class)
public class RUMEventProcessingState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ALL", "ERROR_FOCUSED_MODE", "NONE"));

  public static final RUMEventProcessingState ALL = new RUMEventProcessingState("ALL");
  public static final RUMEventProcessingState ERROR_FOCUSED_MODE =
      new RUMEventProcessingState("ERROR_FOCUSED_MODE");
  public static final RUMEventProcessingState NONE = new RUMEventProcessingState("NONE");

  RUMEventProcessingState(String value) {
    super(value, allowedValues);
  }

  public static class RUMEventProcessingStateSerializer
      extends StdSerializer<RUMEventProcessingState> {
    public RUMEventProcessingStateSerializer(Class<RUMEventProcessingState> t) {
      super(t);
    }

    public RUMEventProcessingStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMEventProcessingState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMEventProcessingState fromValue(String value) {
    return new RUMEventProcessingState(value);
  }
}
