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

/** Case priority */
@JsonSerialize(using = CasePriority.CasePrioritySerializer.class)
public class CasePriority extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("NOT_DEFINED", "P1", "P2", "P3", "P4", "P5"));

  public static final CasePriority NOT_DEFINED = new CasePriority("NOT_DEFINED");
  public static final CasePriority P1 = new CasePriority("P1");
  public static final CasePriority P2 = new CasePriority("P2");
  public static final CasePriority P3 = new CasePriority("P3");
  public static final CasePriority P4 = new CasePriority("P4");
  public static final CasePriority P5 = new CasePriority("P5");

  CasePriority(String value) {
    super(value, allowedValues);
  }

  public static class CasePrioritySerializer extends StdSerializer<CasePriority> {
    public CasePrioritySerializer(Class<CasePriority> t) {
      super(t);
    }

    public CasePrioritySerializer() {
      this(null);
    }

    @Override
    public void serialize(CasePriority value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CasePriority fromValue(String value) {
    return new CasePriority(value);
  }
}
