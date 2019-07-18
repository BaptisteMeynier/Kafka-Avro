package com.meynier.kafka.avro.launcher;

import com.meynier.kafka.avro.creator.IKafkaConstants;
import com.meynier.kafka.avro.model.AvroAuthor;
import com.meynier.kafka.avro.model.AvroBook;
import com.meynier.kafka.avro.model.AvroBookShop;
import org.apache.kafka.clients.admin.KafkaAdminClient;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.Properties;
import java.util.stream.Stream;

public class ProduceApp {


    private final static String TOPIC = "Author";

    public static void main(String[] args) {

        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, IKafkaConstants.KAFKA_BROKERS);
        props.put(ProducerConfig.CLIENT_ID_CONFIG, IKafkaConstants.CLIENT_ID);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        props.put("schema.registry.url", "http://localhost:8081");

        try (KafkaProducer<String, AvroAuthor> producer = new KafkaProducer<>(props)) {

            for (long i = 0; i < 10; i++) {

                final String orderId = "id" + Long.toString(i);
                final AvroAuthor author = new AvroAuthor("Zola", "Emile", (int) LocalDate.of(1840, 04, 2).toEpochDay());
                final ProducerRecord<String, AvroAuthor> record = new ProducerRecord<String, AvroAuthor>(TOPIC, String.valueOf(i), author);
                producer.send(record);
                Thread.sleep(1000L);
            }

            producer.flush();
            System.out.printf("Successfully produced 10 messages to a topic called %s%n", TOPIC);

        } catch (final SerializationException e) {
            e.printStackTrace();
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }

    }


}
