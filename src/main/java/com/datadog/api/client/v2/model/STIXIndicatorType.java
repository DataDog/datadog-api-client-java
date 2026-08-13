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

/** The STIX object type for an indicator. */
@JsonSerialize(using = STIXIndicatorType.STIXIndicatorTypeSerializer.class)
public class STIXIndicatorType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("indicator"));

  public static final STIXIndicatorType INDICATOR = new STIXIndicatorType("indicator");

  STIXIndicatorType(String value) {
    super(value, allowedValues);
  }

  public static class STIXIndicatorTypeSerializer extends StdSerializer<STIXIndicatorType> {
    public STIXIndicatorTypeSerializer(Class<STIXIndicatorType> t) {
      super(t);
    }

    public STIXIndicatorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(STIXIndicatorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static STIXIndicatorType fromValue(String value) {
    return new STIXIndicatorType(value);
  }
}
