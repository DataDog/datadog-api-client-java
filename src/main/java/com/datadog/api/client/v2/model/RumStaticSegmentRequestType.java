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

/** Type of the static segment creation request resource. */
@JsonSerialize(using = RumStaticSegmentRequestType.RumStaticSegmentRequestTypeSerializer.class)
public class RumStaticSegmentRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("create_static_segment_request"));

  public static final RumStaticSegmentRequestType CREATE_STATIC_SEGMENT_REQUEST =
      new RumStaticSegmentRequestType("create_static_segment_request");

  RumStaticSegmentRequestType(String value) {
    super(value, allowedValues);
  }

  public static class RumStaticSegmentRequestTypeSerializer
      extends StdSerializer<RumStaticSegmentRequestType> {
    public RumStaticSegmentRequestTypeSerializer(Class<RumStaticSegmentRequestType> t) {
      super(t);
    }

    public RumStaticSegmentRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumStaticSegmentRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumStaticSegmentRequestType fromValue(String value) {
    return new RumStaticSegmentRequestType(value);
  }
}
