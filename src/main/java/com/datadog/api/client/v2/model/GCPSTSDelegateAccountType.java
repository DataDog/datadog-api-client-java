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

/** The type of account. */
@JsonSerialize(using = GCPSTSDelegateAccountType.GCPSTSDelegateAccountTypeSerializer.class)
public class GCPSTSDelegateAccountType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("gcp_sts_delegate"));

  public static final GCPSTSDelegateAccountType GCP_STS_DELEGATE =
      new GCPSTSDelegateAccountType("gcp_sts_delegate");

  GCPSTSDelegateAccountType(String value) {
    super(value, allowedValues);
  }

  public static class GCPSTSDelegateAccountTypeSerializer
      extends StdSerializer<GCPSTSDelegateAccountType> {
    public GCPSTSDelegateAccountTypeSerializer(Class<GCPSTSDelegateAccountType> t) {
      super(t);
    }

    public GCPSTSDelegateAccountTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GCPSTSDelegateAccountType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GCPSTSDelegateAccountType fromValue(String value) {
    return new GCPSTSDelegateAccountType(value);
  }
}
