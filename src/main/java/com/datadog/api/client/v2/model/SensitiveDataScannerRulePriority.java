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

/** Severity of the issues found by the rule. */
@JsonSerialize(
    using = SensitiveDataScannerRulePriority.SensitiveDataScannerRulePrioritySerializer.class)
public class SensitiveDataScannerRulePriority extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("critical", "high", "medium", "low", "info"));

  public static final SensitiveDataScannerRulePriority CRITICAL =
      new SensitiveDataScannerRulePriority("critical");
  public static final SensitiveDataScannerRulePriority HIGH =
      new SensitiveDataScannerRulePriority("high");
  public static final SensitiveDataScannerRulePriority MEDIUM =
      new SensitiveDataScannerRulePriority("medium");
  public static final SensitiveDataScannerRulePriority LOW =
      new SensitiveDataScannerRulePriority("low");
  public static final SensitiveDataScannerRulePriority INFO =
      new SensitiveDataScannerRulePriority("info");

  SensitiveDataScannerRulePriority(String value) {
    super(value, allowedValues);
  }

  public static class SensitiveDataScannerRulePrioritySerializer
      extends StdSerializer<SensitiveDataScannerRulePriority> {
    public SensitiveDataScannerRulePrioritySerializer(Class<SensitiveDataScannerRulePriority> t) {
      super(t);
    }

    public SensitiveDataScannerRulePrioritySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SensitiveDataScannerRulePriority value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SensitiveDataScannerRulePriority fromValue(String value) {
    return new SensitiveDataScannerRulePriority(value);
  }
}
