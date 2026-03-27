/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class JsonTimeSerializer extends StdSerializer<OffsetDateTime> {
  private static DateTimeFormatter msFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
  private static DateTimeFormatter missingMsFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");

  public JsonTimeSerializer() {
    this(null);
  }

  public JsonTimeSerializer(Class<OffsetDateTime> t) {
    super(t);
  }

  @Override
  public void serialize(OffsetDateTime value, JsonGenerator gen, SerializerProvider arg2)
      throws IOException {
    if (value.getNano() == 0) {
      gen.writeString(missingMsFormatter.format(value));
    } else {
      gen.writeString(msFormatter.format(value));
    }
  }
}
