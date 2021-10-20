package com.example.textformat.exceptions;

public class ServiceNotFound extends RuntimeException{
  public ServiceNotFound(String message) {
      super(message);
  }
}
