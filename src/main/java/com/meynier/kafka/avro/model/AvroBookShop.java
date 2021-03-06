/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.meynier.kafka.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class AvroBookShop extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 65003299402890507L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroBookShop\",\"namespace\":\"com.meynier.kafka.avro.model\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"books\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AvroBook\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"publish_date\",\"type\":[\"int\"]},{\"name\":\"price\",\"type\":[\"float\"]},{\"name\":\"author\",\"type\":[{\"type\":\"record\",\"name\":\"AvroAuthor\",\"doc\":\"A book author\",\"fields\":[{\"name\":\"first_name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"family_name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"birth_date\",\"type\":\"int\"}]},\"null\"]}]}}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroBookShop> ENCODER =
      new BinaryMessageEncoder<AvroBookShop>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroBookShop> DECODER =
      new BinaryMessageDecoder<AvroBookShop>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AvroBookShop> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AvroBookShop> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AvroBookShop> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroBookShop>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AvroBookShop to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AvroBookShop from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AvroBookShop instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AvroBookShop fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.Object books;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroBookShop() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param books The new value for books
   */
  public AvroBookShop(java.lang.String name, java.lang.Object books) {
    this.name = name;
    this.books = books;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return books;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: books = value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'books' field.
   * @return The value of the 'books' field.
   */
  public java.lang.Object getBooks() {
    return books;
  }


  /**
   * Sets the value of the 'books' field.
   * @param value the value to set.
   */
  public void setBooks(java.lang.Object value) {
    this.books = value;
  }

  /**
   * Creates a new AvroBookShop RecordBuilder.
   * @return A new AvroBookShop RecordBuilder
   */
  public static com.meynier.kafka.avro.model.AvroBookShop.Builder newBuilder() {
    return new com.meynier.kafka.avro.model.AvroBookShop.Builder();
  }

  /**
   * Creates a new AvroBookShop RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroBookShop RecordBuilder
   */
  public static com.meynier.kafka.avro.model.AvroBookShop.Builder newBuilder(com.meynier.kafka.avro.model.AvroBookShop.Builder other) {
    if (other == null) {
      return new com.meynier.kafka.avro.model.AvroBookShop.Builder();
    } else {
      return new com.meynier.kafka.avro.model.AvroBookShop.Builder(other);
    }
  }

  /**
   * Creates a new AvroBookShop RecordBuilder by copying an existing AvroBookShop instance.
   * @param other The existing instance to copy.
   * @return A new AvroBookShop RecordBuilder
   */
  public static com.meynier.kafka.avro.model.AvroBookShop.Builder newBuilder(com.meynier.kafka.avro.model.AvroBookShop other) {
    if (other == null) {
      return new com.meynier.kafka.avro.model.AvroBookShop.Builder();
    } else {
      return new com.meynier.kafka.avro.model.AvroBookShop.Builder(other);
    }
  }

  /**
   * RecordBuilder for AvroBookShop instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroBookShop>
    implements org.apache.avro.data.RecordBuilder<AvroBookShop> {

    private java.lang.String name;
    private java.lang.Object books;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.meynier.kafka.avro.model.AvroBookShop.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.books)) {
        this.books = data().deepCopy(fields()[1].schema(), other.books);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing AvroBookShop instance
     * @param other The existing instance to copy.
     */
    private Builder(com.meynier.kafka.avro.model.AvroBookShop other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.books)) {
        this.books = data().deepCopy(fields()[1].schema(), other.books);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.meynier.kafka.avro.model.AvroBookShop.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.meynier.kafka.avro.model.AvroBookShop.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'books' field.
      * @return The value.
      */
    public java.lang.Object getBooks() {
      return books;
    }


    /**
      * Sets the value of the 'books' field.
      * @param value The value of 'books'.
      * @return This builder.
      */
    public com.meynier.kafka.avro.model.AvroBookShop.Builder setBooks(java.lang.Object value) {
      validate(fields()[1], value);
      this.books = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'books' field has been set.
      * @return True if the 'books' field has been set, false otherwise.
      */
    public boolean hasBooks() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'books' field.
      * @return This builder.
      */
    public com.meynier.kafka.avro.model.AvroBookShop.Builder clearBooks() {
      books = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroBookShop build() {
      try {
        AvroBookShop record = new AvroBookShop();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.books = fieldSetFlags()[1] ? this.books :  defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroBookShop>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroBookShop>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroBookShop>
    READER$ = (org.apache.avro.io.DatumReader<AvroBookShop>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










