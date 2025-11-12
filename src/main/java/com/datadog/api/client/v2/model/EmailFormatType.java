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

/** Specifies the format of the e-mail that is sent for On-Call notifications */
@JsonSerialize(using = EmailFormatType.EmailFormatTypeSerializer.class)
public class EmailFormatType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("html", "text"));

  public static final EmailFormatType HTML = new EmailFormatType("html");
  public static final EmailFormatType TEXT = new EmailFormatType("text");

  EmailFormatType(String value) {
    super(value, allowedValues);
  }

  public static class EmailFormatTypeSerializer extends StdSerializer<EmailFormatType> {
    public EmailFormatTypeSerializer(Class<EmailFormatType> t) {
      super(t);
    }

    public EmailFormatTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(EmailFormatType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EmailFormatType fromValue(String value) {
    return new EmailFormatType(value);
  }
}
