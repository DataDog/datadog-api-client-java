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

/** Severity of a security rule. */
@JsonSerialize(using = RuleSeverity.RuleSeveritySerializer.class)
public class RuleSeverity extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("critical", "high", "medium", "low", "unknown", "info"));

  public static final RuleSeverity CRITICAL = new RuleSeverity("critical");
  public static final RuleSeverity HIGH = new RuleSeverity("high");
  public static final RuleSeverity MEDIUM = new RuleSeverity("medium");
  public static final RuleSeverity LOW = new RuleSeverity("low");
  public static final RuleSeverity UNKNOWN = new RuleSeverity("unknown");
  public static final RuleSeverity INFO = new RuleSeverity("info");

  RuleSeverity(String value) {
    super(value, allowedValues);
  }

  public static class RuleSeveritySerializer extends StdSerializer<RuleSeverity> {
    public RuleSeveritySerializer(Class<RuleSeverity> t) {
      super(t);
    }

    public RuleSeveritySerializer() {
      this(null);
    }

    @Override
    public void serialize(RuleSeverity value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RuleSeverity fromValue(String value) {
    return new RuleSeverity(value);
  }
}
