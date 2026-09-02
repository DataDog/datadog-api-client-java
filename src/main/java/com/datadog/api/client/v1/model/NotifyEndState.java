/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** A notification end state. */
@JsonSerialize(using = NotifyEndState.NotifyEndStateSerializer.class)
public class NotifyEndState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("alert", "no data", "warn"));

  public static final NotifyEndState ALERT = new NotifyEndState("alert");
  public static final NotifyEndState NO_DATA = new NotifyEndState("no data");
  public static final NotifyEndState WARN = new NotifyEndState("warn");

  NotifyEndState(String value) {
    super(value, allowedValues);
  }

  public static class NotifyEndStateSerializer extends StdSerializer<NotifyEndState> {
    public NotifyEndStateSerializer(Class<NotifyEndState> t) {
      super(t);
    }

    public NotifyEndStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(NotifyEndState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NotifyEndState fromValue(String value) {
    return new NotifyEndState(value);
  }
}
