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

/** Status of a Synthetic test. */
@JsonSerialize(using = SyntheticsTestProcessStatus.SyntheticsTestProcessStatusSerializer.class)
public class SyntheticsTestProcessStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("not_scheduled", "scheduled", "finished", "finished_with_error"));

  public static final SyntheticsTestProcessStatus NOT_SCHEDULED =
      new SyntheticsTestProcessStatus("not_scheduled");
  public static final SyntheticsTestProcessStatus SCHEDULED =
      new SyntheticsTestProcessStatus("scheduled");
  public static final SyntheticsTestProcessStatus FINISHED =
      new SyntheticsTestProcessStatus("finished");
  public static final SyntheticsTestProcessStatus FINISHED_WITH_ERROR =
      new SyntheticsTestProcessStatus("finished_with_error");

  SyntheticsTestProcessStatus(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestProcessStatusSerializer
      extends StdSerializer<SyntheticsTestProcessStatus> {
    public SyntheticsTestProcessStatusSerializer(Class<SyntheticsTestProcessStatus> t) {
      super(t);
    }

    public SyntheticsTestProcessStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestProcessStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestProcessStatus fromValue(String value) {
    return new SyntheticsTestProcessStatus(value);
  }
}
