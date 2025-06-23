package com.korit.authstudy.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
public class MyAccountException extends RuntimeException {
    private final ErrorMessage ErrorMessage;
    private Map<String, String> errorMap;

   public MyAccountException(String message) {
     super(message);
     this.ErrorMessage = new ErrorMessage(message);
   }

   @Data
   @AllArgsConstructor
   class ErrorMessage {
     private String message;
   }
}
