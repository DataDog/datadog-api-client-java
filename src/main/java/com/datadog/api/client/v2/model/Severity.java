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

/** The vulnerability severity. */
@JsonSerialize(using = Severity.SeveritySerializer.class)
public class Severity extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("Unknown", "None", "Low", "Medium", "High", "Critical"));

  public static final Severity UNKNOWN = new Severity("Unknown");
  public static final Severity NONE = new Severity("None");
  public static final Severity LOW = new Severity("Low");
  public static final Severity MEDIUM = new Severity("Medium");
  public static final Severity HIGH = new Severity("High");
  public static final Severity CRITICAL = new Severity("Critical");

  Severity(String value) {
    super(value, allowedValues);
  }

  public static class SeveritySerializer extends StdSerializer<Severity> {
    public SeveritySerializer(Class<Severity> t) {
      super(t);
    }

    public SeveritySerializer() {
      this(null);
    }

    @Override
    public void serialize(Severity value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static Severity fromValue(String value) {
    return new Severity(value);
  }
}
