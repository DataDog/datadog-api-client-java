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

/** The type of the resource. The value should always be createEnrollmentResponse. */
@JsonSerialize(
    using =
        OnPremManagementServiceCreateEnrollmentResponseType
            .OnPremManagementServiceCreateEnrollmentResponseTypeSerializer.class)
public class OnPremManagementServiceCreateEnrollmentResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("createEnrollmentResponse"));

  public static final OnPremManagementServiceCreateEnrollmentResponseType CREATEENROLLMENTRESPONSE =
      new OnPremManagementServiceCreateEnrollmentResponseType("createEnrollmentResponse");

  OnPremManagementServiceCreateEnrollmentResponseType(String value) {
    super(value, allowedValues);
  }

  public static class OnPremManagementServiceCreateEnrollmentResponseTypeSerializer
      extends StdSerializer<OnPremManagementServiceCreateEnrollmentResponseType> {
    public OnPremManagementServiceCreateEnrollmentResponseTypeSerializer(
        Class<OnPremManagementServiceCreateEnrollmentResponseType> t) {
      super(t);
    }

    public OnPremManagementServiceCreateEnrollmentResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OnPremManagementServiceCreateEnrollmentResponseType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OnPremManagementServiceCreateEnrollmentResponseType fromValue(String value) {
    return new OnPremManagementServiceCreateEnrollmentResponseType(value);
  }
}
