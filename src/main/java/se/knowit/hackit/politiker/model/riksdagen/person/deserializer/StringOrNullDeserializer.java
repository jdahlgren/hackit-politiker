package se.knowit.hackit.politiker.model.riksdagen.person.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;

public class StringOrNullDeserializer extends JsonDeserializer<String> {

  @Override
  public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
    JsonToken jsonToken = p.getCurrentToken();
    if (jsonToken == JsonToken.VALUE_STRING) {
      return p.getValueAsString();
    }
    return null;
  }
}