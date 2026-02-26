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

/** Indicates that the action is a send Microsoft Teams message action. */
@JsonSerialize(using = SendTeamsMessageActionType.SendTeamsMessageActionTypeSerializer.class)
public class SendTeamsMessageActionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("send_teams_message"));

  public static final SendTeamsMessageActionType SEND_TEAMS_MESSAGE =
      new SendTeamsMessageActionType("send_teams_message");

  SendTeamsMessageActionType(String value) {
    super(value, allowedValues);
  }

  public static class SendTeamsMessageActionTypeSerializer
      extends StdSerializer<SendTeamsMessageActionType> {
    public SendTeamsMessageActionTypeSerializer(Class<SendTeamsMessageActionType> t) {
      super(t);
    }

    public SendTeamsMessageActionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SendTeamsMessageActionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SendTeamsMessageActionType fromValue(String value) {
    return new SendTeamsMessageActionType(value);
  }
}
