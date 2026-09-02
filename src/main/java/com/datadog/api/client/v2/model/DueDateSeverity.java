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

/** A severity level used to configure due date thresholds. */
@JsonSerialize(using = DueDateSeverity.DueDateSeveritySerializer.class)
public class DueDateSeverity extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("critical", "high", "medium", "low", "info", "none", "unknown"));

  public static final DueDateSeverity CRITICAL = new DueDateSeverity("critical");
  public static final DueDateSeverity HIGH = new DueDateSeverity("high");
  public static final DueDateSeverity MEDIUM = new DueDateSeverity("medium");
  public static final DueDateSeverity LOW = new DueDateSeverity("low");
  public static final DueDateSeverity INFO = new DueDateSeverity("info");
  public static final DueDateSeverity NONE = new DueDateSeverity("none");
  public static final DueDateSeverity UNKNOWN = new DueDateSeverity("unknown");

  DueDateSeverity(String value) {
    super(value, allowedValues);
  }

  public static class DueDateSeveritySerializer extends StdSerializer<DueDateSeverity> {
    public DueDateSeveritySerializer(Class<DueDateSeverity> t) {
      super(t);
    }

    public DueDateSeveritySerializer() {
      this(null);
    }

    @Override
    public void serialize(DueDateSeverity value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DueDateSeverity fromValue(String value) {
    return new DueDateSeverity(value);
  }
}
