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

/** The type of a RUM journey step. */
@JsonSerialize(using = DemRumStepType.DemRumStepTypeSerializer.class)
public class DemRumStepType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("start", "stop", "step"));

  public static final DemRumStepType START = new DemRumStepType("start");
  public static final DemRumStepType STOP = new DemRumStepType("stop");
  public static final DemRumStepType STEP = new DemRumStepType("step");

  DemRumStepType(String value) {
    super(value, allowedValues);
  }

  public static class DemRumStepTypeSerializer extends StdSerializer<DemRumStepType> {
    public DemRumStepTypeSerializer(Class<DemRumStepType> t) {
      super(t);
    }

    public DemRumStepTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(DemRumStepType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DemRumStepType fromValue(String value) {
    return new DemRumStepType(value);
  }
}
