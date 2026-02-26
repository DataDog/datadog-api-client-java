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

/** Protocol used by the syslog source to receive messages. */
@JsonSerialize(
    using =
        ObservabilityPipelineSyslogSourceMode.ObservabilityPipelineSyslogSourceModeSerializer.class)
public class ObservabilityPipelineSyslogSourceMode extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("tcp", "udp"));

  public static final ObservabilityPipelineSyslogSourceMode TCP =
      new ObservabilityPipelineSyslogSourceMode("tcp");
  public static final ObservabilityPipelineSyslogSourceMode UDP =
      new ObservabilityPipelineSyslogSourceMode("udp");

  ObservabilityPipelineSyslogSourceMode(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSyslogSourceModeSerializer
      extends StdSerializer<ObservabilityPipelineSyslogSourceMode> {
    public ObservabilityPipelineSyslogSourceModeSerializer(
        Class<ObservabilityPipelineSyslogSourceMode> t) {
      super(t);
    }

    public ObservabilityPipelineSyslogSourceModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSyslogSourceMode value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSyslogSourceMode fromValue(String value) {
    return new ObservabilityPipelineSyslogSourceMode(value);
  }
}
