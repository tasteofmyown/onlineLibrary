package com.example.uni_library;

import org.springframework.http.ResponseEntity;

public interface Command<I,O> {
    ResponseEntity<O> execute (I input);
}
