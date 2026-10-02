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

/** JSON:API type for AI Impact user activity entries. */
@JsonSerialize(using = AIImpactUserActivityType.AIImpactUserActivityTypeSerializer.class)
public class AIImpactUserActivityType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ai_impact_user_activity"));

  public static final AIImpactUserActivityType AI_IMPACT_USER_ACTIVITY =
      new AIImpactUserActivityType("ai_impact_user_activity");

  AIImpactUserActivityType(String value) {
    super(value, allowedValues);
  }

  public static class AIImpactUserActivityTypeSerializer
      extends StdSerializer<AIImpactUserActivityType> {
    public AIImpactUserActivityTypeSerializer(Class<AIImpactUserActivityType> t) {
      super(t);
    }

    public AIImpactUserActivityTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AIImpactUserActivityType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AIImpactUserActivityType fromValue(String value) {
    return new AIImpactUserActivityType(value);
  }
}
