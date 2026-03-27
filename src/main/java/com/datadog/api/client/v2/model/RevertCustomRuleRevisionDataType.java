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

/** Request type */
@JsonSerialize(
    using = RevertCustomRuleRevisionDataType.RevertCustomRuleRevisionDataTypeSerializer.class)
public class RevertCustomRuleRevisionDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("revert_custom_rule_revision_request"));

  public static final RevertCustomRuleRevisionDataType REVERT_CUSTOM_RULE_REVISION_REQUEST =
      new RevertCustomRuleRevisionDataType("revert_custom_rule_revision_request");

  RevertCustomRuleRevisionDataType(String value) {
    super(value, allowedValues);
  }

  public static class RevertCustomRuleRevisionDataTypeSerializer
      extends StdSerializer<RevertCustomRuleRevisionDataType> {
    public RevertCustomRuleRevisionDataTypeSerializer(Class<RevertCustomRuleRevisionDataType> t) {
      super(t);
    }

    public RevertCustomRuleRevisionDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RevertCustomRuleRevisionDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RevertCustomRuleRevisionDataType fromValue(String value) {
    return new RevertCustomRuleRevisionDataType(value);
  }
}
