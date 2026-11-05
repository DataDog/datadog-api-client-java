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

/** Sort order for budget instance counters. */
@JsonSerialize(using = AiGatewayBudgetInstanceSort.AiGatewayBudgetInstanceSortSerializer.class)
public class AiGatewayBudgetInstanceSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("spend_desc", "spend_asc", "key_asc"));

  public static final AiGatewayBudgetInstanceSort SPEND_DESC =
      new AiGatewayBudgetInstanceSort("spend_desc");
  public static final AiGatewayBudgetInstanceSort SPEND_ASC =
      new AiGatewayBudgetInstanceSort("spend_asc");
  public static final AiGatewayBudgetInstanceSort KEY_ASC =
      new AiGatewayBudgetInstanceSort("key_asc");

  AiGatewayBudgetInstanceSort(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayBudgetInstanceSortSerializer
      extends StdSerializer<AiGatewayBudgetInstanceSort> {
    public AiGatewayBudgetInstanceSortSerializer(Class<AiGatewayBudgetInstanceSort> t) {
      super(t);
    }

    public AiGatewayBudgetInstanceSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayBudgetInstanceSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayBudgetInstanceSort fromValue(String value) {
    return new AiGatewayBudgetInstanceSort(value);
  }
}
