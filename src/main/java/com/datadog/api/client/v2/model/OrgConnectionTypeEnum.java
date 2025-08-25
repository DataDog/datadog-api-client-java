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

/** Available connection types between organizations. */
@JsonSerialize(using = OrgConnectionTypeEnum.OrgConnectionTypeEnumSerializer.class)
public class OrgConnectionTypeEnum extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("logs", "metrics"));

  public static final OrgConnectionTypeEnum LOGS = new OrgConnectionTypeEnum("logs");
  public static final OrgConnectionTypeEnum METRICS = new OrgConnectionTypeEnum("metrics");

  OrgConnectionTypeEnum(String value) {
    super(value, allowedValues);
  }

  public static class OrgConnectionTypeEnumSerializer extends StdSerializer<OrgConnectionTypeEnum> {
    public OrgConnectionTypeEnumSerializer(Class<OrgConnectionTypeEnum> t) {
      super(t);
    }

    public OrgConnectionTypeEnumSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OrgConnectionTypeEnum value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrgConnectionTypeEnum fromValue(String value) {
    return new OrgConnectionTypeEnum(value);
  }
}
