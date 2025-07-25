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

/** The status of the alert. */
@JsonSerialize(using = AlertEventAttributesStatus.AlertEventAttributesStatusSerializer.class)
public class AlertEventAttributesStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("warn", "error", "ok"));

  public static final AlertEventAttributesStatus WARN = new AlertEventAttributesStatus("warn");
  public static final AlertEventAttributesStatus ERROR = new AlertEventAttributesStatus("error");
  public static final AlertEventAttributesStatus OK = new AlertEventAttributesStatus("ok");

  AlertEventAttributesStatus(String value) {
    super(value, allowedValues);
  }

  public static class AlertEventAttributesStatusSerializer
      extends StdSerializer<AlertEventAttributesStatus> {
    public AlertEventAttributesStatusSerializer(Class<AlertEventAttributesStatus> t) {
      super(t);
    }

    public AlertEventAttributesStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AlertEventAttributesStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AlertEventAttributesStatus fromValue(String value) {
    return new AlertEventAttributesStatus(value);
  }
}
