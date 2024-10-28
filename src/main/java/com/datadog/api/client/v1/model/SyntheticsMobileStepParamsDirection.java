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

/** The direction of the scroll for a <code>scrollToElement</code> step type. */
@JsonSerialize(
    using = SyntheticsMobileStepParamsDirection.SyntheticsMobileStepParamsDirectionSerializer.class)
public class SyntheticsMobileStepParamsDirection extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("up", "down", "left", "right"));

  public static final SyntheticsMobileStepParamsDirection UP =
      new SyntheticsMobileStepParamsDirection("up");
  public static final SyntheticsMobileStepParamsDirection DOWN =
      new SyntheticsMobileStepParamsDirection("down");
  public static final SyntheticsMobileStepParamsDirection LEFT =
      new SyntheticsMobileStepParamsDirection("left");
  public static final SyntheticsMobileStepParamsDirection RIGHT =
      new SyntheticsMobileStepParamsDirection("right");

  SyntheticsMobileStepParamsDirection(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsMobileStepParamsDirectionSerializer
      extends StdSerializer<SyntheticsMobileStepParamsDirection> {
    public SyntheticsMobileStepParamsDirectionSerializer(
        Class<SyntheticsMobileStepParamsDirection> t) {
      super(t);
    }

    public SyntheticsMobileStepParamsDirectionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsMobileStepParamsDirection value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsMobileStepParamsDirection fromValue(String value) {
    return new SyntheticsMobileStepParamsDirection(value);
  }
}
