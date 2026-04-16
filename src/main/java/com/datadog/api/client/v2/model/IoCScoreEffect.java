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

/** Effect of a scoring factor on the indicator's threat score. */
@JsonSerialize(using = IoCScoreEffect.IoCScoreEffectSerializer.class)
public class IoCScoreEffect extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("RAISE_SCORE", "LOWER_SCORE", "NO_EFFECT"));

  public static final IoCScoreEffect RAISE_SCORE = new IoCScoreEffect("RAISE_SCORE");
  public static final IoCScoreEffect LOWER_SCORE = new IoCScoreEffect("LOWER_SCORE");
  public static final IoCScoreEffect NO_EFFECT = new IoCScoreEffect("NO_EFFECT");

  IoCScoreEffect(String value) {
    super(value, allowedValues);
  }

  public static class IoCScoreEffectSerializer extends StdSerializer<IoCScoreEffect> {
    public IoCScoreEffectSerializer(Class<IoCScoreEffect> t) {
      super(t);
    }

    public IoCScoreEffectSerializer() {
      this(null);
    }

    @Override
    public void serialize(IoCScoreEffect value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IoCScoreEffect fromValue(String value) {
    return new IoCScoreEffect(value);
  }
}
