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

/** The case event that activates the automation rule. */
@JsonSerialize(using = AutomationRuleTriggerType.AutomationRuleTriggerTypeSerializer.class)
public class AutomationRuleTriggerType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "case_created",
              "status_transitioned",
              "attribute_value_changed",
              "event_correlation_signal_correlated",
              "case_review_approved",
              "comment_added"));

  public static final AutomationRuleTriggerType CASE_CREATED =
      new AutomationRuleTriggerType("case_created");
  public static final AutomationRuleTriggerType STATUS_TRANSITIONED =
      new AutomationRuleTriggerType("status_transitioned");
  public static final AutomationRuleTriggerType ATTRIBUTE_VALUE_CHANGED =
      new AutomationRuleTriggerType("attribute_value_changed");
  public static final AutomationRuleTriggerType EVENT_CORRELATION_SIGNAL_CORRELATED =
      new AutomationRuleTriggerType("event_correlation_signal_correlated");
  public static final AutomationRuleTriggerType CASE_REVIEW_APPROVED =
      new AutomationRuleTriggerType("case_review_approved");
  public static final AutomationRuleTriggerType COMMENT_ADDED =
      new AutomationRuleTriggerType("comment_added");

  AutomationRuleTriggerType(String value) {
    super(value, allowedValues);
  }

  public static class AutomationRuleTriggerTypeSerializer
      extends StdSerializer<AutomationRuleTriggerType> {
    public AutomationRuleTriggerTypeSerializer(Class<AutomationRuleTriggerType> t) {
      super(t);
    }

    public AutomationRuleTriggerTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AutomationRuleTriggerType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AutomationRuleTriggerType fromValue(String value) {
    return new AutomationRuleTriggerType(value);
  }
}
