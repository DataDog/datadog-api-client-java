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
@JsonSerialize(
    using = AlertEventCustomAttributesStatus.AlertEventCustomAttributesStatusSerializer.class)
public class AlertEventCustomAttributesStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("warn", "error", "ok"));

  public static final AlertEventCustomAttributesStatus WARN =
      new AlertEventCustomAttributesStatus("warn");
  public static final AlertEventCustomAttributesStatus ERROR =
      new AlertEventCustomAttributesStatus("error");
  public static final AlertEventCustomAttributesStatus OK =
      new AlertEventCustomAttributesStatus("ok");

  AlertEventCustomAttributesStatus(String value) {
    super(value, allowedValues);
  }

  public static class AlertEventCustomAttributesStatusSerializer
      extends StdSerializer<AlertEventCustomAttributesStatus> {
    public AlertEventCustomAttributesStatusSerializer(Class<AlertEventCustomAttributesStatus> t) {
      super(t);
    }

    public AlertEventCustomAttributesStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AlertEventCustomAttributesStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AlertEventCustomAttributesStatus fromValue(String value) {
    return new AlertEventCustomAttributesStatus(value);
  }
}
