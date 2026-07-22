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

/** Pup bump test resource type. */
@JsonSerialize(using = PupBumpTestType.PupBumpTestTypeSerializer.class)
public class PupBumpTestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pup_bump_test"));

  public static final PupBumpTestType PUP_BUMP_TEST = new PupBumpTestType("pup_bump_test");

  PupBumpTestType(String value) {
    super(value, allowedValues);
  }

  public static class PupBumpTestTypeSerializer extends StdSerializer<PupBumpTestType> {
    public PupBumpTestTypeSerializer(Class<PupBumpTestType> t) {
      super(t);
    }

    public PupBumpTestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(PupBumpTestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PupBumpTestType fromValue(String value) {
    return new PupBumpTestType(value);
  }
}
