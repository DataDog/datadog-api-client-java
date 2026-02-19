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

/** The status of a segment template. */
@JsonSerialize(using = RumSegmentTemplateStatus.RumSegmentTemplateStatusSerializer.class)
public class RumSegmentTemplateStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("active", "deprecated", "archived"));

  public static final RumSegmentTemplateStatus ACTIVE = new RumSegmentTemplateStatus("active");
  public static final RumSegmentTemplateStatus DEPRECATED =
      new RumSegmentTemplateStatus("deprecated");
  public static final RumSegmentTemplateStatus ARCHIVED = new RumSegmentTemplateStatus("archived");

  RumSegmentTemplateStatus(String value) {
    super(value, allowedValues);
  }

  public static class RumSegmentTemplateStatusSerializer
      extends StdSerializer<RumSegmentTemplateStatus> {
    public RumSegmentTemplateStatusSerializer(Class<RumSegmentTemplateStatus> t) {
      super(t);
    }

    public RumSegmentTemplateStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumSegmentTemplateStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumSegmentTemplateStatus fromValue(String value) {
    return new RumSegmentTemplateStatus(value);
  }
}
