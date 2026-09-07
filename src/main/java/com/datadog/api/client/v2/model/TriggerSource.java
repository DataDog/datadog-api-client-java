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
 * The type of security issues on which the rule applies. Notification rules based on security
 * signals need to use the trigger source "security_signals", while notification rules based on
 * security vulnerabilities need to use the trigger source "security_findings".
 */
@JsonSerialize(using = TriggerSource.TriggerSourceSerializer.class)
public class TriggerSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("security_findings", "security_signals"));

  public static final TriggerSource SECURITY_FINDINGS = new TriggerSource("security_findings");
  public static final TriggerSource SECURITY_SIGNALS = new TriggerSource("security_signals");

  TriggerSource(String value) {
    super(value, allowedValues);
  }

  public static class TriggerSourceSerializer extends StdSerializer<TriggerSource> {
    public TriggerSourceSerializer(Class<TriggerSource> t) {
      super(t);
    }

    public TriggerSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(TriggerSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TriggerSource fromValue(String value) {
    return new TriggerSource(value);
  }
}
