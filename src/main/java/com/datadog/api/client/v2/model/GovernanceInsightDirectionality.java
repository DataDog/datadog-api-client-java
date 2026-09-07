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

/** Whether an increase in the insight's value is good, bad, or neutral. */
@JsonSerialize(
    using = GovernanceInsightDirectionality.GovernanceInsightDirectionalitySerializer.class)
public class GovernanceInsightDirectionality extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("neutral", "increase_better", "decrease_better"));

  public static final GovernanceInsightDirectionality NEUTRAL =
      new GovernanceInsightDirectionality("neutral");
  public static final GovernanceInsightDirectionality INCREASE_BETTER =
      new GovernanceInsightDirectionality("increase_better");
  public static final GovernanceInsightDirectionality DECREASE_BETTER =
      new GovernanceInsightDirectionality("decrease_better");

  GovernanceInsightDirectionality(String value) {
    super(value, allowedValues);
  }

  public static class GovernanceInsightDirectionalitySerializer
      extends StdSerializer<GovernanceInsightDirectionality> {
    public GovernanceInsightDirectionalitySerializer(Class<GovernanceInsightDirectionality> t) {
      super(t);
    }

    public GovernanceInsightDirectionalitySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GovernanceInsightDirectionality value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GovernanceInsightDirectionality fromValue(String value) {
    return new GovernanceInsightDirectionality(value);
  }
}
