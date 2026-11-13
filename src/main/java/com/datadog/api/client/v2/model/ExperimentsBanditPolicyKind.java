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

/**
 * WARMUP serves the arms equally. ADAPTIVE serves the initial split or a split from a refresh.
 * FALLBACK serves one variant after the bandit ends.
 */
@JsonSerialize(using = ExperimentsBanditPolicyKind.ExperimentsBanditPolicyKindSerializer.class)
public class ExperimentsBanditPolicyKind extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("WARMUP", "ADAPTIVE", "FALLBACK"));

  public static final ExperimentsBanditPolicyKind WARMUP =
      new ExperimentsBanditPolicyKind("WARMUP");
  public static final ExperimentsBanditPolicyKind ADAPTIVE =
      new ExperimentsBanditPolicyKind("ADAPTIVE");
  public static final ExperimentsBanditPolicyKind FALLBACK =
      new ExperimentsBanditPolicyKind("FALLBACK");

  ExperimentsBanditPolicyKind(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditPolicyKindSerializer
      extends StdSerializer<ExperimentsBanditPolicyKind> {
    public ExperimentsBanditPolicyKindSerializer(Class<ExperimentsBanditPolicyKind> t) {
      super(t);
    }

    public ExperimentsBanditPolicyKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditPolicyKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditPolicyKind fromValue(String value) {
    return new ExperimentsBanditPolicyKind(value);
  }
}
