/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Widget request type. */
@JsonSerialize(using = FunnelRequestType.FunnelRequestTypeSerializer.class)
public class FunnelRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("funnel"));

  public static final FunnelRequestType FUNNEL = new FunnelRequestType("funnel");

  FunnelRequestType(String value) {
    super(value, allowedValues);
  }

  public static class FunnelRequestTypeSerializer extends StdSerializer<FunnelRequestType> {
    public FunnelRequestTypeSerializer(Class<FunnelRequestType> t) {
      super(t);
    }

    public FunnelRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(FunnelRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FunnelRequestType fromValue(String value) {
    return new FunnelRequestType(value);
  }
}
