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

/** The temporary grant request resource type. */
@JsonSerialize(using = TemporaryGrantRequestType.TemporaryGrantRequestTypeSerializer.class)
public class TemporaryGrantRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("temporary_grant_requests"));

  public static final TemporaryGrantRequestType TEMPORARY_GRANT_REQUESTS =
      new TemporaryGrantRequestType("temporary_grant_requests");

  TemporaryGrantRequestType(String value) {
    super(value, allowedValues);
  }

  public static class TemporaryGrantRequestTypeSerializer
      extends StdSerializer<TemporaryGrantRequestType> {
    public TemporaryGrantRequestTypeSerializer(Class<TemporaryGrantRequestType> t) {
      super(t);
    }

    public TemporaryGrantRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TemporaryGrantRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TemporaryGrantRequestType fromValue(String value) {
    return new TemporaryGrantRequestType(value);
  }
}
