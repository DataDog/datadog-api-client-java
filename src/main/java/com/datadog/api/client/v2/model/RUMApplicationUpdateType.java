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

/** RUM application update type. */
@JsonSerialize(using = RUMApplicationUpdateType.RUMApplicationUpdateTypeSerializer.class)
public class RUMApplicationUpdateType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("rum_application_update"));

  public static final RUMApplicationUpdateType RUM_APPLICATION_UPDATE =
      new RUMApplicationUpdateType("rum_application_update");

  RUMApplicationUpdateType(String value) {
    super(value, allowedValues);
  }

  public static class RUMApplicationUpdateTypeSerializer
      extends StdSerializer<RUMApplicationUpdateType> {
    public RUMApplicationUpdateTypeSerializer(Class<RUMApplicationUpdateType> t) {
      super(t);
    }

    public RUMApplicationUpdateTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMApplicationUpdateType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMApplicationUpdateType fromValue(String value) {
    return new RUMApplicationUpdateType(value);
  }
}
