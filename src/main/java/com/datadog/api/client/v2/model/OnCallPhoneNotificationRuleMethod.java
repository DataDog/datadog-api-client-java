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

/** Specifies the method in which a phone is used in a notification rule */
@JsonSerialize(
    using = OnCallPhoneNotificationRuleMethod.OnCallPhoneNotificationRuleMethodSerializer.class)
public class OnCallPhoneNotificationRuleMethod extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("sms", "voice"));

  public static final OnCallPhoneNotificationRuleMethod SMS =
      new OnCallPhoneNotificationRuleMethod("sms");
  public static final OnCallPhoneNotificationRuleMethod VOICE =
      new OnCallPhoneNotificationRuleMethod("voice");

  OnCallPhoneNotificationRuleMethod(String value) {
    super(value, allowedValues);
  }

  public static class OnCallPhoneNotificationRuleMethodSerializer
      extends StdSerializer<OnCallPhoneNotificationRuleMethod> {
    public OnCallPhoneNotificationRuleMethodSerializer(Class<OnCallPhoneNotificationRuleMethod> t) {
      super(t);
    }

    public OnCallPhoneNotificationRuleMethodSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OnCallPhoneNotificationRuleMethod value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OnCallPhoneNotificationRuleMethod fromValue(String value) {
    return new OnCallPhoneNotificationRuleMethod(value);
  }
}
