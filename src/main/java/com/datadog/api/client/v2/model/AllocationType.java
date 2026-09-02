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

/** The type of targeting rule (called allocation in the API model). */
@JsonSerialize(using = AllocationType.AllocationTypeSerializer.class)
public class AllocationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("FEATURE_GATE", "CANARY"));

  public static final AllocationType FEATURE_GATE = new AllocationType("FEATURE_GATE");
  public static final AllocationType CANARY = new AllocationType("CANARY");

  AllocationType(String value) {
    super(value, allowedValues);
  }

  public static class AllocationTypeSerializer extends StdSerializer<AllocationType> {
    public AllocationTypeSerializer(Class<AllocationType> t) {
      super(t);
    }

    public AllocationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(AllocationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AllocationType fromValue(String value) {
    return new AllocationType(value);
  }
}
