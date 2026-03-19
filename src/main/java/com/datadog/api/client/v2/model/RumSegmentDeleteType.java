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

/** Type of the deleted segment resource. */
@JsonSerialize(using = RumSegmentDeleteType.RumSegmentDeleteTypeSerializer.class)
public class RumSegmentDeleteType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("deleted_segment"));

  public static final RumSegmentDeleteType DELETED_SEGMENT =
      new RumSegmentDeleteType("deleted_segment");

  RumSegmentDeleteType(String value) {
    super(value, allowedValues);
  }

  public static class RumSegmentDeleteTypeSerializer extends StdSerializer<RumSegmentDeleteType> {
    public RumSegmentDeleteTypeSerializer(Class<RumSegmentDeleteType> t) {
      super(t);
    }

    public RumSegmentDeleteTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumSegmentDeleteType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumSegmentDeleteType fromValue(String value) {
    return new RumSegmentDeleteType(value);
  }
}
