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

/** The type of resource used when rerouting an On-Call Page. */
@JsonSerialize(
    using = RerouteOnCallPageRequestDataType.RerouteOnCallPageRequestDataTypeSerializer.class)
public class RerouteOnCallPageRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("reroute"));

  public static final RerouteOnCallPageRequestDataType REROUTE =
      new RerouteOnCallPageRequestDataType("reroute");

  RerouteOnCallPageRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class RerouteOnCallPageRequestDataTypeSerializer
      extends StdSerializer<RerouteOnCallPageRequestDataType> {
    public RerouteOnCallPageRequestDataTypeSerializer(Class<RerouteOnCallPageRequestDataType> t) {
      super(t);
    }

    public RerouteOnCallPageRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RerouteOnCallPageRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RerouteOnCallPageRequestDataType fromValue(String value) {
    return new RerouteOnCallPageRequestDataType(value);
  }
}
