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
    using = RUMRecoverySessionsRequestType.RUMRecoverySessionsRequestTypeSerializer.class)
public class RUMRecoverySessionsRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("sessions"));

  public static final RUMRecoverySessionsRequestType SESSIONS =
      new RUMRecoverySessionsRequestType("sessions");

  RUMRecoverySessionsRequestType(String value) {
    super(value, allowedValues);
  }

  public static class RUMRecoverySessionsRequestTypeSerializer
      extends StdSerializer<RUMRecoverySessionsRequestType> {
    public RUMRecoverySessionsRequestTypeSerializer(Class<RUMRecoverySessionsRequestType> t) {
      super(t);
    }

    public RUMRecoverySessionsRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMRecoverySessionsRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMRecoverySessionsRequestType fromValue(String value) {
    return new RUMRecoverySessionsRequestType(value);
  }
}
