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

/** Determines whether or not the batch has passed, failed, or is in progress. */
@JsonSerialize(using = SyntheticsStatus.SyntheticsStatusSerializer.class)
public class SyntheticsStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("passed", "skipped", "failed"));

  public static final SyntheticsStatus PASSED = new SyntheticsStatus("passed");
  public static final SyntheticsStatus skipped = new SyntheticsStatus("skipped");
  public static final SyntheticsStatus failed = new SyntheticsStatus("failed");

  SyntheticsStatus(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsStatusSerializer extends StdSerializer<SyntheticsStatus> {
    public SyntheticsStatusSerializer(Class<SyntheticsStatus> t) {
      super(t);
    }

    public SyntheticsStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(SyntheticsStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsStatus fromValue(String value) {
    return new SyntheticsStatus(value);
  }
}
