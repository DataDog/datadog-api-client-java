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

/** Segment preview request resource type. */
@JsonSerialize(using = SegmentPreviewRequestType.SegmentPreviewRequestTypeSerializer.class)
public class SegmentPreviewRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("segment_preview_request"));

  public static final SegmentPreviewRequestType SEGMENT_PREVIEW_REQUEST =
      new SegmentPreviewRequestType("segment_preview_request");

  SegmentPreviewRequestType(String value) {
    super(value, allowedValues);
  }

  public static class SegmentPreviewRequestTypeSerializer
      extends StdSerializer<SegmentPreviewRequestType> {
    public SegmentPreviewRequestTypeSerializer(Class<SegmentPreviewRequestType> t) {
      super(t);
    }

    public SegmentPreviewRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SegmentPreviewRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SegmentPreviewRequestType fromValue(String value) {
    return new SegmentPreviewRequestType(value);
  }
}
