/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The namespace associated with the tag filter entry.</p>
 */
@JsonSerialize(using = AWSNamespace.AWSNamespaceSerializer.class)
public class AWSNamespace extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("elb", "application_elb", "sqs", "rds", "custom", "network_elb", "lambda", "step_functions"));

  public static final AWSNamespace ELB = new AWSNamespace("elb");
  public static final AWSNamespace APPLICATION_ELB = new AWSNamespace("application_elb");
  public static final AWSNamespace SQS = new AWSNamespace("sqs");
  public static final AWSNamespace RDS = new AWSNamespace("rds");
  public static final AWSNamespace CUSTOM = new AWSNamespace("custom");
  public static final AWSNamespace NETWORK_ELB = new AWSNamespace("network_elb");
  public static final AWSNamespace LAMBDA = new AWSNamespace("lambda");
  public static final AWSNamespace STEP_FUNCTIONS = new AWSNamespace("step_functions");


  AWSNamespace(String value) {
    super(value, allowedValues);
  }

  public static class AWSNamespaceSerializer extends StdSerializer<AWSNamespace> {
      public AWSNamespaceSerializer(Class<AWSNamespace> t) {
          super(t);
      }

      public AWSNamespaceSerializer() {
          this(null);
      }

      @Override
      public void serialize(AWSNamespace value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static AWSNamespace fromValue(String value) {
    return new AWSNamespace(value);
  }
}
