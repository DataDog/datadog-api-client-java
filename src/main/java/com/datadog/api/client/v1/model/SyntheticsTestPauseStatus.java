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

/**
 * Define whether you want to start (<code>live</code>) or pause (<code>paused</code>) a Synthetic
 * test.
 */
@JsonSerialize(using = SyntheticsTestPauseStatus.SyntheticsTestPauseStatusSerializer.class)
public class SyntheticsTestPauseStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("live", "paused"));

  public static final SyntheticsTestPauseStatus LIVE = new SyntheticsTestPauseStatus("live");
  public static final SyntheticsTestPauseStatus PAUSED = new SyntheticsTestPauseStatus("paused");

  SyntheticsTestPauseStatus(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestPauseStatusSerializer
      extends StdSerializer<SyntheticsTestPauseStatus> {
    public SyntheticsTestPauseStatusSerializer(Class<SyntheticsTestPauseStatus> t) {
      super(t);
    }

    public SyntheticsTestPauseStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestPauseStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestPauseStatus fromValue(String value) {
    return new SyntheticsTestPauseStatus(value);
  }
}
