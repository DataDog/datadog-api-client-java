/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(using = EventsListStreamRequest.EventsListStreamRequestDeserializer.class)
@JsonSerialize(using = EventsListStreamRequest.EventsListStreamRequestSerializer.class)
public class EventsListStreamRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(EventsListStreamRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class EventsListStreamRequestSerializer
      extends StdSerializer<EventsListStreamRequest> {
    public EventsListStreamRequestSerializer(Class<EventsListStreamRequest> t) {
      super(t);
    }

    public EventsListStreamRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        EventsListStreamRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class EventsListStreamRequestDeserializer
      extends StdDeserializer<EventsListStreamRequest> {
    public EventsListStreamRequestDeserializer() {
      this(EventsListStreamRequest.class);
    }

    public EventsListStreamRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public EventsListStreamRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize EventPlatformStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventPlatformStreamRequest.class.equals(Integer.class)
            || EventPlatformStreamRequest.class.equals(Long.class)
            || EventPlatformStreamRequest.class.equals(Float.class)
            || EventPlatformStreamRequest.class.equals(Double.class)
            || EventPlatformStreamRequest.class.equals(Boolean.class)
            || EventPlatformStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventPlatformStreamRequest.class.equals(Integer.class)
                        || EventPlatformStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventPlatformStreamRequest.class.equals(Float.class)
                        || EventPlatformStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventPlatformStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventPlatformStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventPlatformStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventPlatformStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventPlatformStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EventPlatformStreamRequest'", e);
      }

      // deserialize LogsStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsStreamRequest.class.equals(Integer.class)
            || LogsStreamRequest.class.equals(Long.class)
            || LogsStreamRequest.class.equals(Float.class)
            || LogsStreamRequest.class.equals(Double.class)
            || LogsStreamRequest.class.equals(Boolean.class)
            || LogsStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsStreamRequest.class.equals(Integer.class)
                        || LogsStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsStreamRequest.class.equals(Float.class)
                        || LogsStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsStreamRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogsStreamRequest'", e);
      }

      // deserialize LogsPatternStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsPatternStreamRequest.class.equals(Integer.class)
            || LogsPatternStreamRequest.class.equals(Long.class)
            || LogsPatternStreamRequest.class.equals(Float.class)
            || LogsPatternStreamRequest.class.equals(Double.class)
            || LogsPatternStreamRequest.class.equals(Boolean.class)
            || LogsPatternStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsPatternStreamRequest.class.equals(Integer.class)
                        || LogsPatternStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsPatternStreamRequest.class.equals(Float.class)
                        || LogsPatternStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsPatternStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsPatternStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsPatternStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsPatternStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsPatternStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogsPatternStreamRequest'", e);
      }

      // deserialize LogsTransactionStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsTransactionStreamRequest.class.equals(Integer.class)
            || LogsTransactionStreamRequest.class.equals(Long.class)
            || LogsTransactionStreamRequest.class.equals(Float.class)
            || LogsTransactionStreamRequest.class.equals(Double.class)
            || LogsTransactionStreamRequest.class.equals(Boolean.class)
            || LogsTransactionStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsTransactionStreamRequest.class.equals(Integer.class)
                        || LogsTransactionStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsTransactionStreamRequest.class.equals(Float.class)
                        || LogsTransactionStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsTransactionStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsTransactionStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(LogsTransactionStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((LogsTransactionStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'LogsTransactionStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogsTransactionStreamRequest'", e);
      }

      // deserialize AuditStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (AuditStreamRequest.class.equals(Integer.class)
            || AuditStreamRequest.class.equals(Long.class)
            || AuditStreamRequest.class.equals(Float.class)
            || AuditStreamRequest.class.equals(Double.class)
            || AuditStreamRequest.class.equals(Boolean.class)
            || AuditStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((AuditStreamRequest.class.equals(Integer.class)
                        || AuditStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((AuditStreamRequest.class.equals(Float.class)
                        || AuditStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (AuditStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (AuditStreamRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(AuditStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((AuditStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'AuditStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'AuditStreamRequest'", e);
      }

      // deserialize TraceStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (TraceStreamRequest.class.equals(Integer.class)
            || TraceStreamRequest.class.equals(Long.class)
            || TraceStreamRequest.class.equals(Float.class)
            || TraceStreamRequest.class.equals(Double.class)
            || TraceStreamRequest.class.equals(Boolean.class)
            || TraceStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((TraceStreamRequest.class.equals(Integer.class)
                        || TraceStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((TraceStreamRequest.class.equals(Float.class)
                        || TraceStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (TraceStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (TraceStreamRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(TraceStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((TraceStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'TraceStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'TraceStreamRequest'", e);
      }

      // deserialize ErrorsStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ErrorsStreamRequest.class.equals(Integer.class)
            || ErrorsStreamRequest.class.equals(Long.class)
            || ErrorsStreamRequest.class.equals(Float.class)
            || ErrorsStreamRequest.class.equals(Double.class)
            || ErrorsStreamRequest.class.equals(Boolean.class)
            || ErrorsStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ErrorsStreamRequest.class.equals(Integer.class)
                        || ErrorsStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ErrorsStreamRequest.class.equals(Float.class)
                        || ErrorsStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ErrorsStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ErrorsStreamRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ErrorsStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ErrorsStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ErrorsStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'ErrorsStreamRequest'", e);
      }

      // deserialize EventStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventStreamRequest.class.equals(Integer.class)
            || EventStreamRequest.class.equals(Long.class)
            || EventStreamRequest.class.equals(Float.class)
            || EventStreamRequest.class.equals(Double.class)
            || EventStreamRequest.class.equals(Boolean.class)
            || EventStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventStreamRequest.class.equals(Integer.class)
                        || EventStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventStreamRequest.class.equals(Float.class)
                        || EventStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventStreamRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EventStreamRequest'", e);
      }

      // deserialize EventPatternStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventPatternStreamRequest.class.equals(Integer.class)
            || EventPatternStreamRequest.class.equals(Long.class)
            || EventPatternStreamRequest.class.equals(Float.class)
            || EventPatternStreamRequest.class.equals(Double.class)
            || EventPatternStreamRequest.class.equals(Boolean.class)
            || EventPatternStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventPatternStreamRequest.class.equals(Integer.class)
                        || EventPatternStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventPatternStreamRequest.class.equals(Float.class)
                        || EventPatternStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventPatternStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventPatternStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventPatternStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventPatternStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventPatternStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EventPatternStreamRequest'", e);
      }

      // deserialize SecurityRuntimePatternStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityRuntimePatternStreamRequest.class.equals(Integer.class)
            || SecurityRuntimePatternStreamRequest.class.equals(Long.class)
            || SecurityRuntimePatternStreamRequest.class.equals(Float.class)
            || SecurityRuntimePatternStreamRequest.class.equals(Double.class)
            || SecurityRuntimePatternStreamRequest.class.equals(Boolean.class)
            || SecurityRuntimePatternStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityRuntimePatternStreamRequest.class.equals(Integer.class)
                        || SecurityRuntimePatternStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityRuntimePatternStreamRequest.class.equals(Float.class)
                        || SecurityRuntimePatternStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityRuntimePatternStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityRuntimePatternStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SecurityRuntimePatternStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityRuntimePatternStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SecurityRuntimePatternStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'SecurityRuntimePatternStreamRequest'",
            e);
      }

      // deserialize RumStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (RumStreamRequest.class.equals(Integer.class)
            || RumStreamRequest.class.equals(Long.class)
            || RumStreamRequest.class.equals(Float.class)
            || RumStreamRequest.class.equals(Double.class)
            || RumStreamRequest.class.equals(Boolean.class)
            || RumStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((RumStreamRequest.class.equals(Integer.class)
                        || RumStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((RumStreamRequest.class.equals(Float.class)
                        || RumStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (RumStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (RumStreamRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(RumStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((RumStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'RumStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'RumStreamRequest'", e);
      }

      // deserialize RecommendationsStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (RecommendationsStreamRequest.class.equals(Integer.class)
            || RecommendationsStreamRequest.class.equals(Long.class)
            || RecommendationsStreamRequest.class.equals(Float.class)
            || RecommendationsStreamRequest.class.equals(Double.class)
            || RecommendationsStreamRequest.class.equals(Boolean.class)
            || RecommendationsStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((RecommendationsStreamRequest.class.equals(Integer.class)
                        || RecommendationsStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((RecommendationsStreamRequest.class.equals(Float.class)
                        || RecommendationsStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (RecommendationsStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (RecommendationsStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(RecommendationsStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((RecommendationsStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'RecommendationsStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'RecommendationsStreamRequest'", e);
      }

      // deserialize SecurityRuntimeStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (SecurityRuntimeStreamRequest.class.equals(Integer.class)
            || SecurityRuntimeStreamRequest.class.equals(Long.class)
            || SecurityRuntimeStreamRequest.class.equals(Float.class)
            || SecurityRuntimeStreamRequest.class.equals(Double.class)
            || SecurityRuntimeStreamRequest.class.equals(Boolean.class)
            || SecurityRuntimeStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((SecurityRuntimeStreamRequest.class.equals(Integer.class)
                        || SecurityRuntimeStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((SecurityRuntimeStreamRequest.class.equals(Float.class)
                        || SecurityRuntimeStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (SecurityRuntimeStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (SecurityRuntimeStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(SecurityRuntimeStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((SecurityRuntimeStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'SecurityRuntimeStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'SecurityRuntimeStreamRequest'", e);
      }

      EventsListStreamRequest ret = new EventsListStreamRequest();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public EventsListStreamRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "EventsListStreamRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public EventsListStreamRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public EventsListStreamRequest(EventPlatformStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventsListStreamRequest(LogsStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventsListStreamRequest(LogsPatternStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventsListStreamRequest(LogsTransactionStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventsListStreamRequest(AuditStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventsListStreamRequest(TraceStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventsListStreamRequest(ErrorsStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventsListStreamRequest(EventStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventsListStreamRequest(EventPatternStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventsListStreamRequest(SecurityRuntimePatternStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventsListStreamRequest(RumStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventsListStreamRequest(RecommendationsStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public EventsListStreamRequest(SecurityRuntimeStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("EventPlatformStreamRequest", new GenericType<EventPlatformStreamRequest>() {});
    schemas.put("LogsStreamRequest", new GenericType<LogsStreamRequest>() {});
    schemas.put("LogsPatternStreamRequest", new GenericType<LogsPatternStreamRequest>() {});
    schemas.put("LogsTransactionStreamRequest", new GenericType<LogsTransactionStreamRequest>() {});
    schemas.put("AuditStreamRequest", new GenericType<AuditStreamRequest>() {});
    schemas.put("TraceStreamRequest", new GenericType<TraceStreamRequest>() {});
    schemas.put("ErrorsStreamRequest", new GenericType<ErrorsStreamRequest>() {});
    schemas.put("EventStreamRequest", new GenericType<EventStreamRequest>() {});
    schemas.put("EventPatternStreamRequest", new GenericType<EventPatternStreamRequest>() {});
    schemas.put(
        "SecurityRuntimePatternStreamRequest",
        new GenericType<SecurityRuntimePatternStreamRequest>() {});
    schemas.put("RumStreamRequest", new GenericType<RumStreamRequest>() {});
    schemas.put("RecommendationsStreamRequest", new GenericType<RecommendationsStreamRequest>() {});
    schemas.put("SecurityRuntimeStreamRequest", new GenericType<SecurityRuntimeStreamRequest>() {});
    JSON.registerDescendants(EventsListStreamRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return EventsListStreamRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: EventPlatformStreamRequest, LogsStreamRequest,
   * LogsPatternStreamRequest, LogsTransactionStreamRequest, AuditStreamRequest, TraceStreamRequest,
   * ErrorsStreamRequest, EventStreamRequest, EventPatternStreamRequest,
   * SecurityRuntimePatternStreamRequest, RumStreamRequest, RecommendationsStreamRequest,
   * SecurityRuntimeStreamRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(EventPlatformStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(LogsStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(LogsPatternStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(LogsTransactionStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(AuditStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(TraceStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(ErrorsStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EventStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(EventPatternStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        SecurityRuntimePatternStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(RumStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(RecommendationsStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(SecurityRuntimeStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be EventPlatformStreamRequest, LogsStreamRequest,"
            + " LogsPatternStreamRequest, LogsTransactionStreamRequest, AuditStreamRequest,"
            + " TraceStreamRequest, ErrorsStreamRequest, EventStreamRequest,"
            + " EventPatternStreamRequest, SecurityRuntimePatternStreamRequest, RumStreamRequest,"
            + " RecommendationsStreamRequest, SecurityRuntimeStreamRequest");
  }

  /**
   * Get the actual instance, which can be the following: EventPlatformStreamRequest,
   * LogsStreamRequest, LogsPatternStreamRequest, LogsTransactionStreamRequest, AuditStreamRequest,
   * TraceStreamRequest, ErrorsStreamRequest, EventStreamRequest, EventPatternStreamRequest,
   * SecurityRuntimePatternStreamRequest, RumStreamRequest, RecommendationsStreamRequest,
   * SecurityRuntimeStreamRequest
   *
   * @return The actual instance (EventPlatformStreamRequest, LogsStreamRequest,
   *     LogsPatternStreamRequest, LogsTransactionStreamRequest, AuditStreamRequest,
   *     TraceStreamRequest, ErrorsStreamRequest, EventStreamRequest, EventPatternStreamRequest,
   *     SecurityRuntimePatternStreamRequest, RumStreamRequest, RecommendationsStreamRequest,
   *     SecurityRuntimeStreamRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventPlatformStreamRequest`. If the actual instance is not
   * `EventPlatformStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EventPlatformStreamRequest`
   * @throws ClassCastException if the instance is not `EventPlatformStreamRequest`
   */
  public EventPlatformStreamRequest getEventPlatformStreamRequest() throws ClassCastException {
    return (EventPlatformStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsStreamRequest`. If the actual instance is not
   * `LogsStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsStreamRequest`
   * @throws ClassCastException if the instance is not `LogsStreamRequest`
   */
  public LogsStreamRequest getLogsStreamRequest() throws ClassCastException {
    return (LogsStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsPatternStreamRequest`. If the actual instance is not
   * `LogsPatternStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsPatternStreamRequest`
   * @throws ClassCastException if the instance is not `LogsPatternStreamRequest`
   */
  public LogsPatternStreamRequest getLogsPatternStreamRequest() throws ClassCastException {
    return (LogsPatternStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsTransactionStreamRequest`. If the actual instance is not
   * `LogsTransactionStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsTransactionStreamRequest`
   * @throws ClassCastException if the instance is not `LogsTransactionStreamRequest`
   */
  public LogsTransactionStreamRequest getLogsTransactionStreamRequest() throws ClassCastException {
    return (LogsTransactionStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `AuditStreamRequest`. If the actual instance is not
   * `AuditStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `AuditStreamRequest`
   * @throws ClassCastException if the instance is not `AuditStreamRequest`
   */
  public AuditStreamRequest getAuditStreamRequest() throws ClassCastException {
    return (AuditStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `TraceStreamRequest`. If the actual instance is not
   * `TraceStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `TraceStreamRequest`
   * @throws ClassCastException if the instance is not `TraceStreamRequest`
   */
  public TraceStreamRequest getTraceStreamRequest() throws ClassCastException {
    return (TraceStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ErrorsStreamRequest`. If the actual instance is not
   * `ErrorsStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ErrorsStreamRequest`
   * @throws ClassCastException if the instance is not `ErrorsStreamRequest`
   */
  public ErrorsStreamRequest getErrorsStreamRequest() throws ClassCastException {
    return (ErrorsStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventStreamRequest`. If the actual instance is not
   * `EventStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EventStreamRequest`
   * @throws ClassCastException if the instance is not `EventStreamRequest`
   */
  public EventStreamRequest getEventStreamRequest() throws ClassCastException {
    return (EventStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventPatternStreamRequest`. If the actual instance is not
   * `EventPatternStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EventPatternStreamRequest`
   * @throws ClassCastException if the instance is not `EventPatternStreamRequest`
   */
  public EventPatternStreamRequest getEventPatternStreamRequest() throws ClassCastException {
    return (EventPatternStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityRuntimePatternStreamRequest`. If the actual instance is not
   * `SecurityRuntimePatternStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityRuntimePatternStreamRequest`
   * @throws ClassCastException if the instance is not `SecurityRuntimePatternStreamRequest`
   */
  public SecurityRuntimePatternStreamRequest getSecurityRuntimePatternStreamRequest()
      throws ClassCastException {
    return (SecurityRuntimePatternStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `RumStreamRequest`. If the actual instance is not
   * `RumStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `RumStreamRequest`
   * @throws ClassCastException if the instance is not `RumStreamRequest`
   */
  public RumStreamRequest getRumStreamRequest() throws ClassCastException {
    return (RumStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `RecommendationsStreamRequest`. If the actual instance is not
   * `RecommendationsStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `RecommendationsStreamRequest`
   * @throws ClassCastException if the instance is not `RecommendationsStreamRequest`
   */
  public RecommendationsStreamRequest getRecommendationsStreamRequest() throws ClassCastException {
    return (RecommendationsStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityRuntimeStreamRequest`. If the actual instance is not
   * `SecurityRuntimeStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityRuntimeStreamRequest`
   * @throws ClassCastException if the instance is not `SecurityRuntimeStreamRequest`
   */
  public SecurityRuntimeStreamRequest getSecurityRuntimeStreamRequest() throws ClassCastException {
    return (SecurityRuntimeStreamRequest) super.getActualInstance();
  }
}
