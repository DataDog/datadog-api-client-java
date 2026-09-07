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

/** The type of a step within a RUM operation's journey. */
@JsonSerialize(using = RUMOperationJourneyStepType.RUMOperationJourneyStepTypeSerializer.class)
public class RUMOperationJourneyStepType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("start", "update", "stop", "error", "abandoned"));

  public static final RUMOperationJourneyStepType START = new RUMOperationJourneyStepType("start");
  public static final RUMOperationJourneyStepType UPDATE =
      new RUMOperationJourneyStepType("update");
  public static final RUMOperationJourneyStepType STOP = new RUMOperationJourneyStepType("stop");
  public static final RUMOperationJourneyStepType ERROR = new RUMOperationJourneyStepType("error");
  public static final RUMOperationJourneyStepType ABANDONED =
      new RUMOperationJourneyStepType("abandoned");

  RUMOperationJourneyStepType(String value) {
    super(value, allowedValues);
  }

  public static class RUMOperationJourneyStepTypeSerializer
      extends StdSerializer<RUMOperationJourneyStepType> {
    public RUMOperationJourneyStepTypeSerializer(Class<RUMOperationJourneyStepType> t) {
      super(t);
    }

    public RUMOperationJourneyStepTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMOperationJourneyStepType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMOperationJourneyStepType fromValue(String value) {
    return new RUMOperationJourneyStepType(value);
  }
}
