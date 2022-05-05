package br.com.sqs_producer;

import java.time.LocalDate;

import br.com.sqs_producer.services.SQSSendMessage;

public class App {
  public static void main(String[] args) {
    SQSSendMessage.sendMessage("Producer desacoplado (teste) - " + LocalDate.now());
  }
}
