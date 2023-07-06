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

/** RUM application response type. */
@JsonSerialize(using = RUMApplicationType.RUMApplicationTypeSerializer.class)
public class RUMApplicationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("rum_application"));

  public static final RUMApplicationType RUM_APPLICATION =
      new RUMApplicationType("rum_application");

  RUMApplicationType(String value) {
    super(value, allowedValues);
  }

  public static class RUMApplicationTypeSerializer extends StdSerializer<RUMApplicationType> {
    public RUMApplicationTypeSerializer(Class<RUMApplicationType> t) {
      super(t);
    }

    public RUMApplicationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(RUMApplicationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMApplicationType fromValue(String value) {
    return new RUMApplicationType(value);
  }
}
