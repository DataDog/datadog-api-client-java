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

/** The JSON:API type for default inbox rules. */
@JsonSerialize(using = DefaultInboxRuleType.DefaultInboxRuleTypeSerializer.class)
public class DefaultInboxRuleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("default_inbox_rules"));

  public static final DefaultInboxRuleType DEFAULT_INBOX_RULES =
      new DefaultInboxRuleType("default_inbox_rules");

  DefaultInboxRuleType(String value) {
    super(value, allowedValues);
  }

  public static class DefaultInboxRuleTypeSerializer extends StdSerializer<DefaultInboxRuleType> {
    public DefaultInboxRuleTypeSerializer(Class<DefaultInboxRuleType> t) {
      super(t);
    }

    public DefaultInboxRuleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DefaultInboxRuleType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DefaultInboxRuleType fromValue(String value) {
    return new DefaultInboxRuleType(value);
  }
}
