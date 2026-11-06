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

/** Targeted recovery. Omitted request_type defaults to sessions. */
@JsonSerialize(
    using = RumRecoverySessionsRequestType.RumRecoverySessionsRequestTypeSerializer.class)
public class RumRecoverySessionsRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("sessions"));

  public static final RumRecoverySessionsRequestType SESSIONS =
      new RumRecoverySessionsRequestType("sessions");

  RumRecoverySessionsRequestType(String value) {
    super(value, allowedValues);
  }

  public static class RumRecoverySessionsRequestTypeSerializer
      extends StdSerializer<RumRecoverySessionsRequestType> {
    public RumRecoverySessionsRequestTypeSerializer(Class<RumRecoverySessionsRequestType> t) {
      super(t);
    }

    public RumRecoverySessionsRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumRecoverySessionsRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRecoverySessionsRequestType fromValue(String value) {
    return new RumRecoverySessionsRequestType(value);
  }
}
