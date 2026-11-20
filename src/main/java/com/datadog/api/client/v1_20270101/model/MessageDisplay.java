/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = MessageDisplay.MessageDisplaySerializer.class)
public class MessageDisplay extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("inline", "expanded-md", "expanded-lg"));

  public static final MessageDisplay INLINE = new MessageDisplay("inline");
  public static final MessageDisplay EXPANDED_MD = new MessageDisplay("expanded-md");
  public static final MessageDisplay EXPANDED_LG = new MessageDisplay("expanded-lg");

  MessageDisplay(String value) {
    super(value, allowedValues);
  }

  public static class MessageDisplaySerializer extends StdSerializer<MessageDisplay> {
    public MessageDisplaySerializer(Class<MessageDisplay> t) {
      super(t);
    }

    public MessageDisplaySerializer() {
      this(null);
    }

    @Override
    public void serialize(MessageDisplay value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MessageDisplay fromValue(String value) {
    return new MessageDisplay(value);
  }
}
